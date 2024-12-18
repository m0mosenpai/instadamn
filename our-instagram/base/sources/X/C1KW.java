package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: X.1KW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1KW implements InterfaceC12870lZ {
    public long A00;
    public long A01;
    public final C17320tT A02;

    public static final void A00(C1KW c1kw) {
        long j = c1kw.A01;
        if (j > 0) {
            long currentTimeMillis = c1kw.A00 + (System.currentTimeMillis() - j);
            c1kw.A00 = currentTimeMillis;
            C1CC.A06 = currentTimeMillis;
            InterfaceC19610xo ARD = c1kw.A02.ARD();
            ARD.E7G("foreground_timespent_since_upgrade", c1kw.A00);
            ARD.apply();
            c1kw.A01 = System.currentTimeMillis();
        }
    }

    public C1KW(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C14360o3.A07(defaultSharedPreferences);
        C17320tT c17320tT = new C17320tT(defaultSharedPreferences, "AppUpgradeStatusTracker");
        this.A02 = c17320tT;
        this.A00 = c17320tT.getLong("foreground_timespent_since_upgrade", 0L);
        C218914p.A03(EnumC220415e.A03, this);
        C1CC.A06 = this.A00;
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(2132084945);
        A00(this);
        C0f9.A0A(-1615795892, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        int A03 = C0f9.A03(716366590);
        this.A01 = System.currentTimeMillis();
        C0f9.A0A(2009061671, A03);
    }
}
