package X;

import java.io.IOException;

/* loaded from: classes9.dex */
public final class OQS {
    public static C54492O5u parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54492O5u c54492O5u = new C54492O5u();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("ig_live_video_comment_create_subscribe".equals(AbstractC166997dE.A0s(c16l))) {
                    OE6 parseFromJson = AbstractC54262Nyh.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c54492O5u.A00 = parseFromJson;
                }
                c16l.A0z();
            }
            return c54492O5u;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
