package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.List;

/* renamed from: X.8LK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8LK implements C82M {
    public final RectF A00;
    public final UserSession A01;
    public final InterfaceC183698Cu A02;
    public final InterfaceC1812882f A03;
    public final Context A04;
    public final List A05;

    public C8LK(Context context, UserSession userSession, InterfaceC183698Cu interfaceC183698Cu, InterfaceC1812882f interfaceC1812882f, List list) {
        C14360o3.A0B(userSession, 5);
        this.A04 = context;
        this.A02 = interfaceC183698Cu;
        this.A05 = list;
        this.A03 = interfaceC1812882f;
        this.A01 = userSession;
        this.A00 = new RectF();
    }

    public final Bitmap A02(boolean z, boolean z2) {
        return A01(null, null, null, 1.0f, 1.0f, -1, true, z, z2, true);
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    private final Bitmap A00() {
        RectF rectF = this.A00;
        InterfaceC1812882f interfaceC1812882f = this.A03;
        rectF.set(0.0f, 0.0f, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight());
        int width = (int) rectF.width();
        rectF.set(0.0f, 0.0f, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight());
        try {
            return Bitmap.createBitmap(width, (int) rectF.height(), Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public final Bitmap A01(Bitmap bitmap, RectF rectF, InterfaceC25170BBq interfaceC25170BBq, float f, float f2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Bitmap AzX;
        String str;
        Bitmap bitmap2 = bitmap;
        InterfaceC183698Cu interfaceC183698Cu = this.A02;
        Canvas canvas = null;
        if (!interfaceC183698Cu.CKr()) {
            AzX = null;
        } else {
            UserSession userSession = this.A01;
            C447624g c447624g = AnonymousClass229.A01(userSession).A04;
            C14360o3.A07(c447624g);
            c447624g.A03.A0D("generate_doodle_bitmap_requested", c447624g.A01, null, null, null, null);
            int i2 = 0;
            while (true) {
                if (rectF != null) {
                    AzX = interfaceC183698Cu.AzW((int) rectF.width(), (int) rectF.height());
                } else {
                    AzX = interfaceC183698Cu.AzX(null);
                }
                if (i2 > 0) {
                    C447624g c447624g2 = AnonymousClass229.A01(userSession).A04;
                    C14360o3.A07(c447624g2);
                    c447624g2.A03.A0C(AnonymousClass001.A0O("retry_generate_doodle_bitmap: ", i2), c447624g2.A01);
                }
                if (AzX != null) {
                    C447624g c447624g3 = AnonymousClass229.A01(userSession).A04;
                    C14360o3.A07(c447624g3);
                    c447624g3.A03.A0D("generate_doodle_bitmap_success", c447624g3.A01, null, null, null, null);
                    break;
                }
                i2++;
                if (i2 >= 5) {
                    C447624g c447624g4 = AnonymousClass229.A01(userSession).A04;
                    C14360o3.A07(c447624g4);
                    c447624g4.A03.A0C("generate_doodle_bitmap_failed", c447624g4.A01);
                    break;
                }
            }
        }
        if (bitmap != null) {
            canvas = new Canvas(bitmap2);
            if (AzX != null) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                canvas.drawBitmap(AzX, 0.0f, 0.0f, paint);
            }
        } else if (AzX != null) {
            canvas = new Canvas(AzX);
            bitmap2 = AzX;
        } else if (interfaceC25170BBq != null) {
            bitmap2 = A00();
            if (bitmap2 == null) {
                return null;
            }
            canvas = new Canvas(bitmap2);
        } else {
            bitmap2 = null;
        }
        if (interfaceC25170BBq != null) {
            if (canvas != null) {
                if (bitmap2 != null) {
                    UserSession userSession2 = this.A01;
                    C447624g c447624g5 = AnonymousClass229.A01(userSession2).A04;
                    C14360o3.A07(c447624g5);
                    c447624g5.A03.A0C("render_video_sticker_requested", c447624g5.A00);
                    canvas.scale(f, f2);
                    boolean ANp = interfaceC25170BBq.ANp(canvas, Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap2.getHeight()), i);
                    C447624g c447624g6 = AnonymousClass229.A01(userSession2).A04;
                    C14360o3.A07(c447624g6);
                    C24Q c24q = c447624g6.A03;
                    long j = c447624g6.A00;
                    if (!ANp) {
                        str = "render_video_sticker_failed";
                    } else {
                        str = "render_video_sticker_success";
                    }
                    c24q.A0C(str, j);
                    canvas.scale(1.0f / f, 1.0f / f2);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (z4) {
            for (InterfaceC1829589q interfaceC1829589q : this.A05) {
                if (interfaceC1829589q.CLU() && interfaceC1829589q.isVisible() && interfaceC1829589q.CLZ(z2, z3)) {
                    if (bitmap2 == null) {
                        bitmap2 = A00();
                        if (bitmap2 != null) {
                            canvas = new Canvas(bitmap2);
                        }
                    } else if (canvas == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    canvas.save();
                    if (rectF != null) {
                        Matrix matrix = new Matrix();
                        RectF rectF2 = this.A00;
                        InterfaceC1812882f interfaceC1812882f = this.A03;
                        rectF2.set(0.0f, 0.0f, interfaceC1812882f.getWidth(), interfaceC1812882f.getHeight());
                        matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
                        canvas.setMatrix(matrix);
                    }
                    interfaceC1829589q.EGp(canvas, i, z2, z3);
                    canvas.restore();
                    interfaceC1829589q.EJm();
                }
            }
        }
        if (bitmap2 == null) {
            return null;
        }
        if (z) {
            return C1NC.A04(bitmap2);
        }
        return bitmap2;
    }

    public final boolean A03() {
        List<InterfaceC1829589q> list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (InterfaceC1829589q interfaceC1829589q : list) {
                if (interfaceC1829589q.CLU() && interfaceC1829589q.isVisible() && interfaceC1829589q.CLZ(false, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }
}
