package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.GIFNoteResponseInfo;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.ListeningNowState;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.MediaType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteBackgroundColor;
import com.instagram.api.schemas.NoteChatResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import com.instagram.api.schemas.NoteEmojiReactionInfo;
import com.instagram.api.schemas.NoteFontStyle;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.audio.Audio;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GmZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37936GmZ {
    public static C6C9 parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            Integer num = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            NoteBackgroundColor noteBackgroundColor = null;
            AnonymousClass689 anonymousClass689 = null;
            Long l = null;
            NoteCustomThemeImpl noteCustomThemeImpl = null;
            ArrayList arrayList2 = null;
            Long l2 = null;
            NoteFontStyle noteFontStyle = null;
            String str = null;
            Boolean bool2 = null;
            String str2 = null;
            Boolean bool3 = null;
            Boolean bool4 = null;
            C67s c67s = null;
            Integer num3 = null;
            AnonymousClass688 anonymousClass688 = null;
            ArrayList arrayList3 = null;
            C68B c68b = null;
            C68D c68d = null;
            User user = null;
            String str3 = null;
            String str4 = null;
            Boolean bool5 = null;
            User user2 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audience".equals(A0q)) {
                    num = Integer.valueOf(c16l.A1D());
                } else if ("audience_facepile_users".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = AbstractC38851rI.A00(c16l, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("audience_size".equals(A0q)) {
                    num2 = Integer.valueOf(c16l.A1D());
                } else if ("background_color".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    NoteBackgroundColor noteBackgroundColor2 = (NoteBackgroundColor) NoteBackgroundColor.A01.get(A1P2);
                    noteBackgroundColor = noteBackgroundColor2;
                    if (noteBackgroundColor2 == null) {
                        noteBackgroundColor = NoteBackgroundColor.A08;
                    }
                } else if ("can_reply".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("collab_note_info".equals(A0q)) {
                    anonymousClass689 = AbstractC39833Hlh.parseFromJson(c16l);
                } else if ("created_at".equals(A0q)) {
                    l = Long.valueOf(c16l.A0y());
                } else if ("custom_theme".equals(A0q)) {
                    noteCustomThemeImpl = AbstractC103504lQ.parseFromJson(c16l);
                } else if ("e2ee_mentioned_user_list".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            Parcelable.Creator creator2 = User.CREATOR;
                            User A002 = AbstractC38851rI.A00(c16l, false);
                            if (A002 != null) {
                                arrayList2.add(A002);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("expires_at".equals(A0q)) {
                    l2 = Long.valueOf(c16l.A0y());
                } else if ("font_style".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    noteFontStyle = (NoteFontStyle) NoteFontStyle.A01.get(A1P);
                    if (noteFontStyle == null) {
                        noteFontStyle = NoteFontStyle.A07;
                    }
                } else if ("group_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("has_translation".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_emoji_only".equals(A0q)) {
                    bool3 = Boolean.valueOf(c16l.A0d());
                } else if ("is_unseen".equals(A0q)) {
                    bool4 = Boolean.valueOf(c16l.A0d());
                } else if ("note_response_info".equals(A0q)) {
                    c67s = AbstractC37937Gma.parseFromJson(c16l);
                } else if ("note_style".equals(A0q)) {
                    num3 = Integer.valueOf(c16l.A1D());
                } else if ("reaction_info".equals(A0q)) {
                    anonymousClass688 = AbstractC37939Gmc.parseFromJson(c16l);
                } else if ("reactions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            NoteEmojiReactionInfo parseFromJson = AbstractC41262IOd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList3.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("reshare_info".equals(A0q)) {
                    c68b = AbstractC40117Hqk.parseFromJson(c16l);
                } else if ("story_info".equals(A0q)) {
                    c68d = AbstractC40292Htw.parseFromJson(c16l);
                } else if ("target_profile".equals(A0q)) {
                    Parcelable.Creator creator3 = User.CREATOR;
                    user = AbstractC38851rI.A00(c16l, false);
                } else if ("target_profile_id".equals(A0q)) {
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
                } else if ("update_viewer_birthday_visibility".equals(A0q)) {
                    bool5 = Boolean.valueOf(c16l.A0d());
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A0q)) {
                    Parcelable.Creator creator4 = User.CREATOR;
                    user2 = AbstractC38851rI.A00(c16l, false);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("audience", c16l, "NoteResponse");
            } else if (noteBackgroundColor != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("can_reply", c16l, "NoteResponse");
                } else if (l == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("created_at", c16l, "NoteResponse");
                } else if (l2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("expires_at", c16l, "NoteResponse");
                } else if (noteFontStyle == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("font_style", c16l, "NoteResponse");
                } else if (bool2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("has_translation", c16l, "NoteResponse");
                } else if (str2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "NoteResponse");
                } else if (bool3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_emoji_only", c16l, "NoteResponse");
                } else if (bool4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("is_unseen", c16l, "NoteResponse");
                } else if (num3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("note_style", c16l, "NoteResponse");
                } else if (arrayList3 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("reactions", c16l, "NoteResponse");
                } else if (str4 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("text", c16l, "NoteResponse");
                } else if (user2 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_USER, c16l, "NoteResponse");
                } else if (str5 == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c16l, "NoteResponse");
                } else {
                    return new C6C9(anonymousClass689, noteBackgroundColor, noteCustomThemeImpl, anonymousClass688, noteFontStyle, c68b, c67s, c68d, user, user2, bool5, num2, str, str2, str3, str4, str5, arrayList, arrayList2, arrayList3, num.intValue(), num3.intValue(), l.longValue(), l2.longValue(), bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue(), bool4.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V("background_color", c16l, "NoteResponse");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C6C9 c6c9) {
        anonymousClass182.A0d();
        anonymousClass182.A0Q("audience", c6c9.A00);
        List list = c6c9.A0L;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "audience_facepile_users", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        Integer num = c6c9.A0F;
        if (num != null) {
            anonymousClass182.A0Q("audience_size", num.intValue());
        }
        NoteBackgroundColor noteBackgroundColor = c6c9.A05;
        if (noteBackgroundColor != null) {
            anonymousClass182.A0S("background_color", noteBackgroundColor.A00);
        }
        anonymousClass182.A0T("can_reply", c6c9.A0O);
        AnonymousClass689 anonymousClass689 = c6c9.A04;
        if (anonymousClass689 != null) {
            anonymousClass182.A0r("collab_note_info");
            anonymousClass182.A0d();
            List list2 = anonymousClass689.A00;
            if (list2 != null) {
                Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "collaborators", list2);
                while (A0q2.hasNext()) {
                    C38705H2q c38705H2q = (C38705H2q) A0q2.next();
                    if (c38705H2q != null) {
                        anonymousClass182.A0d();
                        anonymousClass182.A0Q("audience", c38705H2q.A00);
                        User user = c38705H2q.A01;
                        if (user != null) {
                            AbstractC37300Gc1.A0x(anonymousClass182, user, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            List list3 = anonymousClass689.A01;
            if (list3 != null) {
                Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "invitees", list3);
                while (A0q3.hasNext()) {
                    AbstractC167017dG.A1G(anonymousClass182, A0q3);
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0R("created_at", c6c9.A02);
        NoteCustomThemeImpl noteCustomThemeImpl = c6c9.A06;
        if (noteCustomThemeImpl != null) {
            anonymousClass182.A0r("custom_theme");
            AbstractC103504lQ.A00(anonymousClass182, noteCustomThemeImpl);
        }
        List list4 = c6c9.A0M;
        if (list4 != null) {
            Iterator A0q4 = AbstractC37301Gc2.A0q(anonymousClass182, "e2ee_mentioned_user_list", list4);
            while (A0q4.hasNext()) {
                AbstractC167017dG.A1G(anonymousClass182, A0q4);
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0R("expires_at", c6c9.A03);
        NoteFontStyle noteFontStyle = c6c9.A08;
        if (noteFontStyle != null) {
            anonymousClass182.A0S("font_style", noteFontStyle.A00);
        }
        String str = c6c9.A0G;
        if (str != null) {
            anonymousClass182.A0S("group_id", str);
        }
        anonymousClass182.A0T("has_translation", c6c9.A0P);
        AbstractC37301Gc2.A1D(anonymousClass182, c6c9.A0H);
        anonymousClass182.A0T("is_emoji_only", c6c9.A0Q);
        anonymousClass182.A0T("is_unseen", c6c9.A0R);
        C67s c67s = c6c9.A0A;
        if (c67s != null) {
            anonymousClass182.A0r("note_response_info");
            anonymousClass182.A0d();
            AudioNoteResponseInfo audioNoteResponseInfo = c67s.A00;
            if (audioNoteResponseInfo != null) {
                anonymousClass182.A0r("audio_note_response_info");
                anonymousClass182.A0d();
                Audio audio = audioNoteResponseInfo.A00;
                if (audio != null) {
                    anonymousClass182.A0r("audio_info");
                    C4G3.A00(anonymousClass182, audio);
                }
                String str2 = audioNoteResponseInfo.A01;
                if (str2 != null) {
                    anonymousClass182.A0S("logging_id", str2);
                }
                anonymousClass182.A0a();
            }
            AvatarNoteResponseInfo avatarNoteResponseInfo = c67s.A01;
            if (avatarNoteResponseInfo != null) {
                anonymousClass182.A0r("avatar_note_response_info");
                AvatarNoteResponseInfoImpl Er8 = avatarNoteResponseInfo.Er8();
                anonymousClass182.A0d();
                MediaType mediaType = Er8.A00;
                if (mediaType != null) {
                    anonymousClass182.A0S("avatar_sticker_media_type", mediaType.A00);
                }
                String str3 = Er8.A01;
                if (str3 != null) {
                    anonymousClass182.A0S("avatar_sticker_template_id", str3);
                }
                String str4 = Er8.A02;
                if (str4 != null) {
                    anonymousClass182.A0S("cdn_url", str4);
                }
                anonymousClass182.A0a();
            }
            GIFNoteResponseInfo gIFNoteResponseInfo = c67s.A02;
            if (gIFNoteResponseInfo != null) {
                anonymousClass182.A0r("gif_note_response_info");
                GIFNoteResponseInfoImpl Etk = gIFNoteResponseInfo.Etk();
                anonymousClass182.A0d();
                CommentGiphyMediaInfo commentGiphyMediaInfo = Etk.A00;
                if (commentGiphyMediaInfo != null) {
                    anonymousClass182.A0r("gif_info");
                    AbstractC41253INt.A00(anonymousClass182, commentGiphyMediaInfo);
                }
                anonymousClass182.A0a();
            }
            C67Z c67z = c67s.A03;
            if (c67z != null) {
                anonymousClass182.A0r("group_note_response_info");
                H3R Ety = c67z.Ety(AbstractC37301Gc2.A08());
                anonymousClass182.A0d();
                List list5 = Ety.A02;
                if (list5 != null) {
                    Iterator A0q5 = AbstractC37301Gc2.A0q(anonymousClass182, "featured_user_list", list5);
                    while (A0q5.hasNext()) {
                        AbstractC167017dG.A1G(anonymousClass182, A0q5);
                    }
                    anonymousClass182.A0Z();
                }
                User user2 = Ety.A00;
                if (user2 != null) {
                    AbstractC37300Gc1.A0x(anonymousClass182, user2, "group");
                }
                Integer num2 = Ety.A01;
                if (num2 != null) {
                    anonymousClass182.A0Q("num_total_notes", num2.intValue());
                }
                anonymousClass182.A0a();
            }
            ListeningNowResponseInfo listeningNowResponseInfo = c67s.A04;
            if (listeningNowResponseInfo != null) {
                anonymousClass182.A0r("listening_now_response_info");
                anonymousClass182.A0d();
                Boolean bool = listeningNowResponseInfo.A02;
                if (bool != null) {
                    anonymousClass182.A0T("is_spotify_save_eligible", bool.booleanValue());
                }
                ListeningNowState listeningNowState = listeningNowResponseInfo.A00;
                if (listeningNowState != null) {
                    anonymousClass182.A0S(AbstractC43591JPw.A00(82), listeningNowState.A00);
                }
                MusicInfo musicInfo = listeningNowResponseInfo.A01;
                if (musicInfo != null) {
                    anonymousClass182.A0r("music_info");
                    C3XO.A00(anonymousClass182, musicInfo.Ewz(AbstractC37301Gc2.A08()));
                }
                Integer num3 = listeningNowResponseInfo.A03;
                if (num3 != null) {
                    anonymousClass182.A0Q("num_spotify_saves", num3.intValue());
                }
                anonymousClass182.A0a();
            }
            LiveNoteResponseInfo liveNoteResponseInfo = c67s.A05;
            if (liveNoteResponseInfo != null) {
                anonymousClass182.A0r("live_note_response_info");
                anonymousClass182.A0d();
                List list6 = liveNoteResponseInfo.A01;
                if (list6 != null) {
                    Iterator A0q6 = AbstractC37301Gc2.A0q(anonymousClass182, "subscribed_users", list6);
                    while (A0q6.hasNext()) {
                        AbstractC167017dG.A1G(anonymousClass182, A0q6);
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0R("timer_end_timestamp", liveNoteResponseInfo.A00);
                anonymousClass182.A0a();
            }
            LocationNoteResponseInfo locationNoteResponseInfo = c67s.A06;
            if (locationNoteResponseInfo != null) {
                anonymousClass182.A0r("location_note_response_info");
                LocationNoteResponseInfoImpl Ew7 = locationNoteResponseInfo.Ew7();
                anonymousClass182.A0d();
                String str5 = Ew7.A00;
                if (str5 != null) {
                    anonymousClass182.A0S("location_id", str5);
                }
                String str6 = Ew7.A01;
                if (str6 != null) {
                    anonymousClass182.A0S("location_name", str6);
                }
                anonymousClass182.A0a();
            }
            MusicNoteResponseInfo musicNoteResponseInfo = c67s.A07;
            if (musicNoteResponseInfo != null) {
                anonymousClass182.A0r("music_note_response_info");
                anonymousClass182.A0d();
                Boolean bool2 = musicNoteResponseInfo.A02;
                if (bool2 != null) {
                    anonymousClass182.A0T("is_reshare_eligible", bool2.booleanValue());
                }
                Boolean bool3 = musicNoteResponseInfo.A03;
                if (bool3 != null) {
                    anonymousClass182.A0T("is_spotify_save_eligible", bool3.booleanValue());
                }
                MusicInfo musicInfo2 = musicNoteResponseInfo.A00;
                if (musicInfo2 != null) {
                    anonymousClass182.A0r("music_info");
                    C3XO.A00(anonymousClass182, musicInfo2.Ewz(AbstractC37301Gc2.A08()));
                }
                Integer num4 = musicNoteResponseInfo.A04;
                if (num4 != null) {
                    anonymousClass182.A0Q("num_spotify_saves", num4.intValue());
                }
                User user3 = musicNoteResponseInfo.A01;
                if (user3 != null) {
                    AbstractC37300Gc1.A0x(anonymousClass182, user3, "original_author");
                }
                String str7 = musicNoteResponseInfo.A05;
                if (str7 != null) {
                    anonymousClass182.A0S("selected_lyrics", str7);
                }
                anonymousClass182.A0a();
            }
            NoteChatResponseInfo noteChatResponseInfo = c67s.A08;
            if (noteChatResponseInfo != null) {
                anonymousClass182.A0r("note_chat_response_info");
                NoteChatResponseInfoImpl ExI = noteChatResponseInfo.ExI(AbstractC37301Gc2.A08());
                anonymousClass182.A0d();
                String str8 = ExI.A02;
                if (str8 != null) {
                    anonymousClass182.A0S("group_chat_hash", str8);
                }
                anonymousClass182.A0T("is_member", ExI.A04);
                Integer num5 = ExI.A01;
                if (num5 != null) {
                    anonymousClass182.A0Q("last_num_members", num5.intValue());
                }
                anonymousClass182.A0Q("num_members", ExI.A00);
                List list7 = ExI.A03;
                if (list7 != null) {
                    Iterator A0q7 = AbstractC37301Gc2.A0q(anonymousClass182, "social_context_users", list7);
                    while (A0q7.hasNext()) {
                        AbstractC167017dG.A1G(anonymousClass182, A0q7);
                    }
                    anonymousClass182.A0Z();
                }
                anonymousClass182.A0a();
            }
            C67x c67x = c67s.A09;
            if (c67x != null) {
                anonymousClass182.A0r("note_pog_video_response_info");
                anonymousClass182.A0d();
                NotePogImageDict notePogImageDict = c67x.A00;
                if (notePogImageDict != null) {
                    anonymousClass182.A0r("image_dict");
                    anonymousClass182.A0d();
                    AbstractC37301Gc2.A1D(anonymousClass182, notePogImageDict.A00);
                    String str9 = notePogImageDict.A01;
                    if (str9 != null) {
                        anonymousClass182.A0S("image_url", str9);
                    }
                    String str10 = notePogImageDict.A02;
                    if (str10 != null) {
                        anonymousClass182.A0S("pk", str10);
                    }
                    anonymousClass182.A0a();
                }
                NotePogVideoDict notePogVideoDict = c67x.A01;
                if (notePogVideoDict != null) {
                    anonymousClass182.A0r("video_dict");
                    anonymousClass182.A0d();
                    AbstractC37301Gc2.A1D(anonymousClass182, notePogVideoDict.A01);
                    AbstractC37303Gc4.A13(anonymousClass182, notePogVideoDict.A00);
                    String str11 = notePogVideoDict.A02;
                    if (str11 != null) {
                        anonymousClass182.A0S("pk", str11);
                    }
                    List list8 = notePogVideoDict.A03;
                    if (list8 != null) {
                        Iterator A0q8 = AbstractC37301Gc2.A0q(anonymousClass182, "video_versions", list8);
                        while (A0q8.hasNext()) {
                            VideoVersion videoVersion = (VideoVersion) A0q8.next();
                            if (videoVersion != null) {
                                AbstractC40001tP.A00(anonymousClass182, videoVersion);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
                anonymousClass182.A0a();
            }
            InterfaceC1347767n interfaceC1347767n = c67s.A0A;
            if (interfaceC1347767n != null) {
                anonymousClass182.A0r("presence_note_response_info");
                C38737H4b EyA = interfaceC1347767n.EyA();
                anonymousClass182.A0d();
                String str12 = EyA.A00;
                if (str12 != null) {
                    anonymousClass182.A0S("presence_id", str12);
                }
                anonymousClass182.A0a();
            }
            C1348267y c1348267y = c67s.A0B;
            if (c1348267y != null) {
                anonymousClass182.A0r("prompt_pog_response_info");
                anonymousClass182.A0d();
                List list9 = c1348267y.A04;
                if (list9 != null) {
                    Iterator A0q9 = AbstractC37301Gc2.A0q(anonymousClass182, "facepile_users", list9);
                    while (A0q9.hasNext()) {
                        AbstractC167017dG.A1G(anonymousClass182, A0q9);
                    }
                    anonymousClass182.A0Z();
                }
                Integer num6 = c1348267y.A01;
                if (num6 != null) {
                    anonymousClass182.A0Q("num_items", num6.intValue());
                }
                String str13 = c1348267y.A02;
                if (str13 != null) {
                    anonymousClass182.A0S("prompt_id", str13);
                }
                String str14 = c1348267y.A03;
                if (str14 != null) {
                    anonymousClass182.A0S("prompt_text", str14);
                }
                Boolean bool4 = c1348267y.A00;
                if (bool4 != null) {
                    anonymousClass182.A0T(AbstractC111324zv.A00(267), bool4.booleanValue());
                }
                anonymousClass182.A0a();
            }
            C1348367z c1348367z = c67s.A0C;
            if (c1348367z != null) {
                anonymousClass182.A0r("prompt_reply_note_response_info");
                anonymousClass182.A0d();
                String str15 = c1348367z.A00;
                if (str15 != null) {
                    anonymousClass182.A0S("prompt_text", str15);
                }
                anonymousClass182.A0a();
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Q("note_style", c6c9.A01);
        AnonymousClass688 anonymousClass688 = c6c9.A07;
        if (anonymousClass688 != null) {
            anonymousClass182.A0r("reaction_info");
            anonymousClass182.A0d();
            C111074zO c111074zO = anonymousClass688.A00;
            if (c111074zO != null) {
                anonymousClass182.A0r("paging_info");
                anonymousClass182.A0d();
                String str16 = c111074zO.A00;
                if (str16 != null) {
                    anonymousClass182.A0S("max_id", str16);
                }
                anonymousClass182.A0T("more_available", c111074zO.A01);
                anonymousClass182.A0a();
            }
            List list10 = anonymousClass688.A01;
            if (list10 != null) {
                Iterator A0q10 = AbstractC37301Gc2.A0q(anonymousClass182, "reactions", list10);
                while (A0q10.hasNext()) {
                    NoteEmojiReactionInfo noteEmojiReactionInfo = (NoteEmojiReactionInfo) A0q10.next();
                    if (noteEmojiReactionInfo != null) {
                        AbstractC41262IOd.A00(anonymousClass182, noteEmojiReactionInfo);
                    }
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        List list11 = c6c9.A0N;
        if (list11 != null) {
            Iterator A0q11 = AbstractC37301Gc2.A0q(anonymousClass182, "reactions", list11);
            while (A0q11.hasNext()) {
                NoteEmojiReactionInfo noteEmojiReactionInfo2 = (NoteEmojiReactionInfo) A0q11.next();
                if (noteEmojiReactionInfo2 != null) {
                    AbstractC41262IOd.A00(anonymousClass182, noteEmojiReactionInfo2);
                }
            }
            anonymousClass182.A0Z();
        }
        C68B c68b = c6c9.A09;
        if (c68b != null) {
            anonymousClass182.A0r("reshare_info");
            anonymousClass182.A0d();
            List list12 = c68b.A00;
            if (list12 != null) {
                Iterator A0q12 = AbstractC37301Gc2.A0q(anonymousClass182, "resharers", list12);
                while (A0q12.hasNext()) {
                    AbstractC167017dG.A1G(anonymousClass182, A0q12);
                }
                anonymousClass182.A0Z();
            }
            anonymousClass182.A0a();
        }
        C68D c68d = c6c9.A0B;
        if (c68d != null) {
            anonymousClass182.A0r("story_info");
            anonymousClass182.A0d();
            Boolean bool5 = c68d.A00;
            if (bool5 != null) {
                anonymousClass182.A0T("is_bestie", bool5.booleanValue());
            }
            Long l = c68d.A02;
            if (l != null) {
                anonymousClass182.A0R("latest_reel_media", l.longValue());
            }
            Float f = c68d.A01;
            if (f != null) {
                anonymousClass182.A0P("story_seen_time", f.floatValue());
            }
            String str17 = c68d.A03;
            if (str17 != null) {
                anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str17);
            }
            anonymousClass182.A0a();
        }
        User user4 = c6c9.A0C;
        if (user4 != null) {
            AbstractC37300Gc1.A0x(anonymousClass182, user4, "target_profile");
        }
        String str18 = c6c9.A0I;
        if (str18 != null) {
            anonymousClass182.A0S("target_profile_id", str18);
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c6c9.A0J);
        Boolean bool6 = c6c9.A0E;
        if (bool6 != null) {
            anonymousClass182.A0T("update_viewer_birthday_visibility", bool6.booleanValue());
        }
        User user5 = c6c9.A0D;
        if (user5 != null) {
            AbstractC37300Gc1.A0x(anonymousClass182, user5, PublicKeyCredentialControllerUtility.JSON_KEY_USER);
        }
        String str19 = c6c9.A0K;
        if (str19 != null) {
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str19);
        }
        anonymousClass182.A0a();
    }
}
