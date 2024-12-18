package X;

import android.os.Handler;
import android.transition.TransitionManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.OZp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55043OZp {
    public static final C55942hf A0B = C55942hf.A02(2.0d);
    public C54820OKy A00;
    public C54820OKy A01;
    public OL3 A02;
    public final ConstraintLayout A03;
    public final C55982hj A04;
    public final C55982hj A05;
    public final C13400mQ A06;
    public final C54485O5n A07;
    public final Map A08 = AbstractC166987dD.A1G();
    public final Map A09 = AbstractC166987dD.A1G();
    public final java.util.Set A0A = AbstractC166987dD.A1H();

    public static void A00(C55043OZp c55043OZp, boolean z) {
        Map map = c55043OZp.A08;
        if (!map.isEmpty()) {
            C110964z8 c110964z8 = new C110964z8();
            C54485O5n c54485O5n = c55043OZp.A07;
            java.util.Set keySet = map.keySet();
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            int A0H = AbstractC166987dD.A0H(Collections.max(keySet));
            ArrayList A1F = AbstractC166987dD.A1F(keySet);
            Collections.sort(A1F);
            for (int i = 0; i < c54485O5n.A00.Bpi(A0H, keySet.size()); i++) {
                ArrayList Bpk = c54485O5n.A00.Bpk(A1F, keySet, i, A0H);
                if (!Bpk.isEmpty()) {
                    A1E.add(Bpk.get(0));
                    A1E2.add(Bpk);
                }
            }
            map.size();
            Iterator it = A1E2.iterator();
            while (it.hasNext()) {
                List list = (List) it.next();
                int size = list.size();
                int[] iArr = new int[size];
                int size2 = list.size();
                float[] fArr = new float[size2];
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj = map.get(list.get(i2));
                    obj.getClass();
                    int id = ((AbstractC54484O5m) obj).A00.getId();
                    iArr[i2] = id;
                    fArr[i2] = 1.0f;
                    if (i2 == 0) {
                        c110964z8.A0C(id, 1, 0, 1);
                    } else {
                        c110964z8.A0C(id, 1, iArr[i2 - 1], 2);
                        c110964z8.A0C(iArr[i2], 3, iArr[0], 3);
                        c110964z8.A0C(iArr[i2], 4, iArr[0], 4);
                    }
                    if (i2 == size - 1) {
                        c110964z8.A0C(iArr[i2], 2, 0, 2);
                    }
                }
                int i3 = 1;
                if (size > 1) {
                    if (size2 == size) {
                        C110964z8.A02(c110964z8, iArr[0]).A03.A04 = fArr[0];
                        C110964z8.A02(c110964z8, iArr[0]).A03.A0Y = 2;
                        c110964z8.A0E(iArr[0], 1, 0, 1, -1);
                        int i4 = 1;
                        do {
                            int i5 = i4 - 1;
                            c110964z8.A0E(iArr[i4], 1, iArr[i5], 2, -1);
                            c110964z8.A0E(iArr[i5], 2, iArr[i4], 1, -1);
                            C110964z8.A02(c110964z8, iArr[i4]).A03.A04 = fArr[i4];
                            i4++;
                        } while (i4 < size);
                        c110964z8.A0E(iArr[size - 1], 2, 0, 2, -1);
                        do {
                            int i6 = iArr[i3];
                            int i7 = c55043OZp.A00.A01;
                            if (i7 > 0) {
                                C110964z8.A02(c110964z8, i6).A03.A0Z = i7;
                            }
                            i3++;
                        } while (i3 < size);
                    } else {
                        throw AbstractC166987dD.A12("must have 2 or more widgets in a chain");
                    }
                }
            }
            int size3 = A1E.size();
            int[] iArr2 = new int[size3];
            int size4 = A1E.size();
            float[] fArr2 = new float[size4];
            for (int i8 = 0; i8 < size3; i8++) {
                Object obj2 = map.get(A1E.get(i8));
                obj2.getClass();
                int id2 = ((AbstractC54484O5m) obj2).A00.getId();
                iArr2[i8] = id2;
                fArr2[i8] = 1.0f;
                if (i8 == 0) {
                    c110964z8.A0C(id2, 3, 0, 3);
                } else {
                    c110964z8.A0C(id2, 3, iArr2[i8 - 1], 4);
                }
                if (i8 == size3 - 1) {
                    c110964z8.A0C(iArr2[i8], 4, 0, 4);
                }
            }
            int i9 = 1;
            if (size3 > 1) {
                if (size4 == size3) {
                    C110964z8.A02(c110964z8, iArr2[0]).A03.A06 = fArr2[0];
                    C110964z8.A02(c110964z8, iArr2[0]).A03.A0s = 2;
                    c110964z8.A0D(iArr2[0], 3, 0, 3);
                    int i10 = 1;
                    do {
                        int i11 = i10 - 1;
                        c110964z8.A0D(iArr2[i10], 3, iArr2[i11], 4);
                        c110964z8.A0D(iArr2[i11], 4, iArr2[i10], 3);
                        C110964z8.A02(c110964z8, iArr2[i10]).A03.A06 = fArr2[i10];
                        i10++;
                    } while (i10 < size3);
                    c110964z8.A0D(iArr2[size3 - 1], 4, 0, 4);
                    do {
                        int i12 = iArr2[i9];
                        int i13 = c55043OZp.A00.A02;
                        if (i13 > 0) {
                            C110964z8.A02(c110964z8, i12).A03.A0p = i13;
                        }
                        i9++;
                    } while (i9 < size3);
                } else {
                    throw AbstractC166987dD.A12("must have 2 or more widgets in a chain");
                }
            }
            if (z) {
                TransitionManager.beginDelayedTransition(c55043OZp.A03);
            }
            c110964z8.A0G(c55043OZp.A03);
            OL3 ol3 = c55043OZp.A02;
            if (ol3 != null) {
                NYQ nyq = (NYQ) ol3;
                NYQ.A00(nyq);
                InterfaceC58002Pnm interfaceC58002Pnm = nyq.A00;
                if (interfaceC58002Pnm != null) {
                    String str = nyq.A03.userId;
                    C55043OZp c55043OZp2 = ((OL3) nyq).A04;
                    Map map2 = c55043OZp2.A08;
                    boolean z2 = false;
                    if (map2.size() >= 1) {
                        Object obj3 = ((OL3) nyq).A05.get(str);
                        C54485O5n c54485O5n2 = c55043OZp2.A07;
                        java.util.Set keySet2 = map2.keySet();
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        ArrayList A1E4 = AbstractC166987dD.A1E();
                        int A0H2 = AbstractC166987dD.A0H(Collections.max(keySet2));
                        ArrayList A1F2 = AbstractC166987dD.A1F(keySet2);
                        Collections.sort(A1F2);
                        for (int i14 = 0; i14 < c54485O5n2.A00.Bpi(A0H2, keySet2.size()); i14++) {
                            ArrayList Bpk2 = c54485O5n2.A00.Bpk(A1F2, keySet2, i14, A0H2);
                            if (!Bpk2.isEmpty()) {
                                A1E3.add(Bpk2.get(0));
                                A1E4.add(Bpk2);
                            }
                        }
                        Iterator A15 = AbstractC166997dE.A15(map2);
                        int i15 = -1;
                        while (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            if (A1K.getValue() == obj3) {
                                i15 = AbstractC166987dD.A0H(A1K.getKey());
                            }
                        }
                        int i16 = 0;
                        while (true) {
                            if (i16 >= A1E4.size()) {
                                break;
                            }
                            if (((List) A1E4.get(i16)).contains(Integer.valueOf(i15))) {
                                if (i16 == 0) {
                                    z2 = true;
                                }
                            } else {
                                i16++;
                            }
                        }
                    }
                    boolean z3 = true;
                    if (map2.size() <= 1) {
                        z3 = false;
                    }
                    interfaceC58002Pnm.DOe(z2, z3);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0mO, java.lang.Object] */
    public C55043OZp(Handler handler, ConstraintLayout constraintLayout, C54820OKy c54820OKy, C54485O5n c54485O5n) {
        this.A03 = constraintLayout;
        constraintLayout.setOptimizationLevel(0);
        this.A00 = c54820OKy;
        this.A07 = c54485O5n;
        c54485O5n.A00 = c54820OKy.A03;
        this.A06 = new C13400mQ(handler, new Object(), 60L);
        C55952hg A00 = AbstractC13560mi.A00();
        C51980MyO c51980MyO = new C51980MyO(this);
        C55982hj A02 = A00.A02();
        C55942hf c55942hf = A0B;
        A02.A09(c55942hf);
        A02.A0A(c51980MyO);
        this.A04 = A02;
        C55982hj A022 = A00.A02();
        A022.A09(c55942hf);
        A022.A0A(c51980MyO);
        this.A05 = A022;
    }
}
