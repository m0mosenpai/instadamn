package X;

import java.io.IOException;

/* renamed from: X.KpJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46938KpJ {
    public static C34851kQ parseFromJson(C16L c16l) {
        EnumC159397Cz enumC159397Cz;
        C14360o3.A0B(c16l, 0);
        try {
            C34851kQ c34851kQ = new C34851kQ();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c34851kQ.A02 = AbstractC31172DnG.A0o(c16l);
                } else if ("message_id".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c34851kQ.A05 = A0m;
                } else if ("original_message_client_context".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c34851kQ.A03 = A0m2;
                } else if ("edited_text".equals(A0q)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c34851kQ.A04 = A0m3;
                } else if ("edit_count".equals(A0q)) {
                    c34851kQ.A00 = c16l.A1D();
                } else if ("is_ae".equals(A0q)) {
                    c34851kQ.A07 = c16l.A0d();
                } else if ("is_ae_open_eb".equals(A0q)) {
                    c34851kQ.A06 = c16l.A0d();
                } else if ("send_mode".equals(A0q)) {
                    EnumC159397Cz enumC159397Cz2 = (EnumC159397Cz) AbstractC166997dE.A0m(EnumC159397Cz.A01, c16l.A1D());
                    if (enumC159397Cz2 == null) {
                        enumC159397Cz2 = EnumC159397Cz.A06;
                    }
                    c34851kQ.A01 = enumC159397Cz2;
                } else {
                    AbstractC43669JTd.A01(c16l, c34851kQ, A0q);
                }
                c16l.A0z();
            }
            if (c34851kQ.A01 == null) {
                if (c34851kQ.A06) {
                    enumC159397Cz = EnumC159397Cz.A05;
                } else if (c34851kQ.A07) {
                    enumC159397Cz = EnumC159397Cz.A04;
                } else {
                    enumC159397Cz = EnumC159397Cz.A06;
                }
                c34851kQ.A01 = enumC159397Cz;
                return c34851kQ;
            }
            return c34851kQ;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
