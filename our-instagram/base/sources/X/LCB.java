package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public abstract class LCB {
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.7QR] */
    public static C7QR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("text".equals(A0s)) {
                    obj.A0A = AbstractC167017dG.A0m(c16l);
                } else if ("media".equals(A0s)) {
                    obj.A02 = C38321qM.A00(c16l);
                } else if ("mentioned_user_id".equals(A0s)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("mentioned_user_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    obj.A0B = arrayList;
                } else if ("sponsor_user_id".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("mentioned_user".equals(A0s)) {
                    SimpleImageUrl simpleImageUrl = User.A08;
                    obj.A05 = AbstractC38851rI.A00(c16l, false);
                } else if (AbstractC111324zv.A00(235).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    obj.A0C = arrayList;
                } else if ("is_reel_persisted".equals(A0s)) {
                    obj.A0F = c16l.A0d();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0s)) {
                    String A1P = c16l.A1P();
                    C7O9 c7o9 = C7O9.COUNTDOWN;
                    if (!AbstractC111324zv.A00(2198).equals(A1P)) {
                        c7o9 = C7O9.SMB_SUPPORT;
                        if (!"smb_support".equals(A1P)) {
                            c7o9 = C7O9.MENTION;
                            if (!"mention".equals(A1P)) {
                                c7o9 = C7O9.EMOJI_REACTION;
                                if (!"reaction".equals(A1P)) {
                                    c7o9 = C7O9.QUESTION_RESPONSE;
                                    if (!"question_response".equals(A1P)) {
                                        c7o9 = C7O9.REPLY_GIF;
                                        if (!"reply_gif".equals(A1P)) {
                                            c7o9 = C7O9.INTERACTIVE_STICKER;
                                            if (!"interactive_sticker".equals(A1P)) {
                                                c7o9 = C7O9.AVATAR_REACTION;
                                                if (!"avatar_reaction".equals(A1P)) {
                                                    c7o9 = C7O9.REPLY;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obj.A01 = c7o9;
                } else if ("reel_owner_id".equals(A0s)) {
                    obj.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("reel_id".equals(A0s)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("reel_type".equals(A0s)) {
                    obj.A04 = AbstractC40281tw.A00(AbstractC167017dG.A0m(c16l));
                } else if ("animated_media".equals(A0s)) {
                    obj.A03 = C54V.parseFromJson(c16l);
                } else if ("can_repost".equals(A0s)) {
                    obj.A0D = c16l.A0d();
                } else if ("is_challenge_nomination".equals(A0s)) {
                    obj.A0E = c16l.A0d();
                } else if ("interactive_sticker_reply".equals(A0s)) {
                    obj.A00 = AbstractC46833KnS.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            obj.A03();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C7QR c7qr) {
        anonymousClass182.A0d();
        AbstractC37301Gc2.A1E(anonymousClass182, c7qr.A0A);
        if (c7qr.A02 != null) {
            anonymousClass182.A0r("media");
            C38321qM c38321qM = c7qr.A02;
            AtomicBoolean atomicBoolean = C38321qM.A0i;
            C38801rC.A07(anonymousClass182, c38321qM);
        }
        String str = c7qr.A07;
        if (str != null) {
            anonymousClass182.A0S("mentioned_user_id", str);
        }
        if (c7qr.A0B != null) {
            C16V.A03(anonymousClass182, "mentioned_user_ids");
            Iterator it = c7qr.A0B.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it);
            }
            anonymousClass182.A0Z();
        }
        String str2 = c7qr.A06;
        if (str2 != null) {
            anonymousClass182.A0S("sponsor_user_id", str2);
        }
        if (c7qr.A05 != null) {
            anonymousClass182.A0r("mentioned_user");
            User user = c7qr.A05;
            SimpleImageUrl simpleImageUrl = User.A08;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        if (c7qr.A0C != null) {
            C16V.A03(anonymousClass182, AbstractC111324zv.A00(235));
            Iterator it2 = c7qr.A0C.iterator();
            while (it2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, it2);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("is_reel_persisted", c7qr.A0F);
        C7O9 c7o9 = c7qr.A01;
        if (c7o9 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c7o9.A00);
        }
        String str3 = c7qr.A09;
        if (str3 != null) {
            anonymousClass182.A0S("reel_owner_id", str3);
        }
        String str4 = c7qr.A08;
        if (str4 != null) {
            anonymousClass182.A0S("reel_id", str4);
        }
        ReelType reelType = c7qr.A04;
        if (reelType != null) {
            anonymousClass182.A0S("reel_type", reelType.A00);
        }
        if (c7qr.A03 != null) {
            anonymousClass182.A0r("animated_media");
            C54V.A00(anonymousClass182, c7qr.A03);
        }
        anonymousClass182.A0T("can_repost", c7qr.A0D);
        anonymousClass182.A0T("is_challenge_nomination", c7qr.A0E);
        if (c7qr.A00 != null) {
            anonymousClass182.A0r("interactive_sticker_reply");
            C47653L2m c47653L2m = c7qr.A00;
            anonymousClass182.A0d();
            String str5 = c47653L2m.A01;
            if (str5 != null) {
                anonymousClass182.A0S("interactive_sticker_type", str5);
            }
            String str6 = c47653L2m.A02;
            if (str6 != null) {
                anonymousClass182.A0S("interactive_user_id", str6);
            }
            String str7 = c47653L2m.A00;
            if (str7 != null) {
                anonymousClass182.A0S("emoji_reaction_unicode", str7);
            }
            String str8 = c47653L2m.A03;
            if (str8 != null) {
                anonymousClass182.A0S("poll_vote_string", str8);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
