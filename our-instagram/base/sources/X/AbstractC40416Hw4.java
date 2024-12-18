package X;

import com.instagram.api.schemas.TextWithEntitiesBlockDict;
import com.instagram.common.textwithentities.model.TextWithEntities;
import java.io.IOException;

/* renamed from: X.Hw4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40416Hw4 {
    public static TextWithEntitiesBlockDict parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Integer num = null;
            TextWithEntities textWithEntities = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("block_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("depth".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("text_with_entities".equals(A0s)) {
                    textWithEntities = AbstractC40571Hyr.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new TextWithEntitiesBlockDict(textWithEntities, num, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
