package X;

import java.io.IOException;

/* renamed from: X.HwZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40444HwZ {
    public static H70 parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            String str = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(485);
                if (A1J == c16r) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                if (A00.equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("video_chat_attribution_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "VideoChatCaptureInfoImpl");
            } else if (str == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("video_chat_attribution_text", c16l, "VideoChatCaptureInfoImpl");
            } else {
                return new H70(bool.booleanValue(), str);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
