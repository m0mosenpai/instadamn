package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ClipChainType;
import java.io.IOException;

/* renamed from: X.HlJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC39809HlJ {
    public static C38692H2d parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            ClipChainType clipChainType = null;
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("clip_count".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("clips_chain_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    clipChainType = (ClipChainType) ClipChainType.A01.get(A1P);
                    if (clipChainType == null) {
                        clipChainType = ClipChainType.A07;
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
            if (num == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("clip_count", c16l, "ClipChainMetadataDict");
            } else if (clipChainType != null || !(c16l instanceof C07950bF)) {
                if (str == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V(DialogModule.KEY_TITLE, c16l, "ClipChainMetadataDict");
                } else {
                    return new C38692H2d(clipChainType, str, num.intValue());
                }
            } else {
                AbstractC166997dE.A1V("clips_chain_type", c16l, "ClipChainMetadataDict");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
