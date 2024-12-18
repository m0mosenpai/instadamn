package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.music.common.model.MusicDataSource;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

/* renamed from: X.8yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203258yi {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.8yh] */
    public static C203248yh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("serialized_creative_edits".equals(A0q)) {
                    obj.A02 = AbstractC203268yj.parseFromJson(c16l);
                } else if ("story_photo_edits".equals(A0q)) {
                    obj.A00 = AbstractC203408yx.parseFromJson(c16l);
                } else if ("story_video_edits".equals(A0q)) {
                    obj.A01 = C9IW.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C203248yh c203248yh) {
        anonymousClass182.A0d();
        if (c203248yh.A02 != null) {
            anonymousClass182.A0r("serialized_creative_edits");
            C203278yk c203278yk = c203248yh.A02;
            anonymousClass182.A0d();
            if (c203278yk.A04 != null) {
                anonymousClass182.A0r("serialized_overlay_edits");
                C203298ym c203298ym = c203278yk.A04;
                anonymousClass182.A0d();
                if (c203298ym.A03 != null) {
                    C16V.A03(anonymousClass182, "overlay_drawable_data");
                    for (C203318yo c203318yo : c203298ym.A03) {
                        if (c203318yo != null) {
                            AbstractC203308yn.A00(anonymousClass182, c203318yo);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                if (c203298ym.A02 != null) {
                    anonymousClass182.A0r("overlay_asset_data");
                    C5QC.A01(c203298ym.A02.A00, anonymousClass182);
                }
                if (c203298ym.A01 != null) {
                    anonymousClass182.A0r("karaoke_sticker_edits");
                    C198938qt c198938qt = c203298ym.A01;
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("sticker_index", c198938qt.A02);
                    anonymousClass182.A0Q("sticker_color_index", c198938qt.A01);
                    anonymousClass182.A0Q("sticker_color_id", c198938qt.A00);
                    C6S5 c6s5 = c198938qt.A03;
                    if (c6s5 != null) {
                        anonymousClass182.A0S("sticker_emphasis_status", c6s5.A00);
                    }
                    if (c198938qt.A07 != null) {
                        C16V.A03(anonymousClass182, "edit_recycler_view_models");
                        for (C211859aC c211859aC : c198938qt.A07) {
                            if (c211859aC != null) {
                                anonymousClass182.A0d();
                                anonymousClass182.A0Q("index", c211859aC.A00);
                                String str = c211859aC.A01;
                                if (str != null) {
                                    anonymousClass182.A0S("hint_word", str);
                                }
                                String str2 = c211859aC.A02;
                                if (str2 != null) {
                                    anonymousClass182.A0S("word", str2);
                                }
                                anonymousClass182.A0T("is_editable", c211859aC.A03);
                                anonymousClass182.A0T("is_visible", c211859aC.A04);
                                anonymousClass182.A0a();
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    Integer num = c198938qt.A04;
                    if (num != null) {
                        anonymousClass182.A0Q("edit_recycler_view_center_index", num.intValue());
                    }
                    if (c198938qt.A08 != null) {
                        C16V.A03(anonymousClass182, "tokens");
                        for (US9 us9 : c198938qt.A08) {
                            if (us9 != null) {
                                AbstractC69932Vxx.A00(anonymousClass182, us9);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    Integer num2 = c198938qt.A05;
                    if (num2 != null) {
                        anonymousClass182.A0Q("editing_token_index", num2.intValue());
                    }
                    String str3 = c198938qt.A06;
                    if (str3 != null) {
                        anonymousClass182.A0S("original_file_path", str3);
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0Q("drawables_max_z", c203298ym.A00);
                anonymousClass182.A0a();
            }
            if (c203278yk.A03 != null) {
                anonymousClass182.A0r("serialized_drawing_edits");
                C203358ys c203358ys = c203278yk.A03;
                anonymousClass182.A0d();
                if (c203358ys.A00 != null) {
                    C16V.A03(anonymousClass182, "brush_strokes");
                    for (C72792XnD c72792XnD : c203358ys.A00) {
                        if (c72792XnD != null) {
                            AbstractC69987Vz6.A00(anonymousClass182, c72792XnD);
                        }
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0a();
            }
            if (c203278yk.A05 != null) {
                anonymousClass182.A0r("text_mode_metadata");
                AbstractC23022ADe.A00(anonymousClass182, c203278yk.A05);
            }
            if (c203278yk.A06 != null) {
                anonymousClass182.A0r("story_caption_meta_data");
                C5QM.A00(anonymousClass182, c203278yk.A06);
            }
            if (c203278yk.A00 != null) {
                anonymousClass182.A0r("reel_link_edits");
                C9BH c9bh = c203278yk.A00;
                anonymousClass182.A0d();
                if (c9bh.A00 != null) {
                    anonymousClass182.A0r("reel_more_options_model");
                    ReelMoreOptionsModel reelMoreOptionsModel = (ReelMoreOptionsModel) c9bh.A00;
                    anonymousClass182.A0d();
                    EnumC183928Dt enumC183928Dt = reelMoreOptionsModel.A09;
                    if (enumC183928Dt != null) {
                        anonymousClass182.A0Q("more_option_type", enumC183928Dt.A00);
                    }
                    String str4 = reelMoreOptionsModel.A0C;
                    if (str4 != null) {
                        anonymousClass182.A0S("web_link_url", str4);
                    }
                    String str5 = reelMoreOptionsModel.A0B;
                    if (str5 != null) {
                        anonymousClass182.A0S("igtv_media_id", str5);
                    }
                    String str6 = reelMoreOptionsModel.A0A;
                    if (str6 != null) {
                        anonymousClass182.A0S("ar_effect_id", str6);
                    }
                    if (reelMoreOptionsModel.A06 != null) {
                        anonymousClass182.A0r("profile_shop_link");
                        IRI.A00(anonymousClass182, reelMoreOptionsModel.A06);
                    }
                    if (reelMoreOptionsModel.A03 != null) {
                        anonymousClass182.A0r("instagram_shop_link");
                        InstagramShopLink instagramShopLink = reelMoreOptionsModel.A03;
                        anonymousClass182.A0d();
                        anonymousClass182.A0T("is_enabled", instagramShopLink.A00);
                        anonymousClass182.A0a();
                    }
                    if (reelMoreOptionsModel.A04 != null) {
                        anonymousClass182.A0r("incentive_product_collection_link");
                        IRF.A00(anonymousClass182, reelMoreOptionsModel.A04);
                    }
                    if (reelMoreOptionsModel.A05 != null) {
                        anonymousClass182.A0r("product_collection_link");
                        IRF.A00(anonymousClass182, reelMoreOptionsModel.A05);
                    }
                    if (reelMoreOptionsModel.A08 != null) {
                        anonymousClass182.A0r("product_link");
                        ReelProductLink reelProductLink = reelMoreOptionsModel.A08;
                        anonymousClass182.A0d();
                        ProductDetailsProductItemDict productDetailsProductItemDict = reelProductLink.A00;
                        if (productDetailsProductItemDict != null) {
                            anonymousClass182.A0r("product");
                            AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                        }
                        anonymousClass182.A0a();
                    }
                    if (reelMoreOptionsModel.A07 != null) {
                        anonymousClass182.A0r("products_link");
                        AE8.A00(anonymousClass182, reelMoreOptionsModel.A07);
                    }
                    if (reelMoreOptionsModel.A00 != null) {
                        anonymousClass182.A0r("media_gating_info");
                        AbstractC41243INj.A00(anonymousClass182, reelMoreOptionsModel.A00);
                    }
                    if (reelMoreOptionsModel.A0D != null) {
                        C16V.A03(anonymousClass182, "branded_content_tags");
                        for (BrandedContentTag brandedContentTag : reelMoreOptionsModel.A0D) {
                            if (brandedContentTag != null) {
                                AbstractC54880OPb.A00(anonymousClass182, brandedContentTag);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    if (reelMoreOptionsModel.A01 != null) {
                        anonymousClass182.A0r("branded_content_project_metadata");
                        ONL.A00(anonymousClass182, reelMoreOptionsModel.A01);
                    }
                    anonymousClass182.A0T("is_paid_partnership_label", reelMoreOptionsModel.A0H);
                    anonymousClass182.A0T("create_pa_boost_post_access_token", reelMoreOptionsModel.A0E);
                    anonymousClass182.A0T("is_ads_mode", reelMoreOptionsModel.A0G);
                    anonymousClass182.A0T("has_ads_mode_changed", reelMoreOptionsModel.A0F);
                    MediaGenAIDetectionMethod mediaGenAIDetectionMethod = reelMoreOptionsModel.A02;
                    if (mediaGenAIDetectionMethod != null) {
                        anonymousClass182.A0S("gen_ai_detection_method", mediaGenAIDetectionMethod.A00);
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            if (c203278yk.A02 != null) {
                anonymousClass182.A0r("music_overlay_edits");
                C198948qu c198948qu = c203278yk.A02;
                anonymousClass182.A0d();
                String str7 = c198948qu.A03;
                if (str7 != null) {
                    anonymousClass182.A0S("music_sticker_tag", str7);
                }
                if (c198948qu.A02 != null) {
                    anonymousClass182.A0r("music_data_source");
                    MusicDataSource musicDataSource = c198948qu.A02;
                    anonymousClass182.A0d();
                    String str8 = musicDataSource.A05;
                    if (str8 != null) {
                        anonymousClass182.A0S("progressive_download_url", str8);
                    }
                    String str9 = musicDataSource.A04;
                    if (str9 != null) {
                        anonymousClass182.A0S(AbstractC43591JPw.A00(75), str9);
                    }
                    android.net.Uri uri = musicDataSource.A00;
                    if (uri != null) {
                        anonymousClass182.A0S("downloaded_track_uri", uri.toString());
                    }
                    String str10 = musicDataSource.A03;
                    if (str10 != null) {
                        anonymousClass182.A0S("asset_id", str10);
                    }
                    String str11 = musicDataSource.A02;
                    if (str11 != null) {
                        anonymousClass182.A0S("artist_id", str11);
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0Q("start_time_ms", c198948qu.A01);
                anonymousClass182.A0Q("duration_ms", c198948qu.A00);
                anonymousClass182.A0a();
            }
            if (c203278yk.A01 != null) {
                anonymousClass182.A0r("immersive_photo_edits");
                anonymousClass182.A0d();
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        if (c203248yh.A00 != null) {
            anonymousClass182.A0r("story_photo_edits");
            C198998qz c198998qz = c203248yh.A00;
            anonymousClass182.A0d();
            C198988qy c198988qy = c198998qz.A04;
            if (c198988qy != null) {
                C8z3.A00(anonymousClass182, c198988qy);
            }
            anonymousClass182.A0Q("filter_id", c198998qz.A00);
            if (c198998qz.A01 != null) {
                anonymousClass182.A0r("post_capture_ar_effect");
                AbstractC120315cU.A00(anonymousClass182, c198998qz.A01);
            }
            if (c198998qz.A05 != null) {
                anonymousClass182.A0r("visual_info");
                AbstractC203438z0.A00(anonymousClass182, c198998qz.A05);
            }
            if (c198998qz.A09 != null) {
                C16V.A03(anonymousClass182, "transform_matrix_configs");
                for (TransformMatrixConfig transformMatrixConfig : c198998qz.A09) {
                    if (transformMatrixConfig != null) {
                        C55Y.A00(anonymousClass182, transformMatrixConfig);
                    }
                }
                anonymousClass182.A0Z();
            }
            if (c198998qz.A03 != null) {
                anonymousClass182.A0r("transform_matrix_config");
                C55Y.A00(anonymousClass182, c198998qz.A03);
            }
            if (c198998qz.A02 != null) {
                anonymousClass182.A0r("crop_info");
                AbstractC203458z2.A00(anonymousClass182, c198998qz.A02);
            }
            anonymousClass182.A0T("should_render_drawables_in_unified_layer", c198998qz.A0A);
            if (c198998qz.A08 != null) {
                C16V.A03(anonymousClass182, "ai_filter_colors");
                for (Number number : c198998qz.A08) {
                    if (number != null) {
                        anonymousClass182.A0h(number.intValue());
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        if (c203248yh.A01 != null) {
            anonymousClass182.A0r("story_video_edits");
            C9IW.A00(anonymousClass182, c203248yh.A01);
        }
        anonymousClass182.A0a();
    }
}
