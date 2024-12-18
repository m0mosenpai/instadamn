package X;

import android.graphics.Rect;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2ju, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57192ju {
    public InterfaceC57132jo A00;
    public final Handler A04;
    public final C0JO A05;
    public final C9B5 A06;
    public final C2U9 A07;
    public final C57182jt A08;
    public final C57152jq A09;
    public final Runnable A0A;
    public final Rect A03 = new Rect();
    public final Rect A02 = new Rect();
    public final List A0C = new ArrayList();
    public final List A0B = new ArrayList();
    public boolean A01 = false;

    public static void A00(C59062n7 c59062n7, C57192ju c57192ju, InterfaceC58972mv interfaceC58972mv) {
        C59062n7 c59062n72;
        boolean z;
        for (Rect rect : c57192ju.A0B) {
            Rect rect2 = c57192ju.A03;
            Rect rect3 = c57192ju.A02;
            if (interfaceC58972mv.CGl(rect2, rect3, rect) && c59062n7 != (c59062n72 = C59062n7.A07)) {
                C57152jq c57152jq = c57192ju.A09;
                Map map = c57152jq.A03;
                C3QX c3qx = (C3QX) map.get(c59062n7.A00);
                C57172js c57172js = c57152jq.A02;
                if (c57172js.A01.add(c59062n7)) {
                    c57172js.A00.remove(c59062n7.A00);
                    if (c3qx == null) {
                        long j = c57152jq.A00;
                        c3qx = new C3QX();
                        c3qx.A00 = j;
                        map.put(c59062n7.A00, c3qx);
                    } else {
                        c3qx.A01 = C05F.A01;
                    }
                }
                c3qx.A02.set(rect3);
                c3qx.A03.add(new Rect(rect2));
                C59062n7 c59062n73 = c59062n7.A02;
                if (c59062n73 != c59062n72) {
                    C57172js c57172js2 = c57152jq.A01;
                    if (c57172js2.A01.add(c59062n73)) {
                        c57172js2.A00.remove(c59062n73.A00);
                        z = true;
                    } else {
                        z = false;
                    }
                    C3QX c3qx2 = (C3QX) map.get(c59062n73.A00);
                    if (z) {
                        if (c3qx2 != null) {
                            c3qx2.A03.clear();
                            if (!c57152jq.A04 || c59062n73.A01) {
                                c3qx2.A01 = C05F.A01;
                            }
                        } else {
                            long j2 = c57152jq.A00;
                            c3qx2 = new C3QX();
                            c3qx2.A00 = j2;
                            c3qx2.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                            map.put(c59062n73.A00, c3qx2);
                        }
                    }
                    c3qx2.A03.add(new Rect(rect2));
                }
            }
        }
    }

    public C57192ju(Handler handler, C0JO c0jo, C9B5 c9b5, C2U9 c2u9, C57182jt c57182jt, C57152jq c57152jq) {
        this.A06 = c9b5;
        this.A07 = c2u9;
        this.A05 = c0jo;
        this.A09 = c57152jq;
        this.A08 = c57182jt;
        this.A04 = handler;
        final Exception exc = new Exception();
        this.A0A = new Runnable() { // from class: X.2jv
            @Override // java.lang.Runnable
            public final void run() {
                Map map;
                Collection values;
                C59062n7 c59062n7;
                try {
                    C57192ju c57192ju = C57192ju.this;
                    if (c57192ju.A01) {
                        long now = c57192ju.A05.now();
                        int A03 = C0f9.A03(1585838814);
                        C2U9 c2u92 = c57192ju.A07;
                        List list = c57192ju.A0B;
                        c2u92.A00(list);
                        C57152jq c57152jq2 = c57192ju.A09;
                        c57152jq2.A03(now, list);
                        List<InterfaceC58972mv> list2 = c57192ju.A0C;
                        if (list2.isEmpty()) {
                            C57182jt c57182jt2 = c57192ju.A08;
                            synchronized (c57182jt2) {
                                try {
                                    map = c57182jt2.A02;
                                    list2.addAll(map.keySet());
                                    if (c57182jt2.A00.A00) {
                                        java.util.Set keySet = c57182jt2.A01.keySet();
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj : keySet) {
                                            if (!map.containsKey((InterfaceC58972mv) obj)) {
                                                arrayList.add(obj);
                                            }
                                        }
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            list2.add((InterfaceC58972mv) it.next());
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            for (InterfaceC58972mv interfaceC58972mv : list2) {
                                if (c57192ju.A06.A00) {
                                    synchronized (c57182jt2) {
                                        C14360o3.A0B(interfaceC58972mv, 0);
                                        C59062n7 c59062n72 = (C59062n7) map.get(interfaceC58972mv);
                                        if (c59062n72 != null) {
                                            C57192ju.A00(c59062n72, c57192ju, interfaceC58972mv);
                                        }
                                        Map map2 = (Map) c57182jt2.A01.get(interfaceC58972mv);
                                        if (map2 != null && (values = map2.values()) != null) {
                                            Iterator it2 = values.iterator();
                                            while (it2.hasNext()) {
                                                C57192ju.A00((C59062n7) it2.next(), c57192ju, interfaceC58972mv);
                                            }
                                        }
                                    }
                                } else {
                                    synchronized (c57182jt2) {
                                        C14360o3.A0B(interfaceC58972mv, 0);
                                        c59062n7 = (C59062n7) map.get(interfaceC58972mv);
                                        if (c59062n7 == null) {
                                            c59062n7 = C59062n7.A07;
                                            C14360o3.A08(c59062n7);
                                        }
                                    }
                                    C57192ju.A00(c59062n7, c57192ju, interfaceC58972mv);
                                }
                            }
                            c57152jq2.A02();
                            InterfaceC57132jo interfaceC57132jo = c57192ju.A00;
                            if (interfaceC57132jo != null) {
                                interfaceC57132jo.DiQ();
                            }
                            list2.clear();
                            C0f9.A0A(1308436298, A03);
                            c57192ju.A04.postDelayed(c57192ju.A0A, 100L);
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        C0f9.A0A(140104659, A03);
                    }
                } catch (Exception e) {
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    StackTraceElement[] stackTrace2 = exc.getStackTrace();
                    int length = stackTrace.length;
                    int length2 = stackTrace2.length;
                    StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) Arrays.copyOf(stackTrace, length + length2);
                    System.arraycopy(stackTrace2, 0, stackTraceElementArr, length, length2);
                    e.setStackTrace(stackTraceElementArr);
                    throw e;
                }
            }
        };
    }
}
