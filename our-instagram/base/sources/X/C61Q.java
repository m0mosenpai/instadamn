package X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: X.61Q, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C61Q {
    public final int A00;
    public final Context A01;
    public final Looper A02;
    public final C61X A03;
    public final C61W A04;
    public final AbstractC1335861e A05;
    public final C61c A06;
    public final C1335961f A07;
    public final String A08;
    public final InterfaceC1335661b A09;

    public static final C5KS A00(C61Q c61q, SWk sWk, int i) {
        C58411Pup c58411Pup = new C58411Pup();
        InterfaceC1335661b interfaceC1335661b = c61q.A09;
        C1335961f c1335961f = c61q.A07;
        C1335961f.A05(c61q, c1335961f, c58411Pup, sWk.A00);
        SGL sgl = new SGL(c61q, new C60670RGy(interfaceC1335661b, sWk, c58411Pup, i), c1335961f.A0C.get());
        Handler handler = c1335961f.A06;
        handler.sendMessage(handler.obtainMessage(4, sgl));
        return c58411Pup.A00;
    }

    public C61Q(Activity activity, Context context, C61X c61x, C61W c61w, C61Z c61z) {
        String str;
        C3U5.A03(context, "Null context is not permitted.");
        C3U5.A03(c61w, "Api must not be null.");
        C3U5.A03(c61z, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        C3U5.A03(applicationContext, "The provided context did not have an application context.");
        this.A01 = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.A08 = str;
        this.A04 = c61w;
        this.A03 = c61x;
        this.A02 = c61z.A00;
        C61c c61c = new C61c(c61x, c61w, str);
        this.A06 = c61c;
        this.A05 = new C1335761d(this);
        C1335961f A01 = C1335961f.A01(applicationContext);
        this.A07 = A01;
        this.A00 = A01.A0B.getAndIncrement();
        this.A09 = c61z.A01;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC65566Tms A00 = LifecycleCallback.A00(activity);
            C61n c61n = (C61n) A00.Ajs(C61n.class, "ConnectionlessLifecycleHelper");
            c61n = c61n == null ? new C61n(GoogleApiAvailability.A00, A01, A00) : c61n;
            c61n.A00.add(c61c);
            A01.A07(c61n);
        }
        Handler handler = A01.A06;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    public static final void A01(C61Q c61q, AbstractC60658RGk abstractC60658RGk, int i) {
        abstractC60658RGk.A05();
        C1335961f c1335961f = c61q.A07;
        SGL sgl = new SGL(c61q, new RH0(abstractC60658RGk, i), c1335961f.A0C.get());
        Handler handler = c1335961f.A06;
        handler.sendMessage(handler.obtainMessage(4, sgl));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61Q(android.app.Activity r8, X.C61X r9, X.C61W r10, X.InterfaceC1335661b r11) {
        /*
            r7 = this;
            r2 = r8
            android.os.Looper r1 = r8.getMainLooper()
            java.lang.String r0 = "Looper must not be null."
            X.C3U5.A03(r1, r0)
            if (r1 != 0) goto L10
            android.os.Looper r1 = android.os.Looper.getMainLooper()
        L10:
            X.61Z r6 = new X.61Z
            r6.<init>(r1, r11)
            r1 = r7
            r4 = r9
            r5 = r10
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61Q.<init>(android.app.Activity, X.61X, X.61W, X.61b):void");
    }

    public C61Q(Context context, C61X c61x, C61W c61w, C61Z c61z) {
        this(null, context, c61x, c61w, c61z);
    }
}
