package com.instagram.arlink.fragment;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C14360o3;
import X.C196708n0;
import X.C22904A7z;
import android.os.Bundle;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class YUVImageData {
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;

    public YUVImageData(C196708n0 c196708n0) {
        int i;
        int i2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i3;
        int i4;
        int i5;
        C22904A7z[] c22904A7zArr;
        C09170dP.A0C("arlink");
        int i6 = c196708n0.A01;
        if (i6 != 1) {
            if (i6 == 35 && (c22904A7zArr = c196708n0.A0B) != null && c22904A7zArr.length == 3) {
                C22904A7z c22904A7z = c22904A7zArr[0];
                ByteBuffer byteBuffer = c22904A7z.A02;
                if (byteBuffer != null) {
                    bArr = new byte[byteBuffer.remaining()];
                    ByteBuffer byteBuffer2 = c22904A7z.A02;
                    if (byteBuffer2 != null) {
                        byteBuffer2.get(bArr);
                    }
                    i = c22904A7z.A01;
                    C22904A7z c22904A7z2 = c22904A7zArr[1];
                    ByteBuffer byteBuffer3 = c22904A7z2.A02;
                    if (byteBuffer3 != null) {
                        bArr2 = new byte[byteBuffer3.remaining()];
                        ByteBuffer byteBuffer4 = c22904A7z2.A02;
                        if (byteBuffer4 != null) {
                            byteBuffer4.get(bArr2);
                        }
                        i3 = c22904A7z2.A01;
                        C22904A7z c22904A7z3 = c22904A7zArr[2];
                        ByteBuffer byteBuffer5 = c22904A7z3.A02;
                        if (byteBuffer5 != null) {
                            bArr3 = new byte[byteBuffer5.remaining()];
                            ByteBuffer byteBuffer6 = c22904A7z3.A02;
                            if (byteBuffer6 != null) {
                                byteBuffer6.get(bArr3);
                            }
                            i2 = c22904A7z3.A01;
                            i4 = c196708n0.A02;
                            i5 = c196708n0.A00;
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            } else {
                return;
            }
        } else {
            C22904A7z[] c22904A7zArr2 = c196708n0.A0B;
            if (c22904A7zArr2 == null || c22904A7zArr2.length != 1) {
                return;
            }
            i = c196708n0.A02;
            int i7 = c196708n0.A00;
            ByteBuffer byteBuffer7 = c22904A7zArr2[0].A02;
            if (byteBuffer7 == null) {
                return;
            }
            int i8 = i * i7;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i8);
            int i9 = i8 / 4;
            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i9);
            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i9);
            int i10 = c22904A7zArr2[0].A01;
            C14360o3.A0A(allocateDirect);
            C14360o3.A0A(allocateDirect2);
            i2 = i / 2;
            C14360o3.A0A(allocateDirect3);
            nativeConvertARGBToI420(byteBuffer7, i10, allocateDirect, i, allocateDirect2, i2, allocateDirect3, i2, i, i7);
            byte[] bArr4 = new byte[allocateDirect.remaining()];
            allocateDirect.get(bArr4);
            byte[] bArr5 = new byte[allocateDirect2.remaining()];
            allocateDirect2.get(bArr5);
            byte[] bArr6 = new byte[allocateDirect3.remaining()];
            allocateDirect3.get(bArr6);
            bArr = bArr4;
            bArr2 = bArr5;
            bArr3 = bArr6;
            i3 = i2;
            i4 = i;
            i5 = i7;
        }
        A00(bArr, bArr2, bArr3, i, i3, i2, i4, i5);
    }

    private final native void nativeConvertARGBToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    private final void A00(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        this.A06 = bArr;
        this.A04 = bArr2;
        this.A05 = bArr3;
        this.A02 = i;
        this.A01 = i4;
        this.A00 = i5;
        Bundle A0b = AbstractC166987dD.A0b();
        this.A03 = A0b;
        A0b.putByteArray("Y_DATA", bArr);
        Bundle bundle = this.A03;
        if (bundle != null) {
            bundle.putByteArray("U_DATA", bArr2);
        }
        Bundle bundle2 = this.A03;
        if (bundle2 != null) {
            bundle2.putByteArray("V_DATA", bArr3);
        }
        Bundle bundle3 = this.A03;
        if (bundle3 != null) {
            bundle3.putInt("Y_STRIDE", i);
        }
        Bundle bundle4 = this.A03;
        if (bundle4 != null) {
            bundle4.putInt("U_STRIDE", i2);
        }
        Bundle bundle5 = this.A03;
        if (bundle5 != null) {
            bundle5.putInt("V_STRIDE", i3);
        }
        Bundle bundle6 = this.A03;
        if (bundle6 != null) {
            bundle6.putInt("WIDTH", i4);
        }
        Bundle bundle7 = this.A03;
        if (bundle7 != null) {
            bundle7.putInt(StatusBarModule.HEIGHT_KEY, i5);
        }
    }
}
