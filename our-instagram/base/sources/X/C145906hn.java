package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import com.instagram.user.model.User;

/* renamed from: X.6hn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145906hn {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final ReelViewerConfig A04;
    public final InterfaceC61432r6 A05;
    public final String A06;
    public final String A07;

    public C145906hn(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ReelViewerConfig reelViewerConfig, InterfaceC61432r6 interfaceC61432r6, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(reelViewerConfig, 3);
        C14360o3.A0B(str, 6);
        C14360o3.A0B(str2, 7);
        C14360o3.A0B(interfaceC61432r6, 8);
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = reelViewerConfig;
        this.A01 = interfaceC11380iw;
        this.A03 = interfaceC60442pS;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = interfaceC61432r6;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.instagram.sponsored.analytics.SourceModelInfoParams] */
    public final void A02(C65 c65, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, User user, String str, String str2, boolean z) {
        C41181vS A0B;
        String str3;
        if (user == null) {
            C0w9.A03("ReelViewerFragment#goToProfilePageIfEnabled with null user", "Not expecting to navigate to profile page without a user");
            return;
        }
        if (this.A04.A0A) {
            return;
        }
        boolean A2N = user.A2N();
        A00(c65, c41181vS, c41551w4, c141596ac, this, str, A2N, z);
        String str4 = this.A07;
        String str5 = this.A06;
        String str6 = c41181vS.A0k;
        int i = c41551w4.A01;
        int i2 = c41551w4.A0E;
        String str7 = c41181vS.A0j;
        String id = user.getId();
        ?? obj = new Object();
        obj.A09 = str4;
        obj.A05 = str5;
        obj.A04 = str6;
        obj.A01 = i;
        obj.A03 = i2;
        obj.A06 = str7;
        obj.A08 = id;
        if (A2N) {
            UserSession userSession = this.A02;
            String A0V = c41181vS.A0V(userSession);
            if (c41181vS.A16() && (A0B = c41551w4.A0H.A0B(userSession, 0)) != null && (str3 = A0B.A0j) != null) {
                obj.A06 = str3;
            }
            if (A0V == null) {
                return;
            }
            C140966Yy c140966Yy = new C140966Yy(this.A00, userSession);
            c140966Yy.A0F = true;
            c140966Yy.A0D(AbstractC86593tX.A0A(obj, A0V, z));
            c140966Yy.A04();
            return;
        }
        A01(this, obj, user.getId(), str2, z);
    }

    public final void A03(User user, String str) {
        C14360o3.A0B(user, 0);
        if (!this.A04.A0A) {
            A01(this, null, user.getId(), str, false);
        }
    }

    public static final void A00(C65 c65, C41181vS c41181vS, C41551w4 c41551w4, C141596ac c141596ac, C145906hn c145906hn, String str, boolean z, boolean z2) {
        String str2;
        C1NI A09;
        c141596ac.A0J++;
        if ((!c41181vS.A1O()) && (A09 = c41181vS.A09()) != null) {
            UserSession userSession = c145906hn.A02;
            InterfaceC60442pS interfaceC60442pS = c145906hn.A03;
            C130915ve c130915ve = new C130915ve(userSession, c41551w4.A0H, c145906hn.A06, c145906hn.A07, c41551w4.A01, c41551w4.A0E);
            c130915ve.A09 = c141596ac.A0I;
            C32U.A0J(userSession, c130915ve, c65, A09, interfaceC60442pS, null, null, null, null, null, str, null, null, null, 0, z, z2);
        }
        C38321qM c38321qM = c41181vS.A0b;
        InterfaceC61432r6 interfaceC61432r6 = c145906hn.A05;
        AnonymousClass317 anonymousClass317 = AnonymousClass317.A0J;
        if (c38321qM == null || (str2 = c38321qM.A2F(c145906hn.A02).A02) == null) {
            str2 = "UNKNOWN";
        }
        interfaceC61432r6.DVi(new C6T6(null, null, "", str2), anonymousClass317, c41181vS, c41551w4);
    }

    public static final void A01(C145906hn c145906hn, SourceModelInfoParams sourceModelInfoParams, String str, String str2, boolean z) {
        String str3;
        C2ZI.A00.A0D("profile", "reelProfileOpener", true);
        UserSession userSession = c145906hn.A02;
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, str, str2, c145906hn.A01.getModuleName());
        A01.A0U = z;
        C154616xB c154616xB = new C154616xB(userSession);
        if (sourceModelInfoParams != null) {
            str3 = sourceModelInfoParams.A06;
        } else {
            str3 = null;
        }
        if (c154616xB.A01(str3, str)) {
            A01.A0O = "profile_products";
            A01.A0c = false;
        }
        if (sourceModelInfoParams != null) {
            A01.A04 = sourceModelInfoParams;
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36328117584805048L)) {
            C140966Yy c140966Yy = new C140966Yy(c145906hn.A00, userSession);
            c140966Yy.A0F = true;
            c140966Yy.A0B(null, AbstractC31364DqT.A03().A01.A02(userSession, A01.A03()));
            c140966Yy.A04();
            return;
        }
        Bundle A012 = AbstractC31364DqT.A03().A01.A01(userSession, A01.A03());
        FragmentActivity fragmentActivity = c145906hn.A00;
        C6XJ c6xj = new C6XJ(fragmentActivity, A012, userSession, ModalActivity.class, "profile");
        c6xj.A08();
        c6xj.A0C(fragmentActivity);
    }
}
