package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.instagram.shopping.adapter.cart.merchant.PinnedLinearLayoutManager;

/* renamed from: X.Mi9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51104Mi9 extends C110814yt {
    public final /* synthetic */ PinnedLinearLayoutManager A00;

    @Override // X.C110814yt
    public final float A06(DisplayMetrics displayMetrics) {
        C14360o3.A0B(displayMetrics, 0);
        return this.A00.A04 / displayMetrics.densityDpi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51104Mi9(Context context, PinnedLinearLayoutManager pinnedLinearLayoutManager) {
        super(context);
        this.A00 = pinnedLinearLayoutManager;
    }
}
