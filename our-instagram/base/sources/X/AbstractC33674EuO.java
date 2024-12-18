package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.EuO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33674EuO {
    public static C32048E6a parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str = null;
            E6X e6x = null;
            HashMap hashMap = null;
            E7c e7c = null;
            Long l = null;
            User user = null;
            String str2 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if (TraceFieldType.ContentType.equals(A0s)) {
                        num = AbstractC166997dE.A0h(c16l);
                    } else if ("is_liked_by_creator".equals(A0s)) {
                        bool = AbstractC166997dE.A0d(c16l);
                    } else if ("is_top_response".equals(A0s)) {
                        bool2 = AbstractC166997dE.A0d(c16l);
                    } else if ("item_id".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    } else if ("media_info".equals(A0s)) {
                        e6x = AbstractC39834Hli.parseFromJson(c16l);
                    } else if ("reactions".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                c16l.A1J();
                                if (c16l.A11() == C16R.A0G) {
                                    hashMap.put(A1P, null);
                                } else {
                                    Integer A0h = AbstractC166997dE.A0h(c16l);
                                    if (A0h != null) {
                                        hashMap.put(A1P, A0h);
                                    }
                                }
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if ("text_info".equals(A0s)) {
                        e7c = AbstractC33673EuN.parseFromJson(c16l);
                    } else if ("timestamp".equals(A0s)) {
                        l = AbstractC31173DnH.A0h(c16l);
                    } else if (AbstractC31171DnF.A1Z(A0s)) {
                        user = AbstractC31171DnF.A0S(c16l, false);
                    } else if (MSV.A00(126).equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str2 = null;
                        } else {
                            str2 = c16l.A1P();
                        }
                    }
                    c16l.A0z();
                } else {
                    return new C32048E6a(e6x, e7c, user, bool, bool2, num, l, str, str2, hashMap);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
