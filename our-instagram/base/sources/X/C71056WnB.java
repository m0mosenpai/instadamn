package X;

import android.view.MotionEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WnB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71056WnB implements InterfaceC149626oF {
    public final List A00;

    @Override // X.InterfaceC149626oF
    public final boolean DMc(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC149626oF) it.next()).DMc(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC149626oF
    public final boolean Du7(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        List list = this.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((InterfaceC149626oF) it.next()).Du7(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC149626oF
    public final void EJW(float f, float f2) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC149626oF) it.next()).EJW(f, f2);
        }
    }

    @Override // X.InterfaceC149626oF
    public final void destroy() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC149626oF) it.next()).destroy();
        }
    }

    public C71056WnB(List list) {
        this.A00 = list;
    }
}
