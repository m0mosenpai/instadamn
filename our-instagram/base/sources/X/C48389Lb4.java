package X;

import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Lb4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48389Lb4 implements C6D2 {
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
    public final String A0J;
    public final String A0K;

    public C48389Lb4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, int i3, int i4, int i5) {
        this.A00 = i5;
        this.A05 = obj6;
        this.A06 = obj;
        this.A04 = i;
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A09 = obj5;
        this.A0K = str4;
        this.A0A = obj2;
        this.A0F = str5;
        this.A01 = i2;
        this.A02 = i3;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A03 = i4;
        this.A0E = str9;
        this.A07 = obj3;
        this.A08 = obj4;
        this.A0G = str10;
    }

    @Override // X.C6D2
    public final Object apply(Object obj) {
        if (this.A00 != 0) {
            byte[] bArr = (byte[]) this.A05;
            final InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) this.A06;
            final int i = this.A04;
            final String str = this.A0H;
            final String str2 = this.A0I;
            final String str3 = this.A0J;
            final Long l = (Long) this.A09;
            final String str4 = this.A0K;
            final Boolean bool = (Boolean) this.A0A;
            final String str5 = this.A0F;
            final int i2 = this.A01;
            final int i3 = this.A02;
            final String str6 = this.A0B;
            final String str7 = this.A0C;
            final String str8 = this.A0D;
            final int i4 = this.A03;
            final String str9 = this.A0E;
            final Integer num = (Integer) this.A07;
            final Integer num2 = (Integer) this.A08;
            final String str10 = this.A0G;
            Pair pair = (Pair) obj;
            K3a k3a = (K3a) pair.first;
            final C1345666g c1345666g = (C1345666g) pair.second;
            final String A14 = AbstractC25225BEi.A14();
            final String A03 = C6JY.A03(k3a, bArr);
            C18C.A07(A03, "Failed to resolve preview ID");
            final C44921JuZ A00 = AbstractC46871KoE.A00(EnumC46253KdV.A0M, ImmutableList.of((Object) EnumC46254KdW.A05));
            return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lcc
                @Override // X.InterfaceC1345866i
                public final void EpD(C1346766r c1346766r) {
                    C1345666g c1345666g2 = C1345666g.this;
                    InterfaceC132965zL interfaceC132965zL2 = interfaceC132965zL;
                    int i5 = i;
                    String str11 = str;
                    String str12 = str2;
                    String str13 = str3;
                    Long l2 = l;
                    String str14 = str4;
                    Boolean bool2 = bool;
                    String str15 = str5;
                    int i6 = i2;
                    int i7 = i3;
                    String str16 = str6;
                    String str17 = str7;
                    String str18 = str8;
                    int i8 = i4;
                    String str19 = A03;
                    String str20 = str9;
                    Integer num3 = num;
                    Integer num4 = num2;
                    String str21 = str10;
                    String str22 = A14;
                    C44921JuZ c44921JuZ = A00;
                    long A09 = JQ0.A09(interfaceC132965zL2);
                    boolean booleanValue = bool2.booleanValue();
                    int intValue = num3.intValue();
                    int intValue2 = num4.intValue();
                    String obj2 = c44921JuZ.A00.toString();
                    JRS A002 = JRS.A00(c1346766r, 60);
                    InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                    MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                    int A003 = AbstractC1346866s.A00(A0D);
                    TraceInfo A0F = AbstractC43592JPx.A0F(A002, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaStoryMentionClientSend");
                    if (!ASj.ELJ(new C73391YBb(c1345666g2, A0D, l2, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, obj2, A003, i5, i6, i7, i8, intValue, intValue2, A09, booleanValue))) {
                        A0D.cancel(false);
                        AbstractC1346866s.A02(A003);
                        AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaStoryMentionClientSend");
                    }
                    PlatformLogger.platformEventLog(5);
                }
            }, AbstractC137146It.A00("instagram_xma_client_send"));
        }
        C6JY c6jy = (C6JY) this.A05;
        Object obj2 = this.A06;
        int i5 = this.A04;
        String str11 = this.A0H;
        String str12 = this.A0I;
        String str13 = this.A0J;
        Object obj3 = this.A09;
        String str14 = this.A0K;
        Object obj4 = this.A0A;
        String str15 = this.A0F;
        int i6 = this.A01;
        int i7 = this.A02;
        String str16 = this.A0B;
        String str17 = this.A0C;
        String str18 = this.A0D;
        int i8 = this.A03;
        String str19 = this.A0E;
        Object obj5 = this.A07;
        Object obj6 = this.A08;
        String str20 = this.A0G;
        InterfaceC132965zL interfaceC132965zL2 = (InterfaceC132965zL) obj;
        if (interfaceC132965zL2 instanceof C48496Lcn) {
            return C48496Lcn.A00(interfaceC132965zL2);
        }
        return C48331La4.A00(c6jy).A0L(new C48389Lb4(interfaceC132965zL2, obj4, obj5, obj6, obj3, obj2, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, i5, i6, i7, i8, 1));
    }
}
