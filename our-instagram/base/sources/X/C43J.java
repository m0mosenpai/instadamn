package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.43J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C43J extends C0T6 implements C43K {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    @Override // X.C43K
    public final C43J Eyw() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43J) {
                C43J c43j = (C43J) obj;
                if (!C14360o3.A0K(this.A03, c43j.A03) || !C14360o3.A0K(this.A00, c43j.A00) || !C14360o3.A0K(this.A02, c43j.A02) || !C14360o3.A0K(this.A01, c43j.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.A00;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.A02;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A01;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.C43K
    public final List Avr() {
        return this.A03;
    }

    @Override // X.C43K
    public final Integer B23() {
        return this.A00;
    }

    @Override // X.C43K
    public final String BKx() {
        return this.A02;
    }

    @Override // X.C43K
    public final Integer Bzj() {
        return this.A01;
    }

    @Override // X.C43K
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTQuietTimeWindowResponse", AbstractC33733EvL.A00(this));
    }

    public C43J(Integer num, Integer num2, String str, List list) {
        this.A03 = list;
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
