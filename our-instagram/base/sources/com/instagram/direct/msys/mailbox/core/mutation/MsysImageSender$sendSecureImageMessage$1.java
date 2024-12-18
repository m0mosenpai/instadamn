package com.instagram.direct.msys.mailbox.core.mutation;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C183978Ee;
import X.InterfaceC16620sF;
import X.InterfaceC2056098k;
import X.InterfaceC23621Ds;
import X.L6O;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1", f = "MsysImageSender.kt", i = {1, 2, 2}, l = {40, 45, 49, 77}, m = "invokeSuspend", n = {"msysThreadId", "msysThreadId", "imageUUID"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes8.dex */
public final class MsysImageSender$sendSecureImageMessage$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ L6O A03;
    public final /* synthetic */ InterfaceC2056098k A04;
    public final /* synthetic */ C183978Ee A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MsysImageSender$sendSecureImageMessage$1(L6O l6o, InterfaceC2056098k interfaceC2056098k, C183978Ee c183978Ee, Integer num, Long l, String str, String str2, String str3, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = l6o;
        this.A04 = interfaceC2056098k;
        this.A05 = c183978Ee;
        this.A09 = str;
        this.A06 = num;
        this.A07 = l;
        this.A0B = z;
        this.A0A = str2;
        this.A08 = str3;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        L6O l6o = this.A03;
        InterfaceC2056098k interfaceC2056098k = this.A04;
        C183978Ee c183978Ee = this.A05;
        String str = this.A09;
        return new MsysImageSender$sendSecureImageMessage$1(l6o, interfaceC2056098k, c183978Ee, this.A06, this.A07, str, this.A0A, this.A08, interfaceC23621Ds, this.A0B);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MsysImageSender$sendSecureImageMessage$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
