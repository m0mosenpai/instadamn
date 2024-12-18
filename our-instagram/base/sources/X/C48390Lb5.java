package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Lb5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48390Lb5 implements C6D2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;

    public C48390Lb5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A05 = obj4;
        this.A06 = obj5;
        this.A09 = obj;
        this.A0H = str;
        this.A04 = i;
        this.A0I = str2;
        this.A0J = str3;
        this.A0K = str4;
        this.A0C = str5;
        this.A0F = str6;
        this.A0A = str7;
        this.A0B = str8;
        this.A01 = i2;
        this.A0D = str9;
        this.A02 = i3;
        this.A03 = i4;
        this.A0E = str10;
        this.A07 = obj2;
        this.A08 = obj3;
        this.A0G = str11;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            byte[] bArr = (byte[]) this.A05;
            byte[] bArr2 = (byte[]) this.A06;
            final InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) this.A09;
            final String str = this.A0H;
            final int i = this.A04;
            final String str2 = this.A0I;
            final String str3 = this.A0J;
            final String str4 = this.A0K;
            final String str5 = this.A0C;
            final String str6 = this.A0F;
            final String str7 = this.A0A;
            final String str8 = this.A0B;
            final int i2 = this.A01;
            final String str9 = this.A0D;
            final int i3 = this.A02;
            final int i4 = this.A03;
            final String str10 = this.A0E;
            final Integer num = (Integer) this.A07;
            final Integer num2 = (Integer) this.A08;
            final String str11 = this.A0G;
            Pair pair = (Pair) obj;
            K3a k3a = (K3a) pair.first;
            final C1345666g c1345666g = (C1345666g) pair.second;
            final String A14 = AbstractC25225BEi.A14();
            final String A03 = C6JY.A03(k3a, bArr);
            final String A0L = JQ1.A0L(k3a, A03, bArr2);
            return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lcb
                @Override // X.InterfaceC1345866i
                public final void EpD(C1346766r c1346766r) {
                    C1345666g c1345666g2 = C1345666g.this;
                    InterfaceC132965zL interfaceC132965zL2 = interfaceC132965zL;
                    String str12 = str;
                    int i5 = i;
                    String str13 = str2;
                    String str14 = str3;
                    String str15 = str4;
                    String str16 = str5;
                    String str17 = str6;
                    String str18 = str7;
                    String str19 = str8;
                    int i6 = i2;
                    String str20 = A03;
                    String str21 = str9;
                    int i7 = i3;
                    int i8 = i4;
                    String str22 = A0L;
                    String str23 = str10;
                    Integer num3 = num;
                    Integer num4 = num2;
                    String str24 = str11;
                    String str25 = A14;
                    long A09 = JQ0.A09(interfaceC132965zL2);
                    if (AbstractC116315Ok.A00(str12)) {
                        str12 = null;
                    }
                    JRS A00 = JRS.A00(c1346766r, 68);
                    InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c1345666g2, 0);
                    MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
                    int A002 = AbstractC1346866s.A00(A0D);
                    TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaPostShareClientSend");
                    if (!A0C.ELJ(new C73390YBa(c1345666g2, A0D, num3, num4, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, A002, i5, i6, i7, i8, A09))) {
                        A0D.cancel(false);
                        AbstractC1346866s.A02(A002);
                        AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaPostShareClientSend");
                    }
                    PlatformLogger.platformEventLog(5);
                }
            }, AbstractC137146It.A00("instagram_xma_client_send"));
        }
        C6JY c6jy = (C6JY) this.A05;
        Object obj2 = this.A06;
        Object obj3 = this.A09;
        String str12 = this.A0H;
        int i5 = this.A04;
        String str13 = this.A0I;
        String str14 = this.A0J;
        String str15 = this.A0K;
        String str16 = this.A0C;
        String str17 = this.A0F;
        String str18 = this.A0A;
        String str19 = this.A0B;
        int i6 = this.A01;
        String str20 = this.A0D;
        int i7 = this.A02;
        int i8 = this.A03;
        String str21 = this.A0E;
        Object obj4 = this.A07;
        Object obj5 = this.A08;
        String str22 = this.A0G;
        InterfaceC132965zL interfaceC132965zL2 = (InterfaceC132965zL) obj;
        if (interfaceC132965zL2 instanceof C48496Lcn) {
            return C48496Lcn.A00(interfaceC132965zL2);
        }
        return C48331La4.A00(c6jy).A0L(new C48390Lb5(interfaceC132965zL2, obj4, obj5, obj2, obj3, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, i5, i6, i7, i8, 1));
    }
}
