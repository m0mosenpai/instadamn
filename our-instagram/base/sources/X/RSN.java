package X;

import com.google.common.collect.Lists$TransformingSequentialList;
import java.util.ListIterator;

/* loaded from: classes10.dex */
public final class RSN extends C5IP {
    public final /* synthetic */ Lists$TransformingSequentialList A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RSN(final Lists$TransformingSequentialList this$0, ListIterator backingIterator) {
        super(backingIterator);
        this.A00 = this$0;
    }

    @Override // X.C5IQ
    public final Object A00(Object from) {
        return this.A00.function.apply(from);
    }
}
