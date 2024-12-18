package X;

import com.instagram.direct.model.DirectForwardingParams;
import java.util.List;

/* renamed from: X.1br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29761br extends AbstractC29011ae {
    public static final C1OZ A07 = new C1OZ() { // from class: X.1bs
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29761br c29761br = (C29761br) obj;
            anonymousClass182.A0d();
            if (c29761br.A05 != null) {
                C16V.A03(anonymousClass182, "rooms_link_share");
                for (C910143t c910143t : c29761br.A05) {
                    if (c910143t != null) {
                        AbstractC910043s.A00(anonymousClass182, c910143t);
                    }
                }
                anonymousClass182.A0Z();
            }
            String str = c29761br.A02;
            if (str != null) {
                anonymousClass182.A0S("link", str);
            }
            String str2 = c29761br.A01;
            if (str2 != null) {
                anonymousClass182.A0S("room_name", str2);
            }
            anonymousClass182.A0T("is_audio_only_call", c29761br.A06);
            String str3 = c29761br.A03;
            if (str3 != null) {
                anonymousClass182.A0S("link_hash", str3);
            }
            String str4 = c29761br.A04;
            if (str4 != null) {
                anonymousClass182.A0S("xma_type", str4);
            }
            if (c29761br.A00 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c29761br.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29761br);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C29761br parseFromJson = AbstractC46973Kps.parseFromJson(c16l);
            parseFromJson.getClass();
            return parseFromJson;
        }
    };

    @Deprecated
    public DirectForwardingParams A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public boolean A06;

    @Override // X.C1OW
    public final String A02() {
        return "send_rooms_link_xma";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A05;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1X;
    }
}
