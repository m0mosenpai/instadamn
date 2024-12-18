package X;

import android.content.Context;

/* loaded from: classes10.dex */
public final class T39 implements InterfaceC65508Tld {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public T39(Context context, InterfaceC65508Tld interfaceC65508Tld, SXG sxg, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = context;
        this.A04 = str;
        this.A03 = sxg;
        if (i != 0) {
            this.A05 = str2;
            this.A02 = interfaceC65508Tld;
        } else {
            this.A02 = interfaceC65508Tld;
            this.A05 = str2;
        }
    }

    @Override // X.InterfaceC65508Tld
    public final void DcL(Boolean bool, Integer num, Throwable th) {
        ((InterfaceC65508Tld) this.A02).DcL(bool, num, th);
    }

    @Override // X.InterfaceC65508Tld
    public final void DcO(String str) {
        Q8J q8j;
        int i;
        if (this.A00 != 0) {
            String str2 = this.A04;
            SXG sxg = (SXG) this.A03;
            C62962SZf c62962SZf = C2FP.A03().A03;
            C14360o3.A07(c62962SZf);
            q8j = c62962SZf.A02(sxg, str2);
            i = 1;
        } else {
            C62962SZf c62962SZf2 = C2FP.A03().A03;
            C14360o3.A07(c62962SZf2);
            String str3 = this.A04;
            SXG sxg2 = (SXG) this.A03;
            C58443PvM c58443PvM = c62962SZf2.A01;
            C63582Spp c63582Spp = new C63582Spp(c62962SZf2, sxg2, str3, 5);
            C63174SeZ c63174SeZ = c62962SZf2.A00;
            AbstractC25233BEq.A0v(0, c58443PvM, c63174SeZ, sxg2);
            C60624REj c60624REj = new C60624REj(c63582Spp, c63174SeZ, c58443PvM, sxg2);
            AbstractC63144Sdq.A02(c60624REj);
            q8j = ((AbstractC63144Sdq) c60624REj).A03;
            C62962SZf.A00(q8j, c63174SeZ);
            i = 0;
        }
        C63406Sjd.A0B(q8j, new C63613SqL(this, str, i));
    }
}
