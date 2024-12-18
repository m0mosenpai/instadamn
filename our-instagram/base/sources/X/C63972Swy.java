package X;

import android.os.Parcel;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzu;

/* renamed from: X.Swy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63972Swy implements InterfaceC50417MNt {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ C1336561u A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ byte[] A04;

    public C63972Swy(LK0 lk0, C1336561u c1336561u, String str, byte[] bArr, boolean z) {
        this.A03 = z;
        this.A04 = bArr;
        this.A02 = str;
        this.A01 = c1336561u;
        this.A00 = lk0;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        boolean z = AbstractC166997dE.A1Z(obj, true) && this.A03;
        byte[] bArr = this.A04;
        String str = this.A02;
        C3U5.A06(str, "key cannot be null or empty");
        final StoreBytesData storeBytesData = new StoreBytesData(str, bArr, z);
        C1336561u c1336561u = this.A01;
        final C61P c61p = (C61P) c1336561u.A01;
        C62947SYp A00 = SWk.A00();
        A00.A03 = new Feature[]{AbstractC128815rt.A03, AbstractC128815rt.A05};
        A00.A01 = new InterfaceC65406Tjd() { // from class: X.T5O
            @Override // X.InterfaceC65406Tjd
            public final void accept(Object obj2, Object obj3) {
                StoreBytesData storeBytesData2 = storeBytesData;
                zzu zzuVar = new zzu((C58411Pup) obj3);
                zza zzaVar = (zza) ((BaseGmsClient) obj2).A03();
                int A03 = C0f9.A03(1854331366);
                Parcel A0O = AbstractC58321PtD.A0O(zzuVar);
                A0O.writeInt(1);
                storeBytesData2.writeToParcel(A0O, 0);
                zzaVar.A00(A0O, 10);
                C0f9.A0A(-324524744, A03);
            }
        };
        A00.A00 = 1645;
        A00.A02 = false;
        C61Q.A00(c61p, A00.A01(), 1).A03(new C64270T6u(0, this.A00, c1336561u));
    }
}
