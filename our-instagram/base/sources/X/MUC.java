package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.common.ui.widget.recyclerview.CustomScrollingLinearLayoutManager;

/* loaded from: classes9.dex */
public final class MUC extends C110814yt {
    public final /* synthetic */ CustomScrollingLinearLayoutManager A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MUC(Context context, CustomScrollingLinearLayoutManager customScrollingLinearLayoutManager) {
        super(context);
        this.A00 = customScrollingLinearLayoutManager;
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // X.C110814yt
    public final int A0B(int i, int i2, int i3, int i4, int i5) {
        if (this.A00.A02) {
            return ((i3 + i4) / 2) - ((i + i2) / 2);
        }
        return super.A0B(i, i2, i3, i4, i5);
    }
}
