package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.CreatorViewerSignalDetailsImpl;
import com.instagram.api.schemas.CreatorViewerSignalModelImpl;
import com.instagram.api.schemas.InspirationSignalType;
import java.io.IOException;

/* renamed from: X.HmV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39882HmV {
    public static CreatorViewerSignalModelImpl parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            CreatorViewerSignalDetailsImpl creatorViewerSignalDetailsImpl = null;
            InspirationSignalType inspirationSignalType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("details".equals(A0s)) {
                    creatorViewerSignalDetailsImpl = AbstractC39878HmR.parseFromJson(c16l);
                } else if ("signal_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    inspirationSignalType = (InspirationSignalType) InspirationSignalType.A01.get(A1P);
                    if (inspirationSignalType == null) {
                        inspirationSignalType = InspirationSignalType.A0E;
                    }
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (creatorViewerSignalDetailsImpl == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("details", c16l, "CreatorViewerSignalModelImpl");
            } else if (inspirationSignalType != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "CreatorViewerSignalModelImpl");
                } else {
                    return new CreatorViewerSignalModelImpl(creatorViewerSignalDetailsImpl, inspirationSignalType, str);
                }
            } else {
                AbstractC166997dE.A1V("signal_type", c16l, "CreatorViewerSignalModelImpl");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
