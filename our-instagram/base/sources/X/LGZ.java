package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LGZ {
    public Bitmap A00;
    public final Context A01;
    public final AbstractC59962oe A02;
    public final UserSession A03;
    public final C40121td A04;

    public static String A00(LGZ lgz) {
        ArrayList A05 = C25A.A00(lgz.A03).A05(C05F.A0u);
        Collections.sort(A05, new C50040M7d(lgz, 0));
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            String str = AbstractC43592JPx.A0l(it).A33;
            if (!TextUtils.isEmpty(str)) {
                File A11 = AbstractC166987dD.A11(str);
                if (A11.exists() && A11.canRead()) {
                    return str;
                }
            }
        }
        return null;
    }

    public final Bitmap A01(EnumC46219Kcv enumC46219Kcv) {
        this.A00.getClass();
        Drawable drawable = this.A01.getDrawable(enumC46219Kcv.A02);
        float height = this.A00.getHeight();
        float f = enumC46219Kcv.A00;
        int intrinsicWidth = (int) ((drawable.getIntrinsicWidth() * r8) / drawable.getIntrinsicHeight());
        float height2 = this.A00.getHeight();
        float f2 = enumC46219Kcv.A01;
        int max = (int) (height2 * Math.max(f2 + f, 1.0f));
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(this.A00.getWidth(), intrinsicWidth), max, Bitmap.Config.ARGB_8888);
        Canvas A06 = AbstractC43592JPx.A06(createBitmap);
        Path A0T = AbstractC166987dD.A0T();
        A0T.addOval(new RectF(0.0f, 0.0f, this.A00.getWidth(), this.A00.getHeight()), Path.Direction.CW);
        Paint A0P = AbstractC166997dE.A0P();
        A06.save();
        A06.translate((r12 - this.A00.getWidth()) / 2.0f, 0.0f);
        Bitmap bitmap = this.A00;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        A0P.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        A06.drawPath(A0T, A0P);
        A06.restore();
        A06.save();
        A06.translate((r12 - intrinsicWidth) / 2.0f, this.A00.getHeight() * f2);
        A0P.setShader(null);
        Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
        bitmap2.getClass();
        A06.drawBitmap(bitmap2, (Rect) null, new RectF(0.0f, 0.0f, intrinsicWidth, (int) (height * f)), A0P);
        A06.restore();
        return createBitmap;
    }

    public final boolean A02() {
        if (this.A00 != null) {
            return true;
        }
        InterfaceC223316m BW9 = AbstractC166987dD.A10(this.A03).A03.BW9();
        if ((BW9 != null && !AbstractC81033jX.A03(BW9.Bt2())) || !TextUtils.isEmpty(A00(this))) {
            return true;
        }
        return false;
    }

    public LGZ(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A01 = context;
        this.A02 = abstractC59962oe;
        this.A03 = userSession;
        this.A04 = C40121td.A00(context, userSession);
    }
}
