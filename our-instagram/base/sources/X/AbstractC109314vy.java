package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.StoryTemplateAssetDict;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict;
import com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDictImpl;
import com.instagram.api.schemas.StoryTemplateCaptionDict;
import com.instagram.api.schemas.StoryTemplateDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableGalleryStickerShapes;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateFillableMusicStickerDictImpl;
import com.instagram.api.schemas.StoryTemplateFillableStickersDict;
import com.instagram.api.schemas.StoryTemplateFillableStickersDictImpl;
import com.instagram.api.schemas.StoryTemplateGiphyStickerDict;
import com.instagram.api.schemas.StoryTemplateGiphyStickerImageDict;
import com.instagram.api.schemas.StoryTemplateMusicAssetInfoDict;
import com.instagram.api.schemas.StoryTemplateMusicStickerDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDict;
import com.instagram.api.schemas.StoryTemplateReshareMediaDictImpl;
import com.instagram.api.schemas.StoryTemplateStaticOverlayDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC109314vy {
    public static StoryTemplateDict parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            StoryTemplateFillableStickersDictImpl storyTemplateFillableStickersDictImpl = null;
            Boolean bool = null;
            Boolean bool2 = null;
            StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = null;
            StoryTemplateReshareMediaDictImpl storyTemplateReshareMediaDictImpl = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            StoryTemplateAssetDict storyTemplateAssetDict = null;
            ArrayList arrayList4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("fillable_stickers".equals(A0q)) {
                    storyTemplateFillableStickersDictImpl = AbstractC109334w0.parseFromJson(c16l);
                } else if ("is_eligible_for_reels_participation".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("is_from_discovery_surface".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("music_sticker".equals(A0q)) {
                    storyTemplateMusicStickerDict = AbstractC109324vz.parseFromJson(c16l);
                } else if ("reshare_media".equals(A0q)) {
                    storyTemplateReshareMediaDictImpl = AbstractC40336Hug.parseFromJson(c16l);
                } else if ("story_avatar_overlays".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            StoryTemplateAvatarStickerOverlayDictImpl parseFromJson = AbstractC40330Hua.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("story_captions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            StoryTemplateCaptionDict parseFromJson2 = AbstractC201968wT.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("story_static_overlays".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            StoryTemplateStaticOverlayDict parseFromJson3 = AbstractC201978wW.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("template_asset".equals(A0q)) {
                    storyTemplateAssetDict = AbstractC115275Iy.parseFromJson(c16l);
                } else if ("template_sticker_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList4.add(A1P);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                }
                c16l.A0z();
            }
            return new StoryTemplateDict(storyTemplateAssetDict, storyTemplateFillableStickersDictImpl, storyTemplateMusicStickerDict, storyTemplateReshareMediaDictImpl, bool, bool2, arrayList, arrayList2, arrayList3, arrayList4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, StoryTemplateDict storyTemplateDict) {
        anonymousClass182.A0d();
        StoryTemplateFillableStickersDict storyTemplateFillableStickersDict = storyTemplateDict.A01;
        if (storyTemplateFillableStickersDict != null) {
            anonymousClass182.A0r("fillable_stickers");
            StoryTemplateFillableStickersDictImpl F25 = storyTemplateFillableStickersDict.F25();
            anonymousClass182.A0d();
            List<StoryTemplateFillableGalleryStickerDict> list = F25.A01;
            if (list != null) {
                C16V.A03(anonymousClass182, "fillable_gallery_stickers");
                for (StoryTemplateFillableGalleryStickerDict storyTemplateFillableGalleryStickerDict : list) {
                    if (storyTemplateFillableGalleryStickerDict != null) {
                        StoryTemplateFillableGalleryStickerDictImpl F23 = storyTemplateFillableGalleryStickerDict.F23();
                        anonymousClass182.A0d();
                        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes = F23.A00;
                        if (storyTemplateFillableGalleryStickerShapes != null) {
                            anonymousClass182.A0S(AbstractC111324zv.A00(958), storyTemplateFillableGalleryStickerShapes.A00);
                        }
                        Float f = F23.A01;
                        if (f != null) {
                            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f.floatValue());
                        }
                        Float f2 = F23.A02;
                        if (f2 != null) {
                            anonymousClass182.A0P("rotation", f2.floatValue());
                        }
                        Float f3 = F23.A03;
                        if (f3 != null) {
                            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f3.floatValue());
                        }
                        Float f4 = F23.A04;
                        if (f4 != null) {
                            anonymousClass182.A0P("x", f4.floatValue());
                        }
                        Float f5 = F23.A05;
                        if (f5 != null) {
                            anonymousClass182.A0P("y", f5.floatValue());
                        }
                        Integer num = F23.A06;
                        if (num != null) {
                            anonymousClass182.A0Q("z_index", num.intValue());
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            StoryTemplateFillableMusicStickerDict storyTemplateFillableMusicStickerDict = F25.A00;
            if (storyTemplateFillableMusicStickerDict != null) {
                anonymousClass182.A0r("fillable_music_sticker");
                StoryTemplateFillableMusicStickerDictImpl F24 = storyTemplateFillableMusicStickerDict.F24();
                anonymousClass182.A0d();
                String str = F24.A06;
                if (str != null) {
                    anonymousClass182.A0S("display_type", str);
                }
                Float f6 = F24.A00;
                if (f6 != null) {
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f6.floatValue());
                }
                Float f7 = F24.A01;
                if (f7 != null) {
                    anonymousClass182.A0P("rotation", f7.floatValue());
                }
                Float f8 = F24.A02;
                if (f8 != null) {
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f8.floatValue());
                }
                Float f9 = F24.A03;
                if (f9 != null) {
                    anonymousClass182.A0P("x", f9.floatValue());
                }
                Float f10 = F24.A04;
                if (f10 != null) {
                    anonymousClass182.A0P("y", f10.floatValue());
                }
                Integer num2 = F24.A05;
                if (num2 != null) {
                    anonymousClass182.A0Q("z_index", num2.intValue());
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        Boolean bool = storyTemplateDict.A04;
        if (bool != null) {
            anonymousClass182.A0T("is_eligible_for_reels_participation", bool.booleanValue());
        }
        Boolean bool2 = storyTemplateDict.A05;
        if (bool2 != null) {
            anonymousClass182.A0T("is_from_discovery_surface", bool2.booleanValue());
        }
        StoryTemplateMusicStickerDict storyTemplateMusicStickerDict = storyTemplateDict.A02;
        if (storyTemplateMusicStickerDict != null) {
            anonymousClass182.A0r("music_sticker");
            anonymousClass182.A0d();
            String str2 = storyTemplateMusicStickerDict.A0B;
            if (str2 != null) {
                anonymousClass182.A0S("attribution", str2);
            }
            String str3 = storyTemplateMusicStickerDict.A0C;
            if (str3 != null) {
                anonymousClass182.A0S("audio_asset_id", str3);
            }
            anonymousClass182.A0Q("audio_asset_start_time_in_ms", storyTemplateMusicStickerDict.A05);
            String str4 = storyTemplateMusicStickerDict.A0D;
            if (str4 != null) {
                anonymousClass182.A0S("audio_cluster_id", str4);
            }
            String str5 = storyTemplateMusicStickerDict.A0E;
            if (str5 != null) {
                anonymousClass182.A0S("color", str5);
            }
            anonymousClass182.A0Q("derived_content_start_time_in_ms", storyTemplateMusicStickerDict.A06);
            String str6 = storyTemplateMusicStickerDict.A0F;
            if (str6 != null) {
                anonymousClass182.A0S("display_type", str6);
            }
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateMusicStickerDict.A00);
            Lyrics lyrics = storyTemplateMusicStickerDict.A09;
            if (lyrics != null) {
                anonymousClass182.A0r("lyrics");
                AbstractC84393pY.A00(anonymousClass182, lyrics);
            }
            StoryTemplateMusicAssetInfoDict storyTemplateMusicAssetInfoDict = storyTemplateMusicStickerDict.A0A;
            if (storyTemplateMusicAssetInfoDict != null) {
                anonymousClass182.A0r("music_asset_info");
                anonymousClass182.A0d();
                MusicCanonicalType musicCanonicalType = storyTemplateMusicAssetInfoDict.A00;
                if (musicCanonicalType != null) {
                    anonymousClass182.A0S("audio_type", musicCanonicalType.A00);
                }
                String str7 = storyTemplateMusicAssetInfoDict.A04;
                if (str7 != null) {
                    anonymousClass182.A0S("cover_artwork_thumbnail_uri", str7);
                }
                String str8 = storyTemplateMusicAssetInfoDict.A05;
                if (str8 != null) {
                    anonymousClass182.A0S("cover_artwork_uri", str8);
                }
                Integer num3 = storyTemplateMusicAssetInfoDict.A03;
                if (num3 != null) {
                    anonymousClass182.A0Q("duration_in_ms", num3.intValue());
                }
                Boolean bool3 = storyTemplateMusicAssetInfoDict.A01;
                if (bool3 != null) {
                    anonymousClass182.A0T("has_lyrics", bool3.booleanValue());
                }
                Boolean bool4 = storyTemplateMusicAssetInfoDict.A02;
                if (bool4 != null) {
                    anonymousClass182.A0T("is_explicit", bool4.booleanValue());
                }
                String str9 = storyTemplateMusicAssetInfoDict.A06;
                if (str9 != null) {
                    anonymousClass182.A0S("progressive_download_url", str9);
                }
                String str10 = storyTemplateMusicAssetInfoDict.A07;
                if (str10 != null) {
                    anonymousClass182.A0S(DialogModule.KEY_TITLE, str10);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0Q("overlap_duration_in_ms", storyTemplateMusicStickerDict.A07);
            anonymousClass182.A0P("rotation", storyTemplateMusicStickerDict.A01);
            anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, storyTemplateMusicStickerDict.A02);
            anonymousClass182.A0P("x", storyTemplateMusicStickerDict.A03);
            anonymousClass182.A0P("y", storyTemplateMusicStickerDict.A04);
            anonymousClass182.A0Q("z_index", storyTemplateMusicStickerDict.A08);
            anonymousClass182.A0a();
        }
        StoryTemplateReshareMediaDict storyTemplateReshareMediaDict = storyTemplateDict.A03;
        if (storyTemplateReshareMediaDict != null) {
            anonymousClass182.A0r("reshare_media");
            StoryTemplateReshareMediaDictImpl F2A = storyTemplateReshareMediaDict.F2A();
            anonymousClass182.A0d();
            Integer num4 = F2A.A00;
            if (num4 != null) {
                anonymousClass182.A0Q("carousel_index", num4.intValue());
            }
            String str11 = F2A.A01;
            if (str11 != null) {
                anonymousClass182.A0S("media_id", str11);
            }
            String str12 = F2A.A02;
            if (str12 != null) {
                anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str12);
            }
            anonymousClass182.A0a();
        }
        List<StoryTemplateAvatarStickerOverlayDict> list2 = storyTemplateDict.A06;
        if (list2 != null) {
            C16V.A03(anonymousClass182, "story_avatar_overlays");
            for (StoryTemplateAvatarStickerOverlayDict storyTemplateAvatarStickerOverlayDict : list2) {
                if (storyTemplateAvatarStickerOverlayDict != null) {
                    StoryTemplateAvatarStickerOverlayDictImpl F20 = storyTemplateAvatarStickerOverlayDict.F20();
                    anonymousClass182.A0d();
                    String str13 = F20.A06;
                    if (str13 != null) {
                        anonymousClass182.A0S("expression_id", str13);
                    }
                    Float f11 = F20.A00;
                    if (f11 != null) {
                        anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, f11.floatValue());
                    }
                    String str14 = F20.A07;
                    if (str14 != null) {
                        anonymousClass182.A0S("instruction_key_id", str14);
                    }
                    String str15 = F20.A08;
                    if (str15 != null) {
                        anonymousClass182.A0S("media_type", str15);
                    }
                    Float f12 = F20.A01;
                    if (f12 != null) {
                        anonymousClass182.A0P("rotation", f12.floatValue());
                    }
                    Float f13 = F20.A02;
                    if (f13 != null) {
                        anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, f13.floatValue());
                    }
                    Float f14 = F20.A03;
                    if (f14 != null) {
                        anonymousClass182.A0P("x", f14.floatValue());
                    }
                    Float f15 = F20.A04;
                    if (f15 != null) {
                        anonymousClass182.A0P("y", f15.floatValue());
                    }
                    Integer num5 = F20.A05;
                    if (num5 != null) {
                        anonymousClass182.A0Q("z_index", num5.intValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List<StoryTemplateCaptionDict> list3 = storyTemplateDict.A07;
        if (list3 != null) {
            C16V.A03(anonymousClass182, "story_captions");
            for (StoryTemplateCaptionDict storyTemplateCaptionDict : list3) {
                if (storyTemplateCaptionDict != null) {
                    anonymousClass182.A0d();
                    String str16 = storyTemplateCaptionDict.A09;
                    if (str16 != null) {
                        anonymousClass182.A0S("alignment", str16);
                    }
                    String str17 = storyTemplateCaptionDict.A0A;
                    if (str17 != null) {
                        anonymousClass182.A0S("animation", str17);
                    }
                    String str18 = storyTemplateCaptionDict.A0B;
                    if (str18 != null) {
                        anonymousClass182.A0S("colors", str18);
                    }
                    String str19 = storyTemplateCaptionDict.A0C;
                    if (str19 != null) {
                        anonymousClass182.A0S("effects", str19);
                    }
                    anonymousClass182.A0P("font_size", storyTemplateCaptionDict.A00);
                    ClipsTextFormatType clipsTextFormatType = storyTemplateCaptionDict.A08;
                    if (clipsTextFormatType != null) {
                        anonymousClass182.A0S("format_type", clipsTextFormatType.A00);
                    }
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateCaptionDict.A01);
                    anonymousClass182.A0P("rotation", storyTemplateCaptionDict.A02);
                    anonymousClass182.A0P("scale", storyTemplateCaptionDict.A03);
                    String str20 = storyTemplateCaptionDict.A0D;
                    if (str20 != null) {
                        anonymousClass182.A0S(AbstractC111324zv.A00(1252), str20);
                    }
                    String str21 = storyTemplateCaptionDict.A0E;
                    if (str21 != null) {
                        anonymousClass182.A0S("text", str21);
                    }
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, storyTemplateCaptionDict.A04);
                    anonymousClass182.A0P("x", storyTemplateCaptionDict.A05);
                    anonymousClass182.A0P("y", storyTemplateCaptionDict.A06);
                    anonymousClass182.A0Q("z_index", storyTemplateCaptionDict.A07);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List<StoryTemplateStaticOverlayDict> list4 = storyTemplateDict.A08;
        if (list4 != null) {
            C16V.A03(anonymousClass182, "story_static_overlays");
            for (StoryTemplateStaticOverlayDict storyTemplateStaticOverlayDict : list4) {
                if (storyTemplateStaticOverlayDict != null) {
                    anonymousClass182.A0d();
                    StoryTemplateGiphyStickerDict storyTemplateGiphyStickerDict = storyTemplateStaticOverlayDict.A06;
                    if (storyTemplateGiphyStickerDict != null) {
                        anonymousClass182.A0r(AbstractC111324zv.A00(4512));
                        anonymousClass182.A0d();
                        String str22 = storyTemplateGiphyStickerDict.A01;
                        if (str22 != null) {
                            anonymousClass182.A0S("gif_id", str22);
                        }
                        StoryTemplateGiphyStickerImageDict storyTemplateGiphyStickerImageDict = storyTemplateGiphyStickerDict.A00;
                        if (storyTemplateGiphyStickerImageDict != null) {
                            anonymousClass182.A0r("image");
                            anonymousClass182.A0d();
                            String str23 = storyTemplateGiphyStickerImageDict.A00;
                            if (str23 != null) {
                                anonymousClass182.A0S(IgReactMediaPickerNativeModule.HEIGHT, str23);
                            }
                            String str24 = storyTemplateGiphyStickerImageDict.A01;
                            if (str24 != null) {
                                anonymousClass182.A0S("mp4_url", str24);
                            }
                            String str25 = storyTemplateGiphyStickerImageDict.A02;
                            if (str25 != null) {
                                anonymousClass182.A0S("url", str25);
                            }
                            String str26 = storyTemplateGiphyStickerImageDict.A03;
                            if (str26 != null) {
                                anonymousClass182.A0S(IgReactMediaPickerNativeModule.WIDTH, str26);
                            }
                            anonymousClass182.A0a();
                        }
                        String str27 = storyTemplateGiphyStickerDict.A02;
                        if (str27 != null) {
                            anonymousClass182.A0S(DialogModule.KEY_TITLE, str27);
                        }
                        String str28 = storyTemplateGiphyStickerDict.A03;
                        if (str28 != null) {
                            anonymousClass182.A0S(AbstractC50531MSk.A02(42, 8, 43), str28);
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.HEIGHT, storyTemplateStaticOverlayDict.A00);
                    anonymousClass182.A0P("rotation", storyTemplateStaticOverlayDict.A01);
                    String str29 = storyTemplateStaticOverlayDict.A07;
                    if (str29 != null) {
                        anonymousClass182.A0S("sticker_type", str29);
                    }
                    String str30 = storyTemplateStaticOverlayDict.A08;
                    if (str30 != null) {
                        anonymousClass182.A0S("str_id", str30);
                    }
                    anonymousClass182.A0P(IgReactMediaPickerNativeModule.WIDTH, storyTemplateStaticOverlayDict.A02);
                    anonymousClass182.A0P("x", storyTemplateStaticOverlayDict.A03);
                    anonymousClass182.A0P("y", storyTemplateStaticOverlayDict.A04);
                    anonymousClass182.A0Q("z_index", storyTemplateStaticOverlayDict.A05);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        StoryTemplateAssetDict storyTemplateAssetDict = storyTemplateDict.A00;
        if (storyTemplateAssetDict != null) {
            anonymousClass182.A0r("template_asset");
            AbstractC115275Iy.A00(anonymousClass182, storyTemplateAssetDict);
        }
        List<String> list5 = storyTemplateDict.A09;
        if (list5 != null) {
            C16V.A03(anonymousClass182, "template_sticker_ids");
            for (String str31 : list5) {
                if (str31 != null) {
                    anonymousClass182.A0u(str31);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
