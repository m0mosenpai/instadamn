package X;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class KCA extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "CutoutVideoStickerCreationFragment";
    public C48215LVp A00;
    public C48591LeT A01;
    public C48590LeS A02;
    public Integer A03;
    public boolean A04;
    public final InterfaceC09390do A05 = AbstractC25225BEi.A0a(new MHQ(this, 28), new MHQ(this, 27), new B61(13, null, this), AbstractC25225BEi.A1D(C44447JlF.class));
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "cutout_video_sticker_creation";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        boolean z;
        C55U c55u;
        int i;
        int i2;
        int i3;
        int i4;
        Integer A0i;
        Integer A0i2;
        Integer A0i3;
        Integer A0i4;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("args_file_path");
        } else {
            str = null;
        }
        requireContext().getColor(R.color.black_30_transparent);
        C48585LeN c48585LeN = new C48585LeN(this);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("args_entry_point");
        } else {
            str2 = null;
        }
        this.A03 = AbstractC46681Kky.A00(str2);
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            z = bundle4.getBoolean("from_create_btn");
        } else {
            z = false;
        }
        this.A04 = z;
        if (z) {
            AbstractC31172DnG.A1B(requireContext(), view, AbstractC53242c7.A0H(requireContext(), R.attr.igds_color_media_background));
        }
        ViewStub viewStub = (ViewStub) AbstractC166997dE.A0S(view, R.id.cutout_sticker_photo_creation_stub);
        ViewStub viewStub2 = (ViewStub) AbstractC166997dE.A0S(view, R.id.cutout_sticker_loading_overlay_view_stub);
        InterfaceC09390do interfaceC09390do = this.A06;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C48584LeM c48584LeM = new C48584LeM(this);
        FragmentActivity requireActivity = requireActivity();
        Integer num = C05F.A01;
        Integer num2 = this.A03;
        String str3 = "entryPoint";
        if (num2 != null) {
            this.A01 = new C48591LeT(requireActivity, view, viewStub, viewStub2, this, this, this, A0r, c48584LeM, num, num2, null);
            UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
            ViewStub viewStub3 = (ViewStub) AbstractC166997dE.A0S(view, R.id.cutout_sticker_video_creation_stub);
            Integer num3 = this.A03;
            if (num3 != null) {
                int intValue = num3.intValue();
                if (intValue != 6) {
                    if (intValue != 5 && intValue != 3) {
                        c55u = null;
                    } else {
                        c55u = C81U.A00;
                    }
                } else {
                    c55u = C208509Kk.A00;
                }
                this.A02 = new C48590LeS(view, viewStub3, this, this, A0r2, c55u, c48585LeN, num3);
                ArrayList A1E = AbstractC166987dD.A1E();
                C48591LeT c48591LeT = this.A01;
                if (c48591LeT == null) {
                    str3 = "photoStickerCreationController";
                } else {
                    A1E.add(c48591LeT);
                    UserSession A0r3 = AbstractC166987dD.A0r(interfaceC09390do);
                    C48590LeS c48590LeS = this.A02;
                    if (c48590LeS == null) {
                        str3 = "videoStickerCreationController";
                    } else {
                        this.A00 = new C48215LVp(A0r3, new C48583LeL(), c48590LeS, A1E);
                        AbstractC18560vj.A03(AbstractC25229BEm.A0a(this), new C15340po(new B5g(this, null, 14), ((C44447JlF) this.A05.getValue()).A01));
                        if (str != null) {
                            Medium A03 = C8IU.A03(AbstractC166987dD.A11(str), 3, 0);
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            try {
                                try {
                                    mediaMetadataRetriever.setDataSource(A03.A0X);
                                    String extractMetadata = mediaMetadataRetriever.extractMetadata(18);
                                    if (extractMetadata != null && (A0i4 = AbstractC003100w.A0i(extractMetadata)) != null) {
                                        i = A0i4.intValue();
                                    } else {
                                        i = 0;
                                    }
                                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                    if (extractMetadata2 != null && (A0i3 = AbstractC003100w.A0i(extractMetadata2)) != null) {
                                        i2 = A0i3.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    A03.A0B = i;
                                    A03.A04 = i2;
                                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(9);
                                    if (extractMetadata3 != null && (A0i2 = AbstractC003100w.A0i(extractMetadata3)) != null) {
                                        i3 = A0i2.intValue();
                                    } else {
                                        i3 = 0;
                                    }
                                    A03.A03 = i3;
                                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(24);
                                    if (extractMetadata4 != null && (A0i = AbstractC003100w.A0i(extractMetadata4)) != null) {
                                        i4 = A0i.intValue();
                                    } else {
                                        i4 = 0;
                                    }
                                    A03.A07 = i4;
                                    C48590LeS c48590LeS2 = this.A02;
                                    if (c48590LeS2 == null) {
                                        C14360o3.A0F("videoStickerCreationController");
                                        throw C00O.createAndThrow();
                                    }
                                    c48590LeS2.A00 = A03;
                                    c48590LeS2.E2K();
                                    return;
                                } catch (Exception e) {
                                    AbstractC12120kG.A07(__redex_internal_original_name, AbstractC167017dG.A0n(e, "setDataSource exception=", AbstractC166987dD.A1C()), null);
                                    throw e;
                                }
                            } finally {
                                mediaMetadataRetriever.release();
                            }
                        }
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str3);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        C48215LVp c48215LVp = this.A00;
        if (c48215LVp == null) {
            C14360o3.A0F("assetPickerModeController");
            throw C00O.createAndThrow();
        }
        return c48215LVp.A03();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1846753016);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_video_creation_fragment, viewGroup, false);
        C0f9.A09(332340948, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-1496630595);
        super.onDestroyView();
        C0f9.A09(-451496787, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-597886879);
        super.onResume();
        JQ1.A0Z(this, 8);
        AbstractC145016gM.A03(requireActivity(), null, AbstractC166987dD.A0r(this.A06), false, false);
        C0f9.A09(-1440855888, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(591432048);
        super.onStop();
        JQ1.A0Z(this, 0);
        AbstractC145016gM.A02(requireActivity(), this, AbstractC166987dD.A0r(this.A06), false, false);
        C0f9.A09(470018955, A02);
    }
}
