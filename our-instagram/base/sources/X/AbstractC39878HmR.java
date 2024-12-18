package X;

import com.instagram.api.schemas.CreatorViewerSignalAudioDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalPlainDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalReelsTextDetailsImpl;
import java.io.IOException;

/* renamed from: X.HmR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39878HmR {
    public static CreatorViewerSignalDetailsImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            CreatorViewerSignalAudioDetailsImpl creatorViewerSignalAudioDetailsImpl = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerSignalPlainDetailsImpl creatorViewerSignalPlainDetailsImpl = null;
            CreatorViewerSignalReelsTextDetailsImpl creatorViewerSignalReelsTextDetailsImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("audio_details".equals(A0s)) {
                    creatorViewerSignalAudioDetailsImpl = AbstractC39876HmP.parseFromJson(c16l);
                } else if ("plain_details".equals(A0s)) {
                    creatorViewerSignalPlainDetailsImpl = AbstractC39884HmX.parseFromJson(c16l);
                } else if ("reels_text_details".equals(A0s)) {
                    creatorViewerSignalReelsTextDetailsImpl = AbstractC39886HmZ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new CreatorViewerSignalDetailsImpl(creatorViewerSignalAudioDetailsImpl, creatorViewerSignalPlainDetailsImpl, creatorViewerSignalReelsTextDetailsImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
