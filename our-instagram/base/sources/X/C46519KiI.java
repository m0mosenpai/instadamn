package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KiI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46519KiI {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public List A06;

    public final List A00() {
        EnumC150226pU enumC150226pU;
        List list = this.A00;
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C148286ly A0Y = AbstractC43592JPx.A0Y(it);
            String str = A0Y.A0a;
            A0Y.A0S = str;
            C148276lx c148276lx = C148276lx.A1d;
            List singletonList = Collections.singletonList(A0Y);
            if (A0Y.A04() == C05F.A0N) {
                enumC150226pU = EnumC150226pU.A0A;
            } else {
                enumC150226pU = EnumC150226pU.A0C;
            }
            A1E.add(new C148276lx(enumC150226pU, str, singletonList));
        }
        return A1E;
    }

    public final List A01() {
        return AbstractC43594JPz.A12(this.A04);
    }
}
