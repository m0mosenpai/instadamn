package X;

import com.instagram.clips.model.metadata.ClipsFanClubMetadata;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class FTa {
    public static ClipsFanClubMetadata parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            EnumC31515Dsz enumC31515Dsz = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("fan_club_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("video_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    enumC31515Dsz = (EnumC31515Dsz) EnumC31515Dsz.A01.get(A1P);
                    if (enumC31515Dsz == null) {
                        throw AbstractC167007dF.A0c(AbstractC111324zv.A00(95), A1P);
                    }
                } else {
                    continue;
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("fan_club_id", c16l, "ClipsFanClubMetadata");
            } else if (enumC31515Dsz == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("video_type", c16l, "ClipsFanClubMetadata");
            } else {
                return new ClipsFanClubMetadata(enumC31515Dsz, str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ClipsFanClubMetadata clipsFanClubMetadata) {
        anonymousClass182.A0d();
        String str = clipsFanClubMetadata.A01;
        if (str != null) {
            anonymousClass182.A0S("fan_club_id", str);
        }
        EnumC31515Dsz enumC31515Dsz = clipsFanClubMetadata.A00;
        if (enumC31515Dsz != null) {
            anonymousClass182.A0S("video_type", enumC31515Dsz.A00);
        }
        anonymousClass182.A0a();
    }
}
