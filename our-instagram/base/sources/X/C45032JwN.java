package X;

import java.util.List;

/* renamed from: X.JwN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45032JwN extends C0T6 {
    public final EnumC46204Kcg A00;
    public final C47317KvS A01;
    public final C47317KvS A02;
    public final List A03;

    public C45032JwN(EnumC46204Kcg enumC46204Kcg, C47317KvS c47317KvS, C47317KvS c47317KvS2, List list) {
        AbstractC25233BEq.A0w(1, c47317KvS, list, c47317KvS2);
        this.A02 = c47317KvS;
        this.A00 = enumC46204Kcg;
        this.A03 = list;
        this.A01 = c47317KvS2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45032JwN) {
                C45032JwN c45032JwN = (C45032JwN) obj;
                if (!C14360o3.A0K(this.A02, c45032JwN.A02) || this.A00 != c45032JwN.A00 || !C14360o3.A0K(this.A03, c45032JwN.A03) || !C14360o3.A0K(this.A01, c45032JwN.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A03, (AbstractC166987dD.A0G(this.A02) + AbstractC167017dG.A0M(this.A00)) * 31));
    }
}
