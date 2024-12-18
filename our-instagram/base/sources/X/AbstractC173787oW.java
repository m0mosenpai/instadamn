package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7oW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC173787oW {
    public static C88X A00(CameraAREffect cameraAREffect) {
        if (cameraAREffect == null) {
            C0w9.A03("DialElementConverter", "fromAREffect() found null cameraArEffect");
            return C88X.A0T;
        }
        C189128Zd c189128Zd = new C189128Zd(null, cameraAREffect, C88Z.A04, cameraAREffect.A07, null, null, cameraAREffect.A0S, null);
        c189128Zd.A09 = false;
        return new C88X(c189128Zd);
    }

    public static C88X A01(CameraAREffect cameraAREffect, ProductItemWithAR productItemWithAR) {
        return new C88X(new C189128Zd(null, cameraAREffect, C88Z.A04, cameraAREffect.A07, productItemWithAR, null, AbstractC46663Kkg.A00(AbstractC38048Gob.A01(productItemWithAR.BhA()), false), null));
    }

    public static ArrayList A02(C88Z c88z, String str, List list, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraAREffect cameraAREffect = (CameraAREffect) it.next();
            if (cameraAREffect == null) {
                C0w9.A03("DialElementConverter", "fromAREffects() found null cameraArEffect");
            } else {
                C189128Zd c189128Zd = new C189128Zd(null, cameraAREffect, c88z, cameraAREffect.A07, null, null, cameraAREffect.A0S, null);
                c189128Zd.A09 = z;
                c189128Zd.A0A = cameraAREffect.A0K.equals(str);
                arrayList.add(new C88X(c189128Zd));
            }
        }
        return arrayList;
    }
}
