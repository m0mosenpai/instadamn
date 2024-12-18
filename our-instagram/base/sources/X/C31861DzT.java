package X;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.DzT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31861DzT extends UGO {
    public float A00;
    public boolean A01;
    public boolean A02;
    public final float A03;
    public final Context A04;
    public final UserSession A05;
    public final C69453Af A06;

    public C31861DzT(Context context, UserSession userSession, C69453Af c69453Af) {
        super(0, 8);
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = c69453Af;
        this.A03 = context.getResources().getDimension(R.dimen.action_bar_immersive_gradient_height);
        this.A02 = true;
        this.A01 = c69453Af.A0A();
    }

    @Override // X.UGO, X.C8S8
    public final int getMovementFlags(RecyclerView recyclerView, C3OO c3oo) {
        C14360o3.A0B(c3oo, 1);
        if (c3oo.itemView.getTag() instanceof C3OS) {
            Object tag = c3oo.itemView.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.ui.ReelFeedTrayViewBinder.Holder");
            View childAt = ((C3OS) tag).A00.getChildAt(0);
            if (C14360o3.A0K(childAt.getContentDescription(), "reels_tray_container") && AbstractC31177DnL.A0J((RecyclerView) childAt).A1c() == 0) {
                return (8 << 8) | (8 << 0);
            }
        }
        return 0;
    }

    @Override // X.C8S8
    public final float getSwipeThreshold(C3OO c3oo) {
        return 0.2f;
    }

    @Override // X.C8S8
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // X.C8S8
    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C3OO c3oo, float f, float f2, int i, boolean z) {
        boolean A1b = AbstractC25233BEq.A1b(canvas, recyclerView, c3oo);
        this.A00 = f;
        View A06 = AbstractC31171DnF.A06(c3oo);
        if (Build.VERSION.SDK_INT >= 30) {
            if (this.A00 >= this.A03) {
                if (this.A02) {
                    A06.performHapticFeedback(16);
                    this.A02 = false;
                }
            } else {
                this.A02 = A1b;
            }
        }
        super.onChildDraw(canvas, recyclerView, c3oo, f, f2, i, z);
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        return false;
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
        boolean z = !this.A01;
        this.A01 = z;
        this.A06.A08(z);
    }
}
