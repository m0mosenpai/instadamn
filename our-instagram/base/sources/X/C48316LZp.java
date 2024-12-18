package X;

import java.util.List;

/* renamed from: X.LZp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48316LZp implements InterfaceC66482zP {
    public final float A00;
    public final int A01;
    public final long A02;
    public final JUM A03;
    public final C43641JRz A04;
    public final JS2 A05;
    public final C83403nh A06;
    public final InterfaceC50518MRv A07;
    public final C31243DoR A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C48316LZp(JUM jum, C43641JRz c43641JRz, JS2 js2, C83403nh c83403nh, InterfaceC50518MRv interfaceC50518MRv, C31243DoR c31243DoR, String str, String str2, List list, float f, int i, long j, boolean z, boolean z2) {
        C14360o3.A0B(str, 1);
        this.A09 = str;
        this.A07 = interfaceC50518MRv;
        this.A0D = z;
        this.A02 = j;
        this.A00 = f;
        this.A0C = z2;
        this.A06 = c83403nh;
        this.A04 = c43641JRz;
        this.A03 = jum;
        this.A05 = js2;
        this.A08 = c31243DoR;
        this.A0B = list;
        this.A0A = str2;
        this.A01 = i;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A09;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C48316LZp c48316LZp = (C48316LZp) obj;
        C14360o3.A0B(c48316LZp, 0);
        if (this.A0D == c48316LZp.A0D && this.A02 == c48316LZp.A02 && C14360o3.A0K(this.A0A, c48316LZp.A0A)) {
            JUM jum = this.A03;
            JUM jum2 = c48316LZp.A03;
            C14360o3.A0B(jum2, 0);
            if (jum.equals(jum2) && AbstractC50102Ry.A00(this.A08, c48316LZp.A08)) {
                return true;
            }
        }
        return false;
    }
}
