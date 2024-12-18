package X;

import com.instagram.api.schemas.ClipsACRMidCardSubType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Htz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40295Htz {
    public static C38771H5l parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            ClipsACRMidCardSubType clipsACRMidCardSubType = null;
            String str = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("acr_mid_card_sub_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipsACRMidCardSubType = (ClipsACRMidCardSubType) ClipsACRMidCardSubType.A01.get(A1P);
                    if (clipsACRMidCardSubType == null) {
                        clipsACRMidCardSubType = ClipsACRMidCardSubType.A0C;
                    }
                } else if ("auto_created_clips_metadata_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C45136Jyc parseFromJson = AbstractC39725Hjv.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("auto_created_clips_metadata_list", c16l, "StoryMidCardMetadataV2");
                throw C00O.createAndThrow();
            }
            return new C38771H5l(clipsACRMidCardSubType, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
