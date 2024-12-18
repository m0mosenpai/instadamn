package X;

import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;
import java.io.IOException;

/* renamed from: X.52a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1117452a {
    public static C1117552c parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("ig_pbia_profile_and_browse_type".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGPBIAProfileBrowseTypeEnum = (IGPBIAProfileBrowseTypeEnum) IGPBIAProfileBrowseTypeEnum.A01.get(A1P);
                    if (iGPBIAProfileBrowseTypeEnum == null) {
                        iGPBIAProfileBrowseTypeEnum = IGPBIAProfileBrowseTypeEnum.A06;
                    }
                } else if ("should_render_dimmer".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            return new C1117552c(iGPBIAProfileBrowseTypeEnum, bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
