package X;

import android.content.Context;

/* renamed from: X.Mr6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51613Mr6 extends C0T6 {
    public final long A00;
    public final Context A01;
    public final String A02;
    public final String A03;
    public final InterfaceC16660sJ A04;
    public final boolean A05;

    public C51613Mr6(Context context, String str, String str2, InterfaceC16660sJ interfaceC16660sJ, long j, boolean z) {
        AbstractC25233BEq.A0x(3, context, str2, interfaceC16660sJ);
        this.A00 = j;
        this.A03 = str;
        this.A01 = context;
        this.A02 = str2;
        this.A04 = interfaceC16660sJ;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51613Mr6) {
                C51613Mr6 c51613Mr6 = (C51613Mr6) obj;
                if (this.A00 != c51613Mr6.A00 || !C14360o3.A0K(this.A03, c51613Mr6.A03) || !C14360o3.A0K(this.A01, c51613Mr6.A01) || !C14360o3.A0K(this.A02, c51613Mr6.A02) || !C14360o3.A0K(this.A04, c51613Mr6.A04) || this.A05 != c51613Mr6.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC25235BEs.A03(this.A00))))));
    }
}
