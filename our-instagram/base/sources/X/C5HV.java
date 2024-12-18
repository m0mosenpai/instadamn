package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5HV, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5HV {
    public static C5HW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5HW c5hw = new C5HW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("pk".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5hw.A09 = str;
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_TYPE.equals(A0q)) {
                    c5hw.A05 = (C5Hd) AbstractC005201r.A00(C5Hd.A01, c16l.A0i());
                } else if ("story_type".equals(A0q)) {
                    c5hw.A00 = c16l.A1D();
                } else if ("notif_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5hw.A0C = str;
                } else if ("is_pinned_row".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5hw.A0A = str;
                } else if ("args".equals(A0q)) {
                    c5hw.A04 = AbstractC114905He.parseFromJson(c16l);
                } else if ("survey".equals(A0q)) {
                    c5hw.A01 = F12.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c5hw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C5HW c5hw) {
        StringWriter stringWriter = new StringWriter();
        C222015v c222015v = AbstractC221915u.A00;
        C17z A0A = c222015v.A0A(stringWriter);
        A0A.A0d();
        String str = c5hw.A09;
        if (str != null) {
            A0A.A0S("pk", str);
        }
        C5Hd c5Hd = c5hw.A05;
        if (c5Hd != null) {
            C5Hd[] c5HdArr = C5Hd.A02;
            A0A.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c5Hd.A00);
        }
        A0A.A0Q("story_type", c5hw.A00);
        String str2 = c5hw.A0C;
        if (str2 != null) {
            A0A.A0S("notif_name", str2);
        }
        String str3 = c5hw.A0A;
        if (str3 != null) {
            A0A.A0S("is_pinned_row", str3);
        }
        if (c5hw.A04 != null) {
            A0A.A0r("args");
            C5HX c5hx = c5hw.A04;
            A0A.A0d();
            String str4 = c5hx.A0i;
            if (str4 != null) {
                A0A.A0S("reel_pk", str4);
            }
            String str5 = c5hx.A0W;
            if (str5 != null) {
                A0A.A0S("annotation_title", str5);
            }
            String str6 = c5hx.A0r;
            if (str6 != null) {
                A0A.A0S(DialogModule.KEY_TITLE, str6);
            }
            String str7 = c5hx.A0o;
            if (str7 != null) {
                A0A.A0S("text", str7);
            }
            String str8 = c5hx.A0j;
            if (str8 != null) {
                A0A.A0S("rich_text", str8);
            }
            String str9 = c5hx.A0n;
            if (str9 != null) {
                A0A.A0S("sub_text", str9);
            }
            String str10 = c5hx.A0U;
            if (str10 != null) {
                A0A.A0S("action_url", str10);
            }
            Boolean bool = c5hx.A0M;
            if (bool != null) {
                A0A.A0T("icon_should_apply_filter", bool.booleanValue());
            }
            ImageUrl imageUrl = c5hx.A0F;
            if (imageUrl != null) {
                A0A.A0r("second_icon_url");
                AbstractC222616c.A01(A0A, imageUrl);
            }
            Boolean bool2 = c5hx.A0P;
            if (bool2 != null) {
                A0A.A0T("second_icon_should_apply_filter", bool2.booleanValue());
            }
            Long l = c5hx.A0Q;
            if (l != null) {
                A0A.A0R("af_candidate_id", l.longValue());
            }
            String str11 = c5hx.A0d;
            if (str11 != null) {
                A0A.A0S("content_version_id", str11);
            }
            String str12 = c5hx.A0V;
            if (str12 != null) {
                A0A.A0S("aggregation_type", str12);
            }
            String str13 = c5hx.A0f;
            if (str13 != null) {
                A0A.A0S("profile_id", str13);
            }
            String str14 = c5hx.A0l;
            if (str14 != null) {
                A0A.A0S("second_profile_id", str14);
            }
            ImageUrl imageUrl2 = c5hx.A0E;
            if (imageUrl2 != null) {
                A0A.A0r("profile_image");
                AbstractC222616c.A01(A0A, imageUrl2);
            }
            String str15 = c5hx.A0g;
            if (str15 != null) {
                A0A.A0S("profile_image_destination", str15);
            }
            String str16 = c5hx.A0h;
            if (str16 != null) {
                A0A.A0S("profile_name", str16);
            }
            ImageUrl imageUrl3 = c5hx.A0G;
            if (imageUrl3 != null) {
                A0A.A0r("second_profile_image");
                AbstractC222616c.A01(A0A, imageUrl3);
            }
            List<Number> list = c5hx.A0y;
            if (list != null) {
                C16V.A03(A0A, "mentioned_users");
                for (Number number : list) {
                    if (number != null) {
                        A0A.A0i(number.longValue());
                    }
                }
                A0A.A0Z();
            }
            String str17 = c5hx.A0m;
            if (str17 != null) {
                A0A.A0S("profile_context", str17);
            }
            List<C206409Bx> list2 = c5hx.A0x;
            if (list2 != null) {
                C16V.A03(A0A, "media");
                for (C206409Bx c206409Bx : list2) {
                    if (c206409Bx != null) {
                        A0A.A0d();
                        String str18 = c206409Bx.A01;
                        if (str18 != null) {
                            A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str18);
                        }
                        ImageUrl imageUrl4 = (ImageUrl) c206409Bx.A00;
                        if (imageUrl4 != null) {
                            A0A.A0r("image");
                            AbstractC222616c.A01(A0A, imageUrl4);
                        }
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            List<C206409Bx> list3 = c5hx.A0u;
            if (list3 != null) {
                C16V.A03(A0A, "images");
                for (C206409Bx c206409Bx2 : list3) {
                    if (c206409Bx2 != null) {
                        A0A.A0d();
                        String str19 = c206409Bx2.A01;
                        if (str19 != null) {
                            A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str19);
                        }
                        ImageUrl imageUrl5 = (ImageUrl) c206409Bx2.A00;
                        if (imageUrl5 != null) {
                            A0A.A0r("image");
                            AbstractC222616c.A01(A0A, imageUrl5);
                        }
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            String str20 = c5hx.A0q;
            if (str20 != null) {
                A0A.A0S("timestamp", str20);
            }
            Long l2 = c5hx.A0T;
            if (l2 != null) {
                A0A.A0R("latest_reel_media", l2.longValue());
            }
            List<String> list4 = c5hx.A10;
            if (list4 != null) {
                C16V.A03(A0A, "story_reel_media_ids");
                for (String str21 : list4) {
                    if (str21 != null) {
                        A0A.A0u(str21);
                    }
                }
                A0A.A0Z();
            }
            C206289Bl c206289Bl = c5hx.A08;
            if (c206289Bl != null) {
                A0A.A0r("inline_follow");
                A0A.A0d();
                User user = (User) c206289Bl.A02;
                if (user != null) {
                    A0A.A0r("user_info");
                    Parcelable.Creator creator = User.CREATOR;
                    AbstractC38851rI.A08(A0A, user);
                }
                Boolean bool3 = (Boolean) c206289Bl.A03;
                if (bool3 != null) {
                    A0A.A0T("following", bool3.booleanValue());
                }
                Boolean bool4 = (Boolean) c206289Bl.A06;
                if (bool4 != null) {
                    A0A.A0T("outgoing_request", bool4.booleanValue());
                }
                Boolean bool5 = (Boolean) c206289Bl.A05;
                if (bool5 != null) {
                    A0A.A0T("incoming_request", bool5.booleanValue());
                }
                Boolean bool6 = (Boolean) c206289Bl.A01;
                if (bool6 != null) {
                    A0A.A0T("follow_back_enabled", bool6.booleanValue());
                }
                C51755Mte c51755Mte = (C51755Mte) c206289Bl.A04;
                if (c51755Mte != null) {
                    A0A.A0r("friending_config");
                    A0A.A0d();
                    C51755Mte c51755Mte2 = (C51755Mte) c51755Mte.A00;
                    if (c51755Mte2 != null) {
                        A0A.A0r("contextual_recommendation");
                        A0A.A0d();
                        Boolean bool7 = (Boolean) c51755Mte2.A00;
                        if (bool7 != null) {
                            A0A.A0T("enabled", bool7.booleanValue());
                        }
                        A0A.A0a();
                    }
                    A0A.A0a();
                }
                A0A.A0a();
            }
            List<C26000Beo> list5 = c5hx.A0w;
            if (list5 != null) {
                C16V.A03(A0A, "links");
                for (C26000Beo c26000Beo : list5) {
                    if (c26000Beo != null) {
                        A0A.A0d();
                        String str22 = c26000Beo.A03;
                        if (str22 != null) {
                            A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str22);
                        }
                        String str23 = c26000Beo.A02;
                        if (str23 != null) {
                            A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str23);
                        }
                        A0A.A0Q("start", c26000Beo.A01);
                        A0A.A0Q("end", c26000Beo.A00);
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            String str24 = c5hx.A0p;
            if (str24 != null) {
                A0A.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str24);
            }
            String str25 = c5hx.A0k;
            if (str25 != null) {
                A0A.A0S("destination", str25);
            }
            C51755Mte c51755Mte3 = c5hx.A0A;
            if (c51755Mte3 != null) {
                A0A.A0r("friendship_status");
                A0A.A0d();
                Boolean bool8 = (Boolean) c51755Mte3.A00;
                if (bool8 != null) {
                    A0A.A0T("is_restricted", bool8.booleanValue());
                }
                A0A.A0a();
            }
            String str26 = c5hx.A0e;
            if (str26 != null) {
                A0A.A0S("media_destination", str26);
            }
            C5JK c5jk = c5hx.A0H;
            if (c5jk != null) {
                A0A.A0S("media_clips_creation_type", c5jk.A00);
            }
            String str27 = c5hx.A0b;
            if (str27 != null) {
                A0A.A0S("comment_id", str27);
            }
            Boolean bool9 = c5hx.A0J;
            if (bool9 != null) {
                A0A.A0T("comments_disabled", bool9.booleanValue());
            }
            List<String> list6 = c5hx.A0t;
            if (list6 != null) {
                C16V.A03(A0A, "actions");
                for (String str28 : list6) {
                    if (str28 != null) {
                        A0A.A0u(str28);
                    }
                }
                A0A.A0Z();
            }
            List<C9CK> list7 = c5hx.A0v;
            if (list7 != null) {
                C16V.A03(A0A, "inline_controls");
                for (C9CK c9ck : list7) {
                    if (c9ck != null) {
                        A0A.A0d();
                        String str29 = c9ck.A02;
                        if (str29 != null) {
                            A0A.A0S("action_type", str29);
                        }
                        String str30 = c9ck.A01;
                        if (str30 != null) {
                            A0A.A0S("action_text", str30);
                        }
                        String str31 = c9ck.A03;
                        if (str31 != null) {
                            A0A.A0S("confirmation_text", str31);
                        }
                        if (c9ck.A00 != null) {
                            A0A.A0r("controls");
                            A0A.A0d();
                            for (Map.Entry entry : ((AbstractMap) c9ck.A00).entrySet()) {
                                if (!C16V.A04(A0A, entry)) {
                                    A0A.A0u((String) entry.getValue());
                                }
                            }
                            A0A.A0a();
                        }
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            String str32 = c5hx.A0s;
            if (str32 != null) {
                A0A.A0S("tuuid", str32);
            }
            String str33 = c5hx.A0a;
            if (str33 != null) {
                A0A.A0S("canvas_id", str33);
            }
            Boolean bool10 = c5hx.A0O;
            if (bool10 != null) {
                A0A.A0T("is_story", bool10.booleanValue());
            }
            List<C32071E6x> list8 = c5hx.A0z;
            if (list8 != null) {
                C16V.A03(A0A, "poll_options");
                for (C32071E6x c32071E6x : list8) {
                    if (c32071E6x != null) {
                        A0A.A0d();
                        String str34 = c32071E6x.A01;
                        if (str34 != null) {
                            A0A.A0S("option", str34);
                        }
                        A0A.A0Q("count", c32071E6x.A00);
                        A0A.A0a();
                    }
                }
                A0A.A0Z();
            }
            MUD mud = c5hx.A0D;
            if (mud != null) {
                A0A.A0r("action_button");
                A0A.A0d();
                String str35 = mud.A02;
                if (str35 != null) {
                    A0A.A0S("text", str35);
                }
                String str36 = mud.A01;
                if (str36 != null) {
                    A0A.A0S("dest", str36);
                }
                A0A.A0a();
            }
            String str37 = c5hx.A0c;
            if (str37 != null) {
                A0A.A0S("comment_text", str37);
            }
            Boolean bool11 = c5hx.A0N;
            if (bool11 != null) {
                A0A.A0T("is_comment_eligible_for_vcr", bool11.booleanValue());
            }
            List<User> list9 = c5hx.A11;
            if (list9 != null) {
                C16V.A03(A0A, "users");
                for (User user2 : list9) {
                    if (user2 != null) {
                        Parcelable.Creator creator2 = User.CREATOR;
                        AbstractC38851rI.A08(A0A, user2);
                    }
                }
                A0A.A0Z();
            }
            Boolean bool12 = c5hx.A0K;
            if (bool12 != null) {
                A0A.A0T("display_ufi", bool12.booleanValue());
            }
            Long l3 = c5hx.A0S;
            if (l3 != null) {
                A0A.A0R("aymt_notif_id", l3.longValue());
            }
            Long l4 = c5hx.A0R;
            if (l4 != null) {
                A0A.A0R("aymt_channel_id", l4.longValue());
            }
            String str38 = c5hx.A0X;
            if (str38 != null) {
                A0A.A0S("aymt_notif_type", str38);
            }
            String str39 = c5hx.A0Z;
            if (str39 != null) {
                A0A.A0S("req_fbid", str39);
            }
            String str40 = c5hx.A0Y;
            if (str40 != null) {
                A0A.A0S("preview_url", str40);
            }
            C121695fL c121695fL = c5hx.A0I;
            if (c121695fL != null) {
                A0A.A0r("extra");
                A0A.A0d();
                String str41 = c121695fL.A0A;
                if (str41 != null) {
                    A0A.A0S("lat", str41);
                }
                String str42 = c121695fL.A0C;
                if (str42 != null) {
                    A0A.A0S("long", str42);
                }
                String str43 = c121695fL.A07;
                if (str43 != null) {
                    A0A.A0S(AbstractC31189DnY.A02(), str43);
                }
                String str44 = c121695fL.A08;
                if (str44 != null) {
                    A0A.A0S("device_name", str44);
                }
                String str45 = c121695fL.A0H;
                if (str45 != null) {
                    A0A.A0S("tf_id", str45);
                }
                String str46 = c121695fL.A0B;
                if (str46 != null) {
                    A0A.A0S("loc", str46);
                }
                String str47 = c121695fL.A0E;
                if (str47 != null) {
                    A0A.A0S("time", str47);
                }
                String str48 = c121695fL.A0F;
                if (str48 != null) {
                    A0A.A0S("tip_id", str48);
                }
                String str49 = c121695fL.A04;
                if (str49 != null) {
                    A0A.A0S("channel_id", str49);
                }
                String str50 = c121695fL.A0I;
                if (str50 != null) {
                    A0A.A0S("upcoming_event_id", str50);
                }
                String str51 = c121695fL.A0G;
                if (str51 != null) {
                    A0A.A0S(DialogModule.KEY_TITLE, str51);
                }
                List<ImageUrl> list10 = c121695fL.A0K;
                if (list10 != null) {
                    C16V.A03(A0A, "facepiles");
                    for (ImageUrl imageUrl6 : list10) {
                        if (imageUrl6 != null) {
                            AbstractC222616c.A01(A0A, imageUrl6);
                        }
                    }
                    A0A.A0Z();
                }
                Boolean bool13 = c121695fL.A02;
                if (bool13 != null) {
                    A0A.A0T("is_aggregated", bool13.booleanValue());
                }
                Boolean bool14 = c121695fL.A03;
                if (bool14 != null) {
                    A0A.A0T("disable_truncation", bool14.booleanValue());
                }
                String str52 = c121695fL.A05;
                if (str52 != null) {
                    A0A.A0S("content", str52);
                }
                String str53 = c121695fL.A06;
                if (str53 != null) {
                    A0A.A0S("context", str53);
                }
                String str54 = c121695fL.A09;
                if (str54 != null) {
                    A0A.A0S("icon_name", str54);
                }
                String str55 = c121695fL.A0J;
                if (str55 != null) {
                    A0A.A0S("upcoming_event_reminder_type", str55);
                }
                C38687GzS c38687GzS = c121695fL.A00;
                if (c38687GzS != null) {
                    A0A.A0r("social_context");
                    A0A.A0d();
                    String str56 = c38687GzS.A01;
                    if (str56 != null) {
                        A0A.A0S("caption", str56);
                    }
                    List<User> list11 = (List) c38687GzS.A00;
                    if (list11 != null) {
                        C16V.A03(A0A, "facepile_users");
                        for (User user3 : list11) {
                            if (user3 != null) {
                                Parcelable.Creator creator3 = User.CREATOR;
                                AbstractC38851rI.A08(A0A, user3);
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0a();
                }
                String str57 = c121695fL.A0D;
                if (str57 != null) {
                    A0A.A0S("override_profile_pic_icon_type", str57);
                }
                C38321qM c38321qM = c121695fL.A01;
                if (c38321qM != null) {
                    A0A.A0r("media_dict");
                    C38801rC c38801rC = C38321qM.A0h;
                    C38801rC.A07(A0A, c38321qM);
                }
                A0A.A0a();
            }
            ImageUrl imageUrl7 = c5hx.A01;
            if (imageUrl7 != null) {
                A0A.A0r("icon_url");
                AbstractC222616c.A01(A0A, imageUrl7);
            }
            PrivateReplyStatus privateReplyStatus = c5hx.A00;
            if (privateReplyStatus != null) {
                A0A.A0S("private_reply_status", privateReplyStatus.A00);
            }
            if (c5hx.A02 != null) {
                A0A.A0r("hashtag_follow");
                AbstractC109614wn.A00(A0A, c5hx.A02);
            }
            Integer num = c5hx.A05;
            if (num != null) {
                A0A.A0Q("request_count", num.intValue());
            }
            Boolean bool15 = c5hx.A04;
            if (bool15 != null) {
                A0A.A0T("has_liked_comment", bool15.booleanValue());
            }
            String str58 = c5hx.A06;
            if (str58 != null) {
                A0A.A0S("reply_comment_id", str58);
            }
            Boolean bool16 = c5hx.A03;
            if (bool16 != null) {
                A0A.A0T("clicked", bool16.booleanValue());
            }
            C206259Bi c206259Bi = c5hx.A07;
            if (c206259Bi != null) {
                A0A.A0r("logging_context");
                A0A.A0d();
                Number number2 = (Number) c206259Bi.A02;
                if (number2 != null) {
                    A0A.A0R("content_id", number2.longValue());
                }
                List<Number> list12 = (List) c206259Bi.A04;
                if (list12 != null) {
                    C16V.A03(A0A, "mentioned_user_ids");
                    for (Number number3 : list12) {
                        if (number3 != null) {
                            A0A.A0i(number3.longValue());
                        }
                    }
                    A0A.A0Z();
                }
                List<Number> list13 = (List) c206259Bi.A03;
                if (list13 != null) {
                    C16V.A03(A0A, "mentioned_content_ids");
                    for (Number number4 : list13) {
                        if (number4 != null) {
                            A0A.A0i(number4.longValue());
                        }
                    }
                    A0A.A0Z();
                }
                Number number5 = (Number) c206259Bi.A01;
                if (number5 != null) {
                    A0A.A0R("ad_id", number5.longValue());
                }
                A0A.A0a();
            }
            C31200Dnj c31200Dnj = c5hx.A0B;
            if (c31200Dnj != null) {
                A0A.A0r("highlight_config");
                A0A.A0d();
                String str59 = c31200Dnj.A00;
                if (str59 != null) {
                    A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str59);
                }
                A0A.A0a();
            }
            Boolean bool17 = c5hx.A0L;
            if (bool17 != null) {
                A0A.A0T("eligible_for_text_app_quality_control", bool17.booleanValue());
            }
            C31200Dnj c31200Dnj2 = c5hx.A0C;
            if (c31200Dnj2 != null) {
                A0A.A0r("indicator_config");
                A0A.A0d();
                String str60 = c31200Dnj2.A00;
                if (str60 != null) {
                    A0A.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str60);
                }
                A0A.A0a();
            }
            C9C9 c9c9 = c5hx.A09;
            if (c9c9 != null) {
                A0A.A0r("thumbnail_icon_config");
                A0A.A0d();
                String str61 = c9c9.A01;
                if (str61 != null) {
                    A0A.A0S("tint", str61);
                }
                String str62 = c9c9.A00;
                if (str62 != null) {
                    A0A.A0S(AppStateModule.APP_STATE_BACKGROUND, str62);
                }
                A0A.A0a();
            }
            A0A.A0a();
        }
        if (c5hw.A01 != null) {
            A0A.A0r("survey");
            C35023Fbw c35023Fbw = c5hw.A01;
            StringWriter stringWriter2 = new StringWriter();
            C17z A0A2 = c222015v.A0A(stringWriter2);
            A0A2.A0d();
            A0A2.A0T("is_answered", c35023Fbw.A05);
            String str63 = c35023Fbw.A01;
            if (str63 != null) {
                A0A2.A0S("module_type", str63);
            }
            String str64 = c35023Fbw.A02;
            if (str64 != null) {
                A0A2.A0S("qp_id", str64);
            }
            if (c35023Fbw.A04 != null) {
                C16V.A03(A0A2, "questions");
                for (FRG frg : c35023Fbw.A04) {
                    if (frg != null) {
                        A0A2.A0d();
                        String str65 = frg.A02;
                        if (str65 != null) {
                            A0A2.A0S("module_type", str65);
                        }
                        String str66 = frg.A01;
                        if (str66 != null) {
                            A0A2.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str66);
                        }
                        String str67 = frg.A03;
                        if (str67 != null) {
                            A0A2.A0S(DialogModule.KEY_TITLE, str67);
                        }
                        String str68 = frg.A04;
                        if (str68 != null) {
                            A0A2.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str68);
                        }
                        if (frg.A05 != null) {
                            C16V.A03(A0A2, "answers");
                            for (C34711FQw c34711FQw : frg.A05) {
                                if (c34711FQw != null) {
                                    A0A2.A0d();
                                    String str69 = c34711FQw.A01;
                                    if (str69 != null) {
                                        A0A2.A0S("text", str69);
                                    }
                                    String str70 = c34711FQw.A00;
                                    if (str70 != null) {
                                        A0A2.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str70);
                                    }
                                    A0A2.A0a();
                                }
                            }
                            A0A2.A0Z();
                        }
                        Boolean bool18 = frg.A00;
                        if (bool18 != null) {
                            A0A2.A0T("isHidden", bool18.booleanValue());
                        }
                        A0A2.A0a();
                    }
                }
                A0A2.A0Z();
            }
            String str71 = c35023Fbw.A03;
            if (str71 != null) {
                A0A2.A0S("tessa_survey_config_id", str71);
            }
            String str72 = c35023Fbw.A00;
            if (str72 != null) {
                A0A2.A0S("extra_data_token", str72);
            }
            A0A2.A0a();
            A0A2.close();
            A0A.A0u(stringWriter2.toString());
        }
        A0A.A0a();
        A0A.close();
        return stringWriter.toString();
    }
}
