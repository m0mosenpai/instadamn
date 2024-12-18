package X;

import android.content.Intent;
import android.os.IBinder;
import java.util.Locale;

/* loaded from: classes10.dex */
public abstract class Q8F extends AbstractServiceC09080dF {
    public AbstractC07490aO A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC08100bW A05 = new Object();

    public abstract IBinder A00(Intent intent);

    public final void A03(String str, Object... objArr) {
        this.A05.EHA("SecureBaseLifecycleServiceWithSwitchOff", AbstractC58318PtA.A0o(Locale.US, str, AbstractC166997dE.A1b(objArr, 1)), new Throwable());
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final IBinder onBind(Intent intent) {
        C14360o3.A0B(intent, 0);
        super.onBind(intent);
        if (!C08310bt.A02().A00(this, intent, this)) {
            C07610aa c07610aa = AbstractC08070bT.A00;
            C14360o3.A08(c07610aa);
            String str = this.A01;
            if (str == null) {
                C14360o3.A0F("endpointName");
                throw C00O.createAndThrow();
            }
            c07610aa.A00(intent, str, "onBind", "deny");
            return null;
        }
        IBinder A00 = A00(intent);
        if (A00 == null) {
            return null;
        }
        return new BinderC58705Q2j(this, A00, new C57549PgN(this, 28));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bW, java.lang.Object] */
    public Q8F() {
        AbstractC07490aO abstractC07490aO = AbstractC07490aO.A01;
        C14360o3.A08(abstractC07490aO);
        this.A00 = abstractC07490aO;
    }

    public void A01() {
        super.onCreate();
    }

    public void A02() {
        super.onDestroy();
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onCreate() {
        int i;
        int A04 = C0f9.A04(-1650889166);
        if (this.A02) {
            A03("Class javaClass called onCreate twice.", new Object[0]);
            super.onCreate();
            i = 1356842321;
        } else {
            try {
                this.A02 = true;
                this.A01 = AnonymousClass001.A0R(getPackageName(), "/javaClass");
                A01();
                this.A02 = false;
                i = 1712109789;
            } catch (Throwable th) {
                this.A02 = false;
                C0f9.A0B(354876315, A04);
                throw th;
            }
        }
        C0f9.A0B(i, A04);
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final void onDestroy() {
        int i;
        int A04 = C0f9.A04(1239881210);
        if (this.A03) {
            A03("Class javaClass called onDestroy twice.", new Object[0]);
            super.onDestroy();
            i = 1251363520;
        } else {
            try {
                this.A03 = true;
                A02();
                this.A03 = false;
                i = 1115409019;
            } catch (Throwable th) {
                this.A03 = false;
                C0f9.A0B(-411468035, A04);
                throw th;
            }
        }
        C0f9.A0B(i, A04);
    }

    @Override // X.AbstractServiceC09080dF, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand;
        int i3;
        int A04 = C0f9.A04(399160793);
        if (this.A04) {
            A03("Class javaClass called onStartCommand twice.", new Object[0]);
            C07610aa c07610aa = AbstractC08070bT.A00;
            C14360o3.A08(c07610aa);
            String str = this.A01;
            if (str != null) {
                c07610aa.A00(intent, str, "onStartCommand", "deny");
                onStartCommand = super.onStartCommand(intent, i, i2);
                i3 = 1249133935;
                C0f9.A0B(i3, A04);
                return onStartCommand;
            }
            C14360o3.A0F("endpointName");
            throw C00O.createAndThrow();
        }
        if (!C08310bt.A02().A00(this, intent, this)) {
            C07610aa c07610aa2 = AbstractC08070bT.A00;
            C14360o3.A08(c07610aa2);
            String str2 = this.A01;
            if (str2 != null) {
                c07610aa2.A00(intent, str2, "onStartCommand", "deny");
                onStartCommand = super.onStartCommand(intent, i, i2);
                i3 = -850287889;
                C0f9.A0B(i3, A04);
                return onStartCommand;
            }
            C14360o3.A0F("endpointName");
            throw C00O.createAndThrow();
        }
        if (!this.A00.A00(this, intent, this.A05, this)) {
            C07610aa c07610aa3 = AbstractC08070bT.A00;
            C14360o3.A08(c07610aa3);
            String str3 = this.A01;
            if (str3 != null) {
                c07610aa3.A00(intent, str3, "onStartCommand", "deny");
                onStartCommand = super.onStartCommand(intent, i, i2);
                i3 = -157459124;
            }
            C14360o3.A0F("endpointName");
            throw C00O.createAndThrow();
        }
        try {
            this.A04 = true;
            C07610aa c07610aa4 = AbstractC08070bT.A00;
            C14360o3.A08(c07610aa4);
            String str4 = this.A01;
            if (str4 == null) {
                C14360o3.A0F("endpointName");
                throw C00O.createAndThrow();
            }
            c07610aa4.A00(intent, str4, "onStartCommand", "allow");
            onStartCommand = onStartCommand(intent, i, i2);
            this.A04 = false;
            i3 = 1255304309;
        } catch (Throwable th) {
            this.A04 = false;
            C0f9.A0B(1332405780, A04);
            throw th;
        }
        C0f9.A0B(i3, A04);
        return onStartCommand;
    }
}
