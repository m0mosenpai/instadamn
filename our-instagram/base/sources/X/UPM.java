package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class UPM extends C0T6 {
    public final int A00;
    public final Context A01;
    public final C38321qM A02;
    public final InterfaceC60442pS A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPM) {
                UPM upm = (UPM) obj;
                if (!C14360o3.A0K(this.A02, upm.A02) || !C14360o3.A0K(this.A04, upm.A04) || this.A07 != upm.A07 || this.A00 != upm.A00 || !C14360o3.A0K(this.A01, upm.A01) || !C14360o3.A0K(this.A03, upm.A03) || !C14360o3.A0K(this.A06, upm.A06) || !C14360o3.A0K(this.A05, upm.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0J = ((AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A01, (AbstractC167007dF.A0D(this.A07, ((this.A02.hashCode() * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + this.A00) * 31)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return ((A0J + i) * 31) + AbstractC53644Nnp.A00();
    }

    public UPM(Context context, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, int i, boolean z) {
        this.A02 = c38321qM;
        this.A04 = str;
        this.A07 = z;
        this.A00 = i;
        this.A01 = context;
        this.A03 = interfaceC60442pS;
        this.A06 = str2;
        this.A05 = str3;
    }
}
