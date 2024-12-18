package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes8.dex */
public final class L3E {
    public SYR A00;
    public LI3 A01;
    public C47798L9g A02;
    public InterfaceC27041Tb A03;
    public final SPT A04;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1Tc, java.lang.Object] */
    public L3E(Context context, AbstractC12990ll abstractC12990ll, String str, String str2) {
        AbstractC25233BEq.A0w(2, abstractC12990ll, str, str2);
        this.A04 = SPT.A00.A00();
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        C14360o3.A07(contentResolver);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            LVZ lvz = new LVZ(this, 1);
            this.A03 = lvz;
            ?? obj = new Object();
            obj.A00 = lvz;
            this.A01 = new LI3(contentResolver, AbstractC61808Ru2.A00(packageManager), obj, this.A03);
            this.A00 = new SYR(context, packageManager);
            this.A02 = new C47798L9g(abstractC12990ll, str, str2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
