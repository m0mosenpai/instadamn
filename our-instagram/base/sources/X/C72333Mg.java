package X;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* renamed from: X.3Mg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72333Mg extends C0T6 implements InterfaceC41141vN {
    public final EnumC120785dO A00;
    public final C38321qM A01;
    public final Integer A02;
    public final String A03;

    public C72333Mg(EnumC120785dO enumC120785dO, C38321qM c38321qM, Integer num, String str) {
        C14360o3.A0B(num, 2);
        C14360o3.A0B(str, 3);
        this.A01 = c38321qM;
        this.A02 = num;
        this.A03 = str;
        this.A00 = enumC120785dO;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C72333Mg) {
                C72333Mg c72333Mg = (C72333Mg) obj;
                if (!C14360o3.A0K(this.A01, c72333Mg.A01) || this.A02 != c72333Mg.A02 || !C14360o3.A0K(this.A03, c72333Mg.A03) || this.A00 != c72333Mg.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int hashCode2 = this.A01.hashCode() * 31;
        int intValue = this.A02.intValue();
        if (1 != intValue) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        } else {
            str = "Caption";
        }
        int hashCode3 = (((hashCode2 + str.hashCode() + intValue) * 31) + this.A03.hashCode()) * 31;
        EnumC120785dO enumC120785dO = this.A00;
        if (enumC120785dO == null) {
            hashCode = 0;
        } else {
            hashCode = enumC120785dO.hashCode();
        }
        return hashCode3 + hashCode;
    }
}
