package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.43G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C43G extends C0T6 implements C43H {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C43G(Integer num, Integer num2, String str, String str2, String str3, boolean z) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 5);
        this.A00 = num;
        this.A02 = str;
        this.A05 = z;
        this.A01 = num2;
        this.A03 = str2;
        this.A04 = str3;
    }

    @Override // X.C43H
    public final C43G Evx() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43G) {
                C43G c43g = (C43G) obj;
                if (!C14360o3.A0K(this.A00, c43g.A00) || !C14360o3.A0K(this.A02, c43g.A02) || this.A05 != c43g.A05 || !C14360o3.A0K(this.A01, c43g.A01) || !C14360o3.A0K(this.A03, c43g.A03) || !C14360o3.A0K(this.A04, c43g.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C43H
    public final Integer B4V() {
        return this.A00;
    }

    @Override // X.C43H
    public final Integer BNU() {
        return this.A01;
    }

    @Override // X.C43H
    public final String BiB() {
        return this.A04;
    }

    @Override // X.C43H
    public final boolean CIs() {
        return this.A05;
    }

    @Override // X.C43H
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLinkedFBUser", AbstractC31540DtQ.A00(this));
    }

    @Override // X.C43H
    public final String getId() {
        return this.A02;
    }

    @Override // X.C43H
    public final String getName() {
        return this.A03;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.A00;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = ((hashCode * 31) + this.A02.hashCode()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int i3 = (hashCode3 + i2) * 31;
        Integer num2 = this.A01;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int hashCode4 = (((i3 + hashCode2) * 31) + this.A03.hashCode()) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }
}
