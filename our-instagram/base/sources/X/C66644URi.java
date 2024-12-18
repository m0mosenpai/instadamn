package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.URi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66644URi extends C0T6 implements XG1 {
    public final UQy A00;
    public final UQz A01;
    public final UR0 A02;

    @Override // X.XG1
    public final C66644URi F5o() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66644URi) {
                C66644URi c66644URi = (C66644URi) obj;
                if (!C14360o3.A0K(this.A00, c66644URi.A00) || !C14360o3.A0K(this.A01, c66644URi.A01) || !C14360o3.A0K(this.A02, c66644URi.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG1
    public final /* bridge */ /* synthetic */ XG3 AxT() {
        return this.A00;
    }

    @Override // X.XG1
    public final /* bridge */ /* synthetic */ InterfaceC72030XFs BkP() {
        return this.A01;
    }

    @Override // X.XG1
    public final /* bridge */ /* synthetic */ InterfaceC72035XFx C9h() {
        return this.A02;
    }

    @Override // X.XG1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardDisplayInfoDict", AbstractC68549VVc.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31;
        UR0 ur0 = this.A02;
        if (ur0 != null) {
            i = ur0.hashCode();
        }
        return A0M + i;
    }

    public C66644URi(UQy uQy, UQz uQz, UR0 ur0) {
        this.A00 = uQy;
        this.A01 = uQz;
        this.A02 = ur0;
    }
}
