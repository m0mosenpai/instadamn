package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createBitmapOrJpegPhoto$1;
import com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createYuvPhoto$1;
import com.instagram.libyuv.IgYuvColorConverter;
import java.nio.ByteBuffer;

/* renamed from: X.8nC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196828nC {
    public static final C183978Ee A00(Context context, Bitmap bitmap, C196708n0 c196708n0, UserSession userSession, byte[] bArr, int i, int i2, boolean z) {
        C183978Ee c183978Ee;
        C19K A02;
        InterfaceC16620sF capturedPhotoHelper$createBitmapOrJpegPhoto$1;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        String A00 = AbstractC196848nE.A00(System.currentTimeMillis());
        C14360o3.A07(A00);
        String A03 = C50472Tr.A03(userSession, A00);
        String A022 = C50472Tr.A02(context, false);
        long currentTimeMillis = System.currentTimeMillis();
        if (c196708n0 != null) {
            c183978Ee = new C183978Ee(null, i, i2, currentTimeMillis, currentTimeMillis, z);
            A02 = AnonymousClass194.A02(C12L.A00.CPG(159047438, 3));
            C22904A7z[] c22904A7zArr = c196708n0.A0B;
            if (c22904A7zArr != null) {
                C22904A7z c22904A7z = c22904A7zArr[0];
                ByteBuffer byteBuffer = c22904A7z.A02;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    C22904A7z c22904A7z2 = c22904A7zArr[1];
                    ByteBuffer byteBuffer2 = c22904A7z2.A02;
                    if (byteBuffer2 != null) {
                        byteBuffer2.rewind();
                        C22904A7z c22904A7z3 = c22904A7zArr[2];
                        ByteBuffer byteBuffer3 = c22904A7z3.A02;
                        if (byteBuffer3 != null) {
                            byteBuffer3.rewind();
                            int i3 = c196708n0.A02;
                            int i4 = c196708n0.A00;
                            int i5 = i3 * i4;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i5);
                            int i6 = i5 / 4;
                            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i6);
                            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i6);
                            int i7 = c22904A7z.A01;
                            int i8 = c22904A7z2.A01;
                            int i9 = c22904A7z3.A01;
                            int i10 = c22904A7z2.A00;
                            C14360o3.A0A(allocateDirect);
                            C14360o3.A0A(allocateDirect2);
                            int i11 = i3 / 2;
                            C14360o3.A0A(allocateDirect3);
                            IgYuvColorConverter igYuvColorConverter = IgYuvColorConverter.INSTANCE;
                            C14360o3.A0B(allocateDirect, 7);
                            C14360o3.A0B(allocateDirect2, 9);
                            C14360o3.A0B(allocateDirect3, 11);
                            if (byteBuffer.isDirect()) {
                                if (byteBuffer2.isDirect()) {
                                    if (byteBuffer3.isDirect()) {
                                        if (allocateDirect.isDirect()) {
                                            if (allocateDirect2.isDirect()) {
                                                if (allocateDirect3.isDirect()) {
                                                    IgYuvColorConverter.nativeConvertAndroid420ToI420(byteBuffer, i7, byteBuffer2, i8, byteBuffer3, i9, i10, allocateDirect, i3, allocateDirect2, i11, allocateDirect3, i11, i3, i4);
                                                    int remaining = allocateDirect.remaining() + allocateDirect2.remaining() + allocateDirect3.remaining();
                                                    ByteBuffer allocate = ByteBuffer.allocate(remaining);
                                                    allocate.put(allocateDirect);
                                                    allocate.put(allocateDirect2);
                                                    allocate.put(allocateDirect3);
                                                    allocate.rewind();
                                                    byte[] bArr2 = new byte[remaining];
                                                    allocate.get(bArr2);
                                                    c183978Ee.A1C = bArr2;
                                                    capturedPhotoHelper$createBitmapOrJpegPhoto$1 = new CapturedPhotoHelper$createYuvPhoto$1(userSession, c183978Ee, A022, A03, null, bArr2, i, i2);
                                                } else {
                                                    throw new IllegalStateException("Check failed.");
                                                }
                                            } else {
                                                throw new IllegalStateException("Check failed.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Check failed.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } else {
                                    throw new IllegalStateException("Check failed.");
                                }
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            c183978Ee = new C183978Ee(null, i, i2, currentTimeMillis, currentTimeMillis, z);
            A02 = AnonymousClass194.A02(C12L.A00.CPG(159047438, 3));
            capturedPhotoHelper$createBitmapOrJpegPhoto$1 = new CapturedPhotoHelper$createBitmapOrJpegPhoto$1(bitmap, userSession, c183978Ee, A022, A03, null, bArr);
        }
        c183978Ee.A0u = AbstractC23641Du.A01(C05F.A00, AnonymousClass191.A00, capturedPhotoHelper$createBitmapOrJpegPhoto$1, A02);
        return c183978Ee;
    }
}
