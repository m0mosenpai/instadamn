package X;

import android.content.Context;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.C4n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27332C4n extends AbstractC28375Cfd {
    public AnonymousClass195 A00;
    public AnonymousClass195 A01;
    public AnonymousClass195 A02;
    public boolean A03;
    public final C28274CdJ A04;
    public final C7H A05;
    public final CWL A06;
    public final Integer A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC16660sJ A0D;
    public final boolean A0E;
    public final String A0F;

    public C27332C4n(Context context, FoaUserSession foaUserSession, CWL cwl, InterfaceC16660sJ interfaceC16660sJ) {
        super(context, foaUserSession);
        C7H c7h;
        Integer num;
        this.A06 = cwl;
        this.A0D = interfaceC16660sJ;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A09 = AbstractC09440dt.A00(enumC09460dv, C29910DGy.A01(foaUserSession, 21));
        this.A08 = AbstractC09440dt.A00(enumC09460dv, C29910DGy.A01(foaUserSession, 20));
        int intValue = cwl.A02.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 0) {
                    if (intValue == 3) {
                        if (AbstractC167007dF.A1Z(this.A09)) {
                            c7h = C7H.A05;
                        }
                    } else {
                        throw B4Z.A00();
                    }
                }
                c7h = (C7H) this.A08.getValue();
            } else {
                c7h = C7H.A0E;
            }
        } else {
            c7h = C7H.A02;
        }
        this.A05 = c7h;
        this.A0E = C18U.A06(C06090Tz.A05, AbstractC28057CYl.A00(foaUserSession), 36328800484605744L);
        this.A0F = "IMPLEMENTATION";
        this.A04 = AbstractC86593tX.A0B("IMPLEMENTATION").A00;
        this.A0C = AbstractC25225BEi.A0a(C29910DGy.A01(this, 25), C29896DGk.A00(foaUserSession, this, 38), C149636oG.A00, AbstractC25225BEi.A1D(C25811BbS.class));
        this.A0B = AbstractC09440dt.A00(enumC09460dv, C29834DEa.A00);
        this.A0A = AbstractC09440dt.A00(enumC09460dv, C29896DGk.A00(foaUserSession, this, 37));
        if (cwl.A09) {
            num = C05F.A00;
        } else {
            num = C05F.A0C;
        }
        this.A07 = num;
    }

    public static final void A02(C27332C4n c27332C4n) {
        c27332C4n.A0K(C28279CdO.A00(null, null, (C28279CdO) ((AbstractC28375Cfd) c27332C4n).A03.getValue(), new C28276CdL(C87.A0G, null, C88.A0X, null, C05F.A00, "Close Bottom Sheet", C30182DRn.A01(c27332C4n, 33)), AbstractC166997dE.A0p(((AbstractC28375Cfd) c27332C4n).A00, 2131966498), null, 4046, false, false));
    }

    public static C25811BbS A00(C27332C4n c27332C4n) {
        return (C25811BbS) c27332C4n.A0C.getValue();
    }

    public static final void A01(C27332C4n c27332C4n) {
        CWK cwk;
        C27884CQv c27884CQv = new C27884CQv(C29910DGy.A01(c27332C4n, 22));
        Integer num = c27332C4n.A07;
        C29896DGk A00 = C29896DGk.A00(c27884CQv, c27332C4n, 36);
        c27332C4n.A0I(new C28371CfX(CdsBottomSheetDimmingBehaviour.Default.A00, U6H.A08, num, null, A00, 48, false), "ExtendedCaptureScreen", C30170DRa.A00(c27332C4n, c27884CQv, 5));
        if (!c27332C4n.A06.A0A) {
            Integer num2 = C05F.A01;
            Context context = ((AbstractC28375Cfd) c27332C4n).A00;
            cwk = new CWK(null, C88.A0X, C88.A0P, context.getString(2131966203), num2, AbstractC166997dE.A0p(context, 2131966203), new C30506Dbp(c27332C4n, 6), true);
        } else {
            cwk = null;
        }
        C28279CdO c28279CdO = (C28279CdO) ((AbstractC28375Cfd) c27332C4n).A03.getValue();
        Context context2 = ((AbstractC28375Cfd) c27332C4n).A00;
        String A0p = AbstractC166997dE.A0p(context2, 2131966498);
        String A0p2 = AbstractC166997dE.A0p(context2, 2131966511);
        CWK cwk2 = cwk;
        c27332C4n.A0K(C28279CdO.A00(null, cwk2, c28279CdO, new C28276CdL(C87.A0E, null, C88.A0X, null, C05F.A00, A0p2, C30182DRn.A01(c27332C4n, 34)), A0p, null, 3982, false, true));
        C28421CgT.A02(C8o.A08, (C28421CgT) c27332C4n.A0A.getValue());
    }

    public static final void A03(C27332C4n c27332C4n, boolean z) {
        String str;
        String str2 = AbstractC86593tX.A0B(c27332C4n.A0F).A02;
        if (z) {
            str = "MEmuConsentScreen";
        } else {
            str = "MEmuOnboardingScreen";
        }
        MI6 mi6 = new MI6(c27332C4n, str2, 5, z);
        c27332C4n.A0I(C28371CfX.A00(U6H.A08, C05F.A0C, null, C29910DGy.A01(c27332C4n, 24), 48), str, C30170DRa.A00(c27332C4n, mi6, 6));
        A02(c27332C4n);
    }
}
