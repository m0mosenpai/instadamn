package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes8.dex */
public final class LIA {
    public static final SPT A07 = SPT.A00.A00();
    public Context A00;
    public SYR A01;
    public LI3 A02;
    public ContentResolver A03;
    public PackageManager A04;
    public C1Tc A05;
    public InterfaceC27041Tb A06;

    public static void A00(AbstractC59962oe abstractC59962oe, C1P1 c1p1, C07270a1 c07270a1, LIA lia, EnumC31713DwI enumC31713DwI, String str, String str2, boolean z) {
        C47989LJs.A00.A03(c07270a1, enumC31713DwI.A01, "client_start_request_query_verifier", "client sends start message to server to query verifier after auth failed");
        C1ON A01 = AbstractC35276FhB.A01(lia.A00, c07270a1, true, Boolean.valueOf(z), str2, str, true, false);
        A01.A00 = new EUZ(null, abstractC59962oe, c1p1, c07270a1, lia, enumC31713DwI, str, str2, z);
        C1GJ.A03(A01);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1Tc, java.lang.Object] */
    public LIA(Context context) {
        this.A00 = context;
        this.A03 = context.getApplicationContext().getContentResolver();
        LVZ lvz = new LVZ(this, 3);
        this.A06 = lvz;
        ?? obj = new Object();
        obj.A00 = lvz;
        this.A05 = obj;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.A04 = packageManager;
        this.A02 = new LI3(this.A03, AbstractC61808Ru2.A00(packageManager), this.A05, this.A06);
        this.A01 = new SYR(this.A00, this.A04);
    }
}
