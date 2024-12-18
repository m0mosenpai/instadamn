package X;

import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.PrivateReplyStatus;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5He, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114905He {
    public static C5HX parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        String A1P4;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            Boolean bool = null;
            SimpleImageUrl simpleImageUrl = null;
            Boolean bool2 = null;
            Long l = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            SimpleImageUrl simpleImageUrl2 = null;
            String str12 = null;
            String str13 = null;
            SimpleImageUrl simpleImageUrl3 = null;
            ArrayList arrayList = null;
            String str14 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            String str15 = null;
            Long l2 = null;
            ArrayList arrayList4 = null;
            C206289Bl c206289Bl = null;
            ArrayList arrayList5 = null;
            String str16 = null;
            String str17 = null;
            C51755Mte c51755Mte = null;
            String str18 = null;
            C5JK c5jk = null;
            String str19 = null;
            Boolean bool3 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            String str20 = null;
            String str21 = null;
            Boolean bool4 = null;
            ArrayList arrayList8 = null;
            MUD mud = null;
            String str22 = null;
            Boolean bool5 = null;
            ArrayList arrayList9 = null;
            Boolean bool6 = null;
            Long l3 = null;
            Long l4 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            C121695fL c121695fL = null;
            SimpleImageUrl simpleImageUrl4 = null;
            PrivateReplyStatus privateReplyStatus = null;
            HashtagImpl hashtagImpl = null;
            Integer num = null;
            Boolean bool7 = null;
            String str26 = null;
            Boolean bool8 = null;
            C206259Bi c206259Bi = null;
            C31200Dnj c31200Dnj = null;
            Boolean bool9 = null;
            C31200Dnj c31200Dnj2 = null;
            C9C9 c9c9 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("reel_pk".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("annotation_title".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("rich_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("sub_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("action_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("icon_should_apply_filter".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("second_icon_url".equals(A0q)) {
                    simpleImageUrl = AbstractC222616c.A00(c16l);
                } else if ("second_icon_should_apply_filter".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if ("af_candidate_id".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("content_version_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("aggregation_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("profile_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("second_profile_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("profile_image".equals(A0q)) {
                    simpleImageUrl2 = AbstractC222616c.A00(c16l);
                } else if ("profile_image_destination".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                } else if ("profile_name".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str13 = null;
                    } else {
                        str13 = c16l.A1P();
                    }
                } else if ("second_profile_image".equals(A0q)) {
                    simpleImageUrl3 = AbstractC222616c.A00(c16l);
                } else if ("mentioned_users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Long valueOf = Long.valueOf(c16l.A0y());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("profile_context".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str14 = null;
                    } else {
                        str14 = c16l.A1P();
                    }
                } else if ("media".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C206409Bx parseFromJson = AbstractC123045hf.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("images".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C206409Bx parseFromJson2 = AbstractC123055hg.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList3.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("timestamp".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str15 = null;
                    } else {
                        str15 = c16l.A1P();
                    }
                } else if ("latest_reel_media".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("story_reel_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P4 = c16l.A1P()) != null) {
                                arrayList4.add(A1P4);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("inline_follow".equals(A0q)) {
                    c206289Bl = AbstractC123065hh.parseFromJson(c16l);
                } else if ("links".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList5 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C26000Beo parseFromJson3 = F96.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList5.add(parseFromJson3);
                            }
                        }
                    } else {
                        arrayList5 = null;
                    }
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str16 = null;
                    } else {
                        str16 = c16l.A1P();
                    }
                } else if ("destination".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str17 = null;
                    } else {
                        str17 = c16l.A1P();
                    }
                } else if ("friendship_status".equals(A0q)) {
                    c51755Mte = AbstractC50589MUz.parseFromJson(c16l);
                } else if ("media_destination".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str18 = null;
                    } else {
                        str18 = c16l.A1P();
                    }
                } else if ("media_clips_creation_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    c5jk = (C5JK) C5JK.A01.get(A1P3);
                    if (c5jk == null) {
                        c5jk = C5JK.A05;
                    }
                } else if ("comment_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str19 = null;
                    } else {
                        str19 = c16l.A1P();
                    }
                } else if ("comments_disabled".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("actions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList6 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList6.add(A1P2);
                            }
                        }
                    } else {
                        arrayList6 = null;
                    }
                } else if ("inline_controls".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList7 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C9CK parseFromJson4 = AbstractC114915Hf.parseFromJson(c16l);
                            if (parseFromJson4 != null) {
                                arrayList7.add(parseFromJson4);
                            }
                        }
                    } else {
                        arrayList7 = null;
                    }
                } else if ("tuuid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str20 = null;
                    } else {
                        str20 = c16l.A1P();
                    }
                } else if ("canvas_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str21 = null;
                    } else {
                        str21 = c16l.A1P();
                    }
                } else if ("is_story".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("poll_options".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList8 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C32071E6x parseFromJson5 = F9K.parseFromJson(c16l);
                            if (parseFromJson5 != null) {
                                arrayList8.add(parseFromJson5);
                            }
                        }
                    } else {
                        arrayList8 = null;
                    }
                } else if ("action_button".equals(A0q)) {
                    mud = AbstractC47076KrX.parseFromJson(c16l);
                } else if ("comment_text".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str22 = null;
                    } else {
                        str22 = c16l.A1P();
                    }
                } else if ("is_comment_eligible_for_vcr".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if ("users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList9 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList9.add(A00);
                            }
                        }
                    } else {
                        arrayList9 = null;
                    }
                } else if ("display_ufi".equals(A0q)) {
                    bool6 = Boolean.valueOf(c16l.A0d());
                } else if ("aymt_notif_id".equals(A0q)) {
                    l3 = Long.valueOf(c16l.A0y());
                } else if ("aymt_channel_id".equals(A0q)) {
                    l4 = Long.valueOf(c16l.A0y());
                } else if ("aymt_notif_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str23 = null;
                    } else {
                        str23 = c16l.A1P();
                    }
                } else if ("req_fbid".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str24 = null;
                    } else {
                        str24 = c16l.A1P();
                    }
                } else if ("preview_url".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str25 = null;
                    } else {
                        str25 = c16l.A1P();
                    }
                } else if ("extra".equals(A0q)) {
                    c121695fL = AbstractC31356DqL.parseFromJson(c16l);
                } else if ("icon_url".equals(A0q)) {
                    simpleImageUrl4 = AbstractC222616c.A00(c16l);
                } else if ("private_reply_status".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    privateReplyStatus = (PrivateReplyStatus) PrivateReplyStatus.A01.get(A1P);
                    if (privateReplyStatus == null) {
                        privateReplyStatus = PrivateReplyStatus.A07;
                    }
                } else if ("hashtag_follow".equals(A0q)) {
                    hashtagImpl = AbstractC109614wn.parseFromJson(c16l);
                } else if ("request_count".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("has_liked_comment".equals(A0q)) {
                    bool7 = Boolean.valueOf(c16l.A0d());
                } else if ("reply_comment_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str26 = null;
                    } else {
                        str26 = c16l.A1P();
                    }
                } else if ("clicked".equals(A0q)) {
                    bool8 = Boolean.valueOf(c16l.A0d());
                } else if ("logging_context".equals(A0q)) {
                    c206259Bi = AbstractC123035he.parseFromJson(c16l);
                } else if ("highlight_config".equals(A0q)) {
                    c31200Dnj = JWI.parseFromJson(c16l);
                } else if ("eligible_for_text_app_quality_control".equals(A0q)) {
                    bool9 = Boolean.valueOf(c16l.A0d());
                } else if ("indicator_config".equals(A0q)) {
                    c31200Dnj2 = AbstractC47075KrW.parseFromJson(c16l);
                } else if ("thumbnail_icon_config".equals(A0q)) {
                    c9c9 = AbstractC123165hr.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C5HX(c206259Bi, c206289Bl, c9c9, c51755Mte, c31200Dnj, c31200Dnj2, mud, privateReplyStatus, simpleImageUrl, simpleImageUrl2, simpleImageUrl3, simpleImageUrl4, c5jk, hashtagImpl, c121695fL, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, num, l, l2, l3, l4, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
