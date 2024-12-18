package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.gallery.Medium;
import java.util.List;

/* renamed from: X.LeM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48584LeM implements InterfaceC186068Na {
    public final /* synthetic */ KCA A00;

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void Chi(Medium medium, long j, long j2, boolean z) {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void D5Y() {
    }

    @Override // X.InterfaceC186068Na
    public final void D94(Bitmap bitmap, String str) {
    }

    @Override // X.InterfaceC186068Na
    public final void D98(C9ZM c9zm) {
        Object value;
        C3PR c3pr;
        C14360o3.A0B(c9zm, 0);
        KCA kca = this.A00;
        C48591LeT c48591LeT = kca.A01;
        if (c48591LeT == null) {
            C14360o3.A0F("photoStickerCreationController");
            throw C00O.createAndThrow();
        }
        Context requireContext = kca.requireContext();
        MJK mjk = MJK.A00;
        Drawable A00 = AbstractC56412ia.A00(c48591LeT.A0I.getResources(), R.drawable.cutout_sticker_merchandising_assets_checkerboard_grid_video_preview);
        if ((A00 instanceof C3PR) && (c3pr = (C3PR) A00) != null) {
            c3pr.A01(new C48542Ldf(c48591LeT, 1));
        }
        C8OP c8op = c48591LeT.A0S;
        C05A c05a = c8op.A0H;
        do {
            value = c05a.getValue();
        } while (!JQ0.A1X((C8OS) value, C05F.A15, value, c05a));
        Bitmap bitmap = c9zm.A04;
        List list = c9zm.A07;
        if (list == null) {
            list = C16930sl.A00;
        }
        OLe oLe = new OLe(bitmap, list, c9zm.A08);
        C50372MLz c50372MLz = new C50372MLz(29, requireContext, c48591LeT, c9zm, mjk);
        c8op.A03 = AbstractC23641Du.A02(AnonymousClass191.A00, new C50533MSm(c50372MLz, oLe, c8op, null, 6, false), AbstractC141776au.A00(c8op));
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DWm() {
    }

    @Override // X.InterfaceC186068Na
    public final /* synthetic */ void DY4(Bitmap bitmap, String str) {
    }

    public C48584LeM(KCA kca) {
        this.A00 = kca;
    }

    @Override // X.InterfaceC186068Na
    public final void D95() {
        KCA kca = this.A00;
        if (kca.A04) {
            C48591LeT c48591LeT = kca.A01;
            if (c48591LeT == null) {
                C14360o3.A0F("photoStickerCreationController");
                throw C00O.createAndThrow();
            }
            if (!c48591LeT.A0E && AbstractC43592JPx.A0X(c48591LeT.A0S.A0I).A05 != C05F.A0N) {
                c48591LeT.CJQ();
                return;
            } else {
                AbstractC43594JPz.A19(kca, kca.getParentFragmentManager());
                return;
            }
        }
        AbstractC25226BEj.A1Q(kca);
    }

    @Override // X.InterfaceC186068Na
    public final void D97() {
        String str;
        KCA kca = this.A00;
        if (kca.A04) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putBoolean("result_sticker_creation_status", true);
            C06C.A00(A0b, kca, "cutout_sticker_creation_fragment_request_key_create_btn_flow");
            AbstractC25226BEj.A1P(kca);
            return;
        }
        Integer num = kca.A03;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 3) {
                if (intValue != 7 && intValue != 0) {
                    str = "null";
                } else {
                    str = "cutout_gallery_creation_flow";
                }
            } else {
                str = "cutout_video_post_creation_flow";
            }
            AbstractC25231BEo.A0c(kca.requireActivity(), kca.A06).A0G(str, !str.equals("null") ? 1 : 0);
            FragmentActivity activity = kca.getActivity();
            if (activity == null) {
                return;
            }
            Integer num2 = kca.A03;
            if (num2 != null) {
                if (num2 != C05F.A15) {
                    return;
                }
                activity.setResult(-1);
                activity.finish();
                return;
            }
        }
        C14360o3.A0F("entryPoint");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC186068Na
    public final void DEz() {
        C48590LeS c48590LeS = this.A00.A02;
        if (c48590LeS == null) {
            C14360o3.A0F("videoStickerCreationController");
            throw C00O.createAndThrow();
        }
        c48590LeS.A04 = true;
    }
}
