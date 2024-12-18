package X;

import java.util.Queue;

/* loaded from: classes8.dex */
public final class MEI extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEI(Object obj, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A02 = obj;
        this.A09 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A07 = str4;
        this.A01 = i;
        this.A04 = str5;
        this.A03 = str6;
        this.A05 = str7;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Queue queue;
        Object c45402K8p;
        switch (this.A00) {
            case 0:
                queue = ((C27V) this.A02).A01;
                String str = this.A09;
                String str2 = this.A06;
                String str3 = this.A08;
                String str4 = this.A07;
                int i = this.A01;
                String str5 = this.A04;
                String str6 = this.A03;
                if (str6 == null) {
                    str6 = "null";
                }
                String str7 = this.A05;
                if (str7 == null) {
                    str7 = "null";
                }
                c45402K8p = new C45402K8p(str, str2, str3, str4, str5, str6, str7, i);
                queue.add(c45402K8p);
                break;
            case 1:
                queue = ((C27V) this.A02).A01;
                c45402K8p = new C45403K8q(this.A04, this.A08, this.A03, this.A09, this.A06, this.A07, this.A05, this.A01);
                queue.add(c45402K8p);
                break;
            default:
                ((C5yI) this.A02).Dcw(this.A05, this.A07, this.A06, this.A03, this.A09, this.A08, this.A04, this.A01);
                break;
        }
        return C0eB.A00;
    }
}
