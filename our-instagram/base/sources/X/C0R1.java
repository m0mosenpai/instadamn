package X;

import android.content.Context;

/* renamed from: X.0R1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0R1 implements InterfaceC08830cm {
    public final int A00;
    public final Object A01;

    public C0R1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC08830cm
    public final Object get() {
        switch (this.A00) {
            case 0:
                return ((C0eG) this.A01).A01();
            case 1:
                return new C0eL((Context) this.A01);
            case 2:
                return this.A01;
            case 3:
                final C38141q1 c38141q1 = (C38141q1) this.A01;
                return new Object() { // from class: X.0wd
                };
            case 4:
                return ((Context) this.A01).getSharedPreferences("acra_criticaldata_store", 0).getString("CLIENT_USER_ID", "");
            case 5:
                return Boolean.valueOf(((Context) this.A01).getSharedPreferences("acra_criticaldata_store", 0).getBoolean("IS_EMPLOYEE", false));
            default:
                return C16030qx.A02.A04((Context) this.A01);
        }
    }
}
