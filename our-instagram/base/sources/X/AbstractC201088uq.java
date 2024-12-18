package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.reels.question.constants.QuestionStickerType;
import com.instagram.reels.question.model.responsetype.QuestionResponseType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.8uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201088uq {
    public static C148286ly parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            C148286ly c148286ly = new C148286ly();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                String str10 = null;
                ArrayList arrayList4 = null;
                String str11 = null;
                String str12 = null;
                ArrayList arrayList5 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c148286ly.A0S = str2;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c148286ly.A0U = str3;
                } else if ("image_url".equals(A0q)) {
                    c148286ly.A0H = AbstractC222616c.A00(c16l);
                } else if ("layers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            A59 parseFromJson = AbstractC226199yc.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c148286ly.A0k = arrayList;
                } else if ("image_width_ratio".equals(A0q)) {
                    c148286ly.A02 = (float) c16l.A0U();
                } else if ("image_width".equals(A0q)) {
                    c148286ly.A01 = (float) c16l.A0U();
                } else if ("image_height".equals(A0q)) {
                    c148286ly.A00 = (float) c16l.A0U();
                } else if ("sticker_duration".equals(A0q)) {
                    c148286ly.A03 = (float) c16l.A0U();
                } else if ("tray_image_width_ratio".equals(A0q)) {
                    c148286ly.A07 = (float) c16l.A0U();
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c148286ly.A0d = str4;
                } else if ("font_size".equals(A0q)) {
                    c148286ly.A08 = c16l.A1D();
                } else if ("text_x".equals(A0q)) {
                    c148286ly.A05 = (float) c16l.A0U();
                } else if ("text_y".equals(A0q)) {
                    c148286ly.A06 = (float) c16l.A0U();
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    c148286ly.A0h = str5;
                } else if ("text_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c148286ly.A0f = str6;
                } else if ("text_background_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str7 = c16l.A1P();
                    }
                    c148286ly.A0e = str7;
                } else if ("text_background_alpha".equals(A0q)) {
                    c148286ly.A04 = (float) c16l.A0U();
                } else if ("location".equals(A0q)) {
                    c148286ly.A0K = AbstractC84373pU.parseFromJson(c16l);
                } else if ("hashtag".equals(A0q)) {
                    c148286ly.A0J = AbstractC109614wn.parseFromJson(c16l);
                } else if ("attribution".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str8 = c16l.A1P();
                    }
                    c148286ly.A0N = str8;
                } else if ("question".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str9 = c16l.A1P();
                    }
                    c148286ly.A0Y = str9;
                } else if ("question_types".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P4 = null;
                            } else {
                                A1P4 = c16l.A1P();
                            }
                            QuestionStickerType questionStickerType = (QuestionStickerType) QuestionStickerType.A01.get(A1P4);
                            if (questionStickerType == null) {
                                questionStickerType = QuestionStickerType.A09;
                            }
                            arrayList6.add(questionStickerType);
                        }
                        arrayList2 = arrayList6;
                    }
                    c148286ly.A0n = arrayList2;
                } else if ("response_types".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        ArrayList arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P3 = null;
                            } else {
                                A1P3 = c16l.A1P();
                            }
                            arrayList7.add(AbstractC201648vt.A00(A1P3));
                        }
                        arrayList3 = arrayList7;
                    }
                    c148286ly.A0m = arrayList3;
                } else if ("emoji".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str10 = c16l.A1P();
                    }
                    c148286ly.A0P = str10;
                } else if ("has_countdowns".equals(A0q)) {
                    c148286ly.A0L = Boolean.valueOf(c16l.A0d());
                } else if ("num_active_collabs".equals(A0q)) {
                    c148286ly.A0A = c16l.A1D();
                } else if ("local_bitmap_image_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList4.add(A1P2);
                            }
                        }
                    }
                    c148286ly.A0l = arrayList4;
                } else if ("high_resolution_version".equals(A0q)) {
                    c148286ly.A0I = parseFromJson(c16l);
                } else if ("prompt".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str11 = c16l.A1P();
                    }
                    c148286ly.A0X = str11;
                } else if ("hint".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str12 = c16l.A1P();
                    }
                    c148286ly.A0R = str12;
                } else if ("keywords".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList5.add(A1P);
                            }
                        }
                    }
                    c148286ly.A0j = arrayList5;
                } else if ("sticker_template".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str13 = c16l.A1P();
                    }
                    c148286ly.A0a = str13;
                } else if ("expression_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str14 = c16l.A1P();
                    }
                    c148286ly.A0Q = str14;
                } else if ("sticker_template_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str15 = c16l.A1P();
                    }
                    c148286ly.A0b = str15;
                } else if ("profile_pic_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str16 = c16l.A1P();
                    }
                    c148286ly.A0W = str16;
                } else if ("media_insights_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str17 = c16l.A1P();
                    }
                    c148286ly.A0T = str17;
                } else if ("num_supporters".equals(A0q)) {
                    c148286ly.A0B = c16l.A1D();
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str18 = c16l.A1P();
                    }
                    c148286ly.A0g = str18;
                } else if ("creation_date".equals(A0q)) {
                    c148286ly.A0F = c16l.A0y();
                } else if ("surface".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str19 = c16l.A1P();
                    }
                    c148286ly.A0c = str19;
                } else if ("accessibility_label".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str20 = c16l.A1P();
                    }
                    c148286ly.A0M = str20;
                } else if ("fps".equals(A0q)) {
                    c148286ly.A09 = c16l.A1D();
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str21 = c16l.A1P();
                    }
                    c148286ly.A0i = str21;
                } else if ("owner_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str22 = c16l.A1P();
                    }
                    c148286ly.A0V = str22;
                } else if ("category_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c148286ly.A0O = str;
                } else if ("number_of_avatars".equals(A0q)) {
                    c148286ly.A0C = c16l.A1D();
                }
                c16l.A0z();
            }
            if (c148286ly.A0f.codePointAt(0) != 35) {
                c148286ly.A0f = AnonymousClass001.A0R("#", c148286ly.A0f);
            }
            if (c148286ly.A0e.codePointAt(0) != 35) {
                c148286ly.A0e = AnonymousClass001.A0R("#", c148286ly.A0e);
                return c148286ly;
            }
            return c148286ly;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C148286ly c148286ly) {
        anonymousClass182.A0d();
        String str = c148286ly.A0S;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        }
        String str2 = c148286ly.A0U;
        if (str2 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        }
        if (c148286ly.A0H != null) {
            anonymousClass182.A0r("image_url");
            AbstractC222616c.A01(anonymousClass182, c148286ly.A0H);
        }
        if (c148286ly.A0k != null) {
            C16V.A03(anonymousClass182, "layers");
            for (A59 a59 : c148286ly.A0k) {
                if (a59 != null) {
                    anonymousClass182.A0d();
                    String str3 = a59.A00;
                    if (str3 != null) {
                        anonymousClass182.A0S("image_url", str3);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0P("image_width_ratio", c148286ly.A02);
        anonymousClass182.A0P("image_width", c148286ly.A01);
        anonymousClass182.A0P("image_height", c148286ly.A00);
        anonymousClass182.A0P("sticker_duration", c148286ly.A03);
        anonymousClass182.A0P("tray_image_width_ratio", c148286ly.A07);
        String str4 = c148286ly.A0d;
        if (str4 != null) {
            anonymousClass182.A0S("text", str4);
        }
        anonymousClass182.A0Q("font_size", c148286ly.A08);
        anonymousClass182.A0P("text_x", c148286ly.A05);
        anonymousClass182.A0P("text_y", c148286ly.A06);
        String str5 = c148286ly.A0h;
        if (str5 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5);
        }
        String str6 = c148286ly.A0f;
        if (str6 != null) {
            anonymousClass182.A0S("text_color", str6);
        }
        String str7 = c148286ly.A0e;
        if (str7 != null) {
            anonymousClass182.A0S("text_background_color", str7);
        }
        anonymousClass182.A0P("text_background_alpha", c148286ly.A04);
        if (c148286ly.A0K != null) {
            anonymousClass182.A0r("location");
            AbstractC84373pU.A00(anonymousClass182, c148286ly.A0K);
        }
        if (c148286ly.A0J != null) {
            anonymousClass182.A0r("hashtag");
            AbstractC109614wn.A00(anonymousClass182, c148286ly.A0J);
        }
        String str8 = c148286ly.A0N;
        if (str8 != null) {
            anonymousClass182.A0S("attribution", str8);
        }
        String str9 = c148286ly.A0Y;
        if (str9 != null) {
            anonymousClass182.A0S("question", str9);
        }
        if (c148286ly.A0n != null) {
            C16V.A03(anonymousClass182, "question_types");
            for (QuestionStickerType questionStickerType : c148286ly.A0n) {
                if (questionStickerType != null) {
                    anonymousClass182.A0u(questionStickerType.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c148286ly.A0m != null) {
            C16V.A03(anonymousClass182, "response_types");
            for (QuestionResponseType questionResponseType : c148286ly.A0m) {
                if (questionResponseType != null) {
                    anonymousClass182.A0u(questionResponseType.A00);
                }
            }
            anonymousClass182.A0Z();
        }
        String str10 = c148286ly.A0P;
        if (str10 != null) {
            anonymousClass182.A0S("emoji", str10);
        }
        Boolean bool = c148286ly.A0L;
        if (bool != null) {
            anonymousClass182.A0T("has_countdowns", bool.booleanValue());
        }
        anonymousClass182.A0Q("num_active_collabs", c148286ly.A0A);
        if (c148286ly.A0l != null) {
            C16V.A03(anonymousClass182, "local_bitmap_image_url");
            for (String str11 : c148286ly.A0l) {
                if (str11 != null) {
                    anonymousClass182.A0u(str11);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c148286ly.A0I != null) {
            anonymousClass182.A0r("high_resolution_version");
            A00(anonymousClass182, c148286ly.A0I);
        }
        String str12 = c148286ly.A0X;
        if (str12 != null) {
            anonymousClass182.A0S("prompt", str12);
        }
        String str13 = c148286ly.A0R;
        if (str13 != null) {
            anonymousClass182.A0S("hint", str13);
        }
        if (c148286ly.A0j != null) {
            C16V.A03(anonymousClass182, "keywords");
            for (String str14 : c148286ly.A0j) {
                if (str14 != null) {
                    anonymousClass182.A0u(str14);
                }
            }
            anonymousClass182.A0Z();
        }
        String str15 = c148286ly.A0a;
        if (str15 != null) {
            anonymousClass182.A0S("sticker_template", str15);
        }
        String str16 = c148286ly.A0Q;
        if (str16 != null) {
            anonymousClass182.A0S("expression_id", str16);
        }
        String str17 = c148286ly.A0b;
        if (str17 != null) {
            anonymousClass182.A0S("sticker_template_name", str17);
        }
        String str18 = c148286ly.A0W;
        if (str18 != null) {
            anonymousClass182.A0S("profile_pic_url", str18);
        }
        String str19 = c148286ly.A0T;
        if (str19 != null) {
            anonymousClass182.A0S("media_insights_id", str19);
        }
        anonymousClass182.A0Q("num_supporters", c148286ly.A0B);
        String str20 = c148286ly.A0g;
        if (str20 != null) {
            anonymousClass182.A0S(DialogModule.KEY_TITLE, str20);
        }
        anonymousClass182.A0R("creation_date", c148286ly.A0F);
        String str21 = c148286ly.A0c;
        if (str21 != null) {
            anonymousClass182.A0S("surface", str21);
        }
        String str22 = c148286ly.A0M;
        if (str22 != null) {
            anonymousClass182.A0S("accessibility_label", str22);
        }
        anonymousClass182.A0Q("fps", c148286ly.A09);
        String str23 = c148286ly.A0i;
        if (str23 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str23);
        }
        String str24 = c148286ly.A0V;
        if (str24 != null) {
            anonymousClass182.A0S("owner_id", str24);
        }
        String str25 = c148286ly.A0O;
        if (str25 != null) {
            anonymousClass182.A0S("category_id", str25);
        }
        anonymousClass182.A0Q("number_of_avatars", c148286ly.A0C);
        anonymousClass182.A0a();
    }
}
