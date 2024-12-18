package X;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RSL extends C5IQ {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RSL(Iterator it, int i) {
        super(it);
        this.A00 = i;
    }

    @Override // X.C5IQ
    public final /* bridge */ /* synthetic */ Object A00(Object entry) {
        switch (this.A00) {
            case 0:
                return ((Map.Entry) entry).getKey();
            case 1:
                return ((Map.Entry) entry).getValue();
            default:
                return ((AbstractC62759SPq) entry).A01();
        }
    }
}
