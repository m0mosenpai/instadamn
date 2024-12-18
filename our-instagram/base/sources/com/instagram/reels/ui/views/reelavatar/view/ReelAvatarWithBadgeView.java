package com.instagram.reels.ui.views.reelavatar.view;

import X.AbstractC09440dt;
import X.AbstractC13620mo;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC31173DnH;
import X.AbstractC43593JPy;
import X.AbstractC53242c7;
import X.AbstractC73003Pb;
import X.C14360o3;
import X.C1H4;
import X.C3PR;
import X.C48542Ldf;
import X.C50802Vb;
import X.C57527Pg1;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC11380iw;
import X.InterfaceC56392iX;
import X.JQ0;
import X.JR9;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.CornerPunchedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class ReelAvatarWithBadgeView extends FrameLayout {
    public CircularImageView A00;
    public CornerPunchedImageView A01;
    public InterfaceC56392iX A02;
    public int A03;
    public int A04;
    public Drawable A05;
    public final InterfaceC09390do A06;
    public final int A07;
    public final boolean A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReelAvatarWithBadgeView(Context context) {
        this(context, null);
        C14360o3.A0B(context, 1);
    }

    public final void A04(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        AbstractC43593JPy.A1B(this.A01, -1);
        setSingleAvatarUrlAndVisibility(imageUrl, interfaceC11380iw);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width;
        C14360o3.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        Drawable drawable = this.A05;
        if (drawable != null) {
            canvas.save();
            int width2 = getWidth();
            int height = getHeight();
            Rect A0W = AbstractC166987dD.A0W(drawable);
            float height2 = (height - (A0W.height() / 2.0f)) - this.A04;
            if (this.A08) {
                width = A0W.width() / 2.0f;
            } else {
                width = width2 - (A0W.width() / 2.0f);
            }
            canvas.translate(width - this.A03, height2);
            float max = Math.max(A0W.width() / drawable.getIntrinsicWidth(), A0W.height() / drawable.getIntrinsicHeight());
            if (max > 1.0f) {
                canvas.scale(max, max, A0W.exactCenterX(), A0W.exactCenterY());
            }
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    public final void setDoubleAvatarUrlsAndVisibility(ImageUrl imageUrl, ImageUrl imageUrl2, InterfaceC11380iw interfaceC11380iw) {
        AbstractC167007dF.A1D(imageUrl, 0, interfaceC11380iw);
        IgImageView igImageView = (IgImageView) this.A02.getView();
        CornerPunchedImageView cornerPunchedImageView = this.A01;
        int i = this.A07;
        cornerPunchedImageView.setPlaceHolderColor(i);
        igImageView.setPlaceHolderColor(i);
        cornerPunchedImageView.setUrl(imageUrl, interfaceC11380iw);
        if (imageUrl2 != null) {
            igImageView.setUrl(imageUrl2, interfaceC11380iw);
        } else {
            igImageView.A0B();
        }
        cornerPunchedImageView.setVisibility(0);
        igImageView.setVisibility(0);
        setSingleAvatarBirthdayConfettiAnimation(false);
    }

    public final void setSingleAvatarUrlAndVisibility(ImageUrl imageUrl, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC11380iw, 1);
        CornerPunchedImageView cornerPunchedImageView = this.A01;
        cornerPunchedImageView.setPlaceHolderColor(this.A07);
        if (imageUrl != null) {
            cornerPunchedImageView.setUrl(imageUrl, interfaceC11380iw);
        } else {
            cornerPunchedImageView.A09();
        }
        cornerPunchedImageView.setVisibility(0);
        this.A02.setVisibility(8);
    }

    private final View getBadgeClickDelegate() {
        return AbstractC166987dD.A0d(this.A06);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getBadgeDrawableRect() {
        int i;
        Drawable drawable = this.A05;
        if (drawable != null) {
            int width = getWidth();
            int height = (getHeight() - (AbstractC166997dE.A0G(drawable) / 2)) - this.A04;
            boolean z = this.A08;
            int A0H = AbstractC166997dE.A0H(drawable);
            if (z) {
                i = A0H / 2;
            } else {
                i = width - (A0H / 2);
            }
            int i2 = i - this.A03;
            return AbstractC166987dD.A0V(i2, height, AbstractC166997dE.A0H(drawable) + i2, AbstractC166997dE.A0G(drawable) + height);
        }
        return null;
    }

    public final void A01(Drawable drawable) {
        CornerPunchedImageView cornerPunchedImageView = this.A01;
        AbstractC43593JPy.A1B(cornerPunchedImageView, -1);
        cornerPunchedImageView.setPlaceHolderColor(this.A07);
        if (drawable != null) {
            if (drawable instanceof C3PR) {
                ((C3PR) drawable).A01(new C48542Ldf(this, 2));
            } else {
                cornerPunchedImageView.setImageDrawable(drawable);
            }
        } else {
            cornerPunchedImageView.A09();
        }
        cornerPunchedImageView.setVisibility(0);
        this.A02.setVisibility(8);
    }

    public final void A02(Drawable drawable, int i) {
        Drawable drawable2 = this.A05;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.A05 = drawable;
            CornerPunchedImageView cornerPunchedImageView = this.A01;
            if (drawable != null) {
                cornerPunchedImageView.A00 = true;
                cornerPunchedImageView.invalidate();
                drawable.setCallback(this);
                drawable.setBounds(0, 0, i, i);
            } else {
                cornerPunchedImageView.A00 = false;
                cornerPunchedImageView.invalidate();
                post(new JR9(this));
            }
            invalidate();
        }
    }

    public final void setBadgeOffset(int i) {
        this.A03 = i;
        this.A04 = i;
        invalidate();
    }

    public final void setBadgeOffsetX(int i) {
        this.A03 = i;
        invalidate();
    }

    public final void setBadgeOffsetY(int i) {
        this.A04 = i;
        invalidate();
    }

    public final void setForceTrackingForProfileImageEnabled(boolean z) {
        this.A01.A0M = z;
    }

    public final void setFrontAvatarPunchOffsetX(int i) {
        this.A01.setPunchOffsetX(i);
    }

    public final void setFrontAvatarPunchOffsetY(int i) {
        this.A01.setPunchOffsetY(i);
    }

    public final void setFrontAvatarPunchRadius(int i) {
        this.A01.setPunchRadius(i);
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.A01.setScaleType(scaleType);
        InterfaceC56392iX interfaceC56392iX = this.A02;
        if (interfaceC56392iX.CWW()) {
            ((ImageView) interfaceC56392iX.getView()).setScaleType(scaleType);
        }
    }

    public final void setSingleAvatarBirthdayConfettiAnimation(boolean z) {
        Context context;
        if (z && (context = getContext()) != null) {
            CircularImageView circularImageView = this.A00;
            circularImageView.setVisibility(0);
            AbstractC73003Pb.A00(context, circularImageView);
            AbstractC73003Pb.A01(circularImageView.getDrawable());
            return;
        }
        this.A00.setVisibility(8);
    }

    public final void A03(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, ImageUrl imageUrl2, int i) {
        AbstractC167017dG.A1O(imageUrl, interfaceC11380iw);
        float f = i;
        float f2 = 0.8125f * f;
        float f3 = f - f2;
        float f4 = f2 / 2.0f;
        float f5 = f3 - f4;
        int A01 = C1H4.A01(f2);
        int A012 = C1H4.A01(f3);
        int A013 = C1H4.A01(f5);
        int A014 = C1H4.A01(f4 * 1.154f);
        CornerPunchedImageView cornerPunchedImageView = this.A01;
        AbstractC43593JPy.A1B(cornerPunchedImageView, A01);
        AbstractC13880nE.A0e(cornerPunchedImageView, A012);
        AbstractC13880nE.A0f(cornerPunchedImageView, A012);
        CornerPunchedImageView cornerPunchedImageView2 = (CornerPunchedImageView) this.A02.getView();
        AbstractC43593JPy.A1B(cornerPunchedImageView2, A01);
        cornerPunchedImageView2.setPunchOffsetX(A013);
        cornerPunchedImageView2.setPunchOffsetY(A013);
        cornerPunchedImageView2.setPunchRadius(A014);
        setDoubleAvatarUrlsAndVisibility(imageUrl, imageUrl2, interfaceC11380iw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A08 = AbstractC13620mo.A02(context);
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A02, new C57527Pg1(context, 32));
        LayoutInflater from = LayoutInflater.from(context);
        C14360o3.A07(from);
        View A01 = C50802Vb.A01(from, this, R.layout.reel_avatar_with_badge_view);
        addView(A01);
        this.A01 = (CornerPunchedImageView) A01.requireViewById(R.id.reel_viewer_front_avatar);
        this.A00 = AbstractC31173DnH.A0T(A01, R.id.birthday_confetti_circular_imageview);
        this.A02 = AbstractC31173DnH.A0U(A01, R.id.reel_viewer_back_avatar_stub);
        CornerPunchedImageView cornerPunchedImageView = this.A01;
        cornerPunchedImageView.A00 = false;
        cornerPunchedImageView.invalidate();
        this.A07 = getContext().getColor(AbstractC53242c7.A04(context));
        int A04 = AbstractC167017dG.A04(context);
        this.A03 = A04;
        this.A04 = A04;
    }

    public /* synthetic */ ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
