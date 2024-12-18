package com.instagram.direct.send.msys.sharesender;

import X.AbstractC09560e7;
import X.AbstractC140946Yw;
import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.AbstractC31180DnO;
import X.C09530e4;
import X.C0eB;
import X.C25821No;
import X.C38321qM;
import X.C41761wQ;
import X.C48388Lb3;
import X.C6D2;
import X.C6JW;
import X.C6JY;
import X.InterfaceC16620sF;
import X.InterfaceC2056098k;
import X.InterfaceC23621Ds;
import X.InterfaceC50444MOy;
import X.InterfaceC83713oG;
import X.JQn;
import X.LLU;
import android.graphics.Bitmap;
import android.util.Pair;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.TraceInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.msys.sharesender.XmaShareSenderHelper$sendXmaStoryReply$1", f = "XmaShareSenderHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class XmaShareSenderHelper$sendXmaStoryReply$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C41761wQ A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ InterfaceC50444MOy A05;
    public final /* synthetic */ C38321qM A06;
    public final /* synthetic */ InterfaceC83713oG A07;
    public final /* synthetic */ ExtendedImageUrl A08;
    public final /* synthetic */ User A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ String A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XmaShareSenderHelper$sendXmaStoryReply$1(C41761wQ c41761wQ, UserSession userSession, InterfaceC50444MOy interfaceC50444MOy, C38321qM c38321qM, InterfaceC83713oG interfaceC83713oG, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, String str3, String str4, String str5, InterfaceC23621Ds interfaceC23621Ds, int i, int i2, long j) {
        super(2, interfaceC23621Ds);
        this.A06 = c38321qM;
        this.A0E = str;
        this.A0A = str2;
        this.A08 = extendedImageUrl;
        this.A03 = c41761wQ;
        this.A04 = userSession;
        this.A07 = interfaceC83713oG;
        this.A02 = j;
        this.A01 = i;
        this.A09 = user;
        this.A0B = str3;
        this.A00 = i2;
        this.A0D = str4;
        this.A0C = str5;
        this.A05 = interfaceC50444MOy;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        C38321qM c38321qM = this.A06;
        String str = this.A0E;
        String str2 = this.A0A;
        ExtendedImageUrl extendedImageUrl = this.A08;
        C41761wQ c41761wQ = this.A03;
        UserSession userSession = this.A04;
        InterfaceC83713oG interfaceC83713oG = this.A07;
        long j = this.A02;
        int i = this.A01;
        User user = this.A09;
        String str3 = this.A0B;
        int i2 = this.A00;
        return new XmaShareSenderHelper$sendXmaStoryReply$1(c41761wQ, userSession, this.A05, c38321qM, interfaceC83713oG, extendedImageUrl, user, str, str2, str3, this.A0D, this.A0C, interfaceC23621Ds, i, i2, j);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((XmaShareSenderHelper$sendXmaStoryReply$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        final Long l;
        ExtendedImageUrl extendedImageUrl;
        Long l2;
        AbstractC09560e7.A00(obj);
        C38321qM c38321qM = this.A06;
        String str = this.A0E;
        C09530e4 A04 = LLU.A04(c38321qM, str, true);
        if (A04 != null) {
            ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) A04.A00;
            Bitmap bitmap = (Bitmap) A04.A01;
            String str2 = this.A0A;
            if (str2 != null && (extendedImageUrl = this.A08) != null) {
                Bitmap A0H = C25821No.A00().A0H(extendedImageUrl, str);
                if (A0H != null) {
                    C41761wQ c41761wQ = this.A03;
                    C6JY c6jy = C6JW.A00(this.A04, "XmaShareSenderHelper").A00;
                    InterfaceC2056098k A03 = AbstractC140946Yw.A03(this.A07);
                    Long l3 = new Long(this.A02);
                    int i = this.A01;
                    String username = this.A09.getUsername();
                    String id = c38321qM.getId();
                    if (id != null) {
                        long A18 = c38321qM.A18();
                        if (A18 != Long.MAX_VALUE) {
                            l2 = Long.valueOf(A18);
                        } else {
                            l2 = null;
                        }
                        String str3 = this.A0B;
                        int i2 = this.A00;
                        byte[] A07 = LLU.A07(bitmap);
                        String A02 = LLU.A02(extendedImageUrl2.A0A);
                        int height = extendedImageUrl2.getHeight();
                        int width = extendedImageUrl2.getWidth();
                        String str4 = extendedImageUrl.A0A;
                        JQn.A00(AbstractC31180DnO.A0I(C6JY.A01(c6jy, A03).A0L(new C48388Lb3(LLU.A07(A0H), l3, l2, c6jy, A07, username, id, str3, A02, str2, str4, LLU.A02(str4), this.A0D, i, i2, height, width, A0H.getHeight(), A0H.getWidth(), 1)), "instagram_xma_story_reply_with_sticker_client_send"), c41761wQ, this.A05, 58);
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                C41761wQ c41761wQ2 = this.A03;
                final C6JY c6jy2 = C6JW.A00(this.A04, "XmaShareSenderHelper").A00;
                InterfaceC2056098k A032 = AbstractC140946Yw.A03(this.A07);
                final Long l4 = new Long(this.A02);
                final String str5 = this.A0C;
                final int i3 = this.A01;
                final String username2 = this.A09.getUsername();
                final String id2 = c38321qM.getId();
                if (id2 != null) {
                    long A182 = c38321qM.A18();
                    if (A182 != Long.MAX_VALUE) {
                        l = Long.valueOf(A182);
                    } else {
                        l = null;
                    }
                    final String str6 = this.A0B;
                    final int i4 = this.A00;
                    final byte[] A072 = LLU.A07(bitmap);
                    final String A022 = LLU.A02(extendedImageUrl2.A0A);
                    final int height2 = extendedImageUrl2.getHeight();
                    final int width2 = extendedImageUrl2.getWidth();
                    final String str7 = this.A0D;
                    JQn.A00(AbstractC31180DnO.A0I(C6JY.A01(c6jy2, A032).A0L(new C6D2() { // from class: X.Lay
                        @Override // X.C6D2
                        public final Object apply(Object obj2) {
                            final C6JY c6jy3 = C6JY.this;
                            final byte[] bArr = A072;
                            final int i5 = i3;
                            final Long l5 = l4;
                            final String str8 = str5;
                            final String str9 = username2;
                            final String str10 = id2;
                            final Long l6 = l;
                            final String str11 = str6;
                            final int i6 = i4;
                            final String str12 = A022;
                            final int i7 = height2;
                            final int i8 = width2;
                            final String str13 = str7;
                            final InterfaceC132965zL interfaceC132965zL = (InterfaceC132965zL) obj2;
                            if (interfaceC132965zL instanceof C48496Lcn) {
                                return C48496Lcn.A00(interfaceC132965zL);
                            }
                            return C48331La4.A00(c6jy3).A0L(new C6D2() { // from class: X.Lb0
                                @Override // X.C6D2
                                public final Object apply(Object obj3) {
                                    final C6JY c6jy4 = c6jy3;
                                    byte[] bArr2 = bArr;
                                    final int i9 = i5;
                                    final InterfaceC132965zL interfaceC132965zL2 = interfaceC132965zL;
                                    final Long l7 = l5;
                                    final String str14 = str8;
                                    final String str15 = str9;
                                    final String str16 = str10;
                                    final Long l8 = l6;
                                    final String str17 = str11;
                                    final int i10 = i6;
                                    final String str18 = str12;
                                    final int i11 = i7;
                                    final int i12 = i8;
                                    final String str19 = str13;
                                    Pair pair = (Pair) obj3;
                                    K3a k3a = (K3a) pair.first;
                                    final C1345666g c1345666g = (C1345666g) pair.second;
                                    final String A033 = C6JY.A03(k3a, bArr2);
                                    C18C.A07(A033, "Failed to resolve preview ID");
                                    final String A14 = AbstractC25225BEi.A14();
                                    return C42221xC.A07(new InterfaceC1345866i() { // from class: X.LcU
                                        @Override // X.InterfaceC1345866i
                                        public final void EpD(C1346766r c1346766r) {
                                            C6JY c6jy5 = c6jy4;
                                            int i13 = i9;
                                            InterfaceC132965zL interfaceC132965zL3 = interfaceC132965zL2;
                                            C1345666g c1345666g2 = c1345666g;
                                            Long l9 = l7;
                                            String str20 = str14;
                                            String str21 = str15;
                                            String str22 = str16;
                                            Long l10 = l8;
                                            String str23 = str17;
                                            int i14 = i10;
                                            String str24 = A033;
                                            String str25 = str18;
                                            int i15 = i11;
                                            int i16 = i12;
                                            String str26 = str19;
                                            String str27 = A14;
                                            String A042 = C6JY.A04(interfaceC132965zL3, c6jy5, 70547, i13);
                                            long A09 = JQ0.A09(interfaceC132965zL3);
                                            long longValue = l9.longValue();
                                            JVL jvl = new JVL(c1346766r, 0);
                                            InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(c1345666g2, 0);
                                            MailboxFutureImpl A0D = AbstractC43592JPx.A0D(A0C);
                                            int A00 = AbstractC1346866s.A00(A0D);
                                            TraceInfo A0F = AbstractC43592JPx.A0F(jvl, A0D, "MailboxInstagramSecureMessage", "runInstagramXmaStoryReplyClientSend");
                                            if (!A0C.ELJ(new YBV(c1345666g2, A0D, l10, str20, str21, str22, str23, str24, str25, A042, str26, str27, A00, i13, i14, i15, i16, A09, longValue))) {
                                                A0D.cancel(false);
                                                AbstractC1346866s.A02(A00);
                                                AbstractC1346866s.A03(A0F, "MailboxInstagramSecureMessage", "runInstagramXmaStoryReplyClientSend");
                                            }
                                            PlatformLogger.platformEventLog(5);
                                        }
                                    }, AbstractC137146It.A00("instagram_xma_story_reply_client_send"));
                                }
                            });
                        }
                    }), "instagram_xma_story_reply_client_send"), c41761wQ2, this.A05, 59);
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
            return C0eB.A00;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }
}
