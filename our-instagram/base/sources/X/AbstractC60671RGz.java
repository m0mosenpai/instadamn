package X;

import com.google.android.gms.common.Feature;

/* renamed from: X.RGz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC60671RGz extends SPV {
    public final boolean A04(C69C c69c) {
        if (this instanceof C60670RGy) {
            return ((C60670RGy) this).A00.A01;
        }
        if (this instanceof C60668RGw) {
            SGM sgm = (SGM) c69c.A08.get(((C60668RGw) this).A00);
            if (sgm != null && sgm.A00.A01) {
                return true;
            }
            return false;
        }
        return ((C60667RGv) this).A00.A00.A01;
    }

    public final Feature[] A05(C69C c69c) {
        if (this instanceof C60670RGy) {
            return ((C60670RGy) this).A00.A02;
        }
        if (this instanceof C60668RGw) {
            c69c.A08.get(((C60668RGw) this).A00);
            return null;
        }
        return null;
    }
}
