package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* loaded from: classes8.dex */
public final class Lb1 implements C6D2 {
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
    public final Object A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;

    public Lb1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A09 = obj2;
        this.A0A = obj5;
        this.A07 = obj6;
        this.A04 = i;
        this.A08 = obj;
        this.A0H = str;
        this.A0I = str2;
        this.A0G = str3;
        this.A0C = str4;
        this.A0B = str5;
        this.A01 = i2;
        this.A0D = str6;
        this.A02 = i3;
        this.A03 = i4;
        this.A0E = str7;
        this.A05 = obj3;
        this.A06 = obj4;
        this.A0F = str8;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        int i = this.A00;
        final C6JY c6jy = (C6JY) this.A09;
        if (i != 0) {
            final byte[] bArr = (byte[]) this.A0A;
            final byte[] bArr2 = (byte[]) this.A07;
            final int i2 = this.A04;
            final String str = this.A0G;
            final String str2 = this.A0H;
            final String str3 = this.A0I;
            final Long l = (Long) this.A08;
            final String str4 = this.A0F;
            final String str5 = this.A0B;
            final int i3 = this.A01;
            final String str6 = this.A0C;
            final int i4 = this.A02;
            final int i5 = this.A03;
            final String str7 = this.A0D;
            final Integer num = (Integer) this.A05;
            final Integer num2 = (Integer) this.A06;
            final String str8 = this.A0E;
            final InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
            if (interfaceC132965zL instanceof C48496Lcn) {
                return C48496Lcn.A00(interfaceC132965zL);
            }
            return C48331La4.A00(c6jy).A0L(new C6D2() { // from class: X.Lb2
                @Override // X.C6D2
                public final Object apply(Object obj2) {
                    final C6JY c6jy2 = c6jy;
                    byte[] bArr3 = bArr;
                    byte[] bArr4 = bArr2;
                    final int i6 = i2;
                    final InterfaceC132965zL interfaceC132965zL2 = interfaceC132965zL;
                    final String str9 = str;
                    final String str10 = str2;
                    final String str11 = str3;
                    final Long l2 = l;
                    final String str12 = str4;
                    final String str13 = str5;
                    final int i7 = i3;
                    final String str14 = str6;
                    final int i8 = i4;
                    final int i9 = i5;
                    final String str15 = str7;
                    final Integer num3 = num;
                    final Integer num4 = num2;
                    final String str16 = str8;
                    Pair pair = (Pair) obj2;
                    K3a k3a = (K3a) pair.first;
                    final C1345666g c1345666g = (C1345666g) pair.second;
                    final String A14 = AbstractC25225BEi.A14();
                    final String A03 = C6JY.A03(k3a, bArr3);
                    final String A0L = JQ1.A0L(k3a, A03, bArr4);
                    return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lca
                        @Override // X.InterfaceC1345866i
                        public final void EpD(C1346766r c1346766r) {
                            C6JY c6jy3 = c6jy2;
                            int i10 = i6;
                            InterfaceC132965zL interfaceC132965zL3 = interfaceC132965zL2;
                            C1345666g c1345666g2 = c1345666g;
                            String str17 = str9;
                            String str18 = str10;
                            String str19 = str11;
                            Long l3 = l2;
                            String str20 = str12;
                            String str21 = str13;
                            int i11 = i7;
                            String str22 = A03;
                            String str23 = str14;
                            int i12 = i8;
                            int i13 = i9;
                            String str24 = A0L;
                            String str25 = str15;
                            Integer num5 = num3;
                            Integer num6 = num4;
                            String str26 = str16;
                            String str27 = A14;
                            String A04 = C6JY.A04(interfaceC132965zL3, c6jy3, 70547, i10);
                            long A09 = JQ0.A09(interfaceC132965zL3);
                            if (AbstractC116315Ok.A00(str17)) {
                                str17 = null;
                            }
                            JRS A00 = JRS.A00(c1346766r, 64);
                            InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                            MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                            int A002 = AbstractC1346866s.A00(A0D);
                            TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaStoryShareClientSend");
                            if (!ASj.ELJ(new YBY(c1345666g2, A0D, l3, num5, num6, str17, str18, str19, str20, str21, str22, str23, str24, str25, A04, str26, str27, A002, i10, i11, i12, i13, A09))) {
                                A0D.cancel(false);
                                AbstractC1346866s.A02(A002);
                                AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaStoryShareClientSend");
                            }
                            PlatformLogger.platformEventLog(5);
                        }
                    }, AbstractC137146It.A00("instagram_xma_story_share_client_send"));
                }
            });
        }
        byte[] bArr3 = (byte[]) this.A0A;
        byte[] bArr4 = (byte[]) this.A07;
        final int i6 = this.A04;
        final InterfaceC132965zL interfaceC132965zL2 = (InterfaceC132965zL) this.A08;
        final String str9 = this.A0H;
        final String str10 = this.A0I;
        final String str11 = this.A0G;
        final String str12 = this.A0C;
        final String str13 = this.A0B;
        final int i7 = this.A01;
        final String str14 = this.A0D;
        final int i8 = this.A02;
        final int i9 = this.A03;
        final String str15 = this.A0E;
        final Integer num3 = (Integer) this.A05;
        final Integer num4 = (Integer) this.A06;
        final String str16 = this.A0F;
        Pair pair = (Pair) obj;
        K3a k3a = (K3a) pair.first;
        final C1345666g c1345666g = (C1345666g) pair.second;
        final String A14 = AbstractC25225BEi.A14();
        final String A03 = C6JY.A03(k3a, bArr3);
        final String A0L = JQ1.A0L(k3a, A03, bArr4);
        return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcX
            @Override // X.InterfaceC1345866i
            public final void EpD(C1346766r c1346766r) {
                C6JY c6jy2 = c6jy;
                int i10 = i6;
                InterfaceC132965zL interfaceC132965zL3 = interfaceC132965zL2;
                C1345666g c1345666g2 = c1345666g;
                String str17 = str9;
                String str18 = str10;
                String str19 = str11;
                String str20 = str12;
                String str21 = str13;
                int i11 = i7;
                String str22 = A03;
                String str23 = str14;
                int i12 = i8;
                int i13 = i9;
                String str24 = A0L;
                String str25 = str15;
                Integer num5 = num3;
                Integer num6 = num4;
                String str26 = str16;
                String str27 = A14;
                String A04 = C6JY.A04(interfaceC132965zL3, c6jy2, 70547, i10);
                long A09 = JQ0.A09(interfaceC132965zL3);
                if (AbstractC116315Ok.A00(str17)) {
                    str17 = null;
                }
                JRS A00 = JRS.A00(c1346766r, 63);
                InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                int A002 = AbstractC1346866s.A00(A0D);
                TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaClipsShareClientSend");
                if (!ASj.ELJ(new YBX(c1345666g2, A0D, num5, num6, str17, str18, str19, str20, str21, str22, str23, str24, str25, A04, str26, str27, A002, i10, i11, i12, i13, A09))) {
                    A0D.cancel(false);
                    AbstractC1346866s.A02(A002);
                    AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaClipsShareClientSend");
                }
                PlatformLogger.platformEventLog(5);
            }
        }, AbstractC137146It.A00("instagram_xma_clips_share_client_send"));
    }
}
