package X;

import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.MusicInfoImpl;

/* loaded from: classes5.dex */
public abstract class CFT {
    public static final C88513x8 A00(C1DV c1dv, MusicInfo musicInfo) {
        MusicInfoImpl musicInfoImpl;
        C14360o3.A0B(c1dv, 1);
        C128855rz c128855rz = new C128855rz(CMG.A00);
        if (musicInfo != null) {
            musicInfoImpl = musicInfo.Ewz(c1dv);
        } else {
            musicInfoImpl = null;
        }
        c128855rz.A08 = musicInfoImpl;
        return c128855rz.A00();
    }
}
