package X;

import android.graphics.PointF;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.Op0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55734Op0 implements InterfaceC148026lY {
    public SurfaceCropFilterModel.FitTransformParams A00;
    public SurfaceCropFilterModel.FitTransformParams A01;
    public final /* synthetic */ C56236Oxj A02;

    private void A01(C55982hj c55982hj, float f, float f2, float f3) {
        double d;
        C55942hf c55942hf;
        c55982hj.A06 = false;
        if (Math.abs(f) > 100.0f) {
            View view = this.A02.A01;
            view.getClass();
            d = f / AbstractC166987dD.A07(view);
        } else {
            d = 0.0d;
        }
        c55982hj.A07(d);
        double A01 = AbstractC166987dD.A01(f2, f3);
        C56236Oxj c56236Oxj = this.A02;
        if (A01 > 0.001d) {
            c55942hf = c56236Oxj.A0Y;
        } else {
            c55942hf = c56236Oxj.A0Z;
        }
        c55982hj.A09(c55942hf);
        c55982hj.A06(f3);
        c55982hj.A08(f2, false);
    }

    public C55734Op0(SurfaceCropFilterModel.FitTransformParams fitTransformParams, SurfaceCropFilterModel.FitTransformParams fitTransformParams2, C56236Oxj c56236Oxj, float f, float f2) {
        this.A02 = c56236Oxj;
        this.A00 = fitTransformParams;
        this.A01 = fitTransformParams2;
        c56236Oxj.A0a.A04.add(this);
        A01(c56236Oxj.A0V, -f, fitTransformParams.A00, fitTransformParams2.A00);
        A01(c56236Oxj.A0W, f2, fitTransformParams.A01, fitTransformParams2.A01);
        C55982hj c55982hj = c56236Oxj.A0X;
        c55982hj.A08(fitTransformParams.A02, true);
        if (fitTransformParams2.A02 != fitTransformParams.A02) {
            c55982hj.A07(0.0d);
            c55982hj.A06(fitTransformParams2.A02);
        }
    }

    @Override // X.InterfaceC148026lY
    public final void Cw4(C55952hg c55952hg) {
        C56236Oxj c56236Oxj = this.A02;
        SurfaceCropFilter surfaceCropFilter = c56236Oxj.A08;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = c56236Oxj.A0S;
            C55992hk c55992hk = c56236Oxj.A0X.A09;
            fitTransformParams.A02 = (float) c55992hk.A00;
            C55992hk c55992hk2 = c56236Oxj.A0V.A09;
            fitTransformParams.A00 = (float) c55992hk2.A00;
            C55992hk c55992hk3 = c56236Oxj.A0W.A09;
            fitTransformParams.A01 = (float) c55992hk3.A00;
            surfaceCropFilter.A0M(fitTransformParams);
            C56236Oxj.A03(c56236Oxj);
            if (c55952hg.A00) {
                c55952hg.A04.remove(this);
                if (c56236Oxj.A0D != null && C2J9.A02(c56236Oxj.A0b)) {
                    c56236Oxj.A0c.AAI(new PointF((float) c55992hk2.A00, (float) c55992hk3.A00), c56236Oxj.A0D, (float) c55992hk.A00);
                }
            }
        }
    }

    @Override // X.InterfaceC148026lY
    public final void CzD(C55952hg c55952hg) {
        C56236Oxj c56236Oxj = this.A02;
        SurfaceCropFilter surfaceCropFilter = c56236Oxj.A08;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel.FitTransformParams fitTransformParams = this.A00;
            surfaceCropFilter.A0L(fitTransformParams);
            SurfaceCropFilter surfaceCropFilter2 = c56236Oxj.A08;
            SurfaceCropFilterModel.FitTransformParams fitTransformParams2 = this.A01;
            if (!surfaceCropFilter2.A0Q(fitTransformParams2)) {
                C14360o3.A0B(fitTransformParams, 0);
                fitTransformParams2.A02 = fitTransformParams.A02;
                fitTransformParams2.A00 = fitTransformParams.A00;
                fitTransformParams2.A01 = fitTransformParams.A01;
            }
            A00(c56236Oxj.A0V, fitTransformParams.A00, fitTransformParams2.A00);
            A00(c56236Oxj.A0W, fitTransformParams.A01, fitTransformParams2.A01);
            C55982hj c55982hj = c56236Oxj.A0X;
            double d = c55982hj.A01;
            double d2 = fitTransformParams2.A02;
            if (d != d2) {
                c55982hj.A06(d2);
            }
        }
    }

    private void A00(C55982hj c55982hj, float f, float f2) {
        double d;
        double A01 = AbstractC166987dD.A01(f, f2);
        C55942hf c55942hf = c55982hj.A05;
        if (A01 > 0.001d) {
            C55942hf c55942hf2 = this.A02.A0Y;
            if (c55942hf != c55942hf2) {
                c55982hj.A09(c55942hf2);
                d = f2;
            } else {
                d = f2;
                if (c55982hj.A01 == d) {
                    return;
                }
            }
            c55982hj.A06(d);
            return;
        }
        C55942hf c55942hf3 = this.A02.A0Z;
        if (c55942hf == c55942hf3) {
            return;
        }
        c55982hj.A09(c55942hf3);
    }
}
