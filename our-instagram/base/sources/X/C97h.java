package X;

import com.facebook.ppml.enigma.EnigmaSQLite;
import com.facebook.ppml.enigma.InstallReferrerEventV2;
import java.util.List;

/* renamed from: X.97h, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C97h {
    public final InterfaceC09390do A00;
    public final C18920wW A01;

    public final InstallReferrerEventV2 A01(String str, String str2) {
        C14360o3.A0B(str2, 4);
        try {
            List installReferrerEventV3 = ((EnigmaSQLite) this.A00.getValue()).getInstallReferrerEventV3(str, 0L, 0L, str2, 1);
            if (!(!installReferrerEventV3.isEmpty())) {
                return null;
            }
            InstallReferrerEventV2 installReferrerEventV2 = (InstallReferrerEventV2) installReferrerEventV3.get(0);
            A00(this, "getv2", installReferrerEventV2.assetID, null, null, installReferrerEventV2.activityType);
            return installReferrerEventV2;
        } catch (Exception e) {
            A00(this, "getv2", str, null, e.getMessage(), -1L);
            return null;
        }
    }

    public static final void A00(C97h c97h, String str, String str2, String str3, String str4, long j) {
        Long l;
        C18920wW c18920wW = c97h.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "android_on_device_install_referrer_logging");
        if (A00.isSampled()) {
            A00.AAP("action", str);
            A00.AAP("asset_id", str2);
            A00.A9K("activity_type", Long.valueOf(j));
            A00.AAP("error", str4);
            if (str3 != null) {
                l = AbstractC003100w.A0k(10, str3);
            } else {
                l = null;
            }
            A00.A9K("ad_id", l);
            A00.Cht();
        }
    }

    public final void A02(InstallReferrerEventV2 installReferrerEventV2, String str) {
        try {
            ((EnigmaSQLite) this.A00.getValue()).insertInstallReferrerEventV2(installReferrerEventV2.assetID, installReferrerEventV2.activityType, installReferrerEventV2.installReferrer, installReferrerEventV2.timestamp, installReferrerEventV2.packageName, 1);
            A00(this, "savev2", installReferrerEventV2.assetID, str, null, installReferrerEventV2.activityType);
        } catch (Exception e) {
            A00(this, "savev2", installReferrerEventV2.assetID, str, e.getMessage(), installReferrerEventV2.activityType);
        }
    }

    public C97h() {
        C12210kP c12210kP = new C12210kP(AbstractC12960li.A00);
        c12210kP.A01 = "odir_storage";
        this.A01 = c12210kP.A00();
        this.A00 = AbstractC09440dt.A01(C2053897i.A00);
    }
}
