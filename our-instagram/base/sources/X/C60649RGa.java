package X;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaa;

/* renamed from: X.RGa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60649RGa extends C61Q implements InterfaceC65408Tjf {
    public static final C61W A00;
    public static final C61U A01;
    public static final C61S A02;

    /* JADX WARN: Type inference failed for: r2v0, types: [X.61U, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.61S] */
    static {
        ?? obj = new Object();
        A02 = obj;
        ?? obj2 = new Object();
        A01 = obj2;
        A00 = new C61W(obj2, obj, "ClientTelemetry.API");
    }

    @Override // X.InterfaceC65408Tjf
    public final C5KS Ci1(final TelemetryData telemetryData) {
        C62947SYp A002 = SWk.A00();
        A002.A03 = new Feature[]{AbstractC62365S8p.A00};
        A002.A02 = false;
        A002.A01 = new InterfaceC65406Tjd() { // from class: X.T5D
            @Override // X.InterfaceC65406Tjd
            public final void accept(Object obj, Object obj2) {
                C58411Pup c58411Pup = (C58411Pup) obj2;
                zaa zaaVar = (zaa) ((BaseGmsClient) obj).A03();
                TelemetryData telemetryData2 = TelemetryData.this;
                int A03 = C0f9.A03(-1746547611);
                Parcel A003 = zaaVar.A00();
                A003.writeInt(1);
                telemetryData2.writeToParcel(A003, 0);
                int A032 = C0f9.A03(-1122337457);
                try {
                    zaaVar.A00.transact(1, A003, null, 1);
                    A003.recycle();
                    C0f9.A0A(1863232442, A032);
                    C0f9.A0A(-759865617, A03);
                    c58411Pup.A01(null);
                } catch (Throwable th) {
                    A003.recycle();
                    C0f9.A0A(-1980423653, A032);
                    throw th;
                }
            }
        };
        return C61Q.A00(this, A002.A01(), 2);
    }
}
