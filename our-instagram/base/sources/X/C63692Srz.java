package X;

/* renamed from: X.Srz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63692Srz implements InterfaceC65310Thm {
    public final Integer A00;
    public final boolean A01;

    @Override // X.InterfaceC65310Thm
    public final InterfaceC65466Tki EqE(SQ2 sq2, Q2O q2o, AbstractC63678Srl abstractC63678Srl) {
        if (!q2o.A0R) {
            SQZ.A00("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C63666SrZ(this);
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "ADD";
                    break;
                case 2:
                    str = "SUBTRACT";
                    break;
                case 3:
                    str = "INTERSECT";
                    break;
                case 4:
                    str = "EXCLUDE_INTERSECTIONS";
                    break;
                default:
                    str = "MERGE";
                    break;
            }
        } else {
            str = "null";
        }
        return AnonymousClass001.A0S("MergePaths{mode=", str, '}');
    }

    public C63692Srz(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
