package X;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1wN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41731wN {
    public static C41751wP parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            C41751wP c41751wP = new C41751wP();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                HashMap hashMap = null;
                ArrayList arrayList2 = null;
                HashMap hashMap2 = null;
                if ("timestamps".equals(A0q)) {
                    if (c16l.A11() == c16r) {
                        HashMap hashMap3 = new HashMap();
                        while (c16l.A1J() != c16r2) {
                            String A1P3 = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                hashMap3.put(A1P3, null);
                            } else {
                                Long valueOf = Long.valueOf(c16l.A0y());
                                if (valueOf != null) {
                                    hashMap3.put(A1P3, valueOf);
                                }
                            }
                        }
                        hashMap = hashMap3;
                    }
                    c41751wP.A01 = hashMap;
                } else if ("keys".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                arrayList2.add(A1P2);
                            }
                        }
                    }
                    c41751wP.A02 = arrayList2;
                } else if ("reel_id_to_seen_media_ids".equals(A0q)) {
                    if (c16l.A11() == c16r) {
                        HashMap hashMap4 = new HashMap();
                        while (c16l.A1J() != c16r2) {
                            String A1P4 = c16l.A1P();
                            c16l.A1J();
                            if (c16l.A11() == C16R.A0G) {
                                hashMap4.put(A1P4, null);
                            } else {
                                String A1P5 = c16l.A1P();
                                if (A1P5 != null) {
                                    hashMap4.put(A1P4, A1P5);
                                }
                            }
                        }
                        hashMap2 = hashMap4;
                    }
                    c41751wP.A00 = hashMap2;
                } else if ("media_seen_state_keys".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    c41751wP.A03 = arrayList;
                }
                c16l.A0z();
            }
            c41751wP.A05.putAll(c41751wP.A01);
            for (Map.Entry entry : c41751wP.A00.entrySet()) {
                HashMap hashMap5 = c41751wP.A04;
                Object key = entry.getKey();
                Object obj = (List) new Gson().A08((String) entry.getValue(), List.class);
                if (obj == null) {
                    obj = new ArrayList();
                }
                hashMap5.put(key, obj);
            }
            return c41751wP;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C41751wP c41751wP) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        if (c41751wP.A01 != null) {
            A0A.A0r("timestamps");
            A0A.A0d();
            for (Map.Entry entry : c41751wP.A01.entrySet()) {
                if (!C16V.A04(A0A, entry)) {
                    A0A.A0i(((Number) entry.getValue()).longValue());
                }
            }
            A0A.A0a();
        }
        if (c41751wP.A02 != null) {
            C16V.A03(A0A, "keys");
            for (String str : c41751wP.A02) {
                if (str != null) {
                    A0A.A0u(str);
                }
            }
            A0A.A0Z();
        }
        if (c41751wP.A00 != null) {
            A0A.A0r("reel_id_to_seen_media_ids");
            A0A.A0d();
            for (Map.Entry entry2 : c41751wP.A00.entrySet()) {
                if (!C16V.A04(A0A, entry2)) {
                    A0A.A0u((String) entry2.getValue());
                }
            }
            A0A.A0a();
        }
        if (c41751wP.A03 != null) {
            C16V.A03(A0A, "media_seen_state_keys");
            for (String str2 : c41751wP.A03) {
                if (str2 != null) {
                    A0A.A0u(str2);
                }
            }
            A0A.A0Z();
        }
        A0A.A0a();
        A0A.close();
        return stringWriter.toString();
    }
}
