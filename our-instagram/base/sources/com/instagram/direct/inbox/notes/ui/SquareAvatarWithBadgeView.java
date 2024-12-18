package com.instagram.direct.inbox.notes.ui;

import X.AbstractC09440dt;
import X.AbstractC13620mo;
import X.AbstractC73003Pb;
import X.C14360o3;
import X.C206869Dr;
import X.C50802Vb;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class SquareAvatarWithBadgeView extends FrameLayout {
    public Drawable A00;
    public CircularImageView A01;
    public CornerPunchedRoundedCornerImageView A02;
    public int A03;
    public int A04;
    public final InterfaceC09390do A05;
    public final boolean A06;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SquareAvatarWithBadgeView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width;
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A00;
        if (drawable != null) {
            canvas.save();
            int width2 = getWidth();
            int height = getHeight();
            Rect bounds = drawable.getBounds();
            C14360o3.A07(bounds);
            float height2 = (height - (bounds.height() / 2.0f)) - this.A04;
            if (this.A06) {
                width = bounds.width() / 2.0f;
            } else {
                width = width2 - (bounds.width() / 2.0f);
            }
            canvas.translate(width - this.A03, height2);
            float max = Math.max(bounds.width() / drawable.getIntrinsicWidth(), bounds.height() / drawable.getIntrinsicHeight());
            if (max > 1.0f) {
                canvas.scale(max, max, bounds.exactCenterX(), bounds.exactCenterY());
            }
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getBadgeClickDelegate() {
        return (View) this.A05.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getBadgeDrawableRect() {
        int i;
        Drawable drawable = this.A00;
        if (drawable != null) {
            int width = getWidth();
            int height = (getHeight() - (drawable.getBounds().height() / 2)) - this.A04;
            boolean z = this.A06;
            int width2 = drawable.getBounds().width();
            if (z) {
                i = width2 / 2;
            } else {
                i = width - (width2 / 2);
            }
            int i2 = i - this.A03;
            return new Rect(i2, height, drawable.getBounds().width() + i2, drawable.getBounds().height() + height);
        }
        return null;
    }

    public final void setSingleAvatarBirthdayConfettiAnimation(boolean z) {
        Context context;
        if (z && (context = getContext()) != null) {
            CircularImageView circularImageView = this.A01;
            circularImageView.setVisibility(0);
            AbstractC73003Pb.A00(context, circularImageView);
            AbstractC73003Pb.A01(circularImageView.getDrawable());
            return;
        }
        this.A01.setVisibility(8);
    }

    public /* synthetic */ SquareAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SquareAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A06 = AbstractC13620mo.A02(context);
        this.A05 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206869Dr(context, 22));
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        View A00 = C50802Vb.A00(from, null, this, R.layout.square_avatar_with_badge_view, 0, false, false);
        addView(A00);
        this.A02 = (CornerPunchedRoundedCornerImageView) A00.requireViewById(R.id.square_avatar);
        this.A01 = (CircularImageView) A00.requireViewById(R.id.birthday_confetti_circular_imageview);
        CornerPunchedRoundedCornerImageView cornerPunchedRoundedCornerImageView = this.A02;
        cornerPunchedRoundedCornerImageView.A00 = false;
        cornerPunchedRoundedCornerImageView.invalidate();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        this.A03 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SquareAvatarWithBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
