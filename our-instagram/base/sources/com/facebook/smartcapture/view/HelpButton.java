package com.facebook.smartcapture.view;

import X.AbstractC010103p;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC47961LGz;
import X.AbstractC47994LKy;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C50825MdI;
import X.MO0;
import X.MRQ;
import X.RunnableC49825LzW;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.smartcapture.ui.ResourcesTextView;
import com.facebook.smartcapture.ui.SCImageView;

/* loaded from: classes8.dex */
public final class HelpButton extends LinearLayout {
    public boolean A00;
    public Drawable A01;
    public ResourcesTextView A02;
    public SCImageView A03;
    public final Handler A04;
    public final Runnable A05;
    public final Paint A06;
    public final RectF A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A07 = AbstractC166987dD.A0X();
        this.A06 = AbstractC166987dD.A0S(1);
        this.A04 = AbstractC167007dF.A0J();
        this.A05 = new RunnableC49825LzW(this);
        A00(context);
    }

    private final void A00(Context context) {
        MRQ AzR;
        setOrientation(0);
        setWillNotDraw(false);
        this.A06.setColor(AbstractC47994LKy.A01(context, R.attr.sc_help_button_background));
        LayoutInflater.from(context).inflate(R.layout.help_button, (ViewGroup) this, true);
        Object obj = context;
        while (true) {
            if (!(obj instanceof MO0)) {
                if (obj instanceof ContextWrapper) {
                    obj = ((ContextWrapper) obj).getBaseContext();
                } else {
                    AzR = null;
                    break;
                }
            } else {
                AzR = ((MO0) obj).AzR();
                break;
            }
        }
        SCImageView sCImageView = (SCImageView) AbstractC47961LGz.A00(this, R.id.iv_icon);
        this.A03 = sCImageView;
        String str = "ivIcon";
        if (AzR != null) {
            if (sCImageView != null) {
                sCImageView.setImageDrawable(AzR.BjT(context));
                this.A01 = AzR.BjU(context);
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        SCImageView sCImageView2 = this.A03;
        if (sCImageView2 != null) {
            sCImageView2.setColorFilter(AbstractC47994LKy.A01(context, R.attr.sc_help_button_icon));
            ResourcesTextView resourcesTextView = (ResourcesTextView) AbstractC47961LGz.A00(this, R.id.tv_title);
            this.A02 = resourcesTextView;
            if (resourcesTextView == null) {
                str = DialogModule.KEY_TITLE;
            } else {
                AbstractC47994LKy.A04(context, resourcesTextView, R.attr.sc_help_button_text);
                setExpanded(false);
                AbstractC010103p.A0B(this, new C50825MdI(0));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f;
        if (this.A00) {
            ResourcesTextView resourcesTextView = this.A02;
            if (resourcesTextView == null) {
                C14360o3.A0F(DialogModule.KEY_TITLE);
                throw C00O.createAndThrow();
            }
            if (resourcesTextView.getLineCount() > 1) {
                min /= 2.0f;
            }
        }
        canvas.drawRoundRect(this.A07, min, min, this.A06);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.A06.setColor(i);
        invalidate();
    }

    public final void setExpanded(boolean z) {
        this.A00 = z;
        ResourcesTextView resourcesTextView = this.A02;
        if (resourcesTextView == null) {
            C14360o3.A0F(DialogModule.KEY_TITLE);
            throw C00O.createAndThrow();
        }
        resourcesTextView.setVisibility(AbstractC167007dF.A05(z ? 1 : 0));
        TransitionManager.beginDelayedTransition(this);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(1800556241);
        this.A07.set(0.0f, 0.0f, i, i2);
        C0f9.A0D(677007966, A06);
    }

    public final void setIsExpanded(boolean z) {
        setExpanded(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A07 = AbstractC166987dD.A0X();
        this.A06 = AbstractC166987dD.A0S(1);
        this.A04 = AbstractC167007dF.A0J();
        this.A05 = new RunnableC49825LzW(this);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C14360o3.A0B(context, 1);
        this.A07 = AbstractC166987dD.A0X();
        this.A06 = AbstractC166987dD.A0S(1);
        this.A04 = AbstractC167007dF.A0J();
        this.A05 = new RunnableC49825LzW(this);
        A00(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C14360o3.A0B(context, 1);
        this.A07 = AbstractC166987dD.A0X();
        this.A06 = AbstractC166987dD.A0S(1);
        this.A04 = AbstractC167007dF.A0J();
        this.A05 = new RunnableC49825LzW(this);
        A00(context);
    }
}
