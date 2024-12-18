package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Jbr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43942Jbr implements InterfaceC41501vz {
    public final JR2 A00;

    public static final void A00(C43942Jbr c43942Jbr) {
        JR2 jr2 = c43942Jbr.A00;
        UserSession A0p = jr2.A0p();
        if ((AbstractC31178DnM.A0T(A0p).A0I() == EnumC222416a.A05 || AbstractC166997dE.A0Y(A0p).A0I() == EnumC222416a.A06) && C18U.A06(C06090Tz.A05, A0p, 36319179757853724L)) {
            FragmentActivity activity = jr2.A1L.getActivity();
            if (activity != null) {
                C43626JRj A0q = jr2.A0q();
                C45642KIf c45642KIf = new C45642KIf(new C47561KzW(activity, c43942Jbr));
                C43970JcJ c43970JcJ = A0q.A0E;
                C45642KIf c45642KIf2 = c43970JcJ.A0A;
                if (c45642KIf2 == null || !c45642KIf.equals(c45642KIf2)) {
                    c43970JcJ.A0A = c45642KIf;
                    C43626JRj.A04(A0q);
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public C43942Jbr(JR2 jr2) {
        this.A00 = jr2;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = C0f9.A03(254410695);
        C129285sq c129285sq = (C129285sq) obj;
        int A0N = AbstractC167017dG.A0N(c129285sq, -1493914881);
        if (c129285sq.A00 && C2E8.A0A(this.A00.A0p(), true)) {
            A00(this);
        }
        C0f9.A0A(-1562246942, A0N);
        C0f9.A0A(1374148567, A03);
    }
}
