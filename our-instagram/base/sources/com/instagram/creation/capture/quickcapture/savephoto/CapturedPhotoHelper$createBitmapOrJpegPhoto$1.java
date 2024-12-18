package com.instagram.creation.capture.quickcapture.savephoto;

import X.AbstractC09560e7;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C183978Ee;
import X.C197098ne;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createBitmapOrJpegPhoto$1", f = "CapturedPhotoHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CapturedPhotoHelper$createBitmapOrJpegPhoto$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C183978Ee A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturedPhotoHelper$createBitmapOrJpegPhoto$1(Bitmap bitmap, UserSession userSession, C183978Ee c183978Ee, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, byte[] bArr) {
        super(2, interfaceC23621Ds);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = bitmap;
        this.A05 = bArr;
        this.A02 = c183978Ee;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        UserSession userSession = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        return new CapturedPhotoHelper$createBitmapOrJpegPhoto$1(this.A00, userSession, this.A02, str, str2, interfaceC23621Ds, this.A05);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CapturedPhotoHelper$createBitmapOrJpegPhoto$1) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        String absolutePath = C197098ne.A04(this.A00, this.A01, this.A03, this.A04, this.A05).getAbsolutePath();
        C183978Ee c183978Ee = this.A02;
        c183978Ee.A0k = absolutePath;
        c183978Ee.A0D(absolutePath);
        return absolutePath;
    }
}
