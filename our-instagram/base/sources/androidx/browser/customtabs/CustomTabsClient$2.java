package androidx.browser.customtabs;

import X.AbstractC167007dF;
import X.AbstractC58323PtF;
import X.AbstractC61612Rqb;
import X.C0f9;
import X.C61618Rqi;
import X.SWZ;
import X.TM8;
import X.TM9;
import X.TMA;
import X.TMB;
import X.TMC;
import X.TMD;
import X.TME;
import X.TMF;
import X.TMG;
import X.TPJ;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.support.customtabs.ICustomTabsCallback;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes10.dex */
public final class CustomTabsClient$2 extends Binder implements ICustomTabsCallback {
    public Handler A00;
    public final /* synthetic */ C61618Rqi A01;
    public final /* synthetic */ SWZ A02;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomTabsClient$2(C61618Rqi c61618Rqi, SWZ swz) {
        this();
        this.A02 = swz;
        this.A01 = c61618Rqi;
        int A03 = C0f9.A03(384519775);
        this.A00 = AbstractC167007dF.A0J();
        C0f9.A0A(1799872716, A03);
    }

    public static Bundle A00(Parcel parcel) {
        return (Bundle) AbstractC61612Rqb.A00(parcel, Bundle.CREATOR);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(1811810145, C0f9.A03(1292419511));
        return this;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0014. Please report as an issue. */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03;
        int i4;
        int A032;
        int i5;
        int A033 = C0f9.A03(1998126708);
        String str = ICustomTabsCallback.A00;
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface(str);
                switch (i) {
                    case 2:
                        parcel.readInt();
                        Bundle A00 = A00(parcel);
                        A03 = C0f9.A03(1410601498);
                        if (this.A01 == null) {
                            i4 = 342474511;
                        } else {
                            this.A00.post(new TM9(A00, this));
                            i4 = -345134098;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 3:
                        parcel.readString();
                        Bundle A002 = A00(parcel);
                        A03 = C0f9.A03(280857892);
                        if (this.A01 == null) {
                            i4 = -1466254445;
                        } else {
                            this.A00.post(new TMA(A002, this));
                            i4 = -874376074;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 4:
                        Bundle A003 = A00(parcel);
                        A032 = C0f9.A03(-254870466);
                        if (this.A01 == null) {
                            i5 = -1393329243;
                        } else {
                            this.A00.post(new TMB(A003, this));
                            i5 = 1624761050;
                        }
                        C0f9.A0A(i5, A032);
                        parcel2.writeNoException();
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 5:
                        parcel.readString();
                        Bundle A004 = A00(parcel);
                        A032 = C0f9.A03(-1411054007);
                        if (this.A01 == null) {
                            i5 = -571922823;
                        } else {
                            this.A00.post(new TMC(A004, this));
                            i5 = 1714819642;
                        }
                        C0f9.A0A(i5, A032);
                        parcel2.writeNoException();
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 6:
                        parcel.readInt();
                        Uri uri = (Uri) AbstractC58323PtF.A0j(parcel, Uri.CREATOR);
                        parcel.readInt();
                        Bundle A005 = A00(parcel);
                        A03 = C0f9.A03(-929785878);
                        if (this.A01 == null) {
                            i4 = 1174877577;
                        } else {
                            this.A00.post(new TPJ(uri, A005, this));
                            i4 = -800058247;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 7:
                        parcel.readString();
                        AbstractC58323PtF.A0j(parcel, Bundle.CREATOR);
                        int A034 = C0f9.A03(130179932);
                        int i6 = 196303901;
                        if (this.A01 == null) {
                            i6 = -1577857650;
                        }
                        C0f9.A0A(i6, A034);
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 8:
                        parcel.readInt();
                        parcel.readInt();
                        Bundle A006 = A00(parcel);
                        A03 = C0f9.A03(-969784953);
                        if (this.A01 == null) {
                            i4 = 776988062;
                        } else {
                            this.A00.post(new TMD(A006, this));
                            i4 = -2125804126;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 9:
                        Bundle A007 = A00(parcel);
                        A03 = C0f9.A03(-1955902456);
                        if (this.A01 == null) {
                            i4 = 376858216;
                        } else {
                            this.A00.post(new TME(A007, this));
                            i4 = -1292394067;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 10:
                        parcel.readInt();
                        parcel.readInt();
                        parcel.readInt();
                        parcel.readInt();
                        parcel.readInt();
                        Bundle A008 = A00(parcel);
                        A03 = C0f9.A03(-722379985);
                        if (this.A01 == null) {
                            i4 = -1584273715;
                        } else {
                            this.A00.post(new TMF(A008, this));
                            i4 = -578802765;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case 11:
                        Bundle A009 = A00(parcel);
                        A03 = C0f9.A03(556096963);
                        if (this.A01 == null) {
                            i4 = 1183621324;
                        } else {
                            this.A00.post(new TMG(A009, this));
                            i4 = 1380064537;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                        Bundle A0010 = A00(parcel);
                        A03 = C0f9.A03(-823600047);
                        if (this.A01 == null) {
                            i4 = -456507229;
                        } else {
                            this.A00.post(new TM8(A0010, this));
                            i4 = 1232129958;
                        }
                        C0f9.A0A(i4, A03);
                        i3 = -1519841439;
                        C0f9.A0A(i3, A033);
                        return true;
                }
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                i3 = -119753359;
                C0f9.A0A(i3, A033);
                return true;
            }
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        C0f9.A0A(845529007, A033);
        return onTransact;
    }

    public CustomTabsClient$2() {
        int A03 = C0f9.A03(88679620);
        attachInterface(this, ICustomTabsCallback.A00);
        C0f9.A0A(-1375888170, A03);
    }
}
