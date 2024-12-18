package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3aJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75523aJ implements InterfaceC75453aC {
    public final Fragment A00;
    public final UserSession A01;
    public final C65192xH A02;
    public final InterfaceC11380iw A03;
    public final InterfaceC75453aC A04;
    public final C669430l A05;
    public final C36X A06;

    public C75523aJ(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC75453aC interfaceC75453aC, C65192xH c65192xH, C669430l c669430l, C36X c36x) {
        C14360o3.A0B(interfaceC75453aC, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(fragment, 3);
        C14360o3.A0B(c65192xH, 4);
        C14360o3.A0B(c36x, 5);
        C14360o3.A0B(interfaceC11380iw, 7);
        this.A04 = interfaceC75453aC;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = c65192xH;
        this.A06 = c36x;
        this.A05 = c669430l;
        this.A03 = interfaceC11380iw;
    }

    @Override // X.InterfaceC75453aC
    public final void Coc(View view, String str) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str, 1);
        this.A04.Coc(view, str);
    }

    @Override // X.InterfaceC75453aC
    public final void Cop(View view, String str) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(str, 1);
        this.A04.Cop(view, str);
    }

    @Override // X.InterfaceC75453aC
    public final void Cvh(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, String str, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(num, 3);
        this.A04.Cvh(c38321qM, c75113Zb, num, str, z);
    }

    @Override // X.InterfaceC75453aC
    public final void CyL(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.CyL(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void CzQ(C76623c7 c76623c7, C75113Zb c75113Zb) {
        C14360o3.A0B(c76623c7, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.CzQ(c76623c7, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void CzS(C38321qM c38321qM, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c38321qM, 1);
        this.A04.CzS(c38321qM, str);
    }

    @Override // X.InterfaceC75453aC
    public final void D3Y(C38321qM c38321qM, C75113Zb c75113Zb, User user, int i) {
        C14360o3.A0B(user, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        this.A04.D3Y(c38321qM, c75113Zb, user, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D3Z(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D3Z(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D3a(User user) {
        C14360o3.A0B(user, 0);
        this.A04.D3a(user);
    }

    @Override // X.InterfaceC75453aC
    public final void D3e(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D3e(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D3f(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D3f(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D3h(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D3h(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D3k(C38321qM c38321qM, C75113Zb c75113Zb, int i, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D3k(c38321qM, c75113Zb, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D3l(C38321qM c38321qM, C75113Zb c75113Zb, int i, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D3l(c38321qM, c75113Zb, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D3q(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D3q(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D3v(C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC75453aC
    public final void D3y(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D3y(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D41(C38321qM c38321qM, C75113Zb c75113Zb, Hashtag hashtag, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(hashtag, 1);
        C14360o3.A0B(c75113Zb, 2);
        this.A04.D41(c38321qM, c75113Zb, hashtag, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D43(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D43(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D46(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D46(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D47(String str) {
        C14360o3.A0B(str, 0);
        this.A04.D47(str);
    }

    @Override // X.InterfaceC75453aC
    public final void D48(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D48(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D49(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D49(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D4C(C38321qM c38321qM, C75113Zb c75113Zb, String str) {
        C14360o3.A0B(c38321qM, 0);
        UserSession userSession = this.A01;
        User A2E = c38321qM.A2E(userSession);
        if (A2E != null) {
            List singletonList = Collections.singletonList(new PendingRecipient(A2E));
            C14360o3.A07(singletonList);
            C122145g6 c122145g6 = new C122145g6(singletonList);
            if (C18U.A06(C06090Tz.A05, userSession, 36325209892074372L)) {
                C32324ELs c32324ELs = new C32324ELs();
                C140966Yy c140966Yy = new C140966Yy(this.A00.requireActivity(), userSession);
                c140966Yy.A08();
                String str2 = str;
                if (str == null) {
                    str2 = "feed";
                }
                c140966Yy.A0A = str2;
                c140966Yy.A0B(null, c32324ELs);
                c140966Yy.A04();
            } else {
                String id = c38321qM.getId();
                if (id != null) {
                    FragmentActivity activity = this.A00.getActivity();
                    if (activity != null) {
                        C36881nl A01 = C36881nl.A01(activity, this.A03, userSession, "feed_ufi");
                        A01.A0B = c122145g6;
                        A01.A0f = id;
                        A01.A0u = true;
                        A01.A06();
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            C18920wW A012 = AbstractC12220kQ.A01(this.A03, userSession);
            InterfaceC02590Ai A00 = A012.A00(A012.A00, AbstractC111324zv.A00(881));
            if (str == null) {
                str = "feed";
            }
            A00.AAP(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
            A00.AAP("author_id", AbstractC76433bn.A00(A2E));
            A00.AAP("media_type", c38321qM.BRp().name());
            A00.AAP("open_thread_id", null);
            A00.Cht();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.InterfaceC75453aC
    public final void D4G(C38321qM c38321qM, C75113Zb c75113Zb, Boolean bool, int i, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        A00(c38321qM, c75113Zb);
        this.A04.D4G(c38321qM, c75113Zb, bool, i, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4I(C38321qM c38321qM, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(c3Ow, 3);
        this.A04.D4I(c38321qM, c75113Zb, reel, c3Ow);
    }

    @Override // X.InterfaceC75453aC
    public final void D4L(C38321qM c38321qM, C75113Zb c75113Zb, Reel reel, C3Ow c3Ow) {
        C14360o3.A0B(reel, 0);
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(c3Ow, 3);
        this.A04.D4L(c38321qM, c75113Zb, reel, c3Ow);
    }

    @Override // X.InterfaceC75453aC
    public final void D4M(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D4M(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D4X(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D4X(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D4Y(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D4Y(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void D4Z(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        if (C18U.A06(C06090Tz.A05, this.A01, 36323229912018011L)) {
            A00(c38321qM, c75113Zb);
        }
        this.A04.D4Z(c38321qM, c75113Zb, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4e(C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D4e(c38321qM, c75113Zb, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D4g(C38321qM c38321qM, C75113Zb c75113Zb, String str, int i, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(str, 2);
        if (Systrace.A0E(1L)) {
            C0fO.A01("MainFeedMediaHeaderViewBinderDelegateImpl.onClickUserName", -134420407);
        }
        try {
            A00(c38321qM, c75113Zb);
            this.A04.D4g(c38321qM, c75113Zb, str, i, z);
            if (Systrace.A0E(1L)) {
                C0fO.A00(1888045529);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-928332257);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC75453aC
    public final void D4h(User user) {
        C14360o3.A0B(user, 0);
        this.A04.D4h(user);
    }

    @Override // X.InterfaceC75453aC
    public final void D4i(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.D4i(c38321qM, c75113Zb, i);
    }

    @Override // X.InterfaceC75453aC
    public final void D4j(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D4j(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D4x(C8JW c8jw, C3x9 c3x9, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(c8jw, 2);
        C14360o3.A0B(c3x9, 3);
        this.A04.D4x(c8jw, c3x9, c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener D4y(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A04.D4y(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D4z(C38321qM c38321qM, boolean z) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D4z(c38321qM, z);
    }

    @Override // X.InterfaceC75453aC
    public final void D5K(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D5K(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D5R(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D5R(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void D5Z(String str) {
        C14360o3.A0B(str, 0);
        this.A04.D5Z(str);
    }

    @Override // X.InterfaceC75453aC
    public final void D5k(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.D5k(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void DS6(View view, C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(view, 1);
        this.A04.DS6(view, c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void DWZ(String str) {
        C14360o3.A0B(str, 0);
        this.A04.DWZ(str);
    }

    @Override // X.InterfaceC75453aC
    public final void DX5(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.DX5(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final void DX6(C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        this.A04.DX6(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC75453aC
    public final void Dcz(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.Dcz(c38321qM);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuE(C38321qM c38321qM, String str, String str2) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        return this.A04.DuE(c38321qM, str, str2);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuF(C38321qM c38321qM, String str, String str2) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        return this.A04.DuF(c38321qM, str, str2);
    }

    @Override // X.InterfaceC75453aC
    public final View.OnTouchListener DuM(C38321qM c38321qM, String str, String str2) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        return this.A04.DuM(c38321qM, str, str2);
    }

    @Override // X.InterfaceC75453aC
    public final void Dvc(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        this.A04.Dvc(c38321qM);
    }

    private final void A00(C38321qM c38321qM, C75113Zb c75113Zb) {
        INI ini = IBO.A00;
        UserSession userSession = this.A01;
        if (!ini.A01(userSession, c38321qM) && !ini.A00(userSession, c38321qM)) {
            C36X c36x = this.A06;
            Integer num = C05F.A0C;
            EnumC71153Hb enumC71153Hb = EnumC71153Hb.A0H;
            C669430l c669430l = c36x.A03;
            if (c669430l != null && c669430l.A09(c38321qM, c75113Zb, enumC71153Hb, num)) {
                c36x.A01(c38321qM, c75113Zb, enumC71153Hb, null);
                return;
            }
            EnumC222416a A2F = c38321qM.A2F(userSession);
            if (c669430l == null || !c669430l.A08(c38321qM, c75113Zb, enumC71153Hb, A2F)) {
                return;
            }
            c669430l.A05(c38321qM, c75113Zb, enumC71153Hb, c36x.A02.BK6(C36X.A00(c38321qM, c36x)));
            return;
        }
        Context context = this.A00.getContext();
        if (context == null) {
            return;
        }
        C3MG.A00();
        C3MF.A00(context, userSession, c38321qM, new C42831Ix7(c38321qM, this), "profile");
    }

    @Override // X.C37A
    public final InterfaceC690038m BDf() {
        return this.A04.BDf();
    }

    @Override // X.InterfaceC75453aC
    public final void D4D() {
        this.A04.D4D();
    }
}
