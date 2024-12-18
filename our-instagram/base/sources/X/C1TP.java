package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.1TP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1TP {
    public Handler A00;
    public final C1TQ A03;
    public final /* synthetic */ C26951Sq A05;
    public final Object A02 = new Object();
    public final C1TQ A04 = new LinkedList<Runnable>(this) { // from class: X.1TQ
        public final C1TP A00;

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public final /* bridge */ /* synthetic */ boolean add(Object obj) {
            C1TP c1tp;
            if (obj != null && (c1tp = this.A00) != null && c1tp.A00 != null) {
                synchronized (c1tp.A02) {
                    c1tp.A01.add(obj);
                    c1tp.A00.sendEmptyMessageDelayed(1, 100L);
                }
                return true;
            }
            return true;
        }

        {
            this.A00 = this;
        }
    };
    public LinkedList A01 = new LinkedList();

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1TQ] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.1TQ] */
    public C1TP(C26951Sq c26951Sq) {
        this.A05 = c26951Sq;
        final C1TP c1tp = null;
        this.A03 = new LinkedList<Runnable>(c1tp) { // from class: X.1TQ
            public final C1TP A00;

            @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
            public final /* bridge */ /* synthetic */ boolean add(Object obj) {
                C1TP c1tp2;
                if (obj != null && (c1tp2 = this.A00) != null && c1tp2.A00 != null) {
                    synchronized (c1tp2.A02) {
                        c1tp2.A01.add(obj);
                        c1tp2.A00.sendEmptyMessageDelayed(1, 100L);
                    }
                    return true;
                }
                return true;
            }

            {
                this.A00 = c1tp;
            }
        };
    }

    public static void A00(C1TP c1tp) {
        LinkedList linkedList;
        if (c1tp.A00 != null) {
            try {
                C0h7 c0h7 = C1TM.A04;
                C0J8.A09(((Boolean) c0h7.get()).booleanValue(), "Check RefQueuedWork.isSupported() first");
                Object obj = C1TM.A01;
                obj.getClass();
                synchronized (obj) {
                    try {
                        C0J8.A09(((Boolean) c0h7.get()).booleanValue(), "Check RefQueuedWork.isSupported() first");
                        Field field = C1TM.A03;
                        field.getClass();
                        linkedList = (LinkedList) field.get(null);
                        C1TQ c1tq = c1tp.A04;
                        C1TQ c1tq2 = c1tp.A03;
                        C0J8.A09(((Boolean) c0h7.get()).booleanValue(), "Check RefQueuedWork.isSupported() first");
                        Object obj2 = C1TM.A01;
                        obj2.getClass();
                        synchronized (obj2) {
                            Field field2 = C1TM.A03;
                            field2.getClass();
                            field2.set(null, c1tq);
                            Field field3 = C1TM.A02;
                            field3.getClass();
                            field3.set(null, c1tq2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (linkedList != null) {
                    synchronized (c1tp.A02) {
                        try {
                            c1tp.A01.addAll(linkedList);
                            c1tp.A00.sendEmptyMessageDelayed(1, 100L);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                c1tp.A05.A0C(e);
            }
        }
    }

    public final void A01() {
        C0h7 c0h7 = C1TM.A04;
        if (((Boolean) c0h7.get()).booleanValue()) {
            C0J8.A09(((Boolean) c0h7.get()).booleanValue(), "Check RefQueuedWork.isSupported() first");
            Handler handler = C1TM.A00;
            handler.getClass();
            final Looper looper = handler.getLooper();
            this.A00 = new Handler(looper) { // from class: X.1TR
                @Override // android.os.Handler
                public final void handleMessage(Message message) {
                    LinkedList linkedList;
                    if (message.what == 1) {
                        C1TP c1tp = this;
                        if (c1tp.A00 != null) {
                            synchronized (c1tp.A02) {
                                c1tp.A00.removeMessages(1);
                                linkedList = c1tp.A01;
                                c1tp.A01 = new LinkedList();
                            }
                            Iterator it = linkedList.iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                        }
                    }
                }
            };
            A00(this);
            if (Build.VERSION.SDK_INT >= 31) {
                C0HU.A03(new AbstractC04410Lh() { // from class: X.1TS
                    @Override // X.AbstractC04410Lh, X.C0HV
                    public final void A76(Message message, C0HT c0ht, String str) {
                        int i = message.what;
                        if (i != 115 && i != 116 && i != 159) {
                            return;
                        }
                        Handler.Callback callback = c0ht.A00;
                        if (callback == null || !callback.handleMessage(message)) {
                            c0ht.A01.handleMessage(message);
                        }
                        try {
                            C1TP.A00(C1TP.this);
                        } catch (Exception unused) {
                        }
                    }

                    @Override // X.AbstractC04410Lh, X.C0HV
                    public final boolean DSx(Message message, C0HT c0ht, String str) {
                        int i;
                        if (!"ActivityThread".equals(str) || ((i = message.what) != 115 && i != 116 && i != 159)) {
                            return false;
                        }
                        C1TP.A00(C1TP.this);
                        return true;
                    }
                });
                if (C0HQ.A00 == null) {
                    try {
                        C0HQ.A00 = new C0HT(C0BK.A00());
                    } catch (Exception unused) {
                        this.A05.A0A("Unable to hijack ActivityThread");
                    }
                }
            }
        }
    }
}
