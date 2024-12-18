package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TyO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnAttachStateChangeListenerC66026TyO implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public AbstractC66024TyM A01;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewGroup viewGroup = this.A00;
        MSX.A13(viewGroup, this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC66022TyK.A00;
        ViewGroup viewGroup2 = this.A00;
        if (arrayList.remove(viewGroup2)) {
            C20030yX A00 = AbstractC66022TyK.A00();
            AbstractCollection abstractCollection = (AbstractCollection) A00.get(viewGroup2);
            ArrayList arrayList2 = null;
            if (abstractCollection == null) {
                abstractCollection = new ArrayList();
                A00.put(viewGroup2, abstractCollection);
            } else if (abstractCollection.size() > 0) {
                arrayList2 = new ArrayList(abstractCollection);
            }
            AbstractC66024TyM abstractC66024TyM = this.A01;
            abstractCollection.add(abstractC66024TyM);
            abstractC66024TyM.A0A(new C66033TyV(0, A00, this));
            abstractC66024TyM.A0T(viewGroup2, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC66024TyM) it.next()).A0P(viewGroup2);
                }
            }
            abstractC66024TyM.A0R(viewGroup2);
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.A00;
        MSX.A13(viewGroup, this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC66022TyK.A00;
        ViewGroup viewGroup2 = this.A00;
        arrayList.remove(viewGroup2);
        AbstractCollection abstractCollection = (AbstractCollection) AbstractC66022TyK.A00().get(viewGroup2);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((AbstractC66024TyM) it.next()).A0P(viewGroup2);
            }
        }
        AbstractC66024TyM abstractC66024TyM = this.A01;
        abstractC66024TyM.A0C.A02.clear();
        abstractC66024TyM.A0C.A00.clear();
        abstractC66024TyM.A0C.A03.A07();
    }
}
