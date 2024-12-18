package X;

import android.os.Build;
import android.view.ViewGroup;
import com.facebook.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TyK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66022TyK {
    public static AbstractC66024TyM A01 = new UK9();
    public static ThreadLocal A02 = new ThreadLocal();
    public static ArrayList A00 = new ArrayList();

    /* JADX WARN: Type inference failed for: r1v0, types: [X.01p, X.0yX, java.lang.Object] */
    public static C20030yX A00() {
        C20030yX c20030yX;
        ThreadLocal threadLocal = A02;
        Reference reference = (Reference) threadLocal.get();
        if (reference != null && (c20030yX = (C20030yX) reference.get()) != null) {
            return c20030yX;
        }
        ?? c005001p = new C005001p(0);
        threadLocal.set(new WeakReference(c005001p));
        return c005001p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, X.TyO, android.view.View$OnAttachStateChangeListener] */
    public static UK8 A01(ViewGroup viewGroup, AbstractC66024TyM abstractC66024TyM) {
        ArrayList arrayList = A00;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (abstractC66024TyM.A0a()) {
            arrayList.add(viewGroup);
            AbstractC66024TyM clone = abstractC66024TyM.clone();
            UK2 uk2 = new UK2();
            uk2.A0e(clone);
            A03(viewGroup, uk2);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj = new Object();
            obj.A01 = uk2;
            obj.A00 = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
            viewGroup.invalidate();
            return uk2.A05();
        }
        throw new IllegalArgumentException("The Transition must support seeking.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, X.TyO, android.view.View$OnAttachStateChangeListener] */
    public static void A02(ViewGroup viewGroup, AbstractC66024TyM abstractC66024TyM) {
        ArrayList arrayList = A00;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (abstractC66024TyM == null) {
                abstractC66024TyM = A01;
            }
            AbstractC66024TyM clone = abstractC66024TyM.clone();
            A03(viewGroup, clone);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj = new Object();
            obj.A01 = clone;
            obj.A00 = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    public static void A03(ViewGroup viewGroup, AbstractC66024TyM abstractC66024TyM) {
        AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((AbstractC66024TyM) it.next()).A0O(viewGroup);
            }
        }
        abstractC66024TyM.A0T(viewGroup, true);
        viewGroup.getTag(R.id.transition_current_scene);
    }
}
