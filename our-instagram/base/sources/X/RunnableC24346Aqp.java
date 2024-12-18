package X;

import com.facebook.R;

/* renamed from: X.Aqp, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24346Aqp implements Runnable {
    public final /* synthetic */ A89 A00;

    public RunnableC24346Aqp(A89 a89) {
        this.A00 = a89;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A89 a89 = this.A00;
        a89.A00 = false;
        a89.A01.setColorFilter(a89.A02.getContext().getColor(R.color.design_dark_default_color_on_background));
    }
}
