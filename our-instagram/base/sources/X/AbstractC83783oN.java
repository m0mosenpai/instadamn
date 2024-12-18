package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3oN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83783oN {
    public static C9CK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9CK c9ck = new C9CK(1);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                if ("imagine_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9ck.A03 = str;
                } else if ("imagine_prompt".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c9ck.A01 = str2;
                } else if ("result_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c9ck.A02 = str3;
                } else if ("imagine_media_ids".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C9CG parseFromJson = AbstractC22712A0i.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c9ck.A00 = arrayList;
                }
                c16l.A0z();
            }
            return c9ck;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(C9CK c9ck, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c9ck.A03;
        if (str != null) {
            anonymousClass182.A0S("imagine_type", str);
        }
        String str2 = c9ck.A01;
        if (str2 != null) {
            anonymousClass182.A0S("imagine_prompt", str2);
        }
        String str3 = c9ck.A02;
        if (str3 != null) {
            anonymousClass182.A0S("result_id", str3);
        }
        if (c9ck.A00 != null) {
            C16V.A03(anonymousClass182, "imagine_media_ids");
            for (C9CG c9cg : (List) c9ck.A00) {
                if (c9cg != null) {
                    anonymousClass182.A0d();
                    String str4 = c9cg.A03;
                    if (str4 != null) {
                        anonymousClass182.A0S("media_id", str4);
                    }
                    String str5 = c9cg.A02;
                    if (str5 != null) {
                        anonymousClass182.A0S("imagine_media_id", str5);
                    }
                    Boolean bool = (Boolean) c9cg.A01;
                    if (bool != null) {
                        anonymousClass182.A0T("editable", bool.booleanValue());
                    }
                    Boolean bool2 = (Boolean) c9cg.A00;
                    if (bool2 != null) {
                        anonymousClass182.A0T("animatable", bool2.booleanValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
