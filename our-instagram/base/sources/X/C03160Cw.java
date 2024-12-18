package X;

import android.os.Message;
import android.os.Parcelable;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Cw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03160Cw {
    public static C03160Cw A07;
    public static C0IZ A08;
    public static boolean A09;
    public static boolean A0A;
    public static final C03720In A0B;
    public static final Object A0C;
    public final C05440Qt A00;
    public final C0D4 A01;
    public final C05340Qh A02;
    public final C0Cz A03;
    public final C0D6 A04;
    public final C0D8 A05;
    public final C0H5 A06;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Qh] */
    public C03160Cw(final C0Cz c0Cz, C0D4 c0d4, final C0D6 c0d6, final C0H5 c0h5) {
        this.A06 = c0h5;
        this.A01 = c0d4;
        this.A03 = c0Cz;
        this.A04 = c0d6;
        final C0D8 c0d8 = new C0D8(c0Cz, c0h5);
        this.A05 = c0d8;
        this.A00 = new C05440Qt(this);
        this.A02 = new C0DC(this, c0Cz, c0d6, c0d8, c0h5) { // from class: X.0Qh
            public final C03160Cw A00;
            public final C0D6 A01;

            {
                this.A00 = this;
                this.A01 = c0d6;
            }

            @Override // X.C0DC
            public final /* bridge */ /* synthetic */ Parcelable A00(Object obj) {
                Class cls;
                Message message = (Message) obj;
                if (message != null) {
                    C0D6 c0d62 = this.A01;
                    Object obj2 = message.obj;
                    if (obj2 == null || (cls = c0d62.A03) == null || !cls.isAssignableFrom(obj2.getClass())) {
                        return null;
                    }
                    return (Parcelable) obj2;
                }
                return null;
            }

            @Override // X.C0DC
            public final /* bridge */ /* synthetic */ boolean A02(AbstractC05460Qv abstractC05460Qv, EnumC05430Qs enumC05430Qs, int i) {
                List list;
                C03160Cw c03160Cw = this.A00;
                C0D4 c0d42 = c03160Cw.A01;
                C05440Qt c05440Qt = c03160Cw.A00;
                if (C0D4.A0C && !C0D4.A0B) {
                    if (c05440Qt != null) {
                        synchronized (c0d42.A01) {
                            SparseArray sparseArray = c0d42.A00;
                            list = (List) sparseArray.get(i);
                            if (list == null) {
                                list = new ArrayList(2);
                                sparseArray.put(i, list);
                            }
                        }
                        list.size();
                        synchronized (list) {
                            list.add(c05440Qt);
                        }
                        AbstractC03770Is.A02(true, 1);
                        return true;
                    }
                    throw new IllegalArgumentException(String.format("Cannot hook activity thread with what: %d since the hook was null", Integer.valueOf(i)));
                }
                throw new IllegalStateException("Must init ActivityThreadHooker first");
            }

            @Override // X.C0DC
            public final /* bridge */ /* synthetic */ boolean A04(AbstractC05380Qm abstractC05380Qm, Object obj) {
                WeakReference weakReference;
                C0J8.A06(!abstractC05380Qm.A0A);
                if (obj != null) {
                    weakReference = new WeakReference(obj);
                } else {
                    weakReference = null;
                }
                abstractC05380Qm.A08 = weakReference;
                abstractC05380Qm.A0B = true;
                return true;
            }
        };
    }

    static {
        C03720In c03720In = new C03720In("ActivityLifecycleHook");
        A0B = c03720In;
        A0C = new Object();
        C0IZ c0iz = c03720In.A00;
        if (c0iz == null) {
            synchronized (c03720In) {
                c0iz = c03720In.A00;
                if (c0iz == null) {
                    c0iz = new C0IZ(c03720In.A01);
                    c03720In.A00 = c0iz;
                }
            }
        }
        A08 = c0iz;
    }
}
