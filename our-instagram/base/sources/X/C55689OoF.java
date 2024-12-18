package X;

import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.nio.ByteBuffer;

/* renamed from: X.OoF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55689OoF implements InterfaceC58101PpQ {
    public volatile Rect A00;

    @Override // X.InterfaceC58101PpQ
    public final ByteBuffer CJq(ByteBuffer byteBuffer) {
        Pair create;
        OTP otp;
        ByteBuffer byteBuffer2;
        int A02;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Rect rect = this.A00;
        if (rect == null || (rect.left == 0 && rect.right == 0 && rect.top == 0 && rect.bottom == 0)) {
            return byteBuffer;
        }
        SystemClock.elapsedRealtime();
        try {
            try {
                ByteBuffer duplicate = byteBuffer.duplicate();
                C14360o3.A07(duplicate);
                duplicate.getShort();
                if (duplicate.get() == 0) {
                    duplicate.getShort();
                } else {
                    duplicate.get();
                }
                ByteBuffer duplicate2 = duplicate.duplicate();
                duplicate2.flip();
                ByteBuffer slice = duplicate.slice();
                int limit = slice.limit() - 4;
                for (int i7 = 0; i7 < limit; i7++) {
                    if (slice.get(i7) == 0 && slice.get(i7 + 1) == 0) {
                        int i8 = i7 + 2;
                        if (slice.get(i8) == 0 || slice.get(i8) == 1) {
                            slice.position(i7);
                            ByteBuffer slice2 = slice.slice();
                            slice.flip();
                            create = Pair.create(OTP.A02.A00(duplicate2, slice), slice2);
                            break;
                        }
                    }
                }
                create = Pair.create(OTP.A02.A00(duplicate2, slice), ByteBuffer.allocateDirect(0));
                C14360o3.A07(create);
                otp = (OTP) create.first;
                byteBuffer2 = (ByteBuffer) create.second;
            } catch (Exception e) {
                C0K8.A07(C55689OoF.class, "Failed to rewrite SPS", e, new Object[0]);
            }
            if ((otp.A00.get(r1.limit() - 1) & 31) == 7) {
                ByteBuffer duplicate3 = ((OTP) create.first).A01.duplicate();
                C14360o3.A07(duplicate3);
                C55019OWs c55019OWs = new C55019OWs(duplicate3);
                if (c55019OWs.A00 > 0) {
                    C55019OWs.A00(c55019OWs);
                }
                int A00 = C55019OWs.A00(c55019OWs);
                AbstractC53697Nom.A00(A00);
                if (c55019OWs.A00 > 0) {
                    C55019OWs.A00(c55019OWs);
                }
                AbstractC53697Nom.A00(C55019OWs.A00(c55019OWs));
                if (c55019OWs.A00 > 0) {
                    C55019OWs.A00(c55019OWs);
                }
                AbstractC53697Nom.A00(C55019OWs.A00(c55019OWs));
                A00(c55019OWs);
                if (A00 != 44 && A00 != 83 && A00 != 86 && A00 != 100 && A00 != 110 && A00 != 118 && A00 != 122 && A00 != 128 && A00 != 134 && A00 != 244 && A00 != 138 && A00 != 139) {
                    A02 = 1;
                    i = 0;
                } else {
                    A02 = c55019OWs.A02();
                    AbstractC53697Nom.A00(A02);
                    if (A02 != 3) {
                        i = 0;
                    } else {
                        i = c55019OWs.A01();
                        AbstractC53697Nom.A00(i);
                    }
                    A00(c55019OWs);
                    A00(c55019OWs);
                    AbstractC53697Nom.A00(c55019OWs.A01());
                    int A01 = c55019OWs.A01();
                    AbstractC53697Nom.A00(A01);
                    if (A01 == 1) {
                        int i9 = 12;
                        if (A02 != 3) {
                            i9 = 8;
                        }
                        int A03 = c55019OWs.A03(i9);
                        AbstractC53697Nom.A00(A03);
                        if (A03 > 0) {
                            throw AbstractC166987dD.A1D("SPS contains scaling lists, which are unsupported.");
                        }
                    }
                }
                A00(c55019OWs);
                int A022 = c55019OWs.A02();
                AbstractC53697Nom.A00(A022);
                if (A022 != 0) {
                    if (A022 == 1) {
                        AbstractC53697Nom.A00(c55019OWs.A01());
                        A00(c55019OWs);
                        A00(c55019OWs);
                        int A023 = c55019OWs.A02();
                        AbstractC53697Nom.A00(A023);
                        for (int i10 = 0; i10 < A023; i10++) {
                            A00(c55019OWs);
                        }
                    }
                } else {
                    A00(c55019OWs);
                }
                A00(c55019OWs);
                AbstractC53697Nom.A00(c55019OWs.A01());
                A00(c55019OWs);
                A00(c55019OWs);
                int A012 = c55019OWs.A01();
                AbstractC53697Nom.A00(A012);
                if (A012 == 0) {
                    AbstractC53697Nom.A00(c55019OWs.A01());
                }
                AbstractC53697Nom.A00(c55019OWs.A01());
                ByteBuffer byteBuffer3 = c55019OWs.A02;
                C54512O6p c54512O6p = new C54512O6p(byteBuffer3.position(), c55019OWs.A00);
                int A013 = c55019OWs.A01();
                AbstractC53697Nom.A00(A013);
                if (A013 != 1) {
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                } else {
                    i3 = c55019OWs.A02();
                    AbstractC53697Nom.A00(i3);
                    i4 = c55019OWs.A02();
                    AbstractC53697Nom.A00(i4);
                    i5 = c55019OWs.A02();
                    AbstractC53697Nom.A00(i5);
                    i2 = c55019OWs.A02();
                    AbstractC53697Nom.A00(i2);
                }
                C54512O6p c54512O6p2 = new C54512O6p(byteBuffer3.position(), c55019OWs.A00);
                int i11 = 2 - A012;
                if (i != 1 && A02 != 0) {
                    if (i != 0 || A02 <= 0 || (A02 != 1 && A02 != 2)) {
                        i6 = 1;
                    } else {
                        i3 *= 2;
                        i4 *= 2;
                        i6 = 2;
                        if (A02 == 1) {
                            i5 *= 2;
                            i2 *= 2;
                            i11 = 2;
                        }
                    }
                    i11 = 1;
                } else {
                    i2 *= i11;
                    i5 *= i11;
                    i6 = 1;
                }
                Rect A0V = AbstractC166987dD.A0V(i3, i5, i4, i2);
                C14360o3.A0A(otp);
                C14360o3.A0A(byteBuffer2);
                C14360o3.A0A(c54512O6p);
                C14360o3.A0A(c54512O6p2);
                C14360o3.A0A(A0V);
                C14360o3.A0B(byteBuffer2, 2);
                int i12 = rect.left;
                if (AbstractC167007dF.A1N(i12 % i6)) {
                    int i13 = rect.right;
                    if (i13 % i6 == 0) {
                        int i14 = rect.top;
                        if (i14 % i11 == 0) {
                            int i15 = rect.bottom;
                            if (i15 % i11 == 0) {
                                int i16 = A0V.left + i12;
                                int i17 = A0V.right + i13;
                                int i18 = A0V.top + i14;
                                int i19 = A0V.bottom + i15;
                                ByteBuffer byteBuffer4 = otp.A01;
                                OMh oMh = new OMh(byteBuffer4.limit() + 5);
                                C55019OWs c55019OWs2 = new C55019OWs(byteBuffer4);
                                try {
                                    int i20 = c54512O6p.A01 - 1;
                                    for (int i21 = 0; i21 < i20; i21++) {
                                        if (c55019OWs2.A00 > 0) {
                                            C55019OWs.A00(c55019OWs2);
                                        }
                                        oMh.A02(C55019OWs.A00(c55019OWs2));
                                    }
                                    int i22 = c54512O6p.A00;
                                    if (i22 > 0) {
                                        long A032 = c55019OWs2.A03(i22) << (8 - i22);
                                        C18C.A05(A032, "out of range: %s", AbstractC167007dF.A1N(((A032 >> 8) > 0L ? 1 : ((A032 >> 8) == 0L ? 0 : -1))));
                                        oMh.A00 = (byte) A032;
                                        oMh.A01 = i22;
                                    }
                                    c55019OWs2.A01 = 0;
                                    c55019OWs2.A00 = 0;
                                    c55019OWs2.A02.reset();
                                    if (i16 > 0 || i17 > 0 || i18 > 0 || i19 > 0) {
                                        oMh.A01(1);
                                        oMh.A03(i16 / i6);
                                        oMh.A03(i17 / i6);
                                        oMh.A03(i18 / i11);
                                        oMh.A03(i19 / i11);
                                    } else {
                                        oMh.A01(0);
                                    }
                                    C55019OWs c55019OWs3 = new C55019OWs(byteBuffer4);
                                    try {
                                        ByteBuffer byteBuffer5 = c55019OWs3.A02;
                                        int i23 = c54512O6p2.A01;
                                        byteBuffer5.position(i23);
                                        c55019OWs3.A01 = byteBuffer5.get(i23 - 1) & 255;
                                        int i24 = c54512O6p2.A00;
                                        c55019OWs3.A00 = i24;
                                        if (i24 > 0) {
                                            oMh.A04(8 - i24, c55019OWs3.A03(r2));
                                        }
                                        while (true) {
                                            if (c55019OWs3.A00 > 0) {
                                                C55019OWs.A00(c55019OWs3);
                                            }
                                            int A002 = C55019OWs.A00(c55019OWs3);
                                            if (A002 == -1) {
                                                break;
                                            }
                                            oMh.A04(8, A002);
                                        }
                                        c55019OWs3.A01 = 0;
                                        c55019OWs3.A00 = 0;
                                        byteBuffer5.reset();
                                        ByteBuffer byteBuffer6 = otp.A00;
                                        oMh.A00();
                                        ByteBuffer byteBuffer7 = oMh.A02;
                                        byteBuffer7.flip();
                                        OTP otp2 = new OTP(byteBuffer6, byteBuffer7);
                                        ByteBuffer byteBuffer8 = otp2.A00;
                                        int limit2 = byteBuffer8.limit();
                                        ByteBuffer byteBuffer9 = otp2.A01;
                                        OMh oMh2 = new OMh(limit2 + (byteBuffer9.limit() * 2));
                                        oMh2.A05(byteBuffer8);
                                        byteBuffer9.mark();
                                        loop4: while (true) {
                                            int i25 = 0;
                                            while (byteBuffer9.position() < byteBuffer9.limit()) {
                                                int i26 = byteBuffer9.get() & 255;
                                                if (i26 <= 3 && i25 >= 2) {
                                                    oMh2.A02(3);
                                                    i25 = 0;
                                                }
                                                oMh2.A02(i26);
                                                i25++;
                                                if (i26 != 0) {
                                                    break;
                                                }
                                            }
                                        }
                                        byteBuffer9.reset();
                                        oMh2.A00();
                                        ByteBuffer byteBuffer10 = oMh2.A02;
                                        byteBuffer10.flip();
                                        OMh oMh3 = new OMh(byteBuffer10.limit() + byteBuffer2.limit());
                                        oMh3.A05(byteBuffer10);
                                        oMh3.A05(byteBuffer2);
                                        oMh3.A00();
                                        ByteBuffer byteBuffer11 = oMh3.A02;
                                        byteBuffer11.flip();
                                        byteBuffer = byteBuffer11;
                                        return byteBuffer;
                                    } catch (Throwable th) {
                                        c55019OWs3.A01 = 0;
                                        c55019OWs3.A00 = 0;
                                        c55019OWs3.A02.reset();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    c55019OWs2.A01 = 0;
                                    c55019OWs2.A00 = 0;
                                    c55019OWs2.A02.reset();
                                    throw th2;
                                }
                            }
                            throw AbstractC166987dD.A14("Check failed.");
                        }
                        throw AbstractC166987dD.A14("Check failed.");
                    }
                    throw AbstractC166987dD.A14("Check failed.");
                }
                throw AbstractC166987dD.A14("Check failed.");
            }
            throw AbstractC25230BEn.A0n("Not SPS, NALU type = ", ((OTP) create.first).A00.get(r1.limit() - 1) & 31);
        } finally {
            SystemClock.elapsedRealtime();
        }
    }

    @Override // X.InterfaceC58101PpQ
    public final VideoEncoderConfig CKY(VideoEncoderConfig videoEncoderConfig) {
        int i = videoEncoderConfig.width;
        int i2 = videoEncoderConfig.height;
        if (i % 16 != 0) {
            i = ((i / 16) + 1) * 16;
        }
        if (i2 % 16 != 0) {
            i2 = ((i2 / 16) + 1) * 16;
        }
        this.A00 = new Rect(0, i2 - i2, i - i, 0);
        return new VideoEncoderConfig(i, i2, videoEncoderConfig.bitRate, videoEncoderConfig.frameRate, videoEncoderConfig.videoProfile, videoEncoderConfig.videoBitrateMode, videoEncoderConfig.iFrameInterval, videoEncoderConfig.enableAndroidEncoderLowLatencyControl, videoEncoderConfig.keyLatency, videoEncoderConfig.keyPriority);
    }

    @Override // X.InterfaceC58101PpQ
    public final int BoL() {
        return 2;
    }

    public static void A00(C55019OWs c55019OWs) {
        AbstractC53697Nom.A00(c55019OWs.A02());
    }
}
