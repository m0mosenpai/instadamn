package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.06o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC016906o {
    public static final C06v A00 = new Object();
    public static final C06v A01;

    public static final void A00(List list, int i) {
        C14360o3.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.06v, java.lang.Object] */
    static {
        C06v c06v;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            C14360o3.A0C(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            c06v = (C06v) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            c06v = null;
        }
        A01 = c06v;
    }
}
