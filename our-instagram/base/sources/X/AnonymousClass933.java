package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.933, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass933 {
    public static AnonymousClass932 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            AnonymousClass932 anonymousClass932 = new AnonymousClass932();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    ArrayList arrayList = null;
                    HashMap hashMap = null;
                    if ("user_presence".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P2, null);
                                } else {
                                    C130725vK parseFromJson = AbstractC130715vJ.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        hashMap2.put(A1P2, parseFromJson);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        anonymousClass932.A00 = hashMap;
                    } else if ("user_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList.add(A1P);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        anonymousClass932.A01 = arrayList;
                    } else {
                        C55702hA.A01(c16l, anonymousClass932, A0q);
                    }
                    c16l.A0z();
                } else {
                    return anonymousClass932;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
