package X;

import android.content.res.AssetManager;

/* renamed from: X.SuA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63816SuA implements InterfaceC65477Tku {
    public final AssetManager A00;
    public final InterfaceC65323Ti3 A01;

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ boolean CKb(Object obj) {
        android.net.Uri uri = (android.net.Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public C63816SuA(AssetManager assetManager, InterfaceC65323Ti3 interfaceC65323Ti3) {
        this.A00 = assetManager;
        this.A01 = interfaceC65323Ti3;
    }

    @Override // X.InterfaceC65477Tku
    public final /* bridge */ /* synthetic */ SFV AEj(C63729Ssj c63729Ssj, Object obj, int i, int i2) {
        return new SFV(new C63726Ssg(obj), this.A01.AEe(this.A00, obj.toString().substring(22)));
    }
}
