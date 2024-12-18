package X;

import com.google.common.collect.ImmutableEntry;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RSM extends C5IQ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RSM(Object obj, Iterator it, int i) {
        super(it);
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C5IQ
    public final Object A00(Object from) {
        switch (this.A00) {
            case 0:
                return ((C2n2) this.A01).apply(from);
            case 1:
                return new ImmutableEntry(from, ((C2n2) this.A01).apply(from));
            default:
                return new RQu(this, (Map.Entry) from);
        }
    }
}
