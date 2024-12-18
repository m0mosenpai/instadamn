package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.creation.photo.crop.CropImageView;
import com.instagram.creation.photo.util.ExifImageData;

/* renamed from: X.JeE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44089JeE implements Runnable {
    public final /* synthetic */ C43868JaY A00;

    public RunnableC44089JeE(C43868JaY c43868JaY) {
        this.A00 = c43868JaY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MQT mqt;
        FragmentActivity fragmentActivity;
        C43869JaZ c43869JaZ;
        CropImageView cropImageView;
        ExifImageData exifImageData;
        C43869JaZ c43869JaZ2;
        CropImageView cropImageView2;
        InterfaceC197178nn interfaceC197178nn;
        ExifImageData exifImageData2;
        Number number;
        FragmentActivity fragmentActivity2;
        MQT mqt2;
        C43868JaY c43868JaY = this.A00;
        Bitmap bitmap = c43868JaY.A00;
        C43869JaZ c43869JaZ3 = c43868JaY.A03;
        if (bitmap == null) {
            if (c43869JaZ3 != null) {
                fragmentActivity2 = c43869JaZ3.A03;
            } else {
                fragmentActivity2 = null;
            }
            C9GR.A0F(fragmentActivity2, "unable_to_load_image", 2131976043);
            C43869JaZ c43869JaZ4 = c43868JaY.A03;
            if (c43869JaZ4 != null && (mqt2 = c43869JaZ4.A04) != null) {
                mqt2.D1r();
                return;
            }
            return;
        }
        if (c43869JaZ3 != null && (fragmentActivity = c43869JaZ3.A03) != null && (!fragmentActivity.isFinishing()) && (c43869JaZ = c43868JaY.A03) != null && (cropImageView = c43869JaZ.A05) != null && (exifImageData = c43868JaY.A04) != null) {
            Integer num = null;
            cropImageView.setImageRotateBitmapResetBase(new C44264JhA(bitmap, exifImageData.A00), c43869JaZ.A0A, null);
            Bitmap bitmap2 = c43868JaY.A00;
            if (bitmap2 != null && (c43869JaZ2 = c43868JaY.A03) != null && (cropImageView2 = c43869JaZ2.A05) != null && (interfaceC197178nn = c43868JaY.A05) != null && (exifImageData2 = c43868JaY.A04) != null) {
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                int min = Math.min(width, height);
                c43868JaY.A01 = new RectF((width - min) / 2, (height - min) / 2, r1 + min, r0 + min);
                C43869JaZ c43869JaZ5 = c43868JaY.A03;
                Integer num2 = null;
                if (c43869JaZ5 != null) {
                    num = c43869JaZ5.A07;
                    num2 = c43869JaZ5.A06;
                }
                C82P c82p = new C82P(cropImageView2, num, num2);
                RectF A0X = AbstractC166987dD.A0X();
                ((AbstractC43828JZr) cropImageView2).A07.mapRect(A0X, c43868JaY.A01);
                c82p.A01(A0X, c43868JaY.A08, false);
                cropImageView2.setHighlightView(c82p);
                cropImageView2.A00 = new RectF(0.0f, 0.0f, width, height);
                C3AY A01 = AbstractC44263Jh9.A01(bitmap2, Math.min(interfaceC197178nn.getWidth(), interfaceC197178nn.getHeight()), exifImageData2.A00);
                RectF rectF = c43868JaY.A01;
                if (rectF != null) {
                    if (c43868JaY.A08) {
                        number = AbstractC25227BEk.A0m();
                    } else {
                        number = (Number) A01.A00;
                    }
                    C14360o3.A0A(number);
                    float floatValue = number.floatValue();
                    Object obj = A01.A01;
                    C14360o3.A06(obj);
                    cropImageView2.A0L(rectF, floatValue, AbstractC166987dD.A09(obj));
                }
            }
            cropImageView.A0O();
        }
        C43869JaZ c43869JaZ6 = c43868JaY.A03;
        if (c43869JaZ6 == null || (mqt = c43869JaZ6.A04) == null) {
            return;
        }
        mqt.D8k(bitmap.getWidth(), bitmap.getHeight());
    }
}
