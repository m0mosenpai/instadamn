package X;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public final class J5R implements Runnable {
    public final /* synthetic */ C38321qM A00;
    public final /* synthetic */ C84823qW A01;
    public final /* synthetic */ C41066IGj A02;

    public J5R(C38321qM c38321qM, C84823qW c84823qW, C41066IGj c41066IGj) {
        this.A02 = c41066IGj;
        this.A01 = c84823qW;
        this.A00 = c38321qM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C41066IGj c41066IGj = this.A02;
        ImageView imageView = c41066IGj.A02;
        if (imageView != null) {
            C84823qW c84823qW = this.A01;
            View view = c41066IGj.A01;
            if (view != null) {
                C138436Oz.A04(imageView, c84823qW, this.A00.A0m(), view.getWidth(), view.getHeight(), true);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
