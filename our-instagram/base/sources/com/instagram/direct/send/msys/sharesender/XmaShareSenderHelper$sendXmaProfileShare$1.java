package com.instagram.direct.send.msys.sharesender;

import X.AbstractC09560e7;
import X.AbstractC140946Yw;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23611Dp;
import X.AbstractC31180DnO;
import X.AbstractC43592JPx;
import X.C0eB;
import X.C25821No;
import X.C41761wQ;
import X.C49787Lyu;
import X.C6D2;
import X.C6JW;
import X.C6JY;
import X.InterfaceC16620sF;
import X.InterfaceC2056098k;
import X.InterfaceC23621Ds;
import X.InterfaceC83713oG;
import X.JQ0;
import X.LLU;
import android.graphics.Bitmap;
import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaProfileShare$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class XmaShareSenderHelper$sendXmaProfileShare$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ C41761wQ A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ InterfaceC83713oG A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaProfileShare$1(C41761wQ c41761wQ, UserSession userSession, ImageUrl imageUrl, InterfaceC83713oG interfaceC83713oG, User user, String str, String str2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = user;
        this.A06 = str;
        this.A00 = c41761wQ;
        this.A01 = userSession;
        this.A03 = interfaceC83713oG;
        this.A02 = imageUrl;
        this.A05 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        User user = this.A04;
        String str = this.A06;
        return new XmaShareSenderHelper$sendXmaProfileShare$1(this.A00, this.A01, this.A02, this.A03, user, str, this.A05, interfaceC23621Ds);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaProfileShare$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        LLU llu = LLU.A00;
        User user = this.A04;
        String str = this.A06;
        ImageUrl Bhu = user.Bhu();
        Bitmap A0I = C25821No.A00().A0I(Bhu, str);
        if (A0I != null) {
            C41761wQ c41761wQ = this.A00;
            final C6JY c6jy = C6JW.A00(this.A01, "XmaShareSenderHelper").A00;
            InterfaceC2056098k A03 = AbstractC140946Yw.A03(this.A03);
            final String username = user.getUsername();
            final String id = user.getId();
            final String username2 = user.getUsername();
            final byte[] A07 = LLU.A07(A0I);
            final String A02 = LLU.A02(AbstractC43592JPx.A0w(Bhu));
            final int height = Bhu.getHeight();
            final int width = Bhu.getWidth();
            ImageUrl imageUrl = this.A02;
            final byte[] A09 = llu.A09(imageUrl, str);
            final String A022 = LLU.A02(AbstractC43592JPx.A0w(imageUrl));
            final Integer A0e = JQ0.A0e(imageUrl.getHeight(), -1);
            final Integer A0e2 = JQ0.A0e(imageUrl.getWidth(), -1);
            final String str2 = this.A05;
            c41761wQ.A02(AbstractC31180DnO.A0I(C6JY.A01(c6jy, A03).A0L(new C6D2() { // from class: X.Law
                @Override // X.C6D2
                public final Object apply(Object obj2) {
                    final C6JY c6jy2 = C6JY.this;
                    final byte[] bArr = A07;
                    final byte[] bArr2 = A09;
                    final String str3 = username;
                    final String str4 = id;
                    final String str5 = username2;
                    final String str6 = A02;
                    final int i = height;
                    final int i2 = width;
                    final String str7 = A022;
                    final Integer num = A0e;
                    final Integer num2 = A0e2;
                    final String str8 = str2;
                    final InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj2;
                    if (interfaceC132965zL instanceof C48496Lcn) {
                        return C48496Lcn.A00(interfaceC132965zL);
                    }
                    return C48331La4.A00(c6jy2).A0L(new C6D2() { // from class: X.Laz
                        @Override // X.C6D2
                        public final Object apply(Object obj3) {
                            final C6JY c6jy3 = c6jy2;
                            byte[] bArr3 = bArr;
                            byte[] bArr4 = bArr2;
                            final InterfaceC132965zL interfaceC132965zL2 = interfaceC132965zL;
                            final String str9 = str3;
                            final String str10 = str4;
                            final String str11 = str5;
                            final String str12 = str6;
                            final int i3 = i;
                            final int i4 = i2;
                            final String str13 = str7;
                            final Integer num3 = num;
                            final Integer num4 = num2;
                            final String str14 = str8;
                            Pair pair = (Pair) obj3;
                            K3a k3a = (K3a) pair.first;
                            final C1345666g c1345666g = (C1345666g) pair.second;
                            final String A14 = AbstractC25225BEi.A14();
                            final String A032 = C6JY.A03(k3a, bArr3);
                            final String A0L = JQ1.A0L(k3a, A032, bArr4);
                            return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcT
                                @Override // X.InterfaceC1345866i
                                public final void EpD(C1346766r c1346766r) {
                                    C6JY c6jy4 = c6jy3;
                                    InterfaceC132965zL interfaceC132965zL3 = interfaceC132965zL2;
                                    C1345666g c1345666g2 = c1345666g;
                                    String str15 = str9;
                                    String str16 = str10;
                                    String str17 = str11;
                                    String str18 = A032;
                                    String str19 = str12;
                                    int i5 = i3;
                                    int i6 = i4;
                                    String str20 = A0L;
                                    String str21 = str13;
                                    Integer num5 = num3;
                                    Integer num6 = num4;
                                    String str22 = str14;
                                    String str23 = A14;
                                    String A04 = C6JY.A04(interfaceC132965zL3, c6jy4, 70547, 1011);
                                    long A092 = JQ0.A09(interfaceC132965zL3);
                                    JRS A00 = JRS.A00(c1346766r, 62);
                                    InterfaceExecutorC135866Co ASj = c1345666g2.mMailboxApiHandleMetaProvider.ASj(0);
                                    MailboxFutureImpl A0D = AbstractC43592JPx.A0D(ASj);
                                    int A002 = AbstractC1346866s.A00(A0D);
                                    TraceInfo A0F = AbstractC43592JPx.A0F(A00, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaProfileShareClientSend");
                                    if (!ASj.ELJ(new YBU(c1345666g2, A0D, num5, num6, str15, str16, str17, str18, str19, str20, str21, A04, str22, str23, A002, i5, i6, A092))) {
                                        A0D.cancel(false);
                                        AbstractC1346866s.A02(A002);
                                        AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaProfileShareClientSend");
                                    }
                                    PlatformLogger.platformEventLog(5);
                                }
                            }, AbstractC137146It.A00("instagram_xma_profile_share_client_send"));
                        }
                    });
                }
            }), "instagram_xma_profile_share_client_send"), C49787Lyu.A00);
            return C0eB.A00;
        }
        throw AbstractC166997dE.A0g();
    }
}
