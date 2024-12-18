package com.facebook.browser.lite.views;

import X.C05F;
import X.C0f9;
import X.C55982hj;
import X.RunnableC71240WqV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes11.dex */
public class BrowserLiteGestureDelegateView extends LinearLayout {
    public int A00;
    public GestureDetector A01;
    public View A02;
    public BrowserLiteWrapperView A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    private boolean A00() {
        this.A05 = false;
        if (this.A06) {
            this.A06 = false;
            return false;
        }
        float translationY = this.A02.getTranslationY();
        float height = this.A03.getHeight() * 0.2f;
        BrowserLiteWrapperView browserLiteWrapperView = this.A03;
        if (translationY > height) {
            browserLiteWrapperView.A07.A09(BrowserLiteWrapperView.A0C);
            browserLiteWrapperView.A05(new RunnableC71240WqV(browserLiteWrapperView), 0.0d, browserLiteWrapperView.getHeight(), true);
            browserLiteWrapperView.A08 = true;
            return true;
        }
        browserLiteWrapperView.A07.A04();
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer num;
        C55982hj c55982hj;
        BrowserLiteWrapperView browserLiteWrapperView = this.A03;
        if (browserLiteWrapperView == null || !this.A08 || browserLiteWrapperView.A08) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                A00();
            }
        } else {
            BrowserLiteWrapperView browserLiteWrapperView2 = this.A03;
            if (browserLiteWrapperView2.A08) {
                return false;
            }
            if (browserLiteWrapperView2.getChromeContainerLocationInWindow() == null) {
                num = C05F.A0N;
            } else if (r4[1] > motionEvent.getRawY()) {
                num = C05F.A00;
            } else if (motionEvent.getRawY() > r4[1] + this.A03.A06.getHeightPx()) {
                num = C05F.A0C;
            } else {
                num = C05F.A01;
            }
            this.A04 = num;
            BrowserLiteWrapperView browserLiteWrapperView3 = this.A03;
            if (!browserLiteWrapperView3.A08 && (c55982hj = browserLiteWrapperView3.A07) != null) {
                c55982hj.A0D.clear();
                c55982hj.A0A(browserLiteWrapperView3.A0B);
                c55982hj.A01();
            }
        }
        return this.A01.onTouchEvent(motionEvent);
    }

    public BrowserLiteGestureDelegateView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        BrowserLiteWrapperView browserLiteWrapperView;
        int A05 = C0f9.A05(-1134559594);
        boolean z = false;
        if (this.A08 && (browserLiteWrapperView = this.A03) != null && !browserLiteWrapperView.A08) {
            boolean onTouchEvent = this.A01.onTouchEvent(motionEvent);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 && action != 3) {
                    if (onTouchEvent || super.onTouchEvent(motionEvent)) {
                        z = true;
                    }
                    i = 1411668866;
                } else {
                    z = A00();
                    i = 332757770;
                }
            } else {
                C0f9.A0C(-1808168411, A05);
                return true;
            }
        } else {
            i = -1461012081;
        }
        C0f9.A0C(i, A05);
        return z;
    }

    public BrowserLiteGestureDelegateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
