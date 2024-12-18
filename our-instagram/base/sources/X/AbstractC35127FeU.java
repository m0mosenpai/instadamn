package X;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.FeU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35127FeU {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public final float A05;
    public final Context A06;
    public final View A07;
    public final InterfaceC11380iw A08;
    public final IgTextView A09;

    public static final void A00(AbstractC35127FeU abstractC35127FeU, float f, float f2) {
        View view = abstractC35127FeU.A07;
        ViewPropertyAnimator duration = view.animate().setInterpolator(new DecelerateInterpolator()).scaleX(f).scaleY(f2).setDuration(200L);
        C14360o3.A07(duration);
        view.setPivotY(view.getMeasuredHeight());
        duration.start();
    }

    public static final void A01(AbstractC35127FeU abstractC35127FeU, float f, float f2, float f3) {
        abstractC35127FeU.A09.animate().setInterpolator(new DecelerateInterpolator()).scaleX(f).scaleY(f2).y(f3).setDuration(200L).start();
    }

    public AbstractC35127FeU(Context context, View view, InterfaceC11380iw interfaceC11380iw, IgTextView igTextView) {
        this.A06 = context;
        this.A07 = view;
        this.A09 = igTextView;
        this.A08 = interfaceC11380iw;
        this.A05 = context.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
    }
}
