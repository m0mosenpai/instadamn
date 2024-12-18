package X;

import com.instagram.api.schemas.IGUserHighlightsTrayType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I2l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40705I2l {
    public static C3NO parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            C74433Vz c74433Vz = null;
            String str2 = null;
            Boolean bool = null;
            IGUserHighlightsTrayType iGUserHighlightsTrayType = null;
            Boolean bool2 = null;
            Integer num = null;
            Integer num2 = null;
            Boolean bool3 = null;
            Integer num3 = null;
            C3NK c3nk = null;
            Integer num4 = null;
            ArrayList arrayList2 = null;
            ArrayList arrayList3 = null;
            C37771pE c37771pE = null;
            C114855Gv c114855Gv = null;
            Boolean bool4 = null;
            String str3 = null;
            ArrayList arrayList4 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("broadcasts".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C37941pb parseFromJson = AbstractC108524ud.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC58317Pt9.A00(235).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("client_hints".equals(A0s)) {
                    c74433Vz = AbstractC74353Vr.parseFromJson(c16l);
                } else if ("cursor".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC58317Pt9.A00(286).equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC111324zv.A00(2453).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    iGUserHighlightsTrayType = AbstractC81803kw.A00(A1P);
                } else if (AbstractC58317Pt9.A00(302).equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC58317Pt9.A00(310).equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC58317Pt9.A00(311).equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(1119).equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC58317Pt9.A00(315).equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC58317Pt9.A00(338).equals(A0s)) {
                    c3nk = C3NH.parseFromJson(c16l);
                } else if (AbstractC58317Pt9.A00(351).equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(516).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC111324zv.A00(3025).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if (AbstractC111324zv.A00(3065).equals(A0s)) {
                    c37771pE = AbstractC38741r6.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(3079).equals(A0s)) {
                    c114855Gv = Hr7.parseFromJson(c16l);
                } else if (AbstractC58317Pt9.A00(372).equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("story_ranking_token".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("tray".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C37771pE parseFromJson2 = AbstractC38741r6.parseFromJson(c16l);
                            if (parseFromJson2 != null) {
                                arrayList4.add(parseFromJson2);
                            }
                        }
                    } else {
                        arrayList4 = null;
                    }
                }
                c16l.A0z();
            }
            return new C3NO(c74433Vz, iGUserHighlightsTrayType, c114855Gv, c3nk, c37771pE, bool, bool2, bool3, bool4, num, num2, num3, num4, str, str2, str3, arrayList, arrayList2, arrayList3, arrayList4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
