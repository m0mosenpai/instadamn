package X;

import android.os.Handler;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.4rW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106744rW implements Comparator, InterfaceC12870lZ {
    public final int A00;
    public final int A01;
    public final Handler A02;
    public final RunnableC106764rY A03;
    public final C25301Lk A04;
    public final Map A05;
    public final Map A06;
    public final java.util.Set A07;
    public final TreeSet A08;

    /* JADX WARN: Type inference failed for: r0v4, types: [X.4rY] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.01p, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.01p, java.util.Map] */
    public C106744rW(int i, int i2) {
        C25301Lk c25301Lk = new C25301Lk(AbstractC12290kX.A00, new InterfaceC25281Li() { // from class: X.4rX
            @Override // X.InterfaceC25281Li
            public final /* bridge */ /* synthetic */ String EOt(Object obj) {
                StringWriter stringWriter = new StringWriter();
                C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                AbstractC69927Vxs.A00(A0A, (C69479Vo2) obj);
                A0A.close();
                return stringWriter.toString();
            }

            @Override // X.InterfaceC25281Li
            public final /* bridge */ /* synthetic */ Object E3T(String str) {
                return AbstractC69927Vxs.parseFromJson(C16V.A00(str));
            }
        }, 914945323);
        ?? c005001p = new C005001p(0);
        ?? c005001p2 = new C005001p(0);
        Handler handler = new Handler(C1CG.A00());
        this.A07 = new HashSet();
        this.A03 = new Runnable() { // from class: X.4rY
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                C106744rW c106744rW = C106744rW.this;
                Iterator it = c106744rW.A07.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    it.remove();
                    C25301Lk c25301Lk2 = c106744rW.A04;
                    Object obj = c106744rW.A05.get(str);
                    obj.getClass();
                    c25301Lk2.A05(str, obj);
                }
                int i3 = c106744rW.A00;
                if (i3 <= 0) {
                    return;
                }
                while (true) {
                    TreeSet treeSet = c106744rW.A08;
                    if (treeSet.size() > i3) {
                        C69479Vo2 c69479Vo2 = (C69479Vo2) treeSet.pollFirst();
                        c69479Vo2.getClass();
                        Object remove = c106744rW.A05.remove(C106744rW.A00(c69479Vo2.A0B, c69479Vo2.A06, c69479Vo2.A01));
                        if (remove != null) {
                            z = true;
                            if (remove == c69479Vo2) {
                                C02R.A05(z);
                            }
                        }
                        z = false;
                        C02R.A05(z);
                    } else {
                        return;
                    }
                }
            }
        };
        this.A04 = c25301Lk;
        this.A05 = c005001p;
        this.A02 = handler;
        this.A06 = c005001p2;
        this.A08 = new TreeSet(this);
        this.A00 = i;
        this.A01 = i2;
        C218914p.A03(EnumC220415e.A03, this);
    }

    public static String A00(String str, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append("-");
        sb.append(j2);
        sb.append("-");
        sb.append(str.hashCode());
        return sb.toString();
    }

    public static void A01(C106744rW c106744rW, C69479Vo2 c69479Vo2, String str) {
        Map map = c106744rW.A05;
        Object obj = map.get(str);
        if (obj != null) {
            c106744rW.A08.remove(obj);
        }
        map.put(str, c69479Vo2);
        c106744rW.A08.add(c69479Vo2);
        c106744rW.A07.add(str);
        Handler handler = c106744rW.A02;
        RunnableC106764rY runnableC106764rY = c106744rW.A03;
        handler.removeCallbacks(runnableC106764rY);
        handler.postDelayed(runnableC106764rY, 500L);
    }

    public static void A02(C106744rW c106744rW, String str) {
        List list = (List) c106744rW.A06.remove(str);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c106744rW.A03((C106724rU) it.next());
            }
        }
    }

    public final void A03(C106724rU c106724rU) {
        String A00;
        YOy c70572Wd6;
        String str = c106724rU.A0B;
        if (str.hashCode() % this.A01 != 0) {
            return;
        }
        switch (c106724rU.A09) {
            case SPAN_ADDED:
                long j = c106724rU.A05;
                A00 = A00(str, j, j + c106724rU.A02);
                c70572Wd6 = new C70570Wd4(c106724rU, this, A00);
                break;
            case SPAN_REMOVED:
                long j2 = c106724rU.A05;
                A00 = A00(str, j2, j2 + c106724rU.A02);
                c70572Wd6 = new C70572Wd6(c106724rU, this, A00);
                break;
            case SPAN_TOUCHED:
                long j3 = c106724rU.A04;
                A00 = A00(str, j3, j3 + c106724rU.A03);
                c70572Wd6 = new C70571Wd5(c106724rU, this, A00);
                break;
            default:
                return;
        }
        C69479Vo2 c69479Vo2 = (C69479Vo2) this.A05.get(A00);
        if (c69479Vo2 != null) {
            c70572Wd6.DNH(c69479Vo2);
            return;
        }
        Map map = this.A06;
        List list = (List) map.get(A00);
        if (list != null) {
            list.add(c106724rU);
        } else {
            map.put(A00, new ArrayList());
            this.A04.A03(new YEU(c70572Wd6, this, A00), A00);
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (((C69479Vo2) obj).A04 > ((C69479Vo2) obj2).A04 ? 1 : (((C69479Vo2) obj).A04 == ((C69479Vo2) obj2).A04 ? 0 : -1));
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(-1862185450);
        this.A02.post(this.A03);
        C0f9.A0A(-1735118791, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(-30726832, C0f9.A03(-1854713680));
    }
}
