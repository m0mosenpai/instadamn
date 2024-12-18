package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.services.persistence.sandbox.PersistenceServiceHostBridgeHybrid;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aos, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24226Aos implements BE4 {
    public PersistenceServiceHostBridgeHybrid A00;
    public PersistenceServiceHostBridgeHybrid A01;
    public PersistenceServiceHostBridgeHybrid A02;
    public PersistenceServiceHostBridgeHybrid A03;
    public PersistenceServiceHostBridgeHybrid A04;
    public final NetworkClient A05;
    public final List A06 = AbstractC166987dD.A1E();

    public final PersistenceServiceHostBridgeHybrid A00(int i) {
        if (i == 0) {
            return this.A04;
        }
        if (i == 1) {
            return this.A03;
        }
        if (i == 2) {
            return this.A00;
        }
        if (i == 3) {
            return this.A01;
        }
        if (i == 4) {
            return this.A02;
        }
        return null;
    }

    @Override // X.BE4
    public final void FB5(Bundle bundle) {
        List list;
        C09530e4[] c09530e4Arr;
        C09530e4 A1L;
        boolean z;
        C09530e4 A1L2;
        boolean z2;
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType") && bundle.containsKey("delegateScope")) {
            int i = bundle.getInt("commandType");
            int i2 = bundle.getInt("delegateScope");
            String str = null;
            if (i == 0) {
                if (bundle.containsKey("key") && bundle.containsKey(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                    String string = bundle.getString("key");
                    String string2 = bundle.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    PersistenceServiceHostBridgeHybrid A00 = A00(i2);
                    if (string2 != null && string != null && A00 != null) {
                        try {
                            z2 = Boolean.valueOf(A00.nativeSet(A00.scope, string, string2));
                        } catch (Exception e) {
                            str = e.getMessage();
                            z2 = false;
                        }
                        if (z2 != null) {
                            list = this.A06;
                            c09530e4Arr = new C09530e4[7];
                            c09530e4Arr[0] = AbstractC167007dF.A0o("serviceType", 64);
                            c09530e4Arr[1] = AbstractC166987dD.A1L("promiseCommandType", EnumC53176NfY.A04);
                            c09530e4Arr[2] = AbstractC167007dF.A0o("commandType", i);
                            c09530e4Arr[3] = AbstractC166987dD.A1L("key", string);
                            c09530e4Arr[4] = AbstractC167007dF.A0o("delegateScope", i2);
                            c09530e4Arr[5] = AbstractC166987dD.A1L("resultBool", z2);
                            A1L2 = AbstractC166987dD.A1L("exceptionMessage", str);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                String str2 = "";
                if (i == 2) {
                    if (bundle.containsKey("key")) {
                        String string3 = bundle.getString("key");
                        PersistenceServiceHostBridgeHybrid A002 = A00(i2);
                        if (string3 != null && A002 != null) {
                            try {
                                str2 = A002.nativeGet(A002.scope, string3);
                            } catch (Exception e2) {
                                str = e2.getMessage();
                            }
                            if (str2 != null) {
                                list = this.A06;
                                c09530e4Arr = new C09530e4[7];
                                c09530e4Arr[0] = AbstractC167007dF.A0o("serviceType", 64);
                                c09530e4Arr[1] = AbstractC167007dF.A0o("promiseCommandType", 7);
                                c09530e4Arr[2] = AbstractC167007dF.A0o("commandType", i);
                                c09530e4Arr[3] = AbstractC166987dD.A1L("key", string3);
                                c09530e4Arr[4] = AbstractC167007dF.A0o("delegateScope", i2);
                                A1L = AbstractC166987dD.A1L("resultString", str2);
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 1) {
                    if (bundle.containsKey("key")) {
                        String string4 = bundle.getString("key");
                        PersistenceServiceHostBridgeHybrid A003 = A00(i2);
                        if (string4 != null && A003 != null) {
                            try {
                                z = Boolean.valueOf(A003.nativeRemove(A003.scope, string4));
                            } catch (Exception e3) {
                                str = e3.getMessage();
                                z = false;
                            }
                            if (z != null) {
                                list = this.A06;
                                c09530e4Arr = new C09530e4[7];
                                c09530e4Arr[0] = AbstractC167007dF.A0o("serviceType", 64);
                                c09530e4Arr[1] = AbstractC166987dD.A1L("promiseCommandType", EnumC53176NfY.A04);
                                c09530e4Arr[2] = AbstractC167007dF.A0o("commandType", i);
                                c09530e4Arr[3] = AbstractC166987dD.A1L("key", string4);
                                c09530e4Arr[4] = AbstractC167007dF.A0o("delegateScope", i2);
                                A1L = AbstractC166987dD.A1L("resultBool", z);
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (i == 4) {
                        if (bundle.containsKey("key") && bundle.containsKey(IntentModule.EXTRA_MAP_KEY_FOR_VALUE) && bundle.containsKey("persistenceLocation") && bundle.containsKey("assetType") && bundle.containsKey("storageIdentifier") && bundle.containsKey("assetFBId")) {
                            String string5 = bundle.getString("key");
                            String string6 = bundle.getString(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                            PersistenceServiceHostBridgeHybrid A004 = A00(i2);
                            String string7 = bundle.getString("storageIdentifier");
                            String string8 = bundle.getString("assetFBId");
                            int i3 = bundle.getInt("assetType");
                            int i4 = bundle.getInt("persistenceLocation");
                            if (string6 != null && string5 != null && string7 != null && string8 != null && A004 != null) {
                                A004.nativeSetV2(string5, string6, i4, i3, string7, string8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (i == 3) {
                        if (bundle.containsKey("key") && bundle.containsKey("persistenceLocation") && bundle.containsKey("assetType") && bundle.containsKey("storageIdentifier") && bundle.containsKey("assetFBId")) {
                            String string9 = bundle.getString("key");
                            PersistenceServiceHostBridgeHybrid A005 = A00(i2);
                            String string10 = bundle.getString("storageIdentifier");
                            String string11 = bundle.getString("assetFBId");
                            int i5 = bundle.getInt("assetType");
                            int i6 = bundle.getInt("persistenceLocation");
                            if (string9 != null && string10 != null && string11 != null && A005 != null) {
                                try {
                                    str2 = A005.nativeGetV2(string9, string10, string11, i6, i5);
                                } catch (Exception e4) {
                                    str = e4.getMessage();
                                }
                                if (str2 != null) {
                                    list = this.A06;
                                    c09530e4Arr = new C09530e4[7];
                                    c09530e4Arr[0] = AbstractC167007dF.A0o("serviceType", 64);
                                    c09530e4Arr[1] = AbstractC167007dF.A0o("promiseCommandType", 7);
                                    c09530e4Arr[2] = AbstractC167007dF.A0o("commandType", 3);
                                    c09530e4Arr[3] = AbstractC166987dD.A1L("key", string9);
                                    c09530e4Arr[4] = AbstractC167007dF.A0o("delegateScope", i2);
                                    A1L = AbstractC166987dD.A1L("resultString", str2);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        if (i == 5 && bundle.containsKey("key") && bundle.containsKey("persistenceLocation") && bundle.containsKey("assetType") && bundle.containsKey("storageIdentifier") && bundle.containsKey("assetFBId")) {
                            String string12 = bundle.getString("key");
                            PersistenceServiceHostBridgeHybrid A006 = A00(i2);
                            String string13 = bundle.getString("storageIdentifier");
                            String string14 = bundle.getString("assetFBId");
                            int i7 = bundle.getInt("assetType");
                            int i8 = bundle.getInt("persistenceLocation");
                            if (string12 != null && string13 != null && string14 != null && A006 != null) {
                                A006.nativeRemoveV2(string12, string13, string14, i8, i7);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                c09530e4Arr[5] = A1L;
                A1L2 = AbstractC166987dD.A1L("exceptionMessage", str);
            }
            c09530e4Arr[6] = A1L2;
            list.add(AbstractC61636Rr0.A00(c09530e4Arr));
        }
    }

    @Override // X.BE4
    public final Bundle BHd() {
        return AbstractC167027dH.A08(64);
    }

    @Override // X.BE4
    public final void CO6(AnonymousClass904 anonymousClass904) {
        C90P c90p;
        if (anonymousClass904 != null) {
            C203848zt c203848zt = C90P.A05;
            if (AnonymousClass904.A01(anonymousClass904, c203848zt) && (c90p = (C90P) anonymousClass904.A02(c203848zt)) != null) {
                InterfaceC1814783a interfaceC1814783a = c90p.A04;
                InterfaceC1814783a interfaceC1814783a2 = c90p.A03;
                InterfaceC1814783a interfaceC1814783a3 = c90p.A00;
                InterfaceC1814783a interfaceC1814783a4 = c90p.A01;
                InterfaceC1814783a interfaceC1814783a5 = c90p.A02;
                if (interfaceC1814783a != null) {
                    C224949wJ c224949wJ = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A04 = new PersistenceServiceHostBridgeHybrid(interfaceC1814783a.AML(), this.A05, 0);
                }
                if (interfaceC1814783a2 != null) {
                    C224949wJ c224949wJ2 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A03 = new PersistenceServiceHostBridgeHybrid(interfaceC1814783a2.AML(), this.A05, 1);
                }
                if (interfaceC1814783a3 != null) {
                    C224949wJ c224949wJ3 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A00 = new PersistenceServiceHostBridgeHybrid(interfaceC1814783a3.AML(), this.A05, 2);
                }
                if (interfaceC1814783a4 != null) {
                    C224949wJ c224949wJ4 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A01 = new PersistenceServiceHostBridgeHybrid(interfaceC1814783a4.AML(), this.A05, 3);
                }
                if (interfaceC1814783a5 != null) {
                    C224949wJ c224949wJ5 = PersistenceServiceHostBridgeHybrid.Companion;
                    this.A02 = new PersistenceServiceHostBridgeHybrid(interfaceC1814783a5.AML(), this.A05, 4);
                }
            }
        }
    }

    @Override // X.BE4
    public final List Epn() {
        List list = this.A06;
        if (list.isEmpty()) {
            return AbstractC166987dD.A1J(AbstractC167017dG.A0T("commandType", -1, AbstractC167007dF.A0o("serviceType", 64)));
        }
        ArrayList A1F = AbstractC166987dD.A1F(list);
        list.clear();
        return A1F;
    }

    public C24226Aos(NetworkClient networkClient) {
        this.A05 = networkClient;
    }
}
