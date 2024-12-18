package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.SPj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62752SPj {
    public float A00;
    public Context A01;
    public View.OnAttachStateChangeListener A02;
    public String A03;
    public String A04;
    public WeakReference A05;
    public boolean A06;
    public boolean A07;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC62752SPj)) {
            return false;
        }
        return this.A04.equals(((AbstractC62752SPj) obj).A04);
    }

    public final int hashCode() {
        return 589 + this.A04.hashCode();
    }

    public static void A00(View view) {
        if (view.getTag(R.id.fbpay_image_loader) instanceof AbstractC62752SPj) {
            AbstractC62752SPj abstractC62752SPj = (AbstractC62752SPj) view.getTag(R.id.fbpay_image_loader);
            View view2 = (View) abstractC62752SPj.A05.get();
            if (view2 != null) {
                view2.removeOnAttachStateChangeListener(abstractC62752SPj.A02);
            }
        }
        view.setTag(R.id.fbpay_image_loader, null);
    }

    public final void A01(Drawable drawable) {
        C02R.A05(AbstractC167007dF.A1X(Looper.myLooper(), Looper.getMainLooper()));
        ImageView imageView = (ImageView) this.A05.get();
        if (imageView != null && equals(imageView.getTag(R.id.fbpay_image_loader))) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void A02(ImageView imageView) {
        C02R.A05(AbstractC167007dF.A1X(Looper.myLooper(), Looper.getMainLooper()));
        this.A05 = AbstractC25225BEi.A16(imageView);
        A00(imageView);
        imageView.setTag(R.id.fbpay_image_loader, this);
        imageView.addOnAttachStateChangeListener(this.A02);
        A01(null);
        C60615REa c60615REa = (C60615REa) this;
        C1OG A0J = C25821No.A00().A0J(new SimpleImageUrl(c60615REa.A04), c60615REa.A03);
        A0J.A02(c60615REa.A00);
        A0J.A00().E7X();
    }
}
