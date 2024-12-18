package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Lbn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48434Lbn implements C6D2 {
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

    @Override // X.C6D2
    public final Object apply(Object obj) {
        switch (this.A00) {
            case 0:
                C6JY c6jy = (C6JY) this.A08;
                byte[] bArr = (byte[]) this.A09;
                byte[] bArr2 = (byte[]) this.A07;
                String str = this.A0E;
                int i = this.A04;
                String str2 = this.A0F;
                String str3 = this.A0G;
                String str4 = this.A0H;
                String str5 = this.A0C;
                int i2 = this.A01;
                String str6 = this.A0A;
                int i3 = this.A02;
                int i4 = this.A03;
                String str7 = this.A0B;
                Integer num = (Integer) this.A05;
                Integer num2 = (Integer) this.A06;
                String str8 = this.A0D;
                InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
                if (interfaceC132965zL instanceof C48496Lcn) {
                    return C48496Lcn.A00(interfaceC132965zL);
                }
                return C48331La4.A00(c6jy).A0L(new C48434Lbn(interfaceC132965zL, num, num2, str, str2, str3, str4, str5, str6, str7, str8, bArr, bArr2, i, i2, i3, i4));
            case 1:
                byte[] bArr3 = (byte[]) this.A08;
                byte[] bArr4 = (byte[]) this.A09;
                final InterfaceC132965zL interfaceC132965zL2 = (InterfaceC132965zL) this.A07;
                final String str9 = this.A0E;
                final int i5 = this.A04;
                final String str10 = this.A0F;
                final String str11 = this.A0G;
                final String str12 = this.A0H;
                final String str13 = this.A0C;
                final int i6 = this.A01;
                final String str14 = this.A0A;
                final int i7 = this.A02;
                final int i8 = this.A03;
                final String str15 = this.A0B;
                final Integer num3 = (Integer) this.A05;
                final Integer num4 = (Integer) this.A06;
                final String str16 = this.A0D;
                Pair pair = (Pair) obj;
                K3a k3a = (K3a) pair.first;
                final C1345666g c1345666g = (C1345666g) pair.second;
                final String A14 = AbstractC25225BEi.A14();
                final String A03 = C6JY.A03(k3a, bArr3);
                final String A0L = JQ1.A0L(k3a, A03, bArr4);
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcV
                    @Override // X.InterfaceC1345866i
                    public final void EpD(C1346766r c1346766r) {
                        C1345666g c1345666g2 = C1345666g.this;
                        InterfaceC132965zL interfaceC132965zL3 = interfaceC132965zL2;
                        String str17 = str9;
                        int i9 = i5;
                        String str18 = str10;
                        String str19 = str11;
                        String str20 = str12;
                        String str21 = str13;
                        int i10 = i6;
                        String str22 = A03;
                        String str23 = str14;
                        int i11 = i7;
                        int i12 = i8;
                        String str24 = A0L;
                        String str25 = str15;
                        Integer num5 = num3;
                        Integer num6 = num4;
                        String str26 = str16;
                        String str27 = A14;
                        long A09 = JQ0.A09(interfaceC132965zL3);
                        if (AbstractC116315Ok.A00(str17)) {
                            str17 = null;
                        }
                        JRS A00 = JRS.A00(c1346766r, 61);
                        InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                        MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                        int A002 = AbstractC1346866s.A00(A0D);
                        TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaIgtvShareClientSend");
                        if (!ASj.ELJ(new YBW(c1345666g2, A0D, num5, num6, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, A002, i9, i10, i11, i12, A09))) {
                            A0D.cancel(false);
                            AbstractC1346866s.A02(A002);
                            AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaIgtvShareClientSend");
                        }
                        PlatformLogger.platformEventLog(5);
                    }
                }, AbstractC137146It.A00("instagram_xma_igtv_share_client_send"));
            default:
                C6JY c6jy2 = (C6JY) this.A08;
                Object obj2 = this.A09;
                Object obj3 = this.A07;
                int i9 = this.A04;
                String str17 = this.A0F;
                String str18 = this.A0G;
                String str19 = this.A0H;
                String str20 = this.A0E;
                String str21 = this.A0A;
                int i10 = this.A01;
                String str22 = this.A0B;
                int i11 = this.A02;
                int i12 = this.A03;
                String str23 = this.A0C;
                Object obj4 = this.A05;
                Object obj5 = this.A06;
                String str24 = this.A0D;
                InterfaceC132965zL interfaceC132965zL3 = (InterfaceC132965zL) obj;
                if (interfaceC132965zL3 instanceof C48496Lcn) {
                    return C48496Lcn.A00(interfaceC132965zL3);
                }
                return C48331La4.A00(c6jy2).A0L(new Lb1(interfaceC132965zL3, c6jy2, obj4, obj5, obj2, obj3, str17, str18, str19, str20, str21, str22, str23, str24, i9, i10, i11, i12, 0));
        }
    }

    public C48434Lbn(C6JY c6jy, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A08 = c6jy;
        this.A09 = bArr;
        this.A07 = bArr2;
        if (i5 != 0) {
            this.A04 = i;
            this.A0F = str;
            this.A0G = str2;
            this.A0H = str3;
            this.A0E = str4;
            this.A0A = str5;
            this.A01 = i2;
            this.A0B = str6;
            this.A02 = i3;
            this.A03 = i4;
            this.A0C = str7;
        } else {
            this.A0E = str;
            this.A04 = i;
            this.A0F = str2;
            this.A0G = str3;
            this.A0H = str4;
            this.A0C = str5;
            this.A01 = i2;
            this.A0A = str6;
            this.A02 = i3;
            this.A03 = i4;
            this.A0B = str7;
        }
        this.A05 = num;
        this.A06 = num2;
        this.A0D = str8;
    }

    public C48434Lbn(InterfaceC132965zL interfaceC132965zL, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4) {
        this.A00 = 1;
        this.A08 = bArr;
        this.A09 = bArr2;
        this.A07 = interfaceC132965zL;
        this.A0E = str;
        this.A04 = i;
        this.A0F = str2;
        this.A0G = str3;
        this.A0H = str4;
        this.A0C = str5;
        this.A01 = i2;
        this.A0A = str6;
        this.A02 = i3;
        this.A03 = i4;
        this.A0B = str7;
        this.A05 = num;
        this.A06 = num2;
        this.A0D = str8;
    }
}
