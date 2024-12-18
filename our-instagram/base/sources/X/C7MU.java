package X;

import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.7MU, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7MU {
    public static final void A00(Drawable drawable, int i) {
        boolean z = drawable instanceof InterfaceC161477Li;
        Object obj = drawable;
        if (!z) {
            if (drawable instanceof ShapeDrawable) {
                Shader shader = ((ShapeDrawable) drawable).getPaint().getShader();
                boolean z2 = shader instanceof InterfaceC161477Li;
                obj = shader;
                if (!z2) {
                    return;
                }
            } else {
                if (!(drawable instanceof LayerDrawable)) {
                    return;
                }
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                C17u A0C = C17s.A0C(0, layerDrawable.getNumberOfLayers());
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0C, 10));
                Iterator it = A0C.iterator();
                while (it.hasNext()) {
                    arrayList.add(layerDrawable.getDrawable(((AbstractC16880sg) it).A00()));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (obj2 instanceof ShapeDrawable) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((ShapeDrawable) it2.next()).getPaint().getShader());
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (obj3 instanceof InterfaceC161477Li) {
                        arrayList4.add(obj3);
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC161477Li) it3.next()).Eg1(i);
                }
                return;
            }
        }
        ((InterfaceC161477Li) obj).Eg1(i);
    }
}
