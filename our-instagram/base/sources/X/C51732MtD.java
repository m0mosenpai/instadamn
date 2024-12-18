package X;

import java.util.Map;

/* renamed from: X.MtD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51732MtD extends C0T6 {
    public static final C51732MtD A02 = new C51732MtD(null, AbstractC06930Yk.A0E());
    public final AbstractC53622NnT A00;
    public final Map A01;

    public C51732MtD() {
        this(null, AbstractC06930Yk.A0E());
    }

    public final Object A00(Class cls) {
        AbstractC53622NnT abstractC53622NnT;
        C14360o3.A0B(cls, 0);
        Object obj = this.A01.get(cls);
        if (obj == null) {
            C2N9 A00 = AbstractC53733NpM.A00(cls);
            if (A00 == null || (abstractC53622NnT = this.A00) == null) {
                return null;
            }
            return ((N02) abstractC53622NnT).A00.A00(A00);
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51732MtD) {
                C51732MtD c51732MtD = (C51732MtD) obj;
                if (!C14360o3.A0K(this.A00, c51732MtD.A00) || !C14360o3.A0K(this.A01, c51732MtD.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RpState(rsysAppModel=");
        A1C.append(this.A00);
        A1C.append(", nonRsysStateMap=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C51732MtD(AbstractC53622NnT abstractC53622NnT, Map map) {
        this.A00 = abstractC53622NnT;
        this.A01 = map;
    }
}
