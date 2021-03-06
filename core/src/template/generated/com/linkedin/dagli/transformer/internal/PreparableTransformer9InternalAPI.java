// AUTOGENERATED CODE.  DO NOT MODIFY DIRECTLY!  Instead, please modify the transformer/internal/PreparableTransformerXInternalAPI.ftl file.
// See the README in the module's src/template directory for details.
package com.linkedin.dagli.transformer.internal;

import com.linkedin.dagli.objectio.ConcatenatedReader;
import com.linkedin.dagli.transformer.PreparableTransformer9;
import com.linkedin.dagli.transformer.PreparedTransformer9;
import com.linkedin.dagli.preparer.Preparer9;
import com.linkedin.dagli.preparer.PreparerContext;
import com.linkedin.dagli.preparer.PreparerResultMixed;
import com.linkedin.dagli.dag.DAGExecutor;
import java.util.Collection;
import com.linkedin.dagli.objectio.ObjectIterator;
import com.linkedin.dagli.objectio.ObjectReader;

import com.linkedin.dagli.dag.DAG;
import com.linkedin.dagli.placeholder.Placeholder;
import com.linkedin.dagli.producer.Producer;

import com.linkedin.dagli.transformer.PreparableTransformer1;
import com.linkedin.dagli.transformer.PreparedTransformer1;

import com.linkedin.dagli.transformer.PreparableTransformer10;
import com.linkedin.dagli.transformer.PreparedTransformer10;

import com.linkedin.dagli.tuple.Tuple9;
import com.linkedin.dagli.transformer.Value0FromTuple;
import com.linkedin.dagli.transformer.Value1FromTuple;
import com.linkedin.dagli.transformer.Value2FromTuple;
import com.linkedin.dagli.transformer.Value3FromTuple;
import com.linkedin.dagli.transformer.Value4FromTuple;
import com.linkedin.dagli.transformer.Value5FromTuple;
import com.linkedin.dagli.transformer.Value6FromTuple;
import com.linkedin.dagli.transformer.Value7FromTuple;
import com.linkedin.dagli.transformer.Value8FromTuple;


