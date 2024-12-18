package X;

import com.instagram.discovery.mediamap.fragment.MapBottomSheetController;
import com.instagram.model.reels.Reel;

/* renamed from: X.Wjk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70891Wjk implements InterfaceC71924XAi {
    public final /* synthetic */ C70893Wjm A00;

    public C70891Wjk(C70893Wjm c70893Wjm) {
        this.A00 = c70893Wjm;
    }

    @Override // X.InterfaceC71924XAi
    public final void D4a(Reel reel, C3Ow c3Ow) {
        C14360o3.A0B(c3Ow, 1);
        C70893Wjm c70893Wjm = this.A00;
        MapBottomSheetController mapBottomSheetController = c70893Wjm.A03.A0A;
        if (((float) mapBottomSheetController.mBottomSheetBehavior.A0F.A01) == mapBottomSheetController.A01()) {
            MapBottomSheetController mapBottomSheetController2 = c70893Wjm.A02.A0A;
            mapBottomSheetController2.mBottomSheetBehavior.A0R(true, mapBottomSheetController2.A02());
        } else {
            c70893Wjm.A01.A07(reel, C3G2.A1N, c3Ow);
        }
    }
}
