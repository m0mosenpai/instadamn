package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OHg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54751OHg {
    public static C54751OHg A01;
    public final C2GS A00;

    public final List A00() {
        List list;
        C51646Mrd c51646Mrd = (C51646Mrd) this.A00.A02();
        if (c51646Mrd != null && (list = c51646Mrd.A0C) != null) {
            ArrayList A0q = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0q.add(((C109724wz) it.next()).A02);
            }
            return A0q;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Mrd, java.lang.Object] */
    public C54751OHg() {
        HashMap A1G = AbstractC166987dD.A1G();
        HashMap A1G2 = AbstractC166987dD.A1G();
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 9);
        ?? obj = new Object();
        obj.A02 = "";
        obj.A05 = "";
        obj.A0D = false;
        obj.A03 = "";
        obj.A04 = "";
        obj.A01 = "";
        obj.A0B = A1G;
        obj.A0A = A1G2;
        obj.A0C = c16930sl;
        obj.A09 = "";
        obj.A00 = null;
        obj.A06 = "";
        obj.A08 = "";
        obj.A07 = "";
        this.A00 = new C2GT(obj);
    }
}
