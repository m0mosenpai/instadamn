package X;

import java.util.List;

/* renamed from: X.ACj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23009ACj {
    public final EnumC173197nX A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23009ACj) {
                C23009ACj c23009ACj = (C23009ACj) obj;
                if (this.A00 != c23009ACj.A00 || !C14360o3.A0K(this.A03, c23009ACj.A03) || !C14360o3.A0K(this.A02, c23009ACj.A02) || !C14360o3.A0K(this.A01, c23009ACj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C23009ACj(EnumC173197nX enumC173197nX, List list, List list2) {
        List A1Q = AbstractC16960so.A1Q(EnumC173547o6.BLOCK, EnumC173547o6.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        this.A00 = enumC173197nX;
        this.A03 = list;
        this.A02 = list2;
        this.A01 = A1Q;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0G(this.A00))));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FeatureConfigValidationParam(appName=");
        A1C.append(this.A00);
        A1C.append(", surfaces=");
        A1C.append(this.A03);
        A1C.append(", contentTypes=");
        A1C.append(this.A02);
        A1C.append(", behaviors=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
