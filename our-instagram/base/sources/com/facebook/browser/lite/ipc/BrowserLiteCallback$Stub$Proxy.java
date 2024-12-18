package com.facebook.browser.lite.ipc;

import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC58322PtE;
import X.AbstractC58323PtF;
import X.AbstractC62773SQp;
import X.C0f9;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes10.dex */
public final class BrowserLiteCallback$Stub$Proxy implements BrowserLiteCallback {
    public IBinder A00;

    public static void A00(Parcel parcel) {
        parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
    }

    public static void A01(Parcel parcel, String str) {
        parcel.writeInterfaceToken("com.facebook.browser.lite.ipc.BrowserLiteCallback");
        parcel.writeString(str);
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void AEI(Bundle bundle, ZonePolicy zonePolicy, String str, Map map) {
        int A03 = C0f9.A03(844923089);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, "INTEGRITY_LOGGER");
            obtain.writeMap(map);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            AbstractC62773SQp.A01(obtain, zonePolicy, 0);
            this.A00.transact(45, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1360329999, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-665243539, A03);
            throw th;
        }
    }

    public static boolean A02(IInterface iInterface, Parcel parcel, Parcelable parcelable, String str, String str2) {
        parcel.writeString(str);
        parcel.writeString(str2);
        AbstractC62773SQp.A01(parcel, parcelable, 0);
        parcel.writeStrongInterface(iInterface);
        return false;
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void AV0(AutofillContactDataCallback autofillContactDataCallback) {
        int A03 = C0f9.A03(-1775449315);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeStrongInterface(autofillContactDataCallback);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 28);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1739297036, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-428878988, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void AV1(AutofillScriptCallback autofillScriptCallback) {
        int A03 = C0f9.A03(1850332226);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeStrongInterface(autofillScriptCallback);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 27);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(337700036, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-350602278, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final PrefetchCacheEntry BfX(String str) {
        int A03 = C0f9.A03(-1265314492);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 20);
            PrefetchCacheEntry prefetchCacheEntry = (PrefetchCacheEntry) AbstractC58323PtF.A0j(obtain2, PrefetchCacheEntry.CREATOR);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1591116145, A03);
            return prefetchCacheEntry;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(407969762, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final ArrayList BfY() {
        int A03 = C0f9.A03(-306861057);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 19);
            ArrayList<String> createStringArrayList = obtain2.createStringArrayList();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1152981777, A03);
            return createStringArrayList;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1495120046, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CJW(String str) {
        int A03 = C0f9.A03(1448447463);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 78);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-614731322, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1648740778, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CJX(String str, String str2) {
        int A03 = C0f9.A03(85103887);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 76);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1316329788, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(897873897, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final int CJt(String str) {
        int A03 = C0f9.A03(-375372880);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 1);
            int readInt = obtain2.readInt();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1295392034, A03);
            return readInt;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1255314008, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final boolean CJz(Bundle bundle, ZonePolicy zonePolicy, String str) {
        int A03 = C0f9.A03(-843864128);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            boolean z = false;
            AbstractC62773SQp.A01(obtain, bundle, 0);
            AbstractC62773SQp.A01(obtain, zonePolicy, 0);
            if (AbstractC58322PtE.A05(this.A00, obtain, obtain2, 42) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-312575520, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-198971764, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final boolean CKB(String str) {
        int A03 = C0f9.A03(789039959);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            boolean z = false;
            if (AbstractC58322PtE.A05(this.A00, obtain, obtain2, 24) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1808923312, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(726175430, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final boolean CKK(String str, String str2) {
        int A03 = C0f9.A03(-1970581553);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            boolean z = false;
            if (AbstractC58322PtE.A05(this.A00, obtain, obtain2, 2) != 0) {
                z = true;
            }
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2115193814, A03);
            return z;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-828393000, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CKL(Bundle bundle) {
        int A03 = C0f9.A03(-1001021873);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(66, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1110535054, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1306193583, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void Cgs(String str) {
        int A03 = C0f9.A03(-37818060);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 35);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(8732916, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1898825193, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CiX(long j, String str, String str2, Map map) {
        int A03 = C0f9.A03(1803477848);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeLong(j);
            obtain.writeString(str2);
            obtain.writeMap(map);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 79);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1143742853, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1470436474, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CiY(long j, String str, String str2, Map map) {
        int A03 = C0f9.A03(1015320200);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeLong(j);
            obtain.writeString(str2);
            obtain.writeMap(map);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 77);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(612980792, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-450311687, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void Cjh(Bundle bundle, String str, String str2, boolean z) {
        int A03 = C0f9.A03(-2060855814);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1801923260, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1186198032, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CkU(Bundle bundle, String str, String str2, long j, boolean z) {
        int A03 = C0f9.A03(1342596760);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            obtain.writeString(str2);
            obtain.writeLong(j);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-893637694, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(2138048330, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void Clr(Bundle bundle, Map map) {
        int A03 = C0f9.A03(-1784579604);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeMap(map);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(18, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(530257631, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1661130105, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final String CoI(String str) {
        int A03 = C0f9.A03(-1704342652);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 25);
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-19251795, A03);
            return readString;
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(8888453, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CyU(AutofillOptOutCallback autofillOptOutCallback, String str) {
        int A03 = C0f9.A03(-1761575952);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeStrongInterface(autofillOptOutCallback);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 26);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2095973056, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(710765706, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void D80(String str, Bundle bundle) {
        int A03 = C0f9.A03(-1678923046);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(5, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1714557767, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1685312379, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DEm(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map) {
        int A03 = C0f9.A03(1284694047);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeMap(map);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            AbstractC62773SQp.A01(obtain, zonePolicy, 0);
            this.A00.transact(15, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1895056067, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(242326286, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DHR() {
        int A03 = C0f9.A03(49581761);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 41);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1006788848, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(660425260, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DL0(String str, List list) {
        int A03 = C0f9.A03(1057898864);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeList(list);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 23);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-516840860, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(375085294, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DL2(Bundle bundle, IABBloksGraphQLCallback iABBloksGraphQLCallback, String str, String str2, String str3) {
        int A03 = C0f9.A03(-430571749);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            this.A00.transact(51, obtain, obtain2, A02(iABBloksGraphQLCallback, obtain, bundle, str2, str3) ? 1 : 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-589913801, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1788152348, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DL3(Bundle bundle, IABEvent iABEvent, ZonePolicy zonePolicy) {
        int A03 = C0f9.A03(1515294289);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC62773SQp.A01(obtain, iABEvent, 0);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            AbstractC62773SQp.A01(obtain, zonePolicy, 0);
            this.A00.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1088028676, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1984691087, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DL4(Bundle bundle, IABExpandableFooterCallback iABExpandableFooterCallback, String str, String str2, String str3, String str4, boolean z) {
        int A03 = C0f9.A03(943600560);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeInt(1);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            obtain.writeStrongInterface(iABExpandableFooterCallback);
            this.A00.transact(52, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-553849195, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-533815345, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DL5(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
        int A03 = C0f9.A03(97104008);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            this.A00.transact(53, obtain, obtain2, A02(iABExtensionEventHandlerCallback, obtain, bundle, str2, str3) ? 1 : 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1626857933, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-946401730, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DL6(Bundle bundle, IABExtensionPreExitHandlerBloksCallback iABExtensionPreExitHandlerBloksCallback, String str, String str2, String str3, String str4, List list) {
        int A03 = C0f9.A03(94082179);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            obtain.writeStringList(list);
            this.A00.transact(56, obtain, obtain2, A02(iABExtensionPreExitHandlerBloksCallback, obtain, bundle, str3, str4) ? 1 : 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(611504276, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-952337205, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DL7(Bundle bundle, IABExtensionEventHandlerCallback iABExtensionEventHandlerCallback, String str, String str2, String str3) {
        int A03 = C0f9.A03(-1524664968);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            this.A00.transact(55, obtain, obtain2, A02(iABExtensionEventHandlerCallback, obtain, bundle, str2, str3) ? 1 : 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1295338695, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1830217815, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DO3(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
        int A03 = C0f9.A03(2002744335);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC62773SQp.A01(obtain, browserLiteJSBridgeCall, 0);
            obtain.writeStrongInterface(browserLiteJSBridgeCallback);
            this.A00.transact(21, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2042545552, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1361320787, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DXU(int i, String str, Bundle bundle) {
        int A03 = C0f9.A03(-1302481321);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            obtain.writeInt(i);
            this.A00.transact(13, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1002261425, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1191521422, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DXX(Bundle bundle, String str, int i, long j) {
        int A03 = C0f9.A03(2086073855);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            obtain.writeInt(i);
            obtain.writeLong(j);
            this.A00.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2039537454, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1456072416, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DXe(Bundle bundle, String str, String str2) {
        int A03 = C0f9.A03(-1619222897);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeString(str2);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(510790745, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-565490210, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DXr(Bundle bundle, ZonePolicy zonePolicy, String str, boolean z) {
        int A03 = C0f9.A03(-1815910792);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeInt(AbstractC167007dF.A1M(z ? 1 : 0) ? 1 : 0);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            AbstractC62773SQp.A01(obtain, zonePolicy, 0);
            this.A00.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1237399148, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1524282767, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void Dcx(Map map) {
        int A03 = C0f9.A03(-1769196388);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeMap(map);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 16);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2107408683, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1160342537, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DhA(Bundle bundle, ZonePolicy zonePolicy, String str) {
        int A03 = C0f9.A03(1537631812);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            AbstractC62773SQp.A01(obtain, zonePolicy, 0);
            this.A00.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-378591134, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-658421847, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void Dkq() {
        int A03 = C0f9.A03(463162871);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 46);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1066070508, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-504628911, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void DxW(String str, Bundle bundle) {
        int A03 = C0f9.A03(991632442);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            obtain.writeString(str);
            this.A00.transact(40, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2117043841, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(318205377, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void Dxb(Bundle bundle, Map map) {
        int A03 = C0f9.A03(59897858);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeMap(map);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(17, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1587274681, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1893171265, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void E2w(Bundle bundle, OnShopsLiteCallback onShopsLiteCallback) {
        int A03 = C0f9.A03(-1272321443);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            obtain.writeStrongInterface(onShopsLiteCallback);
            this.A00.transact(62, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1015225338, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(672175466, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void EIW(Bundle bundle, long[] jArr) {
        int A03 = C0f9.A03(989552937);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            obtain.writeLongArray(jArr);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            this.A00.transact(14, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1161856798, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(1238210430, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void EUK() {
        int A03 = C0f9.A03(-13079558);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 30);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-2052614521, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(593532088, A03);
            throw th;
        }
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void Epk() {
        int A03 = C0f9.A03(53440699);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A00(obtain);
            AbstractC167027dH.A0k(this.A00, obtain, obtain2, 22);
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(2106614545, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-957228098, A03);
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int A03 = C0f9.A03(1291148035);
        IBinder iBinder = this.A00;
        C0f9.A0A(281641695, A03);
        return iBinder;
    }

    @Override // com.facebook.browser.lite.ipc.BrowserLiteCallback
    public final void CkG(Bundle bundle, ZonePolicy zonePolicy, String str, String str2, Map map, Map map2, int i, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, boolean z4) {
        int A03 = C0f9.A03(453135490);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            A01(obtain, str);
            obtain.writeLong(j);
            obtain.writeLong(j2);
            obtain.writeLong(j3);
            obtain.writeLong(j4);
            obtain.writeLong(j5);
            obtain.writeInt(i);
            obtain.writeInt(0);
            obtain.writeInt(z2 ? 1 : 0);
            obtain.writeInt(AbstractC167007dF.A1M(z3 ? 1 : 0) ? 1 : 0);
            obtain.writeMap(null);
            obtain.writeInt(z4 ? 1 : 0);
            obtain.writeString(str2);
            obtain.writeMap(null);
            AbstractC62773SQp.A01(obtain, bundle, 0);
            AbstractC62773SQp.A01(obtain, zonePolicy, 0);
            this.A00.transact(10, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(481166511, A03);
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            C0f9.A0A(-1915585145, A03);
            throw th;
        }
    }
}
