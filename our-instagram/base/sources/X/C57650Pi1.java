package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Pi1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57650Pi1 extends C0YY implements InterfaceC16660sJ {
    public static final C57650Pi1 A00 = new C57650Pi1();

    public C57650Pi1() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C25306BIb A002;
        C25306BIb c25306BIb = (C25306BIb) obj;
        C14360o3.A0B(c25306BIb, 0);
        List list = c25306BIb.A0F;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj2 : list) {
            if (EnumC31336Dq1.A1a != ((C5HW) obj2).A04.A1D.getValue()) {
                A1E.add(obj2);
            }
        }
        A002 = C25306BIb.A00(null, null, null, null, c25306BIb, null, A1E, null, null, 131069);
        return A002;
    }
}
