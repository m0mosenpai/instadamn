package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;

/* renamed from: X.Mi8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51103Mi8 extends C110814yt {
    public final /* synthetic */ FastScrollingGridLayoutManager A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51103Mi8(Context context, FastScrollingGridLayoutManager fastScrollingGridLayoutManager) {
        super(context);
        this.A00 = fastScrollingGridLayoutManager;
    }

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }
}
