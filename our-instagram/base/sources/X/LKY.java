package X;

import android.os.Build;
import android.util.Size;
import android.view.View;
import android.webkit.URLUtil;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* loaded from: classes8.dex */
public abstract class LKY {
    public static final Size A00(IgImageView igImageView) {
        int i;
        C14360o3.A0B(igImageView, 0);
        int dimensionPixelSize = igImageView.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        if (igImageView.getHeight() > 0) {
            dimensionPixelSize = igImageView.getHeight();
        }
        if (igImageView.getWidth() > 0) {
            i = igImageView.getWidth();
        } else {
            i = (int) (dimensionPixelSize * 0.75f);
        }
        return new Size(i, dimensionPixelSize);
    }

    public static final void A02(View view, UserSession userSession, IgImageView igImageView, InterfaceC65702y7 interfaceC65702y7, InterfaceC56392iX interfaceC56392iX, KTK ktk, C7SZ c7sz, InterfaceC09390do interfaceC09390do, boolean z) {
        AbstractC167027dH.A13(igImageView, view, interfaceC56392iX);
        AbstractC167007dF.A1H(interfaceC09390do, 5, ktk);
        if (!interfaceC56392iX.CWW() && !ktk.A07 && LC3.A01(userSession)) {
            return;
        }
        C158847Aw c158847Aw = new C158847Aw(AbstractC166997dE.A0L(igImageView), view, userSession, igImageView, interfaceC65702y7, interfaceC56392iX, interfaceC09390do, 128);
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = ktk.A04;
        if (ktk.A07 && privacyMediaOverlayViewModel != null) {
            c158847Aw.A04(privacyMediaOverlayViewModel, new ME7(47, c7sz, userSession, privacyMediaOverlayViewModel, ktk), ktk.A00);
        } else if (c7sz.A07) {
            c158847Aw.A03(c7sz.A00, z);
        } else {
            c158847Aw.A02();
        }
    }

    public static final boolean A03(UserSession userSession, KTK ktk) {
        C158737Aj c158737Aj;
        C14360o3.A0B(ktk, 1);
        AbstractC1583778x abstractC1583778x = ktk.A02.A0F;
        if (abstractC1583778x != null && (abstractC1583778x instanceof C158737Aj) && (c158737Aj = (C158737Aj) abstractC1583778x) != null) {
            Integer num = c158737Aj.A06;
            Integer num2 = c158737Aj.A05;
            if (num != null && num2 != null && Math.max(num2.intValue(), num.intValue()) >= C18U.A01(C06090Tz.A05, userSession, 36611538182084895L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A04(KTK ktk) {
        C7Q4 c7q4;
        C158737Aj c158737Aj;
        C14360o3.A0B(ktk, 0);
        C158797Aq c158797Aq = ktk.A01;
        Integer num = null;
        if (c158797Aq != null) {
            c7q4 = c158797Aq.A0F;
        } else {
            c7q4 = null;
        }
        AbstractC1583778x abstractC1583778x = ktk.A02.A0F;
        if (abstractC1583778x != null && (abstractC1583778x instanceof C158737Aj) && (c158737Aj = (C158737Aj) abstractC1583778x) != null) {
            num = c158737Aj.A03;
        }
        if ((c7q4 != null && c7q4.A05()) || num != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    public static final void A01(Size size, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IgImageView igImageView, InterfaceC65702y7 interfaceC65702y7, KTK ktk, C19L c19l) {
        C7Q4 c7q4;
        ?? A1a = AbstractC167017dG.A1a(igImageView, ktk);
        C14360o3.A0B(c19l, 5);
        C158797Aq c158797Aq = ktk.A01;
        String str = null;
        if (c158797Aq != null && (c7q4 = c158797Aq.A0F) != null && (str = c7q4.A08) != null && URLUtil.isNetworkUrl(str)) {
            AbstractC25235BEs.A1I(interfaceC11380iw, igImageView, str);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && ktk.A05 && str != null && str.length() != 0 && AbstractC43592JPx.A1a("content://", A1a == true ? 1 : 0, str)) {
            LIO.A00.A01(AbstractC166997dE.A0L(igImageView), size, userSession, str, new C50363MLp(33, igImageView, interfaceC65702y7), c19l);
            return;
        }
        AbstractC1583778x abstractC1583778x = ktk.A02.A0F;
        if (abstractC1583778x instanceof C158737Aj) {
            C158737Aj c158737Aj = (C158737Aj) abstractC1583778x;
            int A0K = AbstractC167017dG.A0K(c158737Aj.A07);
            int A06 = AbstractC25227BEk.A06(c158737Aj.A04, 0);
            int width = size.getWidth();
            int height = size.getHeight();
            int i = 1;
            if (A06 > height || A0K > width) {
                int i2 = A06 / 2;
                int i3 = A0K / 2;
                while (i2 / i >= height && i3 / i >= width) {
                    i *= 2;
                }
                if (i > A1a && C18U.A06(C06090Tz.A05, userSession, 36328714585325293L)) {
                    igImageView.A0E(interfaceC11380iw, c158737Aj.A00, i);
                    return;
                }
            }
            igImageView.setUrl(userSession, c158737Aj.A00, interfaceC11380iw);
            return;
        }
        igImageView.A09();
    }
}
