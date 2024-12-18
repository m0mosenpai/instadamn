package X;

import java.util.Iterator;

/* loaded from: classes9.dex */
public abstract class OIE {
    public O1E A00;
    public O1E A01;
    public O1E A02;

    public final void A00(O1E o1e, EnumC53109NeM enumC53109NeM) {
        C14360o3.A0B(enumC53109NeM, 0);
        int ordinal = enumC53109NeM.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (!C14360o3.A0K(this.A00, o1e)) {
                        this.A00 = o1e;
                    } else {
                        return;
                    }
                }
            } else if (C14360o3.A0K(this.A02, o1e)) {
                return;
            } else {
                this.A02 = o1e;
            }
        } else if (C14360o3.A0K(this.A01, o1e)) {
            return;
        } else {
            this.A01 = o1e;
        }
        if (this instanceof C51067MhN) {
            PW7 pw7 = (PW7) ((C51067MhN) this).A00.A01;
            AbstractC23641Du.A05(pw7.A06, new MC7(enumC53109NeM, o1e, pw7, null, 4), pw7.A07);
        } else {
            Iterator it = ((C51066MhM) this).A00.A08.iterator();
            while (it.hasNext()) {
                ((InterfaceC16620sF) it.next()).invoke(enumC53109NeM, o1e);
            }
        }
    }

    public OIE() {
        C51057MhB c51057MhB = C51057MhB.A01;
        this.A01 = c51057MhB;
        this.A02 = c51057MhB;
        this.A00 = c51057MhB;
    }
}
