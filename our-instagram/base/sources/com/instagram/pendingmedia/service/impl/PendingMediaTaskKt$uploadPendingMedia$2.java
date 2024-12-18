package com.instagram.pendingmedia.service.impl;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C47Z;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.InterfaceC70363Du;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.impl.PendingMediaTaskKt$uploadPendingMedia$2", f = "PendingMediaTask.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
public final class PendingMediaTaskKt$uploadPendingMedia$2 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ Context A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C47Z A05;
    public final /* synthetic */ InterfaceC70363Du A06;
    public final /* synthetic */ MediaUploader A07;
    public final /* synthetic */ PendingMediaStore A08;
    public final /* synthetic */ String A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PendingMediaTaskKt$uploadPendingMedia$2(Context context, UserSession userSession, C47Z c47z, InterfaceC70363Du interfaceC70363Du, MediaUploader mediaUploader, PendingMediaStore pendingMediaStore, String str, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A03 = context;
        this.A04 = userSession;
        this.A01 = i;
        this.A08 = pendingMediaStore;
        this.A05 = c47z;
        this.A06 = interfaceC70363Du;
        this.A02 = i2;
        this.A07 = mediaUploader;
        this.A09 = str;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Context context = this.A03;
        UserSession userSession = this.A04;
        int i = this.A01;
        PendingMediaStore pendingMediaStore = this.A08;
        return new PendingMediaTaskKt$uploadPendingMedia$2(context, userSession, this.A05, this.A06, this.A07, pendingMediaStore, this.A09, interfaceC23621Ds, i, this.A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0195, code lost:
    
        if (r5 > (r8.A0D + r8.A0E)) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0226 A[Catch: all -> 0x0252, TryCatch #0 {all -> 0x0252, blocks: (B:24:0x00ab, B:26:0x00af, B:30:0x00bc, B:34:0x00c7, B:35:0x00d8, B:37:0x00f5, B:39:0x00fb, B:41:0x0106, B:43:0x0126, B:44:0x0131, B:45:0x0149, B:48:0x015e, B:49:0x0167, B:52:0x016a, B:53:0x016b, B:55:0x0170, B:57:0x0176, B:59:0x017a, B:61:0x017f, B:64:0x018d, B:66:0x0197, B:68:0x01de, B:69:0x01e2, B:72:0x01f8, B:73:0x01fe, B:75:0x0226, B:76:0x022a, B:79:0x01f0, B:86:0x0247, B:87:0x0248, B:88:0x015b, B:51:0x0168), top: B:2:0x000a, inners: #1 }] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.pendingmedia.service.impl.PendingMediaTaskKt$uploadPendingMedia$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PendingMediaTaskKt$uploadPendingMedia$2) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
