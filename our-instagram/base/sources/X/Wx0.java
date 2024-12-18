package X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class Wx0 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ C67846UzR A02;
    public final /* synthetic */ C69763Bk A03;

    public Wx0(Context context, ImageView imageView, C67846UzR c67846UzR, C69763Bk c69763Bk) {
        this.A03 = c69763Bk;
        this.A02 = c67846UzR;
        this.A01 = imageView;
        this.A00 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C67846UzR c67846UzR = this.A02;
        ImageView imageView = this.A01;
        C14360o3.A0A(imageView);
        Context context = this.A00;
        if (c67846UzR.A02 == VDL.A04) {
            AnonymousClass693 A00 = C68U.A00(context, R.raw.ig_reels_celebrations_sparkle_gradient_fill);
            imageView.setImageDrawable(A00);
            if (A00 != null) {
                A00.EH1();
                A00.E4S();
            }
        }
    }
}
