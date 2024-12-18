package X;

import java.util.AbstractMap;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class DKC extends C0YY implements InterfaceC16660sJ {
    public static final DKC A00 = new DKC();

    public DKC() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C51753Mtc c51753Mtc = (C51753Mtc) obj;
        C14360o3.A0B(c51753Mtc, 0);
        Collection values = ((AbstractMap) c51753Mtc.A02).values();
        C14360o3.A07(values);
        return values;
    }
}
