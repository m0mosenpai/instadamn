package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.hashtag.contextualfeed.intf.HashtagContextualFeedConfig;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.V7u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68043V7u extends AbstractC37439GeJ implements InterfaceC114465Eq {
    public final int A00;
    public final UserSession A01;
    public final EnumC68206VFy A02;
    public final JIJ A03;
    public final C155376yQ A04;
    public final W4b A05;
    public final Hashtag A06;
    public final C38024GoD A07;
    public final String A08;
    public final EnumC68206VFy A09;
    public final C69011Vfn A0A;
    public final InterfaceC37200GaB A0B;
    public final FOB A0C;
    public final C69132ViN A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;

    @Override // X.AbstractC37439GeJ
    public final Hd8 A05() {
        return null;
    }

    @Override // X.AbstractC37439GeJ
    public final void A0B() {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0C() {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0D() {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0I(InterfaceC41141vN interfaceC41141vN) {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0J(InterfaceC41141vN interfaceC41141vN) {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0M(AnonymousClass391 anonymousClass391) {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0N(User user) {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0O(User user) {
    }

    @Override // X.AbstractC37439GeJ
    public final void A0P(String str) {
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0Y() {
        return true;
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0Z() {
        return false;
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0b() {
        return true;
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0c() {
        return false;
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0d() {
        return false;
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0e() {
        return true;
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0f() {
        return true;
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0g(C38321qM c38321qM) {
        return true;
    }

    public C68043V7u(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, JIJ jij, HashtagContextualFeedConfig hashtagContextualFeedConfig, C38024GoD c38024GoD) {
        this.A01 = userSession;
        this.A03 = jij;
        this.A07 = c38024GoD;
        Hashtag hashtag = hashtagContextualFeedConfig.A01;
        C14360o3.A07(hashtag);
        this.A06 = hashtag;
        EntityContextualFeedConfig entityContextualFeedConfig = hashtagContextualFeedConfig.A00;
        EnumC68206VFy enumC68206VFy = entityContextualFeedConfig.A04;
        C14360o3.A0A(enumC68206VFy);
        this.A02 = enumC68206VFy;
        this.A09 = entityContextualFeedConfig.A03;
        String str = entityContextualFeedConfig.A06;
        C14360o3.A0A(str);
        this.A0F = str;
        this.A0E = entityContextualFeedConfig.A05;
        this.A00 = entityContextualFeedConfig.A01;
        String str2 = hashtagContextualFeedConfig.A02;
        C14360o3.A07(str2);
        this.A08 = str2;
        this.A04 = new C155376yQ(userSession);
        this.A0G = entityContextualFeedConfig.A07;
        this.A0A = new C69011Vfn(fragment.requireActivity(), new C69592Vrv(fragment.requireActivity(), C70905Wjy.A00));
        C70928WkX c70928WkX = new C70928WkX(this);
        this.A0B = c70928WkX;
        Hashtag hashtag2 = this.A06;
        VgT A00 = AbstractC69993VzD.A00(userSession, false);
        C14360o3.A07(A00);
        this.A0C = new FOB(fragment, interfaceC11380iw, userSession, c70928WkX, hashtag2, A00, str2);
        FragmentActivity requireActivity = fragment.requireActivity();
        C08790ch A002 = AbstractC018607g.A00(fragment);
        SectionPagination sectionPagination = entityContextualFeedConfig.A02;
        C69132ViN c69132ViN = new C69132ViN(new C154796xU(requireActivity, A002, userSession, sectionPagination.A00, true), sectionPagination.A01, sectionPagination.A02);
        this.A0D = c69132ViN;
        FragmentActivity requireActivity2 = fragment.requireActivity();
        Map singletonMap = Collections.singletonMap(enumC68206VFy, c69132ViN);
        String name = this.A06.getName();
        if (name != null) {
            this.A05 = new W4b(requireActivity2, userSession, enumC68206VFy, name, hashtagContextualFeedConfig.A03, singletonMap);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.AbstractC37439GeJ
    public final AnonymousClass341 A06() {
        return AnonymousClass341.A0C;
    }

    @Override // X.AbstractC37439GeJ
    public final Integer A07() {
        return C05F.A01;
    }

    @Override // X.AbstractC37439GeJ
    public final List A08() {
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 0);
        C68808VcP c68808VcP = (C68808VcP) userSession.A01(C68808VcP.class, C71775X4c.A00);
        String str = this.A08;
        C14360o3.A0B(str, 0);
        return (List) c68808VcP.A00.remove(str);
    }

    @Override // X.AbstractC37439GeJ
    public final void A0A() {
        W4b w4b = this.A05;
        if (W4b.A00(w4b.A00, w4b).A02.A06()) {
            A0R(false, false);
        }
    }

    @Override // X.AbstractC37439GeJ
    public final void A0E() {
        String A00 = this.A07.A00();
        if (A00 != null && A00.length() != 0) {
            UserSession userSession = this.A01;
            C14360o3.A0B(userSession, 0);
            AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) userSession.A01(V7W.class, C71774X4b.A00);
            String str = this.A08;
            C14360o3.A0B(str, 0);
            abstractC69735VuV.A01(str).A02 = A00;
        }
    }

    @Override // X.AbstractC37439GeJ
    public final void A0G(InterfaceC56362iU interfaceC56362iU) {
        C69011Vfn c69011Vfn;
        String str = this.A0E;
        if (str != null) {
            c69011Vfn = this.A0A;
            String str2 = this.A0F;
            C14360o3.A0B(str2, 1);
            interfaceC56362iU.EaW(str2, str);
        } else {
            interfaceC56362iU.AHh();
            c69011Vfn = this.A0A;
            String str3 = this.A0F;
            C14360o3.A0B(str3, 1);
            interfaceC56362iU.setTitle(str3);
        }
        c69011Vfn.A01.A00(interfaceC56362iU, -1);
    }

    @Override // X.AbstractC37439GeJ
    public final void A0H(C11520jB c11520jB) {
        EnumC68206VFy enumC68206VFy = this.A09;
        if (enumC68206VFy != null) {
            c11520jB.A04(AbstractC129005sL.A00, enumC68206VFy.toString());
        }
    }

    @Override // X.AbstractC37439GeJ
    public final void A0Q(List list) {
        int i;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C0w9.A03("HashtagContextualFeedController", AnonymousClass001.A0c("Cache miss for ", " media.", i));
    }

    @Override // X.AbstractC37439GeJ
    public final void A0R(boolean z, boolean z2) {
        this.A05.A01(new C68044V7w(1, this, z), GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, z, false, false);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0T() {
        W4b w4b = this.A05;
        return W4b.A00(w4b.A00, w4b).A02.A05();
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0U() {
        return C18U.A06(C06090Tz.A05, this.A01, 36319596370140725L);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0V() {
        W4b w4b = this.A05;
        return AbstractC37303Gc4.A1b(W4b.A00(w4b.A00, w4b).A02);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0X() {
        W4b w4b = this.A05;
        return AbstractC37303Gc4.A1a(W4b.A00(w4b.A00, w4b).A02);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0a() {
        return this.A0G;
    }

    @Override // X.InterfaceC114465Eq
    public final Hashtag BD4() {
        return this.A06;
    }

    @Override // X.AbstractC37439GeJ
    public final int A04(Context context) {
        return C3HB.A00(context);
    }
}
