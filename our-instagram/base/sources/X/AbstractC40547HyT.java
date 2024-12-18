package X;

import java.io.IOException;

/* renamed from: X.HyT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40547HyT {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IGL, java.lang.Object] */
    public static IGL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("music_info".equals(A0s)) {
                    obj.A00 = C3XO.parseFromJson(c16l);
                } else if ("original_sound_info".equals(A0s)) {
                    obj.A01 = C3XP.parseFromJson(c16l);
                } else if ("additional_audio_info".equals(A0s)) {
                    obj.A02 = AbstractC83983oi.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
