package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.9zh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226859zh {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.ABt, X.9iG] */
    public static final C216599iG A00(Context context, boolean z, boolean z2) {
        ?? abstractC22994ABt = new AbstractC22994ABt(context.getResources().getColor(R.color.clips_gradient_redesign_color_0, null), AbstractC167017dG.A07(context));
        abstractC22994ABt.A00 = AbstractC167017dG.A05(context);
        abstractC22994ABt.A01 = AbstractC167017dG.A06(context);
        if (z) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
            Drawable drawable = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle);
            abstractC22994ABt.A03 = dimensionPixelSize;
            abstractC22994ABt.A06 = drawable;
            int A04 = AbstractC166997dE.A04(context, R.dimen.audition_flow_footer_button_horizontal_padding);
            Drawable drawable2 = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle);
            abstractC22994ABt.A04 = A04;
            abstractC22994ABt.A08 = drawable2;
            context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
            abstractC22994ABt.A07 = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle_right);
            context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
            abstractC22994ABt.A09 = context.getDrawable(R.drawable.stacked_timeline_trimmer_handle_left);
            if (z2) {
                abstractC22994ABt.A00 = AbstractC167017dG.A0E(context);
            }
        }
        return abstractC22994ABt;
    }
}
