package com.facebook.neko.directinstall.installer;

import X.AbstractC167017dG;
import X.AbstractC58317Pt9;
import X.AbstractC69781VvI;
import X.C0f9;
import X.RunnableC71256Wql;
import X.USU;
import X.VDE;
import X.WD5;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback;

/* loaded from: classes11.dex */
public final class SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1 extends Binder implements IGalaxyStoreDownloadCallback {
    public final /* synthetic */ USU A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1(USU usu) {
        this();
        this.A00 = usu;
        C0f9.A0A(678009440, C0f9.A03(1308273485));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DEH(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 953962677(0x38dc50b5, float:1.050545E-4)
            int r4 = X.C0f9.A03(r0)
            X.USU r3 = r5.A00
            java.lang.String r1 = java.lang.String.valueOf(r7)
            if (r1 == 0) goto L16
            int r0 = r1.hashCode()
            switch(r0) {
                case 1447: goto L33;
                case 1335965481: goto L36;
                case 1448635040: goto L39;
                case 1448635042: goto L3c;
                case 1448635047: goto L3f;
                case 1448635134: goto L4a;
                case 1448635166: goto L4d;
                case 1448635167: goto L50;
                case 1477268034: goto L53;
                case 1477268035: goto L56;
                case 1477268037: goto L59;
                case 1477268997: goto L5c;
                case 1477268998: goto L5f;
                default: goto L16;
            }
        L16:
            X.VCm r2 = X.EnumC68128VCm.A04
        L18:
            int r0 = r3.A00
            android.os.Handler r1 = r3.A02
            if (r7 != r0) goto L2d
            X.Wqk r0 = new X.Wqk
            r0.<init>(r3)
        L23:
            r1.post(r0)
            r0 = -1949017307(0xffffffff8bd45b25, float:-8.179657E-32)
            X.C0f9.A0A(r0, r4)
            return
        L2d:
            X.Wvm r0 = new X.Wvm
            r0.<init>(r3, r2, r7)
            goto L23
        L33:
            java.lang.String r0 = "-4"
            goto L41
        L36:
            java.lang.String r0 = "-20004"
            goto L41
        L39:
            java.lang.String r0 = "100001"
            goto L61
        L3c:
            java.lang.String r0 = "100003"
            goto L61
        L3f:
            java.lang.String r0 = "100008"
        L41:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            X.VCm r2 = X.EnumC68128VCm.A03
            goto L18
        L4a:
            java.lang.String r0 = "100032"
            goto L61
        L4d:
            java.lang.String r0 = "100043"
            goto L61
        L50:
            java.lang.String r0 = "100044"
            goto L61
        L53:
            java.lang.String r0 = "200400"
            goto L61
        L56:
            java.lang.String r0 = "200401"
            goto L61
        L59:
            java.lang.String r0 = "200403"
            goto L61
        L5c:
            java.lang.String r0 = "200502"
            goto L61
        L5f:
            java.lang.String r0 = "200503"
        L61:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            X.VCm r2 = X.EnumC68128VCm.A02
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.neko.directinstall.installer.SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1.DEH(java.lang.String, int):void");
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public final void Dc0(String str, float f, long j) {
        Long valueOf;
        int A0N = AbstractC167017dG.A0N(str, -429939291);
        USU usu = this.A00;
        WD5 wd5 = ((AbstractC69781VvI) usu).A04;
        long j2 = ((float) j) * f;
        if (j == 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf((j2 * 100) / j);
        }
        WD5.A00(null, wd5, valueOf, "RUNNING_DOWNLOAD", null);
        ((AbstractC69781VvI) usu).A03.A01(new DirectInstallDownloadEvent(VDE.A07, Double.valueOf(f * 100.0d)));
        C0f9.A0A(-1332060998, A0N);
    }

    @Override // com.sec.android.app.samsungapps.downloadservice.aidl.IGalaxyStoreDownloadCallback
    public final void DoN(String str, int i, String str2) {
        WD5 wd5;
        String str3;
        int A03 = C0f9.A03(-177021894);
        USU usu = this.A00;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    if (i == 4) {
                        usu.A02.post(new RunnableC71256Wql(usu));
                    }
                    C0f9.A0A(82889272, A03);
                } else {
                    ((AbstractC69781VvI) usu).A03.A00(VDE.A0A);
                    wd5 = ((AbstractC69781VvI) usu).A04;
                    str3 = "START_INSTALL";
                }
            } else {
                ((AbstractC69781VvI) usu).A03.A00(VDE.A07);
                wd5 = ((AbstractC69781VvI) usu).A04;
                str3 = "RUNNING_DOWNLOAD";
            }
        } else {
            ((AbstractC69781VvI) usu).A03.A00(VDE.A0D);
            wd5 = ((AbstractC69781VvI) usu).A04;
            str3 = "DOWNLOAD_WAITING";
        }
        wd5.A01(str3);
        C0f9.A0A(82889272, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(485096436, C0f9.A03(-1077808869));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-509569779);
        String A00 = AbstractC58317Pt9.A00(256);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(A00);
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            Dc0(parcel.readString(), parcel.readFloat(), parcel.readLong());
                        }
                    } else {
                        DEH(parcel.readString(), parcel.readInt());
                    }
                } else {
                    DoN(parcel.readString(), parcel.readInt(), parcel.readString());
                }
                i3 = -461081625;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString(A00);
                i3 = -1435321624;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(-1117603650, A03);
        return onTransact;
    }

    public SamsungDirectInstallAgentManager$iGalaxyStoreDownloadCallback$1() {
        int A03 = C0f9.A03(1964293957);
        attachInterface(this, AbstractC58317Pt9.A00(256));
        C0f9.A0A(1552819372, A03);
    }
}
