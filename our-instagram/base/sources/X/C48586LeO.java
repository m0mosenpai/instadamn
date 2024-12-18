package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

/* renamed from: X.LeO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48586LeO implements InterfaceC186068Na {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final /* synthetic */ KC8 A02;

    public C48586LeO(FragmentActivity fragmentActivity, UserSession userSession, KC8 kc8) {
        C14360o3.A0B(userSession, 3);
        this.A02 = kc8;
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void Chi(Medium medium, long j, long j2, boolean z) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D5Y() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D97() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D98(C9ZM c9zm) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DEz() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DWm() {
    }

    @Override // X.InterfaceC186068Na
    public final void DY4(Bitmap bitmap, String str) {
        C140966Yy A0r;
        String str2;
        C14360o3.A0B(str, 1);
        KC8 kc8 = this.A02;
        switch (kc8.A01.intValue()) {
            case 0:
            case 7:
                A0r = AbstractC25225BEi.A0r(kc8.requireActivity(), this.A01);
                str2 = "cutout_gallery_creation_flow";
                break;
            case 1:
            case 5:
            case 6:
            case 9:
            case 10:
                return;
            case 2:
                A0r = AbstractC25225BEi.A0r(kc8.requireActivity(), this.A01);
                str2 = "cutout_photo_post_creation_flow";
                break;
            case 3:
            case 4:
                A0r = AbstractC25225BEi.A0r(kc8.requireActivity(), this.A01);
                str2 = "cutout_video_post_creation_flow";
                break;
            case 8:
                if (kc8.A02) {
                    Bundle A0b = AbstractC166987dD.A0b();
                    A0b.putBoolean("result_sticker_creation_status", true);
                    C06C.A00(A0b, kc8, "cutout_sticker_creation_fragment_request_key_create_btn_flow");
                    AbstractC25226BEj.A1P(kc8);
                    return;
                }
                return;
            default:
                throw B4Z.A00();
        }
        A0r.A0G(str2, 1);
    }

    @Override // X.InterfaceC186068Na
    public final void D94(Bitmap bitmap, String str) {
        KC8 kc8 = this.A02;
        boolean z = kc8.A02;
        Bundle A0b = AbstractC166987dD.A0b();
        boolean A1W = AbstractC167007dF.A1W(str);
        if (z) {
            A0b.putBoolean("result_sticker_creation_status", A1W);
            C06C.A00(A0b, kc8, "cutout_sticker_creation_fragment_request_key_create_btn_flow");
            AbstractC25226BEj.A1P(kc8);
        } else {
            A0b.putBoolean("result_sticker_creation_status", A1W);
            C06C.A00(A0b, kc8, "cutout_sticker_creation_fragment_request_key");
            AbstractC25225BEi.A0r(kc8.requireActivity(), this.A01).A06();
        }
    }

    @Override // X.InterfaceC186068Na
    public final void D95() {
        KC8 kc8 = this.A02;
        if (kc8.A02) {
            C48591LeT c48591LeT = kc8.A00;
            if (c48591LeT == null) {
                C14360o3.A0F("photoStickerCreationController");
                throw C00O.createAndThrow();
            }
            if (!c48591LeT.A0E && AbstractC43592JPx.A0X(c48591LeT.A0S.A0I).A05 != C05F.A0N) {
                c48591LeT.CJQ();
                return;
            } else {
                AbstractC43594JPz.A19(kc8, kc8.getParentFragmentManager());
                return;
            }
        }
        AbstractC25225BEi.A0r(kc8.requireActivity(), this.A01).A06();
    }
}
