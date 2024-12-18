package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.44F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44F extends C0T6 implements C44G {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    public C44F(Integer num, Integer num2, Integer num3, Integer num4, String str, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = num;
        this.A05 = list;
        this.A01 = num2;
        this.A02 = num3;
        this.A03 = num4;
        this.A04 = str;
    }

    @Override // X.C44G
    public final C44F F57() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44F) {
                C44F c44f = (C44F) obj;
                if (!C14360o3.A0K(this.A00, c44f.A00) || !C14360o3.A0K(this.A05, c44f.A05) || !C14360o3.A0K(this.A01, c44f.A01) || !C14360o3.A0K(this.A02, c44f.A02) || !C14360o3.A0K(this.A03, c44f.A03) || !C14360o3.A0K(this.A04, c44f.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int hashCode = (((num == null ? 0 : num.hashCode()) * 31) + this.A05.hashCode()) * 31;
        Integer num2 = this.A01;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A03;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.A04;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // X.C44G
    public final Integer AwO() {
        return this.A00;
    }

    @Override // X.C44G
    public final List Ays() {
        return this.A05;
    }

    @Override // X.C44G
    public final Integer BQF() {
        return this.A01;
    }

    @Override // X.C44G
    public final Integer BU9() {
        return this.A02;
    }

    @Override // X.C44G
    public final Integer Bfb() {
        return this.A03;
    }

    @Override // X.C44G
    public final String CDp() {
        return this.A04;
    }

    @Override // X.C44G
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTDonationAmountConfig", AbstractC65931Twc.A00(this));
    }
}
