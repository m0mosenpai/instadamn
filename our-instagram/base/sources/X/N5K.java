package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* loaded from: classes9.dex */
public final class N5K extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FeedDefaultPrivacyBottomSheetFragment";
    public Context A00;
    public InterfaceC57944Pmo A01;
    public EnumC130125uI A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public Boolean A06;
    public final InterfaceC09390do A07;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "feed_default_privacy_bottom_sheet";
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160 A[LOOP:0: B:51:0x015a->B:53:0x0160, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N5K.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final boolean A00(N5K n5k) {
        String str = n5k.A05;
        if ((str == null || !str.equals("video_feed_share_button")) && ((str == null || !str.equals("share_later_share_button")) && (str == null || !str.equals("share_sheet_share_button")))) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    public N5K() {
        Boolean A0a = AbstractC166997dE.A0a();
        this.A06 = A0a;
        this.A03 = A0a;
        this.A02 = EnumC130125uI.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        this.A07 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(getString(2131975623));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(33750612);
        super.onCreate(bundle);
        this.A00 = requireContext();
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        } else {
            str = null;
        }
        this.A05 = str;
        C0f9.A09(-1920904574, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(159642505);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_privacy_education_sheet, viewGroup, false);
        C0f9.A09(1205638720, A02);
        return inflate;
    }
}
