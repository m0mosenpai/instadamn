package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public abstract class OwC implements InterfaceC13050lr {
    public static final OGY A0F = new Object();
    public C82G A00;
    public C189478aR A01;
    public C196208mB A02;
    public C195918ld A03;
    public C35038FcB A04;
    public InterfaceC58075Pp0 A05;
    public InterfaceC57990Pna A06;
    public InterfaceC57991Pnb A07;
    public C54723OFa A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final UserSession A0E;

    public OwC(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0E = userSession;
    }

    public final Bundle A01() {
        InterfaceC19630xq A0x;
        String str;
        int i;
        Bundle A0b;
        String str2;
        String str3;
        String str4;
        int i2;
        if (this instanceof NVj) {
            NVj nVj = (NVj) this;
            UserSession userSession = nVj.A0E;
            boolean A00 = C196008lp.A00(userSession);
            boolean A002 = C196218mC.A00(userSession);
            C82G c82g = ((OwC) nVj).A00;
            if (c82g != null) {
                C82H c82h = nVj.A00;
                if (c82h == null) {
                    str4 = "upsellVariant";
                    C14360o3.A0F(str4);
                    throw C00O.createAndThrow();
                }
                int A07 = nVj.A07();
                C35038FcB c35038FcB = nVj.A04;
                if (c35038FcB != null) {
                    i2 = c35038FcB.A00;
                } else {
                    i2 = 0;
                }
                boolean z = nVj.A0C;
                String str5 = nVj.A09;
                str2 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = nVj.A0A;
                if (str6 != null) {
                    str2 = str6;
                }
                A0b = AbstractC166987dD.A0b();
                A0b.putBoolean("args_is_story_enabled", A00);
                A0b.putBoolean("args_is_post_enabled", A002);
                A00(A0b, c82g, c82h, A07);
                A0b.putInt("arg_nux_attempt_qpl_instance_key", i2);
                A0b.putBoolean("args_is_after_fbc", z);
                A0b.putString("args_media_id", str5);
                str3 = "args_waterfall_id";
                A0b.putString(str3, str2);
                return A0b;
            }
            str4 = "entrypoint";
            C14360o3.A0F(str4);
            throw C00O.createAndThrow();
        }
        NVk nVk = (NVk) this;
        C82G c82g2 = ((OwC) nVk).A00;
        if (c82g2 != null) {
            int ordinal = nVk.A00.ordinal();
            if (ordinal != 29) {
                if (ordinal != 34) {
                    if (ordinal != 30) {
                        A0x = AbstractC23021Ah.A00(nVk.A0E).A01;
                        if (ordinal != 15) {
                            str = "xpost_unified_onboarding_upsell_display_count";
                        } else {
                            str = "feed_reels_ccp_user_migration_story_upsell_display_count";
                        }
                    } else {
                        A0x = AbstractC166987dD.A0x(nVk.A0E);
                        str = "reels_ccp_user_migration_story_upsell_display_count";
                    }
                } else {
                    A0x = AbstractC166987dD.A0x(nVk.A0E);
                    str = "story_reels_ccp_user_migration_feed_upsell_display_count";
                }
            } else {
                A0x = AbstractC166987dD.A0x(nVk.A0E);
                str = "reels_ccp_user_migration_feed_upsell_display_count";
            }
            int A01 = AbstractC31172DnG.A01(A0x, str);
            boolean z2 = nVk.A0C;
            C35038FcB c35038FcB2 = nVk.A04;
            if (c35038FcB2 != null) {
                i = c35038FcB2.A00;
            } else {
                i = 0;
            }
            C82H c82h2 = nVk.A00;
            String str7 = nVk.A09;
            String str8 = "";
            if (str7 == null) {
                str7 = "";
            }
            String str9 = nVk.A0A;
            if (str9 != null) {
                str8 = str9;
            }
            C54723OFa c54723OFa = nVk.A08;
            AbstractC167017dG.A1S(c82h2, str7);
            A0b = AbstractC166987dD.A0b();
            A00(A0b, c82g2, c82h2, A01);
            A0b.putBoolean("args_is_after_fbc", z2);
            A0b.putInt("arg_nux_attempt_qpl_instance_key", i);
            A0b.putString("args_media_id", str7);
            A0b.putString("args_waterfall_id", str8);
            if (c54723OFa != null) {
                A0b.putString("args_title", c54723OFa.A0B);
                A0b.putString("args_body_icon_name_1", c54723OFa.A00);
                A0b.putString("args_body_icon_variant_1", c54723OFa.A03);
                A0b.putString("args_body_markdown_text_1", c54723OFa.A06);
                A0b.putString("args_body_icon_name_2", c54723OFa.A01);
                A0b.putString("args_body_icon_variant_2", c54723OFa.A04);
                A0b.putString("args_body_markdown_text_2", c54723OFa.A07);
                A0b.putString("args_body_icon_name_3", c54723OFa.A02);
                A0b.putString("args_body_icon_variant_3", c54723OFa.A05);
                A0b.putString("args_body_markdown_text_3", c54723OFa.A08);
                A0b.putString("args_primary_button_text", c54723OFa.A09);
                str2 = c54723OFa.A0A;
                str3 = "args_secondary_button_text";
                A0b.putString(str3, str2);
            }
            return A0b;
        }
        str4 = "entrypoint";
        C14360o3.A0F(str4);
        throw C00O.createAndThrow();
    }

    public final void A02() {
        UserSession userSession = this.A0E;
        if (C180377zR.A04(userSession) && (!C196218mC.A00(userSession) || !C196008lp.A00(userSession))) {
            new C55623On8(userSession).A01(AbstractC16960so.A1Q(new OTO("FEED", true), new OTO("STORY", true)), C57468Pf4.A00, C57469Pf5.A00);
            return;
        }
        C196218mC c196218mC = C196208mB.A03;
        if (!C196218mC.A00(userSession)) {
            c196218mC.A01(userSession, null, "upsell", true, true);
            C196208mB c196208mB = this.A02;
            if (c196208mB == null) {
                c196208mB = OQ9.A00(userSession);
                this.A02 = c196208mB;
            }
            C14360o3.A0C(c196208mB, "null cannot be cast to non-null type com.instagram.share.facebook.FeedShareToFBController");
            c196208mB.A01(userSession, "upsell", true);
        }
        C196008lp c196008lp = C195918ld.A05;
        if (C196008lp.A00(userSession)) {
            return;
        }
        c196008lp.A01(userSession, null, "upsell", true, true);
        C195918ld c195918ld = this.A03;
        if (c195918ld == null) {
            c195918ld = OQ9.A01(userSession, null);
            this.A03 = c195918ld;
        }
        C14360o3.A0C(c195918ld, "null cannot be cast to non-null type com.instagram.share.facebook.StoryShareToFBController");
        c195918ld.A05(true, "upsell");
    }

    public final void A03() {
        C196218mC c196218mC = C196208mB.A03;
        UserSession userSession = this.A0E;
        if (!C196218mC.A00(userSession)) {
            c196218mC.A01(userSession, null, "upsell", true, true);
            C196208mB c196208mB = this.A02;
            if (c196208mB == null) {
                c196208mB = OQ9.A00(userSession);
                this.A02 = c196208mB;
            }
            C14360o3.A0C(c196208mB, "null cannot be cast to non-null type com.instagram.share.facebook.FeedShareToFBController");
            c196208mB.A01(userSession, "upsell", true);
        }
    }

    public final void A04() {
        C196008lp c196008lp = C195918ld.A05;
        UserSession userSession = this.A0E;
        if (!C196008lp.A00(userSession)) {
            c196008lp.A01(userSession, null, "upsell", true, true);
            C195918ld c195918ld = this.A03;
            if (c195918ld == null) {
                c195918ld = OQ9.A01(userSession, null);
                this.A03 = c195918ld;
            }
            C14360o3.A0C(c195918ld, "null cannot be cast to non-null type com.instagram.share.facebook.StoryShareToFBController");
            c195918ld.A05(true, "upsell");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        if (r1 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(android.app.Activity r9) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OwC.A05(android.app.Activity):void");
    }

    public final boolean A06() {
        C82G c82g = this.A00;
        if (c82g != null) {
            if (c82g != C82G.A0f && c82g != C82G.A0g) {
                return false;
            }
            return true;
        }
        C14360o3.A0F("entrypoint");
        throw C00O.createAndThrow();
    }

    public static void A00(BaseBundle baseBundle, Object obj, Object obj2, int i) {
        baseBundle.putString("args_entrypoint", obj.toString());
        baseBundle.putString("args_upsell_variant", obj2.toString());
        baseBundle.putInt("args_num_of_views", i);
    }
}
