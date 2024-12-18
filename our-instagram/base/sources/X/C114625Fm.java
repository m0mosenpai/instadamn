package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpIndexAction;

/* renamed from: X.5Fm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C114625Fm extends C0T6 implements InterfaceC105004oG {
    public final C114615Fj A00;
    public final UrpIndexAction A01;
    public final C38807H6x A02;
    public final Integer A03;
    public final String A04;

    @Override // X.InterfaceC105004oG
    public final InterfaceC105004oG EB9(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC105004oG
    public final C114625Fm F3U(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC105004oG
    public final C114625Fm F3V(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114625Fm) {
                C114625Fm c114625Fm = (C114625Fm) obj;
                if (this.A01 != c114625Fm.A01 || !C14360o3.A0K(this.A00, c114625Fm.A00) || !C14360o3.A0K(this.A04, c114625Fm.A04) || !C14360o3.A0K(this.A03, c114625Fm.A03) || !C14360o3.A0K(this.A02, c114625Fm.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        UrpIndexAction urpIndexAction = this.A01;
        int hashCode = (urpIndexAction == null ? 0 : urpIndexAction.hashCode()) * 31;
        C114615Fj c114615Fj = this.A00;
        int hashCode2 = (hashCode + (c114615Fj == null ? 0 : c114615Fj.hashCode())) * 31;
        String str = this.A04;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        C38807H6x c38807H6x = this.A02;
        return hashCode4 + (c38807H6x != null ? c38807H6x.hashCode() : 0);
    }

    @Override // X.InterfaceC105004oG
    public final UrpIndexAction AYP() {
        return this.A01;
    }

    @Override // X.InterfaceC105004oG
    public final /* bridge */ /* synthetic */ InterfaceC104924o5 Adb() {
        return this.A00;
    }

    @Override // X.InterfaceC105004oG
    public final String Anz() {
        return this.A04;
    }

    @Override // X.InterfaceC105004oG
    public final Integer BHQ() {
        return this.A03;
    }

    @Override // X.InterfaceC105004oG
    public final /* bridge */ /* synthetic */ InterfaceC43564JLy BQX() {
        return this.A02;
    }

    @Override // X.InterfaceC105004oG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUrpCardTransformation", AbstractC40429HwK.A00(this));
    }

    public C114625Fm(C114615Fj c114615Fj, UrpIndexAction urpIndexAction, C38807H6x c38807H6x, Integer num, String str) {
        this.A01 = urpIndexAction;
        this.A00 = c114615Fj;
        this.A04 = str;
        this.A03 = num;
        this.A02 = c38807H6x;
    }
}
