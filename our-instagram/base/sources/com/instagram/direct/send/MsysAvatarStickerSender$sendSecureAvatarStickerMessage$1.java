package com.instagram.direct.send;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.InterfaceC16620sF;
import X.InterfaceC2056098k;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import java.io.File;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1", f = "MsysAvatarStickerSender.kt", i = {1, 2, 2}, l = {40, 44, 48}, m = "invokeSuspend", n = {"threadId", "threadId", "previewUUID"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes8.dex */
public final class MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ InterfaceC2056098k A06;
    public final /* synthetic */ File A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1(UserSession userSession, InterfaceC2056098k interfaceC2056098k, File file, String str, String str2, String str3, String str4, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A05 = userSession;
        this.A06 = interfaceC2056098k;
        this.A07 = file;
        this.A09 = str;
        this.A03 = i;
        this.A04 = i2;
        this.A0B = str2;
        this.A0A = str3;
        this.A08 = str4;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        return new MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1(this.A05, this.A06, this.A07, this.A09, this.A0B, this.A0A, this.A08, interfaceC23621Ds, this.A03, this.A04);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            r35 = this;
            r3 = r36
            X.1JX r9 = X.C1JX.A02
            r4 = r35
            int r0 = r4.A00
            r8 = 3
            r7 = 2
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L74
            if (r0 == r5) goto L8c
            if (r0 == r7) goto Lad
            java.lang.Object r1 = r4.A02
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r4.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            X.AbstractC09560e7.A00(r3)
        L1d:
            java.lang.String r3 = (java.lang.String) r3
            X.LFD r11 = X.LEA.A01
            com.instagram.common.session.UserSession r12 = r4.A05
            long r7 = r0.A00
            java.lang.String r9 = r4.A09
            int r10 = r4.A03
            java.lang.Integer r13 = X.AbstractC43592JPx.A0r(r10)
            int r6 = r4.A04
            java.lang.Integer r14 = X.AbstractC43592JPx.A0r(r6)
            java.lang.Integer r15 = X.AbstractC43592JPx.A0r(r10)
            java.lang.Integer r16 = X.AbstractC43592JPx.A0r(r6)
            java.io.File r6 = r4.A07
            java.lang.String r22 = r6.getName()
            X.C14360o3.A07(r22)
            long r32 = r6.length()
            r29 = 0
            java.lang.String r6 = r4.A0B
            java.lang.Long r18 = X.AbstractC37302Gc3.A0V(r6)
            java.lang.String r6 = r4.A0A
            java.lang.String r4 = r4.A08
            java.lang.Long r19 = X.AbstractC92784Dr.A01(r0)
            r21 = r9
            r24 = r3
            r25 = r2
            r26 = r6
            r27 = r4
            r28 = r5
            r30 = r7
            r34 = r29
            r20 = r9
            r23 = r1
            r17 = r2
            r11.A01(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r34)
            X.0eB r9 = X.C0eB.A00
            return r9
        L74:
            X.AbstractC09560e7.A00(r3)
            com.instagram.common.session.UserSession r3 = r4.A05
            X.66g r1 = X.LFD.A00(r3)
            X.98k r0 = r4.A06
            com.google.common.util.concurrent.ListenableFuture r0 = X.LCI.A01(r1, r3, r0)
            r4.A00 = r5
            java.lang.Object r3 = X.AbstractC47129KsO.A00(r0, r4)
            if (r3 != r9) goto L8f
            return r9
        L8c:
            X.AbstractC09560e7.A00(r3)
        L8f:
            r0 = r3
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            com.instagram.common.session.UserSession r6 = r4.A05
            java.io.File r1 = r4.A07
            java.lang.String r3 = X.AbstractC43592JPx.A0x(r1)
            r1 = 0
            X.C14360o3.A0B(r6, r1)
            com.facebook.msys.mca.MailboxFutureImpl r1 = X.LIu.A00(r6, r3, r2)
            r4.A01 = r0
            r4.A00 = r7
            java.lang.Object r3 = X.AbstractC133285zv.A01(r1, r4)
            if (r3 != r9) goto Lb4
            return r9
        Lad:
            java.lang.Object r0 = r4.A01
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = (com.instagram.model.direct.threadkey.impl.MsysThreadId) r0
            X.AbstractC09560e7.A00(r3)
        Lb4:
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            com.instagram.common.session.UserSession r7 = r4.A05
            java.io.File r3 = r4.A07
            java.lang.String r6 = X.AbstractC43592JPx.A0x(r3)
            r3 = 0
            X.C14360o3.A0B(r7, r3)
            com.facebook.msys.mca.MailboxFutureImpl r3 = X.LIu.A00(r7, r6, r2)
            r4.A01 = r0
            r4.A02 = r1
            r4.A00 = r8
            java.lang.Object r3 = X.AbstractC133285zv.A01(r3, r4)
            if (r3 != r9) goto L1d
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.send.MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MsysAvatarStickerSender$sendSecureAvatarStickerMessage$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
