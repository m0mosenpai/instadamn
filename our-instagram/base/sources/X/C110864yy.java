package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4yy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110864yy extends C0T6 implements InterfaceC110874yz {
    public final String A00;
    public final List A01;

    @Override // X.InterfaceC110874yz
    public final C110864yy F5m() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110864yy) {
                C110864yy c110864yy = (C110864yy) obj;
                if (!C14360o3.A0K(this.A01, c110864yy.A01) || !C14360o3.A0K(this.A00, c110864yy.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A00;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC110874yz
    public final List BKv() {
        return this.A01;
    }

    @Override // X.InterfaceC110874yz
    public final String BUT() {
        return this.A00;
    }

    @Override // X.InterfaceC110874yz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryAdKeywordHighlightDict", I39.A00(this));
    }

    public C110864yy(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
