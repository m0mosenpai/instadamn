package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tv0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65839Tv0 extends RecyclerView {
    public final /* synthetic */ ViewPager2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65839Tv0(Context context, ViewPager2 viewPager2) {
        super(context);
        this.A00 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.A00.A0B && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.A00;
        accessibilityEvent.setFromIndex(viewPager2.A00);
        accessibilityEvent.setToIndex(viewPager2.A00);
        accessibilityEvent.setSource(viewPager2.A09.A04);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (super.onTouchEvent(r4) == false) goto L6;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = 1585994793(0x5e885c29, float:4.912887E18)
            int r2 = X.C0f9.A05(r0)
            androidx.viewpager2.widget.ViewPager2 r0 = r3.A00
            boolean r0 = r0.A0B
            if (r0 == 0) goto L14
            boolean r0 = super.onTouchEvent(r4)
            r1 = 1
            if (r0 != 0) goto L15
        L14:
            r1 = 0
        L15:
            r0 = -1229153487(0xffffffffb6bc9b31, float:-5.6209033E-6)
            X.C0f9.A0C(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65839Tv0.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
