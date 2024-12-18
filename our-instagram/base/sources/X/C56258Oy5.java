package X;

import android.graphics.Bitmap;

/* renamed from: X.Oy5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56258Oy5 implements BDL {
    public final /* synthetic */ AbstractC51356MmH A00;

    public C56258Oy5(AbstractC51356MmH abstractC51356MmH) {
        this.A00 = abstractC51356MmH;
    }

    @Override // X.BDL
    public final /* bridge */ /* synthetic */ boolean CXa(Object obj) {
        return C14360o3.A0K(this.A00.A00, obj);
    }

    @Override // X.BDL
    public final void Dt0(C82183lf c82183lf) {
        String str;
        if (c82183lf != null) {
            str = c82183lf.A02;
        } else {
            str = null;
        }
        AbstractC12120kG.A06(AbstractC51174MjI.__redex_internal_original_name, AnonymousClass001.A0R("Thumbnail load failed in ClipsDraftsSeeAllAdapter#bindThumbnail. Reason: ", str), null);
    }

    @Override // X.BDL
    public final /* bridge */ /* synthetic */ void Dt3(Bitmap bitmap, Object obj) {
        this.A00.A03.setImageBitmap(bitmap);
    }
}
