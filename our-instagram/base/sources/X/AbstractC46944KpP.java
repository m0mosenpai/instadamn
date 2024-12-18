package X;

import java.io.IOException;

/* renamed from: X.KpP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46944KpP {
    public static C31701fD parseFromJson(C16L c16l) {
        EnumC159397Cz enumC159397Cz;
        C14360o3.A0B(c16l, 0);
        try {
            C31701fD c31701fD = new C31701fD();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("seen_marker".equals(A0s)) {
                    c31701fD.A01 = AbstractC46850Knj.parseFromJson(c16l);
                } else if ("is_shh_mode_message".equals(A0s)) {
                    c31701fD.A06 = c16l.A0d();
                } else if ("is_ae".equals(A0s)) {
                    c31701fD.A04 = c16l.A0d();
                } else if ("is_ae_open_eb".equals(A0s)) {
                    c31701fD.A05 = c16l.A0d();
                } else if ("send_mode".equals(A0s)) {
                    EnumC159397Cz enumC159397Cz2 = (EnumC159397Cz) AbstractC166997dE.A0m(EnumC159397Cz.A01, c16l.A1D());
                    if (enumC159397Cz2 == null) {
                        enumC159397Cz2 = EnumC159397Cz.A06;
                    }
                    c31701fD.A00 = enumC159397Cz2;
                } else if ("mime_type".equals(A0s)) {
                    c31701fD.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("object_id".equals(A0s)) {
                    c31701fD.A03 = AbstractC167017dG.A0m(c16l);
                } else {
                    AbstractC43669JTd.A01(c16l, c31701fD, A0s);
                }
                c16l.A0z();
            }
            if (c31701fD.A00 == null) {
                if (c31701fD.A05) {
                    enumC159397Cz = EnumC159397Cz.A05;
                } else if (c31701fD.A04) {
                    enumC159397Cz = EnumC159397Cz.A04;
                } else {
                    enumC159397Cz = EnumC159397Cz.A06;
                }
                c31701fD.A00 = enumC159397Cz;
                return c31701fD;
            }
            return c31701fD;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
