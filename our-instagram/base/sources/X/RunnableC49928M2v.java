package X;

import android.widget.ImageView;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import java.lang.ref.WeakReference;

/* renamed from: X.M2v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49928M2v implements Runnable {
    public final /* synthetic */ Runnable A00;
    public final /* synthetic */ WeakReference A01;

    public RunnableC49928M2v(Runnable runnable, WeakReference weakReference) {
        this.A00 = runnable;
        this.A01 = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.run();
        ArrowHintView arrowHintView = (ArrowHintView) this.A01.get();
        if (arrowHintView != null) {
            arrowHintView.A00 = arrowHintView.A04;
            ImageView imageView = arrowHintView.A02;
            String str = "checkView";
            if (imageView != null) {
                imageView.setVisibility(8);
                ImageView imageView2 = arrowHintView.A02;
                if (imageView2 != null) {
                    imageView2.setAlpha(0.0f);
                    ImageView imageView3 = arrowHintView.A01;
                    if (imageView3 == null) {
                        str = "arrow";
                    } else {
                        imageView3.setAlpha(1.0f);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }
}
