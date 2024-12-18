package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4OY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OY {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.4NK, X.4OV, X.1ul] */
    public static C4OV parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c4nk = new C4NK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                ArrayList arrayList2 = null;
                if ("request_status".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c4nk.A00 = str;
                } else if ("qp_data".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C116955Re parseFromJson = AbstractC116945Rd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    c4nk.A02 = arrayList2;
                } else if ("extra_info".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C34514FJa parseFromJson2 = FAL.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    c4nk.A01 = arrayList;
                } else {
                    C55702hA.A01(c16l, c4nk, A0q);
                }
                c16l.A0z();
            }
            return c4nk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C4OV c4ov) {
        anonymousClass182.A0d();
        String str = c4ov.A00;
        if (str != null) {
            anonymousClass182.A0S("request_status", str);
        }
        if (c4ov.A02 != null) {
            C16V.A03(anonymousClass182, "qp_data");
            for (C116955Re c116955Re : c4ov.A02) {
                if (c116955Re != null) {
                    anonymousClass182.A0d();
                    Integer num = c116955Re.A01;
                    if (num != null) {
                        anonymousClass182.A0Q("surface", num.intValue());
                    }
                    if (c116955Re.A00 != null) {
                        anonymousClass182.A0r("data");
                        C116975Rg c116975Rg = c116955Re.A00;
                        anonymousClass182.A0d();
                        if (c116975Rg.A00 != null) {
                            anonymousClass182.A0r("viewer");
                            C116995Ri c116995Ri = c116975Rg.A00;
                            anonymousClass182.A0d();
                            if (c116995Ri.A00 != null) {
                                anonymousClass182.A0r(AbstractC111324zv.A00(908));
                                C117015Rk c117015Rk = c116995Ri.A00;
                                anonymousClass182.A0d();
                                if (c117015Rk.A00 != null) {
                                    C16V.A03(anonymousClass182, "edges");
                                    for (C117035Rm c117035Rm : c117015Rk.A00) {
                                        if (c117035Rm != null) {
                                            AbstractC117025Rl.A00(anonymousClass182, c117035Rm);
                                        }
                                    }
                                    anonymousClass182.A0Z();
                                }
                                anonymousClass182.A0a();
                            }
                            anonymousClass182.A0a();
                        }
                        anonymousClass182.A0a();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4ov.A01 != null) {
            C16V.A03(anonymousClass182, "extra_info");
            for (C34514FJa c34514FJa : c4ov.A01) {
                if (c34514FJa != null) {
                    anonymousClass182.A0d();
                    Integer num2 = c34514FJa.A00;
                    if (num2 != null) {
                        anonymousClass182.A0Q("surface", num2.intValue());
                    }
                    String str2 = c34514FJa.A01;
                    if (str2 != null) {
                        anonymousClass182.A0S("extra_info", str2);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        C55702hA.A00(anonymousClass182, c4ov);
        anonymousClass182.A0a();
    }
}
