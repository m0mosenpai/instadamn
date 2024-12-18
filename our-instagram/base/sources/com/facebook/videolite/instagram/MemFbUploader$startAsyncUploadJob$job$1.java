package com.facebook.videolite.instagram;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C48130LSf;
import X.C48131LSg;
import X.C55191Odx;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import X.XE6;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1", f = "MemFbUploader.kt", i = {0}, l = {72}, m = "invokeSuspend", n = {"mediaId"}, s = {"J$0"})
/* loaded from: classes8.dex */
public final class MemFbUploader$startAsyncUploadJob$job$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public long A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C55191Odx A03;
    public final /* synthetic */ XE6 A04;
    public final /* synthetic */ C48130LSf A05;
    public final /* synthetic */ C48131LSg A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemFbUploader$startAsyncUploadJob$job$1(C55191Odx c55191Odx, XE6 xe6, C48130LSf c48130LSf, C48131LSg c48131LSg, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A04 = xe6;
        this.A06 = c48131LSg;
        this.A03 = c55191Odx;
        this.A05 = c48130LSf;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        MemFbUploader$startAsyncUploadJob$job$1 memFbUploader$startAsyncUploadJob$job$1 = new MemFbUploader$startAsyncUploadJob$job$1(this.A03, this.A04, this.A05, this.A06, interfaceC23621Ds);
        memFbUploader$startAsyncUploadJob$job$1.A02 = obj;
        return memFbUploader$startAsyncUploadJob$job$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0082  */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.videolite.instagram.MemFbUploader$startAsyncUploadJob$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemFbUploader$startAsyncUploadJob$job$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
