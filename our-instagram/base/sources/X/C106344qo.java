package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4qo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106344qo extends C0T6 implements InterfaceC106354qp {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public C106344qo(String str, String str2, String str3, String str4, String str5) {
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str5, 5);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // X.InterfaceC106354qp
    public final C106344qo Eqd() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106344qo) {
                C106344qo c106344qo = (C106344qo) obj;
                if (!C14360o3.A0K(this.A00, c106344qo.A00) || !C14360o3.A0K(this.A01, c106344qo.A01) || !C14360o3.A0K(this.A02, c106344qo.A02) || !C14360o3.A0K(this.A03, c106344qo.A03) || !C14360o3.A0K(this.A04, c106344qo.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.A01.hashCode()) * 31;
        String str2 = this.A02;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A03;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.A04.hashCode();
    }

    @Override // X.InterfaceC106354qp
    public final String Anp() {
        return this.A00;
    }

    @Override // X.InterfaceC106354qp
    public final String Anq() {
        return this.A01;
    }

    @Override // X.InterfaceC106354qp
    public final String B1v() {
        return this.A02;
    }

    @Override // X.InterfaceC106354qp
    public final String B1w() {
        return this.A03;
    }

    @Override // X.InterfaceC106354qp
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdsFeedbackInterfaceClickable", AbstractC39729Hjz.A00(this));
    }

    @Override // X.InterfaceC106354qp
    public final String getText() {
        return this.A04;
    }
}
