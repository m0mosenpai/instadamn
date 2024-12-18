package X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.5PR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5PR {
    public boolean A01;
    public C2BC A02;
    public final C5PM A03;
    public final C4W8 A04;
    public final InterfaceC96774Wm A05;
    public final C4WZ A0B;
    public C5PH A00 = new C5PG(new Random(), new int[0]);
    public final IdentityHashMap A07 = new IdentityHashMap();
    public final Map A09 = new HashMap();
    public final List A08 = new ArrayList();
    public final HashMap A06 = new HashMap();
    public final java.util.Set A0A = new HashSet();

    public static void A03(C5PR c5pr, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            List list = c5pr.A08;
            C116485Pd c116485Pd = (C116485Pd) list.remove(i3);
            c5pr.A09.remove(c116485Pd.A03);
            int i4 = -c116485Pd.A02.A01.A02();
            for (int i5 = i3; i5 < list.size(); i5++) {
                ((C116485Pd) list.get(i5)).A00 += i4;
            }
            c116485Pd.A01 = true;
            if (c5pr.A01) {
                A01(c116485Pd, c5pr);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.4Xq] */
    private void A00(C116485Pd c116485Pd) {
        C97004Xl c97004Xl = c116485Pd.A02;
        InterfaceC96694We interfaceC96694We = new InterfaceC96694We() { // from class: X.5Pt
            @Override // X.InterfaceC96694We
            public final void DnO(Timeline timeline, C4XW c4xw) {
                ((C96764Wl) ((C5PL) C5PR.this.A03).A0n).A00.sendEmptyMessage(22);
            }
        };
        C116665Pv c116665Pv = new C116665Pv(c116485Pd, this);
        this.A06.put(c116485Pd, new C116675Pw(c116665Pv, interfaceC96694We, c97004Xl));
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        c97004Xl.A8U(new Handler(myLooper, null), c116665Pv);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper2, null);
        CopyOnWriteArrayList copyOnWriteArrayList = ((C4XV) c97004Xl).A03.A02;
        ?? obj = new Object();
        obj.A00 = handler;
        obj.A01 = c116665Pv;
        copyOnWriteArrayList.add(obj);
        c97004Xl.E5p(this.A0B, interfaceC96694We, this.A02);
    }

    public static void A01(C116485Pd c116485Pd, C5PR c5pr) {
        if (c116485Pd.A01 && c116485Pd.A04.isEmpty()) {
            Object remove = c5pr.A06.remove(c116485Pd);
            remove.getClass();
            C116675Pw c116675Pw = (C116675Pw) remove;
            C4XW c4xw = c116675Pw.A02;
            c4xw.EER(c116675Pw.A01);
            C116665Pv c116665Pv = c116675Pw.A00;
            c4xw.EFJ(c116665Pv);
            c4xw.EFC(c116665Pv);
            c5pr.A0A.remove(c116485Pd);
        }
    }

    public static void A02(C5PR c5pr) {
        Iterator it = c5pr.A0A.iterator();
        while (it.hasNext()) {
            C116485Pd c116485Pd = (C116485Pd) it.next();
            if (c116485Pd.A04.isEmpty()) {
                C116675Pw c116675Pw = (C116675Pw) c5pr.A06.get(c116485Pd);
                if (c116675Pw != null) {
                    c116675Pw.A02.APN(c116675Pw.A01);
                }
                it.remove();
            }
        }
    }

    public final Timeline A04() {
        List list = this.A08;
        if (list.isEmpty()) {
            return Timeline.A00;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C116485Pd c116485Pd = (C116485Pd) list.get(i2);
            c116485Pd.A00 = i;
            i += c116485Pd.A02.A01.A02();
        }
        return new C4YI(this.A00, list);
    }

    public final void A06(C2BC c2bc) {
        C4B8.A04(!this.A01);
        this.A02 = c2bc;
        int i = 0;
        while (true) {
            List list = this.A08;
            if (i < list.size()) {
                C116485Pd c116485Pd = (C116485Pd) list.get(i);
                A00(c116485Pd);
                this.A0A.add(c116485Pd);
                i++;
            } else {
                this.A01 = true;
                return;
            }
        }
    }

    public C5PR(C5PM c5pm, C4W8 c4w8, C4WZ c4wz, InterfaceC96774Wm interfaceC96774Wm) {
        this.A0B = c4wz;
        this.A03 = c5pm;
        this.A04 = c4w8;
        this.A05 = interfaceC96774Wm;
    }

    public final Timeline A05(C5PH c5ph, List list, int i) {
        int i2;
        List list2;
        if (!list.isEmpty()) {
            this.A00 = c5ph;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                C116485Pd c116485Pd = (C116485Pd) list.get(i3 - i);
                if (i3 > 0) {
                    C116485Pd c116485Pd2 = (C116485Pd) this.A08.get(i3 - 1);
                    i2 = c116485Pd2.A00 + c116485Pd2.A02.A01.A02();
                } else {
                    i2 = 0;
                }
                c116485Pd.A00 = i2;
                c116485Pd.A01 = false;
                c116485Pd.A04.clear();
                int A02 = c116485Pd.A02.A01.A02();
                int i4 = i3;
                while (true) {
                    list2 = this.A08;
                    if (i4 >= list2.size()) {
                        break;
                    }
                    ((C116485Pd) list2.get(i4)).A00 += A02;
                    i4++;
                }
                list2.add(i3, c116485Pd);
                this.A09.put(c116485Pd.A03, c116485Pd);
                if (this.A01) {
                    A00(c116485Pd);
                    if (this.A07.isEmpty()) {
                        this.A0A.add(c116485Pd);
                    } else {
                        C116675Pw c116675Pw = (C116675Pw) this.A06.get(c116485Pd);
                        if (c116675Pw != null) {
                            c116675Pw.A02.APN(c116675Pw.A01);
                        }
                    }
                }
            }
        }
        return A04();
    }
}
