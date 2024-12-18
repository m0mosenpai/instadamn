package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3vK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC87523vK {
    public static C106384qs parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            C106344qo c106344qo = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("questions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C106364qq parseFromJson = AbstractC106324qm.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("trigger_condition".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("undo_button".equals(A0q)) {
                    c106344qo = AbstractC106334qn.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C106384qs(c106344qo, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C106384qs c106384qs) {
        anonymousClass182.A0d();
        List<InterfaceC106374qr> list = c106384qs.A02;
        if (list != null) {
            C16V.A03(anonymousClass182, "questions");
            for (InterfaceC106374qr interfaceC106374qr : list) {
                if (interfaceC106374qr != null) {
                    AbstractC106324qm.A00(anonymousClass182, interfaceC106374qr.Eqe());
                }
            }
            anonymousClass182.A0Z();
        }
        String str = c106384qs.A01;
        if (str != null) {
            anonymousClass182.A0S("trigger_condition", str);
        }
        InterfaceC106354qp interfaceC106354qp = c106384qs.A00;
        if (interfaceC106354qp != null) {
            anonymousClass182.A0r("undo_button");
            AbstractC106334qn.A00(anonymousClass182, interfaceC106354qp.Eqd());
        }
        anonymousClass182.A0a();
    }
}
