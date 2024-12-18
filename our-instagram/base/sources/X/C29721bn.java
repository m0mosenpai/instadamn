package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1bn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C29721bn extends AbstractC29011ae implements InterfaceC29491bQ, InterfaceC29501bR {
    public static final C1OZ A0L = new C1OZ() { // from class: X.1bo
        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C29721bn c29721bn = (C29721bn) obj;
            anonymousClass182.A0d();
            String str = c29721bn.A0J;
            if (str != null) {
                anonymousClass182.A0S("reel_owner_user_id", str);
            }
            String str2 = c29721bn.A0I;
            if (str2 != null) {
                anonymousClass182.A0S("reel_id", str2);
            }
            if (c29721bn.A00 != null) {
                anonymousClass182.A0r("reel_share");
                LCB.A00(anonymousClass182, c29721bn.A00);
            }
            String str3 = c29721bn.A0H;
            if (str3 != null) {
                anonymousClass182.A0S("reaction_name", str3);
            }
            String str4 = c29721bn.A08;
            if (str4 != null) {
                anonymousClass182.A0S("avatar_sticker_id", str4);
            }
            String str5 = c29721bn.A0A;
            if (str5 != null) {
                anonymousClass182.A0S("avatar_sticker_template", str5);
            }
            String str6 = c29721bn.A09;
            if (str6 != null) {
                anonymousClass182.A0S("avatar_sticker_media_type", str6);
            }
            Integer num = c29721bn.A07;
            if (num != null) {
                anonymousClass182.A0Q("nux_type", num.intValue());
            }
            String str7 = c29721bn.A0D;
            if (str7 != null) {
                anonymousClass182.A0S("gif_id", str7);
            }
            anonymousClass182.A0T("gif_is_sticker", c29721bn.A0K);
            String str8 = c29721bn.A0F;
            if (str8 != null) {
                anonymousClass182.A0S("interactive_sticker_id", str8);
            }
            String str9 = c29721bn.A0G;
            if (str9 != null) {
                anonymousClass182.A0S("interactive_sticker_type", str9);
            }
            String str10 = c29721bn.A0E;
            if (str10 != null) {
                anonymousClass182.A0S("interact_user_id", str10);
            }
            String str11 = c29721bn.A0B;
            if (str11 != null) {
                anonymousClass182.A0S("emoji_reaction_unicode", str11);
            }
            String str12 = c29721bn.A0C;
            if (str12 != null) {
                anonymousClass182.A0S(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str12);
            }
            Boolean bool = c29721bn.A05;
            if (bool != null) {
                anonymousClass182.A0T("is_suggested_reply", bool.booleanValue());
            }
            Boolean bool2 = c29721bn.A06;
            if (bool2 != null) {
                anonymousClass182.A0T("receiver_is_online", bool2.booleanValue());
            }
            if (c29721bn.A01 != null) {
                anonymousClass182.A0r("reaction_image_url_info");
                C17Y.A00(anonymousClass182, c29721bn.A01);
            }
            Boolean bool3 = c29721bn.A02;
            if (bool3 != null) {
                anonymousClass182.A0T("is_group", bool3.booleanValue());
            }
            Boolean bool4 = c29721bn.A03;
            if (bool4 != null) {
                anonymousClass182.A0T("is_group_profile_story_reply", bool4.booleanValue());
            }
            Boolean bool5 = c29721bn.A04;
            if (bool5 != null) {
                anonymousClass182.A0T("is_highlight_reel", bool5.booleanValue());
            }
            AbstractC47856LCb.A00(anonymousClass182, c29721bn);
            anonymousClass182.A0a();
        }

        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            return AbstractC46971Kpq.parseFromJson(c16l);
        }
    };
    public C7QR A00;
    public ExtendedImageUrl A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Integer A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public boolean A0K;

    @Override // X.C1OW
    public final String A02() {
        return "send_reel_share_message";
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        return this.A00;
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A1V;
    }

    @Override // X.InterfaceC29511bS
    public final Object BSj() {
        Object obj;
        C7QR c7qr = this.A00;
        C7O9 c7o9 = c7qr.A01;
        if (c7o9 == C7O9.REPLY_GIF) {
            obj = c7qr.A03;
        } else if (c7o9 == C7O9.AVATAR_REACTION) {
            obj = this.A01;
        } else {
            return c7qr.A0A;
        }
        obj.getClass();
        return obj;
    }

    @Override // X.InterfaceC29511bS
    public final C2EY BSm() {
        C7O9 c7o9 = this.A00.A01;
        if (c7o9 == C7O9.EMOJI_REACTION) {
            return C2EY.A0m;
        }
        if (c7o9 == C7O9.AVATAR_REACTION) {
            return C2EY.A0N;
        }
        if (c7o9 == C7O9.REPLY_GIF) {
            return C2EY.A0K;
        }
        return C2EY.A1i;
    }

    @Override // X.InterfaceC29521bT
    public final C2EY CIC() {
        return C2EY.A20;
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        String A01 = C47842LBj.A00().A01(C2EY.A20, this.A00);
        return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
    }

    @Override // X.InterfaceC29521bT
    public final List CI9() {
        return Collections.singletonList(AbstractC46893Koa.A00().A00(C2EY.A1V, this.A00));
    }
}
