package X;

import java.io.IOException;

/* renamed from: X.5QH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5QH {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.5QI] */
    public static C5QI parseFromJson(C16L c16l) {
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
                String str = null;
                if ("sticker_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A04 = str;
                } else if ("start_time_ms".equals(A0q)) {
                    obj.A01 = c16l.A1D();
                } else if ("end_time_ms".equals(A0q)) {
                    obj.A00 = c16l.A1D();
                } else if ("tts_voice_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A06 = str;
                } else if ("tts_voice_name".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A07 = str;
                } else if ("tts_sfx".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A03 = str;
                } else if ("tts_shortwave_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A05 = str;
                } else if ("base_sticker_client_model".equals(A0q)) {
                    obj.A02 = C5NK.parseFromJson(c16l);
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
