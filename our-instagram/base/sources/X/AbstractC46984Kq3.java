package X;

import java.io.IOException;

/* renamed from: X.Kq3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46984Kq3 {
    public static C31561ez parseFromJson(C16L c16l) {
        EnumC159397Cz enumC159397Cz;
        C14360o3.A0B(c16l, 0);
        try {
            C31561ez c31561ez = new C31561ez();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c31561ez.A01 = AbstractC83623o5.parseFromJson(c16l);
                } else if ("item_id".equals(A0q)) {
                    c31561ez.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("original_message_client_context".equals(A0q)) {
                    c31561ez.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("is_shh_mode_message".equals(A0q)) {
                    c31561ez.A06 = c16l.A0d();
                } else if ("is_ae".equals(A0q)) {
                    c31561ez.A05 = c16l.A0d();
                } else if ("is_ae_open_eb".equals(A0q)) {
                    c31561ez.A04 = c16l.A0d();
                } else if ("send_mode".equals(A0q)) {
                    EnumC159397Cz enumC159397Cz2 = (EnumC159397Cz) AbstractC166997dE.A0m(EnumC159397Cz.A01, c16l.A1D());
                    if (enumC159397Cz2 == null) {
                        enumC159397Cz2 = EnumC159397Cz.A06;
                    }
                    c31561ez.A00 = enumC159397Cz2;
                } else {
                    AbstractC43669JTd.A01(c16l, c31561ez, A0q);
                }
                c16l.A0z();
            }
            if (c31561ez.A00 == null) {
                if (c31561ez.A04) {
                    enumC159397Cz = EnumC159397Cz.A05;
                } else if (c31561ez.A05) {
                    enumC159397Cz = EnumC159397Cz.A04;
                } else {
                    enumC159397Cz = EnumC159397Cz.A06;
                }
                c31561ez.A00 = enumC159397Cz;
                return c31561ez;
            }
            return c31561ez;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
