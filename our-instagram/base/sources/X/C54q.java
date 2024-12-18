package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.54q, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C54q {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.54r, java.lang.Object] */
    public static C1122254r parseFromJson(C16L c16l) {
        String A1P;
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
                if ("link_image_url".equals(A0q)) {
                    obj.A00 = AbstractC222616c.A00(c16l);
                } else {
                    ArrayList arrayList = null;
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    String str4 = null;
                    String str5 = null;
                    if ("link_title".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        obj.A03 = str;
                    } else if ("link_body".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str2 = c16l.A1P();
                        }
                        obj.A02 = str2;
                    } else if ("link_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str3 = c16l.A1P();
                        }
                        obj.A05 = str3;
                    } else if ("link_summary".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str4 = c16l.A1P();
                        }
                        obj.A04 = str4;
                    } else if ("link_playable_audio_url".equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str5 = c16l.A1P();
                        }
                        obj.A01 = str5;
                    } else if ("link_music_preview_countries_allowed".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList.add(A1P);
                                }
                            }
                        }
                        obj.A06 = arrayList;
                    }
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
