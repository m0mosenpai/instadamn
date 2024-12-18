package X;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.Sew, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63194Sew {
    public int A00;
    public int A01;
    public InterfaceC65434Tk5 A02;
    public java.util.Set A03;
    public final java.util.Set A04;
    public final java.util.Set A05;

    public static C63194Sew A00(Class cls) {
        return new C63194Sew(cls, new Class[0]);
    }

    public static C63180Sef A01(C63194Sew c63194Sew, InterfaceC65434Tk5 interfaceC65434Tk5) {
        c63194Sew.A02 = interfaceC65434Tk5;
        return c63194Sew.A02();
    }

    public final C63180Sef A02() {
        if (AbstractC167007dF.A1W(this.A02)) {
            return new C63180Sef(this.A02, AbstractC31171DnF.A0k(this.A05), AbstractC31171DnF.A0k(this.A04), this.A03, this.A00, this.A01);
        }
        throw AbstractC166987dD.A14("Missing required property: factory.");
    }

    public final void A03(C62995SaJ c62995SaJ) {
        if (!this.A05.contains(c62995SaJ.A02)) {
            this.A04.add(c62995SaJ);
            return;
        }
        throw AbstractC166987dD.A12("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C63194Sew(Class cls, Class... clsArr) {
        HashSet A1H = AbstractC166987dD.A1H();
        this.A05 = A1H;
        this.A04 = AbstractC166987dD.A1H();
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = AbstractC166987dD.A1H();
        A1H.add(cls);
        for (Class cls2 : clsArr) {
            if (cls2 == null) {
                throw AbstractC166987dD.A15("Null interface");
            }
        }
        Collections.addAll(this.A05, clsArr);
    }
}
