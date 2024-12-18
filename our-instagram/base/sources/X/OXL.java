package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.common.ui.widget.draggable.DraggableContainer;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
public final class OXL {
    public AbstractC54808OKe A00;
    public WeakReference A01;
    public final Map A02 = AbstractC166987dD.A1G();

    public static final synchronized java.util.Set A00(OXL oxl, Class cls) {
        java.util.Set A1H;
        synchronized (oxl) {
            Map map = oxl.A02;
            if (map.containsKey(cls)) {
                Object obj = map.get(cls);
                if (obj != null) {
                    A1H = (java.util.Set) obj;
                } else {
                    throw AbstractC166997dE.A0g();
                }
            } else {
                A1H = AbstractC166987dD.A1H();
            }
        }
        return A1H;
    }

    public final synchronized void A01() {
        AbstractC54808OKe abstractC54808OKe = this.A00;
        if (abstractC54808OKe != null) {
            Iterator it = A00(this, abstractC54808OKe.getClass()).iterator();
            while (it.hasNext()) {
                ((InterfaceC58141Pq6) it.next()).DCB();
            }
        }
    }

    public final synchronized void A02(InterfaceC58141Pq6 interfaceC58141Pq6, Class cls) {
        Map map = this.A02;
        java.util.Set set = (java.util.Set) map.get(cls);
        if (set == null) {
            set = AbstractC166987dD.A1H();
            map.put(cls, set);
        }
        set.add(interfaceC58141Pq6);
    }

    public final synchronized void A03(InterfaceC58141Pq6 interfaceC58141Pq6, Class cls) {
        Map map = this.A02;
        java.util.Set set = (java.util.Set) map.get(cls);
        if (set != null) {
            set.remove(interfaceC58141Pq6);
            if (set.isEmpty()) {
                map.remove(cls);
            }
        }
    }

    public final synchronized void A05(boolean z) {
        AbstractC54808OKe abstractC54808OKe = this.A00;
        if (abstractC54808OKe != null) {
            for (InterfaceC58141Pq6 interfaceC58141Pq6 : A00(this, abstractC54808OKe.getClass())) {
                Object obj = abstractC54808OKe.A00().get();
                if (obj != null) {
                    interfaceC58141Pq6.DC0((View) obj, z);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
    }

    public final void A04(AbstractC54808OKe abstractC54808OKe) {
        if (this.A00 == null) {
            WeakReference weakReference = this.A01;
            if (weakReference != null) {
                DraggableContainer draggableContainer = (DraggableContainer) weakReference.get();
                if (draggableContainer != null) {
                    this.A00 = abstractC54808OKe;
                    AbstractC54808OKe abstractC54808OKe2 = AbstractC54340Nzy.A00.A00;
                    abstractC54808OKe2.getClass();
                    RoundedCornerImageView roundedCornerImageView = draggableContainer.A03;
                    if (roundedCornerImageView == null) {
                        C14360o3.A0F("draggableView");
                        throw C00O.createAndThrow();
                    }
                    abstractC54808OKe2.A01(AbstractC166997dE.A0L(draggableContainer), roundedCornerImageView);
                    roundedCornerImageView.setVisibility(0);
                    roundedCornerImageView.bringToFront();
                    float f = abstractC54808OKe2.A01;
                    Rect rect = draggableContainer.A06;
                    draggableContainer.A00 = f - rect.left;
                    draggableContainer.A01 = abstractC54808OKe2.A02 - rect.top;
                    DraggableContainer.A02(draggableContainer);
                    roundedCornerImageView.setScaleX(1.0f);
                    roundedCornerImageView.setScaleY(1.0f);
                    ViewOnLayoutChangeListenerC55476OkV.A00(roundedCornerImageView, 1, draggableContainer);
                    return;
                }
                throw AbstractC166987dD.A18("No drag container active.");
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166987dD.A18("Previous draggable has not been cleared.");
    }

    public final boolean A06() {
        AbstractC54808OKe abstractC54808OKe = this.A00;
        if (abstractC54808OKe != null && abstractC54808OKe.A00().get() != null) {
            return true;
        }
        return false;
    }
}
