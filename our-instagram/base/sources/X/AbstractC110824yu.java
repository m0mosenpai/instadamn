package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4yu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC110824yu {
    public int A00 = -1;
    public View A01;
    public AbstractC70663Fe A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C110834yv A07;

    public abstract void A02();

    public abstract void A04(View view, C110834yv c110834yv, C3F5 c3f5);

    public abstract void A05(C110834yv c110834yv, C3F5 c3f5, int i, int i2);

    public PointF A00(int i) {
        Object obj = this.A02;
        if (obj instanceof InterfaceC70673Ff) {
            return ((InterfaceC70673Ff) obj).AIz(i);
        }
        android.util.Log.w("RecyclerView", AnonymousClass001.A0R("You should override computeScrollVectorForPosition when the LayoutManager does not implement ", InterfaceC70673Ff.class.getCanonicalName()));
        return null;
    }

    public final void A01() {
        if (this.A05) {
            this.A05 = false;
            A02();
            this.A03.mState.A06 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            AbstractC70663Fe abstractC70663Fe = this.A02;
            if (abstractC70663Fe.A06 == this) {
                abstractC70663Fe.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    public final void A03(int i, int i2) {
        PointF A00;
        RecyclerView recyclerView = this.A03;
        if (this.A00 == -1 || recyclerView == null) {
            A01();
        }
        if (this.A04 && this.A01 == null && this.A02 != null && (A00 = A00(this.A00)) != null) {
            float f = A00.x;
            if (f != 0.0f || A00.y != 0.0f) {
                recyclerView.A0w((int) Math.signum(f), null, (int) Math.signum(A00.y));
            }
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            if (RecyclerView.A03(view) == this.A00) {
                View view2 = this.A01;
                C3F5 c3f5 = recyclerView.mState;
                C110834yv c110834yv = this.A07;
                A04(view2, c110834yv, c3f5);
                c110834yv.A01(recyclerView);
                A01();
            } else {
                android.util.Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.A01 = null;
            }
        }
        if (this.A05) {
            C3F5 c3f52 = recyclerView.mState;
            C110834yv c110834yv2 = this.A07;
            A05(c110834yv2, c3f52, i, i2);
            boolean z = false;
            if (c110834yv2.A04 >= 0) {
                z = true;
            }
            c110834yv2.A01(recyclerView);
            if (z && this.A05) {
                this.A04 = true;
                recyclerView.mViewFlinger.A00();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.4yv, java.lang.Object] */
    public AbstractC110824yu() {
        ?? obj = new Object();
        obj.A04 = -1;
        obj.A06 = false;
        obj.A00 = 0;
        obj.A02 = 0;
        obj.A03 = 0;
        obj.A01 = Integer.MIN_VALUE;
        obj.A05 = null;
        this.A07 = obj;
    }
}
