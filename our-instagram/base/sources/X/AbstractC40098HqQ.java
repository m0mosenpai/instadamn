package X;

import com.instagram.api.schemas.MusicNoteResponseInfoIntf;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HqQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40098HqQ {
    public static Map A00(MusicNoteResponseInfoIntf musicNoteResponseInfoIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (musicNoteResponseInfoIntf.Cby() != null) {
            A1I.put("is_reshare_eligible", musicNoteResponseInfoIntf.Cby());
        }
        if (musicNoteResponseInfoIntf.Cdb() != null) {
            A1I.put("is_spotify_save_eligible", musicNoteResponseInfoIntf.Cdb());
        }
        if (musicNoteResponseInfoIntf.BVc() != null) {
            A1I.put("music_info", musicNoteResponseInfoIntf.BVc().F7o());
        }
        if (musicNoteResponseInfoIntf.BY2() != null) {
            A1I.put("num_spotify_saves", musicNoteResponseInfoIntf.BY2());
        }
        User BZk = musicNoteResponseInfoIntf.BZk();
        if (BZk != null) {
            A1I.put("original_author", BZk.A07());
        }
        if (musicNoteResponseInfoIntf.Bsf() != null) {
            A1I.put("selected_lyrics", musicNoteResponseInfoIntf.Bsf());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
