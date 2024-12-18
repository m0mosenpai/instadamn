package X;

import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gfd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37521Gfd implements C38Y {
    public final int A00;
    public final Object A01;

    public C37521Gfd(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        C38321qM c38321qM;
        Integer num;
        C64052vQ c64052vQ;
        View view;
        int i3;
        switch (this.A00) {
            case 0:
                C59952od c59952od = (C59952od) this.A01;
                C120985dq A00 = C37624GhJ.A00(c59952od);
                if (A00 != null) {
                    c38321qM = A00.A02;
                } else {
                    c38321qM = null;
                }
                if (C25375BKs.A03(C59952od.A01(c59952od), c38321qM)) {
                    return;
                }
                AbstractC31179DnN.A0x(c59952od);
                return;
            case 1:
                C59952od c59952od2 = (C59952od) this.A01;
                InterfaceC09390do interfaceC09390do = c59952od2.A0v;
                C64052vQ c64052vQ2 = (C64052vQ) interfaceC09390do.getValue();
                if (c64052vQ2 == null || (num = c64052vQ2.A00) == null || num.intValue() != i2 || (c64052vQ = (C64052vQ) interfaceC09390do.getValue()) == null) {
                    return;
                }
                C37540Gfw c37540Gfw = c59952od2.A09;
                if (c37540Gfw == null) {
                    C14360o3.A0F("clipsViewerFragmentViewModel");
                    throw C00O.createAndThrow();
                }
                c64052vQ.A01(c37540Gfw.A1D.A00);
                return;
            case 2:
                C37705Gig.A00((C37705Gig) this.A01, i);
                return;
            case 3:
            case 4:
            case 5:
            default:
                return;
            case 6:
                C37638GhX c37638GhX = ((C37578GgZ) this.A01).A01;
                if (c37638GhX == null) {
                    return;
                }
                if (i != 0 && i <= i2) {
                    view = c37638GhX.A02;
                    if (view != null) {
                        i3 = 0;
                        view.setVisibility(i3);
                    }
                    c37638GhX.A01 = true;
                    return;
                }
                view = c37638GhX.A02;
                if (view != null) {
                    i3 = 8;
                    view.setVisibility(i3);
                }
                c37638GhX.A01 = true;
                return;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
        switch (this.A00) {
            case 5:
                C37726Gj1 c37726Gj1 = (C37726Gj1) this.A01;
                UserSession userSession = c37726Gj1.A08;
                C06090Tz A0U = AbstractC166997dE.A0U(userSession);
                boolean z = false;
                if ((C18U.A06(A0U, userSession, 36325845548021183L) || C18U.A06(A0U, userSession, 36325845548086720L)) && i == 0) {
                    z = true;
                }
                if (C18U.A06(A0U, userSession, 36323358761299134L) || (C18U.A06(A0U, userSession, 36318479681919183L) && c37726Gj1.A0E.A0C())) {
                    if (i != i2 + 1) {
                        return;
                    }
                    AbstractC37552Gg8 abstractC37552Gg8 = c37726Gj1.A0D.A0A;
                    if (i != abstractC37552Gg8.A0B() - 1 || abstractC37552Gg8.A0F(abstractC37552Gg8.A0B() - 1).A01 != EnumC129395t1.A08 || i <= 1) {
                        return;
                    }
                    long A00 = (long) C18U.A00(A0U, userSession, 37167783691551177L);
                    if (A00 > 0) {
                        AnonymousClass195 anonymousClass195 = c37726Gj1.A01;
                        if (anonymousClass195 != null && anonymousClass195.isActive()) {
                            return;
                        }
                        c37726Gj1.A01 = AbstractC23641Du.A04(AnonymousClass191.A00, new PZ5(c37726Gj1, null, A00, z), c37726Gj1.A0K);
                        return;
                    }
                } else {
                    AbstractC37552Gg8 abstractC37552Gg82 = c37726Gj1.A0D.A0A;
                    if (i != abstractC37552Gg82.A0B() - 2 || abstractC37552Gg82.A0F(abstractC37552Gg82.A0B() - 1).A01 != EnumC129395t1.A08) {
                        return;
                    }
                    if (i <= 0) {
                        if (C37723Giy.A00.A00(c37726Gj1.A07, userSession, c37726Gj1.A0G, c37726Gj1.A0E.A0C()) || C18U.A06(A0U, userSession, 36317835433481849L)) {
                            return;
                        }
                    }
                }
                c37726Gj1.A0B(null, null, z);
                return;
            case 6:
            default:
                return;
            case 7:
                C38349Gtl c38349Gtl = ((C39464Hbq) this.A01).A00;
                if (c38349Gtl == null) {
                    C14360o3.A0F("clipsViewerDebugOverlayAdapter");
                    throw C00O.createAndThrow();
                }
                c38349Gtl.A00 = i;
                c38349Gtl.notifyDataSetChanged();
                return;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
        Integer num;
        C3DO c3do;
        FragmentActivity fragmentActivity;
        C3DN A00;
        C3DN A002;
        switch (this.A00) {
            case 3:
                C25371BKo c25371BKo = (C25371BKo) this.A01;
                if (!c25371BKo.A0E) {
                    return;
                }
                boolean z = false;
                boolean z2 = false;
                if (f > f2) {
                    z2 = true;
                }
                if (c25371BKo.A02 > c25371BKo.A03) {
                    z = true;
                }
                if (!z2 || z || c25371BKo.A0O.A00 == C05F.A01) {
                    return;
                }
                ((C37556GgC) c25371BKo.A0U.invoke()).A0F(c25371BKo.A02, true);
                return;
            case 4:
            case 5:
            default:
                return;
            case 6:
                C37638GhX c37638GhX = ((C37578GgZ) this.A01).A01;
                if (c37638GhX == null || c37638GhX.A00) {
                    return;
                }
                C37637GhW c37637GhW = c37638GhX.A03;
                float f3 = f - f2;
                ClipsWatchAndBrowseData clipsWatchAndBrowseData = c37637GhW.A02.A0K;
                if (clipsWatchAndBrowseData != null) {
                    num = clipsWatchAndBrowseData.A09;
                } else {
                    num = null;
                }
                if (num != C05F.A0N || (A00 = (c3do = C3DN.A00).A00((fragmentActivity = c37637GhW.A01))) == null || !((C3DP) A00).A0h || (A002 = c3do.A00(fragmentActivity)) == null) {
                    return;
                }
                A002.A0F(-f3);
                return;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dj0(Integer num) {
        C37638GhX c37638GhX;
        Integer num2;
        C3DO c3do;
        FragmentActivity fragmentActivity;
        C3DN A00;
        C3DN A002;
        switch (this.A00) {
            case 4:
                C14360o3.A0B(num, 0);
                if (num != C05F.A01 && num != C05F.A0C) {
                    return;
                }
                C37625GhK c37625GhK = (C37625GhK) this.A01;
                Handler handler = c37625GhK.A02;
                handler.removeCallbacks(c37625GhK.A06);
                handler.removeCallbacks(c37625GhK.A07);
                return;
            case 5:
            default:
                return;
            case 6:
                C14360o3.A0B(num, 0);
                if (num.intValue() != 0 || (c37638GhX = ((C37578GgZ) this.A01).A01) == null) {
                    return;
                }
                if (!c37638GhX.A00) {
                    C37637GhW c37637GhW = c37638GhX.A03;
                    ClipsWatchAndBrowseData clipsWatchAndBrowseData = c37637GhW.A02.A0K;
                    if (clipsWatchAndBrowseData != null) {
                        num2 = clipsWatchAndBrowseData.A09;
                    } else {
                        num2 = null;
                    }
                    if (num2 == C05F.A0N && (A00 = (c3do = C3DN.A00).A00((fragmentActivity = c37637GhW.A01))) != null && ((C3DP) A00).A0h && (A002 = c3do.A00(fragmentActivity)) != null) {
                        A002.A0A();
                    }
                }
                if (!c37638GhX.A01) {
                    return;
                }
                c37638GhX.A00 = true;
                return;
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }
}
