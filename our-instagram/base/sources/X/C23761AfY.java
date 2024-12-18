package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.AfY, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23761AfY implements BDL {
    public final /* synthetic */ C188888Ye A00;

    public C23761AfY(C188888Ye c188888Ye) {
        this.A00 = c188888Ye;
    }

    @Override // X.BDL
    public final /* bridge */ /* synthetic */ boolean CXa(Object obj) {
        return C14360o3.A0K(this.A00.A01, obj);
    }

    @Override // X.BDL
    public final void Dt0(C82183lf c82183lf) {
        String str;
        if (c82183lf != null) {
            str = c82183lf.A02;
        } else {
            str = null;
        }
        AbstractC12120kG.A0F("GalleryPreviewButtonController", AnonymousClass001.A0R("Draft cover thumbnail path load failed in GalleryPreviewButtonController#onStoryDraftSaved. info: ", str), null);
    }

    @Override // X.BDL
    public final /* bridge */ /* synthetic */ void Dt3(Bitmap bitmap, Object obj) {
        C188888Ye c188888Ye = this.A00;
        c188888Ye.storyDraftThumbnailLoaderListener = null;
        C188918Yh c188918Yh = c188888Ye.A0B;
        C193568hb c193568hb = new C193568hb(c188888Ye.A06, bitmap, c188888Ye.A03, c188888Ye.A04, c188888Ye.A05, 0, c188888Ye.A0F);
        c188918Yh.A01 = c193568hb;
        InterfaceC56392iX interfaceC56392iX = c188918Yh.A02;
        interfaceC56392iX.setVisibility(0);
        ((ImageView) interfaceC56392iX.getView()).setImageDrawable(c193568hb);
        C55982hj c55982hj = (C55982hj) AbstractC166987dD.A17(c188918Yh.A04);
        c55982hj.A09(A43.A01);
        c55982hj.A06 = false;
        c55982hj.A08(0.0d, true);
        c55982hj.A06(0.5d);
    }
}
