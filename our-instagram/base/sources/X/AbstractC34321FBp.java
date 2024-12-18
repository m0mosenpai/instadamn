package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.FBp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34321FBp {
    public static C64022vN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C64022vN c64022vN = new C64022vN();
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
                    String A0s = AbstractC166997dE.A0s(c16l);
                    ArrayList arrayList = null;
                    HashMap hashMap = null;
                    HashMap hashMap2 = null;
                    HashMap hashMap3 = null;
                    HashMap hashMap4 = null;
                    if (TraceFieldType.RequestID.equals(A0s)) {
                        c64022vN.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(3056).equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap A1G = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1G.put(A1P, null);
                                } else {
                                    C6XA parseFromJson = AbstractC34846FXe.parseFromJson(c16l);
                                    if (parseFromJson != null) {
                                        A1G.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1G;
                        }
                        c64022vN.A03 = hashMap;
                    } else if (AbstractC111324zv.A00(3113).equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            HashMap A1G2 = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P2 = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    A1G2.put(A1P2, null);
                                } else {
                                    C6XA parseFromJson2 = AbstractC34846FXe.parseFromJson(c16l);
                                    if (parseFromJson2 != null) {
                                        A1G2.put(A1P2, parseFromJson2);
                                    }
                                }
                            }
                            hashMap2 = A1G2;
                        }
                        c64022vN.A05 = hashMap2;
                    } else if (AbstractC111324zv.A00(3057).equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap3 = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap3);
                            }
                        }
                        c64022vN.A04 = hashMap3;
                    } else if (AbstractC111324zv.A00(3114).equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap4 = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap4);
                            }
                        }
                        c64022vN.A06 = hashMap4;
                    } else if (AbstractC111324zv.A00(4477).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList);
                            }
                        }
                        c64022vN.A07 = arrayList;
                    } else if ("container_module".equals(A0s)) {
                        c64022vN.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("notification_type".equals(A0s)) {
                        c64022vN.A00 = AbstractC167017dG.A0m(c16l);
                    }
                    c16l.A0z();
                } else {
                    return c64022vN;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
