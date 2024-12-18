package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.IjT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnClickListenerC41998IjT implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ JHJ A03;
    public final /* synthetic */ SpinnerImageView A04;
    public final /* synthetic */ boolean A05;

    public ViewOnClickListenerC41998IjT(Reel reel, JHJ jhj, SpinnerImageView spinnerImageView, int i, int i2, boolean z) {
        this.A05 = z;
        this.A04 = spinnerImageView;
        this.A03 = jhj;
        this.A02 = reel;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1641911319);
        if (!this.A05) {
            this.A04.setVisibility(0);
        }
        JHJ jhj = this.A03;
        if (jhj != null) {
            jhj.De9(this.A04, AbstractC37301Gc2.A0i(this.A02), 0, this.A00, this.A01);
        }
        C0f9.A0C(-35092826, A05);
    }
}
