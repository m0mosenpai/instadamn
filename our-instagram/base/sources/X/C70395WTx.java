package X;

import android.view.animation.Interpolator;
import com.facebook.android.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedList;

/* renamed from: X.WTx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70395WTx implements XD0, X91 {
    public Interpolator A00;
    public U70 A01;
    public final Collection A02 = new LinkedList();

    @Override // X.XD0
    public final void Cwh(U70 u70) {
    }

    private void A00(U70 u70) {
        Collection<C69049Vgq> collection = this.A02;
        for (C69049Vgq c69049Vgq : collection) {
            ULS uls = c69049Vgq.A00;
            C71196Wpl c71196Wpl = c69049Vgq.A01;
            uls.A0I(c71196Wpl.A03());
            uls.A0H(1.0f);
            c71196Wpl.A04 = null;
        }
        collection.clear();
        u70.A04();
        this.A01 = null;
    }

    @Override // X.X91
    public final void Cwk(U70 u70) {
        float interpolation;
        int i;
        int i2;
        float f = u70.A00;
        for (C69049Vgq c69049Vgq : this.A02) {
            C71196Wpl c71196Wpl = c69049Vgq.A01;
            LatLng A03 = c71196Wpl.A04.A03();
            LatLng A032 = c71196Wpl.A03();
            Interpolator interpolator = this.A00;
            if (interpolator == null) {
                interpolation = f;
            } else {
                interpolation = interpolator.getInterpolation(f);
            }
            double d = A032.A00;
            double d2 = A03.A00;
            double d3 = interpolation;
            double d4 = (d - d2) * d3;
            double d5 = A032.A01;
            double d6 = A03.A01;
            double d7 = d5 - d6;
            if (d7 < -180.0d) {
                i = 360;
            } else {
                i = 0;
                if (d7 > 180.0d) {
                    i = -360;
                }
            }
            double d8 = d2 + d4;
            double d9 = d6 + ((d7 + i) * d3);
            if (d9 < -180.0d) {
                i2 = 360;
            } else {
                i2 = 0;
                if (d9 > 180.0d) {
                    i2 = -360;
                }
            }
            LatLng latLng = new LatLng(d8, d9 + i2);
            ULS uls = c69049Vgq.A00;
            uls.A0I(latLng);
            uls.A0H(f);
        }
    }

    @Override // X.XD0
    public final void CwV(U70 u70) {
        A00(u70);
    }

    @Override // X.XD0
    public final void CwZ(U70 u70) {
        A00(u70);
    }
}
