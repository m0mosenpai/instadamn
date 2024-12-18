package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.user.model.User;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AEH {
    public static C189138Ze parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            C44H c44h = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            User user = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(130);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("auxiliary_message".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("button_text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("consumption_sheet_config".equals(A0s)) {
                    c44h = C44D.parseFromJson(c16l);
                } else if ("end_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("fundraiser_sticker_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("ig_charity_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (A00.equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("pk".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("source_name".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("start_background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("subtitle_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("title_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0s)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("button_text_color", c16l, "FundraiserStickerDict");
            } else if (c44h != null || !(c16l instanceof C07950bF)) {
                if (str3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("end_background_color", c16l, "FundraiserStickerDict");
                } else if (num == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(A00, c16l, "FundraiserStickerDict");
                } else if (str6 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("pk", c16l, "FundraiserStickerDict");
                } else if (str7 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("source_name", c16l, "FundraiserStickerDict");
                } else if (str8 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("start_background_color", c16l, "FundraiserStickerDict");
                } else if (str9 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("subtitle_color", c16l, "FundraiserStickerDict");
                } else if (str10 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "FundraiserStickerDict");
                } else if (str11 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("title_color", c16l, "FundraiserStickerDict");
                } else {
                    return new C189138Ze(c44h, user, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("consumption_sheet_config", c16l, "FundraiserStickerDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C189138Ze c189138Ze, boolean z) {
        if (z) {
            anonymousClass182.A0d();
        }
        String str = c189138Ze.A03;
        if (str != null) {
            anonymousClass182.A0S("auxiliary_message", str);
        }
        String str2 = c189138Ze.A04;
        if (str2 != null) {
            anonymousClass182.A0S("button_text_color", str2);
        }
        C44I c44i = c189138Ze.A01;
        if (c44i != null) {
            anonymousClass182.A0r("consumption_sheet_config");
            C44D.A00(anonymousClass182, c44i.F55());
        }
        String str3 = c189138Ze.A05;
        if (str3 != null) {
            anonymousClass182.A0S("end_background_color", str3);
        }
        String str4 = c189138Ze.A06;
        if (str4 != null) {
            anonymousClass182.A0S("fundraiser_sticker_type", str4);
        }
        String str5 = c189138Ze.A07;
        if (str5 != null) {
            anonymousClass182.A0S("ig_charity_id", str5);
        }
        anonymousClass182.A0Q(AbstractC111324zv.A00(130), c189138Ze.A00);
        String str6 = c189138Ze.A08;
        if (str6 != null) {
            anonymousClass182.A0S("pk", str6);
        }
        String str7 = c189138Ze.A09;
        if (str7 != null) {
            anonymousClass182.A0S("source_name", str7);
        }
        String str8 = c189138Ze.A0A;
        if (str8 != null) {
            anonymousClass182.A0S("start_background_color", str8);
        }
        String str9 = c189138Ze.A0B;
        if (str9 != null) {
            anonymousClass182.A0S("subtitle_color", str9);
        }
        String str10 = c189138Ze.A0C;
        if (str10 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str10);
        }
        String str11 = c189138Ze.A0D;
        if (str11 != null) {
            anonymousClass182.A0S("title_color", str11);
        }
        User user = c189138Ze.A02;
        if (user != null) {
            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            Parcelable.Creator creator = User.CREATOR;
            AbstractC38851rI.A08(anonymousClass182, user);
        }
        if (z) {
            anonymousClass182.A0a();
        }
    }
}
