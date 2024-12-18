package X;

import android.text.Layout;
import java.io.IOException;

/* renamed from: X.5QJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QJ {
    public static C5QK parseFromJson(C16L c16l) {
        C6RC c6rc;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C5QK c5qk = new C5QK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("text_metadata".equals(A0q)) {
                    c5qk.A0D = C5QM.parseFromJson(c16l);
                } else if ("text_emphasis".equals(A0q)) {
                    c5qk.A0A = Layout.Alignment.valueOf(c16l.A1Q());
                } else if ("padding_x".equals(A0q)) {
                    c5qk.A03 = (float) c16l.A0U();
                } else if ("padding_y".equals(A0q)) {
                    c5qk.A04 = (float) c16l.A0U();
                } else if ("text_color".equals(A0q)) {
                    c5qk.A07 = c16l.A1D();
                } else if ("text_size".equals(A0q)) {
                    c5qk.A05 = (float) c16l.A0U();
                } else if ("shadow_layer".equals(A0q)) {
                    c5qk.A0E = VX8.parseFromJson(c16l);
                } else if ("line_spacing_add".equals(A0q)) {
                    c5qk.A01 = (float) c16l.A0U();
                } else if ("line_spacing_mult".equals(A0q)) {
                    c5qk.A02 = (float) c16l.A0U();
                } else if ("letter_spacing".equals(A0q)) {
                    c5qk.A00 = (float) c16l.A0U();
                } else if ("truncation_max_lines".equals(A0q)) {
                    c5qk.A09 = c16l.A1D();
                } else if ("truncation_suffix".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c5qk.A0G = A1P;
                } else if ("is_animated".equals(A0q)) {
                    c5qk.A0H = c16l.A0d();
                } else if ("safe_width".equals(A0q)) {
                    c5qk.A06 = c16l.A1D();
                } else if ("drawable_source".equals(A0q)) {
                    c5qk.A0F = C5QQ.A00(c16l.A1Q());
                } else if ("is_story_text_drawable".equals(A0q)) {
                    c5qk.A0I = c16l.A0d();
                } else if ("animation_id".equals(A0q)) {
                    c5qk.A0B = AbstractC227019zx.A00(c16l.A1Q());
                } else if ("effect_id".equals(A0q)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    C6RC[] values = C6RC.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            c6rc = values[i];
                            if (C14360o3.A0K(c6rc.A00, A1Q)) {
                                break;
                            }
                            i++;
                        } else {
                            c6rc = null;
                            break;
                        }
                    }
                    c5qk.A0C = c6rc;
                } else if ("text_effect_color".equals(A0q)) {
                    c5qk.A08 = c16l.A1D();
                }
                c16l.A0z();
            }
            return c5qk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
