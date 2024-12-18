package X;

import android.view.View;

/* loaded from: classes12.dex */
public final class Y9X implements YPH {
    public final /* synthetic */ Y2I A00;

    public Y9X(Y2I y2i) {
        this.A00 = y2i;
    }

    @Override // X.YPH
    public final float Awk() {
        C174867qM c174867qM = this.A00.A05;
        c174867qM.getClass();
        View view = (View) c174867qM.A00.get();
        if (view != null) {
            return view.getContext().getResources().getDisplayMetrics().density;
        }
        return 0.0f;
    }

    @Override // X.YPH
    public final int getHeight() {
        C174867qM c174867qM = this.A00.A05;
        c174867qM.getClass();
        View view = (View) c174867qM.A00.get();
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    @Override // X.YPH
    public final int getWidth() {
        C174867qM c174867qM = this.A00.A05;
        c174867qM.getClass();
        View view = (View) c174867qM.A00.get();
        if (view != null) {
            return view.getWidth();
        }
        return 0;
    }
}
