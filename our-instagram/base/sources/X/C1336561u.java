package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzv;
import com.google.android.gms.internal.auth_blockstore.zzy;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.61u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1336561u {
    public static final byte[] A03 = new byte[0];
    public final C1336461t A00;
    public final C61R A01;
    public final ScheduledThreadPoolExecutor A02 = new ScheduledThreadPoolExecutor(1);

    public C1336561u(C1336461t c1336461t, C61R c61r) {
        this.A01 = c61r;
        this.A00 = c1336461t;
    }

    public static final LK0 A00(InterfaceC50419MNy interfaceC50419MNy, MPU mpu, C1336561u c1336561u, String str, boolean z) {
        LK0 lk0 = new LK0();
        Integer AfB = mpu.AfB();
        int intValue = AfB.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                throw new RuntimeException();
            }
        } else {
            str = "DEVICE_SCOPE_KEY_0";
        }
        A01(c1336561u, AfB, str).A04(new LSR(lk0, interfaceC50419MNy, mpu, c1336561u, str, z));
        return lk0;
    }

    public static final LK0 A01(C1336561u c1336561u, Integer num, String str) {
        List singletonList;
        LK0 lk0 = new LK0();
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                singletonList = AbstractC16960so.A1Q(str, AbstractC43591JPw.A00(321));
            } else {
                throw new RuntimeException();
            }
        } else {
            singletonList = Collections.singletonList(str);
            C14360o3.A07(singletonList);
        }
        C3U5.A03(singletonList, "Keys cannot be set to null");
        final RetrieveBytesRequest retrieveBytesRequest = new RetrieveBytesRequest(singletonList, false);
        final C61P c61p = (C61P) c1336561u.A01;
        C62947SYp A00 = SWk.A00();
        A00.A03 = new Feature[]{AbstractC128815rt.A07};
        A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5P
            @Override // X.InterfaceC65406Tjd
            public final void accept(Object obj, Object obj2) {
                RetrieveBytesRequest retrieveBytesRequest2 = retrieveBytesRequest;
                zzv zzvVar = new zzv((C58411Pup) obj2);
                zza zzaVar = (zza) ((BaseGmsClient) obj).A03();
                int A032 = C0f9.A03(-1993799605);
                Parcel A0O = AbstractC58321PtD.A0O(zzvVar);
                A0O.writeInt(1);
                retrieveBytesRequest2.writeToParcel(A0O, 0);
                zzaVar.A00(A0O, 12);
                C0f9.A0A(-1388156947, A032);
            }
        };
        A00.A02 = false;
        A00.A00 = 1668;
        C61Q.A00(c61p, A00.A01(), 0).A03(new LW8(lk0, c1336561u, singletonList));
        return lk0;
    }

    public static final LK0 A02(C1336561u c1336561u, String str, byte[] bArr, boolean z) {
        LK0 lk0 = new LK0();
        if (bArr.length > 4096) {
            lk0.A05(new K54(new IOException("Storage full: can not save the backup data")));
            return lk0;
        }
        c1336561u.A03().A04(new C63972Swy(lk0, c1336561u, str, bArr, z));
        return lk0;
    }

    public final LK0 A03() {
        LK0 lk0 = new LK0();
        final C61P c61p = (C61P) this.A01;
        C62947SYp A00 = SWk.A00();
        A00.A03 = new Feature[]{AbstractC128815rt.A04};
        A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5G
            @Override // X.InterfaceC65406Tjd
            public final void accept(Object obj, Object obj2) {
                zzy zzyVar = new zzy((C58411Pup) obj2);
                zza zzaVar = (zza) ((BaseGmsClient) obj).A03();
                int A032 = C0f9.A03(-366597908);
                zzaVar.A00(AbstractC58321PtD.A0O(zzyVar), 11);
                C0f9.A0A(-439808482, A032);
            }
        };
        A00.A02 = false;
        A00.A00 = 1651;
        C61Q.A00(c61p, A00.A01(), 0).A03(new LW7(lk0, this));
        return lk0;
    }
}
