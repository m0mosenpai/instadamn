package X;

import java.util.AbstractMap;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class DKA extends C0YY implements InterfaceC16660sJ {
    public static final DKA A00 = new DKA();

    public DKA() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26084BgD c26084BgD = (C26084BgD) obj;
        C14360o3.A0B(c26084BgD, 0);
        Collection values = ((AbstractMap) c26084BgD.A02).values();
        C14360o3.A07(values);
        return values;
    }
}