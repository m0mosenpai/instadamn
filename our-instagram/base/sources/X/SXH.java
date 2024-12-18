package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class SXH {
    public static RNL A0A;
    public static final C64773TTh A0B;
    public final int A00;
    public final InterfaceC65415Tjm A01;
    public final C5KS A02;
    public final C5KS A03;
    public final SXq A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08 = AbstractC166987dD.A1G();
    public final Map A09 = AbstractC166987dD.A1G();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        A0B = new C64773TTh(objArr, 1);
    }

    public SXH(Context context, InterfaceC65415Tjm interfaceC65415Tjm, final SXq sXq, String str) {
        int i;
        this.A05 = context.getPackageName();
        this.A06 = SU6.A00(context);
        this.A04 = sXq;
        this.A01 = interfaceC65415Tjm;
        C62846STt.A00();
        this.A07 = str;
        this.A02 = SXv.A00().A01(new Callable() { // from class: X.TU2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SXs.A01.A00(SXH.this.A07);
            }
        });
        SXv A00 = SXv.A00();
        sXq.getClass();
        this.A03 = A00.A01(new Callable() { // from class: X.TU1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SXq.this.A00();
            }
        });
        C64773TTh c64773TTh = A0B;
        if (c64773TTh.containsKey(str)) {
            i = C63392SjE.A01(context, (String) c64773TTh.get(str), false);
        } else {
            i = -1;
        }
        this.A00 = i;
    }
}
