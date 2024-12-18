package X;

import android.graphics.Typeface;

/* loaded from: classes10.dex */
public final class TPK implements Runnable {
    public final /* synthetic */ Typeface A00;
    public final /* synthetic */ C62663SKx A01;
    public final /* synthetic */ AbstractC2051896j A02;

    public TPK(Typeface typeface, C62663SKx c62663SKx, AbstractC2051896j abstractC2051896j) {
        this.A01 = c62663SKx;
        this.A02 = abstractC2051896j;
        this.A00 = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A01(this.A00);
    }
}
