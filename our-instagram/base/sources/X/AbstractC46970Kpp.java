package X;

import java.io.IOException;

/* renamed from: X.Kpp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46970Kpp {
    public static C31391ei parseFromJson(C16L c16l) {
        EnumC159397Cz enumC159397Cz;
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C31391ei c31391ei = new C31391ei();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c31391ei.A02 = AbstractC83623o5.parseFromJson(c16l);
                } else if ("message_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c31391ei.A03 = A1P;
                } else if ("reaction_mutation".equals(A0q)) {
                    c31391ei.A01 = AbstractC46846Knf.parseFromJson(c16l);
                } else if ("is_shh_mode_message".equals(A0q)) {
                    c31391ei.A06 = c16l.A0d();
                } else if ("is_ae".equals(A0q)) {
                    c31391ei.A05 = c16l.A0d();
                } else if ("is_ae_open_eb".equals(A0q)) {
                    c31391ei.A04 = c16l.A0d();
                } else if ("send_mode".equals(A0q)) {
                    EnumC159397Cz enumC159397Cz2 = (EnumC159397Cz) AbstractC166997dE.A0m(EnumC159397Cz.A01, c16l.A1D());
                    if (enumC159397Cz2 == null) {
                        enumC159397Cz2 = EnumC159397Cz.A06;
                    }
                    c31391ei.A00 = enumC159397Cz2;
                } else {
                    AbstractC43669JTd.A01(c16l, c31391ei, A0q);
                }
                c16l.A0z();
            }
            if (c31391ei.A00 == null) {
                if (c31391ei.A04) {
                    enumC159397Cz = EnumC159397Cz.A05;
                } else if (c31391ei.A05) {
                    enumC159397Cz = EnumC159397Cz.A04;
                } else {
                    enumC159397Cz = EnumC159397Cz.A06;
                }
                c31391ei.A00 = enumC159397Cz;
                return c31391ei;
            }
            return c31391ei;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
