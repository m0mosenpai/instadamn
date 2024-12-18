package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.482, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class AnonymousClass482 {
    public static C9BW parseFromJson(C16L c16l) {
        EnumC192868gS enumC192868gS;
        C14360o3.A0B(c16l, 0);
        try {
            C9BW c9bw = new C9BW(30);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                if ("voice_effect".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    try {
                        enumC192868gS = EnumC192868gS.valueOf(str);
                    } catch (IllegalArgumentException unused) {
                        enumC192868gS = null;
                    }
                    c9bw.A01 = enumC192868gS;
                } else if ("sound_effects".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C9ZV parseFromJson = A1T.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c9bw.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c9bw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
