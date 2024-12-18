package X;

import com.facebook.location.platform.api.Location;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1d4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30461d4 extends AbstractC29011ae {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1d6
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C30461d4 parseFromJson = AbstractC34173F5x.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C30461d4 c30461d4 = (C30461d4) obj;
            anonymousClass182.A0d();
            if (c30461d4.A02 != null) {
                anonymousClass182.A0r("thread_key");
                DirectThreadKey directThreadKey = c30461d4.A02;
                if (directThreadKey != null) {
                    AbstractC83623o5.A00(anonymousClass182, directThreadKey);
                    anonymousClass182.A0O(Location.LATITUDE, c30461d4.A00);
                    anonymousClass182.A0O("longitude", c30461d4.A01);
                    String str = c30461d4.A04;
                    if (str != null) {
                        anonymousClass182.A0S("localized_address", str);
                    }
                    String str2 = c30461d4.A03;
                    if (str2 != null) {
                        anonymousClass182.A0S("header_title_text", str2);
                    }
                    AbstractC47856LCb.A00(anonymousClass182, c30461d4);
                    anonymousClass182.A0a();
                    return;
                }
            }
            C14360o3.A0F("threadKey");
            throw C00O.createAndThrow();
        }
    };
    public double A00;
    public double A01;
    public DirectThreadKey A02;
    public String A03;
    public String A04;

    @Override // X.C1OW
    public final String A02() {
        return "send_address_share_message_xma";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0s;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        List singletonList = Collections.singletonList(AbstractC47996LLi.A00());
        C14360o3.A07(singletonList);
        return singletonList;
    }
}
