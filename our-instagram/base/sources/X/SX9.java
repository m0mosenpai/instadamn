package X;

import android.content.Context;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public final class SX9 {
    public static final C64772TTg A07;
    public final String A00;
    public final InterfaceC65260Tgq A01;
    public final C5KS A02;
    public final C5KS A03;
    public final SXq A04;
    public final Map A05 = AbstractC166987dD.A1G();
    public final Map A06 = AbstractC166987dD.A1G();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        A07 = new C64772TTg(objArr, 1);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.S7J] */
    public SX9(Context context, InterfaceC65260Tgq interfaceC65260Tgq, final SXq sXq, String str) {
        context.getPackageName();
        SU6.A00(context);
        this.A04 = sXq;
        this.A01 = interfaceC65260Tgq;
        synchronized (S7J.class) {
            if (S7J.A00 == null) {
                S7J.A00 = new Object();
            }
        }
        this.A00 = str;
        this.A02 = SXv.A00().A01(new Callable() { // from class: X.TTz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SXs.A01.A00(SX9.this.A00);
            }
        });
        SXv A00 = SXv.A00();
        sXq.getClass();
        this.A03 = A00.A01(new Callable() { // from class: X.TU0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return SXq.this.A00();
            }
        });
        C64772TTg c64772TTg = A07;
        if (c64772TTg.containsKey(str)) {
            C63392SjE.A01(context, (String) c64772TTg.get(str), false);
        }
    }
}
