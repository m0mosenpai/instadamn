package X;

import android.view.View;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.M5r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50002M5r implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IgSimpleImageView A01;
    public final /* synthetic */ C7GN A02;

    public RunnableC50002M5r(View view, IgSimpleImageView igSimpleImageView, C7GN c7gn) {
        this.A00 = view;
        this.A02 = c7gn;
        this.A01 = igSimpleImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7GN.A03(this.A01, this.A02);
    }
}
