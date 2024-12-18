package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OPe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54883OPe {
    public static final List A00(C47Z c47z) {
        List list = c47z.A4o;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC43593JPy.A1R(((C5QG) obj).A0I, EnumC150226pU.A0s.toString(), obj, A1E);
            }
            return A1E;
        }
        return C16930sl.A00;
    }

    public static final List A01(C47Z c47z) {
        C93094Fl c93094Fl;
        List list = c47z.A4o;
        if (list != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                C5QG c5qg = (C5QG) obj;
                if (AbstractC31174DnI.A1a(EnumC150226pU.A1i, c5qg.A0I) && (c93094Fl = c5qg.A02) != null && c93094Fl.A09 == 0 && c5qg.A0F == null) {
                    A1E.add(obj);
                }
            }
            return A1E;
        }
        return C16930sl.A00;
    }
}
