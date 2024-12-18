package X;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.4Nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94704Nx implements InterfaceC94694Nw {
    public static final ReentrantLock A02 = new ReentrantLock();
    public static volatile C94704Nx A03;
    public C5O1 A00;
    public final CopyOnWriteArrayList A01 = new CopyOnWriteArrayList();

    @Override // X.InterfaceC94694Nw
    public final void EDM(Context context, C02N c02n, Executor executor) {
        Activity activity;
        Object obj;
        C4PX c4px;
        C14360o3.A0B(context, 0);
        if ((context instanceof Activity) && (activity = (Activity) context) != null) {
            ReentrantLock reentrantLock = A02;
            reentrantLock.lock();
            try {
                C5O1 c5o1 = this.A00;
                if (c5o1 == null) {
                    c02n.accept(new C4PX(C16930sl.A00));
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                    boolean z = false;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (C14360o3.A0K(((C5O9) it.next()).A01, activity)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    C5O9 c5o9 = new C5O9(activity, c02n, executor);
                    copyOnWriteArrayList.add(c5o9);
                    if (!z) {
                        C5O0 c5o0 = (C5O0) c5o1;
                        IBinder A00 = AbstractC94714Ny.A00(activity);
                        if (A00 != null) {
                            c5o0.A02(activity, A00);
                        } else {
                            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new WL7(activity, c5o0));
                        }
                    } else {
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj = it2.next();
                                if (activity.equals(((C5O9) obj).A01)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        C5O9 c5o92 = (C5O9) obj;
                        if (c5o92 != null && (c4px = c5o92.A00) != null) {
                            c5o9.A00 = c4px;
                            c5o9.A03.execute(new C5OA(c4px, c5o9));
                        }
                    }
                }
                return;
            } finally {
                reentrantLock.unlock();
            }
        }
        c02n.accept(new C4PX(C16930sl.A00));
    }

    @Override // X.InterfaceC94694Nw
    public final void F9Z(C02N c02n) {
        C14360o3.A0B(c02n, 0);
        synchronized (A02) {
            C5O1 c5o1 = this.A00;
            if (c5o1 != null) {
                ArrayList arrayList = new ArrayList();
                CopyOnWriteArrayList copyOnWriteArrayList = this.A01;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C5O9 c5o9 = (C5O9) it.next();
                    if (c5o9.A02 == c02n) {
                        arrayList.add(c5o9);
                    }
                }
                copyOnWriteArrayList.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((C5O9) it2.next()).A01;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (C14360o3.A0K(((C5O9) it3.next()).A01, activity)) {
                                break;
                            }
                        }
                    }
                    c5o1.E25(activity);
                }
            }
        }
    }

    public C94704Nx(C5O1 c5o1) {
        this.A00 = c5o1;
        C5O1 c5o12 = this.A00;
        if (c5o12 != null) {
            c5o12.EU0(new C5O5() { // from class: X.5O4
                @Override // X.C5O5
                public final void E26(Activity activity, C4PX c4px) {
                    Iterator it = C94704Nx.this.A01.iterator();
                    while (it.hasNext()) {
                        C5O9 c5o9 = (C5O9) it.next();
                        if (C14360o3.A0K(c5o9.A01, activity)) {
                            C14360o3.A0B(c4px, 0);
                            c5o9.A00 = c4px;
                            c5o9.A03.execute(new C5OA(c4px, c5o9));
                        }
                    }
                }
            });
        }
    }
}
