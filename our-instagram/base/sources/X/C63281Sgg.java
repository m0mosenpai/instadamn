package X;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: X.Sgg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63281Sgg {
    public static AbstractC60708RNk A0A;
    public static final C64774TTi A0B;
    public final int A00;
    public final InterfaceC65417Tjo A01;
    public final C5KS A02;
    public final SXq A03;
    public final String A04;
    public final String A05;
    public final Map A06 = AbstractC166987dD.A1G();
    public final Map A07 = AbstractC166987dD.A1G();
    public final C5KS A08;
    public final String A09;

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        A0B = new C64774TTi(objArr, 1);
    }

    public static long A00(List list, double d) {
        return AbstractC58320PtC.A0A(list, Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0));
    }

    public static final String A01(C63281Sgg c63281Sgg) {
        C5KS c5ks = c63281Sgg.A08;
        if (c5ks.A0F()) {
            return (String) c5ks.A06();
        }
        return SXs.A01.A00(c63281Sgg.A09);
    }

    public C63281Sgg(Context context, InterfaceC65417Tjo interfaceC65417Tjo, final SXq sXq, final String str) {
        int i;
        this.A04 = context.getPackageName();
        this.A05 = SU6.A00(context);
        this.A03 = sXq;
        this.A01 = interfaceC65417Tjo;
        this.A09 = str;
        this.A08 = SXv.A00().A01(new Callable() { // from class: X.TU4
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SXs.A01.A00(str);
            }
        });
        SXv A00 = SXv.A00();
        sXq.getClass();
        this.A02 = A00.A01(new Callable() { // from class: X.TU3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SXq.this.A00();
            }
        });
        C64774TTi c64774TTi = A0B;
        if (c64774TTi.containsKey(str)) {
            i = C63392SjE.A01(context, (String) c64774TTi.get(str), false);
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
