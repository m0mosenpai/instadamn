package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30441cz extends AbstractC29011ae implements InterfaceC29491bQ {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1d1
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30441cz parseFromJson = F6E.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30441cz c30441cz = (C30441cz) obj;
            anonymousClass182.A0d();
            if (c30441cz.A00 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c30441cz.A00;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    c30441cz.A07();
                    anonymousClass182.A0S("locationId", c30441cz.A07());
                    String str = c30441cz.A02;
                    if (str != null) {
                        anonymousClass182.A0S("header_title_text", str);
                    }
                    if (c30441cz.A03 != null) {
                        C16V.A03(anonymousClass182, "location_share_xma");
                        for (C910143t c910143t : c30441cz.A03) {
                            if (c910143t != null) {
                                AbstractC910043s.A00(anonymousClass182, c910143t);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    AbstractC47856LCb.A00(anonymousClass182, c30441cz);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
    };
    public DirectThreadKey A00;
    public String A01;
    public String A02;
    public List A03;

    @Override // X.C1OW
    public final String A02() {
        return "send_location_share_message_xma";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str = this.A02;
        if (str != null) {
            List singletonList = Collections.singletonList(AbstractC47996LLi.A0F(null, str, null, null, null));
            C14360o3.A07(singletonList);
            return singletonList;
        }
        return this.A03;
    }

    public final String A07() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        C14360o3.A0F("locationId");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1w;
    }

    public C30441cz() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A01());
        C14360o3.A07(singletonList);
        this.A03 = singletonList;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A1w, A07());
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }
}
