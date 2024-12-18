package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.2jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57112jm {
    public InterfaceC57132jo A00;
    public C57212jw A01;
    public final C9B5 A04;
    public final InterfaceC57092jk A05;
    public final C57102jl A06;
    public final LinkedHashMap A03 = new LinkedHashMap();
    public final InterfaceC57132jo A02 = new InterfaceC57132jo() { // from class: X.2jn
        @Override // X.InterfaceC57132jo
        public final void DiQ() {
            ArrayList arrayList;
            C57112jm c57112jm = C57112jm.this;
            LinkedHashMap linkedHashMap = c57112jm.A03;
            synchronized (linkedHashMap) {
                arrayList = new ArrayList(linkedHashMap.size());
                for (Runnable runnable : linkedHashMap.values()) {
                    if (runnable != null) {
                        arrayList.add(runnable);
                    }
                }
                linkedHashMap.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            InterfaceC57132jo interfaceC57132jo = c57112jm.A00;
            if (interfaceC57132jo != null) {
                interfaceC57132jo.DiQ();
            }
        }
    };

    public final void A04(View view) {
        C58962mu c58962mu;
        if (view != null) {
            c58962mu = AbstractC58952mt.A00(view);
        } else {
            c58962mu = null;
        }
        A02(null, this, c58962mu);
    }

    public final void A05(View view, C59062n7 c59062n7) {
        C58962mu c58962mu;
        if (view != null) {
            c58962mu = AbstractC58952mt.A00(view);
        } else {
            c58962mu = null;
        }
        A01(null, c59062n7, this, c58962mu);
    }

    public final void A07(View view, AbstractC56982jZ abstractC56982jZ, InterfaceC57142jp... interfaceC57142jpArr) {
        InterfaceC57092jk interfaceC57092jk = this.A05;
        interfaceC57092jk.clear();
        for (InterfaceC57142jp interfaceC57142jp : interfaceC57142jpArr) {
            interfaceC57092jk.A7i(interfaceC57142jp);
        }
        A03(new C2U9(view, interfaceC57092jk), abstractC56982jZ, new C57152jq(this.A06, true));
    }

    public static C57112jm A00() {
        return new C57112jm(new C9B5(), new C57082jj(), null);
    }

    public static void A01(C43041yX c43041yX, C59062n7 c59062n7, C57112jm c57112jm, InterfaceC58972mv interfaceC58972mv) {
        C57182jt c57182jt;
        C57212jw c57212jw = c57112jm.A01;
        if (c57212jw != null && interfaceC58972mv != null && c59062n7 != null) {
            if (c57112jm.A04.A00 && c43041yX != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(interfaceC58972mv.hashCode());
                sb.append("_");
                sb.append(c59062n7.A05);
                sb.append(c43041yX);
                c59062n7.A00 = sb.toString();
                if (c57212jw.A00.A00) {
                    C57182jt c57182jt2 = c57212jw.A01;
                    synchronized (c57182jt2) {
                        Map map = c57182jt2.A01;
                        Object obj = map.get(interfaceC58972mv);
                        if (obj == null) {
                            obj = new WeakHashMap();
                            map.put(interfaceC58972mv, obj);
                        }
                        ((Map) obj).put(c43041yX, c59062n7);
                    }
                    return;
                }
                c57182jt = c57212jw.A01;
                synchronized (c57182jt) {
                    c57182jt.A02.put(interfaceC58972mv, c59062n7);
                }
            } else {
                c57182jt = c57212jw.A01;
                synchronized (c57182jt) {
                    c57182jt.A02.put(interfaceC58972mv, c59062n7);
                }
            }
        }
    }

    public static void A02(C43041yX c43041yX, C57112jm c57112jm, InterfaceC58972mv interfaceC58972mv) {
        C57182jt c57182jt;
        C57212jw c57212jw = c57112jm.A01;
        if (c57212jw != null && interfaceC58972mv != null) {
            if (c57112jm.A04.A00 && c43041yX != null) {
                if (c57212jw.A00.A00) {
                    C57182jt c57182jt2 = c57212jw.A01;
                    synchronized (c57182jt2) {
                        Map map = c57182jt2.A01;
                        Map map2 = (Map) map.get(interfaceC58972mv);
                        if (map2 != null) {
                            map2.remove(c43041yX);
                            if (map2.isEmpty()) {
                                map.remove(interfaceC58972mv);
                            }
                        }
                    }
                    return;
                }
                c57182jt = c57212jw.A01;
                synchronized (c57182jt) {
                    c57182jt.A02.remove(interfaceC58972mv);
                }
            } else {
                c57182jt = c57212jw.A01;
                synchronized (c57182jt) {
                    c57182jt.A02.remove(interfaceC58972mv);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0JO, java.lang.Object] */
    private void A03(C2U9 c2u9, AbstractC56982jZ abstractC56982jZ, C57152jq c57152jq) {
        C9B5 c9b5 = this.A04;
        C57182jt c57182jt = new C57182jt(c9b5);
        C57212jw c57212jw = new C57212jw(c9b5, abstractC56982jZ, c57182jt, new C57192ju(new Handler(Looper.getMainLooper()), new Object(), c9b5, c2u9, c57182jt, c57152jq));
        this.A01 = c57212jw;
        c57212jw.A02.A00 = this.A02;
    }

    public final void A06(View view, AbstractC56982jZ abstractC56982jZ) {
        if (abstractC56982jZ != null && view != null) {
            A03(new C2U9(view, this.A05), abstractC56982jZ, new C57152jq(this.A06, false));
        }
    }

    public final void A08(View view, AbstractC56982jZ abstractC56982jZ, InterfaceC57142jp... interfaceC57142jpArr) {
        if (view != null) {
            InterfaceC57092jk interfaceC57092jk = this.A05;
            interfaceC57092jk.clear();
            for (InterfaceC57142jp interfaceC57142jp : interfaceC57142jpArr) {
                interfaceC57092jk.A7i(interfaceC57142jp);
            }
            A03(new C2U9(view, interfaceC57092jk), abstractC56982jZ, new C57152jq(this.A06, false));
        }
    }

    public C57112jm(C9B5 c9b5, InterfaceC57092jk interfaceC57092jk, C57102jl c57102jl) {
        this.A04 = c9b5;
        this.A05 = interfaceC57092jk;
        this.A06 = c57102jl;
    }
}
