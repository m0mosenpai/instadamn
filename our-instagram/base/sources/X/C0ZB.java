package X;

import java.util.ArrayList;

/* renamed from: X.0ZB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ZB {
    public final C0Gd A00;
    public final InterfaceC08830cm A01;
    public final C0R9 A02;

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, X.0ZG] */
    public static C0eI A00(C222015v c222015v, String str) {
        C05690Rt c05690Rt = null;
        C16L A03 = c222015v.A03(str);
        C16R A1J = A03.A1J();
        C16R c16r = C16R.A0D;
        if (A1J == c16r) {
            boolean z = false;
            while (true) {
                C16R A1J2 = A03.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J2 != c16r2) {
                    if (A03.A11() == C16R.A0A) {
                        try {
                            int parseInt = Integer.parseInt(A03.A0q());
                            if (A03.A1J() == c16r) {
                                String[] strArr = null;
                                String[] strArr2 = null;
                                while (A03.A1J() != c16r2) {
                                    String A0q = A03.A0q();
                                    if (!A0q.equals("points")) {
                                        if (A0q.equals("annotations")) {
                                            strArr = A01(A03);
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Invalid content of the marker config in crash resiliency: only annotations or points are allowed at ");
                                            sb.append(A03.A1H());
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                    } else {
                                        strArr2 = A01(A03);
                                    }
                                }
                                if (!z) {
                                    z = true;
                                    c05690Rt = new C05690Rt();
                                }
                                ?? obj = new Object();
                                obj.A00 = C0ZF.A00(strArr);
                                obj.A01 = C0ZF.A00(strArr2);
                                c05690Rt.put(parseInt, obj);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid value of crashResiliency: expecting dict[?annotations => vec[string], ?points => vec[string]] at ");
                                sb2.append(A03.A1H());
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        } catch (NumberFormatException unused) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Invalid format of crashResiliency: each key should be an integer (markerId) at ");
                            sb3.append(A03.A1H());
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Unsupported format for crashResiliency: expecting field name at ");
                        sb4.append(A03.A1H());
                        throw new IllegalArgumentException(sb4.toString());
                    }
                } else {
                    if (!z) {
                        return null;
                    }
                    c05690Rt.A00 = true;
                    c05690Rt.size();
                    return new C0eI(c05690Rt);
                }
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Unsupported format for crashResiliency: expecting object at ");
            sb5.append(A03.A1H());
            throw new IllegalArgumentException(sb5.toString());
        }
    }

    public C0ZB(C0Gd c0Gd, C0R9 c0r9, InterfaceC08830cm interfaceC08830cm) {
        this.A01 = interfaceC08830cm;
        this.A00 = c0Gd;
        this.A02 = c0r9;
    }

    public static String[] A01(C16L c16l) {
        if (c16l.A1J() == C16R.A0C) {
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A08) {
                if (c16l.A11() == C16R.A0J) {
                    String A1Q = c16l.A1Q();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(A1Q);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expecting array of strings at ");
                    sb.append(c16l.A1H());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (arrayList == null) {
                return null;
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unsupported format: expecting array of strings at ");
        sb2.append(c16l.A1H());
        throw new IllegalArgumentException(sb2.toString());
    }
}
