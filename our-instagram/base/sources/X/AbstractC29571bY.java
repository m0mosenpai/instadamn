package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29571bY extends AbstractC29601bb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC29571bY(C1YP c1yp) {
        super(c1yp);
        C14360o3.A0B(c1yp, 1);
    }

    public abstract void bind(InterfaceC37561ot interfaceC37561ot, Object obj);

    public final void insert(Iterable iterable) {
        C14360o3.A0B(iterable, 0);
        InterfaceC37561ot acquire = acquire();
        try {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.ATY();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection collection) {
        C14360o3.A0B(collection, 0);
        InterfaceC37561ot acquire = acquire();
        try {
            long[] jArr = new long[collection.size()];
            int i = 0;
            for (Object obj : collection) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                bind(acquire, obj);
                jArr[i] = acquire.ATY();
                i = i2;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection collection) {
        C14360o3.A0B(collection, 0);
        InterfaceC37561ot acquire = acquire();
        Iterator it = collection.iterator();
        try {
            int size = collection.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(acquire, it.next());
                lArr[i] = Long.valueOf(acquire.ATY());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List insertAndReturnIdsList(Collection collection) {
        C14360o3.A0B(collection, 0);
        InterfaceC37561ot acquire = acquire();
        try {
            C01L A1I = C0eM.A1I();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                A1I.add(Long.valueOf(acquire.ATY()));
            }
            return C0eM.A1J(A1I);
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(Object obj) {
        InterfaceC37561ot acquire = acquire();
        try {
            bind(acquire, obj);
            return acquire.ATY();
        } finally {
            release(acquire);
        }
    }

    public final void insert(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        InterfaceC37561ot acquire = acquire();
        try {
            for (Object obj : objArr) {
                bind(acquire, obj);
                acquire.ATY();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        InterfaceC37561ot acquire = acquire();
        try {
            int length = objArr.length;
            long[] jArr = new long[length];
            int i = 0;
            int i2 = 0;
            while (i < length) {
                bind(acquire, objArr[i]);
                jArr[i2] = acquire.ATY();
                i++;
                i2++;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        InterfaceC37561ot acquire = acquire();
        C0s6 c0s6 = new C0s6(objArr);
        try {
            int length = objArr.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                bind(acquire, c0s6.next());
                lArr[i] = Long.valueOf(acquire.ATY());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List insertAndReturnIdsList(Object[] objArr) {
        C14360o3.A0B(objArr, 0);
        InterfaceC37561ot acquire = acquire();
        try {
            C01L A1I = C0eM.A1I();
            for (Object obj : objArr) {
                bind(acquire, obj);
                A1I.add(Long.valueOf(acquire.ATY()));
            }
            return C0eM.A1J(A1I);
        } finally {
            release(acquire);
        }
    }

    public final void insert(Object obj) {
        InterfaceC37561ot acquire = acquire();
        try {
            bind(acquire, obj);
            acquire.ATY();
        } finally {
            release(acquire);
        }
    }
}
