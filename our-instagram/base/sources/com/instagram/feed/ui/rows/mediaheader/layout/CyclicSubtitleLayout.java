package com.instagram.feed.ui.rows.mediaheader.layout;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC16960so;
import X.AbstractC224517h;
import X.AnonymousClass001;
import X.C00O;
import X.C011003y;
import X.C0w9;
import X.C14360o3;
import X.JQ0;
import X.JW8;
import X.JWA;
import X.RunnableC44088JeD;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
import java.util.Timer;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class CyclicSubtitleLayout extends FrameLayout {
    public int A00;
    public long A01;
    public View.OnAttachStateChangeListener A02;
    public Timer A03;
    public boolean A04;

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAnimating(boolean z) {
        Timer timer;
        if (this.A04 != z) {
            this.A04 = z;
            if (z) {
                String A0M = AnonymousClass001.A0M("CyclicSubtitleLayout_", Math.random());
                long j = this.A01;
                if (A0M == null) {
                    timer = new Timer(true);
                } else {
                    timer = new Timer(A0M, true);
                }
                timer.scheduleAtFixedRate(new JWA(this), j, j);
            } else {
                Timer timer2 = this.A03;
                if (timer2 != null) {
                    timer2.cancel();
                }
                timer = null;
            }
            this.A03 = timer;
        }
    }

    public final long getAnimationDelay() {
        return this.A01;
    }

    public final int getVisibleIndex() {
        return this.A00;
    }

    public final void setAnimationDelay(long j) {
        this.A01 = j;
    }

    public final void setVisibleIndex(int i) {
        int i2;
        List A02 = AbstractC224517h.A02(AbstractC224517h.A04(JW8.A00, new C011003y(this)));
        int size = A02.size();
        int i3 = this.A00;
        int i4 = 0;
        try {
            i2 = i % size;
        } catch (ArithmeticException e) {
            C0w9.A01.EmP("CyclicSubtitleLayout", "CyclicSubtitleLayout received arithmetic exception", e);
            i2 = 0;
        }
        this.A00 = i2;
        if (this.A04 && i3 != i2 && i3 >= 0 && i3 < size) {
            AbstractC167007dF.A0J().post(new RunnableC44088JeD((View) A02.get(i3), (View) A02.get(i2), AbstractC166987dD.A02(getMeasuredHeight())));
            return;
        }
        for (Object obj : A02) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            View view = (View) obj;
            float f = 0.0f;
            if (i4 == this.A00) {
                f = 1.0f;
            }
            view.setAlpha(f);
            view.setTranslationY(0.0f);
            i4 = i5;
        }
    }

    public /* synthetic */ CyclicSubtitleLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyclicSubtitleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A01 = 4000L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyclicSubtitleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyclicSubtitleLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
