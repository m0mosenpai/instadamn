package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.C2g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27281C2g extends AnonymousClass522 {
    public final int A00 = 5;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(C26852BtE c26852BtE, C3DN c3dn, int i) {
        super(Integer.valueOf(i));
        this.A02 = c26852BtE;
        this.A01 = c3dn;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle;
        C140966Yy A0c;
        Fragment c33193Ekf;
        C189478aR c189478aR;
        switch (this.A00) {
            case 0:
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((KC4) this.A02).A0B);
                String str = ((C45127Jxw) this.A01).A01;
                C14360o3.A0B(str, 0);
                AbstractC166987dD.A1Z(new C50120MBu(A0Z, str, null, 6), AbstractC141776au.A00(A0Z));
                return;
            case 1:
                C189448aO A0y = AbstractC25225BEi.A0y((AbstractC12990ll) this.A02);
                Activity activity = (Activity) this.A01;
                AbstractC25226BEj.A1M(activity, A0y, 2131969353);
                A0y.A00().A02(activity, new C26714Bqv());
                return;
            case 2:
                C3DO c3do = C3DN.A00;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                AbstractC167017dG.A0y(fragmentActivity, c3do);
                InterfaceC09390do interfaceC09390do = ((C26856BtI) this.A02).A00;
                bundle = null;
                AbstractC25231BEo.A0c(fragmentActivity, interfaceC09390do).A06();
                A0c = AbstractC25231BEo.A0c(fragmentActivity, interfaceC09390do);
                A0c.A08();
                c33193Ekf = new C33193Ekf();
                break;
            case 3:
                C26852BtE c26852BtE = (C26852BtE) this.A02;
                InterfaceC09390do interfaceC09390do2 = c26852BtE.A00;
                LE0.A00(AbstractC46703KlM.A00(AbstractC166987dD.A0r(interfaceC09390do2)), "CLICK_BROWSER_SETTING");
                C3DN c3dn = (C3DN) this.A01;
                if (c3dn != null) {
                    ((C3DP) c3dn).A0H = new C29387CxK(0);
                    c3dn.A0B();
                }
                bundle = null;
                AbstractC25233BEq.A0j(c26852BtE, interfaceC09390do2).A06();
                A0c = AbstractC25233BEq.A0j(c26852BtE, interfaceC09390do2);
                A0c.A08();
                c33193Ekf = new C33194Ekg();
                break;
            case 4:
                C14360o3.A0B(view, 0);
                ((InterfaceC16620sF) ((C51755Mte) ((C51755Mte) this.A02).A00).A00).invoke(AbstractC166997dE.A0L(view), this.A01);
                return;
            case 5:
                ((InterfaceC75453aC) this.A01).Dvc((C38321qM) this.A02);
                return;
            case 6:
                N7M n7m = (N7M) this.A02;
                String A15 = AbstractC25225BEi.A15(n7m.A0D);
                if (A15 == null) {
                    return;
                }
                InterfaceC09390do interfaceC09390do3 = n7m.A0H;
                C26869BtW A00 = AbstractC27620CGr.A00(AbstractC166987dD.A0r(interfaceC09390do3), A15);
                C3DO c3do2 = C3DN.A00;
                Activity activity2 = (Activity) this.A01;
                C189478aR A0x = AbstractC25228BEl.A0x(activity2, c3do2);
                if (A0x == null || (c189478aR = A0x.A03.A02) == null) {
                    return;
                }
                C189448aO A0g = AbstractC25231BEo.A0g(interfaceC09390do3);
                AbstractC25226BEj.A1M(activity2, A0g, 2131956992);
                A0g.A0T = A00;
                c189478aR.A0F(A00, A0g);
                return;
            default:
                C26385BlU c26385BlU = (C26385BlU) this.A02;
                UserSession userSession = c26385BlU.A01;
                String A002 = AbstractC111324zv.A00(2223);
                C19270xB c19270xB = new C19270xB(A002);
                C14360o3.A0B(userSession, 1);
                C25531Mh c25531Mh = new C25531Mh(AbstractC166987dD.A0f(AbstractC12220kQ.A01(c19270xB, userSession), AbstractC111324zv.A00(4284)), 147);
                long parseLong = Long.parseLong(userSession.userId);
                if (AbstractC25226BEj.A1Z(c25531Mh)) {
                    c25531Mh.A0M(VHY.A02, "action");
                    c25531Mh.A0g(Long.valueOf(parseLong));
                    c25531Mh.A0m(A002);
                    c25531Mh.A0w(null);
                    c25531Mh.A0R("error_message", null);
                    c25531Mh.Cht();
                }
                ((InterfaceC16660sJ) ((C51750MtZ) ((C51758Mth) this.A01).A00).A00).invoke(c26385BlU.A00);
                return;
        }
        A0c.A0B(bundle, c33193Ekf);
        A0c.A04();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(C45127Jxw c45127Jxw, KC4 kc4, int i) {
        super(Integer.valueOf(i));
        this.A02 = kc4;
        this.A01 = c45127Jxw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(C51755Mte c51755Mte, InterfaceC11380iw interfaceC11380iw, int i) {
        super(Integer.valueOf(i));
        this.A02 = c51755Mte;
        this.A01 = interfaceC11380iw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(C38321qM c38321qM, InterfaceC75453aC interfaceC75453aC, int i) {
        super(Integer.valueOf(i));
        this.A01 = interfaceC75453aC;
        this.A02 = c38321qM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(C51758Mth c51758Mth, C26385BlU c26385BlU, int i) {
        super(Integer.valueOf(i));
        this.A02 = c26385BlU;
        this.A01 = c51758Mth;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(FragmentActivity fragmentActivity, C26856BtI c26856BtI, int i) {
        super(Integer.valueOf(i));
        this.A01 = fragmentActivity;
        this.A02 = c26856BtI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(FragmentActivity fragmentActivity, N7M n7m, int i) {
        super(Integer.valueOf(i));
        this.A02 = n7m;
        this.A01 = fragmentActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27281C2g(FragmentActivity fragmentActivity, UserSession userSession, int i) {
        super(Integer.valueOf(i));
        this.A02 = userSession;
        this.A01 = fragmentActivity;
    }
}
