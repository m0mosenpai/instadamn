package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115875Md extends C0T6 implements InterfaceC115885Me {
    public final User A00;
    public final List A01;

    @Override // X.InterfaceC115885Me
    public final InterfaceC115885Me E9T(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC115885Me
    public final C115875Md ExT(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115875Md) {
                C115875Md c115875Md = (C115875Md) obj;
                if (!C14360o3.A0K(this.A01, c115875Md.A01) || !C14360o3.A0K(this.A00, c115875Md.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        User user = this.A00;
        return hashCode + (user != null ? user.hashCode() : 0);
    }

    @Override // X.InterfaceC115885Me
    public final List BfB() {
        return this.A01;
    }

    @Override // X.InterfaceC115885Me
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC115885Me
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNuxMediaResponse", AbstractC33719Ev7.A00(this));
    }

    public C115875Md(User user, List list) {
        this.A01 = list;
        this.A00 = user;
    }
}
