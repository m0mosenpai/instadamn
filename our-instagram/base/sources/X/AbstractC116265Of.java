package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.5Of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC116265Of {
    public static C57802kt parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C57802kt c57802kt = new C57802kt();
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
                    HashMap hashMap = null;
                    String str = null;
                    HashSet hashSet = null;
                    if (TraceFieldType.RequestID.equals(A0q)) {
                        if (c16l.A11() != C16R.A0G) {
                            str = c16l.A1P();
                        }
                        c57802kt.A00 = str;
                    } else if ("seen_clip_ids".equals(A0q)) {
                        if (c16l.A11() == C16R.A0C) {
                            hashSet = new HashSet();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    hashSet.add(A1P);
                                }
                            }
                        }
                        c57802kt.A02 = hashSet;
                    } else if ("blend_impressions".equals(A0q)) {
                        if (c16l.A11() == c16r) {
                            HashMap hashMap2 = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap2.put(A1P2, null);
                                } else {
                                    String A1P3 = c16l.A1P();
                                    if (A1P3 != null) {
                                        hashMap2.put(A1P2, A1P3);
                                    }
                                }
                            }
                            hashMap = hashMap2;
                        }
                        c57802kt.A01 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return c57802kt;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
