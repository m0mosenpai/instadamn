package X;

import java.io.IOException;

/* renamed from: X.9IX, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9IX {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.A9n] */
    public static C22943A9n parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("is_video".equals(A0q)) {
                    obj.A04 = c16l.A0d();
                } else if ("is_video_muted".equals(A0q)) {
                    obj.A05 = c16l.A0d();
                } else if ("did_user_mute_audio".equals(A0q)) {
                    obj.A00 = c16l.A0d();
                } else if ("has_music_sticker".equals(A0q)) {
                    obj.A02 = c16l.A0d();
                } else if ("is_music_burned_into_video".equals(A0q)) {
                    obj.A03 = c16l.A0d();
                } else if ("force_play_video_audio".equals(A0q)) {
                    obj.A01 = c16l.A0d();
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
