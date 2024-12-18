package X;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: X.LzP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49818LzP implements Runnable {
    public final /* synthetic */ K5S A00;

    public RunnableC49818LzP(K5S k5s) {
        this.A00 = k5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K5S k5s = this.A00;
        ImageView imageView = k5s.A0D;
        C14360o3.A0A(imageView);
        LinearLayout linearLayout = k5s.A0I;
        C14360o3.A0A(linearLayout);
        imageView.setMaxHeight(linearLayout.getHeight() / 2);
    }
}
