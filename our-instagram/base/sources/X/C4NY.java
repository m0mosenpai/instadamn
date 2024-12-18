package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4NY, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4NY {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.4NZ, java.lang.Object] */
    public static C4NZ parseFromJson(C16L c16l) {
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
                ArrayList arrayList = null;
                String str = null;
                ArrayList arrayList2 = null;
                if ("clause_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A00 = str;
                } else if ("filters".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C94494Nb parseFromJson = AbstractC94484Na.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList2;
                } else if ("clauses".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C4NZ parseFromJson2 = parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A01 = arrayList;
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

    public static void A00(AnonymousClass182 anonymousClass182, C4NZ c4nz) {
        anonymousClass182.A0d();
        String str = c4nz.A00;
        if (str != null) {
            anonymousClass182.A0S("clause_type", str);
        }
        if (c4nz.A02 != null) {
            C16V.A03(anonymousClass182, "filters");
            for (C94494Nb c94494Nb : c4nz.A02) {
                if (c94494Nb != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0S("filter_type", c94494Nb.A00.toString());
                    String str2 = c94494Nb.A02;
                    if (str2 != null) {
                        anonymousClass182.A0S("unknown_action", str2);
                    }
                    if (c94494Nb.A01 != null) {
                        anonymousClass182.A0r(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        AbstractC94504Nd.A00(anonymousClass182, c94494Nb.A01);
                    }
                    if (c94494Nb.A03 != null) {
                        C16V.A03(anonymousClass182, "extra_datas");
                        for (C94514Ne c94514Ne : c94494Nb.A03) {
                            if (c94514Ne != null) {
                                AbstractC94504Nd.A00(anonymousClass182, c94514Ne);
                            }
                        }
                        anonymousClass182.A0Z();
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c4nz.A01 != null) {
            C16V.A03(anonymousClass182, "clauses");
            for (C4NZ c4nz2 : c4nz.A01) {
                if (c4nz2 != null) {
                    A00(anonymousClass182, c4nz2);
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
