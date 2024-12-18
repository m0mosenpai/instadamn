package X;

import java.util.ArrayList;

/* renamed from: X.0fr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09900fr implements C1EH {
    public final int A00;

    public C09900fr(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.0jR] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0jT, java.lang.Object] */
    @Override // X.C1EH
    public final /* bridge */ /* synthetic */ Object invoke(C16L c16l) {
        String A1P;
        String A1P2;
        if (this.A00 != 0) {
            ?? obj = new Object();
            if (c16l.A11() == C16R.A0D) {
                while (c16l.A1J() != C16R.A09) {
                    String A0q = c16l.A0q();
                    c16l.A1J();
                    if ("errors".equals(A0q)) {
                        ArrayList arrayList = null;
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P2 = c16l.A1P()) != null) {
                                    arrayList.add(A1P2);
                                }
                            }
                        }
                        obj.A00 = arrayList;
                    }
                    c16l.A0z();
                }
                return obj;
            }
        } else {
            ?? obj2 = new Object();
            if (c16l.A11() == C16R.A0D) {
                while (c16l.A1J() != C16R.A09) {
                    String A0q2 = c16l.A0q();
                    c16l.A1J();
                    if ("view_tags".equals(A0q2)) {
                        ArrayList arrayList2 = null;
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                    arrayList2.add(A1P);
                                }
                            }
                        }
                        obj2.A00 = arrayList2;
                    }
                    c16l.A0z();
                }
                return obj2;
            }
        }
        c16l.A0z();
        return null;
    }
}
