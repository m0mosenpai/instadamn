package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.infocenter.intf.InfoCenterFactShareInfoIntf;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.1dJ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1dJ extends AbstractC29011ae implements InterfaceC29491bQ {
    public static final C1OZ A0C = new C1OZ() { // from class: X.1dK
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C1dJ c1dJ = (C1dJ) obj;
            anonymousClass182.A0d();
            Integer num = c1dJ.A03;
            if (num != null) {
                anonymousClass182.A0S("info_center_type", AbstractC47055KrC.A00(num));
            }
            String str = c1dJ.A08;
            if (str != null) {
                anonymousClass182.A0S("fact_name", str);
            }
            String str2 = c1dJ.A09;
            if (str2 != null) {
                anonymousClass182.A0S("fact_title", str2);
            }
            String str3 = c1dJ.A05;
            if (str3 != null) {
                anonymousClass182.A0S("content_source", str3);
            }
            String str4 = c1dJ.A0B;
            if (str4 != null) {
                anonymousClass182.A0S("header_title", str4);
            }
            String str5 = c1dJ.A0A;
            if (str5 != null) {
                anonymousClass182.A0S("header_subtitle", str5);
            }
            if (c1dJ.A00 != null) {
                anonymousClass182.A0r("header_icon_url");
                AbstractC222616c.A01(anonymousClass182, c1dJ.A00);
            }
            if (c1dJ.A01 != null) {
                anonymousClass182.A0r("preview_image_url");
                AbstractC222616c.A01(anonymousClass182, c1dJ.A01);
            }
            String str6 = c1dJ.A07;
            if (str6 != null) {
                anonymousClass182.A0S("deep_link_url", str6);
            }
            String str7 = c1dJ.A04;
            if (str7 != null) {
                anonymousClass182.A0S("all_facts_deep_link_url", str7);
            }
            String str8 = c1dJ.A06;
            if (str8 != null) {
                anonymousClass182.A0S("cta_button_text", str8);
            }
            AbstractC47856LCb.A00(anonymousClass182, c1dJ);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46961Kpg.parseFromJson(c16l);
        }
    };
    public ImageUrl A00;
    public ImageUrl A01;
    public InfoCenterFactShareInfoIntf A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;

    @Override // X.C1OW
    public final String A02() {
        return "send_info_center_fact_share_message";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003b, code lost:
    
        if (r5.length() == 0) goto L6;
     */
    @Override // X.AbstractC29011ae
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A05() {
        /*
            r13 = this;
            com.instagram.common.typedurl.ImageUrl r0 = r13.A00
            java.lang.String r2 = r0.getUrl()
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            com.instagram.model.mediasize.ExtendedImageUrl r6 = new com.instagram.model.mediasize.ExtendedImageUrl
            r6.<init>(r2, r1, r0)
            java.lang.String r8 = r13.A0B
            java.lang.String r9 = r13.A0A
            com.instagram.common.typedurl.ImageUrl r0 = r13.A01
            java.lang.String r2 = r0.getUrl()
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            com.instagram.model.mediasize.ExtendedImageUrl r7 = new com.instagram.model.mediasize.ExtendedImageUrl
            r7.<init>(r2, r1, r0)
            java.lang.String r5 = r13.A09
            java.lang.String r11 = r13.A05
            java.lang.String r12 = r13.A07
            java.lang.String r4 = r13.A04
            java.lang.String r3 = r13.A06
            if (r5 == 0) goto L3d
            int r0 = r5.length()
            r10 = r5
            if (r0 != 0) goto L3e
        L3d:
            r10 = r11
        L3e:
            r1 = 0
            if (r5 == 0) goto L47
            int r0 = r5.length()
            if (r0 != 0) goto L48
        L47:
            r11 = r1
        L48:
            X.43t r2 = X.AbstractC47996LLi.A08(r6, r7, r8, r9, r10, r11, r12)
            if (r5 == 0) goto L75
            int r0 = r5.length()
            if (r0 == 0) goto L75
            if (r4 == 0) goto L75
            int r0 = r4.length()
            if (r0 == 0) goto L75
            if (r3 == 0) goto L75
            int r0 = r3.length()
            if (r0 == 0) goto L75
            java.lang.String r1 = "web_url"
            X.9CP r0 = new X.9CP
            r0.<init>(r3, r1, r4)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C14360o3.A07(r0)
            r2.A1X = r0
        L75:
            java.util.List r0 = java.util.Collections.singletonList(r2)
            X.C14360o3.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1dJ.A05():java.lang.Object");
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A13;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A13, this.A02);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }
}
