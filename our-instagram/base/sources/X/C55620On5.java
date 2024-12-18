package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.provider.MediaStore;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.util.gallery.ImageManager$ImageListParam;
import fxcache.model.FxCalAccount;

/* renamed from: X.On5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55620On5 implements CallerContextable {
    public static final String __redex_internal_original_name = "AvatarBitmapUtil";

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, com.instagram.util.gallery.ImageManager$ImageListParam] */
    public static Bitmap A00(Context context, android.net.Uri uri, UserSession userSession, int i) {
        Integer num;
        int i2;
        BCF A03;
        ImageManager$ImageListParam imageManager$ImageListParam;
        String str;
        if (i == 0) {
            FxCalAccount A01 = AbstractC49092Nc.A00(userSession).A01(CallerContext.A00(C55620On5.class), "ig_android_growth_fx_access_fb_ig_avatar");
            if (A01 == null || (str = A01.A08) == null) {
                return null;
            }
            C26371Ps A0U = AbstractC50522MSa.A0U(userSession);
            A0U.A02 = str;
            C1QW A00 = A0U.A00();
            C1QX c1qx = new C1QX();
            c1qx.A04 = EnumC23341Bw.Image;
            c1qx.A03 = C1Ef.OnScreen;
            c1qx.A0A = "Avatar";
            InterfaceC26481Qd A002 = C23311Bt.A00().A01(new C26461Qb(A00, c1qx.A00())).A00();
            try {
                A002.getClass();
                Bitmap decodeStream = BitmapFactory.decodeStream(A002.AjT());
                A002.close();
                return decodeStream;
            } catch (Throwable th) {
                if (A002 != null) {
                    try {
                        A002.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }
        if (i == 1) {
            ContentResolver contentResolver = context.getContentResolver();
            uri.getClass();
            android.net.Uri uri2 = C197098ne.A00;
            C14360o3.A0B(contentResolver, 0);
            String obj = uri.toString();
            if (obj == null) {
                obj = "";
            }
            String str2 = null;
            if (AbstractC002300n.A0h(obj, "content://drm", false)) {
                Integer num2 = C05F.A0N;
                ?? obj2 = new Object();
                obj2.A03 = num2;
                obj2.A00 = 2;
                obj2.A01 = 1;
                obj2.A04 = null;
                imageManager$ImageListParam = obj2;
            } else {
                if (AbstractC002300n.A0h(obj, "content://media/external/video", false)) {
                    num = C05F.A0C;
                    i2 = 4;
                } else {
                    if (!obj.startsWith(AbstractC166987dD.A19(MediaStore.Images.Media.EXTERNAL_CONTENT_URI)) && !obj.startsWith(AbstractC166987dD.A19(MediaStore.Images.Media.INTERNAL_CONTENT_URI))) {
                        ?? obj3 = new Object();
                        obj3.A02 = uri;
                        A03 = C197098ne.A03(contentResolver, obj3);
                        InterfaceC197178nn BGe = A03.BGe(uri);
                        System.gc();
                        BGe.getClass();
                        Bitmap AWj = BGe.AWj(((int) (Runtime.getRuntime().maxMemory() * 0.37d)) / 4, BGe.AwT(), false);
                        AWj.getClass();
                        AWj.getWidth();
                        AWj.getHeight();
                        int min = Math.min(AWj.getWidth(), AWj.getHeight());
                        Matrix matrix = new Matrix();
                        AWj.getWidth();
                        Rect rect = new Rect(0, 0, min, min);
                        int max = Math.max(0, rect.width());
                        float f = max;
                        RectF rectF = new RectF(0.0f, 0.0f, f, f);
                        matrix.mapRect(rectF);
                        rectF.width();
                        rectF.height();
                        System.gc();
                        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
                        AbstractC43592JPx.A06(createBitmap).drawBitmap(AWj, rect, new Rect(0, 0, max, max), (Paint) null);
                        AWj.recycle();
                        return createBitmap;
                    }
                    str2 = uri.getQueryParameter("bucketId");
                    num = C05F.A0N;
                    i2 = 1;
                }
                ?? obj4 = new Object();
                obj4.A03 = num;
                obj4.A00 = i2;
                obj4.A01 = 1;
                obj4.A04 = str2;
                imageManager$ImageListParam = obj4;
            }
            A03 = C197098ne.A03(contentResolver, imageManager$ImageListParam);
            InterfaceC197178nn BGe2 = A03.BGe(uri);
            System.gc();
            BGe2.getClass();
            Bitmap AWj2 = BGe2.AWj(((int) (Runtime.getRuntime().maxMemory() * 0.37d)) / 4, BGe2.AwT(), false);
            AWj2.getClass();
            AWj2.getWidth();
            AWj2.getHeight();
            int min2 = Math.min(AWj2.getWidth(), AWj2.getHeight());
            Matrix matrix2 = new Matrix();
            AWj2.getWidth();
            Rect rect2 = new Rect(0, 0, min2, min2);
            int max2 = Math.max(0, rect2.width());
            float f2 = max2;
            RectF rectF2 = new RectF(0.0f, 0.0f, f2, f2);
            matrix2.mapRect(rectF2);
            rectF2.width();
            rectF2.height();
            System.gc();
            Bitmap createBitmap2 = Bitmap.createBitmap(max2, max2, Bitmap.Config.ARGB_8888);
            AbstractC43592JPx.A06(createBitmap2).drawBitmap(AWj2, rect2, new Rect(0, 0, max2, max2), (Paint) null);
            AWj2.recycle();
            return createBitmap2;
        }
        throw AbstractC166987dD.A1D("Avatar source type not found");
    }
}
