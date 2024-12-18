package com.instagram.creation.capture.quickcapture.savephoto;

import X.AbstractC09560e7;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C14360o3;
import X.C183978Ee;
import X.C197098ne;
import X.InterfaceC16620sF;
import X.InterfaceC23621Ds;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.instagram.common.session.UserSession;
import com.instagram.libyuv.IgYuvColorConverter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createYuvPhoto$1", f = "CapturedPhotoHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
public final class CapturedPhotoHelper$createYuvPhoto$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C183978Ee A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturedPhotoHelper$createYuvPhoto$1(UserSession userSession, C183978Ee c183978Ee, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, byte[] bArr, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = c183978Ee;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        byte[] bArr = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        return new CapturedPhotoHelper$createYuvPhoto$1(this.A02, this.A03, this.A04, this.A05, interfaceC23621Ds, bArr, i, i2);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CapturedPhotoHelper$createYuvPhoto$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        AbstractC09560e7.A00(obj);
        byte[] bArr = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        C14360o3.A0B(bArr, 0);
        int i3 = i * i2;
        int i4 = i3 + 1;
        int i5 = i4 / 2;
        int i6 = i3 + i5;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i6);
        allocateDirect.put(bArr);
        allocateDirect.position(i3);
        ByteBuffer slice = allocateDirect.slice();
        allocateDirect.position((i4 / 4) + i3);
        ByteBuffer slice2 = allocateDirect.slice();
        allocateDirect.rewind();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i3);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i5);
        C14360o3.A0A(slice);
        int i7 = i / 2;
        C14360o3.A0A(slice2);
        C14360o3.A0A(allocateDirect2);
        C14360o3.A0A(allocateDirect3);
        IgYuvColorConverter igYuvColorConverter = IgYuvColorConverter.INSTANCE;
        AbstractC167007dF.A1F(slice, 2, slice2);
        AbstractC167007dF.A1I(allocateDirect2, 6, allocateDirect3);
        if (allocateDirect.isDirect()) {
            if (slice.isDirect()) {
                if (slice2.isDirect()) {
                    if (allocateDirect2.isDirect()) {
                        if (allocateDirect3.isDirect()) {
                            IgYuvColorConverter.nativeConvertI420ToNV21(allocateDirect, i, slice, i7, slice2, i7, allocateDirect2, i, allocateDirect3, i, i, i2);
                            allocateDirect.put(allocateDirect2);
                            allocateDirect.put(allocateDirect3);
                            allocateDirect.rewind();
                            byte[] bArr2 = new byte[i6];
                            allocateDirect.get(bArr2);
                            YuvImage yuvImage = new YuvImage(bArr2, 17, i, i2, null);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 90, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            C14360o3.A07(byteArray);
                            String absolutePath = C197098ne.A04(null, this.A02, this.A04, this.A05, byteArray).getAbsolutePath();
                            C183978Ee c183978Ee = this.A03;
                            c183978Ee.A0k = absolutePath;
                            c183978Ee.A0D(absolutePath);
                            return absolutePath;
                        }
                        throw AbstractC166987dD.A14("Check failed.");
                    }
                    throw AbstractC166987dD.A14("Check failed.");
                }
                throw AbstractC166987dD.A14("Check failed.");
            }
            throw AbstractC166987dD.A14("Check failed.");
        }
        throw AbstractC166987dD.A14("Check failed.");
    }
}
