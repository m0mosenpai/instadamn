package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.User;

/* renamed from: X.2v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63832v4 implements InterfaceC63842v5 {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C63382uL A03;
    public final InterfaceC63862v7 A04 = new InterfaceC63862v7() { // from class: X.2v6
        @Override // X.InterfaceC63862v7
        public final void DK9(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        }

        @Override // X.InterfaceC63862v7
        public final void DKA(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
        }

        @Override // X.InterfaceC63862v7
        public final void DKC(AbstractC115105If abstractC115105If, Hashtag hashtag) {
        }

        @Override // X.InterfaceC63862v7
        public final void DKD(InterfaceC40821up interfaceC40821up, Hashtag hashtag) {
        }
    };
    public final C63822v3 A05;
    public final C63702ur A06;
    public final Integer A07;

    public static String A00(FOC foc) {
        EnumC39555HdR enumC39555HdR;
        String str = foc.A03;
        if (str != null && (enumC39555HdR = (EnumC39555HdR) EnumC39555HdR.A01.get(str)) != null) {
            return enumC39555HdR.A00;
        }
        return null;
    }

    private void A01(FOC foc, String str, String str2, String str3, String str4, int i, int i2, long j) {
        String A00 = AbstractC125245lV.A00(this.A07);
        String moduleName = this.A01.getModuleName();
        C14360o3.A0B(str, 2);
        C14360o3.A0B(moduleName, 3);
        String A002 = A00(foc);
        C63702ur.A01(this.A06, null, Long.valueOf(j), "", moduleName, A002, str3, "", str2, str4, null, null, str, A00, i, i2);
    }

    @Override // X.InterfaceC63392uM
    public final void A9W(InterfaceC73233Pz interfaceC73233Pz, InterfaceC75123Zc interfaceC75123Zc) {
        C63382uL c63382uL = this.A03;
        if (c63382uL != null) {
            c63382uL.A9W(interfaceC73233Pz, interfaceC75123Zc);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.U29, java.lang.Object] */
    @Override // X.InterfaceC63842v5
    public final void DMg(C1XV c1xv, C47K c47k) {
        if (c1xv == C1XV.A0p && C37011ny.A00 != null) {
            C37011ny A00 = U04.A00();
            UserSession userSession = this.A02;
            A00.A00(userSession);
            C140966Yy c140966Yy = new C140966Yy(this.A00, userSession);
            U04.A00();
            c140966Yy.A0E(new Object().A02(userSession));
            c140966Yy.A04();
        }
    }

    @Override // X.InterfaceC63842v5
    public final void DMh(FOC foc, String str, String str2, String str3, int i, int i2) {
        Hashtag hashtag = foc.A00;
        hashtag.getClass();
        if (hashtag.getId() != null) {
            String A00 = AbstractC125245lV.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            C14360o3.A0B(id, 2);
            C14360o3.A0B(moduleName, 3);
            C63702ur.A02(this.A06, moduleName, str, str3, id, A00, i, i2);
            String id2 = hashtag.getId();
            C1GJ.A03(F8O.A00(this.A02, C05F.A00, id2));
        }
    }

    @Override // X.InterfaceC63842v5
    public final void DMi(FOC foc, String str, String str2, String str3, int i, int i2) {
        Integer num;
        String str4;
        Hashtag hashtag = foc.A00;
        hashtag.getClass();
        this.A05.A05(this.A02, this.A04, hashtag, "netego_hashtags");
        Integer B7N = hashtag.B7N();
        if (B7N != null && B7N.intValue() == 1) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (hashtag.getId() != null) {
            String A00 = AbstractC125245lV.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            C14360o3.A0B(id, 2);
            C14360o3.A0B(moduleName, 3);
            if (num.intValue() != 0) {
                str4 = "not_following";
            } else {
                str4 = "following";
            }
            C63702ur.A06(this.A06, "", moduleName, A00(foc), "preview", str4, "", str, str3, null, null, null, id, A00, i, i2);
        }
    }

    @Override // X.InterfaceC63842v5
    public final void DMj(FOC foc, String str, String str2, String str3, int i, int i2) {
        String str4 = str;
        Hashtag hashtag = foc.A00;
        hashtag.getClass();
        if (hashtag.getId() != null) {
            String A00 = AbstractC125245lV.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            C14360o3.A0B(id, 2);
            C14360o3.A0B(moduleName, 3);
            C63702ur.A04(this.A06, "", moduleName, A00(foc), "preview", "", str4, str3, null, null, id, A00, i, i2);
        }
        if (str == null) {
            str4 = "";
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        Bundle A002 = WE2.A00(hashtag, this.A01.getModuleName(), "recommended_interest");
        A002.putString(AbstractC111324zv.A00(1644), str4);
        A002.putString(AbstractC111324zv.A00(1642), "preview");
        Fragment A01 = WE2.A01(userSession);
        A01.setArguments(A002);
        c140966Yy.A0B(null, A01);
        c140966Yy.A04();
    }

    @Override // X.InterfaceC63842v5
    public final void DMk(FOC foc, String str, String str2, String str3, int i, int i2, long j) {
        String str4;
        Hashtag hashtag = foc.A00;
        hashtag.getClass();
        if (hashtag.getId() != null) {
            str4 = hashtag.getId();
        } else {
            str4 = "";
        }
        A01(foc, str4, str, "preview", str3, i, i2, j);
    }

    @Override // X.InterfaceC63842v5
    public final void DMl(FOC foc, int i, int i2, int i3) {
        Integer num;
        String str;
        Hashtag hashtag = foc.A00;
        hashtag.getClass();
        this.A05.A06(this.A02, this.A04, hashtag, "netego_hashtags");
        Integer B7N = hashtag.B7N();
        if (B7N != null && B7N.intValue() == 1) {
            num = C05F.A00;
        } else {
            num = C05F.A01;
        }
        if (hashtag.getId() != null) {
            String A00 = AbstractC125245lV.A00(this.A07);
            String id = hashtag.getId();
            String moduleName = this.A01.getModuleName();
            C14360o3.A0B(id, 2);
            C14360o3.A0B(moduleName, 3);
            if (num.intValue() != 0) {
                str = "not_following";
            } else {
                str = "following";
            }
            C63702ur.A05(this.A06, "", moduleName, A00(foc), null, str, "", null, null, null, null, id, A00, i, i2);
        }
    }

    @Override // X.InterfaceC63842v5
    public final void DMm(FOC foc, String str, String str2, String str3, int i, int i2, long j) {
        A01(foc, foc.A04, str, "topic_card", str3, i, i2, j);
    }

    @Override // X.InterfaceC63842v5
    public final void DMn(C1XV c1xv) {
        if (C1XV.A0p == c1xv && C37011ny.A00 != null) {
            U04.A00().A00(this.A02);
        }
    }

    @Override // X.InterfaceC63842v5
    public final void DMo(FOC foc, String str, String str2, String str3, int i, int i2) {
        User user = foc.A02;
        user.getClass();
        String A00 = AbstractC125245lV.A00(this.A07);
        String id = user.getId();
        String moduleName = this.A01.getModuleName();
        C14360o3.A0B(moduleName, 3);
        C63702ur.A02(this.A06, moduleName, str, str3, id, A00, i, i2);
        String id2 = user.getId();
        C1GJ.A03(F8O.A00(this.A02, C05F.A01, id2));
    }

    @Override // X.InterfaceC63842v5
    public final void DMp(FOC foc, String str, String str2, String str3, int i, int i2, int i3) {
        User user = foc.A02;
        user.getClass();
        Integer A00 = AbstractC37441GeL.A00(user.B7L());
        String A002 = AbstractC125245lV.A00(this.A07);
        String id = user.getId();
        String moduleName = this.A01.getModuleName();
        C14360o3.A0B(moduleName, 3);
        String A003 = AbstractC37442GeM.A00(A00);
        C63702ur.A06(this.A06, "", moduleName, A00(foc), "preview", A003, "", str, str3, null, C63702ur.A00(user), null, id, A002, i, i2);
    }

    @Override // X.InterfaceC63842v5
    public final void DMq(FOC foc, String str, String str2, String str3, int i, int i2, int i3) {
        User user = foc.A02;
        user.getClass();
        String A00 = AbstractC125245lV.A00(this.A07);
        String id = user.getId();
        InterfaceC11380iw interfaceC11380iw = this.A01;
        String moduleName = interfaceC11380iw.getModuleName();
        C14360o3.A0B(moduleName, 3);
        C63702ur.A03(this.A06, "", moduleName, A00(foc), "preview", "", str, str3, null, null, id, A00, i, i2);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        C28431Ze c28431Ze = AbstractC31364DqT.A03().A01;
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, user.getId(), "interest_recommendation_user_item", interfaceC11380iw.getModuleName());
        A01.A03 = new UserDetailEntryInfo(null, null, null, null, str, "preview", str3, null, null, null, null, null);
        c140966Yy.A0E(c28431Ze.A02(userSession, A01.A03()));
        c140966Yy.A04();
    }

    @Override // X.InterfaceC63842v5
    public final void DMr(FOC foc, String str, String str2, String str3, int i, int i2, int i3, long j) {
        User user = foc.A02;
        user.getClass();
        A01(foc, user.getId(), str, "preview", str3, i, i2, j);
    }

    @Override // X.InterfaceC63392uM
    public final void EDV(View view, InterfaceC73233Pz interfaceC73233Pz) {
        C63382uL c63382uL = this.A03;
        if (c63382uL != null) {
            c63382uL.EDV(view, interfaceC73233Pz);
        }
    }

    public C63832v4(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C63382uL c63382uL, C63822v3 c63822v3, Integer num) {
        this.A00 = fragmentActivity;
        this.A05 = c63822v3;
        this.A07 = num;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = c63382uL;
        this.A06 = new C63702ur(interfaceC11380iw, userSession);
    }
}
