package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.direct.model.DirectForwardingParams;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1bZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29581bZ extends AbstractC29011ae implements InterfaceC29521bT {
    public static final C1OZ A04 = new C1OZ() { // from class: X.1ba
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C29581bZ parseFromJson = F64.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C29581bZ c29581bZ = (C29581bZ) obj;
            anonymousClass182.A0d();
            if (c29581bZ.A00 != null) {
                anonymousClass182.A0r("destination_share");
                QJ0 qj0 = c29581bZ.A00;
                anonymousClass182.A0d();
                String str = qj0.A04;
                if (str != null) {
                    anonymousClass182.A0S(DialogModule.KEY_TITLE, str);
                }
                String str2 = qj0.A03;
                if (str2 != null) {
                    anonymousClass182.A0S("subtitle", str2);
                }
                String str3 = qj0.A01;
                if (str3 != null) {
                    anonymousClass182.A0S("cta_target_url", str3);
                }
                String str4 = qj0.A02;
                if (str4 != null) {
                    anonymousClass182.A0S("header_icon_url_info", str4);
                }
                List<String> list = (List) qj0.A00;
                if (list != null) {
                    C16V.A03(anonymousClass182, "preview_extra_urls_info");
                    for (String str5 : list) {
                        if (str5 != null) {
                            anonymousClass182.A0u(str5);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0a();
            }
            if (c29581bZ.A01 != null) {
                anonymousClass182.A0r("direct_forwarding_params");
                FUT.A00(anonymousClass182, c29581bZ.A01);
            }
            String str6 = c29581bZ.A02;
            if (str6 != null) {
                anonymousClass182.A0S("destination_id", str6);
            }
            String str7 = c29581bZ.A03;
            if (str7 != null) {
                anonymousClass182.A0S("tag_id", str7);
            }
            AbstractC47856LCb.A00(anonymousClass182, c29581bZ);
            anonymousClass182.A0a();
        }
    };
    public QJ0 A00;

    @Deprecated
    public DirectForwardingParams A01;
    public String A02;
    public String A03;

    @Override // X.C1OW
    public final String A02() {
        return "send_destination_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        String str2;
        String str3;
        String str4;
        QJ0 qj0 = this.A00;
        List list = null;
        if (qj0 != null) {
            str = qj0.A04;
            str2 = qj0.A03;
            str3 = qj0.A01;
            str4 = qj0.A02;
            list = (List) qj0.A00;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0K(str, str2, str3, str4, list));
        C14360o3.A07(singletonList);
        List unmodifiableList = Collections.unmodifiableList(singletonList);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0g;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A0g;
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        String str;
        String str2;
        String str3;
        String str4;
        C47939LFp A00 = AbstractC46893Koa.A00();
        C2EY c2ey = C2EY.A0g;
        QJ0 qj0 = this.A00;
        List list = null;
        if (qj0 != null) {
            str = qj0.A04;
            str2 = qj0.A03;
            str3 = qj0.A01;
            str4 = qj0.A02;
            list = (List) qj0.A00;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        List singletonList = Collections.singletonList(AbstractC47996LLi.A0K(str, str2, str3, str4, list));
        C14360o3.A07(singletonList);
        List singletonList2 = Collections.singletonList(A00.A00(c2ey, singletonList));
        C14360o3.A07(singletonList2);
        return singletonList2;
    }
}
