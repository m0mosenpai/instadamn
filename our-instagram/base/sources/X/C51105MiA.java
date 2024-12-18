package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.MiA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51105MiA extends C110814yt {
    public final /* synthetic */ AbstractC61802rh A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51105MiA(Context context, AbstractC61802rh abstractC61802rh) {
        super(context);
        this.A00 = abstractC61802rh;
    }

    @Override // X.C110814yt, X.AbstractC110824yu
    public final void A04(View view, C110834yv c110834yv, C3F5 c3f5) {
        AbstractC61802rh abstractC61802rh = this.A00;
        RecyclerView recyclerView = abstractC61802rh.A00;
        if (recyclerView != null) {
            int[] A09 = abstractC61802rh.A09(view, recyclerView.A0D);
            AbstractC50522MSa.A15(this, c110834yv, A09, 1, A09[0]);
        }
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
