package X;

import java.io.IOException;

/* renamed from: X.8yj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203268yj {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.8yk, java.lang.Object] */
    public static C203278yk parseFromJson(C16L c16l) {
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
                if ("serialized_overlay_edits".equals(A0q)) {
                    obj.A04 = AbstractC203288yl.parseFromJson(c16l);
                } else if ("serialized_drawing_edits".equals(A0q)) {
                    obj.A03 = AbstractC203348yr.parseFromJson(c16l);
                } else if ("text_mode_metadata".equals(A0q)) {
                    obj.A05 = AbstractC23022ADe.parseFromJson(c16l);
                } else if ("story_caption_meta_data".equals(A0q)) {
                    obj.A06 = C5QM.parseFromJson(c16l);
                } else if ("reel_link_edits".equals(A0q)) {
                    obj.A00 = AbstractC203368yt.parseFromJson(c16l);
                } else if ("music_overlay_edits".equals(A0q)) {
                    obj.A02 = AbstractC203388yv.parseFromJson(c16l);
                } else if ("immersive_photo_edits".equals(A0q)) {
                    obj.A01 = AbstractC203398yw.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
