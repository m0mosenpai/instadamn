package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class IN9 {
    public Fragment A00;
    public FragmentActivity A01;
    public UserSession A02;
    public C189478aR A03;
    public InterfaceC1119153d A04 = new C43010J0a(this, 5);
    public C59952od A05;
    public ILW A06;
    public CharSequence A07;
    public boolean A08;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(View view, Fragment fragment, CharSequence charSequence, boolean z) {
        C189478aR c189478aR;
        C5SW c5sw;
        this.A04 = new C43012J0c(4, view, this);
        C59952od c59952od = this.A05;
        if (c59952od != null) {
            C37540Gfw c37540Gfw = c59952od.A09;
            String str = "clipsViewerFragmentViewModel";
            if (c37540Gfw != null) {
                C37784Gjz c37784Gjz = c37540Gfw.A0I;
                if (c37784Gjz != null && (c5sw = c37784Gjz.A00) != null) {
                    c5sw.A08(false);
                }
                C37540Gfw c37540Gfw2 = c59952od.A09;
                if (c37540Gfw2 != null) {
                    C37851Gl5 c37851Gl5 = c37540Gfw2.A0B;
                    if (c37851Gl5 != null) {
                        AbstractC167007dF.A0x(c37851Gl5.A02);
                    }
                    C37540Gfw c37540Gfw3 = c59952od.A09;
                    if (c37540Gfw3 != null) {
                        AbstractC43757JWv abstractC43757JWv = c37540Gfw3.A0H;
                        if (abstractC43757JWv != null) {
                            abstractC43757JWv.A0E();
                        }
                        C37540Gfw c37540Gfw4 = c59952od.A09;
                        if (c37540Gfw4 != null) {
                            AbstractC43757JWv abstractC43757JWv2 = c37540Gfw4.A0H;
                            if (abstractC43757JWv2 != null) {
                                abstractC43757JWv2.A0C();
                            }
                            C37617GhC c37617GhC = c59952od.A0H;
                            if (c37617GhC != null) {
                                ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = c37617GhC.A03;
                                C3FQ c3fq = c37617GhC.A00;
                                int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                                viewOnTouchListenerC60632pm.A09(c3fq);
                            }
                            C37540Gfw c37540Gfw5 = c59952od.A09;
                            if (c37540Gfw5 != null) {
                                C37661Ghu.A03(c37540Gfw5.A11, false);
                                C41217IMg c41217IMg = c59952od.A0K;
                                if (c41217IMg == null) {
                                    str = "drawerEventsDispatcher";
                                } else {
                                    c41217IMg.A01();
                                }
                            }
                        }
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        this.A00 = fragment;
        this.A07 = charSequence;
        UserSession userSession = this.A02;
        C189478aR c189478aR2 = null;
        C51D c51d = null;
        if (userSession != null) {
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A1G = z;
            AbstractC25225BEi.A1Q(A0y, !z);
            A0y.A03 = 0.68f;
            A0y.A0U = this.A04;
            A0y.A1O = true;
            if (fragment instanceof C51D) {
                c51d = (C51D) fragment;
            }
            A0y.A0T = c51d;
            if (FYF.A00(userSession).booleanValue()) {
                A0y.A0d = charSequence;
                A0y.A0D = R.style.IgdsTabView;
            } else {
                A0y.A0d = charSequence;
            }
            c189478aR2 = A0y.A00();
        }
        this.A03 = c189478aR2;
        ILW ilw = this.A06;
        if (ilw != null) {
            C37661Ghu.A03(ilw.A00, false);
        }
        FragmentActivity fragmentActivity = this.A01;
        if (fragmentActivity != null && (c189478aR = this.A03) != null) {
            c189478aR.A02(fragmentActivity, fragment);
        }
    }

    public final void A01(Fragment fragment, String str) {
        C189478aR c189478aR;
        UserSession userSession = this.A02;
        if (userSession != null && (c189478aR = this.A03) != null) {
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A0d = str;
            A0y.A1G = true;
            c189478aR.A0F(fragment, A0y);
        }
    }
}
