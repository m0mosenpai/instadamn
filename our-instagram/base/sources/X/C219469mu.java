package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.io.Serializable;

/* renamed from: X.9mu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219469mu extends AbstractC52130N5e implements InterfaceC60442pS {
    public static final String __redex_internal_original_name = "ClipsTimelineTemplateLandingPageFragment";
    public CreationActionBar A00;
    public C56038OuA A01;
    public IgdsMediaButton A02;
    public IgdsMediaButton A03;
    public final C24H A04;
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "clips_template_landing_page";
    }

    @Override // X.InterfaceC60442pS
    public final boolean isOrganicEligible() {
        return false;
    }

    @Override // X.InterfaceC60442pS
    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0075, code lost:
    
        if (r6.CcN() != true) goto L11;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r4 = 0
            X.C14360o3.A0B(r12, r4)
            super.onViewCreated(r12, r13)
            r0 = 2131430278(0x7f0b0b86, float:1.8482252E38)
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r0 = (com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar) r0
            r11.A00 = r0
            android.content.Context r10 = X.AbstractC166997dE.A0L(r12)
            r5 = 0
            com.instagram.igds.components.mediabutton.IgdsMediaButton r2 = X.AbstractC186988Qr.A00(r10, r5)
            X.6r4 r0 = X.EnumC151036r4.A0D
            r2.setButtonStyle(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131955556(0x7f130f64, float:1.9547643E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            r2.setLabel(r0)
            r0 = 46
            X.ViewOnClickListenerC23249ASk.A00(r2, r0, r11)
            r11.A02 = r2
            com.instagram.common.session.UserSession r3 = r11.A0N()
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322108925618177(0x810ac400012801, double:3.033586169729588E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            java.lang.String r9 = "addClipsButton"
            java.lang.String r8 = "creationActionBar"
            r7 = 1
            if (r0 == 0) goto Lae
            X.1DW r3 = X.C1DX.A03
            com.instagram.common.session.UserSession r2 = r11.A0N()
            X.89P r0 = r11.A0O()
            com.instagram.clips.template.creation.model.ClipsTemplateModel r0 = r0.A05
            if (r0 == 0) goto Lac
            java.lang.String r1 = r0.A03
        L5b:
            java.lang.String r0 = "ClipsTimelineTemplateLandingPageFragment"
            X.1qM r6 = r3.A01(r2, r0, r1)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r5 = X.AbstractC186988Qr.A00(r10, r5)
            X.0do r0 = r11.A05
            r0.getValue()
            android.content.Context r1 = X.AbstractC166997dE.A0L(r5)
            if (r6 == 0) goto L77
            boolean r0 = r6.CcN()
            r2 = 1
            if (r0 == r7) goto L78
        L77:
            r2 = 0
        L78:
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131955557(0x7f130f65, float:1.9547645E38)
            if (r2 == 0) goto L84
            r0 = 2131972790(0x7f1352b6, float:1.9582598E38)
        L84:
            java.lang.String r0 = r1.getString(r0)
            r5.setLabel(r0)
            r3 = 12
            X.OkE r0 = new X.OkE
            r0.<init>(r3, r6, r5, r11)
            X.C0fQ.A00(r0, r5)
            r11.A03 = r5
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r2 = r11.A00
            if (r2 == 0) goto Lc2
            X.9BB r1 = new X.9BB
            r1.<init>(r4, r3, r4)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r11.A02
            if (r0 == 0) goto Lc6
            com.instagram.igds.components.mediabutton.IgdsMediaButton[] r0 = new com.instagram.igds.components.mediabutton.IgdsMediaButton[]{r5, r0}
        La8:
            r2.A0E(r1, r0)
            return
        Lac:
            r1 = r5
            goto L5b
        Lae:
            com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar r2 = r11.A00
            if (r2 == 0) goto Lc2
            r0 = 12
            X.9BB r1 = new X.9BB
            r1.<init>(r4, r0, r4)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r11.A02
            if (r0 == 0) goto Lc6
            com.instagram.igds.components.mediabutton.IgdsMediaButton[] r0 = new com.instagram.igds.components.mediabutton.IgdsMediaButton[]{r0}
            goto La8
        Lc2:
            X.C14360o3.A0F(r8)
            goto Lc9
        Lc6:
            X.C14360o3.A0F(r9)
        Lc9:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219469mu.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A01 == null) {
            C14360o3.A0F("deleteTrayController");
            throw C00O.createAndThrow();
        }
        return false;
    }

    public C219469mu() {
        C24H c24h;
        C25038B6l c25038B6l = C25038B6l.A00;
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57521Pfv(new C57521Pfv(this, 14), 15));
        this.A05 = new C60842q8(new C57521Pfv(A00, 16), c25038B6l, new C57256Pbe(19, null, A00), new C0YZ(C8PF.class));
        Bundle bundle = this.mArguments;
        Serializable serializable = bundle != null ? bundle.getSerializable("ARG_CLIPS_TEMPLATE_BROWSER_ENTRY_POINT") : null;
        this.A04 = (!(serializable instanceof C24H) || (c24h = (C24H) serializable) == null) ? C24H.UNKNOWN : c24h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.OuA, X.2pj] */
    @Override // X.AbstractC52130N5e, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1187662971);
        super.onCreate(bundle);
        ?? obj = new Object();
        this.A01 = obj;
        registerLifecycleListener(obj);
        C0f9.A09(-715150070, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A02 = C0f9.A02(156910613);
        C14360o3.A0B(layoutInflater, 0);
        if (this.A04 == C24H.UNKNOWN) {
            str = "TEMPLATE_LANDING_PAGE_ENTRY_POINT_REELS_VIEWER";
        } else {
            str = "TEMPLATE_LANDING_PAGE_ENTRY_POINT_TEMPLATE_BROWSER";
        }
        C22C A01 = AnonymousClass229.A01(A0N());
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((C22F) A01).A01, "ig_camera_template_landing_page_impression");
        C22M c22m = ((C22F) A01).A04;
        String str2 = c22m.A0L;
        EnumC50631MWs enumC50631MWs = c22m.A0C;
        if (A0f.isSampled() && enumC50631MWs != null && str2 != null) {
            A0f.A8R(EnumC114925Hg.CLIPS, "camera_destination");
            AbstractC166987dD.A1S(A0f, str2);
            A0f.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.AAP("clips_template_landing_page_entry_point", str);
            AbstractC167017dG.A1B(A0f);
            A0f.A8R(enumC50631MWs, "surface");
            AbstractC166997dE.A1N(A0f, "event_type", 2);
            AbstractC167017dG.A1C(A0f);
        }
        View inflate = layoutInflater.inflate(R.layout.clips_timeline_template_landing_page_fragment, viewGroup, false);
        C0f9.A09(-1472299001, A02);
        return inflate;
    }
}
