package X;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;

/* renamed from: X.St4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63749St4 implements InterfaceC65470Tkn {
    public final InterfaceC65571Tn4 A00 = new Object();

    @Override // X.InterfaceC65470Tkn
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C63791Stl ANo(ImageDecoder.Source source, C63729Ssj c63729Ssj, int i, int i2) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C63449SkS(c63729Ssj, i, i2));
        if (android.util.Log.isLoggable("BitmapImageDecoder", 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new C63791Stl(decodeBitmap, this.A00);
    }

    @Override // X.InterfaceC65470Tkn
    public final /* bridge */ /* synthetic */ boolean CKc(C63729Ssj c63729Ssj, Object obj) {
        return true;
    }
}
