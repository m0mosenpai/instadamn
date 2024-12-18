package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.NativeInfoCardCommentLayout;

/* loaded from: classes11.dex */
public final class UR5 extends C0T6 implements XG9 {
    public final NativeInfoCardCommentLayout A00;
    public final InterfaceC43559JLt A01;
    public final InterfaceC43559JLt A02;
    public final XGA A03;
    public final InterfaceC72036XFy A04;

    @Override // X.XG9
    public final UR5 Ex7() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR5) {
                UR5 ur5 = (UR5) obj;
                if (!C14360o3.A0K(this.A01, ur5.A01) || !C14360o3.A0K(this.A03, ur5.A03) || this.A00 != ur5.A00 || !C14360o3.A0K(this.A02, ur5.A02) || !C14360o3.A0K(this.A04, ur5.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG9
    public final InterfaceC43559JLt Apj() {
        return this.A01;
    }

    @Override // X.XG9
    public final XGA BEv() {
        return this.A03;
    }

    @Override // X.XG9
    public final NativeInfoCardCommentLayout BMO() {
        return this.A00;
    }

    @Override // X.XG9
    public final InterfaceC43559JLt CDx() {
        return this.A02;
    }

    @Override // X.XG9
    public final InterfaceC72036XFy CE1() {
        return this.A04;
    }

    @Override // X.XG9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardComment", AbstractC68372VOg.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        InterfaceC72036XFy interfaceC72036XFy = this.A04;
        if (interfaceC72036XFy != null) {
            i = interfaceC72036XFy.hashCode();
        }
        return A0M + i;
    }

    public UR5(NativeInfoCardCommentLayout nativeInfoCardCommentLayout, InterfaceC43559JLt interfaceC43559JLt, InterfaceC43559JLt interfaceC43559JLt2, XGA xga, InterfaceC72036XFy interfaceC72036XFy) {
        this.A01 = interfaceC43559JLt;
        this.A03 = xga;
        this.A00 = nativeInfoCardCommentLayout;
        this.A02 = interfaceC43559JLt2;
        this.A04 = interfaceC72036XFy;
    }
}
