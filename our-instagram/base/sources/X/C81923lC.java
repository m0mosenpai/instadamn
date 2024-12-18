package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.3lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81923lC extends C0T6 implements InterfaceC81933lD {
    public final InterfaceC81913lB A00;
    public final Hashtag A01;

    @Override // X.InterfaceC81933lD
    public final C81923lC Evu() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C81923lC) {
                C81923lC c81923lC = (C81923lC) obj;
                if (!C14360o3.A0K(this.A01, c81923lC.A01) || !C14360o3.A0K(this.A00, c81923lC.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Hashtag hashtag = this.A01;
        int hashCode = (hashtag == null ? 0 : hashtag.hashCode()) * 31;
        InterfaceC81913lB interfaceC81913lB = this.A00;
        return hashCode + (interfaceC81913lB != null ? interfaceC81913lB.hashCode() : 0);
    }

    @Override // X.InterfaceC81933lD
    public final Hashtag BD4() {
        return this.A01;
    }

    @Override // X.InterfaceC81933lD
    public final InterfaceC81913lB CDh() {
        return this.A00;
    }

    @Override // X.InterfaceC81933lD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedEntity", AbstractC31241DoP.A00(this));
    }

    public C81923lC(InterfaceC81913lB interfaceC81913lB, Hashtag hashtag) {
        this.A01 = hashtag;
        this.A00 = interfaceC81913lB;
    }
}
