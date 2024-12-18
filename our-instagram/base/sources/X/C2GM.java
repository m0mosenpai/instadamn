package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2GM, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2GM {
    public static boolean A06;
    public static final InterfaceC09390do A07 = AbstractC09440dt.A01(C2GN.A00);
    public int A00;
    public InterfaceC58362lv A01;
    public InterfaceC58362lv A02;
    public C69572Vrb A03;
    public final List A04 = new ArrayList();
    public final List A05 = new ArrayList();

    public final void A01(C2I1 c2i1, C2I1 c2i12, String str) {
        Number number;
        int i = 0;
        this.A00 = 0;
        C47522Gc c47522Gc = ((C2GL) this).A04;
        C14360o3.A07(A07.getValue());
        long currentTimeMillis = System.currentTimeMillis();
        C2Hn c2Hn = c47522Gc.A00;
        c2Hn.A01 = currentTimeMillis;
        c47522Gc.A00();
        c2Hn.A00++;
        c47522Gc.A00();
        if (c2i1 != null) {
            c2Hn.A03 = c2i1;
            c47522Gc.A00();
        }
        if (c2i12 != null) {
            c2Hn.A04 = c2i12;
            c47522Gc.A00();
        }
        if (A06) {
            if (!AbstractC001900j.A0T(str) && (number = (Number) c2Hn.A05.get(str)) != null) {
                i = number.intValue();
            }
            c2Hn.A05.put(str, Integer.valueOf(i + 1));
            c47522Gc.A00();
        }
    }
}
