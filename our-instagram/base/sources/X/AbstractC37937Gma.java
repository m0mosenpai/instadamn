package X;

import com.instagram.api.schemas.AudioNoteResponseInfo;
import com.instagram.api.schemas.AvatarNoteResponseInfoImpl;
import com.instagram.api.schemas.GIFNoteResponseInfoImpl;
import com.instagram.api.schemas.ListeningNowResponseInfo;
import com.instagram.api.schemas.LiveNoteResponseInfo;
import com.instagram.api.schemas.LocationNoteResponseInfoImpl;
import com.instagram.api.schemas.MusicNoteResponseInfo;
import com.instagram.api.schemas.NoteChatResponseInfoImpl;
import java.io.IOException;

/* renamed from: X.Gma, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37937Gma {
    public static C67s parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            AudioNoteResponseInfo audioNoteResponseInfo = null;
            AvatarNoteResponseInfoImpl avatarNoteResponseInfoImpl = null;
            GIFNoteResponseInfoImpl gIFNoteResponseInfoImpl = null;
            H3R h3r = null;
            ListeningNowResponseInfo listeningNowResponseInfo = null;
            LiveNoteResponseInfo liveNoteResponseInfo = null;
            LocationNoteResponseInfoImpl locationNoteResponseInfoImpl = null;
            MusicNoteResponseInfo musicNoteResponseInfo = null;
            NoteChatResponseInfoImpl noteChatResponseInfoImpl = null;
            C67x c67x = null;
            C38737H4b c38737H4b = null;
            C1348267y c1348267y = null;
            C1348367z c1348367z = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audio_note_response_info".equals(A0q)) {
                    audioNoteResponseInfo = AbstractC39759HkV.parseFromJson(c16l);
                } else if ("avatar_note_response_info".equals(A0q)) {
                    avatarNoteResponseInfoImpl = AbstractC39764Hka.parseFromJson(c16l);
                } else if ("gif_note_response_info".equals(A0q)) {
                    gIFNoteResponseInfoImpl = AbstractC39932HnN.parseFromJson(c16l);
                } else if ("group_note_response_info".equals(A0q)) {
                    h3r = AbstractC39947Hnc.parseFromJson(c16l);
                } else if ("listening_now_response_info".equals(A0q)) {
                    listeningNowResponseInfo = AbstractC40044HpW.parseFromJson(c16l);
                } else if ("live_note_response_info".equals(A0q)) {
                    liveNoteResponseInfo = AbstractC40047HpZ.parseFromJson(c16l);
                } else if ("location_note_response_info".equals(A0q)) {
                    locationNoteResponseInfoImpl = AbstractC40050Hpc.parseFromJson(c16l);
                } else if ("music_note_response_info".equals(A0q)) {
                    musicNoteResponseInfo = AbstractC37978GnL.parseFromJson(c16l);
                } else if ("note_chat_response_info".equals(A0q)) {
                    noteChatResponseInfoImpl = AbstractC40108Hqb.parseFromJson(c16l);
                } else if ("note_pog_video_response_info".equals(A0q)) {
                    c67x = AbstractC40116Hqj.parseFromJson(c16l);
                } else if ("presence_note_response_info".equals(A0q)) {
                    c38737H4b = AbstractC40156HrQ.parseFromJson(c16l);
                } else if ("prompt_pog_response_info".equals(A0q)) {
                    c1348267y = AbstractC40193HsD.parseFromJson(c16l);
                } else if ("prompt_reply_note_response_info".equals(A0q)) {
                    c1348367z = AbstractC40194HsE.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C67s(audioNoteResponseInfo, avatarNoteResponseInfoImpl, gIFNoteResponseInfoImpl, h3r, listeningNowResponseInfo, liveNoteResponseInfo, locationNoteResponseInfoImpl, musicNoteResponseInfo, noteChatResponseInfoImpl, c67x, c38737H4b, c1348267y, c1348367z);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
