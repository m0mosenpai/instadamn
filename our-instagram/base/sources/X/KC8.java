package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.File;

/* loaded from: classes8.dex */
public final class KC8 extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "CutoutStickerCreationFragment";
    public C48591LeT A00;
    public boolean A02;
    public Integer A01 = C05F.A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cutout_sticker_creation";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        boolean z;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("file_path")) != null) {
            File A11 = AbstractC166987dD.A11(string);
            C14360o3.A0B(A11, 0);
            Medium A03 = C8IU.A03(A11, 1, 0);
            Bundle bundle3 = this.mArguments;
            String str2 = null;
            if (bundle3 != null) {
                str = bundle3.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            } else {
                str = null;
            }
            this.A01 = AbstractC46681Kky.A00(str);
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                z = bundle4.getBoolean("from_create_btn");
            } else {
                z = false;
            }
            this.A02 = z;
            if (z || this.A01 == C05F.A1I) {
                AbstractC31172DnG.A1B(requireContext(), view, AbstractC53242c7.A0H(requireContext(), R.attr.igds_color_media_background));
            }
            FragmentActivity requireActivity = requireActivity();
            ViewStub viewStub = (ViewStub) AbstractC166997dE.A0S(view, R.id.cutout_sticker_photo_creation_stub);
            ViewStub viewStub2 = (ViewStub) AbstractC166997dE.A0S(view, R.id.cutout_sticker_loading_overlay_view_stub);
            InterfaceC09390do interfaceC09390do = this.A03;
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            requireContext().getColor(R.color.black_30_transparent);
            C48586LeO c48586LeO = new C48586LeO(requireActivity(), AbstractC166987dD.A0r(interfaceC09390do), this);
            FragmentActivity requireActivity2 = requireActivity();
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                str2 = bundle5.getString("source_media_id");
            }
            C48591LeT c48591LeT = new C48591LeT(requireActivity2, view, viewStub, viewStub2, this, requireActivity, this, A0r, c48586LeO, C05F.A00, this.A01, str2);
            this.A00 = c48591LeT;
            c48591LeT.A04 = new KN7(A03);
            c48591LeT.E2K();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C48591LeT c48591LeT = this.A00;
        if (c48591LeT == null) {
            C14360o3.A0F("photoStickerCreationController");
            throw C00O.createAndThrow();
        }
        return c48591LeT.CJQ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1641574163);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_photo_creation_fragment, viewGroup, false);
        C0f9.A09(737112600, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-333334947);
        super.onDestroyView();
        C48591LeT c48591LeT = this.A00;
        if (c48591LeT == null) {
            C14360o3.A0F("photoStickerCreationController");
            throw C00O.createAndThrow();
        }
        c48591LeT.close();
        C0f9.A09(-28729459, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(498882009);
        super.onResume();
        JQ1.A0Z(this, 8);
        AbstractC145016gM.A03(requireActivity(), null, AbstractC166987dD.A0r(this.A03), false, false);
        C0f9.A09(-1173345681, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-1291322818);
        super.onStop();
        JQ1.A0Z(this, 0);
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A03), false, false);
        C0f9.A09(-816133752, A02);
    }
}
