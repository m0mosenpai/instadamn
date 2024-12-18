package X;

import android.view.View;
import java.util.List;

/* loaded from: classes7.dex */
public final class H8I extends C668630d {
    public final int A00;
    public final Object A01;

    public H8I(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        switch (this.A00) {
            case 0:
                ((C41583IaW) this.A01).A01.CwX();
                return;
            case 1:
                HHG hhg = (HHG) this.A01;
                List list = HHG.A0U;
                if (hhg.A09 != C05F.A0Y) {
                    return;
                }
                HHG.A00(hhg);
                return;
            default:
                super.Dnk(c55982hj);
                return;
        }
    }

    @Override // X.C668630d, X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        float f;
        switch (this.A00) {
            case 1:
                C14360o3.A0B(c55982hj, 0);
                HHG.A02((HHG) this.A01, c55982hj.A09.A00);
                return;
            case 2:
                C14360o3.A0B(c55982hj, 0);
                float f2 = (float) c55982hj.A09.A00;
                C56043OuF c56043OuF = (C56043OuF) this.A01;
                View view = c56043OuF.A02;
                if (view != null) {
                    view.setScaleX(f2);
                    View view2 = c56043OuF.A02;
                    if (view2 != null) {
                        view2.setScaleY(f2);
                        View view3 = c56043OuF.A02;
                        if (view3 != null) {
                            view3.setAlpha(f2);
                            return;
                        }
                    }
                }
                C14360o3.A0F("useInCameraButtonView");
                throw C00O.createAndThrow();
            case 3:
                if (c55982hj != null) {
                    f = (float) c55982hj.A09.A00;
                } else {
                    f = 0.0f;
                }
                ((View) this.A01).setAlpha(f);
                return;
            default:
                super.Dnm(c55982hj);
                return;
        }
    }
}
