package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.WFj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70181WFj {
    public static void A03(AnonymousClass182 anonymousClass182, VEH veh) {
        C14360o3.A0B(veh, 0);
        anonymousClass182.A0S("sticker_type", veh.A00);
    }

    public static final void A04(AnonymousClass182 anonymousClass182, XBS xbs) {
        String str;
        String str2;
        int i;
        String str3;
        boolean booleanValue;
        String str4;
        C14360o3.A0B(xbs, 1);
        anonymousClass182.A0d();
        anonymousClass182.A0r(xbs.getTypeName());
        if (xbs instanceof US6) {
            US6 us6 = (US6) xbs;
            C14360o3.A0B(us6, 1);
            anonymousClass182.A0d();
            anonymousClass182.A0S("uuid", us6.A0O);
            A03(anonymousClass182, us6.A09);
            A02(anonymousClass182, us6.A08);
            A01(anonymousClass182, us6.A07);
            A00(us6.A06, anonymousClass182);
            anonymousClass182.A0Q("selected_variant_index", us6.A04);
            anonymousClass182.A0S("media_id", us6.A0I);
            anonymousClass182.A0S("carousel_child_media_id", us6.A0B);
            anonymousClass182.A0S("media_owner_id", us6.A0J);
            anonymousClass182.A0S(AbstractC65709Tsi.A01(), us6.A0N);
            String str5 = us6.A0M;
            if (str5 != null) {
                anonymousClass182.A0S("user_attribution", str5);
            }
            anonymousClass182.A0S("profile_pic_url", us6.A0K);
            anonymousClass182.A0T("has_product_tags", us6.A0R);
            anonymousClass182.A0T("carousel_child_has_product_tags", us6.A0P);
            anonymousClass182.A0T("has_collaborators", us6.A0Q);
            anonymousClass182.A0T("is_media_author_seller", us6.A0U);
            AbstractC37301Gc2.A1F(anonymousClass182, us6.A0L);
            String str6 = us6.A0C;
            if (str6 != null) {
                anonymousClass182.A0S("duration", str6);
            }
            Long l = us6.A0A;
            if (l != null) {
                anonymousClass182.A0R("duration_ms", l.longValue());
            }
            String str7 = us6.A0E;
            if (str7 != null) {
                anonymousClass182.A0S("event_id", str7);
            }
            String str8 = us6.A0G;
            if (str8 != null) {
                anonymousClass182.A0S("event_title", str8);
            }
            String str9 = us6.A0F;
            if (str9 != null) {
                anonymousClass182.A0S("event_time", str9);
            }
            String str10 = us6.A0D;
            if (str10 != null) {
                anonymousClass182.A0S("event_action_button_text", str10);
            }
            anonymousClass182.A0T("is_autoplay", us6.A0S);
            anonymousClass182.A0T("is_carousel", us6.A0T);
            String str11 = us6.A0H;
            if (str11 != null) {
                anonymousClass182.A0S("fundraiser_id", str11);
            }
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, us6.A05);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, us6.A00);
            anonymousClass182.A0Q("padding_x", us6.A01);
            anonymousClass182.A0Q("padding_y", us6.A02);
            i = us6.A03;
            str3 = "repost_pill_width";
        } else if (xbs instanceof C66655URt) {
            C66655URt c66655URt = (C66655URt) xbs;
            C14360o3.A0B(c66655URt, 1);
            anonymousClass182.A0d();
            anonymousClass182.A0S("uuid", c66655URt.A0A);
            A03(anonymousClass182, c66655URt.A08);
            A02(anonymousClass182, c66655URt.A07);
            A01(anonymousClass182, c66655URt.A06);
            A00(c66655URt.A05, anonymousClass182);
            anonymousClass182.A0Q("selected_variant_index", c66655URt.A04);
            anonymousClass182.A0S("image_file_path", c66655URt.A09);
            anonymousClass182.A0Q("rect_left", c66655URt.A01);
            anonymousClass182.A0Q("rect_top", c66655URt.A03);
            anonymousClass182.A0Q("rect_right", c66655URt.A02);
            i = c66655URt.A00;
            str3 = "rect_bottom";
        } else {
            if (xbs instanceof US2) {
                US2 us2 = (US2) xbs;
                C14360o3.A0B(us2, 1);
                anonymousClass182.A0d();
                anonymousClass182.A0S("uuid", us2.A0I);
                A03(anonymousClass182, us2.A05);
                A02(anonymousClass182, us2.A03);
                A01(anonymousClass182, us2.A02);
                A00(us2.A01, anonymousClass182);
                anonymousClass182.A0Q("selected_variant_index", us2.A00);
                UPU upu = us2.A04;
                if (upu != null) {
                    anonymousClass182.A0r("attribution");
                    VXD.A00(anonymousClass182, upu);
                }
                String str12 = us2.A0A;
                if (str12 != null) {
                    anonymousClass182.A0S("background_image_url", str12);
                }
                String str13 = us2.A0B;
                if (str13 != null) {
                    anonymousClass182.A0S("countdown_id", str13);
                }
                String str14 = us2.A0C;
                if (str14 != null) {
                    anonymousClass182.A0S("digit_card_color", str14);
                }
                String str15 = us2.A0D;
                if (str15 != null) {
                    anonymousClass182.A0S("digit_color", str15);
                }
                String str16 = us2.A0E;
                if (str16 != null) {
                    anonymousClass182.A0S("end_background_color", str16);
                }
                Long l2 = us2.A09;
                if (l2 != null) {
                    anonymousClass182.A0R("end_ts", l2.longValue());
                }
                Boolean bool = us2.A06;
                if (bool != null) {
                    anonymousClass182.A0T("following_enabled", bool.booleanValue());
                }
                Boolean bool2 = us2.A07;
                if (bool2 != null) {
                    anonymousClass182.A0T("is_owner", bool2.booleanValue());
                }
                String str17 = us2.A0F;
                if (str17 != null) {
                    anonymousClass182.A0S("start_background_color", str17);
                }
                AbstractC37301Gc2.A1E(anonymousClass182, us2.A0G);
                String str18 = us2.A0H;
                if (str18 != null) {
                    anonymousClass182.A0S("text_color", str18);
                }
                Boolean bool3 = us2.A08;
                if (bool3 != null) {
                    booleanValue = bool3.booleanValue();
                    str4 = "viewer_is_following";
                    anonymousClass182.A0T(str4, booleanValue);
                }
                anonymousClass182.A0a();
            } else {
                if (xbs instanceof C66647URl) {
                    C66647URl c66647URl = (C66647URl) xbs;
                    C14360o3.A0B(c66647URl, 1);
                    anonymousClass182.A0d();
                    anonymousClass182.A0S("uuid", c66647URl.A06);
                    A03(anonymousClass182, c66647URl.A05);
                    A02(anonymousClass182, c66647URl.A04);
                    A01(anonymousClass182, c66647URl.A03);
                    A00(c66647URl.A02, anonymousClass182);
                    anonymousClass182.A0Q("selected_variant_index", c66647URl.A00);
                    anonymousClass182.A0R("timestamp_ms", c66647URl.A01);
                } else if (xbs instanceof C66649URn) {
                    C66649URn c66649URn = (C66649URn) xbs;
                    C14360o3.A0B(c66649URn, 1);
                    anonymousClass182.A0d();
                    anonymousClass182.A0S("uuid", c66649URn.A08);
                    A03(anonymousClass182, c66649URn.A07);
                    A02(anonymousClass182, c66649URn.A05);
                    A01(anonymousClass182, c66649URn.A04);
                    A00(c66649URn.A03, anonymousClass182);
                    anonymousClass182.A0Q("selected_variant_index", c66649URn.A02);
                    anonymousClass182.A0r("medium");
                    UQM uqm = c66649URn.A06;
                    C14360o3.A0B(uqm, 1);
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, uqm.A05);
                    anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, uqm.A08);
                    anonymousClass182.A0S("path", uqm.A0X);
                    anonymousClass182.A0Q("bucket_id", uqm.A02);
                    String str19 = uqm.A0O;
                    if (str19 != null) {
                        anonymousClass182.A0S("bucket_name", str19);
                    }
                    anonymousClass182.A0Q("rotation", uqm.A07);
                    anonymousClass182.A0Q("duration_in_ms", uqm.A03);
                    anonymousClass182.A0R("date_taken", uqm.A0D);
                    anonymousClass182.A0R("date_added", uqm.A0C);
                    anonymousClass182.A0T("is_favorite", uqm.A0g);
                    String str20 = uqm.A0c;
                    if (str20 != null) {
                        anonymousClass182.A0S("uri", str20);
                    }
                    String str21 = uqm.A0U;
                    if (str21 != null) {
                        anonymousClass182.A0S("friendly_duration", str21);
                    }
                    String str22 = uqm.A0a;
                    if (str22 != null) {
                        anonymousClass182.A0S("thumbnail_path", str22);
                    }
                    anonymousClass182.A0Q("max_sample_size", uqm.A06);
                    String str23 = uqm.A0J;
                    if (str23 != null) {
                        anonymousClass182.A0S("app_attribution_namespace", str23);
                    }
                    String str24 = uqm.A0K;
                    if (str24 != null) {
                        anonymousClass182.A0S("app_attribution_raw_namespace", str24);
                    }
                    String str25 = uqm.A0d;
                    if (str25 != null) {
                        anonymousClass182.A0S("wearables_media_id", str25);
                    }
                    String str26 = uqm.A0M;
                    if (str26 != null) {
                        anonymousClass182.A0S(MSV.A00(180), str26);
                    }
                    C51737MtK c51737MtK = uqm.A0E;
                    if (c51737MtK != null) {
                        anonymousClass182.A0r(AbstractC111324zv.A00(176));
                        anonymousClass182.A0d();
                        anonymousClass182.A0Q("top_color", c51737MtK.A01);
                        anonymousClass182.A0Q("bottom_color", c51737MtK.A00);
                        anonymousClass182.A0a();
                    }
                    String str27 = uqm.A0N;
                    if (str27 != null) {
                        anonymousClass182.A0S("attribution_content_url", str27);
                    }
                    anonymousClass182.A0T("should_fetch_audio_preview", uqm.A0i);
                    anonymousClass182.A0T("has_lat_lng", uqm.A0f);
                    anonymousClass182.A0O(Location.LATITUDE, uqm.A00);
                    anonymousClass182.A0O("longitude", uqm.A01);
                    anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, uqm.A0B);
                    anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, uqm.A04);
                    String str28 = uqm.A0V;
                    if (str28 != null) {
                        anonymousClass182.A0S("locality", str28);
                    }
                    String str29 = uqm.A0T;
                    if (str29 != null) {
                        anonymousClass182.A0S("feature_name", str29);
                    }
                    String str30 = uqm.A0Z;
                    if (str30 != null) {
                        anonymousClass182.A0S("sub_admin_area", str30);
                    }
                    String str31 = uqm.A0G;
                    if (str31 != null) {
                        anonymousClass182.A0S("admin_area", str31);
                    }
                    String str32 = uqm.A0R;
                    if (str32 != null) {
                        anonymousClass182.A0S("country_name", str32);
                    }
                    List list = uqm.A0e;
                    if (list != null) {
                        Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "faces", list);
                        while (A0q.hasNext()) {
                            C66625UPn c66625UPn = (C66625UPn) A0q.next();
                            C14360o3.A0B(c66625UPn, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0P("x", c66625UPn.A01);
                            anonymousClass182.A0P("y", c66625UPn.A02);
                            anonymousClass182.A0P("confidence", c66625UPn.A00);
                            anonymousClass182.A0a();
                        }
                        anonymousClass182.A0Z();
                    }
                    String str33 = uqm.A0Y;
                    if (str33 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(134), str33);
                    }
                    String str34 = uqm.A0L;
                    if (str34 != null) {
                        anonymousClass182.A0S(MSV.A00(175), str34);
                    }
                    String str35 = uqm.A0Q;
                    if (str35 != null) {
                        anonymousClass182.A0S("capture_type", str35);
                    }
                    String str36 = uqm.A0P;
                    if (str36 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(778), str36);
                    }
                    String str37 = uqm.A0S;
                    if (str37 != null) {
                        anonymousClass182.A0S(MSV.A00(198), str37);
                    }
                    anonymousClass182.A0Q("video_highlight_start_time_in_ms", uqm.A0A);
                    anonymousClass182.A0Q("video_highlight_duration_in_ms", uqm.A09);
                    String str38 = uqm.A0b;
                    if (str38 != null) {
                        anonymousClass182.A0S("upload_media_source", str38);
                    }
                    anonymousClass182.A0T("is_meta_gallery", uqm.A0h);
                    String str39 = uqm.A0H;
                    if (str39 != null) {
                        anonymousClass182.A0S("album_name", str39);
                    }
                    String str40 = uqm.A0I;
                    if (str40 != null) {
                        anonymousClass182.A0S("app_attribution_id", str40);
                    }
                    String str41 = uqm.A0W;
                    if (str41 != null) {
                        anonymousClass182.A0S("original_media_uri", str41);
                    }
                    Boolean bool4 = uqm.A0F;
                    if (bool4 != null) {
                        anonymousClass182.A0T("is_motion_photo", bool4.booleanValue());
                    }
                    anonymousClass182.A0a();
                    anonymousClass182.A0Q("max_width", c66649URn.A01);
                    i = c66649URn.A00;
                    str3 = "max_height";
                } else if (xbs instanceof C66650URo) {
                    C66650URo c66650URo = (C66650URo) xbs;
                    C14360o3.A0B(c66650URo, 1);
                    anonymousClass182.A0d();
                    anonymousClass182.A0S("uuid", c66650URo.A08);
                    A03(anonymousClass182, c66650URo.A06);
                    A02(anonymousClass182, c66650URo.A05);
                    A01(anonymousClass182, c66650URo.A04);
                    A00(c66650URo.A03, anonymousClass182);
                    anonymousClass182.A0Q("selected_variant_index", c66650URo.A02);
                    anonymousClass182.A0S("text", c66650URo.A07);
                    anonymousClass182.A0P("text_size", c66650URo.A00);
                    i = c66650URo.A01;
                    str3 = "max_width";
                } else {
                    if (xbs instanceof C66656URu) {
                        C66656URu c66656URu = (C66656URu) xbs;
                        C14360o3.A0B(c66656URu, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66656URu.A0B);
                        A03(anonymousClass182, c66656URu.A08);
                        A02(anonymousClass182, c66656URu.A07);
                        A01(anonymousClass182, c66656URu.A06);
                        A00(c66656URu.A05, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66656URu.A04);
                        String str42 = c66656URu.A0A;
                        if (str42 != null) {
                            anonymousClass182.A0S("original_media_id", str42);
                        }
                        String str43 = c66656URu.A09;
                        if (str43 != null) {
                            anonymousClass182.A0S(AbstractC111324zv.A00(1103), str43);
                        }
                        anonymousClass182.A0Q("media_duration", c66656URu.A03);
                        anonymousClass182.A0Q(AbstractC111324zv.A00(840), c66656URu.A02);
                        anonymousClass182.A0Q("container_height", c66656URu.A01);
                        anonymousClass182.A0P("media_aspect_ratio", c66656URu.A00);
                        anonymousClass182.A0T(AbstractC111324zv.A00(1063), c66656URu.A0D);
                        booleanValue = c66656URu.A0C;
                        str4 = "has_collaborators";
                    } else if (xbs instanceof C66651URp) {
                        C66651URp c66651URp = (C66651URp) xbs;
                        C14360o3.A0B(c66651URp, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66651URp.A06);
                        A03(anonymousClass182, c66651URp.A05);
                        A02(anonymousClass182, c66651URp.A04);
                        A01(anonymousClass182, c66651URp.A03);
                        A00(c66651URp.A02, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66651URp.A01);
                        anonymousClass182.A0Q("max_width", c66651URp.A00);
                        anonymousClass182.A0T(AbstractC111324zv.A00(1047), c66651URp.A07);
                        booleanValue = c66651URp.A08;
                        str4 = AbstractC111324zv.A00(1054);
                    } else if (xbs instanceof US4) {
                        US4 us4 = (US4) xbs;
                        C14360o3.A0B(us4, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", us4.A0N);
                        A03(anonymousClass182, us4.A07);
                        A02(anonymousClass182, us4.A03);
                        A01(anonymousClass182, us4.A02);
                        A00(us4.A01, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", us4.A00);
                        Integer num = us4.A0A;
                        if (num != null) {
                            anonymousClass182.A0Q("active_member_count", num.intValue());
                        }
                        Integer num2 = us4.A0B;
                        if (num2 != null) {
                            anonymousClass182.A0Q("audience_type", num2.intValue());
                        }
                        VE3 ve3 = us4.A04;
                        if (ve3 != null) {
                            anonymousClass182.A0S("chat_type", ve3.A00);
                        }
                        Integer num3 = us4.A0C;
                        if (num3 != null) {
                            anonymousClass182.A0Q("connected_member_count", num3.intValue());
                        }
                        String str44 = us4.A0F;
                        if (str44 != null) {
                            anonymousClass182.A0S("deeplink_url", str44);
                        }
                        Long l3 = us4.A0E;
                        if (l3 != null) {
                            anonymousClass182.A0R("duration_s", l3.longValue());
                        }
                        String str45 = us4.A0G;
                        if (str45 != null) {
                            anonymousClass182.A0S(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str45);
                        }
                        String str46 = us4.A0H;
                        if (str46 != null) {
                            anonymousClass182.A0S("group_image_uri", str46);
                        }
                        Boolean bool5 = us4.A08;
                        if (bool5 != null) {
                            anonymousClass182.A0T("is_creation", bool5.booleanValue());
                        }
                        Boolean bool6 = us4.A09;
                        if (bool6 != null) {
                            anonymousClass182.A0T("is_editing_enabled", bool6.booleanValue());
                        }
                        Integer num4 = us4.A0D;
                        if (num4 != null) {
                            anonymousClass182.A0Q("member_count", num4.intValue());
                        }
                        EnumC68154VDy enumC68154VDy = us4.A05;
                        if (enumC68154VDy != null) {
                            anonymousClass182.A0S("member_status", enumC68154VDy.A00);
                        }
                        String str47 = us4.A0I;
                        if (str47 != null) {
                            anonymousClass182.A0S("share_source", str47);
                        }
                        List list2 = us4.A0O;
                        if (list2 != null) {
                            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "social_context_users", list2);
                            while (A0q2.hasNext()) {
                                VXD.A00(anonymousClass182, (UPU) A0q2.next());
                            }
                            anonymousClass182.A0Z();
                        }
                        EnumC68150VDu enumC68150VDu = us4.A06;
                        if (enumC68150VDu != null) {
                            anonymousClass182.A0S("chat_sticker_type", enumC68150VDu.A00);
                        }
                        String str48 = us4.A0J;
                        if (str48 != null) {
                            anonymousClass182.A0S("story_chat_id", str48);
                        }
                        String str49 = us4.A0K;
                        if (str49 != null) {
                            anonymousClass182.A0S(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str49);
                        }
                        String str50 = us4.A0L;
                        if (str50 != null) {
                            anonymousClass182.A0S("thread_id_v2", str50);
                        }
                        str = us4.A0M;
                        if (str != null) {
                            str2 = DialogModule.KEY_TITLE;
                            anonymousClass182.A0S(str2, str);
                        }
                    } else if (xbs instanceof C66659URx) {
                        C66659URx c66659URx = (C66659URx) xbs;
                        C14360o3.A0B(c66659URx, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66659URx.A0D);
                        VEH veh = c66659URx.A08;
                        C14360o3.A0B(veh, 0);
                        anonymousClass182.A0S("sticker_type", veh.A00);
                        A02(anonymousClass182, c66659URx.A06);
                        A01(anonymousClass182, c66659URx.A05);
                        A00(c66659URx.A04, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66659URx.A03);
                        C16V.A03(anonymousClass182, "tokens");
                        for (UPO upo : c66659URx.A0E) {
                            C14360o3.A0B(upo, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("written", upo.A06);
                            anonymousClass182.A0P("confidence", upo.A00);
                            anonymousClass182.A0Q("start_time_ms", upo.A04);
                            anonymousClass182.A0Q("end_time_ms", upo.A02);
                            anonymousClass182.A0T("profanity", upo.A07);
                            anonymousClass182.A0Q("offset", upo.A03);
                            anonymousClass182.A0P(Location.SPEED, upo.A01);
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, upo.A05);
                            anonymousClass182.A0a();
                        }
                        anonymousClass182.A0Z();
                        anonymousClass182.A0Q("duration", c66659URx.A01);
                        VE6 ve6 = c66659URx.A07;
                        C14360o3.A0B(ve6, 0);
                        anonymousClass182.A0S("karaoke_sticker_display_type", ve6.A00);
                        anonymousClass182.A0Q("color", c66659URx.A00);
                        anonymousClass182.A0Q("emphasis_state", c66659URx.A02);
                        String str51 = c66659URx.A0B;
                        if (str51 != null) {
                            anonymousClass182.A0S("sticker_id", str51);
                        }
                        Boolean bool7 = c66659URx.A09;
                        if (bool7 != null) {
                            anonymousClass182.A0T("is_clips_v2_media", bool7.booleanValue());
                        }
                        String str52 = c66659URx.A0C;
                        if (str52 != null) {
                            anonymousClass182.A0S("text_color", str52);
                        }
                        str = c66659URx.A0A;
                        if (str != null) {
                            str2 = "background_color";
                            anonymousClass182.A0S(str2, str);
                        }
                    } else if (xbs instanceof C66660URy) {
                        C66660URy c66660URy = (C66660URy) xbs;
                        C14360o3.A0B(c66660URy, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66660URy.A0F);
                        A03(anonymousClass182, c66660URy.A04);
                        A02(anonymousClass182, c66660URy.A03);
                        A01(anonymousClass182, c66660URy.A02);
                        A00(c66660URy.A01, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66660URy.A00);
                        String str53 = c66660URy.A09;
                        if (str53 != null) {
                            anonymousClass182.A0S("click_id", str53);
                        }
                        String str54 = c66660URy.A0A;
                        if (str54 != null) {
                            anonymousClass182.A0S("custom_cta", str54);
                        }
                        String str55 = c66660URy.A0B;
                        if (str55 != null) {
                            anonymousClass182.A0S("display_url", str55);
                        }
                        Boolean bool8 = c66660URy.A06;
                        if (bool8 != null) {
                            anonymousClass182.A0T("is_universal_link", bool8.booleanValue());
                        }
                        String str56 = c66660URy.A0C;
                        if (str56 != null) {
                            anonymousClass182.A0S("link_title", str56);
                        }
                        String str57 = c66660URy.A0D;
                        if (str57 != null) {
                            anonymousClass182.A0S("link_type", str57);
                        }
                        Boolean bool9 = c66660URy.A07;
                        if (bool9 != null) {
                            anonymousClass182.A0T("open_external_browser", bool9.booleanValue());
                        }
                        String str58 = c66660URy.A0E;
                        if (str58 != null) {
                            anonymousClass182.A0S("url", str58);
                        }
                        Boolean bool10 = c66660URy.A05;
                        if (bool10 != null) {
                            anonymousClass182.A0T("is_dynamic_dwell_enabled", bool10.booleanValue());
                        }
                        Boolean bool11 = c66660URy.A08;
                        if (bool11 != null) {
                            booleanValue = bool11.booleanValue();
                            str4 = AbstractC111324zv.A00(1264);
                        }
                    } else if (xbs instanceof C66648URm) {
                        C66648URm c66648URm = (C66648URm) xbs;
                        C14360o3.A0B(c66648URm, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66648URm.A07);
                        A03(anonymousClass182, c66648URm.A05);
                        A02(anonymousClass182, c66648URm.A03);
                        A01(anonymousClass182, c66648URm.A02);
                        A00(c66648URm.A01, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66648URm.A00);
                        anonymousClass182.A0r("venue");
                        VXE.A00(anonymousClass182, c66648URm.A04);
                        Integer num5 = c66648URm.A06;
                        if (num5 != null) {
                            i = num5.intValue();
                            str3 = "themed_color";
                        }
                    } else if (xbs instanceof C66653URr) {
                        C66653URr c66653URr = (C66653URr) xbs;
                        C14360o3.A0B(c66653URr, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66653URr.A08);
                        VEH veh2 = c66653URr.A07;
                        C14360o3.A0B(veh2, 0);
                        anonymousClass182.A0S("sticker_type", veh2.A00);
                        A02(anonymousClass182, c66653URr.A04);
                        A01(anonymousClass182, c66653URr.A03);
                        A00(c66653URr.A02, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66653URr.A00);
                        VE9 ve9 = c66653URr.A06;
                        C14360o3.A0B(ve9, 0);
                        anonymousClass182.A0S("music_sticker_display_type", ve9.A00);
                        anonymousClass182.A0r("music_overlay_model");
                        VXH.A00(anonymousClass182, c66653URr.A05);
                        C16V.A03(anonymousClass182, AbstractC111324zv.A00(1117));
                        for (MVC mvc : c66653URr.A09) {
                            C14360o3.A0B(mvc, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0Q("start_time_in_ms", mvc.A01);
                            anonymousClass182.A0Q("end_time_in_ms", mvc.A00);
                            anonymousClass182.A0S("phrase", mvc.A03);
                            List list3 = (List) mvc.A02;
                            if (list3 != null) {
                                Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "word_offsets", list3);
                                while (A0q3.hasNext()) {
                                    C51697MsS c51697MsS = (C51697MsS) A0q3.next();
                                    C14360o3.A0B(c51697MsS, 1);
                                    anonymousClass182.A0d();
                                    anonymousClass182.A0Q("start_index", c51697MsS.A02);
                                    anonymousClass182.A0Q("end_index", c51697MsS.A00);
                                    anonymousClass182.A0Q("start_offset_ms", c51697MsS.A03);
                                    anonymousClass182.A0Q("end_offset_ms", c51697MsS.A01);
                                    anonymousClass182.A0T("trailing_space", c51697MsS.A04);
                                    anonymousClass182.A0a();
                                }
                                anonymousClass182.A0Z();
                            }
                            anonymousClass182.A0a();
                        }
                        anonymousClass182.A0Z();
                        i = c66653URr.A01;
                        str3 = "text_color";
                    } else if (xbs instanceof C66654URs) {
                        C66654URs c66654URs = (C66654URs) xbs;
                        C14360o3.A0B(c66654URs, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66654URs.A09);
                        A03(anonymousClass182, c66654URs.A07);
                        A02(anonymousClass182, c66654URs.A05);
                        A01(anonymousClass182, c66654URs.A04);
                        A00(c66654URs.A03, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66654URs.A02);
                        anonymousClass182.A0S("text", c66654URs.A08);
                        anonymousClass182.A0P("text_size", c66654URs.A00);
                        anonymousClass182.A0Q("max_width", c66654URs.A01);
                        UPU upu2 = c66654URs.A06;
                        if (upu2 != null) {
                            anonymousClass182.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                            VXD.A00(anonymousClass182, upu2);
                        }
                    } else if (xbs instanceof C66652URq) {
                        C66652URq c66652URq = (C66652URq) xbs;
                        C14360o3.A0B(c66652URq, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66652URq.A08);
                        VEH veh3 = c66652URq.A07;
                        C14360o3.A0B(veh3, 0);
                        anonymousClass182.A0S("sticker_type", veh3.A00);
                        A02(anonymousClass182, c66652URq.A04);
                        A01(anonymousClass182, c66652URq.A03);
                        A00(c66652URq.A02, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66652URq.A00);
                        VE9 ve92 = c66652URq.A06;
                        C14360o3.A0B(ve92, 0);
                        anonymousClass182.A0S("music_sticker_display_type", ve92.A00);
                        anonymousClass182.A0r("music_overlay_model");
                        VXH.A00(anonymousClass182, c66652URq.A05);
                        i = c66652URq.A01;
                        str3 = "text_color";
                    } else if (xbs instanceof C66657URv) {
                        C66657URv c66657URv = (C66657URv) xbs;
                        C14360o3.A0B(c66657URv, 1);
                        anonymousClass182.A0d();
                        anonymousClass182.A0S("uuid", c66657URv.A0D);
                        A03(anonymousClass182, c66657URv.A09);
                        A02(anonymousClass182, c66657URv.A08);
                        A01(anonymousClass182, c66657URv.A07);
                        A00(c66657URv.A06, anonymousClass182);
                        anonymousClass182.A0Q("selected_variant_index", c66657URv.A05);
                        anonymousClass182.A0S("first_option_string", c66657URv.A0A);
                        anonymousClass182.A0S("second_option_string", c66657URv.A0C);
                        anonymousClass182.A0P("first_option_text_size", c66657URv.A00);
                        anonymousClass182.A0P("second_option_text_size", c66657URv.A02);
                        String str59 = c66657URv.A0B;
                        if (str59 != null) {
                            anonymousClass182.A0S("question", str59);
                        }
                        anonymousClass182.A0P("question_text_size", c66657URv.A01);
                        anonymousClass182.A0Q("question_max_width", c66657URv.A03);
                        i = c66657URv.A04;
                        str3 = "question_padding_bottom";
                    } else {
                        if (xbs instanceof C66658URw) {
                            C66658URw c66658URw = (C66658URw) xbs;
                            C14360o3.A0B(c66658URw, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", c66658URw.A09);
                            A03(anonymousClass182, c66658URw.A04);
                            A02(anonymousClass182, c66658URw.A03);
                            A01(anonymousClass182, c66658URw.A02);
                            A00(c66658URw.A01, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", c66658URw.A00);
                            anonymousClass182.A0S("poll_id", c66658URw.A07);
                            String str60 = c66658URw.A08;
                            if (str60 != null) {
                                anonymousClass182.A0S("question", str60);
                            }
                            Integer num6 = c66658URw.A05;
                            if (num6 != null) {
                                anonymousClass182.A0Q("viewer_vote", num6.intValue());
                            }
                            anonymousClass182.A0T("viewer_can_vote", c66658URw.A0D);
                            anonymousClass182.A0T("is_shared_result", c66658URw.A0C);
                            C16V.A03(anonymousClass182, "tallies");
                            for (C38687GzS c38687GzS : c66658URw.A0B) {
                                C14360o3.A0B(c38687GzS, 1);
                                anonymousClass182.A0d();
                                anonymousClass182.A0S("text", c38687GzS.A01);
                                Number number = (Number) c38687GzS.A00;
                                if (number != null) {
                                    anonymousClass182.A0Q("count", number.intValue());
                                }
                                anonymousClass182.A0a();
                            }
                            anonymousClass182.A0Z();
                            List list4 = c66658URw.A0A;
                            if (list4 != null) {
                                Iterator A0q4 = AbstractC37301Gc2.A0q(anonymousClass182, "option_tally_ratios", list4);
                                while (A0q4.hasNext()) {
                                    anonymousClass182.A0h(AbstractC167007dF.A0B(A0q4));
                                }
                                anonymousClass182.A0Z();
                            }
                            str = c66658URw.A06;
                            str2 = "color";
                        } else if (xbs instanceof US7) {
                            US7 us7 = (US7) xbs;
                            C14360o3.A0B(us7, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", us7.A0T);
                            VEH veh4 = us7.A0A;
                            C14360o3.A0B(veh4, 0);
                            anonymousClass182.A0S("sticker_type", veh4.A00);
                            A02(anonymousClass182, us7.A06);
                            A01(anonymousClass182, us7.A05);
                            A00(us7.A04, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", us7.A01);
                            String str61 = us7.A0N;
                            if (str61 != null) {
                                anonymousClass182.A0S("background_color", str61);
                            }
                            EnumC68145VDi enumC68145VDi = us7.A08;
                            C14360o3.A0B(enumC68145VDi, 0);
                            anonymousClass182.A0S("disablement_state", enumC68145VDi.A00);
                            C26087BgG c26087BgG = us7.A02;
                            if (c26087BgG != null) {
                                anonymousClass182.A0r("election_add_yours_info");
                                anonymousClass182.A0d();
                                Boolean bool12 = (Boolean) c26087BgG.A00;
                                if (bool12 != null) {
                                    anonymousClass182.A0T("disable_add_yours_button", bool12.booleanValue());
                                }
                                Boolean bool13 = (Boolean) c26087BgG.A01;
                                if (bool13 != null) {
                                    anonymousClass182.A0T("disable_bottom_sheet", bool13.booleanValue());
                                }
                                String str62 = c26087BgG.A03;
                                if (str62 != null) {
                                    anonymousClass182.A0S("tray_title", str62);
                                }
                                List list5 = (List) c26087BgG.A02;
                                if (list5 != null) {
                                    Iterator A0q5 = AbstractC37301Gc2.A0q(anonymousClass182, "title_options", list5);
                                    while (A0q5.hasNext()) {
                                        anonymousClass182.A0u((String) A0q5.next());
                                    }
                                    anonymousClass182.A0Z();
                                }
                                anonymousClass182.A0a();
                            }
                            C16V.A03(anonymousClass182, "facepile_top_participants");
                            Iterator it = us7.A0U.iterator();
                            while (it.hasNext()) {
                                VXD.A00(anonymousClass182, (UPU) it.next());
                            }
                            anonymousClass182.A0Z();
                            Boolean bool14 = us7.A0B;
                            if (bool14 != null) {
                                anonymousClass182.A0T("has_participated", bool14.booleanValue());
                            }
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, us7.A0O);
                            Boolean bool15 = us7.A0C;
                            if (bool15 != null) {
                                anonymousClass182.A0T("is_before_and_after", bool15.booleanValue());
                            }
                            Boolean bool16 = us7.A0D;
                            if (bool16 != null) {
                                anonymousClass182.A0T("is_clips_v2_media", bool16.booleanValue());
                            }
                            Boolean bool17 = us7.A0E;
                            if (bool17 != null) {
                                anonymousClass182.A0T("is_created_from_add_yours_browsing", bool17.booleanValue());
                            }
                            Boolean bool18 = us7.A0F;
                            if (bool18 != null) {
                                anonymousClass182.A0T("is_from_add_yours_camera_tool", bool18.booleanValue());
                            }
                            Boolean bool19 = us7.A0G;
                            if (bool19 != null) {
                                anonymousClass182.A0T("is_icon_disabled", bool19.booleanValue());
                            }
                            Boolean bool20 = us7.A0H;
                            if (bool20 != null) {
                                anonymousClass182.A0T("is_original_prompt_media", bool20.booleanValue());
                            }
                            Boolean bool21 = us7.A0I;
                            if (bool21 != null) {
                                anonymousClass182.A0T("is_pinned_by_creator", bool21.booleanValue());
                            }
                            Boolean bool22 = us7.A0J;
                            if (bool22 != null) {
                                anonymousClass182.A0T("is_speakeasy", bool22.booleanValue());
                            }
                            Boolean bool23 = us7.A0K;
                            if (bool23 != null) {
                                anonymousClass182.A0T("is_story_trending_prompt", bool23.booleanValue());
                            }
                            Boolean bool24 = us7.A0L;
                            if (bool24 != null) {
                                anonymousClass182.A0T("is_trending_prompt", bool24.booleanValue());
                            }
                            Boolean bool25 = us7.A0M;
                            if (bool25 != null) {
                                anonymousClass182.A0T("is_viewer_original_author", bool25.booleanValue());
                            }
                            String str63 = us7.A0P;
                            if (str63 != null) {
                                anonymousClass182.A0S("media_id", str63);
                            }
                            UPU upu3 = us7.A07;
                            if (upu3 != null) {
                                anonymousClass182.A0r("original_author");
                                VXD.A00(anonymousClass182, upu3);
                            }
                            anonymousClass182.A0Q("participant_count", us7.A00);
                            UQE uqe = us7.A03;
                            if (uqe != null) {
                                anonymousClass182.A0r("prompt_failure_tooltip");
                                anonymousClass182.A0d();
                                String str64 = uqe.A00;
                                if (str64 != null) {
                                    anonymousClass182.A0S("error_message_body", str64);
                                }
                                String str65 = uqe.A01;
                                if (str65 != null) {
                                    anonymousClass182.A0S(AbstractC58317Pt9.A00(5), str65);
                                }
                                anonymousClass182.A0a();
                            }
                            String str66 = us7.A0Q;
                            if (str66 != null) {
                                anonymousClass182.A0S("prompt_style", str66);
                            }
                            VEC vec = us7.A09;
                            if (vec != null) {
                                anonymousClass182.A0S("prompt_type", vec.A00);
                            }
                            String str67 = us7.A0R;
                            if (str67 != null) {
                                anonymousClass182.A0S("sticker_style_str", str67);
                            }
                            str = us7.A0S;
                            str2 = "text";
                        } else if (xbs instanceof US1) {
                            US1 us1 = (US1) xbs;
                            C14360o3.A0B(us1, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", us1.A0F);
                            VEH veh5 = us1.A05;
                            C14360o3.A0B(veh5, 0);
                            anonymousClass182.A0S("sticker_type", veh5.A00);
                            A02(anonymousClass182, us1.A03);
                            A01(anonymousClass182, us1.A02);
                            A00(us1.A01, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", us1.A00);
                            String str68 = us1.A09;
                            if (str68 != null) {
                                anonymousClass182.A0S("background_color", str68);
                            }
                            Boolean bool26 = us1.A06;
                            if (bool26 != null) {
                                anonymousClass182.A0T("is_clips_v2_media", bool26.booleanValue());
                            }
                            String str69 = us1.A0A;
                            if (str69 != null) {
                                anonymousClass182.A0S("media_id", str69);
                            }
                            String str70 = us1.A0B;
                            if (str70 != null) {
                                anonymousClass182.A0S("profile_pic_url", str70);
                            }
                            String str71 = us1.A0C;
                            if (str71 != null) {
                                anonymousClass182.A0S("question", str71);
                            }
                            String str72 = us1.A0D;
                            if (str72 != null) {
                                anonymousClass182.A0S("question_id", str72);
                            }
                            Long l4 = us1.A08;
                            if (l4 != null) {
                                anonymousClass182.A0R("question_response_count", l4.longValue());
                            }
                            EnumC68152VDw enumC68152VDw = us1.A04;
                            if (enumC68152VDw != null) {
                                anonymousClass182.A0S("question_type", enumC68152VDw.A00);
                            }
                            List list6 = us1.A0G;
                            if (list6 != null) {
                                Iterator A0q6 = AbstractC37301Gc2.A0q(anonymousClass182, "response_types", list6);
                                while (A0q6.hasNext()) {
                                    EnumC68151VDv enumC68151VDv = (EnumC68151VDv) A0q6.next();
                                    C14360o3.A0B(enumC68151VDv, 0);
                                    anonymousClass182.A0u(enumC68151VDv.A00);
                                }
                                anonymousClass182.A0Z();
                            }
                            String str73 = us1.A0E;
                            if (str73 != null) {
                                anonymousClass182.A0S("text_color", str73);
                            }
                            Boolean bool27 = us1.A07;
                            if (bool27 != null) {
                                booleanValue = bool27.booleanValue();
                                str4 = "viewer_can_interact";
                            }
                        } else if (xbs instanceof US3) {
                            US3 us3 = (US3) xbs;
                            C14360o3.A0B(us3, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", us3.A0G);
                            A03(anonymousClass182, us3.A04);
                            A02(anonymousClass182, us3.A03);
                            A01(anonymousClass182, us3.A02);
                            A00(us3.A01, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", us3.A00);
                            Integer num7 = us3.A07;
                            if (num7 != null) {
                                anonymousClass182.A0Q("correct_answer", num7.intValue());
                            }
                            String str74 = us3.A09;
                            if (str74 != null) {
                                anonymousClass182.A0S("default_prompt", str74);
                            }
                            String str75 = us3.A0A;
                            if (str75 != null) {
                                anonymousClass182.A0S("end_background_color", str75);
                            }
                            Boolean bool28 = us3.A05;
                            if (bool28 != null) {
                                anonymousClass182.A0T("finished", bool28.booleanValue());
                            }
                            AbstractC37301Gc2.A1D(anonymousClass182, us3.A0B);
                            List list7 = us3.A0H;
                            if (list7 != null) {
                                Iterator A0q7 = AbstractC37301Gc2.A0q(anonymousClass182, "options", list7);
                                while (A0q7.hasNext()) {
                                    VXF.A00((MUW) A0q7.next(), anonymousClass182);
                                }
                                anonymousClass182.A0Z();
                            }
                            String str76 = us3.A0C;
                            if (str76 != null) {
                                anonymousClass182.A0S("question", str76);
                            }
                            String str77 = us3.A0D;
                            if (str77 != null) {
                                anonymousClass182.A0S("quiz_id", str77);
                            }
                            String str78 = us3.A0E;
                            if (str78 != null) {
                                anonymousClass182.A0S("start_background_color", str78);
                            }
                            List list8 = us3.A0I;
                            if (list8 != null) {
                                Iterator A0q8 = AbstractC37301Gc2.A0q(anonymousClass182, "tallies", list8);
                                while (A0q8.hasNext()) {
                                    VXF.A00((MUW) A0q8.next(), anonymousClass182);
                                }
                                anonymousClass182.A0Z();
                            }
                            String str79 = us3.A0F;
                            if (str79 != null) {
                                anonymousClass182.A0S("text_color", str79);
                            }
                            Integer num8 = us3.A08;
                            if (num8 != null) {
                                anonymousClass182.A0Q("viewer_answer", num8.intValue());
                            }
                            Boolean bool29 = us3.A06;
                            if (bool29 != null) {
                                booleanValue = bool29.booleanValue();
                                str4 = "viewer_can_answer";
                            }
                        } else if (xbs instanceof C66661URz) {
                            C66661URz c66661URz = (C66661URz) xbs;
                            C14360o3.A0B(c66661URz, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", c66661URz.A0F);
                            A03(anonymousClass182, c66661URz.A04);
                            A02(anonymousClass182, c66661URz.A03);
                            A01(anonymousClass182, c66661URz.A02);
                            A00(c66661URz.A01, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", c66661URz.A00);
                            String str80 = c66661URz.A0A;
                            if (str80 != null) {
                                anonymousClass182.A0S("background_color", str80);
                            }
                            String str81 = c66661URz.A0B;
                            if (str81 != null) {
                                anonymousClass182.A0S("emoji", str81);
                            }
                            Boolean bool30 = c66661URz.A05;
                            if (bool30 != null) {
                                anonymousClass182.A0T("is_interactive_music_sticker", bool30.booleanValue());
                            }
                            String str82 = c66661URz.A0C;
                            if (str82 != null) {
                                anonymousClass182.A0S("question", str82);
                            }
                            String str83 = c66661URz.A0D;
                            if (str83 != null) {
                                anonymousClass182.A0S("slider_id", str83);
                            }
                            Float f = c66661URz.A07;
                            if (f != null) {
                                anonymousClass182.A0P("slider_vote_average", f.floatValue());
                            }
                            Integer num9 = c66661URz.A09;
                            if (num9 != null) {
                                anonymousClass182.A0Q("slider_vote_count", num9.intValue());
                            }
                            String str84 = c66661URz.A0E;
                            if (str84 != null) {
                                anonymousClass182.A0S("text_color", str84);
                            }
                            Boolean bool31 = c66661URz.A06;
                            if (bool31 != null) {
                                anonymousClass182.A0T("viewer_can_vote", bool31.booleanValue());
                            }
                            Float f2 = c66661URz.A08;
                            if (f2 != null) {
                                anonymousClass182.A0P("viewer_vote", f2.floatValue());
                            }
                        } else if (xbs instanceof US8) {
                            US8 us8 = (US8) xbs;
                            C14360o3.A0B(us8, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", us8.A0K);
                            A03(anonymousClass182, us8.A06);
                            A02(anonymousClass182, us8.A04);
                            A01(anonymousClass182, us8.A03);
                            A00(us8.A02, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", us8.A00);
                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, us8.A0G);
                            List list9 = us8.A0P;
                            if (list9 != null) {
                                Iterator A0q9 = AbstractC37301Gc2.A0q(anonymousClass182, "stickers", list9);
                                while (A0q9.hasNext()) {
                                    VXG.A00(anonymousClass182, (C66617UPe) A0q9.next());
                                }
                                anonymousClass182.A0Z();
                            }
                            List list10 = us8.A0M;
                            if (list10 != null) {
                                Iterator A0q10 = AbstractC37301Gc2.A0q(anonymousClass182, "keywords", list10);
                                while (A0q10.hasNext()) {
                                    anonymousClass182.A0u((String) A0q10.next());
                                }
                                anonymousClass182.A0Z();
                            }
                            List list11 = us8.A0R;
                            if (list11 != null) {
                                Iterator A0q11 = AbstractC37301Gc2.A0q(anonymousClass182, "titles", list11);
                                while (A0q11.hasNext()) {
                                    anonymousClass182.A0u((String) A0q11.next());
                                }
                                anonymousClass182.A0Z();
                            }
                            anonymousClass182.A0T("include_in_recent", us8.A0T);
                            String str85 = us8.A0F;
                            if (str85 != null) {
                                anonymousClass182.A0S("help_text", str85);
                            }
                            String str86 = us8.A0J;
                            if (str86 != null) {
                                anonymousClass182.A0S("secondary_text", str86);
                            }
                            String str87 = us8.A0H;
                            if (str87 != null) {
                                anonymousClass182.A0S("prompt", str87);
                            }
                            String str88 = us8.A0E;
                            if (str88 != null) {
                                anonymousClass182.A0S("default_prompt", str88);
                            }
                            List list12 = us8.A0L;
                            if (list12 != null) {
                                Iterator A0q12 = AbstractC37301Gc2.A0q(anonymousClass182, "button_texts", list12);
                                while (A0q12.hasNext()) {
                                    anonymousClass182.A0u((String) A0q12.next());
                                }
                                anonymousClass182.A0Z();
                            }
                            List list13 = us8.A0O;
                            if (list13 != null) {
                                Iterator A0q13 = AbstractC37301Gc2.A0q(anonymousClass182, "prompts", list13);
                                while (A0q13.hasNext()) {
                                    anonymousClass182.A0u((String) A0q13.next());
                                }
                                anonymousClass182.A0Z();
                            }
                            Float f3 = us8.A0C;
                            if (f3 != null) {
                                anonymousClass182.A0P("minimum_scale", f3.floatValue());
                            }
                            Float f4 = us8.A0B;
                            if (f4 != null) {
                                anonymousClass182.A0P("maximum_scale", f4.floatValue());
                            }
                            Boolean bool32 = us8.A08;
                            if (bool32 != null) {
                                anonymousClass182.A0T(AbstractC111324zv.A00(2003), bool32.booleanValue());
                            }
                            Integer num10 = us8.A0D;
                            if (num10 != null) {
                                anonymousClass182.A0Q(AbstractC111324zv.A00(2974), num10.intValue());
                            }
                            String str89 = us8.A0I;
                            if (str89 != null) {
                                anonymousClass182.A0S("render_framework", str89);
                            }
                            anonymousClass182.A0T("has_attribution", us8.A0S);
                            anonymousClass182.A0T("partnered_account", us8.A0U);
                            UPL upl = us8.A05;
                            if (upl != null) {
                                anonymousClass182.A0r("ring_spec");
                                anonymousClass182.A0d();
                                List list14 = upl.A05;
                                if (list14 != null) {
                                    Iterator A0q14 = AbstractC37301Gc2.A0q(anonymousClass182, "colors", list14);
                                    while (A0q14.hasNext()) {
                                        anonymousClass182.A0u((String) A0q14.next());
                                    }
                                    anonymousClass182.A0Z();
                                }
                                anonymousClass182.A0P("start_point_x", upl.A02);
                                anonymousClass182.A0P("start_point_y", upl.A03);
                                anonymousClass182.A0P("end_point_x", upl.A00);
                                anonymousClass182.A0P("end_point_y", upl.A01);
                                List list15 = upl.A06;
                                if (list15 != null) {
                                    Iterator A0q15 = AbstractC37301Gc2.A0q(anonymousClass182, "locations", list15);
                                    while (A0q15.hasNext()) {
                                        anonymousClass182.A0g(((Number) A0q15.next()).floatValue());
                                    }
                                    anonymousClass182.A0Z();
                                }
                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, upl.A04);
                                anonymousClass182.A0a();
                            }
                            C45116Jxl c45116Jxl = us8.A01;
                            if (c45116Jxl != null) {
                                anonymousClass182.A0r("ring_glyph");
                                anonymousClass182.A0d();
                                anonymousClass182.A0S("image_url", c45116Jxl.A00);
                                String str90 = c45116Jxl.A01;
                                if (str90 != null) {
                                    anonymousClass182.A0S(AbstractC111324zv.A00(221), str90);
                                }
                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c45116Jxl.A02);
                                anonymousClass182.A0a();
                            }
                            C66614UPb c66614UPb = us8.A07;
                            if (c66614UPb != null) {
                                anonymousClass182.A0r("track");
                                anonymousClass182.A0d();
                                anonymousClass182.A0T("allows_saving", c66614UPb.A0M);
                                String str91 = c66614UPb.A04;
                                if (str91 != null) {
                                    anonymousClass182.A0S("artist_id", str91);
                                }
                                String str92 = c66614UPb.A05;
                                if (str92 != null) {
                                    anonymousClass182.A0S("audio_asset_id", str92);
                                }
                                String str93 = c66614UPb.A06;
                                if (str93 != null) {
                                    anonymousClass182.A0S("audio_cluster_id", str93);
                                }
                                String str94 = c66614UPb.A07;
                                if (str94 != null) {
                                    anonymousClass182.A0S("cover_artwork_thumbnail_uri", str94);
                                }
                                String str95 = c66614UPb.A08;
                                if (str95 != null) {
                                    anonymousClass182.A0S("cover_artwork_uri", str95);
                                }
                                String str96 = c66614UPb.A09;
                                if (str96 != null) {
                                    anonymousClass182.A0S("dark_message", str96);
                                }
                                String str97 = c66614UPb.A0A;
                                if (str97 != null) {
                                    anonymousClass182.A0S("dash_manifest", str97);
                                }
                                String str98 = c66614UPb.A0B;
                                if (str98 != null) {
                                    anonymousClass182.A0S("display_artist", str98);
                                }
                                Integer num11 = c66614UPb.A03;
                                if (num11 != null) {
                                    anonymousClass182.A0Q("duration_in_ms", num11.intValue());
                                }
                                String str99 = c66614UPb.A0C;
                                if (str99 != null) {
                                    anonymousClass182.A0S("fast_start_progressive_download_url", str99);
                                }
                                Boolean bool33 = c66614UPb.A00;
                                if (bool33 != null) {
                                    anonymousClass182.A0T("has_lyrics", bool33.booleanValue());
                                }
                                List list16 = c66614UPb.A0L;
                                if (list16 != null) {
                                    Iterator A0q16 = AbstractC37301Gc2.A0q(anonymousClass182, "highlight_start_times_in_ms", list16);
                                    while (A0q16.hasNext()) {
                                        anonymousClass182.A0h(AbstractC167007dF.A0B(A0q16));
                                    }
                                    anonymousClass182.A0Z();
                                }
                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c66614UPb.A0D);
                                String str100 = c66614UPb.A0E;
                                if (str100 != null) {
                                    anonymousClass182.A0S("ig_username", str100);
                                }
                                Boolean bool34 = c66614UPb.A01;
                                if (bool34 != null) {
                                    anonymousClass182.A0T("is_eligible_for_audio_effects", bool34.booleanValue());
                                }
                                Boolean bool35 = c66614UPb.A02;
                                if (bool35 != null) {
                                    anonymousClass182.A0T("is_eligible_for_vinyl_sticker", bool35.booleanValue());
                                }
                                anonymousClass182.A0T("is_explicit", c66614UPb.A0N);
                                String str101 = c66614UPb.A0F;
                                if (str101 != null) {
                                    anonymousClass182.A0S("progressive_download_url", str101);
                                }
                                String str102 = c66614UPb.A0G;
                                if (str102 != null) {
                                    anonymousClass182.A0S("reactive_audio_download_url", str102);
                                }
                                String str103 = c66614UPb.A0H;
                                if (str103 != null) {
                                    anonymousClass182.A0S("sanitized_title", str103);
                                }
                                String str104 = c66614UPb.A0I;
                                if (str104 != null) {
                                    anonymousClass182.A0S("subtitle", str104);
                                }
                                AbstractC37301Gc2.A1F(anonymousClass182, c66614UPb.A0J);
                                String str105 = c66614UPb.A0K;
                                if (str105 != null) {
                                    anonymousClass182.A0S("web_30s_preview_download_url", str105);
                                }
                                anonymousClass182.A0a();
                            }
                            List list17 = us8.A0Q;
                            if (list17 != null) {
                                Iterator A0q17 = AbstractC37301Gc2.A0q(anonymousClass182, AbstractC58317Pt9.A00(53), list17);
                                while (A0q17.hasNext()) {
                                    anonymousClass182.A0u((String) A0q17.next());
                                }
                                anonymousClass182.A0Z();
                            }
                            Boolean bool36 = us8.A09;
                            if (bool36 != null) {
                                anonymousClass182.A0T("has_avatar", bool36.booleanValue());
                            }
                            List list18 = us8.A0N;
                            if (list18 != null) {
                                Iterator A0q18 = AbstractC37301Gc2.A0q(anonymousClass182, "prompt_titles", list18);
                                while (A0q18.hasNext()) {
                                    UQE uqe2 = (UQE) A0q18.next();
                                    C14360o3.A0B(uqe2, 1);
                                    anonymousClass182.A0d();
                                    anonymousClass182.A0S("first", uqe2.A00);
                                    anonymousClass182.A0S("second", uqe2.A01);
                                    anonymousClass182.A0a();
                                }
                                anonymousClass182.A0Z();
                            }
                            Boolean bool37 = us8.A0A;
                            if (bool37 != null) {
                                booleanValue = bool37.booleanValue();
                                str4 = "is_boost_eligible";
                            }
                        } else if (xbs instanceof US5) {
                            US5 us5 = (US5) xbs;
                            C14360o3.A0B(us5, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", us5.A0N);
                            VEH veh6 = us5.A0K;
                            C14360o3.A0B(veh6, 0);
                            anonymousClass182.A0S("sticker_type", veh6.A00);
                            A02(anonymousClass182, us5.A0F);
                            A01(anonymousClass182, us5.A0E);
                            A00(us5.A0D, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", us5.A08);
                            AbstractC37301Gc2.A1E(anonymousClass182, us5.A0L);
                            anonymousClass182.A0P("playback_duration", us5.A05);
                            List list19 = us5.A0O;
                            if (list19 != null) {
                                Iterator A0q19 = AbstractC37301Gc2.A0q(anonymousClass182, "span_metadata", list19);
                                while (A0q19.hasNext()) {
                                    UPC upc = (UPC) A0q19.next();
                                    C14360o3.A0B(upc, 1);
                                    anonymousClass182.A0d();
                                    anonymousClass182.A0Q("span_start", upc.A02);
                                    anonymousClass182.A0Q("span_end", upc.A00);
                                    anonymousClass182.A0Q("span_flags", upc.A01);
                                    anonymousClass182.A0S("metadata_model", upc.A04);
                                    VEE vee = upc.A03;
                                    C14360o3.A0B(vee, 0);
                                    anonymousClass182.A0S("metadata_model_type", vee.A00);
                                    anonymousClass182.A0a();
                                }
                                anonymousClass182.A0Z();
                            }
                            EnumC68144VDh enumC68144VDh = us5.A0G;
                            if (enumC68144VDh != null) {
                                anonymousClass182.A0S("text_alignment", enumC68144VDh.A00);
                            }
                            anonymousClass182.A0P("padding_x", us5.A03);
                            anonymousClass182.A0P("padding_y", us5.A04);
                            anonymousClass182.A0Q("text_color", us5.A09);
                            anonymousClass182.A0P("text_size", us5.A06);
                            C66248U5s c66248U5s = us5.A0C;
                            if (c66248U5s != null) {
                                anonymousClass182.A0r("shadow_layer");
                                anonymousClass182.A0d();
                                anonymousClass182.A0P("shadow_layer_radius", c66248U5s.A02);
                                anonymousClass182.A0P("shadow_layer_dx", c66248U5s.A00);
                                anonymousClass182.A0P("shadow_layer_dy", c66248U5s.A01);
                                anonymousClass182.A0Q("shadow_layer_color", c66248U5s.A03);
                                anonymousClass182.A0a();
                            }
                            anonymousClass182.A0P("line_spacing_add", us5.A01);
                            anonymousClass182.A0P("line_spacing_mult", us5.A02);
                            anonymousClass182.A0P("letter_spacing", us5.A00);
                            anonymousClass182.A0Q("truncation_max_lines", us5.A0B);
                            String str106 = us5.A0M;
                            if (str106 != null) {
                                anonymousClass182.A0S("truncation_suffix", str106);
                            }
                            anonymousClass182.A0T("is_animated", us5.A0P);
                            anonymousClass182.A0Q("safe_width", us5.A07);
                            VDY vdy = us5.A0J;
                            if (vdy != null) {
                                anonymousClass182.A0S("drawable_source", vdy.A00);
                            }
                            anonymousClass182.A0T("is_story_text_drawable", us5.A0Q);
                            EnumC223009sf enumC223009sf = us5.A0H;
                            if (enumC223009sf != null) {
                                anonymousClass182.A0S("animation_id", enumC223009sf.A00);
                            }
                            EnumC68155VDz enumC68155VDz = us5.A0I;
                            if (enumC68155VDz != null) {
                                anonymousClass182.A0S("effect_id", enumC68155VDz.A00);
                            }
                            i = us5.A0A;
                            str3 = "text_effect_color";
                        } else if (xbs instanceof US0) {
                            US0 us0 = (US0) xbs;
                            C14360o3.A0B(us0, 1);
                            anonymousClass182.A0d();
                            anonymousClass182.A0S("uuid", us0.A0E);
                            A03(anonymousClass182, us0.A05);
                            A02(anonymousClass182, us0.A03);
                            A01(anonymousClass182, us0.A02);
                            A00(us0.A01, anonymousClass182);
                            anonymousClass182.A0Q("selected_variant_index", us0.A00);
                            anonymousClass182.A0T("can_viewer_link_back_to_original_media_from_vcr", us0.A0F);
                            String str107 = us0.A08;
                            if (str107 != null) {
                                anonymousClass182.A0S("end_background_color", str107);
                            }
                            Float f5 = us0.A06;
                            if (f5 != null) {
                                anonymousClass182.A0P("end_time_ms", f5.floatValue());
                            }
                            anonymousClass182.A0r("original_comment_author");
                            VXD.A00(anonymousClass182, us0.A04);
                            anonymousClass182.A0S("original_comment_id", us0.A09);
                            anonymousClass182.A0S("original_comment_text", us0.A0A);
                            anonymousClass182.A0S("original_media_id", us0.A0B);
                            String str108 = us0.A0C;
                            if (str108 != null) {
                                anonymousClass182.A0S("start_background_color", str108);
                            }
                            Float f6 = us0.A07;
                            if (f6 != null) {
                                anonymousClass182.A0P("start_time_ms", f6.floatValue());
                            }
                            str = us0.A0D;
                            if (str != null) {
                                str2 = "text_color";
                            }
                        }
                        anonymousClass182.A0S(str2, str);
                    }
                    anonymousClass182.A0T(str4, booleanValue);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q(str3, i);
        anonymousClass182.A0a();
        anonymousClass182.A0a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final XBS parseFromJson(C16L c16l) {
        XBS xbs;
        C14360o3.A0B(c16l, 0);
        XBS xbs2 = null;
        if (c16l.A11() == C16R.A0D) {
            c16l.A1J();
            if (c16l.A11() == C16R.A0A) {
                String A1P = c16l.A1P();
                c16l.A1J();
                if (A1P != null) {
                    switch (A1P.hashCode()) {
                        case -1918357458:
                            if (A1P.equals("media_karaoke_caption_sticker")) {
                                xbs = (C66659URx) C16V.A01(c16l, C70749WgO.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -1735070316:
                            if (A1P.equals("media_countdown_sticker")) {
                                xbs = (US2) C16V.A01(c16l, WgG.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -1663998810:
                            if (A1P.equals("media_text_sticker")) {
                                xbs = (US5) C16V.A01(c16l, C70768Wgh.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -1556414034:
                            if (A1P.equals("media_location_sticker")) {
                                xbs = (C66648URm) C16V.A01(c16l, C70752WgR.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -1356145441:
                            if (A1P.equals("media_question_sticker")) {
                                xbs = (US1) C16V.A01(c16l, C70761Wga.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -1292394314:
                            if (A1P.equals("media_internal_sticker")) {
                                xbs = (C66651URp) C16V.A01(c16l, C70748WgM.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -1181643135:
                            if (A1P.equals("ig_media_sticker")) {
                                xbs = (US6) C16V.A01(c16l, C70740WgC.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -242175373:
                            if (A1P.equals("media_link_sticker")) {
                                xbs = (C66660URy) C16V.A01(c16l, C70750WgP.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -195726559:
                            if (A1P.equals("media_date_time_sticker")) {
                                xbs = (C66647URl) C16V.A01(c16l, C70743WgH.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -104826055:
                            if (A1P.equals("media_igtv_share_sticker")) {
                                xbs = (C66656URu) C16V.A01(c16l, C70747WgL.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -57125436:
                            if (A1P.equals("media_visual_comment_reply_sticker")) {
                                xbs = (US0) C16V.A01(c16l, C70769Wgi.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case -44787250:
                            if (A1P.equals("media_quiz_sticker")) {
                                xbs = (US3) C16V.A01(c16l, C70762Wgb.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 65464871:
                            if (A1P.equals("media_static_sticker")) {
                                xbs = (US8) C16V.A01(c16l, C70766Wgf.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 87605407:
                            if (A1P.equals("media_poll_v2_sticker")) {
                                xbs = (C66658URw) C16V.A01(c16l, C70758WgX.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 569531759:
                            if (A1P.equals("media_hashtag_sticker")) {
                                xbs = (C66650URo) C16V.A01(c16l, C70746WgK.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 579256717:
                            if (A1P.equals("media_mention_sticker")) {
                                xbs = (C66654URs) C16V.A01(c16l, C70755WgU.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 653008301:
                            if (A1P.equals("media_lyrics_sticker")) {
                                xbs = (C66653URr) C16V.A01(c16l, C70753WgS.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 698858472:
                            if (A1P.equals("media_bitmap_sticker")) {
                                xbs = (C66655URt) C16V.A01(c16l, C70742WgF.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 962921784:
                            if (A1P.equals("media_poll_sticker")) {
                                xbs = (C66657URv) C16V.A01(c16l, C70757WgW.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 1301426933:
                            if (A1P.equals("media_gallery_sticker")) {
                                xbs = (C66649URn) C16V.A01(c16l, C70744WgI.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 1575842202:
                            if (A1P.equals("media_slider_sticker")) {
                                xbs = (C66661URz) C16V.A01(c16l, C70764Wgd.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 1632313117:
                            if (A1P.equals("media_prompt_sticker")) {
                                xbs = (US7) C16V.A01(c16l, C70760WgZ.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 1737086128:
                            if (A1P.equals("media_join_chat_sticker")) {
                                xbs = (US4) C16V.A01(c16l, WgN.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                        case 2016406553:
                            if (A1P.equals("media_music_overlay_sticker")) {
                                xbs = (C66652URq) C16V.A01(c16l, C70756WgV.A00);
                                xbs2 = xbs;
                                break;
                            }
                            break;
                    }
                    c16l.A1J();
                    return xbs2;
                }
                c16l.A0z();
                c16l.A1J();
                return xbs2;
            }
        }
        c16l.A0z();
        return null;
    }

    public static void A00(UQL uql, AnonymousClass182 anonymousClass182) {
        if (uql != null) {
            anonymousClass182.A0r("timed_info");
            anonymousClass182.A0d();
            anonymousClass182.A0Q("start_time_ms", uql.A01);
            anonymousClass182.A0Q("end_time_ms", uql.A00);
            String str = uql.A04;
            if (str != null) {
                anonymousClass182.A0S("tts_voice_id", str);
            }
            String str2 = uql.A05;
            if (str2 != null) {
                anonymousClass182.A0S("tts_voice_name", str2);
            }
            String str3 = uql.A02;
            if (str3 != null) {
                anonymousClass182.A0S("tts_sfx", str3);
            }
            String str4 = uql.A03;
            if (str4 != null) {
                anonymousClass182.A0S("tts_shortwave_id", str4);
            }
            anonymousClass182.A0a();
        }
    }

    public static void A01(AnonymousClass182 anonymousClass182, C66630UPs c66630UPs) {
        if (c66630UPs != null) {
            anonymousClass182.A0r("drawable_config");
            VXC.A00(anonymousClass182, c66630UPs);
        }
    }

    public static void A02(AnonymousClass182 anonymousClass182, C66629UPr c66629UPr) {
        if (c66629UPr != null) {
            anonymousClass182.A0r("drawable_transform");
            anonymousClass182.A0d();
            anonymousClass182.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c66629UPr.A08);
            anonymousClass182.A0S("uuid", c66629UPr.A0C);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.WIDTH, c66629UPr.A0A);
            anonymousClass182.A0Q(IgReactMediaPickerNativeModule.HEIGHT, c66629UPr.A07);
            anonymousClass182.A0Q("layer", c66629UPr.A09);
            anonymousClass182.A0Q("z", c66629UPr.A0B);
            anonymousClass182.A0P("pivot_x", c66629UPr.A03);
            anonymousClass182.A0P("pivot_y", c66629UPr.A04);
            anonymousClass182.A0P("offset_x", c66629UPr.A01);
            anonymousClass182.A0P("offset_y", c66629UPr.A02);
            anonymousClass182.A0P("rotation", c66629UPr.A05);
            anonymousClass182.A0P("scale", c66629UPr.A06);
            anonymousClass182.A0P("bouncing_scale", c66629UPr.A00);
            anonymousClass182.A0T(AbstractC111324zv.A00(1057), c66629UPr.A0D);
            anonymousClass182.A0a();
        }
    }
}
