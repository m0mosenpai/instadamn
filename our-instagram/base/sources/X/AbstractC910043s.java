package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.43s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC910043s {
    public static C910143t parseFromJson(C16L c16l) {
        String A1P;
        EnumC910343v enumC910343v;
        String A1P2;
        String A1P3;
        String A1P4;
        String A1P5;
        String A1P6;
        String A1P7;
        EnumC910243u enumC910243u;
        C14360o3.A0B(c16l, 0);
        try {
            C910143t c910143t = new C910143t();
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
                String str4 = null;
                ArrayList arrayList = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                ArrayList arrayList2 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                ArrayList arrayList3 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                ArrayList arrayList4 = null;
                String str25 = null;
                String str26 = null;
                ArrayList arrayList5 = null;
                String str27 = null;
                String str28 = null;
                ArrayList arrayList6 = null;
                String str29 = null;
                ArrayList arrayList7 = null;
                ArrayList arrayList8 = null;
                ArrayList arrayList9 = null;
                String str30 = null;
                ArrayList arrayList10 = null;
                Long l = null;
                Long l2 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                String str35 = null;
                String str36 = null;
                String str37 = null;
                String str38 = null;
                String str39 = null;
                String str40 = null;
                String str41 = null;
                if ("video_dash_manifest".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c910143t.A0z = str2;
                } else if ("xma_template_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c910143t.A1P = str3;
                } else if ("xma_layout_type".equals(A0q)) {
                    c910143t.A02 = c16l.A1D();
                } else if ("preview_icon_info".equals(A0q)) {
                    c910143t.A0L = AbstractC133195zl.parseFromJson(c16l);
                } else if ("preview_url_info".equals(A0q)) {
                    c910143t.A0X = C17Y.parseFromJson(c16l);
                } else if ("preview_url_mime_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c910143t.A1J = str4;
                } else if ("preview_layout_type".equals(A0q)) {
                    int A1D = c16l.A1D();
                    EnumC910243u[] values = EnumC910243u.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC910243u = values[i];
                            if (enumC910243u.A00 == A1D) {
                                break;
                            }
                            i++;
                        } else {
                            enumC910243u = EnumC910243u.SINGLE;
                            break;
                        }
                    }
                    c910143t.A0Q = enumC910243u;
                } else if ("preview_extra_urls_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ExtendedImageUrl parseFromJson = C17Y.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c910143t.A1g = arrayList;
                } else if ("preview_media_fbid".equals(A0q)) {
                    c910143t.A0K = c16l.A0y();
                } else if ("preview_image_decoration_type".equals(A0q)) {
                    c910143t.A08 = c16l.A1D();
                } else if ("preview_image_fallback_type".equals(A0q)) {
                    c910143t.A09 = c16l.A1D();
                } else if ("header_title_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str5 = c16l.A1P();
                    }
                    c910143t.A13 = str5;
                } else if ("header_subtitle_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str6 = c16l.A1P();
                    }
                    c910143t.A12 = str6;
                } else if ("header_icon_url_info".equals(A0q)) {
                    c910143t.A0U = C17Y.parseFromJson(c16l);
                } else if ("header_icon_url_mime_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str7 = c16l.A1P();
                    }
                    c910143t.A11 = str7;
                } else if ("header_icons_url_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ExtendedImageUrl parseFromJson2 = C17Y.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    }
                    c910143t.A1Y = arrayList2;
                } else if ("header_icons_count".equals(A0q)) {
                    c910143t.A01 = c16l.A1D();
                } else if ("header_icon_url".equals(A0q)) {
                    c910143t.A0V = C17Y.parseFromJson(c16l);
                } else if ("collapsible_id".equals(A0q)) {
                    c910143t.A0o = Long.valueOf(c16l.A0y());
                } else if ("title_icon_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str8 = c16l.A1P();
                    }
                    c910143t.A1R = str8;
                } else if ("title_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str9 = c16l.A1P();
                    }
                    c910143t.A1Q = str9;
                } else if ("caption_body_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str10 = c16l.A1P();
                    }
                    c910143t.A0v = str10;
                } else if ("subtitle_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str11 = c16l.A1P();
                    }
                    c910143t.A1O = str11;
                } else if ("facepile_info".equals(A0q)) {
                    c910143t.A0M = AbstractC46854Knn.parseFromJson(c16l);
                } else if ("title_text_color".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str12 = c16l.A1P();
                    }
                    c910143t.A1S = str12;
                } else if ("max_title_num_of_lines".equals(A0q)) {
                    c910143t.A07 = c16l.A1D();
                } else if ("max_subtitle_num_of_lines".equals(A0q)) {
                    c910143t.A06 = c16l.A1D();
                } else if ("group_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str13 = c16l.A1P();
                    }
                    c910143t.A10 = str13;
                } else if ("target_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str14 = c16l.A1P();
                    }
                    c910143t.A0w = str14;
                } else if ("attachment_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str15 = c16l.A1P();
                    }
                    c910143t.A0u = str15;
                } else if ("default_cta_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str16 = c16l.A1P();
                    }
                    c910143t.A0x = str16;
                } else if ("default_cta_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str17 = c16l.A1P();
                    }
                    c910143t.A0y = str17;
                } else if ("cta_buttons".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C9CP parseFromJson3 = C4G0.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    }
                    c910143t.A1X = arrayList3;
                } else if ("ig_template_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str18 = c16l.A1P();
                    }
                    c910143t.A14 = str18;
                } else if ("playable_url_info".equals(A0q)) {
                    c910143t.A0Z = C54X.parseFromJson(c16l);
                } else if ("accessory_preview_url_info".equals(A0q)) {
                    c910143t.A0S = C17Y.parseFromJson(c16l);
                } else if ("accessory_playable_url_info".equals(A0q)) {
                    c910143t.A0R = C17Y.parseFromJson(c16l);
                } else if ("attachment_index".equals(A0q)) {
                    c910143t.A00 = c16l.A1D();
                } else if ("accessibility_summary_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str19 = c16l.A1P();
                    }
                    c910143t.A0t = str19;
                } else if ("accessibility_summary_hint".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str20 = c16l.A1P();
                    }
                    c910143t.A0s = str20;
                } else if ("is_sharable".equals(A0q)) {
                    c910143t.A1j = c16l.A0d();
                } else if ("list_items_id".equals(A0q)) {
                    c910143t.A0D = c16l.A0y();
                } else if ("list_items_description_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str21 = c16l.A1P();
                    }
                    c910143t.A19 = str21;
                } else if ("list_items_secondary_description_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str22 = c16l.A1P();
                    }
                    c910143t.A1A = str22;
                } else if ("list_item_id_1".equals(A0q)) {
                    c910143t.A0E = c16l.A0y();
                } else if ("list_item_title_text_1".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str23 = c16l.A1P();
                    }
                    c910143t.A1B = str23;
                } else if ("list_item_progress_bar_filled_percentage_1".equals(A0q)) {
                    c910143t.A03 = c16l.A1D();
                } else if ("verified_type".equals(A0q)) {
                    c910143t.A0B = c16l.A1D();
                } else if ("list_item_total_votes_count_1".equals(A0q)) {
                    c910143t.A0H = c16l.A0y();
                } else if ("list_item_accessibility_text_1".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str24 = c16l.A1P();
                    }
                    c910143t.A15 = str24;
                } else if ("list_item_voter_urls_1".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P7 = c16l.A1P()) != null) {
                                arrayList4.add(A1P7);
                            }
                        }
                    }
                    c910143t.A1Z = arrayList4;
                } else if ("list_item_id_2".equals(A0q)) {
                    c910143t.A0F = c16l.A0y();
                } else if ("list_item_title_text_2".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str25 = c16l.A1P();
                    }
                    c910143t.A1C = str25;
                } else if ("list_item_progress_bar_filled_percentage_2".equals(A0q)) {
                    c910143t.A04 = c16l.A1D();
                } else if ("list_item_total_votes_count_2".equals(A0q)) {
                    c910143t.A0I = c16l.A0y();
                } else if ("list_item_accessibility_text_2".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str26 = c16l.A1P();
                    }
                    c910143t.A16 = str26;
                } else if ("list_item_voter_urls_2".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P6 = c16l.A1P()) != null) {
                                arrayList5.add(A1P6);
                            }
                        }
                    }
                    c910143t.A1a = arrayList5;
                } else if ("list_item_id_3".equals(A0q)) {
                    c910143t.A0G = c16l.A0y();
                } else if ("list_item_title_text_3".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str27 = c16l.A1P();
                    }
                    c910143t.A1D = str27;
                } else if ("list_item_progress_bar_filled_percentage_3".equals(A0q)) {
                    c910143t.A05 = c16l.A1D();
                } else if ("list_item_total_votes_count_3".equals(A0q)) {
                    c910143t.A0J = c16l.A0y();
                } else if ("list_item_accessibility_text_3".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str28 = c16l.A1P();
                    }
                    c910143t.A17 = str28;
                } else if ("list_item_voter_urls_3".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P5 = c16l.A1P()) != null) {
                                arrayList6.add(A1P5);
                            }
                        }
                    }
                    c910143t.A1b = arrayList6;
                } else if ("action_log".equals(A0q)) {
                    c910143t.A0O = AbstractC83533nu.parseFromJson(c16l);
                } else if ("list_items_author_user_igid".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str29 = c16l.A1P();
                    }
                    c910143t.A18 = str29;
                } else if ("list_item_voter_igids_1".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                arrayList7.add(A1P4);
                            }
                        }
                    }
                    c910143t.A1c = arrayList7;
                } else if ("list_item_voter_igids_2".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList8 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P3 = c16l.A1P()) != null) {
                                arrayList8.add(A1P3);
                            }
                        }
                    }
                    c910143t.A1d = arrayList8;
                } else if ("list_item_voter_igids_3".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList9 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList9.add(A1P2);
                            }
                        }
                    }
                    c910143t.A1e = arrayList9;
                } else if ("list_items_author_user_image_url".equals(A0q)) {
                    c910143t.A0N = AbstractC222616c.A00(c16l);
                } else if ("favicon_url_info".equals(A0q)) {
                    c910143t.A0T = C17Y.parseFromJson(c16l);
                } else if ("favicon_style".equals(A0q)) {
                    int A1D2 = c16l.A1D();
                    EnumC910343v[] values2 = EnumC910343v.values();
                    int length2 = values2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            enumC910343v = values2[i2];
                            if (enumC910343v.A00 == A1D2) {
                                break;
                            }
                            i2++;
                        } else {
                            enumC910343v = EnumC910343v.A03;
                            break;
                        }
                    }
                    c910143t.A0P = enumC910343v;
                } else if ("playable_audio_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str30 = c16l.A1P();
                    }
                    c910143t.A1H = str30;
                } else if ("audio_segment_start_time_ms".equals(A0q)) {
                    c910143t.A0n = Long.valueOf(c16l.A0y());
                } else if ("audio_segment_duration_ms".equals(A0q)) {
                    c910143t.A0m = Long.valueOf(c16l.A0y());
                } else if ("music_preview_countries_allowed".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList10 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList10.add(A1P);
                            }
                        }
                    }
                    c910143t.A1f = arrayList10;
                } else if ("target_expiry_timestamp_ms".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        l = Long.valueOf(c16l.A0y());
                    }
                    c910143t.A0r = l;
                } else if ("countdown_timestamp_ms".equals(A0q)) {
                    if (c16l.A11() == C16R.A0I) {
                        l2 = Long.valueOf(c16l.A0y());
                    }
                    c910143t.A0p = l2;
                } else if ("logging_generic_xma_content_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str31 = c16l.A1P();
                    }
                    c910143t.A1E = str31;
                } else if ("logging_generic_xma_content_id".equals(A0q)) {
                    c910143t.A0q = Long.valueOf(c16l.A0y());
                } else if ("toast_title_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str32 = c16l.A1P();
                    }
                    c910143t.A1W = str32;
                } else if ("toast_subtitle_bold_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str33 = c16l.A1P();
                    }
                    c910143t.A1U = str33;
                } else if ("toast_subtitle_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str34 = c16l.A1P();
                    }
                    c910143t.A1V = str34;
                } else if ("toast_favicon_url".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str35 = c16l.A1P();
                    }
                    c910143t.A1T = str35;
                } else if ("preview_url_image_versions".equals(A0q)) {
                    c910143t.A0a = AbstractC39101rj.parseFromJson(c16l);
                } else if ("original_image_width".equals(A0q)) {
                    c910143t.A0h = Integer.valueOf(c16l.A1D());
                } else if ("original_image_height".equals(A0q)) {
                    c910143t.A0g = Integer.valueOf(c16l.A1D());
                } else if ("overlay_icon_glyph".equals(A0q)) {
                    c910143t.A0i = Integer.valueOf(c16l.A1D());
                } else if ("overlay_title".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str36 = c16l.A1P();
                    }
                    c910143t.A1G = str36;
                } else if ("overlay_layout".equals(A0q)) {
                    c910143t.A0j = Integer.valueOf(c16l.A1D());
                } else if ("overlay_description".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str37 = c16l.A1P();
                    }
                    c910143t.A1F = str37;
                } else if ("serialized_content_ref".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str38 = c16l.A1P();
                    }
                    c910143t.A1N = str38;
                } else if ("should_respect_server_preview_size".equals(A0q)) {
                    c910143t.A0e = Boolean.valueOf(c16l.A0d());
                } else if ("is_borderless".equals(A0q)) {
                    c910143t.A0b = Boolean.valueOf(c16l.A0d());
                } else if ("is_text_above_xma".equals(A0q)) {
                    c910143t.A1k = c16l.A0d();
                } else if ("save_icon_state".equals(A0q)) {
                    c910143t.A0k = Integer.valueOf(c16l.A1D());
                } else if ("is_quoted".equals(A0q)) {
                    c910143t.A0c = Boolean.valueOf(c16l.A0d());
                } else if ("presence_source".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str39 = c16l.A1P();
                    }
                    c910143t.A1I = str39;
                } else if ("nux_type".equals(A0q)) {
                    c910143t.A0f = Integer.valueOf(c16l.A1D());
                } else if ("subtitle_decoration_type".equals(A0q)) {
                    c910143t.A0l = Integer.valueOf(c16l.A1D());
                } else if ("quoted_attribution_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str40 = c16l.A1P();
                    }
                    c910143t.A1K = str40;
                } else if ("quoted_caption_body_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str41 = c16l.A1P();
                    }
                    c910143t.A1L = str41;
                } else if ("quoted_title_text".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c910143t.A1M = str;
                } else if ("quoted_favicon_url_info".equals(A0q)) {
                    c910143t.A0Y = C17Y.parseFromJson(c16l);
                } else if ("quoted_author_verified_type".equals(A0q)) {
                    c910143t.A0A = c16l.A1D();
                } else if ("should_refresh".equals(A0q)) {
                    c910143t.A1l = c16l.A0d();
                } else if ("is_from_receiver_fetch".equals(A0q)) {
                    c910143t.A1h = c16l.A0d();
                } else if ("is_receiver_fetch_rich_preview_available".equals(A0q)) {
                    c910143t.A1i = c16l.A0d();
                } else if ("preview_immersive_url".equals(A0q)) {
                    c910143t.A0W = C17Y.parseFromJson(c16l);
                } else if ("should_mute_audio".equals(A0q)) {
                    c910143t.A0d = Boolean.valueOf(c16l.A0d());
                } else if ("last_refreshed_timestamp_ms".equals(A0q)) {
                    c910143t.A0C = c16l.A0y();
                }
                c16l.A0z();
            }
            String str42 = c910143t.A1Q;
            if (str42 != null) {
                c910143t.A1Q = str42.trim();
            }
            String str43 = c910143t.A0v;
            if (str43 != null) {
                c910143t.A0v = str43.trim();
            }
            String str44 = c910143t.A1O;
            if (str44 != null) {
                c910143t.A1O = str44.trim();
                return c910143t;
            }
            return c910143t;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C910143t c910143t) {
        anonymousClass182.A0d();
        String str = c910143t.A0z;
        if (str != null) {
            anonymousClass182.A0S("video_dash_manifest", str);
        }
        String str2 = c910143t.A1P;
        if (str2 != null) {
            anonymousClass182.A0S("xma_template_type", str2);
        }
        anonymousClass182.A0Q("xma_layout_type", c910143t.A02);
        if (c910143t.A0L != null) {
            anonymousClass182.A0r("preview_icon_info");
            C206409Bx c206409Bx = c910143t.A0L;
            anonymousClass182.A0d();
            String str3 = c206409Bx.A01;
            if (str3 != null) {
                anonymousClass182.A0S("preview_icon_type", str3);
            }
            ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) c206409Bx.A00;
            if (extendedImageUrl != null) {
                anonymousClass182.A0r("url_info");
                C17Y.A00(anonymousClass182, extendedImageUrl);
            }
            anonymousClass182.A0a();
        }
        if (c910143t.A0X != null) {
            anonymousClass182.A0r("preview_url_info");
            C17Y.A00(anonymousClass182, c910143t.A0X);
        }
        String str4 = c910143t.A1J;
        if (str4 != null) {
            anonymousClass182.A0S("preview_url_mime_type", str4);
        }
        EnumC910243u enumC910243u = c910143t.A0Q;
        if (enumC910243u != null) {
            anonymousClass182.A0Q("preview_layout_type", enumC910243u.A00);
        }
        if (c910143t.A1g != null) {
            C16V.A03(anonymousClass182, "preview_extra_urls_info");
            for (ExtendedImageUrl extendedImageUrl2 : c910143t.A1g) {
                if (extendedImageUrl2 != null) {
                    C17Y.A00(anonymousClass182, extendedImageUrl2);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0R("preview_media_fbid", c910143t.A0K);
        anonymousClass182.A0Q("preview_image_decoration_type", c910143t.A08);
        anonymousClass182.A0Q("preview_image_fallback_type", c910143t.A09);
        String str5 = c910143t.A13;
        if (str5 != null) {
            anonymousClass182.A0S("header_title_text", str5);
        }
        String str6 = c910143t.A12;
        if (str6 != null) {
            anonymousClass182.A0S("header_subtitle_text", str6);
        }
        if (c910143t.A0U != null) {
            anonymousClass182.A0r("header_icon_url_info");
            C17Y.A00(anonymousClass182, c910143t.A0U);
        }
        String str7 = c910143t.A11;
        if (str7 != null) {
            anonymousClass182.A0S("header_icon_url_mime_type", str7);
        }
        if (c910143t.A1Y != null) {
            C16V.A03(anonymousClass182, "header_icons_url_info");
            for (ExtendedImageUrl extendedImageUrl3 : c910143t.A1Y) {
                if (extendedImageUrl3 != null) {
                    C17Y.A00(anonymousClass182, extendedImageUrl3);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0Q("header_icons_count", c910143t.A01);
        if (c910143t.A0V != null) {
            anonymousClass182.A0r("header_icon_url");
            C17Y.A00(anonymousClass182, c910143t.A0V);
        }
        Long l = c910143t.A0o;
        if (l != null) {
            anonymousClass182.A0R("collapsible_id", l.longValue());
        }
        String str8 = c910143t.A1R;
        if (str8 != null) {
            anonymousClass182.A0S("title_icon_type", str8);
        }
        String str9 = c910143t.A1Q;
        if (str9 != null) {
            anonymousClass182.A0S("title_text", str9);
        }
        String str10 = c910143t.A0v;
        if (str10 != null) {
            anonymousClass182.A0S("caption_body_text", str10);
        }
        String str11 = c910143t.A1O;
        if (str11 != null) {
            anonymousClass182.A0S("subtitle_text", str11);
        }
        if (c910143t.A0M != null) {
            anonymousClass182.A0r("facepile_info");
            C51755Mte c51755Mte = c910143t.A0M;
            anonymousClass182.A0d();
            List<String> list = (List) c51755Mte.A00;
            if (list != null) {
                C16V.A03(anonymousClass182, AbstractC43591JPw.A00(978));
                for (String str12 : list) {
                    if (str12 != null) {
                        anonymousClass182.A0u(str12);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        String str13 = c910143t.A1S;
        if (str13 != null) {
            anonymousClass182.A0S("title_text_color", str13);
        }
        anonymousClass182.A0Q("max_title_num_of_lines", c910143t.A07);
        anonymousClass182.A0Q("max_subtitle_num_of_lines", c910143t.A06);
        String str14 = c910143t.A10;
        if (str14 != null) {
            anonymousClass182.A0S("group_name", str14);
        }
        String str15 = c910143t.A0w;
        if (str15 != null) {
            anonymousClass182.A0S("target_url", str15);
        }
        String str16 = c910143t.A0u;
        if (str16 != null) {
            anonymousClass182.A0S("attachment_id", str16);
        }
        String str17 = c910143t.A0x;
        if (str17 != null) {
            anonymousClass182.A0S("default_cta_title", str17);
        }
        String str18 = c910143t.A0y;
        if (str18 != null) {
            anonymousClass182.A0S("default_cta_type", str18);
        }
        if (c910143t.A1X != null) {
            C16V.A03(anonymousClass182, "cta_buttons");
            for (C9CP c9cp : c910143t.A1X) {
                if (c9cp != null) {
                    C4G0.A00(c9cp, anonymousClass182);
                }
            }
            anonymousClass182.A0Z();
        }
        String str19 = c910143t.A14;
        if (str19 != null) {
            anonymousClass182.A0S("ig_template_type", str19);
        }
        if (c910143t.A0Z != null) {
            anonymousClass182.A0r("playable_url_info");
            C54X.A00(anonymousClass182, c910143t.A0Z);
        }
        if (c910143t.A0S != null) {
            anonymousClass182.A0r("accessory_preview_url_info");
            C17Y.A00(anonymousClass182, c910143t.A0S);
        }
        if (c910143t.A0R != null) {
            anonymousClass182.A0r("accessory_playable_url_info");
            C17Y.A00(anonymousClass182, c910143t.A0R);
        }
        anonymousClass182.A0Q("attachment_index", c910143t.A00);
        String str20 = c910143t.A0t;
        if (str20 != null) {
            anonymousClass182.A0S("accessibility_summary_text", str20);
        }
        String str21 = c910143t.A0s;
        if (str21 != null) {
            anonymousClass182.A0S("accessibility_summary_hint", str21);
        }
        anonymousClass182.A0T("is_sharable", c910143t.A1j);
        anonymousClass182.A0R("list_items_id", c910143t.A0D);
        String str22 = c910143t.A19;
        if (str22 != null) {
            anonymousClass182.A0S("list_items_description_text", str22);
        }
        String str23 = c910143t.A1A;
        if (str23 != null) {
            anonymousClass182.A0S("list_items_secondary_description_text", str23);
        }
        anonymousClass182.A0R("list_item_id_1", c910143t.A0E);
        String str24 = c910143t.A1B;
        if (str24 != null) {
            anonymousClass182.A0S("list_item_title_text_1", str24);
        }
        anonymousClass182.A0Q("list_item_progress_bar_filled_percentage_1", c910143t.A03);
        anonymousClass182.A0Q("verified_type", c910143t.A0B);
        anonymousClass182.A0R("list_item_total_votes_count_1", c910143t.A0H);
        String str25 = c910143t.A15;
        if (str25 != null) {
            anonymousClass182.A0S("list_item_accessibility_text_1", str25);
        }
        if (c910143t.A1Z != null) {
            C16V.A03(anonymousClass182, "list_item_voter_urls_1");
            for (String str26 : c910143t.A1Z) {
                if (str26 != null) {
                    anonymousClass182.A0u(str26);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0R("list_item_id_2", c910143t.A0F);
        String str27 = c910143t.A1C;
        if (str27 != null) {
            anonymousClass182.A0S("list_item_title_text_2", str27);
        }
        anonymousClass182.A0Q("list_item_progress_bar_filled_percentage_2", c910143t.A04);
        anonymousClass182.A0R("list_item_total_votes_count_2", c910143t.A0I);
        String str28 = c910143t.A16;
        if (str28 != null) {
            anonymousClass182.A0S("list_item_accessibility_text_2", str28);
        }
        if (c910143t.A1a != null) {
            C16V.A03(anonymousClass182, "list_item_voter_urls_2");
            for (String str29 : c910143t.A1a) {
                if (str29 != null) {
                    anonymousClass182.A0u(str29);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0R("list_item_id_3", c910143t.A0G);
        String str30 = c910143t.A1D;
        if (str30 != null) {
            anonymousClass182.A0S("list_item_title_text_3", str30);
        }
        anonymousClass182.A0Q("list_item_progress_bar_filled_percentage_3", c910143t.A05);
        anonymousClass182.A0R("list_item_total_votes_count_3", c910143t.A0J);
        String str31 = c910143t.A17;
        if (str31 != null) {
            anonymousClass182.A0S("list_item_accessibility_text_3", str31);
        }
        if (c910143t.A1b != null) {
            C16V.A03(anonymousClass182, "list_item_voter_urls_3");
            for (String str32 : c910143t.A1b) {
                if (str32 != null) {
                    anonymousClass182.A0u(str32);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c910143t.A0O != null) {
            anonymousClass182.A0r("action_log");
            AbstractC83533nu.A00(anonymousClass182, c910143t.A0O);
        }
        String str33 = c910143t.A18;
        if (str33 != null) {
            anonymousClass182.A0S("list_items_author_user_igid", str33);
        }
        if (c910143t.A1c != null) {
            C16V.A03(anonymousClass182, "list_item_voter_igids_1");
            for (String str34 : c910143t.A1c) {
                if (str34 != null) {
                    anonymousClass182.A0u(str34);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c910143t.A1d != null) {
            C16V.A03(anonymousClass182, "list_item_voter_igids_2");
            for (String str35 : c910143t.A1d) {
                if (str35 != null) {
                    anonymousClass182.A0u(str35);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c910143t.A1e != null) {
            C16V.A03(anonymousClass182, "list_item_voter_igids_3");
            for (String str36 : c910143t.A1e) {
                if (str36 != null) {
                    anonymousClass182.A0u(str36);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c910143t.A0N != null) {
            anonymousClass182.A0r("list_items_author_user_image_url");
            AbstractC222616c.A01(anonymousClass182, c910143t.A0N);
        }
        if (c910143t.A0T != null) {
            anonymousClass182.A0r("favicon_url_info");
            C17Y.A00(anonymousClass182, c910143t.A0T);
        }
        EnumC910343v enumC910343v = c910143t.A0P;
        if (enumC910343v != null) {
            anonymousClass182.A0Q("favicon_style", enumC910343v.A00);
        }
        String str37 = c910143t.A1H;
        if (str37 != null) {
            anonymousClass182.A0S("playable_audio_url", str37);
        }
        Long l2 = c910143t.A0n;
        if (l2 != null) {
            anonymousClass182.A0R("audio_segment_start_time_ms", l2.longValue());
        }
        Long l3 = c910143t.A0m;
        if (l3 != null) {
            anonymousClass182.A0R("audio_segment_duration_ms", l3.longValue());
        }
        if (c910143t.A1f != null) {
            C16V.A03(anonymousClass182, "music_preview_countries_allowed");
            for (String str38 : c910143t.A1f) {
                if (str38 != null) {
                    anonymousClass182.A0u(str38);
                }
            }
            anonymousClass182.A0Z();
        }
        Long l4 = c910143t.A0r;
        if (l4 != null) {
            anonymousClass182.A0R("target_expiry_timestamp_ms", l4.longValue());
        }
        Long l5 = c910143t.A0p;
        if (l5 != null) {
            anonymousClass182.A0R("countdown_timestamp_ms", l5.longValue());
        }
        String str39 = c910143t.A1E;
        if (str39 != null) {
            anonymousClass182.A0S("logging_generic_xma_content_type", str39);
        }
        Long l6 = c910143t.A0q;
        if (l6 != null) {
            anonymousClass182.A0R("logging_generic_xma_content_id", l6.longValue());
        }
        String str40 = c910143t.A1W;
        if (str40 != null) {
            anonymousClass182.A0S("toast_title_text", str40);
        }
        String str41 = c910143t.A1U;
        if (str41 != null) {
            anonymousClass182.A0S("toast_subtitle_bold_text", str41);
        }
        String str42 = c910143t.A1V;
        if (str42 != null) {
            anonymousClass182.A0S("toast_subtitle_text", str42);
        }
        String str43 = c910143t.A1T;
        if (str43 != null) {
            anonymousClass182.A0S("toast_favicon_url", str43);
        }
        if (c910143t.A0a != null) {
            anonymousClass182.A0r("preview_url_image_versions");
            AbstractC39101rj.A00(anonymousClass182, c910143t.A0a);
        }
        Integer num = c910143t.A0h;
        if (num != null) {
            anonymousClass182.A0Q("original_image_width", num.intValue());
        }
        Integer num2 = c910143t.A0g;
        if (num2 != null) {
            anonymousClass182.A0Q("original_image_height", num2.intValue());
        }
        Integer num3 = c910143t.A0i;
        if (num3 != null) {
            anonymousClass182.A0Q("overlay_icon_glyph", num3.intValue());
        }
        String str44 = c910143t.A1G;
        if (str44 != null) {
            anonymousClass182.A0S("overlay_title", str44);
        }
        Integer num4 = c910143t.A0j;
        if (num4 != null) {
            anonymousClass182.A0Q("overlay_layout", num4.intValue());
        }
        String str45 = c910143t.A1F;
        if (str45 != null) {
            anonymousClass182.A0S("overlay_description", str45);
        }
        String str46 = c910143t.A1N;
        if (str46 != null) {
            anonymousClass182.A0S("serialized_content_ref", str46);
        }
        Boolean bool = c910143t.A0e;
        if (bool != null) {
            anonymousClass182.A0T("should_respect_server_preview_size", bool.booleanValue());
        }
        Boolean bool2 = c910143t.A0b;
        if (bool2 != null) {
            anonymousClass182.A0T("is_borderless", bool2.booleanValue());
        }
        anonymousClass182.A0T("is_text_above_xma", c910143t.A1k);
        Integer num5 = c910143t.A0k;
        if (num5 != null) {
            anonymousClass182.A0Q("save_icon_state", num5.intValue());
        }
        Boolean bool3 = c910143t.A0c;
        if (bool3 != null) {
            anonymousClass182.A0T("is_quoted", bool3.booleanValue());
        }
        String str47 = c910143t.A1I;
        if (str47 != null) {
            anonymousClass182.A0S("presence_source", str47);
        }
        Integer num6 = c910143t.A0f;
        if (num6 != null) {
            anonymousClass182.A0Q("nux_type", num6.intValue());
        }
        Integer num7 = c910143t.A0l;
        if (num7 != null) {
            anonymousClass182.A0Q("subtitle_decoration_type", num7.intValue());
        }
        String str48 = c910143t.A1K;
        if (str48 != null) {
            anonymousClass182.A0S("quoted_attribution_text", str48);
        }
        String str49 = c910143t.A1L;
        if (str49 != null) {
            anonymousClass182.A0S("quoted_caption_body_text", str49);
        }
        String str50 = c910143t.A1M;
        if (str50 != null) {
            anonymousClass182.A0S("quoted_title_text", str50);
        }
        if (c910143t.A0Y != null) {
            anonymousClass182.A0r("quoted_favicon_url_info");
            C17Y.A00(anonymousClass182, c910143t.A0Y);
        }
        anonymousClass182.A0Q("quoted_author_verified_type", c910143t.A0A);
        anonymousClass182.A0T("should_refresh", c910143t.A1l);
        anonymousClass182.A0T("is_from_receiver_fetch", c910143t.A1h);
        anonymousClass182.A0T("is_receiver_fetch_rich_preview_available", c910143t.A1i);
        if (c910143t.A0W != null) {
            anonymousClass182.A0r("preview_immersive_url");
            C17Y.A00(anonymousClass182, c910143t.A0W);
        }
        Boolean bool4 = c910143t.A0d;
        if (bool4 != null) {
            anonymousClass182.A0T("should_mute_audio", bool4.booleanValue());
        }
        anonymousClass182.A0R("last_refreshed_timestamp_ms", c910143t.A0C);
        anonymousClass182.A0a();
    }
}
