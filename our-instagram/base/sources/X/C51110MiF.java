package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: X.MiF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51110MiF extends C110814yt {
    public final /* synthetic */ C61792rg A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51110MiF(Context context, C61792rg c61792rg) {
        super(context);
        this.A00 = c61792rg;
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A04(View view, C110834yv c110834yv, C3F5 c3f5) {
        C61792rg c61792rg = this.A00;
        int[] A09 = c61792rg.A09(view, ((AbstractC61802rh) c61792rg).A00.A0D);
        AbstractC50522MSa.A15(this, c110834yv, A09, 1, A09[0]);
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // X.C110814yt
    public final int A0A(int i) {
        return Math.min(100, super.A0A(i));
    }
}
