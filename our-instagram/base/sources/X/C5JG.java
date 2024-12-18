package X;

import java.io.IOException;

/* renamed from: X.5JG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5JG {
    public static C5JH parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C5JH c5jh = new C5JH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("audio_overlay_file_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c5jh.A05 = str;
                } else if ("audio_volume".equals(A0q)) {
                    c5jh.A00 = (float) c16l.A0U();
                } else if ("seek_time_ms".equals(A0q)) {
                    c5jh.A02 = c16l.A1D();
                } else if ("start_at_time_ms".equals(A0q)) {
                    c5jh.A03 = c16l.A1D();
                } else if ("audio_duration_ms".equals(A0q)) {
                    c5jh.A01 = c16l.A1D();
                } else if ("music_browse_playlist_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c5jh.A07 = str;
                } else if ("media_audio_overlay_type".equals(A0q)) {
                    C5JI c5ji = (C5JI) C5JI.A01.get(c16l.A1Q());
                    if (c5ji == null) {
                        c5ji = C5JI.A08;
                    }
                    c5jh.A04 = c5ji;
                }
                c16l.A0z();
            }
            return c5jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5JH c5jh) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("audio_overlay_file_path", c5jh.A05);
        anonymousClass182.A0P("audio_volume", c5jh.A00);
        anonymousClass182.A0Q("seek_time_ms", c5jh.A02);
        anonymousClass182.A0Q("start_at_time_ms", c5jh.A03);
        anonymousClass182.A0Q("audio_duration_ms", c5jh.A01);
        String str = c5jh.A07;
        if (str != null) {
            anonymousClass182.A0S("music_browse_playlist_id", str);
        }
        anonymousClass182.A0S("media_audio_overlay_type", c5jh.A04.A00);
        anonymousClass182.A0a();
    }
}
