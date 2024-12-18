package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC83533nu {
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, X.3nw] */
    public static C83553nw parseFromJson(C16L c16l) {
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
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                String str3 = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                String str4 = null;
                if ("bold".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C111234zl parseFromJson = AbstractC111224zk.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A06 = arrayList;
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    obj.A03 = str2;
                } else if ("action_log_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    obj.A02 = str3;
                } else if ("is_reaction_log".equals(A0q)) {
                    obj.A09 = c16l.A0d();
                } else if ("text_attributes".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C909943r parseFromJson2 = AbstractC909843q.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList2.add(parseFromJson2);
                            }
                        }
                    }
                    obj.A07 = arrayList2;
                } else if ("text_parts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C9CN parseFromJson3 = AbstractC83573ny.parseFromJson(c16l);
                            if (parseFromJson3 != null) {
                                arrayList3.add(parseFromJson3);
                            }
                        }
                    }
                    obj.A08 = arrayList3;
                } else if ("instamadillo_admin_message_info".equals(A0q)) {
                    obj.A01 = F4M.parseFromJson(c16l);
                } else if ("emoji".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    obj.A04 = str4;
                } else if ("target_message_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    obj.A05 = str;
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

    public static void A00(AnonymousClass182 anonymousClass182, C83553nw c83553nw) {
        anonymousClass182.A0d();
        if (c83553nw.A06 != null) {
            C16V.A03(anonymousClass182, "bold");
            for (C111234zl c111234zl : c83553nw.A06) {
                if (c111234zl != null) {
                    anonymousClass182.A0d();
                    anonymousClass182.A0Q("start", c111234zl.A01);
                    anonymousClass182.A0Q("end", c111234zl.A00);
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str = c83553nw.A03;
        if (str != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str);
        }
        String str2 = c83553nw.A02;
        if (str2 != null) {
            anonymousClass182.A0S("action_log_type", str2);
        }
        anonymousClass182.A0T("is_reaction_log", c83553nw.A09);
        if (c83553nw.A07 != null) {
            C16V.A03(anonymousClass182, "text_attributes");
            for (C909943r c909943r : c83553nw.A07) {
                if (c909943r != null) {
                    AbstractC909843q.A00(anonymousClass182, c909943r);
                }
            }
            anonymousClass182.A0Z();
        }
        if (c83553nw.A08 != null) {
            C16V.A03(anonymousClass182, "text_parts");
            for (C9CN c9cn : c83553nw.A08) {
                if (c9cn != null) {
                    anonymousClass182.A0d();
                    String str3 = c9cn.A05;
                    if (str3 != null) {
                        anonymousClass182.A0S("text", str3);
                    }
                    Boolean bool = (Boolean) c9cn.A01;
                    if (bool != null) {
                        anonymousClass182.A0T("bold", bool.booleanValue());
                    }
                    String str4 = c9cn.A03;
                    if (str4 != null) {
                        anonymousClass182.A0S("color", str4);
                    }
                    String str5 = c9cn.A02;
                    if (str5 != null) {
                        anonymousClass182.A0S("intent", str5);
                    }
                    String str6 = c9cn.A04;
                    if (str6 != null) {
                        anonymousClass182.A0S("semantic_color", str6);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        if (c83553nw.A01 != null) {
            anonymousClass182.A0r("instamadillo_admin_message_info");
            C31200Dnj c31200Dnj = c83553nw.A01;
            anonymousClass182.A0d();
            String str7 = c31200Dnj.A00;
            if (str7 != null) {
                anonymousClass182.A0S("message_type", str7);
            }
            anonymousClass182.A0a();
        }
        String str8 = c83553nw.A04;
        if (str8 != null) {
            anonymousClass182.A0S("emoji", str8);
        }
        String str9 = c83553nw.A05;
        if (str9 != null) {
            anonymousClass182.A0S("target_message_id", str9);
        }
        anonymousClass182.A0a();
    }
}
