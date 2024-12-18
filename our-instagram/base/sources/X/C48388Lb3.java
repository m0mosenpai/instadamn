package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;

/* renamed from: X.Lb3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48388Lb3 implements C6D2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;

    public C48388Lb3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A00 = i7;
        this.A0A = obj4;
        this.A0B = obj5;
        this.A07 = obj;
        this.A09 = obj2;
        this.A06 = i;
        this.A0I = str;
        this.A0J = str2;
        this.A08 = obj3;
        this.A0F = str3;
        this.A03 = i2;
        this.A0C = str4;
        this.A01 = i3;
        this.A02 = i4;
        this.A0D = str5;
        this.A0E = str6;
        this.A0G = str7;
        this.A04 = i5;
        this.A05 = i6;
        this.A0H = str8;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            C6JY c6jy = (C6JY) this.A0A;
            Object obj2 = this.A0B;
            Object obj3 = this.A07;
            Object obj4 = this.A09;
            int i = this.A06;
            String str = this.A0I;
            String str2 = this.A0J;
            Object obj5 = this.A08;
            String str3 = this.A0F;
            int i2 = this.A03;
            String str4 = this.A0C;
            int i3 = this.A01;
            int i4 = this.A02;
            String str5 = this.A0D;
            String str6 = this.A0E;
            String str7 = this.A0G;
            int i5 = this.A04;
            int i6 = this.A05;
            String str8 = this.A0H;
            InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj;
            if (interfaceC132965zL instanceof C48496Lcn) {
                return C48496Lcn.A00(interfaceC132965zL);
            }
            return C48331La4.A00(c6jy).A0L(new C48388Lb3(interfaceC132965zL, obj4, obj5, obj2, obj3, str, str2, str3, str4, str5, str6, str7, str8, i, i2, i3, i4, i5, i6, 0));
        }
        byte[] bArr = (byte[]) this.A0A;
        byte[] bArr2 = (byte[]) this.A0B;
        final InterfaceC132965zL interfaceC132965zL2 = (InterfaceC132965zL) this.A07;
        final Long l = (Long) this.A09;
        final int i7 = this.A06;
        final String str9 = this.A0I;
        final String str10 = this.A0J;
        final Long l2 = (Long) this.A08;
        final String str11 = this.A0F;
        final int i8 = this.A03;
        final String str12 = this.A0C;
        final int i9 = this.A01;
        final int i10 = this.A02;
        final String str13 = this.A0D;
        final String str14 = this.A0E;
        final String str15 = this.A0G;
        final int i11 = this.A04;
        final int i12 = this.A05;
        final String str16 = this.A0H;
        Pair pair = (Pair) obj;
        K3a k3a = (K3a) pair.first;
        final C1345666g c1345666g = (C1345666g) pair.second;
        final String A14 = AbstractC25225BEi.A14();
        final String A03 = C6JY.A03(k3a, bArr);
        C18C.A07(A03, "Failed to resolve preview ID");
        final String A032 = C6JY.A03(k3a, bArr2);
        C18C.A07(A032, "Failed to resolve preview ID");
        return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcZ
            @Override // X.InterfaceC1345866i
            public final void EpD(C1346766r c1346766r) {
                C1345666g c1345666g2 = C1345666g.this;
                InterfaceC132965zL interfaceC132965zL3 = interfaceC132965zL2;
                Long l3 = l;
                int i13 = i7;
                String str17 = str9;
                String str18 = str10;
                Long l4 = l2;
                String str19 = str11;
                int i14 = i8;
                String str20 = A03;
                String str21 = str12;
                int i15 = i9;
                int i16 = i10;
                String str22 = str13;
                String str23 = str14;
                String str24 = A032;
                String str25 = str15;
                int i17 = i11;
                int i18 = i12;
                String str26 = str16;
                String str27 = A14;
                long A09 = JQ0.A09(interfaceC132965zL3);
                long longValue = l3.longValue();
                JVL jvl = new JVL(c1346766r, 4);
                InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                int A00 = AbstractC1346866s.A00(A0D);
                TraceInfo A0F = AbstractC43592JPx.A0F(jvl, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaReplyWithStickerClientSend");
                if (!ASj.ELJ(new C73392YBc(c1345666g2, A0D, l4, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, A00, i13, i14, i15, i16, i17, i18, A09, longValue))) {
                    A0D.cancel(false);
                    AbstractC1346866s.A02(A00);
                    AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaReplyWithStickerClientSend");
                }
                PlatformLogger.platformEventLog(5);
            }
        }, AbstractC137146It.A00("instagram_xma_story_reply_with_sticker_client_send"));
    }
}
