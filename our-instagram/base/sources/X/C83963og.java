package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C83963og extends C0T6 implements InterfaceC83973oh {
    public final Boolean A00;
    public final Integer A01;

    @Override // X.InterfaceC83973oh
    public final C83963og Erq() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C83963og) {
                C83963og c83963og = (C83963og) obj;
                if (!C14360o3.A0K(this.A01, c83963og.A01) || !C14360o3.A0K(this.A00, c83963og.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.A00;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC83973oh
    public final Integer BXd() {
        return this.A01;
    }

    @Override // X.InterfaceC83973oh
    public final Boolean Bvv() {
        return this.A00;
    }

    @Override // X.InterfaceC83973oh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsAchievementsInfo", AbstractC37380GdM.A00(this));
    }

    public C83963og(Boolean bool, Integer num) {
        this.A01 = num;
        this.A00 = bool;
    }
}
