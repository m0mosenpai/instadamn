package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class AH4 {
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(B8K.A00);
    public Bitmap A00;
    public WeakReference A01;

    public final void A01(Activity activity) {
        C14360o3.A0B(activity, 0);
        ImageView imageView = new ImageView(activity);
        Window window = activity.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            C14360o3.A0C(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(imageView);
            imageView.setVisibility(8);
            this.A01 = new WeakReference(imageView);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A00() {
        View view;
        WeakReference weakReference = this.A01;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                C14360o3.A0C(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(view);
            }
            this.A01 = null;
        }
    }
}
