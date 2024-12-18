package X;

import android.os.Bundle;
import com.instagram.music.common.model.MusicBrowseCategory;
import com.instagram.music.common.model.MusicSearchPlaylist;
import com.instagram.music.common.model.MusicSearchPlaylistType;

/* renamed from: X.MSo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50535MSo {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.music.common.model.MusicBrowseCategory, java.lang.Object] */
    public static final MusicBrowseCategory A01(String str) {
        ?? obj = new Object();
        obj.A02 = str;
        obj.A04 = null;
        obj.A06 = null;
        obj.A00 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A03 = null;
        obj.A07 = true;
        return obj;
    }

    public static final MusicBrowseCategory A03(String str, String str2, String str3) {
        return A00(null, null, str, str2, str3, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.music.common.model.MusicBrowseCategory, java.lang.Object] */
    public static final MusicBrowseCategory A02(String str, String str2) {
        ?? obj = new Object();
        obj.A02 = "playlists";
        obj.A04 = str;
        obj.A06 = str2;
        obj.A00 = null;
        obj.A05 = null;
        obj.A01 = null;
        obj.A03 = null;
        obj.A07 = true;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.music.common.model.MusicBrowseCategory, java.lang.Object] */
    public static final MusicBrowseCategory A00(Bundle bundle, MusicSearchPlaylistType musicSearchPlaylistType, String str, String str2, String str3, String str4) {
        AbstractC167017dG.A1P(str2, str3);
        ?? obj = new Object();
        obj.A02 = str;
        obj.A04 = str2;
        obj.A06 = str3;
        obj.A00 = bundle;
        obj.A05 = str4;
        obj.A01 = musicSearchPlaylistType;
        obj.A03 = null;
        obj.A07 = false;
        return obj;
    }

    public final MusicBrowseCategory A04(MusicSearchPlaylist musicSearchPlaylist) {
        return A00(null, musicSearchPlaylist.A01(), "playlists", musicSearchPlaylist.getId(), musicSearchPlaylist.getTitle(), musicSearchPlaylist.A00().getSubtitle());
    }
}
