package X;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.location.zzal;
import com.google.android.gms.internal.location.zzas;
import com.google.android.gms.internal.location.zzb;
import com.google.android.gms.internal.location.zzbe;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RHG extends AbstractC1340563o {
    public final SIR A00;
    public final InterfaceC65259Tgp A01;
    public final String A02;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A05() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String A06() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final int getMinApkVersion() {
        return 11717000;
    }

    public RHG(Context context, Looper looper, C69E c69e, C69G c69g, C1340363l c1340363l) {
        super(context, looper, c69e, c69g, c1340363l, 23);
        T67 t67 = new T67(this);
        this.A01 = t67;
        this.A02 = "locationServices";
        this.A00 = new SIR(context, t67);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* synthetic */ IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzal) {
            return queryLocalInterface;
        }
        zzb zzbVar = new zzb("com.google.android.gms.location.internal.IGoogleLocationManagerService", iBinder);
        C0f9.A0A(1234851570, C0f9.A03(-1687165546));
        return zzbVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] A0A() {
        return AbstractC62387S9m.A02;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, X.InterfaceC1340663q
    public final void disconnect() {
        SIR sir = this.A00;
        synchronized (sir) {
            if (isConnected()) {
                try {
                    Map map = sir.A01;
                    synchronized (map) {
                        try {
                            Iterator A16 = AbstractC166997dE.A16(map);
                            while (A16.hasNext()) {
                                A16.next();
                            }
                            map.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    Map map2 = sir.A03;
                    synchronized (map2) {
                        try {
                            Iterator A162 = AbstractC166997dE.A16(map2);
                            while (A162.hasNext()) {
                                zzas zzasVar = (zzas) A162.next();
                                if (zzasVar != null) {
                                    ((zzal) ((T67) sir.A00).A00.A03()).FFg(new zzbe(null, null, zzasVar.asBinder(), null, null, 2));
                                }
                            }
                            map2.clear();
                        } finally {
                        }
                    }
                    Map map3 = sir.A02;
                    synchronized (map3) {
                        try {
                            Iterator A163 = AbstractC166997dE.A16(map3);
                            while (A163.hasNext()) {
                                A163.next();
                            }
                            map3.clear();
                        } finally {
                        }
                    }
                } catch (Exception e) {
                    android.util.Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
            }
            super.disconnect();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle A02() {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(2055), this.A02);
        return A0b;
    }
}
