package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Pyn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58619Pyn {
    public final AbstractC64290T7z A00;
    public final C58620Pyo A01;

    public static C58619Pyn A00(char separator) {
        return new C58619Pyn(C58630Pyy.A00, new C58620Pyo(new C58618Pym(separator)));
    }

    public C58619Pyn(AbstractC64290T7z abstractC64290T7z, C58620Pyo c58620Pyo) {
        this.A01 = c58620Pyo;
        this.A00 = abstractC64290T7z;
    }

    public final List A01(CharSequence sequence) {
        sequence.getClass();
        RPa rPa = new RPa(this.A01, this, sequence);
        ArrayList A1E = AbstractC166987dD.A1E();
        while (rPa.hasNext()) {
            AbstractC58318PtA.A1W(A1E, rPa);
        }
        return Collections.unmodifiableList(A1E);
    }
}
