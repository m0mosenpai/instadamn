package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3ko, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81763ko extends C0T6 implements InterfaceC81773kp {
    public final String A00;
    public final List A01;

    public C81763ko(List list, String str) {
        C14360o3.A0B(list, 1);
        C14360o3.A0B(str, 2);
        this.A01 = list;
        this.A00 = str;
    }

    @Override // X.InterfaceC81773kp
    public final C81763ko F3L() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81763ko) {
                C81763ko c81763ko = (C81763ko) obj;
                if (!C14360o3.A0K(this.A01, c81763ko.A01) || !C14360o3.A0K(this.A00, c81763ko.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    @Override // X.InterfaceC81773kp
    public final List B2G() {
        return this.A01;
    }

    @Override // X.InterfaceC81773kp
    public final String BkX() {
        return this.A00;
    }

    @Override // X.InterfaceC81773kp
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextWithLinkedEntities", AbstractC31219Do2.A00(this));
    }
}
