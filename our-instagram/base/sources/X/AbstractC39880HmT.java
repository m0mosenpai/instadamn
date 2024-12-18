package X;

import com.instagram.api.schemas.CreatorViewerSignalInfoImpl;
import com.instagram.api.schemas.CreatorViewerSignalType;
import java.io.IOException;

/* renamed from: X.HmT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39880HmT {
    public static CreatorViewerSignalInfoImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerSignalType creatorViewerSignalType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("signal_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    creatorViewerSignalType = (CreatorViewerSignalType) CreatorViewerSignalType.A01.get(A1P);
                    if (creatorViewerSignalType == null) {
                        creatorViewerSignalType = CreatorViewerSignalType.A09;
                    }
                } else if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (creatorViewerSignalType == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("signal_type", c16l, "CreatorViewerSignalInfoImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("text", c16l, "CreatorViewerSignalInfoImpl");
            } else {
                return new CreatorViewerSignalInfoImpl(creatorViewerSignalType, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
