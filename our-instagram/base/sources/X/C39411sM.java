package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.1sM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39411sM extends C0T6 implements InterfaceC39421sN {
    public final C5FV A00;
    public final C5FW A01;
    public final C5FX A02;
    public final C5FY A03;
    public final C5FZ A04;
    public final AnonymousClass535 A05;
    public final Long A06;
    public final List A07;
    public final List A08;

    @Override // X.InterfaceC39421sN
    public final C39411sM Euh() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39411sM) {
                C39411sM c39411sM = (C39411sM) obj;
                if (!C14360o3.A0K(this.A00, c39411sM.A00) || !C14360o3.A0K(this.A01, c39411sM.A01) || !C14360o3.A0K(this.A07, c39411sM.A07) || !C14360o3.A0K(this.A02, c39411sM.A02) || !C14360o3.A0K(this.A08, c39411sM.A08) || !C14360o3.A0K(this.A06, c39411sM.A06) || !C14360o3.A0K(this.A03, c39411sM.A03) || !C14360o3.A0K(this.A04, c39411sM.A04) || !C14360o3.A0K(this.A05, c39411sM.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C5FV c5fv = this.A00;
        int hashCode = (c5fv == null ? 0 : c5fv.hashCode()) * 31;
        C5FW c5fw = this.A01;
        int hashCode2 = (hashCode + (c5fw == null ? 0 : c5fw.hashCode())) * 31;
        List list = this.A07;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C5FX c5fx = this.A02;
        int hashCode4 = (hashCode3 + (c5fx == null ? 0 : c5fx.hashCode())) * 31;
        List list2 = this.A08;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.A06;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        C5FY c5fy = this.A03;
        int hashCode7 = (hashCode6 + (c5fy == null ? 0 : c5fy.hashCode())) * 31;
        C5FZ c5fz = this.A04;
        int hashCode8 = (hashCode7 + (c5fz == null ? 0 : c5fz.hashCode())) * 31;
        AnonymousClass535 anonymousClass535 = this.A05;
        return hashCode8 + (anonymousClass535 != null ? anonymousClass535.hashCode() : 0);
    }

    @Override // X.InterfaceC39421sN
    public final C5FV AjI() {
        return this.A00;
    }

    @Override // X.InterfaceC39421sN
    public final C5FW AjN() {
        return this.A01;
    }

    @Override // X.InterfaceC39421sN
    public final List B15() {
        return this.A07;
    }

    @Override // X.InterfaceC39421sN
    public final C5FX BEX() {
        return this.A02;
    }

    @Override // X.InterfaceC39421sN
    public final List BEb() {
        return this.A08;
    }

    @Override // X.InterfaceC39421sN
    public final Long BHC() {
        return this.A06;
    }

    @Override // X.InterfaceC39421sN
    public final C5FY BTG() {
        return this.A03;
    }

    @Override // X.InterfaceC39421sN
    public final C5FZ BTK() {
        return this.A04;
    }

    @Override // X.InterfaceC39421sN
    public final /* bridge */ /* synthetic */ AnonymousClass536 BiV() {
        return this.A05;
    }

    @Override // X.InterfaceC39421sN
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGIABPostClickDataDict", AbstractC37389GdV.A00(this));
    }

    public C39411sM(C5FV c5fv, C5FW c5fw, C5FX c5fx, C5FY c5fy, C5FZ c5fz, AnonymousClass535 anonymousClass535, Long l, List list, List list2) {
        this.A00 = c5fv;
        this.A01 = c5fw;
        this.A07 = list;
        this.A02 = c5fx;
        this.A08 = list2;
        this.A06 = l;
        this.A03 = c5fy;
        this.A04 = c5fz;
        this.A05 = anonymousClass535;
    }
}
