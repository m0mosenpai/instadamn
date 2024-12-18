package X;

import com.instagram.api.schemas.InstagramProductTaggabilityState;
import com.instagram.api.schemas.LinkWithText;
import com.instagram.api.schemas.UntaggableReason;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.Evs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33766Evs {
    public static UntaggableReason parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            LinkWithText linkWithText = null;
            String str = null;
            LinkWithText linkWithText2 = null;
            InstagramProductTaggabilityState instagramProductTaggabilityState = null;
            String str2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("action".equals(A0s)) {
                    linkWithText = AbstractC33713Ev1.parseFromJson(c16l);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("help_link".equals(A0s)) {
                    linkWithText2 = AbstractC33713Ev1.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(538).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    instagramProductTaggabilityState = (InstagramProductTaggabilityState) InstagramProductTaggabilityState.A01.get(A1P);
                    if (instagramProductTaggabilityState == null) {
                        instagramProductTaggabilityState = InstagramProductTaggabilityState.A05;
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
            return new UntaggableReason(instagramProductTaggabilityState, linkWithText, linkWithText2, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
