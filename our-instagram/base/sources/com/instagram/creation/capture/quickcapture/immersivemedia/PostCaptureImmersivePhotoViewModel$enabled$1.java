package com.instagram.creation.capture.quickcapture.immersivemedia;

import X.AbstractC23611Dp;
import X.C0eB;
import X.C183968Ec;
import X.InterfaceC16600sD;
import X.InterfaceC23621Ds;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.immersivemedia.PostCaptureImmersivePhotoViewModel$enabled$1", f = "PostCaptureImmersivePhotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class PostCaptureImmersivePhotoViewModel$enabled$1 extends AbstractC23611Dp implements InterfaceC16600sD {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C183968Ec A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostCaptureImmersivePhotoViewModel$enabled$1(C183968Ec c183968Ec, InterfaceC23621Ds interfaceC23621Ds) {
        super(4, interfaceC23621Ds);
        this.A03 = c183968Ec;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        PostCaptureImmersivePhotoViewModel$enabled$1 postCaptureImmersivePhotoViewModel$enabled$1 = new PostCaptureImmersivePhotoViewModel$enabled$1(this.A03, (InterfaceC23621Ds) obj4);
        postCaptureImmersivePhotoViewModel$enabled$1.A00 = obj;
        postCaptureImmersivePhotoViewModel$enabled$1.A01 = booleanValue;
        postCaptureImmersivePhotoViewModel$enabled$1.A02 = booleanValue2;
        return postCaptureImmersivePhotoViewModel$enabled$1.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (X.A34.A00(r3.A02, (X.C55U) r3.A03.A08.A00, r3.A04.A0C()) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
    
        r3 = r8.A03;
        r2 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r5 = r6.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        X.AbstractC199018r3.A00(r5, r2, (X.C55U) r3.A03.A08.A00, r3.A04.A0C(), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        return java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        if (r7 != false) goto L14;
     */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.AbstractC09560e7.A00(r9)
            java.lang.Object r6 = r8.A00
            X.8Ee r6 = (X.C183978Ee) r6
            boolean r1 = r8.A01
            boolean r7 = r8.A02
            r5 = 0
            if (r6 == 0) goto L37
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r6.A01()
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r0.A00
            if (r0 == 0) goto L37
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L37
            if (r1 == 0) goto L37
            if (r7 == 0) goto L37
            X.8Ec r3 = r8.A03
            com.instagram.common.session.UserSession r2 = r3.A02
            X.81l r0 = r3.A03
            X.81v r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.55U r1 = (X.C55U) r1
            X.83z r0 = r3.A04
            boolean r0 = r0.A0C()
            boolean r0 = X.A34.A00(r2, r1, r0)
            r4 = 1
            if (r0 != 0) goto L3a
        L37:
            r4 = 0
            if (r7 == 0) goto L55
        L3a:
            X.8Ec r3 = r8.A03
            com.instagram.common.session.UserSession r2 = r3.A02
            if (r6 == 0) goto L44
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r6.A01()
        L44:
            X.81l r0 = r3.A03
            X.81v r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.55U r1 = (X.C55U) r1
            X.83z r0 = r3.A04
            boolean r0 = r0.A0C()
            X.AbstractC199018r3.A00(r5, r2, r1, r0, r4)
        L55:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.immersivemedia.PostCaptureImmersivePhotoViewModel$enabled$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
