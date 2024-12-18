package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;
import java.io.IOException;

/* renamed from: X.Hjv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39725Hjv {
    public static C45136Jyc parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        String A1P3;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            H2A h2a = null;
            ACRType aCRType = null;
            String str = null;
            String str2 = null;
            C38321qM c38321qM = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            SmartReelType smartReelType = null;
            ReelType reelType = null;
            C38806H6w c38806H6w = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("acr_client_stitch_metadata".equals(A0s)) {
                    h2a = AbstractC39724Hju.parseFromJson(c16l);
                } else if ("acr_collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P3 = null;
                    } else {
                        A1P3 = c16l.A1P();
                    }
                    aCRType = C9JF.A00(A1P3);
                } else if ("acr_metadata_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("audio_cluster_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("preview_media".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("preview_title_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("reels_collection_compound_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("reels_collection_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("reels_collection_theme".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    smartReelType = (SmartReelType) SmartReelType.A01.get(A1P2);
                    if (smartReelType == null) {
                        smartReelType = SmartReelType.A1X;
                    }
                } else if ("reels_collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    reelType = AbstractC40281tw.A00(A1P);
                } else if ("track_schema".equals(A0s)) {
                    c38806H6w = AbstractC40428HwJ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("audio_cluster_id", c16l, "AcrMetadata");
            } else if (c38321qM == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("preview_media", c16l, "AcrMetadata");
            } else {
                return new C45136Jyc(h2a, aCRType, smartReelType, c38806H6w, c38321qM, reelType, str, str2, str3, str4, str5);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
