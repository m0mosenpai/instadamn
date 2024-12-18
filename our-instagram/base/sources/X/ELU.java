package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.nux.activity.SignedOutFragmentActivity;

/* loaded from: classes6.dex */
public final class ELU extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60112ot, CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(ELU.class);
    public static final String __redex_internal_original_name = "FindFacebookFriendsPromptFragment";
    public TextView A00;
    public FWI A01;
    public C35782FrK A02;
    public EVG A03;
    public EVC A04;
    public final InterfaceC41501vz A08 = new C36155FxU(this, 20);
    public final C36706GGb A09 = new C36706GGb(this);
    public final View.OnClickListener A07 = ViewOnClickListenerC35682FpH.A00(this, 2);
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);
    public final boolean A0A = true;
    public final String A05 = "register_flow_find_friends_facebook_prompt";

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            C1L2.A01(intent, AbstractC166987dD.A0o(this.A06), this.A09);
        }
        super.onActivityResult(i, i2, intent);
    }

    public static final void A00(EnumC72412Xd8 enumC72412Xd8, ELU elu) {
        InterfaceC09390do interfaceC09390do = elu.A06;
        if (AbstractC49092Nc.A00(AbstractC166987dD.A0r(interfaceC09390do)).A00(A0B, "ig_android_linking_cache_ig_onboarding_find_fb_friends")) {
            A01(elu);
            return;
        }
        interfaceC09390do.getValue();
        C006802i c006802i = C006802i.A0p;
        C14360o3.A07(c006802i);
        c006802i.markerStart(857802076);
        c006802i.markerAnnotate(857802076, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AbstractC111324zv.A00(4592));
        AbstractC34213F7l.A00().A01(elu, AbstractC166987dD.A0o(interfaceC09390do), new C36783GJg(elu, 8)).A06(enumC72412Xd8.A01(), null);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C35159Ff1.A00(AbstractC166987dD.A0o(this.A06), null, null, null, "find_friends_fb");
        return false;
    }

    public static final void A01(ELU elu) {
        InterfaceC37264GbH A00 = AbstractC34275F9v.A00(elu);
        if (A00 != null) {
            A00.CnE(1);
            return;
        }
        C35782FrK c35782FrK = elu.A02;
        if (c35782FrK == null) {
            C14360o3.A0F("nuxHelper");
            throw C00O.createAndThrow();
        }
        c35782FrK.A01();
    }

    @Override // X.InterfaceC60112ot
    public final boolean CPM() {
        return this.A0A;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        int A02 = C0f9.A02(538908435);
        super.onActivityCreated(bundle);
        try {
            FragmentActivity requireActivity = requireActivity();
            C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.nux.activity.SignedOutFragmentActivity");
            ((SignedOutFragmentActivity) requireActivity).A0Z();
        } catch (ClassCastException unused) {
        }
        C0f9.A09(940600058, A02);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FWI] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(139894342);
        super.onCreate(bundle);
        this.A01 = new Object();
        this.A04 = new EVC(this);
        AbstractC31176DnK.A0Q(this.A06).A01(this.A08, C36072Fw8.class);
        C0f9.A09(1987730881, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (r0 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        if (r0 == false) goto L11;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ELU.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String str;
        int A02 = C0f9.A02(-338016907);
        super.onDestroyView();
        EVG evg = this.A03;
        if (evg == null) {
            str = "bigBlueTokenHelper";
        } else {
            unregisterLifecycleListener(evg);
            this.A00 = null;
            FragmentActivity requireActivity = requireActivity();
            C14360o3.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            IgFragmentActivity igFragmentActivity = (IgFragmentActivity) requireActivity;
            EVC evc = this.A04;
            if (evc == null) {
                str = "nuxCalFragmentLifecycleListener";
            } else {
                igFragmentActivity.unregisterOnActivityResultListener(evc);
                InterfaceC41501vz interfaceC41501vz = this.A08;
                if (interfaceC41501vz != null) {
                    AbstractC31176DnK.A0Q(this.A06).A02(interfaceC41501vz, C36072Fw8.class);
                }
                C0f9.A09(339205178, A02);
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(1187621379);
        FragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            ((SignedOutFragmentActivity) activity).A07 = true;
        }
        super.onPause();
        C0f9.A09(-2029966663, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1373638557);
        FragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            SignedOutFragmentActivity signedOutFragmentActivity = (SignedOutFragmentActivity) activity;
            signedOutFragmentActivity.A07 = false;
            Window window = signedOutFragmentActivity.getWindow();
            if (window != null) {
                window.setSoftInputMode(3);
            }
        }
        super.onResume();
        C0f9.A09(-306571730, A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31175DnJ.A1H(interfaceC56362iU);
    }
}
