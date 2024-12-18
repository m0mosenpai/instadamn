package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerModel;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EJq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32279EJq extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "EditFeaturedFragment";
    public MWW A00;
    public User A01;
    public List A02;
    public C32417EPs A04;
    public C32422EPx A05;
    public final InterfaceC09390do A0B;
    public final String A08 = "ig_fb_profile_link_integration";
    public final String A09 = "banner_id";
    public final String A0A = "banner_type";
    public List A03 = AbstractC166987dD.A1E();
    public List A06 = AbstractC166987dD.A1E();
    public final C8SB A07 = new C8SB(new C31858DzQ(this));
    public final InterfaceC09390do A0C = AbstractC60492pY.A02(this);

    /* JADX WARN: Type inference failed for: r1v1, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131970152);
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 24), AbstractC31174DnI.A0K(), interfaceC56362iU);
        C31722DwR.A01(ViewOnClickListenerC31723DwS.A00(this, 25), interfaceC56362iU, new Object());
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "profile_edit_featured";
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC25230BEn.A0k(r8, 0), 36328779009769252L) != false) goto L16;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            r15 = this;
            r7 = 0
            r1 = r16
            X.C14360o3.A0B(r1, r7)
            r0 = r17
            super.onViewCreated(r1, r0)
            r0 = 2131432754(0x7f0b1532, float:1.8487274E38)
            android.view.View r13 = X.AbstractC166997dE.A0S(r1, r0)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r0 = 2131428392(0x7f0b0428, float:1.8478427E38)
            android.view.View r6 = X.AbstractC166997dE.A0R(r1, r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 2131438428(0x7f0b2b5c, float:1.8498783E38)
            android.widget.TextView r5 = X.AbstractC167007dF.A0N(r1, r0)
            r0 = 2131438429(0x7f0b2b5d, float:1.8498785E38)
            android.view.View r10 = X.AbstractC166997dE.A0S(r1, r0)
            r0 = 2131438465(0x7f0b2b81, float:1.8498858E38)
            android.view.View r11 = X.AbstractC166997dE.A0S(r1, r0)
            r0 = 2131438426(0x7f0b2b5a, float:1.8498779E38)
            android.view.View r9 = X.AbstractC166997dE.A0S(r1, r0)
            java.util.List r0 = r15.A03
            int r0 = r0.size()
            r4 = 1
            r12 = 0
            if (r0 > r4) goto L44
            r12 = 1
        L44:
            r15.requireContext()
            java.util.List r3 = r15.A03
            X.0do r8 = r15.A0C
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r8)
            r0 = 42
            X.DSA r1 = new X.DSA
            r1.<init>(r0, r13, r15)
            X.EPx r0 = new X.EPx
            r0.<init>(r2, r3, r1)
            r15.A05 = r0
            android.content.Context r0 = r15.requireContext()
            X.AbstractC31174DnI.A16(r0, r13, r4, r7)
            X.EPx r0 = r15.A05
            if (r0 != 0) goto L72
            java.lang.String r0 = "featuredAdapter"
        L6a:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L72:
            r13.setAdapter(r0)
            X.8SB r0 = r15.A07
            r0.A0A(r13)
            java.util.List r0 = r15.A06
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La1
            X.0ll r0 = X.AbstractC25230BEn.A0k(r8, r7)
            java.lang.Boolean r0 = X.AbstractC31562Dtn.A00(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto La1
            X.0ll r3 = X.AbstractC25230BEn.A0k(r8, r7)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328779009769252(0x8110d500003f24, double:3.037804357805001E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto Ld2
        La1:
            r9.setVisibility(r7)
            r11.setVisibility(r7)
            r0 = 4
            r10.setVisibility(r0)
            r5.setVisibility(r0)
            r15.requireContext()
            java.util.List r2 = r15.A06
            com.instagram.common.session.UserSession r1 = X.AbstractC166987dD.A0r(r8)
            X.EPs r0 = new X.EPs
            r0.<init>(r1, r15, r2)
            r15.A04 = r0
            android.content.Context r0 = r15.requireContext()
            X.AbstractC31174DnI.A16(r0, r6, r4, r7)
            X.EPs r0 = r15.A04
            if (r0 != 0) goto Lcc
            java.lang.String r0 = "availableAdapter"
            goto L6a
        Lcc:
            r6.setAdapter(r0)
            r15.A00()
        Ld2:
            r0 = 2131970078(0x7f13481e, float:1.9577097E38)
            if (r12 == 0) goto Lda
            r0 = 2131970077(0x7f13481d, float:1.9577095E38)
        Lda:
            r5.setText(r0)
            X.07S r14 = X.C07S.STARTED
            X.07X r12 = r15.getViewLifecycleOwner()
            X.2k6 r0 = X.C07Y.A00(r12)
            r16 = 0
            r17 = 15
            X.PZn r11 = new X.PZn
            r11.<init>(r12, r13, r14, r15, r16, r17)
            X.AbstractC166987dD.A1Z(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32279EJq.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A00() {
        View view;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A0C);
        C14360o3.A0B(A0o, 0);
        if (AbstractC31562Dtn.A00(A0o).booleanValue() && (view = this.mView) != null) {
            View A0R = AbstractC166997dE.A0R(view, R.id.featured_list);
            View A0S = AbstractC166997dE.A0S(view, R.id.profile_featured_banners_nullstate_title_text);
            View A0S2 = AbstractC166997dE.A0S(view, R.id.profile_featured_banners_nullstate_body_text);
            View A0S3 = AbstractC166997dE.A0S(view, R.id.available_list);
            View A0S4 = AbstractC166997dE.A0S(view, R.id.profile_available_banners_nullstate_body_text);
            if (this.A03.isEmpty()) {
                AbstractC31180DnO.A19(A0R, A0S, A0S2, 8, 0);
            } else {
                AbstractC31180DnO.A19(A0R, A0S, A0S2, 0, 8);
            }
            if (this.A06.isEmpty()) {
                A0S3.setVisibility(8);
                A0S4.setVisibility(0);
            } else {
                A0S3.setVisibility(0);
                A0S4.setVisibility(8);
            }
        }
    }

    public static final void A01(C32279EJq c32279EJq) {
        GBU gbu = new GBU(c32279EJq);
        C73I c73i = C73I.A00;
        Context requireContext = c32279EJq.requireContext();
        InterfaceC09390do interfaceC09390do = c32279EJq.A0C;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        User user = c32279EJq.A01;
        if (user != null) {
            C43H c43h = null;
            c32279EJq.A03 = AbstractC001800i.A0U(c73i.A05(requireContext, (AiStudioProfileBannerModel) ((C31822Dyg) c32279EJq.A0B.getValue()).A02.getValue(), c32279EJq, A0r, gbu, user, true));
            Context requireContext2 = c32279EJq.requireContext();
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            User user2 = c32279EJq.A01;
            if (user2 != null) {
                ArrayList A12 = AbstractC166997dE.A12(A0r2, 1);
                boolean z = false;
                if (C14360o3.A0K(user2.A03.BwI(), false) && AbstractC31562Dtn.A00(A0r2).booleanValue()) {
                    z = true;
                }
                InterfaceC110324y3 interfaceC110324y3 = null;
                if (z) {
                    InterfaceC81833l1 BNa = user2.A03.BNa();
                    if (BNa != null) {
                        c43h = BNa.BNc();
                    }
                    A12.add(new C74C(requireContext2, c43h, A0r2, gbu, user2));
                }
                if (C14360o3.A0K(user2.A03.BwJ(), false) && AbstractC31562Dtn.A00(A0r2).booleanValue()) {
                    InterfaceC81833l1 BNa2 = user2.A03.BNa();
                    if (BNa2 != null) {
                        interfaceC110324y3 = BNa2.BNb();
                    }
                    A12.add(new C74D(requireContext2, interfaceC110324y3, gbu, user2));
                }
                if (C18U.A06(C06090Tz.A05, A0r2, 36328779009769252L)) {
                    A12.add(new GBR(requireContext2));
                }
                c32279EJq.A06 = AbstractC001800i.A0U(A12);
                c32279EJq.A02 = AbstractC001800i.A0U(c32279EJq.A03);
                return;
            }
        }
        C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    public C32279EJq() {
        GSw gSw = new GSw(this, 46);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new GSv(new GSw(this, 49), 0));
        this.A0B = AbstractC25225BEi.A0a(new GSv(A00, 1), gSw, new C57257Pbf(0, null, A00), AbstractC25225BEi.A1D(C31822Dyg.class));
    }

    public static final void A02(C32279EJq c32279EJq) {
        String str;
        A01(c32279EJq);
        C32422EPx c32422EPx = c32279EJq.A05;
        if (c32422EPx == null) {
            str = "featuredAdapter";
        } else {
            List list = c32279EJq.A03;
            C14360o3.A0B(list, 0);
            c32422EPx.clear();
            C32448ERa c32448ERa = c32422EPx.A00;
            boolean z = true;
            if (list.size() > 1) {
                z = false;
            }
            c32448ERa.A00 = z;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c32422EPx.addModel(it.next(), c32448ERa);
            }
            c32422EPx.notifyDataSetChanged();
            C32417EPs c32417EPs = c32279EJq.A04;
            if (c32417EPs == null) {
                str = "availableAdapter";
            } else {
                List list2 = c32279EJq.A06;
                C14360o3.A0B(list2, 0);
                c32417EPs.clear();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    c32417EPs.addModel(it2.next(), c32417EPs.A00);
                }
                c32417EPs.notifyDataSetChanged();
                c32279EJq.A00();
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1917520304);
        super.onCreate(bundle);
        ((C31822Dyg) this.A0B.getValue()).A00();
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A0C;
        this.A01 = AbstractC31176DnK.A0g(c08730cb, interfaceC09390do);
        this.A00 = (MWW) AbstractC155486yb.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01.A02();
        EVO.A00(this);
        A01(this);
        C0f9.A09(1483499922, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1723578529);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_edit_featured, viewGroup, false);
        C0f9.A09(2041400049, A02);
        return inflate;
    }
}
