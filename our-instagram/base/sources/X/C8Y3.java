package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Y3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8Y3 {
    public final Activity A00;
    public final C8Y1 A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C187198Rm A04;
    public final C183688Ct A05;
    public final C81J A06;
    public final C1813582n A07;
    public final C188598Wy A08;
    public final C8FA A09;
    public final InterfaceC08830cm A0A;

    public C8Y3(Activity activity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C187198Rm c187198Rm, C183688Ct c183688Ct, C81J c81j, C1813582n c1813582n, C8Y1 c8y1, C188598Wy c188598Wy, C8FA c8fa, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(userSession, 6);
        C14360o3.A0B(activity, 8);
        this.A0A = interfaceC08830cm;
        this.A05 = c183688Ct;
        this.A06 = c81j;
        this.A07 = c1813582n;
        this.A09 = c8fa;
        this.A03 = userSession;
        this.A04 = c187198Rm;
        this.A00 = activity;
        this.A08 = c188598Wy;
        this.A01 = c8y1;
        this.A02 = interfaceC11380iw;
    }

    public final void A00(Exception exc) {
        AbstractC12120kG.A07(this.A02.getModuleName(), "Error importing media", exc);
        Number number = (Number) this.A0A.get();
        if (number != null && number.intValue() == 1) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC24383ArQ(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public final void A01(List list, List list2) {
        Number number = (Number) this.A0A.get();
        if (number != null && number.intValue() == 1) {
            return;
        }
        C81Z c81z = this.A07.A00;
        C22P c22p = c81z.A01;
        C81J c81j = this.A06;
        int A00 = C9O2.A00(c22p, c81j, this.A09);
        this.A05.A04 = C198278pc.A0A.A00().A03;
        ArrayList arrayList = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C183978Ee c183978Ee = (C183978Ee) it.next();
                C9O2.A01(c81j, c183978Ee, A00);
                arrayList.add(new C198308pf(c183978Ee));
            }
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C195868lW c195868lW = (C195868lW) it2.next();
                C14360o3.A0B(c195868lW, 0);
                c195868lW.A0d = c81j.A2H;
                c195868lW.A0o = c81j.A2e;
                c195868lW.A0F = A00;
                c195868lW.A0m = c81j.A2G;
                boolean equals = c81z.A01.equals(C22P.A5E);
                if (c81j.A3M) {
                    C44059Jdk A002 = C44059Jdk.A00(c195868lW.A0k, 0);
                    C14360o3.A07(A002);
                    if (A002.A03 >= 15500 && !equals) {
                        Iterator it3 = AbstractC23035ADr.A01(c195868lW, 4, 15000, 5000).iterator();
                        while (it3.hasNext()) {
                            arrayList.add(new C198308pf((C195868lW) it3.next()));
                        }
                    }
                }
                arrayList.add(new C198308pf(c195868lW));
            }
        }
        C01T.A1D(arrayList, new Comparator() { // from class: X.9Oz
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                C198308pf c198308pf = (C198308pf) obj;
                C198308pf c198308pf2 = (C198308pf) obj2;
                AbstractC167017dG.A1N(c198308pf, c198308pf2);
                Medium A003 = c198308pf.A00();
                C14360o3.A0A(A003);
                long j = A003.A0C * 1000;
                Medium A004 = c198308pf2.A00();
                C14360o3.A0A(A004);
                return (j > (A004.A0C * 1000) ? 1 : (j == (A004.A0C * 1000) ? 0 : -1));
            }
        });
        int size = arrayList.size();
        ArrayList arrayList2 = arrayList;
        if (size > 10) {
            ?? subList = arrayList.subList(0, 10);
            new Handler(Looper.getMainLooper()).post(new RunnableC24384ArR(this));
            arrayList2 = subList;
        }
        if (arrayList2.size() > 1) {
            this.A04.A0B(arrayList2);
            return;
        }
        if (arrayList2.size() != 1) {
            return;
        }
        C198308pf c198308pf = (C198308pf) arrayList2.get(0);
        EnumC198268pb enumC198268pb = c198308pf.A05;
        if (enumC198268pb == EnumC198268pb.A04) {
            C188598Wy c188598Wy = this.A08;
            C183978Ee c183978Ee2 = c198308pf.A02;
            if (c183978Ee2 != null) {
                c188598Wy.A03(c183978Ee2, false);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        if (enumC198268pb != EnumC198268pb.A07) {
            return;
        }
        C188598Wy c188598Wy2 = this.A08;
        C195868lW c195868lW2 = c198308pf.A03;
        if (c195868lW2 != null) {
            c188598Wy2.A01(C198318pg.A00, c195868lW2, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
