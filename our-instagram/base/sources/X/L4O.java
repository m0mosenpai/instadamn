package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes8.dex */
public final class L4O {
    public LI3 A00;
    public SPT A01;
    public ContentResolver A02;
    public PackageManager A03;
    public C1Tc A04;
    public InterfaceC27041Tb A05;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1Tc, java.lang.Object] */
    public L4O(Context context) {
        C14360o3.A0B(context, 1);
        this.A01 = SPT.A00.A00();
        this.A02 = context.getApplicationContext().getContentResolver();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            this.A03 = packageManager;
            LVZ lvz = new LVZ(this, 4);
            this.A05 = lvz;
            ?? obj = new Object();
            obj.A00 = lvz;
            this.A04 = obj;
            C62538SFp A00 = AbstractC61808Ru2.A00(packageManager);
            ContentResolver contentResolver = this.A02;
            if (contentResolver == null) {
                C14360o3.A0F("contentResolver");
                throw C00O.createAndThrow();
            }
            this.A00 = new LI3(contentResolver, A00, this.A04, this.A05);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
