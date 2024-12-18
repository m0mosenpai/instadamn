package X;

import java.io.IOException;

/* renamed from: X.KpQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46945KpQ {
    public static C31741fH parseFromJson(C16L c16l) {
        EnumC159397Cz enumC159397Cz;
        C14360o3.A0B(c16l, 0);
        try {
            C31741fH c31741fH = new C31741fH();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("seen_marker".equals(A0s)) {
                    c31741fH.A01 = AbstractC46851Knk.parseFromJson(c16l);
                } else if ("is_shh_mode_message".equals(A0s)) {
                    c31741fH.A03 = c16l.A0d();
                } else if ("is_ae".equals(A0s)) {
                    c31741fH.A02 = c16l.A0d();
                } else if ("send_mode".equals(A0s)) {
                    EnumC159397Cz enumC159397Cz2 = (EnumC159397Cz) AbstractC166997dE.A0m(EnumC159397Cz.A01, c16l.A1D());
                    if (enumC159397Cz2 == null) {
                        enumC159397Cz2 = EnumC159397Cz.A06;
                    }
                    c31741fH.A00 = enumC159397Cz2;
                } else {
                    AbstractC43669JTd.A01(c16l, c31741fH, A0s);
                }
                c16l.A0z();
            }
            if (c31741fH.A00 == null) {
                if (c31741fH.A02) {
                    enumC159397Cz = EnumC159397Cz.A04;
                } else {
                    enumC159397Cz = EnumC159397Cz.A06;
                }
                c31741fH.A00 = enumC159397Cz;
                return c31741fH;
            }
            return c31741fH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
