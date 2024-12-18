package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

/* renamed from: X.Okt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC55500Okt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ViewTreeObserverOnGlobalLayoutListenerC55500Okt(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [X.0Zx, X.MnJ] */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        String str;
        switch (this.A00) {
            case 0:
                View view = (View) this.A01;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                C54575O9c c54575O9c = (C54575O9c) this.A02;
                viewTreeObserver.removeOnGlobalLayoutListener(c54575O9c.A01);
                C50815Mcp c50815Mcp = ((NAV) this.A03).A01;
                if (c50815Mcp == null) {
                    str = "parametricSlider";
                    break;
                } else {
                    c50815Mcp.A02(c54575O9c, view.getHeight());
                    return;
                }
            case 1:
                CallerContext callerContext = AbstractC50624MWl.A01;
                C54799OJt c54799OJt = (C54799OJt) this.A01;
                LinearLayout linearLayout = c54799OJt.A01;
                if (linearLayout != null) {
                    if (!linearLayout.isShown()) {
                        return;
                    }
                    Rect A0U = AbstractC166987dD.A0U();
                    linearLayout.getGlobalVisibleRect(A0U);
                    if (!A0U.intersect(new Rect(0, 0, Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels))) {
                        return;
                    }
                    InterfaceC56392iX interfaceC56392iX = c54799OJt.A07;
                    if (interfaceC56392iX != null) {
                        String str2 = null;
                        if (interfaceC56392iX.CGb() != 0 && c54799OJt.A00().getVisibility() != 0) {
                            InterfaceC56392iX interfaceC56392iX2 = c54799OJt.A05;
                            if (interfaceC56392iX2 != null) {
                                if (interfaceC56392iX2.CGb() == 0) {
                                    UserSession userSession = (UserSession) this.A03;
                                    C55156OdK.A02(EnumC201098ur.VIEW, C82H.A0r, userSession, (OAD) this.A02, null);
                                }
                            } else {
                                str = "autoShareButtons";
                                break;
                            }
                        } else {
                            OAD oad = (OAD) this.A02;
                            boolean A03 = C55156OdK.A03(oad);
                            UserSession userSession2 = (UserSession) this.A03;
                            if (!A03) {
                                C55156OdK.A02(EnumC201098ur.VIEW, C82H.A0u, userSession2, oad, null);
                            } else {
                                C82G c82g = C82G.A0w;
                                MU0 mu0 = MU0.UNAVAILABLE;
                                MU1 mu1 = MU1.STORY;
                                ?? c0Zx = new C0Zx();
                                C38321qM c38321qM = oad.A02.A0b;
                                if (c38321qM != null) {
                                    str2 = c38321qM.getId();
                                }
                                c0Zx.A06("media_id", str2);
                                c0Zx.A06("unavailable_reason", AbstractC111324zv.A00(157));
                                AbstractC50568MTz.A00(mu0, mu1, c82g, c0Zx, userSession2);
                            }
                        }
                        LinearLayout linearLayout2 = c54799OJt.A01;
                        if (linearLayout2 != null) {
                            ViewTreeObserver viewTreeObserver2 = linearLayout2.getViewTreeObserver();
                            if (!viewTreeObserver2.isAlive()) {
                                return;
                            }
                            viewTreeObserver2.removeOnGlobalLayoutListener(this);
                            return;
                        }
                    } else {
                        str = "shareButtonGroup";
                        break;
                    }
                }
                str = "container";
                break;
            default:
                C38521Gwh c38521Gwh = (C38521Gwh) this.A01;
                RoundedCornerLinearLayout roundedCornerLinearLayout = c38521Gwh.A0I;
                AbstractC166997dE.A1K(roundedCornerLinearLayout, this);
                C41739IeB.A00 = roundedCornerLinearLayout.getWidth();
                IgFrameLayout igFrameLayout = c38521Gwh.A05;
                ViewGroup.LayoutParams layoutParams = igFrameLayout.getLayoutParams();
                int i = C41739IeB.A00;
                layoutParams.width = i;
                layoutParams.height = i;
                igFrameLayout.setLayoutParams(layoutParams);
                UserSession userSession3 = (UserSession) this.A03;
                C38321qM c38321qM2 = (C38321qM) this.A02;
                int i2 = C41739IeB.A00;
                C09530e4 A00 = C41739IeB.A00(userSession3, c38321qM2, c38521Gwh, i2, i2);
                C41739IeB.A02(c38521Gwh, AbstractC25230BEn.A0F(A00), AbstractC25229BEm.A0A(A00));
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
