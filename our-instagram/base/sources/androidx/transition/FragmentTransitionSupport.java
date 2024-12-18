package androidx.transition;

import X.AbstractC66022TyK;
import X.AbstractC66024TyM;
import X.C06v;
import X.C62731SNv;
import X.InterfaceC65297ThV;
import X.UK0;
import X.UK1;
import X.UK2;
import X.UK6;
import X.WT9;
import X.WTA;
import X.XE4;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class FragmentTransitionSupport extends C06v {
    @Override // X.C06v
    public final void A0D(C62731SNv c62731SNv, Fragment fragment, Object obj, Runnable runnable) {
        A0E(c62731SNv, fragment, obj, null, runnable);
    }

    @Override // X.C06v
    public final boolean A0L() {
        return true;
    }

    @Override // X.C06v
    public final Object A02(ViewGroup viewGroup, Object obj) {
        return AbstractC66022TyK.A01(viewGroup, (AbstractC66024TyM) obj);
    }

    @Override // X.C06v
    public final Object A03(Object obj) {
        if (obj != null) {
            return ((AbstractC66024TyM) obj).clone();
        }
        return null;
    }

    @Override // X.C06v
    public final Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        UK2 uk2 = new UK2();
        uk2.A0e((AbstractC66024TyM) obj);
        return uk2;
    }

    @Override // X.C06v
    public final Object A05(Object obj, Object obj2, Object obj3) {
        AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) obj;
        AbstractC66024TyM abstractC66024TyM2 = (AbstractC66024TyM) obj2;
        AbstractC66024TyM abstractC66024TyM3 = (AbstractC66024TyM) obj3;
        if (abstractC66024TyM != null) {
            if (abstractC66024TyM2 != null) {
                UK2 uk2 = new UK2();
                uk2.A0e(abstractC66024TyM);
                abstractC66024TyM = uk2;
                uk2.A0e(abstractC66024TyM2);
                uk2.A03 = false;
            }
        } else {
            abstractC66024TyM = null;
            if (abstractC66024TyM2 != null) {
                abstractC66024TyM = abstractC66024TyM2;
            }
        }
        if (abstractC66024TyM3 != null) {
            UK2 uk22 = new UK2();
            if (abstractC66024TyM != null) {
                uk22.A0e(abstractC66024TyM);
            }
            uk22.A0e(abstractC66024TyM3);
            return uk22;
        }
        return abstractC66024TyM;
    }

    @Override // X.C06v
    public final Object A06(Object obj, Object obj2, Object obj3) {
        UK2 uk2 = new UK2();
        if (obj != null) {
            uk2.A0e((AbstractC66024TyM) obj);
        }
        uk2.A0e((AbstractC66024TyM) obj2);
        return uk2;
    }

    @Override // X.C06v
    public final void A07(Rect rect, Object obj) {
        ((AbstractC66024TyM) obj).A0V(new UK1(rect, this));
    }

    @Override // X.C06v
    public final void A08(View view, Object obj) {
        ((AbstractC66024TyM) obj).A08(view);
    }

    @Override // X.C06v
    public final void A09(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            C06v.A00(view, rect);
            ((AbstractC66024TyM) obj).A0V(new UK0(rect, this));
        }
    }

    @Override // X.C06v
    public final void A0A(View view, Object obj, ArrayList arrayList) {
        ((AbstractC66024TyM) obj).A0A(new WTA(view, this, arrayList));
    }

    @Override // X.C06v
    public final void A0B(View view, Object obj, ArrayList arrayList) {
        AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) obj;
        ArrayList arrayList2 = abstractC66024TyM.A0J;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C06v.A01((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        A0I(abstractC66024TyM, arrayList);
    }

    @Override // X.C06v
    public final void A0C(ViewGroup viewGroup, Object obj) {
        AbstractC66022TyK.A02(viewGroup, (AbstractC66024TyM) obj);
    }

    @Override // X.C06v
    public final void A0E(C62731SNv c62731SNv, Fragment fragment, Object obj, final Runnable runnable, final Runnable runnable2) {
        final AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) obj;
        c62731SNv.A01(new InterfaceC65297ThV() { // from class: X.WQL
            @Override // X.InterfaceC65297ThV
            public final void onCancel() {
                Runnable runnable3 = runnable;
                AbstractC66024TyM abstractC66024TyM2 = abstractC66024TyM;
                Runnable runnable4 = runnable2;
                if (runnable3 == null) {
                    abstractC66024TyM2.A0F();
                    runnable4.run();
                } else {
                    runnable3.run();
                }
            }
        });
        abstractC66024TyM.A0A(new WT9(this, runnable2));
    }

    @Override // X.C06v
    public final void A0F(Object obj) {
        ((XE4) obj).ABO();
    }

    @Override // X.C06v
    public final void A0G(Object obj, float f) {
        XE4 xe4 = (XE4) obj;
        if (xe4.CbZ()) {
            long Azl = xe4.Azl();
            long j = f * ((float) Azl);
            if (j == 0) {
                j = 1;
            }
            if (j == Azl) {
                j = Azl - 1;
            }
            xe4.ESg(j);
        }
    }

    @Override // X.C06v
    public final void A0H(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((AbstractC66024TyM) obj).A0A(new UK6(this, obj2, obj4, arrayList, arrayList3));
    }

    @Override // X.C06v
    public final void A0I(Object obj, ArrayList arrayList) {
        Object obj2;
        AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) obj;
        if (abstractC66024TyM != null) {
            int i = 0;
            if (abstractC66024TyM instanceof UK2) {
                UK2 uk2 = (UK2) abstractC66024TyM;
                int size = uk2.A02.size();
                while (i < size) {
                    if (i >= 0) {
                        ArrayList arrayList2 = uk2.A02;
                        if (i < arrayList2.size()) {
                            obj2 = arrayList2.get(i);
                            A0I(obj2, arrayList);
                            i++;
                        }
                    }
                    obj2 = null;
                    A0I(obj2, arrayList);
                    i++;
                }
                return;
            }
            ArrayList arrayList3 = abstractC66024TyM.A0I;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                ArrayList arrayList4 = abstractC66024TyM.A0J;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        abstractC66024TyM.A08((View) arrayList.get(i));
                        i++;
                    }
                }
            }
        }
    }

    @Override // X.C06v
    public final void A0J(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) obj;
        if (abstractC66024TyM != null) {
            ArrayList arrayList3 = abstractC66024TyM.A0J;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            A0O(abstractC66024TyM, arrayList, arrayList2);
        }
    }

    @Override // X.C06v
    public final void A0K(Runnable runnable, Object obj) {
        ((XE4) obj).ABP(runnable);
    }

    @Override // X.C06v
    public final boolean A0N(Object obj) {
        return ((AbstractC66024TyM) obj).A0a();
    }

    public final void A0O(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Object obj2;
        AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) obj;
        int i = 0;
        if (abstractC66024TyM instanceof UK2) {
            UK2 uk2 = (UK2) abstractC66024TyM;
            int size = uk2.A02.size();
            while (i < size) {
                if (i >= 0) {
                    ArrayList arrayList3 = uk2.A02;
                    if (i < arrayList3.size()) {
                        obj2 = arrayList3.get(i);
                        A0O(obj2, arrayList, arrayList2);
                        i++;
                    }
                }
                obj2 = null;
                A0O(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        ArrayList arrayList4 = abstractC66024TyM.A0I;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            ArrayList arrayList5 = abstractC66024TyM.A0J;
            if (arrayList5.size() == arrayList.size() && arrayList5.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        abstractC66024TyM.A08((View) arrayList2.get(i));
                        i++;
                    }
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        abstractC66024TyM.A09((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // X.C06v
    public final boolean A0M(Object obj) {
        return obj instanceof AbstractC66024TyM;
    }
}
