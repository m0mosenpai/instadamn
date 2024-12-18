package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4xF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109874xF extends C0T6 implements InterfaceC109884xG {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC109884xG
    public final C109874xF Evd() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109874xF) {
                C109874xF c109874xF = (C109874xF) obj;
                if (!C14360o3.A0K(this.A00, c109874xF.A00) || !C14360o3.A0K(this.A01, c109874xF.A01) || !C14360o3.A0K(this.A02, c109874xF.A02) || !C14360o3.A0K(this.A03, c109874xF.A03)) {
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
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A03;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC109884xG
    public final Integer BEm() {
        return this.A00;
    }

    @Override // X.InterfaceC109884xG
    public final Integer BEw() {
        return this.A01;
    }

    @Override // X.InterfaceC109884xG
    public final String BzU() {
        return this.A03;
    }

    @Override // X.InterfaceC109884xG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIconSpec", AbstractC68367VOb.A00(this));
    }

    @Override // X.InterfaceC109884xG
    public final String getName() {
        return this.A02;
    }

    public C109874xF(Integer num, Integer num2, String str, String str2) {
        this.A00 = num;
        this.A01 = num2;
        this.A02 = str;
        this.A03 = str2;
    }
}
