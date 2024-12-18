package X;

import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class Ut1 extends C668630d {
    public final /* synthetic */ C69553VrI A00;

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        float max = (float) Math.max(0.0d, c55982hj.A09.A00);
        View view = this.A00.A00;
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setScaleX(max);
        view.setScaleY(max);
    }

    public Ut1(C69553VrI c69553VrI) {
        this.A00 = c69553VrI;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        this.A00.A00.setTag(R.id.view_bouncer, null);
    }
}
