package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Odr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55186Odr {
    public static Handler A00;
    public static final C55186Odr A02 = new Object();
    public static final Handler A01 = AbstractC167007dF.A0J();

    public static final void A01(Context context, Bitmap bitmap, Bitmap bitmap2, UserSession userSession, InterfaceC57942Pmm interfaceC57942Pmm, File file, float f, int i, int i2) {
        AbstractC167007dF.A1K(context, userSession);
        C14360o3.A0B(interfaceC57942Pmm, 8);
        if (bitmap != null) {
            Bitmap A09 = C1NC.A09(bitmap, i, i2, 0, false);
            C14360o3.A07(A09);
            if (bitmap2 != null) {
                Bitmap A092 = C1NC.A09(bitmap2, i, i2, 0, false);
                C14360o3.A07(A092);
                Bitmap createBitmap = Bitmap.createBitmap(A09.getWidth(), A09.getHeight(), Bitmap.Config.ARGB_8888);
                if (createBitmap != null) {
                    Canvas A06 = AbstractC43592JPx.A06(createBitmap);
                    A06.drawBitmap(A09, 0.0f, 0.0f, (Paint) null);
                    A06.drawBitmap(A092, 0.0f, 0.0f, (Paint) null);
                    A09 = createBitmap;
                } else {
                    return;
                }
            }
            A02(context, A09, userSession, interfaceC57942Pmm, file, f, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A02(Context context, Bitmap bitmap, UserSession userSession, InterfaceC57942Pmm interfaceC57942Pmm, File file, float f, int i) {
        Point A022 = ALe.A02(context, userSession, f, i);
        Bitmap A002 = C0fK.A00(bitmap, A022.x, A022.y, true);
        C14360o3.A07(A002);
        bitmap.recycle();
        int width = A002.getWidth();
        int height = A002.getHeight();
        Handler handler = A00;
        if (handler == null) {
            handler = new Handler(C1CG.A00());
            A00 = handler;
        }
        handler.post(new RunnableC57075PTo(A002, userSession, interfaceC57942Pmm, file, width, height));
    }

    public static final void A03(Context context, UserSession userSession, InterfaceC57942Pmm interfaceC57942Pmm, File file, String str, float f, int i, int i2) {
        AbstractC167007dF.A1G(userSession, 1, str);
        C14360o3.A0B(interfaceC57942Pmm, 7);
        Bitmap A002 = A02.A00(str, 1);
        if (A002 != null) {
            Bitmap A09 = C1NC.A09(A002, i, i2, C197098ne.A01(str), false);
            C14360o3.A07(A09);
            A02(context, A09, userSession, interfaceC57942Pmm, file, f, i);
        }
    }

    private final Bitmap A00(String str, int i) {
        Bitmap bitmap;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            bitmap = BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            bitmap = null;
        }
        if (bitmap == null && i == 1) {
            return A00(str, 2);
        }
        return bitmap;
    }
}
