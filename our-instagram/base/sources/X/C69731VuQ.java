package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: X.VuQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69731VuQ {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public Context A08;
    public GestureDetector A09;
    public VelocityTracker A0A;
    public X97 A0B;
    public X7O A0C;
    public X7P A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public boolean A0J;

    public static void A00(C69731VuQ c69731VuQ) {
        int scaledPagingTouchSlop;
        int scaledTouchSlop;
        if (!c69731VuQ.A0J) {
            Context context = c69731VuQ.A08;
            if (context != null) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                Integer num = c69731VuQ.A0G;
                if (num != null) {
                    scaledPagingTouchSlop = num.intValue();
                } else {
                    scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                }
                Integer num2 = c69731VuQ.A0I;
                if (num2 != null) {
                    scaledTouchSlop = num2.intValue();
                } else {
                    scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                }
                int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                int scaledMaximumFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                c69731VuQ.A0G = Integer.valueOf(scaledPagingTouchSlop);
                c69731VuQ.A0I = Integer.valueOf(scaledTouchSlop);
                c69731VuQ.A07 = scaledMinimumFlingVelocity;
                c69731VuQ.A06 = scaledMaximumFlingVelocity;
                c69731VuQ.A0J = true;
                c69731VuQ.A0J = true;
                c69731VuQ.A08 = null;
                return;
            }
            throw new IllegalStateException("Init Context must not be null");
        }
    }

    public final void A01() {
        Object obj;
        if (this.A0F == C05F.A0C && (obj = this.A0C) != null) {
            AbstractC65703TsZ.A1J((View) obj, false);
        }
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = C05F.A0N;
        VelocityTracker velocityTracker = this.A0A;
        this.A0A = null;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r5 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007a, code lost:
    
        if ((r12.A05 & 1) == 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0113, code lost:
    
        r5 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if ((r12.A05 & 2) == 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012e, code lost:
    
        if ((r12.A05 & 4) == 4) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0130, code lost:
    
        r5 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013b, code lost:
    
        if ((r12.A05 & 8) == 8) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0111, code lost:
    
        if ((r5 & 1) == 1) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69731VuQ.A02(android.view.MotionEvent):boolean");
    }
}
