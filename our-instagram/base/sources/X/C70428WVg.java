package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.WVg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70428WVg implements C1WA {
    @Override // X.C1WA
    public final Drawable AM6(Resources resources, C27771Wf c27771Wf, C3QA c3qa) {
        Bitmap CCP;
        AbstractC167027dH.A12(resources, c3qa, c27771Wf);
        C1VI.A00();
        if (!(c3qa instanceof C3Q8)) {
            return null;
        }
        C3Q8 c3q8 = (C3Q8) c3qa;
        C59182nJ c59182nJ = c27771Wf.A0J;
        Boolean bool = true;
        if (bool.equals(((C3Q9) c3q8).A00.get(AbstractC111324zv.A00(2631))) && c59182nJ != null && c59182nJ.A02) {
            CCP = c3q8.CCP();
        } else {
            CCP = c3q8.CCP();
            if (c59182nJ != null) {
                UMS ums = new UMS(resources, CCP);
                if (!c59182nJ.A02) {
                    float[] fArr = c59182nJ.A03;
                    if (fArr != null) {
                        ums.Ec4(fArr);
                        return ums;
                    }
                    ums.Ec5(c59182nJ.A00);
                    return ums;
                }
                ums.ERO(true);
                return ums;
            }
        }
        return new BitmapDrawable(resources, CCP);
    }
}
