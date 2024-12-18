package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ar.core.dependencies.f;
import com.google.ar.core.p;

/* loaded from: classes10.dex */
public final class TQ8 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C62647SKg A01;
    public final /* synthetic */ C62915SWw A02;

    public TQ8(Context context, C62647SKg c62647SKg, C62915SWw c62915SWw) {
        this.A02 = c62915SWw;
        this.A00 = context;
        this.A01 = c62647SKg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            f fVar = this.A02.A01;
            String str = ((PackageItemInfo) this.A00.getApplicationInfo()).packageName;
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putCharSequence("package.name", "com.google.ar.core");
            p pVar = new p(this);
            int A03 = C0f9.A03(267803138);
            Parcel A00 = fVar.A00();
            A00.writeString(str);
            A00.writeInt(1);
            A0b.writeToParcel(A00, 0);
            AbstractC58321PtD.A19(pVar, A00);
            int A032 = C0f9.A03(-1275500857);
            try {
                fVar.A00.transact(2, A00, null, 1);
                A00.recycle();
                C0f9.A0A(-1059320237, A032);
                C0f9.A0A(1295172930, A03);
            } catch (Throwable th) {
                A00.recycle();
                C0f9.A0A(-1302794670, A032);
                throw th;
            }
        } catch (RemoteException e) {
            android.util.Log.e("ARCore-InstallService", "requestInfo threw", e);
            this.A01.A00(EnumC61066Ref.A05);
        }
    }
}
