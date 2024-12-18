package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.model.reels.ReelType;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I2U {
    public static C37801pJ parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ACRType aCRType = null;
            Long l = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Long l2 = null;
            C38321qM c38321qM = null;
            Long l3 = null;
            ReelType reelType = null;
            ArrayList arrayList = null;
            String str5 = null;
            C38806H6w c38806H6w = null;
            String str6 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("acr_collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P2 = null;
                    } else {
                        A1P2 = c16l.A1P();
                    }
                    aCRType = C9JF.A00(A1P2);
                } else if ("acr_metadata_id".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("action_text".equals(A0s)) {
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
                } else if ("content_body_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("content_header_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    l2 = AbstractC31173DnH.A0h(c16l);
                } else if ("preview_media".equals(A0s)) {
                    c38321qM = C38321qM.A00(c16l);
                } else if ("reels_collection_id".equals(A0s)) {
                    l3 = AbstractC31173DnH.A0h(c16l);
                } else if ("reels_collection_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    reelType = AbstractC40281tw.A00(A1P);
                } else if ("source_media_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1J(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("track_schema".equals(A0s)) {
                    c38806H6w = AbstractC40428HwJ.parseFromJson(c16l);
                } else if (AbstractC37300Gc1.A1X(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C37801pJ(aCRType, c38806H6w, c38321qM, reelType, l, l2, l3, str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
