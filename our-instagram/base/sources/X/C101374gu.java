package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4gu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101374gu extends C0T6 implements InterfaceC101384gv {
    public final Float A00;
    public final Integer A01;
    public final String A02;

    @Override // X.InterfaceC101384gv
    public final C101374gu F2p() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101374gu) {
                C101374gu c101374gu = (C101374gu) obj;
                if (!C14360o3.A0K(this.A01, c101374gu.A01) || !C14360o3.A0K(this.A00, c101374gu.A00) || !C14360o3.A0K(this.A02, c101374gu.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.A00;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        String str = this.A02;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.InterfaceC101384gv
    public final Integer Arz() {
        return this.A01;
    }

    @Override // X.InterfaceC101384gv
    public final Float B7g() {
        return this.A00;
    }

    @Override // X.InterfaceC101384gv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTally", AbstractC40381HvU.A00(this));
    }

    @Override // X.InterfaceC101384gv
    public final String getText() {
        return this.A02;
    }

    public C101374gu(Float f, Integer num, String str) {
        this.A01 = num;
        this.A00 = f;
        this.A02 = str;
    }
}
