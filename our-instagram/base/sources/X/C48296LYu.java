package X;

import com.instagram.common.session.UserSession;
import com.instagram.location.impl.LocationPluginImpl;
import java.util.Map;

/* renamed from: X.LYu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48296LYu implements InterfaceC23471Cj {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ MQC A02;
    public final /* synthetic */ VDJ A03;
    public final /* synthetic */ InterfaceC57959Pn5 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String[] A06;

    public C48296LYu(UserSession userSession, LocationPluginImpl locationPluginImpl, MQC mqc, VDJ vdj, InterfaceC57959Pn5 interfaceC57959Pn5, String str, String[] strArr) {
        this.A01 = locationPluginImpl;
        this.A06 = strArr;
        this.A02 = mqc;
        this.A00 = userSession;
        this.A05 = str;
        this.A03 = vdj;
        this.A04 = interfaceC57959Pn5;
    }

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        EnumC172127lh A01 = AbstractC23451Ch.A01(map, this.A06);
        this.A02.DYD(A01);
        LocationPluginImpl locationPluginImpl = this.A01;
        UserSession userSession = this.A00;
        String str = this.A05;
        LocationPluginImpl.A05(userSession, str, this.A03.name(), map);
        if (A01 == EnumC172127lh.A05) {
            LocationPluginImpl.A03(userSession, locationPluginImpl, this.A04, str);
        }
    }
}
