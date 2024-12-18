package X;

import com.instagram.clips.intf.ClipsViewerSource;
import go.Seq;

/* loaded from: classes7.dex */
public abstract class IAQ {
    public static final C39B A00(ClipsViewerSource clipsViewerSource) {
        switch (clipsViewerSource.ordinal()) {
            case Seq.NULL_REFNUM /* 41 */:
                return C39B.A0C;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return C39B.A0F;
            case 43:
                return C39B.A03;
            case 44:
                return C39B.A05;
            case 45:
                return C39B.A02;
            case 92:
                return C39B.A06;
            default:
                return null;
        }
    }
}
