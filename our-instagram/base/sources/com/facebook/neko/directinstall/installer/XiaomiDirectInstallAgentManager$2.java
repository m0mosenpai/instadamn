package com.facebook.neko.directinstall.installer;

import X.AbstractC69781VvI;
import X.C0f9;
import X.USV;
import X.VDE;
import X.WD5;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.xiaomi.market.IDownloadCallback;

/* loaded from: classes11.dex */
public final class XiaomiDirectInstallAgentManager$2 extends Binder implements IDownloadCallback {
    public final /* synthetic */ USV A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XiaomiDirectInstallAgentManager$2(USV usv) {
        this();
        this.A00 = usv;
        C0f9.A0A(669819278, C0f9.A03(-1448477207));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.xiaomi.market.IDownloadCallback, java.lang.Object, com.xiaomi.market.IDownloadCallback$Stub$Proxy] */
    public static IDownloadCallback A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.market.IDownloadCallback");
        if (queryLocalInterface != null && (queryLocalInterface instanceof IDownloadCallback)) {
            return (IDownloadCallback) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = C0f9.A03(2001306125);
        obj.A00 = iBinder;
        C0f9.A0A(-1078892535, A03);
        return obj;
    }

    public final void A01(String str, float f) {
        int A03 = C0f9.A03(1065219540);
        USV usv = this.A00;
        WD5 wd5 = ((AbstractC69781VvI) usv).A04;
        wd5.A00 = usv.A04;
        wd5.A01 = str;
        WD5.A00(null, wd5, Long.valueOf(f), "RUNNING_DOWNLOAD", null);
        ((AbstractC69781VvI) usv).A03.A01(new DirectInstallDownloadEvent(VDE.A07, Double.valueOf(f)));
        C0f9.A0A(2120750211, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (r1.equals(r0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r2 = X.EnumC68128VCm.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r1.equals("30") != false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(java.lang.String r6, int r7) {
        /*
            r5 = this;
            r0 = 1240505979(0x49f09e7b, float:1971151.4)
            int r3 = X.C0f9.A03(r0)
            X.USV r4 = r5.A00
            X.WD5 r1 = r4.A04
            java.lang.String r0 = r4.A04
            r1.A00 = r0
            r1.A01 = r6
            java.lang.String r1 = java.lang.String.valueOf(r7)
            if (r1 == 0) goto L44
            int r2 = r1.hashCode()
            r0 = 52
            if (r2 == r0) goto L87
            r0 = 1568(0x620, float:2.197E-42)
            if (r2 == r0) goto L79
            r0 = 1573(0x625, float:2.204E-42)
            if (r2 == r0) goto L76
            r0 = 1601(0x641, float:2.243E-42)
            if (r2 == r0) goto L73
            r0 = 1629(0x65d, float:2.283E-42)
            if (r2 == r0) goto L93
            r0 = 1507430(0x170066, float:2.11236E-39)
            if (r2 == r0) goto L70
            r0 = 1507454(0x17007e, float:2.112393E-39)
            if (r2 == r0) goto L6d
            r0 = 1606(0x646, float:2.25E-42)
            if (r2 == r0) goto L6a
            r0 = 1607(0x647, float:2.252E-42)
            if (r2 == r0) goto L67
            switch(r2) {
                case 1633: goto L8a;
                case 1634: goto L61;
                case 1635: goto L7c;
                case 1636: goto L64;
                default: goto L44;
            }
        L44:
            X.VCm r2 = X.EnumC68128VCm.A04
        L46:
            int r0 = r4.A00
            android.os.Handler r1 = r4.A02
            if (r7 != r0) goto L5b
            X.Wqk r0 = new X.Wqk
            r0.<init>(r4)
        L51:
            r1.post(r0)
            r0 = -346782530(0xffffffffeb5484be, float:-2.5691913E26)
            X.C0f9.A0A(r0, r3)
            return
        L5b:
            X.Wvm r0 = new X.Wvm
            r0.<init>(r4, r2, r7)
            goto L51
        L61:
            java.lang.String r0 = "35"
            goto L8c
        L64:
            java.lang.String r0 = "37"
            goto L7e
        L67:
            java.lang.String r0 = "29"
            goto L8c
        L6a:
            java.lang.String r0 = "28"
            goto L8c
        L6d:
            java.lang.String r0 = "1010"
            goto L8c
        L70:
            java.lang.String r0 = "1007"
            goto L8c
        L73:
            java.lang.String r0 = "23"
            goto L8c
        L76:
            java.lang.String r0 = "16"
            goto L7e
        L79:
            java.lang.String r0 = "11"
            goto L7e
        L7c:
            java.lang.String r0 = "36"
        L7e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L44
            X.VCm r2 = X.EnumC68128VCm.A03
            goto L46
        L87:
            java.lang.String r0 = "4"
            goto L8c
        L8a:
            java.lang.String r0 = "34"
        L8c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L9b
            goto L44
        L93:
            java.lang.String r0 = "30"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L44
        L9b:
            X.VCm r2 = X.EnumC68128VCm.A02
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2.A02(java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(java.lang.String r7, int r8) {
        /*
            r6 = this;
            r0 = 1093326931(0x412ad853, float:10.677814)
            int r3 = X.C0f9.A03(r0)
            X.USV r2 = r6.A00
            X.WD5 r4 = r2.A04
            java.lang.String r0 = r2.A04
            r4.A00 = r0
            r4.A01 = r7
            r0 = 3
            if (r8 == r0) goto L57
            r0 = 6
            if (r8 == r0) goto L4d
            r0 = 9
            if (r8 != r0) goto L37
            X.VtK r5 = r2.A03
            X.VDE r4 = X.VDE.A0B
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent r0 = new com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent
            r0.<init>(r4, r1)
            r5.A01(r0)
            android.os.Handler r1 = r2.A02
            X.Wqm r0 = new X.Wqm
            r0.<init>()
            r1.post(r0)
        L37:
            java.util.Map r2 = r2.A0A
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L46
            r2.get(r1)
        L46:
            r0 = 2138474281(0x7f768729, float:3.2769188E38)
            X.C0f9.A0A(r0, r3)
            return
        L4d:
            X.VtK r1 = r2.A03
            X.VDE r0 = X.VDE.A0A
            r1.A00(r0)
            java.lang.String r0 = "START_INSTALL"
            goto L60
        L57:
            X.VtK r1 = r2.A03
            X.VDE r0 = X.VDE.A07
            r1.A00(r0)
            java.lang.String r0 = "RUNNING_DOWNLOAD"
        L60:
            r4.A01(r0)
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.neko.directinstall.installer.XiaomiDirectInstallAgentManager$2.A03(java.lang.String, int):void");
    }

    @Override // com.xiaomi.market.IDownloadCallback
    public final void DEI(String str, int i, String str2) {
        int i2;
        int A03 = C0f9.A03(93185211);
        if (USV.A00(this.A00) >= 2) {
            i2 = 1253019088;
        } else {
            A02("", i);
            i2 = -363791660;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // com.xiaomi.market.IDownloadCallback
    public final void Dc0(String str, float f, long j) {
        int i;
        int A03 = C0f9.A03(1635341675);
        if (USV.A00(this.A00) >= 2) {
            i = -928569350;
        } else {
            A01("", f);
            i = 1818862744;
        }
        C0f9.A0A(i, A03);
    }

    @Override // com.xiaomi.market.IDownloadCallback
    public final void DoN(String str, int i, String str2) {
        int i2;
        int A03 = C0f9.A03(1139894094);
        if (USV.A00(this.A00) >= 2) {
            i2 = -1203952042;
        } else {
            A03("", i);
            i2 = -935302539;
        }
        C0f9.A0A(i2, A03);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-668395579, C0f9.A03(-762425002));
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = C0f9.A03(-2109416729);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.market.IDownloadCallback");
                switch (i) {
                    case 1:
                        DoN(parcel.readString(), parcel.readInt(), parcel.readString());
                        break;
                    case 2:
                        DEI(parcel.readString(), parcel.readInt(), parcel.readString());
                        break;
                    case 3:
                        Dc0(parcel.readString(), parcel.readFloat(), parcel.readLong());
                        break;
                    case 4:
                        parcel.readString();
                        int readInt = parcel.readInt();
                        parcel.readString();
                        A03(parcel.readString(), readInt);
                        break;
                    case 5:
                        parcel.readString();
                        int readInt2 = parcel.readInt();
                        parcel.readString();
                        A02(parcel.readString(), readInt2);
                        break;
                    case 6:
                        parcel.readString();
                        parcel.readLong();
                        A01(parcel.readString(), parcel.readFloat());
                        break;
                }
                parcel2.writeNoException();
                i3 = 1062406180;
                C0f9.A0A(i3, A03);
                return true;
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.market.IDownloadCallback");
                i3 = -1543774960;
                C0f9.A0A(i3, A03);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(30349999, A03);
        return onTransact;
    }

    public XiaomiDirectInstallAgentManager$2() {
        int A03 = C0f9.A03(2052793266);
        attachInterface(this, "com.xiaomi.market.IDownloadCallback");
        C0f9.A0A(1552423430, A03);
    }
}
