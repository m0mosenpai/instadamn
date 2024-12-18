package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.RingSpecImpl;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.8up, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC201078up {
    public static C148276lx parseFromJson(C16L c16l) {
        C211699Zd c211699Zd;
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            Long l = null;
            EnumC150226pU enumC150226pU = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            Boolean bool = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            Float f = null;
            Boolean bool2 = null;
            Integer num = null;
            String str6 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            RingSpecImpl ringSpecImpl = null;
            C38561qk c38561qk = null;
            AA7 aa7 = null;
            TrackDataImpl trackDataImpl = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            Boolean bool5 = null;
            ArrayList arrayList8 = null;
            Boolean bool6 = null;
            Boolean bool7 = null;
            StoryPromptTappableData storyPromptTappableData = null;
            ArrayList arrayList9 = null;
            Boolean bool8 = null;
            Boolean bool9 = null;
            Float f2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("duration_ms".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("keywords".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                arrayList2.add(A1P5);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("titles".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                arrayList3.add(A1P4);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("include_in_recent".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("help_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("secondary_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("prompt".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("default_prompt".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("button_texts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                arrayList4.add(A1P3);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("prompts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList5.add(A1P2);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if ("minimum_scale".equals(A0q)) {
                    f = new Float(c16l.A0U());
                } else if ("maximum_scale".equals(A0q)) {
                    f2 = new Float(c16l.A0U());
                } else if ("bounding_box_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("reel_media_sticker_limit".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("render_framework".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("has_attribution".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("partnered_account".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("ring_spec".equals(A0q)) {
                    ringSpecImpl = AbstractC41276IOr.parseFromJson(c16l);
                } else if ("ring_glyph".equals(A0q)) {
                    c38561qk = AbstractC41346IRr.parseFromJson(c16l);
                } else if ("gif_sticker".equals(A0q)) {
                    aa7 = A14.parseFromJson(c16l);
                } else if ("track".equals(A0q)) {
                    trackDataImpl = AbstractC84383pX.parseFromJson(c16l);
                } else if ("suggested_prompts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList6.add(A1P);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("instapal_characters".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C32071E6x parseFromJson = AbstractC226109yT.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList7.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("has_avatar".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("prompt_titles".equals(A0q)) {
                    C16R A11 = c16l.A11();
                    C16R c16r = C16R.A0C;
                    if (A11 == c16r) {
                        arrayList8 = new ArrayList();
                        while (true) {
                            C16R A1J = c16l.A1J();
                            C16R c16r2 = C16R.A08;
                            if (A1J != c16r2) {
                                if (c16l.A11() == c16r) {
                                    ArrayList arrayList10 = new ArrayList();
                                    while (c16l.A1J() != c16r2) {
                                        if (c16l.A11() == C16R.A0J) {
                                            String A1Q = c16l.A1Q();
                                            C14360o3.A07(A1Q);
                                            arrayList10.add(A1Q);
                                        }
                                    }
                                    c211699Zd = new C211699Zd((String) arrayList10.get(0), (String) arrayList10.get(1));
                                } else {
                                    c211699Zd = new C211699Zd("", "");
                                }
                                arrayList8.add(c211699Zd);
                            }
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("is_boost_eligible".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("is_interactive_sticker".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("election_add_yours_data".equals(A0q)) {
                    storyPromptTappableData = AbstractC109294vv.parseFromJson(c16l);
                } else if ("suggested_templates".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList9 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            StoryTemplateDict parseFromJson2 = AbstractC109314vy.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList9.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("is_suggested_sticker".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("should_display_new_badge".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("stickers".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C148286ly parseFromJson3 = AbstractC201088uq.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sticker_type".equals(A0q)) {
                    String A1Q2 = c16l.A1Q();
                    C14360o3.A0B(A1Q2, 0);
                    EnumC150226pU[] values = EnumC150226pU.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC150226pU = values[i];
                            if (!C14360o3.A0K(enumC150226pU.A00, A1Q2)) {
                                i++;
                            }
                        } else {
                            enumC150226pU = null;
                            break;
                        }
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "StaticSticker");
            } else if (arrayList == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("stickers", "StaticSticker");
            } else {
                C148276lx c148276lx = new C148276lx(enumC150226pU, str, arrayList);
                if (l != null) {
                    c148276lx.A0G = l;
                }
                if (arrayList2 != null) {
                    c148276lx.A0P = arrayList2;
                }
                if (arrayList3 != null) {
                    c148276lx.A0U = arrayList3;
                }
                if (bool != null) {
                    c148276lx.A0X = bool.booleanValue();
                }
                if (str2 != null) {
                    c148276lx.A0I = str2;
                }
                if (str3 != null) {
                    c148276lx.A0L = str3;
                }
                if (str4 != null) {
                    c148276lx.A0J = str4;
                }
                if (str5 != null) {
                    c148276lx.A0H = str5;
                }
                if (arrayList4 != null) {
                    c148276lx.A0M = arrayList4;
                }
                if (arrayList5 != null) {
                    c148276lx.A0R = arrayList5;
                }
                if (f != null) {
                    c148276lx.A0D = f;
                }
                if (f2 != null) {
                    c148276lx.A0C = f2;
                }
                if (bool2 != null) {
                    c148276lx.A0B = bool2;
                }
                if (num != null) {
                    c148276lx.A0E = num;
                }
                if (str6 != null) {
                    c148276lx.A0K = str6;
                }
                if (bool3 != null) {
                    c148276lx.A0V = bool3.booleanValue();
                }
                if (bool4 != null) {
                    c148276lx.A0W = bool4.booleanValue();
                }
                if (ringSpecImpl != null) {
                    c148276lx.A00 = ringSpecImpl;
                }
                if (c38561qk != null) {
                    c148276lx.A06 = c38561qk;
                }
                if (aa7 != null) {
                    c148276lx.A05 = aa7;
                }
                if (trackDataImpl != null) {
                    c148276lx.A02 = trackDataImpl;
                }
                if (arrayList6 != null) {
                    c148276lx.A0S = arrayList6;
                }
                if (arrayList7 != null) {
                    c148276lx.A0N = arrayList7;
                }
                if (bool5 != null) {
                    c148276lx.A07 = bool5;
                }
                if (arrayList8 != null) {
                    c148276lx.A0Q = arrayList8;
                }
                if (bool6 != null) {
                    c148276lx.A08 = bool6;
                }
                if (bool7 != null) {
                    c148276lx.A09 = bool7;
                }
                if (storyPromptTappableData != null) {
                    c148276lx.A01 = storyPromptTappableData;
                }
                if (arrayList9 != null) {
                    c148276lx.A0T = arrayList9;
                }
                if (bool8 != null) {
                    c148276lx.A0Y = bool8.booleanValue();
                }
                if (bool9 != null) {
                    c148276lx.A0A = bool9;
                }
                c148276lx.A03();
                return c148276lx;
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C148276lx c148276lx) {
        anonymousClass182.A0d();
        Long l = c148276lx.A0G;
        if (l != null) {
            anonymousClass182.A0R("duration_ms", l.longValue());
        }
        C16V.A03(anonymousClass182, "keywords");
        for (String str : c148276lx.A0P) {
            if (str != null) {
                anonymousClass182.A0u(str);
            }
        }
        anonymousClass182.A0Z();
        if (c148276lx.A0U != null) {
            C16V.A03(anonymousClass182, "titles");
            for (String str2 : c148276lx.A0U) {
                if (str2 != null) {
                    anonymousClass182.A0u(str2);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("include_in_recent", c148276lx.A0X);
        String str3 = c148276lx.A0I;
        if (str3 != null) {
            anonymousClass182.A0S("help_text", str3);
        }
        String str4 = c148276lx.A0L;
        if (str4 != null) {
            anonymousClass182.A0S("secondary_text", str4);
        }
        String str5 = c148276lx.A0J;
        if (str5 != null) {
            anonymousClass182.A0S("prompt", str5);
        }
        String str6 = c148276lx.A0H;
        if (str6 != null) {
            anonymousClass182.A0S("default_prompt", str6);
        }
        if (c148276lx.A0M != null) {
            C16V.A03(anonymousClass182, "button_texts");
            for (String str7 : c148276lx.A0M) {
                if (str7 != null) {
                    anonymousClass182.A0u(str7);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c148276lx.A0R != null) {
            C16V.A03(anonymousClass182, "prompts");
            for (String str8 : c148276lx.A0R) {
                if (str8 != null) {
                    anonymousClass182.A0u(str8);
                }
            }
            anonymousClass182.A0Z();
        }
        Float f = c148276lx.A0D;
        if (f != null) {
            anonymousClass182.A0P("minimum_scale", f.floatValue());
        }
        Float f2 = c148276lx.A0C;
        if (f2 != null) {
            anonymousClass182.A0P("maximum_scale", f2.floatValue());
        }
        Boolean bool = c148276lx.A0B;
        if (bool != null) {
            anonymousClass182.A0T("bounding_box_enabled", bool.booleanValue());
        }
        Integer num = c148276lx.A0E;
        if (num != null) {
            anonymousClass182.A0Q("reel_media_sticker_limit", num.intValue());
        }
        String str9 = c148276lx.A0K;
        if (str9 != null) {
            anonymousClass182.A0S("render_framework", str9);
        }
        anonymousClass182.A0T("has_attribution", c148276lx.A0V);
        anonymousClass182.A0T("partnered_account", c148276lx.A0W);
        if (c148276lx.A00 != null) {
            anonymousClass182.A0r("ring_spec");
            AbstractC41276IOr.A00(anonymousClass182, c148276lx.A00);
        }
        if (c148276lx.A06 != null) {
            anonymousClass182.A0r("ring_glyph");
            AbstractC41346IRr.A00(anonymousClass182, c148276lx.A06, true);
        }
        if (c148276lx.A05 != null) {
            anonymousClass182.A0r("gif_sticker");
            AA7 aa7 = c148276lx.A05;
            anonymousClass182.A0d();
            String str10 = aa7.A05;
            if (str10 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str10);
            }
            if (aa7.A00 != null) {
                anonymousClass182.A0r("images");
                AA8 aa8 = aa7.A00;
                anonymousClass182.A0d();
                if (aa8.A00 != null) {
                    anonymousClass182.A0r(AbstractC111324zv.A00(212));
                    AbstractC47864LCk.A00(anonymousClass182, aa8.A00);
                }
                if (aa8.A06 != null) {
                    anonymousClass182.A0r("fixed_height_still");
                    AbstractC47864LCk.A00(anonymousClass182, aa8.A06);
                }
                if (aa8.A01 != null) {
                    anonymousClass182.A0r("fixed_height_downsampled");
                    AbstractC47864LCk.A00(anonymousClass182, aa8.A01);
                }
                if (aa8.A02 != null) {
                    anonymousClass182.A0r("downsized");
                    AbstractC47864LCk.A00(anonymousClass182, aa8.A02);
                }
                if (aa8.A04 != null) {
                    anonymousClass182.A0r("downsized_medium");
                    AbstractC47864LCk.A00(anonymousClass182, aa8.A04);
                }
                if (aa8.A03 != null) {
                    anonymousClass182.A0r("downsized_large");
                    AbstractC47864LCk.A00(anonymousClass182, aa8.A03);
                }
                if (aa8.A05 != null) {
                    anonymousClass182.A0r("original");
                    AbstractC47864LCk.A00(anonymousClass182, aa8.A05);
                }
                anonymousClass182.A0a();
            }
            if (aa7.A01 != null) {
                anonymousClass182.A0r(MediaStreamTrack.VIDEO_TRACK_KIND);
                A8P a8p = aa7.A01;
                anonymousClass182.A0d();
                String str11 = a8p.A02;
                if (str11 != null) {
                    anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str11);
                }
                Float f3 = a8p.A01;
                if (f3 != null) {
                    anonymousClass182.A0P("duration", f3.floatValue());
                }
                if (a8p.A00 != null) {
                    anonymousClass182.A0r("assets");
                    A91 a91 = a8p.A00;
                    anonymousClass182.A0d();
                    if (a91.A01 != null) {
                        anonymousClass182.A0r("360p");
                        AE0.A00(anonymousClass182, a91.A01);
                    }
                    if (a91.A02 != null) {
                        anonymousClass182.A0r("480p");
                        AE0.A00(anonymousClass182, a91.A02);
                    }
                    if (a91.A03 != null) {
                        anonymousClass182.A0r("720p");
                        AE0.A00(anonymousClass182, a91.A03);
                    }
                    if (a91.A00 != null) {
                        anonymousClass182.A0r("1080p");
                        AE0.A00(anonymousClass182, a91.A00);
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            if (aa7.A02 != null) {
                anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                A7Q a7q = aa7.A02;
                anonymousClass182.A0d();
                anonymousClass182.A0T("is_verified", a7q.A01);
                String str12 = a7q.A00;
                if (str12 != null) {
                    anonymousClass182.A0S(AbstractC69998VzI.A00(10, 8, 11), str12);
                }
                anonymousClass182.A0a();
            }
            Boolean bool2 = aa7.A03;
            if (bool2 != null) {
                anonymousClass182.A0T("is_sticker", bool2.booleanValue());
            }
            String str13 = aa7.A04;
            if (str13 != null) {
                anonymousClass182.A0S("expression_id", str13);
            }
            String str14 = aa7.A06;
            if (str14 != null) {
                anonymousClass182.A0S(DialogModule.KEY_TITLE, str14);
            }
            anonymousClass182.A0a();
        }
        if (c148276lx.A02 != null) {
            anonymousClass182.A0r("track");
            AbstractC84383pX.A00(anonymousClass182, c148276lx.A02);
        }
        if (c148276lx.A0S != null) {
            C16V.A03(anonymousClass182, "suggested_prompts");
            for (String str15 : c148276lx.A0S) {
                if (str15 != null) {
                    anonymousClass182.A0u(str15);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c148276lx.A0N != null) {
            C16V.A03(anonymousClass182, "instapal_characters");
            for (C32071E6x c32071E6x : c148276lx.A0N) {
                if (c32071E6x != null) {
                    anonymousClass182.A0d();
                    String str16 = c32071E6x.A01;
                    if (str16 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(184), str16);
                    }
                    anonymousClass182.A0Q("like_count", c32071E6x.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool3 = c148276lx.A07;
        if (bool3 != null) {
            anonymousClass182.A0T("has_avatar", bool3.booleanValue());
        }
        if (c148276lx.A0Q != null) {
            C16V.A03(anonymousClass182, "prompt_titles");
            Iterator it = c148276lx.A0Q.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        Boolean bool4 = c148276lx.A08;
        if (bool4 != null) {
            anonymousClass182.A0T("is_boost_eligible", bool4.booleanValue());
        }
        Boolean bool5 = c148276lx.A09;
        if (bool5 != null) {
            anonymousClass182.A0T("is_interactive_sticker", bool5.booleanValue());
        }
        if (c148276lx.A01 != null) {
            anonymousClass182.A0r("election_add_yours_data");
            AbstractC109294vv.A00(anonymousClass182, c148276lx.A01, true);
        }
        if (c148276lx.A0T != null) {
            C16V.A03(anonymousClass182, "suggested_templates");
            for (StoryTemplateDict storyTemplateDict : c148276lx.A0T) {
                if (storyTemplateDict != null) {
                    AbstractC109314vy.A00(anonymousClass182, storyTemplateDict);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("is_suggested_sticker", c148276lx.A0Y);
        Boolean bool6 = c148276lx.A0A;
        if (bool6 != null) {
            anonymousClass182.A0T("should_display_new_badge", bool6.booleanValue());
        }
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c148276lx.A0Z);
        C16V.A03(anonymousClass182, "stickers");
        for (C148286ly c148286ly : c148276lx.A0O) {
            if (c148286ly != null) {
                AbstractC201088uq.A00(anonymousClass182, c148286ly);
            }
        }
        anonymousClass182.A0Z();
        EnumC150226pU enumC150226pU = c148276lx.A03;
        if (enumC150226pU != null) {
            anonymousClass182.A0S("sticker_type", enumC150226pU.toString());
        }
        anonymousClass182.A0a();
    }
}
