package X;

import java.util.List;

/* renamed from: X.1ea, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31311ea extends AbstractC29011ae {
    public static final C1OZ A09 = new C1OZ() { // from class: X.1eb
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C31311ea c31311ea = (C31311ea) obj;
            anonymousClass182.A0d();
            if (c31311ea.A01 != null) {
                anonymousClass182.A0r("direct_pending_media");
                C7Q5 c7q5 = c31311ea.A01;
                anonymousClass182.A0d();
                EnumC40111tc enumC40111tc = c7q5.A01;
                if (enumC40111tc != null) {
                    anonymousClass182.A0S("mediaType", AbstractC47866LCm.A01(enumC40111tc));
                }
                String str = c7q5.A04;
                if (str != null) {
                    anonymousClass182.A0S("photo_path", str);
                }
                String str2 = c7q5.A05;
                if (str2 != null) {
                    anonymousClass182.A0S("video_path", str2);
                }
                anonymousClass182.A0P("aspectPostCrop", c7q5.A00);
                if (c7q5.A07 != null) {
                    C16V.A03(anonymousClass182, "tap_models");
                    for (C84823qW c84823qW : c7q5.A07) {
                        if (c84823qW != null) {
                            AbstractC1123155i.A00(anonymousClass182, c84823qW);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0T("is_awaiting_burn_in", c7q5.A08);
                String str3 = c7q5.A06;
                if (str3 != null) {
                    anonymousClass182.A0S("view_mode", str3);
                }
                if (c7q5.A02 != null) {
                    anonymousClass182.A0r("pending_media");
                    C47Y.A01(anonymousClass182, c7q5.A02);
                }
                String str4 = c7q5.A03;
                if (str4 != null) {
                    anonymousClass182.A0S("pending_media_key", str4);
                }
                anonymousClass182.A0a();
            }
            String str5 = c31311ea.A06;
            if (str5 != null) {
                anonymousClass182.A0S("view_mode", str5);
            }
            String str6 = c31311ea.A03;
            if (str6 != null) {
                anonymousClass182.A0S("reply_type", str6);
            }
            String str7 = c31311ea.A05;
            if (str7 != null) {
                anonymousClass182.A0S("source_media_id", str7);
            }
            if (c31311ea.A00 != null) {
                anonymousClass182.A0r("replied_to_message");
                AbstractC43642JSa.A01(anonymousClass182, c31311ea.A00);
            }
            AbstractC47856LCb.A00(anonymousClass182, c31311ea);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46934KpF.parseFromJson(c16l);
        }
    };
    public AnonymousClass442 A00;
    public C7Q5 A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public boolean A08;

    @Override // X.C1OW
    public final String A02() {
        return "configure_visual_message";
    }

    @Override // X.AbstractC29011ae
    public final AnonymousClass442 A03() {
        return this.A00;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A01;
    }

    public final C211689Zc A07() {
        String str = this.A05;
        String str2 = this.A03;
        String str3 = this.A06;
        if (str3 == null && str2 == null && str == null) {
            return null;
        }
        return new C211689Zc(str3, str2, str, this.A04, null, null, false, null);
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0q;
    }
}
