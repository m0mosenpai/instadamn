package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5Fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114575Fd extends C0T6 implements InterfaceC104814nm {
    public final Integer A00;
    public final Integer A01;

    @Override // X.InterfaceC104814nm
    public final C114575Fd ErX() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114575Fd) {
                C114575Fd c114575Fd = (C114575Fd) obj;
                if (!C14360o3.A0K(this.A00, c114575Fd.A00) || !C14360o3.A0K(this.A01, c114575Fd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.A01;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC104814nm
    public final Integer AwZ() {
        return this.A00;
    }

    @Override // X.InterfaceC104814nm
    public final Integer BE8() {
        return this.A01;
    }

    @Override // X.InterfaceC104814nm
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTCTAInfoDict", AbstractC39793Hl3.A00(this));
    }

    public C114575Fd(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
