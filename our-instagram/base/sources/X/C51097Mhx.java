package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mhx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51097Mhx extends C8S8 {
    public final /* synthetic */ ViewOnTouchListenerC51201Mjl A00;

    @Override // X.C8S8
    public final int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
        C14360o3.A0B(recyclerView, 0);
        int interpolateOutOfBoundsScroll = super.interpolateOutOfBoundsScroll(recyclerView, i, i2, i3, j);
        int abs = Math.abs(interpolateOutOfBoundsScroll);
        if (abs < 10) {
            abs = 10;
        } else if (abs > 20) {
            abs = 20;
        }
        return abs * Integer.signum(interpolateOutOfBoundsScroll);
    }

    @Override // X.C8S8
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        boolean intersect;
        boolean A1R = AbstractC167007dF.A1R(0, canvas, recyclerView);
        C14360o3.A0B(c3oo, 2);
        super.onChildDraw(canvas, recyclerView, c3oo, f, f2, i, z);
        ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl = this.A00;
        View A06 = AbstractC31171DnF.A06(c3oo);
        View view = viewOnTouchListenerC51201Mjl.A0A;
        if (view.getVisibility() != 0) {
            intersect = false;
        } else {
            int[] iArr = new int[2];
            A06.getLocationInWindow(iArr);
            int i2 = iArr[0];
            int i3 = iArr[A1R ? 1 : 0];
            C51156Miz c51156Miz = viewOnTouchListenerC51201Mjl.A03;
            if (c51156Miz == null) {
                C14360o3.A0F("adapter");
                throw C00O.createAndThrow();
            }
            Rect A0V = AbstractC166987dD.A0V(i2, i3, c51156Miz.A01() + i2, iArr[A1R ? 1 : 0] + c51156Miz.A00());
            int[] iArr2 = new int[2];
            view.getLocationInWindow(iArr2);
            int i4 = iArr2[0];
            intersect = A0V.intersect(AbstractC166987dD.A0V(i4, iArr2[A1R ? 1 : 0], view.getWidth() + i4, iArr2[A1R ? 1 : 0] + view.getHeight()));
        }
        if (intersect != viewOnTouchListenerC51201Mjl.A06) {
            if (intersect) {
                C2UY.A01.A05(20L);
            }
            viewOnTouchListenerC51201Mjl.A06 = intersect;
        }
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        AbstractC167007dF.A1D(c3oo, 1, c3oo2);
        ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl = this.A00;
        viewOnTouchListenerC51201Mjl.A00 = c3oo2.getAbsoluteAdapterPosition();
        C51156Miz c51156Miz = viewOnTouchListenerC51201Mjl.A03;
        if (c51156Miz == null) {
            AbstractC31171DnF.A0t();
            throw C00O.createAndThrow();
        }
        c51156Miz.notifyItemMoved(c3oo.getAbsoluteAdapterPosition(), viewOnTouchListenerC51201Mjl.A00);
        return true;
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    public C51097Mhx(ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl) {
        this.A00 = viewOnTouchListenerC51201Mjl;
    }

    @Override // X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        return C8S8.makeMovementFlags(51, 0);
    }

    @Override // X.C8S8
    public final void onSelectedChanged(C3OO c3oo, int i) {
        if (c3oo != null) {
            ViewOnTouchListenerC51201Mjl viewOnTouchListenerC51201Mjl = this.A00;
            viewOnTouchListenerC51201Mjl.A04 = true;
            if (!viewOnTouchListenerC51201Mjl.A07) {
                viewOnTouchListenerC51201Mjl.A01 = RecyclerView.A03(c3oo.itemView);
            }
        }
    }
}
