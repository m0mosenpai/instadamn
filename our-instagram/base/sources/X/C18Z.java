package X;

import com.facebook.mobileconfig.common.MobileConfigContextTracker;
import java.util.Map;

/* renamed from: X.18Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C18Z implements MobileConfigContextTracker {
    public static final C225818b A02 = new Object();
    public static final String[] A03 = {"mc_1st_part_fetch_comp", "mc_1st_full_fetch_comp", "mc_last_part_fetch_comp", "mc_last_full_fetch_comp", "mc_1st_clear_cache", "mc_1st_set_latest_cache"};
    public static volatile C18Z A04;
    public final InterfaceC19630xq A00;
    public final Map A01;

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final boolean checkExitForSubkeyInNamespace(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) this.A01.get(str);
        if (interfaceC19630xq == null) {
            C0K8.A0O("IGMobileConfigContextTracker", "No key-value store is initialized for namespace %s", str);
            return false;
        }
        return interfaceC19630xq.contains(str2);
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final boolean getBoolForKey(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.getBoolean(str, false);
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final int getIntForKey(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.getInt(str, 0);
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final long getLongForKey(String str) {
        C14360o3.A0B(str, 0);
        return this.A00.getLong(str, 0L);
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final String getStringForKey(String str) {
        C14360o3.A0B(str, 0);
        String string = this.A00.getString(str, "");
        if (string == null) {
            return "";
        }
        return string;
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final String getStringForSubkeyInNamespace(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) this.A01.get(str);
        if (interfaceC19630xq == null) {
            C0K8.A0O("IGMobileConfigContextTracker", "No key-value store is initialized for namespace %s", str);
        } else {
            String string = interfaceC19630xq.getString(str2, "");
            if (string != null) {
                return string;
            }
        }
        return "";
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final void removeForNamespace(String str) {
        C14360o3.A0B(str, 0);
        InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) this.A01.get(str);
        if (interfaceC19630xq == null) {
            C0K8.A0O("IGMobileConfigContextTracker", "No key-value store is initialized for namespace %s", str);
            return;
        }
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.AHW();
        ARD.apply();
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final void setBoolForKey(String str, boolean z) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E77(str, z);
        ARD.apply();
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final void setIntForKey(String str, int i) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7D(str, i);
        ARD.apply();
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final void setLongForKey(String str, long j) {
        C14360o3.A0B(str, 0);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7G(str, j);
        ARD.apply();
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final void setStringForKey(String str, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str2, 1);
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.E7K(str, str2);
        ARD.apply();
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final void setStringForKeysInNamespace(String str, Map map, String str2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        C14360o3.A0B(str2, 2);
        if (str2.length() > 0 && checkExitForSubkeyInNamespace(str, str2)) {
            return;
        }
        InterfaceC19630xq interfaceC19630xq = (InterfaceC19630xq) this.A01.get(str);
        if (interfaceC19630xq == null) {
            C0K8.A0O("IGMobileConfigContextTracker", "No key-value store is initialized for namespace %s", str);
            return;
        }
        for (String str3 : map.keySet()) {
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7K(str3, (String) map.get(str3));
            ARD.apply();
        }
    }

    @Override // com.facebook.mobileconfig.common.MobileConfigContextTracker
    public final void removeForKey(String str) {
        InterfaceC19610xo ARD = this.A00.ARD();
        ARD.AHW();
        ARD.apply();
    }

    public C18Z(InterfaceC19630xq interfaceC19630xq, Map map) {
        this.A00 = interfaceC19630xq;
        this.A01 = map;
    }
}
