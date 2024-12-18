package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.api.model.SectionPagination;
import com.instagram.discovery.contextualfeed.model.EntityContextualFeedConfig;
import com.instagram.location.contextualfeed.intf.LocationContextualFeedConfig;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.V7t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68042V7t extends AbstractC37439GeJ {
    public final Fragment A00;
    public final UserSession A01;
    public final JIJ A02;
    public final LocationContextualFeedConfig A03;
    public final W5E A04;
    public final C68818VcZ A05;
    public final C38024GoD A06;
    public final boolean A07;

    @Override // X.AbstractC37439GeJ
    public final Hd8 A05() {
        return null;
    }

    @Override // X.AbstractC37439GeJ
    public final List A08() {
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

    public C68042V7t(Fragment fragment, UserSession userSession, JIJ jij, LocationContextualFeedConfig locationContextualFeedConfig, C38024GoD c38024GoD) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = jij;
        this.A06 = c38024GoD;
        this.A05 = new C68818VcZ(new C69592Vrv(fragment.requireContext(), new C70904Wjx(this)));
        this.A03 = locationContextualFeedConfig;
        C70960Wl7 c70960Wl7 = new C70960Wl7(this);
        String str = locationContextualFeedConfig.A03;
        EntityContextualFeedConfig entityContextualFeedConfig = locationContextualFeedConfig.A00;
        EnumC68206VFy enumC68206VFy = entityContextualFeedConfig.A04;
        FragmentActivity requireActivity = fragment.requireActivity();
        C08790ch A00 = AbstractC018607g.A00(fragment);
        SectionPagination sectionPagination = entityContextualFeedConfig.A02;
        String str2 = sectionPagination.A00;
        this.A04 = new W5E(fragment.getActivity(), AbstractC018607g.A00(fragment), userSession, c70960Wl7, c70960Wl7, c70960Wl7, c70960Wl7, str, Collections.singletonMap(this.A03.A00.A04, new C69413Vmx(userSession, enumC68206VFy, new C154796xU(requireActivity, A00, userSession, str2, true), new C69138ViT(sectionPagination.A01, sectionPagination.A02, AbstractC167007dF.A1W(str2)), str, locationContextualFeedConfig.A02, null, true)), true);
        this.A07 = entityContextualFeedConfig.A07;
    }

    @Override // X.AbstractC37439GeJ
    public final AnonymousClass341 A06() {
        return AnonymousClass341.A0G;
    }

    @Override // X.AbstractC37439GeJ
    public final Integer A07() {
        return C05F.A01;
    }

    @Override // X.AbstractC37439GeJ
    public final void A0A() {
        if (!AbstractC37303Gc4.A1a(W5E.A00(this.A04, this.A03.A00.A04).A04) && A0T()) {
            A0R(false, false);
        }
    }

    @Override // X.AbstractC37439GeJ
    public final void A0E() {
        String A00 = this.A06.A00();
        if (!TextUtils.isEmpty(A00)) {
            UserSession userSession = this.A01;
            C14360o3.A0B(userSession, 0);
            AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) userSession.A01(V7X.class, C71776X4d.A00);
            String str = this.A03.A01;
            C14360o3.A0B(str, 0);
            abstractC69735VuV.A01(str).A02 = A00;
        }
    }

    @Override // X.AbstractC37439GeJ
    public final void A0G(InterfaceC56362iU interfaceC56362iU) {
        C68818VcZ c68818VcZ = this.A05;
        EntityContextualFeedConfig entityContextualFeedConfig = this.A03.A00;
        String str = entityContextualFeedConfig.A06;
        str.getClass();
        String str2 = entityContextualFeedConfig.A05;
        str2.getClass();
        interfaceC56362iU.EaW(str, str2);
        c68818VcZ.A00.A00(interfaceC56362iU, -1);
    }

    @Override // X.AbstractC37439GeJ
    public final void A0Q(List list) {
        int i;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        C0w9.A03("LocationContextualFeedController", AnonymousClass001.A0c("Cache miss for ", " media.", i));
    }

    @Override // X.AbstractC37439GeJ
    public final void A0R(boolean z, boolean z2) {
        this.A04.A01(this.A03.A00.A04, z, z2);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0T() {
        return this.A04.A02(this.A03.A00.A04);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0U() {
        return C18U.A06(C06090Tz.A05, this.A01, 36319596370140725L);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0V() {
        return AbstractC37303Gc4.A1b(W5E.A00(this.A04, this.A03.A00.A04).A04);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0X() {
        return AbstractC37303Gc4.A1a(W5E.A00(this.A04, this.A03.A00.A04).A04);
    }

    @Override // X.AbstractC37439GeJ
    public final boolean A0a() {
        return this.A07;
    }

    @Override // X.AbstractC37439GeJ
    public final int A04(Context context) {
        return C3HB.A00(context);
    }
}
