package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;
import java.util.Map;

/* renamed from: X.LYv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48297LYv implements InterfaceC23471Cj {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ LocationPluginImpl A02;
    public final /* synthetic */ InterfaceC127465pP A03;
    public final /* synthetic */ MQC A04;
    public final /* synthetic */ VDJ A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public C48297LYv(Activity activity, UserSession userSession, LocationPluginImpl locationPluginImpl, InterfaceC127465pP interfaceC127465pP, MQC mqc, VDJ vdj, String str, String str2, boolean z) {
        this.A02 = locationPluginImpl;
        this.A08 = z;
        this.A04 = mqc;
        this.A01 = userSession;
        this.A06 = str;
        this.A05 = vdj;
        this.A00 = activity;
        this.A07 = str2;
        this.A03 = interfaceC127465pP;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        boolean z = this.A08;
        boolean z2 = true;
        if (z) {
            str = "android.permission.ACCESS_FINE_LOCATION";
        } else {
            str = "android.permission.ACCESS_COARSE_LOCATION";
        }
        EnumC172127lh enumC172127lh = (EnumC172127lh) map.get(str);
        MQC mqc = this.A04;
        if (enumC172127lh == null) {
            enumC172127lh = EnumC172127lh.A03;
        }
        mqc.DYD(enumC172127lh);
        if (map.get(str) != EnumC172127lh.A05) {
            z2 = false;
        }
        LocationPluginImpl locationPluginImpl = this.A02;
        UserSession userSession = this.A01;
        String str2 = this.A06;
        VDJ vdj = this.A05;
        LocationPluginImpl.A05(userSession, str2, vdj.name(), map);
        Activity activity = this.A00;
        String str3 = this.A07;
        if (z2) {
            LocationPluginImpl.A00(activity, userSession, locationPluginImpl, vdj, "app_permission_grant", str3, z);
            LocationPluginImpl.A02(userSession, locationPluginImpl, this.A03, str2, false);
        } else {
            LocationPluginImpl.A00(activity, userSession, locationPluginImpl, vdj, "app_permission_deny", str3, z);
        }
    }
}
