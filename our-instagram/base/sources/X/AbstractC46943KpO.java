package X;

import java.io.IOException;

/* renamed from: X.KpO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46943KpO {
    public static C35181kx parseFromJson(C16L c16l) {
        EnumC159397Cz enumC159397Cz;
        C14360o3.A0B(c16l, 0);
        try {
            C35181kx c35181kx = new C35181kx();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c35181kx.A01 = AbstractC83623o5.parseFromJson(c16l);
                } else if ("message_id".equals(A0q)) {
                    c35181kx.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("message_client_context".equals(A0q)) {
                    c35181kx.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("object_id".equals(A0q)) {
                    c35181kx.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("mime_type".equals(A0q)) {
                    c35181kx.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("is_ae".equals(A0q)) {
                    c35181kx.A06 = c16l.A0d();
                } else if ("is_ae_open_eb".equals(A0q)) {
                    c35181kx.A07 = c16l.A0d();
                } else if ("send_mode".equals(A0q)) {
                    EnumC159397Cz enumC159397Cz2 = (EnumC159397Cz) AbstractC166997dE.A0m(EnumC159397Cz.A01, c16l.A1D());
                    if (enumC159397Cz2 == null) {
                        enumC159397Cz2 = EnumC159397Cz.A06;
                    }
                    c35181kx.A00 = enumC159397Cz2;
                } else {
                    AbstractC43669JTd.A01(c16l, c35181kx, A0q);
                }
                c16l.A0z();
            }
            if (c35181kx.A00 == null) {
                if (c35181kx.A07) {
                    enumC159397Cz = EnumC159397Cz.A05;
                } else if (c35181kx.A06) {
                    enumC159397Cz = EnumC159397Cz.A04;
                } else {
                    enumC159397Cz = EnumC159397Cz.A06;
                }
                c35181kx.A00 = enumC159397Cz;
                return c35181kx;
            }
            return c35181kx;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
