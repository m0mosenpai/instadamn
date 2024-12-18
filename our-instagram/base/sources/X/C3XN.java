package X;

import com.instagram.api.schemas.MusicInfoImpl;
import com.instagram.api.schemas.OriginalSoundData;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3XN, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3XN {
    public static C3XQ parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            MusicInfoImpl musicInfoImpl = null;
            OriginalSoundData originalSoundData = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("music_info".equals(A0q)) {
                    musicInfoImpl = C3XO.parseFromJson(c16l);
                } else if ("original_sound_info".equals(A0q)) {
                    originalSoundData = C3XP.parseFromJson(c16l);
                } else if ("pinned_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new C3XQ(musicInfoImpl, originalSoundData, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