public interface PreparableTransformer9InternalAPI<A, B, C, D, E, F, G, H, I, R, N extends PreparedTransformer9<A, B, C, D, E, F, G, H, I, R>, S extends PreparableTransformer9<A, B, C, D, E, F, G, H, I, R, N>>
    extends Transformer9InternalAPI<A, B, C, D, E, F, G, H, I, R, S>, PreparableTransformerInternalAPI<R, N, S> {

  @Override
  Preparer9<A, B, C, D, E, F, G, H, I, R, N> getPreparer(PreparerContext context);

  default PreparerResultMixed<? extends PreparedTransformer9<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends R>, N> prepare(
      PreparerContext context, Iterable<? extends A> values1, Iterable<? extends B> values2,
      Iterable<? extends C> values3, Iterable<? extends D> values4, Iterable<? extends E> values5,
      Iterable<? extends F> values6, Iterable<? extends G> values7, Iterable<? extends H> values8,
      Iterable<? extends I> values9) {
    Preparer9<A, B, C, D, E, F, G, H, I, R, N> preparer = getPreparer(context);

    try (ObjectIterator<? extends A> iter1 = ObjectIterator.wrap(values1.iterator());
        ObjectIterator<? extends B> iter2 = ObjectIterator.wrap(values2.iterator());
        ObjectIterator<? extends C> iter3 = ObjectIterator.wrap(values3.iterator());
        ObjectIterator<? extends D> iter4 = ObjectIterator.wrap(values4.iterator());
        ObjectIterator<? extends E> iter5 = ObjectIterator.wrap(values5.iterator());
        ObjectIterator<? extends F> iter6 = ObjectIterator.wrap(values6.iterator());
        ObjectIterator<? extends G> iter7 = ObjectIterator.wrap(values7.iterator());
        ObjectIterator<? extends H> iter8 = ObjectIterator.wrap(values8.iterator());
        ObjectIterator<? extends I> iter9 = ObjectIterator.wrap(values9.iterator())) {
      while (iter1.hasNext()) {
        preparer.process(iter1.next(), iter2.next(), iter3.next(), iter4.next(), iter5.next(), iter6.next(),
            iter7.next(), iter8.next(), iter9.next());
      }

      assert !iter2.hasNext();
      assert !iter3.hasNext();
      assert !iter4.hasNext();
      assert !iter5.hasNext();
      assert !iter6.hasNext();
      assert !iter7.hasNext();
      assert !iter8.hasNext();
      assert !iter9.hasNext();
    }

    return preparer
        .finishUnsafe(new ConcatenatedReader<>(Object[]::new, ObjectReader.wrap(values1), ObjectReader.wrap(values2),
            ObjectReader.wrap(values3), ObjectReader.wrap(values4), ObjectReader.wrap(values5), ObjectReader
                .wrap(values6), ObjectReader.wrap(values7), ObjectReader.wrap(values8), ObjectReader.wrap(values9)));
  }

  default PreparerResultMixed<? extends PreparedTransformer9<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super G, ? super H, ? super I, ? extends R>, N> prepare(
      DAGExecutor executor, Collection<? extends A> values1, Collection<? extends B> values2,
      Collection<? extends C> values3, Collection<? extends D> values4, Collection<? extends E> values5,
      Collection<? extends F> values6, Collection<? extends G> values7, Collection<? extends H> values8,
      Collection<? extends I> values9) {
    return prepare(PreparerContext.builder(values1.size()).setExecutor(executor).build(), values1, values2, values3,
        values4, values5, values6, values7, values8, values9);
  }

  @Override
  default <J> PreparableTransformer10<A, B, C, D, E, F, G, H, I, J, R, ? extends PreparedTransformer10<A, B, C, D, E, F, G, H, I, J, R>> withArity10(
      Producer<? extends J> newInput10) {
    Placeholder<A> nestedPlaceholder1 = new Placeholder<>("Original Input 1");
    Placeholder<B> nestedPlaceholder2 = new Placeholder<>("Original Input 2");
    Placeholder<C> nestedPlaceholder3 = new Placeholder<>("Original Input 3");
    Placeholder<D> nestedPlaceholder4 = new Placeholder<>("Original Input 4");
    Placeholder<E> nestedPlaceholder5 = new Placeholder<>("Original Input 5");
    Placeholder<F> nestedPlaceholder6 = new Placeholder<>("Original Input 6");
    Placeholder<G> nestedPlaceholder7 = new Placeholder<>("Original Input 7");
    Placeholder<H> nestedPlaceholder8 = new Placeholder<>("Original Input 8");
    Placeholder<I> nestedPlaceholder9 = new Placeholder<>("Original Input 9");
    return DAG
        .withPlaceholders(nestedPlaceholder1, nestedPlaceholder2, nestedPlaceholder3, nestedPlaceholder4,
            nestedPlaceholder5, nestedPlaceholder6, nestedPlaceholder7, nestedPlaceholder8, nestedPlaceholder9,
            new Placeholder<J>("Ignored"))
        .withOutput(
            withInputs(nestedPlaceholder1, nestedPlaceholder2, nestedPlaceholder3, nestedPlaceholder4,
                nestedPlaceholder5, nestedPlaceholder6, nestedPlaceholder7, nestedPlaceholder8, nestedPlaceholder9))
        .withInputs(getInput1(), getInput2(), getInput3(), getInput4(), getInput5(), getInput6(), getInput7(),
            getInput8(), getInput9(), newInput10);
  }

  @Override
  default <N> PreparableTransformer10<N, A, B, C, D, E, F, G, H, I, R, ? extends PreparedTransformer10<N, A, B, C, D, E, F, G, H, I, R>> withPrependedArity10(
      Producer<? extends N> newInput1) {
    Placeholder<A> nestedPlaceholder1 = new Placeholder<>("Original Input 1");
    Placeholder<B> nestedPlaceholder2 = new Placeholder<>("Original Input 2");
    Placeholder<C> nestedPlaceholder3 = new Placeholder<>("Original Input 3");
    Placeholder<D> nestedPlaceholder4 = new Placeholder<>("Original Input 4");
    Placeholder<E> nestedPlaceholder5 = new Placeholder<>("Original Input 5");
    Placeholder<F> nestedPlaceholder6 = new Placeholder<>("Original Input 6");
    Placeholder<G> nestedPlaceholder7 = new Placeholder<>("Original Input 7");
    Placeholder<H> nestedPlaceholder8 = new Placeholder<>("Original Input 8");
    Placeholder<I> nestedPlaceholder9 = new Placeholder<>("Original Input 9");
    return DAG
        .withPlaceholders(new Placeholder<N>("Ignored"), nestedPlaceholder1, nestedPlaceholder2, nestedPlaceholder3,
            nestedPlaceholder4, nestedPlaceholder5, nestedPlaceholder6, nestedPlaceholder7, nestedPlaceholder8,
            nestedPlaceholder9)
        .withOutput(
            this.withInputs(nestedPlaceholder1, nestedPlaceholder2, nestedPlaceholder3, nestedPlaceholder4,
                nestedPlaceholder5, nestedPlaceholder6, nestedPlaceholder7, nestedPlaceholder8, nestedPlaceholder9))
        .withInputs(newInput1, getInput1(), getInput2(), getInput3(), getInput4(), getInput5(), getInput6(),
            getInput7(), getInput8(), getInput9());
  }

  @Override
  default PreparableTransformer1<Tuple9<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I>, R, ? extends PreparedTransformer1<Tuple9<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I>, R>> withArity1(
      Producer<? extends Tuple9<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I>> inputTuple) {
    Placeholder<Tuple9<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H, ? extends I>> placeholderTuple =
        new Placeholder<>("Original Inputs Tuple");

    return DAG
        .withPlaceholder(placeholderTuple)
        .withOutput(
            withInputs(new Value0FromTuple<>(placeholderTuple), new Value1FromTuple<>(placeholderTuple),
                new Value2FromTuple<>(placeholderTuple), new Value3FromTuple<>(placeholderTuple),
                new Value4FromTuple<>(placeholderTuple), new Value5FromTuple<>(placeholderTuple),
                new Value6FromTuple<>(placeholderTuple), new Value7FromTuple<>(placeholderTuple),
                new Value8FromTuple<>(placeholderTuple))).withInput(inputTuple);
  }
}
