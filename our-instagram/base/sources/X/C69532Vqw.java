package X;

import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import com.instagram.model.reels.Reel;

/* renamed from: X.Vqw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69532Vqw {
    public final /* synthetic */ C70894Wjn A00;

    public C69532Vqw(C70894Wjn c70894Wjn) {
        this.A00 = c70894Wjn;
    }

    public final void A00(Reel reel, C3Ow c3Ow) {
        C70894Wjn c70894Wjn = this.A00;
        MapBottomSheetController mapBottomSheetController = c70894Wjn.A0D.A0A;
        if (((float) mapBottomSheetController.mBottomSheetBehavior.A0F.A01) == mapBottomSheetController.A01()) {
            MapBottomSheetController mapBottomSheetController2 = c70894Wjn.A0C.A0A;
            mapBottomSheetController2.mBottomSheetBehavior.A0R(true, mapBottomSheetController2.A02());
        } else {
            c70894Wjn.A0B.A07(reel, C3G2.A1N, c3Ow);
        }
    }
}
