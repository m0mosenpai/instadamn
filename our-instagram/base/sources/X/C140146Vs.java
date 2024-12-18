package X;

/* renamed from: X.6Vs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140146Vs {
    public static final C140146Vs A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r0 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A02(X.C103054kg r9, java.lang.Object r10, java.lang.Object r11, long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140146Vs.A02(X.4kg, java.lang.Object, java.lang.Object, long, boolean):boolean");
    }

    public static final C140196Vx A00(Exception exc, Object obj, long j) {
        C140156Vt c140156Vt;
        int i = (int) (j >>> 60);
        if (AbstractC86593tX.A0n(i)) {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4 || i == 5) {
                    throw exc;
                }
                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
            }
            if (!(obj instanceof C140156Vt) || (c140156Vt = (C140156Vt) obj) == null) {
                throw exc;
            }
            return new C140196Vx(null, c140156Vt.A03, null, null);
        }
        throw exc;
    }

    public final String A01(long j) {
        int i = (int) (j >>> 60);
        switch (i) {
            case 0:
                return "Test";
            case 1:
                return "AttributeBinding";
            case 2:
                return "MergeList";
            case 3:
                return "Resolve";
            case 4:
                return "Layout";
            case 5:
                return "RenderUnit";
            case 6:
                return "MountBinder";
            case 7:
                return "Extension";
            case 8:
                return "RUExecution";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown signal type: ");
                sb.append(i);
                sb.append(" for signal with id: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
        }
    }
}
