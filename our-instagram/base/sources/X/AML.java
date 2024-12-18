package X;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AML {
    public int A00;
    public int A01;
    public InterfaceC178817wt A02;
    public Integer A03;
    public boolean A05;
    public final Handler A06;
    public final InterfaceC178207vu A0A;
    public final C178747wm A0B;
    public final SparseArray A08 = new SparseArray();
    public final SparseArray A07 = new SparseArray();
    public Integer A04 = C05F.A00;
    public final Map A0C = AbstractC166987dD.A1G();
    public final Map A0D = AbstractC166987dD.A1G();
    public final SparseArray A09 = new SparseArray();

    public static void A00(C22811A4e c22811A4e, AML aml, int i, int i2) {
        Map map = aml.A0C;
        map.getClass();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            int A0B = AbstractC167007dF.A0B(it);
            Object obj = aml.A08.get(A0B);
            obj.getClass();
            int A0H = AbstractC166987dD.A0H(obj);
            Object obj2 = aml.A07.get(A0B);
            obj2.getClass();
            int A0H2 = AbstractC166987dD.A0H(obj2);
            if (A03(aml)) {
                A01(c22811A4e, aml, A0B, A0H, A0H2, i, i2);
            } else {
                aml.A06.post(new RunnableC24889Azo(c22811A4e, aml, A0B, A0H, A0H2, i, i2));
            }
        }
        Map map2 = aml.A0D;
        map2.getClass();
        Iterator it2 = map2.keySet().iterator();
        while (it2.hasNext()) {
            int A0B2 = AbstractC167007dF.A0B(it2);
            Object obj3 = aml.A08.get(A0B2);
            obj3.getClass();
            int A0H3 = AbstractC166987dD.A0H(obj3);
            Object obj4 = aml.A07.get(A0B2);
            obj4.getClass();
            int A0H4 = AbstractC166987dD.A0H(obj4);
            if (A03(aml)) {
                A01(c22811A4e, aml, A0B2, A0H3, A0H4, i, i2);
            } else {
                aml.A06.post(new RunnableC24889Azo(c22811A4e, aml, A0B2, A0H3, A0H4, i, i2));
            }
        }
    }

    public static void A01(C22811A4e c22811A4e, AML aml, int i, int i2, int i3, int i4, int i5) {
        SparseArray sparseArray = aml.A08;
        sparseArray.getClass();
        SparseArray sparseArray2 = aml.A07;
        sparseArray2.getClass();
        if (sparseArray.get(i) == null || AbstractC166987dD.A0H(sparseArray.get(i)) != i2 || sparseArray2.get(i) == null || AbstractC166987dD.A0H(sparseArray2.get(i)) != i3 || aml.A01 != i4 || aml.A00 != i5) {
            sparseArray.put(i, Integer.valueOf(i2));
            sparseArray2.put(i, Integer.valueOf(i3));
            aml.A01 = i4;
            aml.A00 = i5;
            Map map = aml.A0C;
            map.getClass();
            Integer valueOf = Integer.valueOf(i);
            if ((!map.containsKey(valueOf) && !aml.A0D.containsKey(valueOf)) || sparseArray.get(i) == null || AbstractC166987dD.A0H(sparseArray.get(i)) == 0 || sparseArray2.get(i) == null || AbstractC166987dD.A0H(sparseArray2.get(i)) == 0 || aml.A01 == 0 || aml.A00 == 0) {
                return;
            }
            map.get(valueOf);
            AZ9 az9 = (AZ9) aml.A0D.get(valueOf);
            if (az9 != null) {
                az9.A01(i2, i3, 0);
            }
            aml.A02.FBm(i, i2, i3, aml.A05, i4, i5);
            if (c22811A4e == null) {
                return;
            }
            C179977yn c179977yn = c22811A4e.A00;
            List list = c179977yn.A0B.A00;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((InterfaceC175477rN) list.get(i6)).DX9(i4, i5, 0, 0, c179977yn.A03);
            }
        }
    }

    public static boolean A03(AML aml) {
        return AbstractC167007dF.A1X(aml.A06.getLooper(), Looper.myLooper());
    }

    public AML(Handler handler, InterfaceC178207vu interfaceC178207vu, C178747wm c178747wm, boolean z) {
        this.A0A = interfaceC178207vu;
        this.A06 = handler;
        this.A0B = c178747wm;
        this.A05 = z;
    }

    public static void A02(AML aml, C22814A4h c22814A4h, java.util.Set set, boolean z) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            int i = aml.A01;
            int i2 = aml.A00;
            Integer valueOf = Integer.valueOf(i);
            AZA aza = new AZA(aml.A0B, Integer.valueOf(i2), 0, valueOf, 5);
            aml.A02.BQq().A8h(aza, intValue);
            SparseArray sparseArray = aml.A09;
            sparseArray.put(intValue, aza);
            final AZA aza2 = (AZA) sparseArray.get(intValue);
            aza2.getClass();
            final AZF azf = new AZF(aml, c22814A4h, num);
            if (aza2.A09 == null) {
                azf.DEF(AbstractC166987dD.A14("GlContext is null during takePhoto()"));
            } else {
                aza2.A00.A00.post(new Runnable() { // from class: X.AuE
                    @Override // java.lang.Runnable
                    public final void run() {
                        aza2.A00(azf);
                    }
                });
            }
        }
        if (z) {
            aml.A02.EGZ(null);
        }
    }

    public final void A04(C22814A4h c22814A4h, boolean z) {
        HashSet A1H = AbstractC166987dD.A1H();
        AbstractC166997dE.A1W(A1H, 0);
        if (A03(this)) {
            A02(this, c22814A4h, A1H, z);
        } else {
            this.A06.post(new RunnableC24823Ayj(this, c22814A4h, A1H, z));
        }
    }
}
