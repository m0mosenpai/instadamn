package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.WYi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70477WYi implements XC9 {
    public static final C1VS A02 = new C70416WUu(0);
    public int A00;
    public boolean A01;

    @Override // X.XC9
    public final C1VO ChT(Context context, android.net.Uri uri) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.A01 && (i = this.A00) > 0) {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(uri.getPath(), options);
            int i2 = options.outHeight;
            int i3 = options.outWidth;
            int i4 = 1;
            if (i2 > i || i3 > i) {
                int i5 = i2 / 2;
                int i6 = i3 / 2;
                while (i5 / i4 >= i && i6 / i4 >= i) {
                    i4 *= 2;
                }
            }
            options.inSampleSize = i4;
            options.inJustDecodeBounds = false;
        }
        return C1VO.A00(C1VO.A05, A02, BitmapFactory.decodeFile(uri.getPath(), options));
    }

    public C70477WYi(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    @Override // X.XC9
    public final C1VO ChU(Context context, android.net.Uri uri, CallerContext callerContext) {
        return ChT(context, uri);
    }

    public C70477WYi() {
    }
}
