package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import com.instagram.model.direct.DirectThreadKey;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.ScreenCapturerAndroid;

/* loaded from: classes6.dex */
public final class EKW extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "DirectBroadcastChatRepliesDiscoveryBottomsheetFragment";
    public Capabilities A00;
    public C142846ck A01;
    public GXN A02;
    public DirectThreadKey A03;
    public String A04;
    public boolean A05;
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "broadcast_channel_replies_discovery_bottomsheet";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        this.A05 = true;
        AbstractC25231BEo.A16(this);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x009e, code lost:
    
        if (X.C14360o3.A0K(r6.A08, X.AbstractC125795mU.A00()) == false) goto L17;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r111, android.os.Bundle r112) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EKW.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final ImmutableList A00() {
        ImmutableList of = ImmutableList.of((Object) new DirectCountBasedReaction("❤️️", CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, false), (Object) new DirectCountBasedReaction("🖤", ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, false), (Object) new DirectCountBasedReaction("🔥️", 51, false));
        C14360o3.A07(of);
        return of;
    }

    private final void A01(boolean z) {
        if (!C14360o3.A0K(this.A04, AbstractC111324zv.A00(875))) {
            UserSession A0r = AbstractC166987dD.A0r(this.A06);
            DirectThreadKey directThreadKey = this.A03;
            if (directThreadKey != null) {
                F1t.A00(A0r, directThreadKey, z);
            } else {
                C14360o3.A0F("directThreadKey");
                throw C00O.createAndThrow();
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(323111409);
        super.onCreate(bundle);
        this.A01 = AbstractC31176DnK.A0V(this.A06);
        C0f9.A09(1410713157, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(121627357);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.broadcast_channel_replies_discovery_bottomsheet_fragment, false);
        C0f9.A09(-1993245969, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-358675746);
        if (this.A05) {
            A01(false);
            AbstractC2056298m.A00(AbstractC166987dD.A0r(this.A06)).A07(false);
        }
        super.onDestroy();
        C0f9.A09(-876327496, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-145310033);
        A01(true);
        super.onPause();
        C0f9.A09(-1414519983, A02);
    }
}
