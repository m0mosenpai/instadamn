package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0BU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0BU {
    public static volatile boolean A03;
    public static final ReadWriteLock A02 = new ReentrantReadWriteLock();
    public static final C0Y2 A00 = new C0Y2();
    public static final List A01 = new ArrayList<C0BT>() { // from class: X.0BS
        {
            add(new C0BT() { // from class: X.0ZY
                @Override // X.C0BT
                public final void DEG(Object obj) {
                    C0BU.A00.A06(obj);
                }

                @Override // X.C0BT
                public final void DWc(Object obj) {
                    C0BU.A00.A07(obj);
                }

                @Override // X.C0BT
                public final void DeZ(Object obj) {
                    C0BU.A00.A05(obj);
                }

                @Override // X.C0BT
                public final void Do6(Object obj) {
                    C0BU.A00.A08(obj);
                }

                @Override // X.C0BT
                public final void Dox(Object obj) {
                    C0BU.A00.A09(obj);
                }
            });
        }
    };

    public static void A00(C0BT c0bt) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.writeLock().lock();
            A01.add(c0bt);
            readWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            A02.writeLock().unlock();
            throw th;
        }
    }

    public static void A01(Object obj) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.readLock().lock();
            List list = A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C0BT) list.get(i)).DeZ(obj);
            }
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A02.readLock().unlock();
            throw th;
        }
    }

    public static void A02(Object obj) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.readLock().lock();
            List list = A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C0BT) list.get(i)).DEG(obj);
            }
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A02.readLock().unlock();
            throw th;
        }
    }

    public static void A03(Object obj) {
        try {
            ReadWriteLock readWriteLock = A02;
            readWriteLock.readLock().lock();
            List list = A01;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C0BT) list.get(i)).DWc(obj);
            }
            readWriteLock.readLock().unlock();
        } catch (Throwable th) {
            A02.readLock().unlock();
            throw th;
        }
    }

    public static boolean A04() {
        if (A03 && !A01.isEmpty()) {
            return true;
        }
        return false;
    }
}
