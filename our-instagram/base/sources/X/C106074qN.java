package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4qN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106074qN extends C0T6 implements InterfaceC106084qO {
    public final String A00;
    public final boolean A01;

    public C106074qN(String str, boolean z) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = z;
    }

    @Override // X.InterfaceC106084qO
    public final C106074qN F75() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106074qN) {
                C106074qN c106074qN = (C106074qN) obj;
                if (!C14360o3.A0K(this.A00, c106074qN.A00) || this.A01 != c106074qN.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC106084qO
    public final boolean CG9() {
        return this.A01;
    }

    @Override // X.InterfaceC106084qO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryReactionStickerTappableData", I5W.A00(this));
    }

    @Override // X.InterfaceC106084qO
    public final String getEmoji() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        return hashCode + i;
    }
}
