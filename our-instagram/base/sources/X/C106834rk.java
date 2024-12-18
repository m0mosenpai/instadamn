package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106834rk extends C0T6 implements InterfaceC106844rl {
    public final Long A00;
    public final Long A01;

    @Override // X.InterfaceC106844rl
    public final C106834rk Eyu() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106834rk) {
                C106834rk c106834rk = (C106834rk) obj;
                if (!C14360o3.A0K(this.A00, c106834rk.A00) || !C14360o3.A0K(this.A01, c106834rk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long l = this.A00;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.A01;
        return hashCode + (l2 != null ? l2.hashCode() : 0);
    }

    @Override // X.InterfaceC106844rl
    public final Long B2A() {
        return this.A00;
    }

    @Override // X.InterfaceC106844rl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTQuietModePauseWindow", C9xJ.A00(this));
    }

    @Override // X.InterfaceC106844rl
    public final Long getStartTimestamp() {
        return this.A01;
    }

    public C106834rk(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }
}
