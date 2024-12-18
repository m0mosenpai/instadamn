package X;

import java.io.IOException;

/* renamed from: X.4ui, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC108574ui {
    public static C108584uj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audio_toggle_enabled".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if ("video_toggle_enabled".equals(A0q)) {
                    bool2 = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("audio_toggle_enabled", "IGLiveAudioVideoToggle");
            } else if (bool2 == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("video_toggle_enabled", "IGLiveAudioVideoToggle");
            } else {
                return new C108584uj(bool.booleanValue(), bool2.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
