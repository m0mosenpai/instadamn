package X;

import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;
import java.util.Map;

/* renamed from: X.LYt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48295LYt implements InterfaceC23471Cj {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ MQC A02;
    public final /* synthetic */ VDJ A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C48295LYt(UserSession userSession, LocationPluginImpl locationPluginImpl, MQC mqc, VDJ vdj, String str, boolean z) {
        this.A01 = locationPluginImpl;
        this.A05 = z;
        this.A02 = mqc;
        this.A00 = userSession;
        this.A04 = str;
        this.A03 = vdj;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        String str;
        if (this.A05) {
            str = "android.permission.ACCESS_FINE_LOCATION";
        } else {
            str = "android.permission.ACCESS_COARSE_LOCATION";
        }
        EnumC172127lh enumC172127lh = (EnumC172127lh) map.get(str);
        MQC mqc = this.A02;
        if (enumC172127lh == null) {
            enumC172127lh = EnumC172127lh.A03;
        }
        mqc.DYD(enumC172127lh);
        LocationPluginImpl.A05(this.A00, this.A04, this.A03.name(), map);
    }
}
