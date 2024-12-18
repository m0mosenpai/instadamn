package X;

import java.util.Map;

/* renamed from: X.MIs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50288MIs extends C0YY implements InterfaceC16660sJ {
    public static final C50288MIs A00 = new C50288MIs();

    public C50288MIs() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder A0x = AbstractC43594JPz.A0x(entry);
        A0x.append("  ");
        A0x.append(((MT1) entry.getKey()).A00);
        A0x.append(" = ");
        return AbstractC166997dE.A0v(entry.getValue(), A0x);
    }
}
