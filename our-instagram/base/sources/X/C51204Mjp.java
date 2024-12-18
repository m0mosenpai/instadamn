package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Mjp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51204Mjp extends AbstractC55586OmP {
    public float A00;
    public float A01;
    public final /* synthetic */ C52612NPh A02;

    @Override // X.C7LD
    public final boolean DMd(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A1R = AbstractC167007dF.A1R(0, recyclerView, motionEvent);
        if (motionEvent.getAction() == 0) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(A1R);
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
        } else if (motionEvent.getAction() == 2) {
            if (AbstractC166987dD.A01(motionEvent.getRawY(), this.A01) > AbstractC166987dD.A01(motionEvent.getRawX(), this.A00)) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                return false;
            }
        }
        return false;
    }

    public C51204Mjp(C52612NPh c52612NPh) {
        this.A02 = c52612NPh;
    }
}
