package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.EJz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32287EJz extends AbstractC59962oe implements InterfaceC60122ou, CallerContextable {
    public static final String __redex_internal_original_name = "EditLinksListFragment";
    public InterfaceC81833l1 A00;
    public C25671My A01;
    public C2Ne A02;
    public EQ2 A03;
    public C6WQ A04;
    public User A05;
    public boolean A06;
    public InterfaceC41501vz A07;
    public final C151546s0 A09 = new Object();
    public final C35789FrR A08 = new Object();
    public final String A0A = "ig_fb_profile_link_integration";
    public final InterfaceC09390do A0B = AbstractC60492pY.A02(this);

    public static final List A01(C32287EJz c32287EJz) {
        Context context = c32287EJz.getContext();
        if (context == null) {
            return C16930sl.A00;
        }
        C35789FrR c35789FrR = c32287EJz.A08;
        InterfaceC09390do interfaceC09390do = c32287EJz.A0B;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        User user = c32287EJz.A05;
        if (user == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            throw C00O.createAndThrow();
        }
        return c35789FrR.A01(context, AbstractC35784FrM.A00(AbstractC166987dD.A0r(interfaceC09390do), user), c32287EJz, A0r, user);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131965255);
        User user = this.A05;
        if (user == null) {
            C14360o3.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            throw C00O.createAndThrow();
        }
        List Ag2 = user.A03.Ag2();
        if (Ag2 != null && Ag2.size() > 1) {
            interfaceC56362iU.Eha(ViewOnClickListenerC31723DwS.A00(this, 31), R.drawable.instagram_more_horizontal_pano_outline_24);
        }
        AbstractC31176DnK.A1C(ViewOnClickListenerC31723DwS.A00(this, 32), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "edit_links_list_fragment";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            CallerContext callerContext = C1L2.A00;
            if (i == 64206) {
                GYL c36707GGc = new C36707GGc(this, 2);
                InterfaceC09390do interfaceC09390do = this.A0B;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                if (C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do)).A1u()) {
                    c36707GGc = AbstractC35092Fd3.A00(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), c36707GGc);
                }
                C1L2.A01(intent, A0r, c36707GGc);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e1, code lost:
    
        if (X.C18U.A06(r6, r5, 36328525606764137L) != false) goto L22;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32287EJz.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if ((r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookPageLinkData) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int A00(com.instagram.profile.bindergroup.AccountLinkModel r8, X.C32287EJz r9) {
        /*
            com.instagram.user.model.User r0 = r9.A05
            if (r0 != 0) goto Le
            java.lang.String r0 = "user"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            X.17P r0 = r0.A03
            java.util.List r6 = r0.Ag2()
            if (r6 == 0) goto L6f
            int r5 = r6.size()
            r4 = 0
        L1b:
            if (r4 >= r5) goto L6f
            java.lang.Object r0 = r6.get(r4)
            X.3l7 r0 = (X.InterfaceC81873l7) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r0.BNW()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.A05
            r7 = 1
            if (r1 != r0) goto L6d
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkData
            if (r0 != 0) goto L34
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookLinkDataV2
            if (r0 == 0) goto L6d
        L34:
            r3 = 1
        L35:
            java.lang.Object r0 = r6.get(r4)
            X.3l7 r0 = (X.InterfaceC81873l7) r0
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r1 = r0.BNW()
            com.instagram.api.schemas.IgUserBioLinkTypeEnum r0 = com.instagram.api.schemas.IgUserBioLinkTypeEnum.A07
            if (r1 != r0) goto L48
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.FacebookPageLinkData
            r2 = 1
            if (r0 != 0) goto L49
        L48:
            r2 = 0
        L49:
            boolean r0 = r8 instanceof com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r6.get(r4)
            X.3l7 r0 = (X.InterfaceC81873l7) r0
            java.lang.String r1 = r0.BNQ()
            r0 = r8
            com.instagram.profile.bindergroup.AccountLinkModel$ExternalLinkDataEnhanced r0 = (com.instagram.profile.bindergroup.AccountLinkModel.ExternalLinkDataEnhanced) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L6b
        L62:
            if (r3 != 0) goto L70
            if (r2 != 0) goto L70
            if (r7 != 0) goto L70
            int r4 = r4 + 1
            goto L1b
        L6b:
            r7 = 0
            goto L62
        L6d:
            r3 = 0
            goto L35
        L6f:
            r4 = -1
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32287EJz.A00(com.instagram.profile.bindergroup.AccountLinkModel, X.EJz):int");
    }

    public final UserSession A04() {
        return AbstractC166987dD.A0r(this.A0B);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0r(this.A0B);
    }

    public static final void A02(android.net.Uri uri, C32287EJz c32287EJz) {
        View A0C = AbstractC25227BEk.A0C(AbstractC31175DnJ.A06(c32287EJz), R.layout.layout_links_fb_dialog);
        C14360o3.A07(A0C);
        C193328hC A0O = AbstractC31175DnJ.A0O(c32287EJz);
        A0O.A0A(2131970190);
        A0O.A09(2131970184);
        DialogInterfaceOnClickListenerC35454FkB.A02(A0O, c32287EJz, 49, 2131970189);
        DialogInterfaceOnClickListenerC35454FkB.A01(A0O, c32287EJz, 50);
        if (uri != null) {
            AbstractC167007dF.A0T(A0C, R.id.profile_link_facebook_image).setUrl(AbstractC81033jX.A00(uri, -1, -1), c32287EJz);
            A0O.A0l(A0C);
        }
        AbstractC166987dD.A1W(A0O);
    }

    public static final void A03(C32287EJz c32287EJz) {
        C208059Im c208059Im;
        String A00;
        C15370ps A1F = AbstractC25225BEi.A1F();
        C9CN c9cn = new C9CN(CallerContext.A01(__redex_internal_original_name), "ig_android_ig_business_asset_fb_profile_discovery", "ig_add_fb_page_link", "add_fb_page_link", "loading");
        InterfaceC09390do interfaceC09390do = c32287EJz.A0B;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C14360o3.A0B(A0r, 0);
        C31590DuI c31590DuI = (C31590DuI) C97N.A00(C97M.A00(A0r)).AuS(c9cn);
        if (c31590DuI != null && (c208059Im = c31590DuI.A00) != null && (A00 = c208059Im.A00(c9cn, A0r)) != null && A00.length() != 0) {
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            C70617Wdv c70617Wdv = new C70617Wdv(1, A1F, c32287EJz);
            C14360o3.A0B(A0r2, 0);
            new C69552VrH(A0r2).A00(c9cn, C97J.A00, c70617Wdv);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1661867646);
        super.onCreate(bundle);
        C08730cb c08730cb = C17060sy.A01;
        InterfaceC09390do interfaceC09390do = this.A0B;
        User A01 = c08730cb.A01(AbstractC166987dD.A0r(interfaceC09390do));
        this.A05 = A01;
        this.A00 = AbstractC35784FrM.A00(AbstractC166987dD.A0r(interfaceC09390do), A01);
        this.A01 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
        this.A02 = new C2Ne(AbstractC166987dD.A0r(interfaceC09390do));
        C6WQ A0i = AbstractC31174DnI.A0i(requireActivity());
        this.A04 = A0i;
        AbstractC31176DnK.A13(requireContext(), A0i);
        EVO.A00(this);
        this.A07 = new C36155FxU(this, 4);
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(interfaceC09390do));
        InterfaceC41501vz interfaceC41501vz = this.A07;
        if (interfaceC41501vz == null) {
            C14360o3.A0F("fbIgLinkChangeListener");
            throw C00O.createAndThrow();
        }
        A00.A01(interfaceC41501vz, C121295eS.class);
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(AbstractC166987dD.A0r(interfaceC09390do));
        if (A0x.getBoolean("should_show_facebook_page_link_dialog", false)) {
            A03(this);
            AbstractC31177DnL.A1N(A0x, "should_show_facebook_page_link_dialog", false);
        }
        C0f9.A09(-362813909, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1529397545);
        C14360o3.A0B(layoutInflater, 0);
        View A07 = AbstractC31175DnJ.A07(layoutInflater, viewGroup, R.layout.layout_links_fragment, false);
        C0f9.A09(751484374, A02);
        return A07;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(948366777);
        C25671My A00 = AbstractC25651Mw.A00(AbstractC166987dD.A0r(this.A0B));
        InterfaceC41501vz interfaceC41501vz = this.A07;
        if (interfaceC41501vz == null) {
            C14360o3.A0F("fbIgLinkChangeListener");
            throw C00O.createAndThrow();
        }
        A00.A02(interfaceC41501vz, C121295eS.class);
        super.onDestroy();
        C0f9.A09(-1044133139, A02);
    }
}
