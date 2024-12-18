package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Lgy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48730Lgy implements InterfaceC50474MQc {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final EnumC46201Kcd A02;

    @Override // X.InterfaceC50474MQc
    public final C1ON AEh(C1OL c1ol, String str) {
        String str2;
        boolean A1X = AbstractC167007dF.A1X(this.A02, EnumC46201Kcd.GIPHY_GIFS);
        C25621Ms A0N = AbstractC31173DnH.A0N(this.A01);
        A0N.A03();
        A0N.A0D = "api.giphy.com";
        A0N.A0Q = true;
        A0N.A9s("api_key", "BuzY9ZS4YEbDjxEaN2ZfsOqm1TUD85Ax");
        A0N.A9s("rating", "PG");
        A0N.A9s("lang", "en");
        A0N.A9s("limit", "44");
        A0N.A0S(K8Q.class, C47878LCy.class);
        if (!str.isEmpty()) {
            A0N.A9s("q", str);
            if (A1X) {
                str2 = "/v1/gifs/search";
            } else {
                str2 = "/v1/stickers/search";
            }
        } else if (A1X) {
            str2 = "/v1/gifs/trending";
        } else {
            str2 = "/v1/stickers/trending";
        }
        A0N.A0E = str2;
        return A0N.A0N();
    }

    @Override // X.InterfaceC50474MQc
    public final /* synthetic */ String E3X(C40781ul c40781ul) {
        return null;
    }

    @Override // X.InterfaceC50474MQc
    public final /* bridge */ /* synthetic */ List E3Y(C40781ul c40781ul, EnumC46201Kcd enumC46201Kcd, String str) {
        K8Q k8q = (K8Q) c40781ul;
        AbstractC167017dG.A1N(enumC46201Kcd, k8q);
        List list = k8q.A01;
        boolean z = true;
        boolean A1X = AbstractC167007dF.A1X(enumC46201Kcd, EnumC46201Kcd.GIPHY_STICKERS);
        UserSession userSession = this.A01;
        Boolean valueOf = Boolean.valueOf(A1X);
        if (str.length() != 0) {
            z = false;
        }
        ArrayList A01 = LHG.A01(userSession, valueOf, list, z);
        list.size();
        A01.size();
        return A01;
    }

    public C48730Lgy(InterfaceC11380iw interfaceC11380iw, UserSession userSession, EnumC46201Kcd enumC46201Kcd) {
        this.A02 = enumC46201Kcd;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
