package X;

import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* renamed from: X.7pa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C174407pa {
    public VersionedCapability A00;
    public final int A01;
    public final ARAssetType A02;
    public final ARRequestAsset.CompressionMethod A03;
    public final EffectAssetType A04;
    public final EnumC1825988f A05;
    public final Boolean A06;
    public final Boolean A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final EnumC202068wl A0E;

    public static void A01(String str, ByteBuffer byteBuffer) {
        if (str == null) {
            byteBuffer.putInt(-1);
        } else {
            byteBuffer.putInt(str.getBytes().length);
            byteBuffer.put(str.getBytes());
        }
    }

    public final String A02() {
        ARAssetType aRAssetType = this.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw new IllegalStateException(AnonymousClass001.A0R("Unsupported asset type: ", aRAssetType.toString()));
                }
                EnumC202068wl enumC202068wl = this.A0E;
                enumC202068wl.getClass();
                return enumC202068wl.toString();
            }
            VersionedCapability versionedCapability = this.A00;
            versionedCapability.getClass();
            return versionedCapability.toServerValue();
        }
        EffectAssetType effectAssetType = this.A04;
        if (effectAssetType == null) {
            return null;
        }
        return effectAssetType.name();
    }

    public C174407pa(ByteBuffer byteBuffer) {
        String str;
        EffectAssetType valueOf;
        VersionedCapability versionedCapability;
        EnumC202068wl enumC202068wl;
        EnumC1825988f valueOf2;
        Integer num;
        int remaining = byteBuffer.remaining();
        String str2 = null;
        try {
            long j = byteBuffer.getLong();
            if (j == 7310021016723351138L) {
                String A00 = A00(byteBuffer);
                A00.getClass();
                try {
                    this.A09 = A00;
                    String A002 = A00(byteBuffer);
                    try {
                        this.A0A = A002;
                        this.A0B = A00(byteBuffer);
                        str = A00(byteBuffer);
                        str.getClass();
                        try {
                            ARAssetType valueOf3 = ARAssetType.valueOf(str);
                            this.A02 = valueOf3;
                            String A003 = A00(byteBuffer);
                            int ordinal = valueOf3.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2 && ordinal != 3) {
                                        throw new IllegalStateException(AnonymousClass001.A0R("Illegal asset type: ", valueOf3.toString()));
                                    }
                                    if (A003 == null) {
                                        enumC202068wl = null;
                                    } else {
                                        enumC202068wl = EnumC202068wl.valueOf(A003);
                                    }
                                    versionedCapability = null;
                                    valueOf = null;
                                } else {
                                    try {
                                        String str3 = "AML_FACE_TRACKER";
                                        if (A003.equals("AML_FACE_TRACKER")) {
                                            num = C05F.A00;
                                        } else if (A003.equals("TARGET_RECOGNITION")) {
                                            num = C05F.A01;
                                        } else if (A003.equals("SEGMENTATION")) {
                                            num = C05F.A0C;
                                        } else if (A003.equals("HAIR_SEGMENTATION")) {
                                            num = C05F.A0N;
                                        } else if (A003.equals("HAND_TRACKING")) {
                                            num = C05F.A0Y;
                                        } else if (A003.equals("XRAY")) {
                                            num = C05F.A0j;
                                        } else if (A003.equals("M_SUGGESTIONS_CORE")) {
                                            num = C05F.A0u;
                                        } else if (A003.equals("FITTED_EXPRESSION_TRACKER")) {
                                            num = C05F.A15;
                                        } else if (A003.equals("GAZE_CORRECTION")) {
                                            num = C05F.A1F;
                                        } else if (A003.equals("BI_BYTEDOC")) {
                                            num = C05F.A1I;
                                        } else {
                                            throw new IllegalArgumentException(A003);
                                        }
                                        int intValue = num.intValue();
                                        switch (intValue) {
                                            case 0:
                                                versionedCapability = VersionedCapability.Facetracker;
                                                break;
                                            case 1:
                                            default:
                                                switch (intValue) {
                                                    case 0:
                                                        break;
                                                    case 1:
                                                        str3 = "TARGET_RECOGNITION";
                                                        break;
                                                    case 2:
                                                        str3 = "SEGMENTATION";
                                                        break;
                                                    case 3:
                                                        str3 = "HAIR_SEGMENTATION";
                                                        break;
                                                    case 4:
                                                        str3 = "HAND_TRACKING";
                                                        break;
                                                    case 5:
                                                        str3 = "XRAY";
                                                        break;
                                                    case 6:
                                                        str3 = "M_SUGGESTIONS_CORE";
                                                        break;
                                                    case 7:
                                                        str3 = "FITTED_EXPRESSION_TRACKER";
                                                        break;
                                                    case 8:
                                                        str3 = "GAZE_CORRECTION";
                                                        break;
                                                    default:
                                                        str3 = "BI_BYTEDOC";
                                                        break;
                                                }
                                                throw new IllegalArgumentException(AnonymousClass001.A0R("VersionedCapability is not set up for the given SupportAssetType:", str3));
                                            case 2:
                                                versionedCapability = VersionedCapability.Segmentation;
                                                break;
                                            case 3:
                                                versionedCapability = VersionedCapability.HairSegmentation;
                                                break;
                                            case 4:
                                                versionedCapability = VersionedCapability.HandTracker;
                                                break;
                                            case 5:
                                                versionedCapability = VersionedCapability.XRay;
                                                break;
                                            case 6:
                                                versionedCapability = VersionedCapability.MSuggestionsCore;
                                                break;
                                            case 7:
                                                versionedCapability = VersionedCapability.FaceExpressionFitting;
                                                break;
                                            case 8:
                                                versionedCapability = VersionedCapability.GazeCorrection;
                                                break;
                                            case 9:
                                                versionedCapability = VersionedCapability.BiBytedoc;
                                                break;
                                        }
                                    } catch (IllegalArgumentException unused) {
                                        versionedCapability = VersionedCapability.fromServerValue(A003);
                                    }
                                    enumC202068wl = null;
                                    valueOf = null;
                                }
                            } else {
                                if (A003 == null) {
                                    valueOf = EffectAssetType.NORMAL_EFFECT;
                                } else {
                                    valueOf = EffectAssetType.valueOf(A003);
                                }
                                versionedCapability = null;
                                enumC202068wl = null;
                            }
                            this.A04 = valueOf;
                            this.A00 = versionedCapability;
                            this.A0E = enumC202068wl;
                            A002 = A00(byteBuffer);
                            this.A0C = A002;
                            String A004 = A00(byteBuffer);
                            A004.getClass();
                            this.A03 = ARRequestAsset.CompressionMethod.valueOf(A004);
                            this.A01 = byteBuffer.getInt();
                            if (byteBuffer.hasRemaining()) {
                                this.A08 = A00(byteBuffer);
                            } else {
                                this.A08 = null;
                            }
                            if (byteBuffer.hasRemaining()) {
                                this.A07 = Boolean.valueOf(Boolean.parseBoolean(A00(byteBuffer)));
                            } else {
                                this.A07 = false;
                            }
                            if (byteBuffer.hasRemaining()) {
                                String A005 = A00(byteBuffer);
                                if (A005 == null) {
                                    valueOf2 = null;
                                } else {
                                    valueOf2 = EnumC1825988f.valueOf(A005);
                                }
                                this.A05 = valueOf2;
                            } else {
                                this.A05 = null;
                            }
                            if (byteBuffer.hasRemaining()) {
                                this.A06 = Boolean.valueOf(Boolean.parseBoolean(A00(byteBuffer)));
                            } else {
                                this.A06 = false;
                            }
                            if (byteBuffer.hasRemaining()) {
                                this.A0D = A00(byteBuffer);
                            } else {
                                this.A0D = null;
                            }
                        } catch (IllegalArgumentException | IllegalStateException | BufferUnderflowException e) {
                            e = e;
                            str2 = A00;
                            StringBuilder sb = new StringBuilder();
                            sb.append(e.getMessage());
                            sb.append(" -- ByteBuffer size:");
                            sb.append(remaining);
                            sb.append(", effect id:");
                            sb.append(str2);
                            sb.append(", error string:");
                            sb.append(str);
                            throw new IOException(sb.toString());
                        }
                    } catch (IllegalArgumentException | IllegalStateException | BufferUnderflowException e2) {
                        e = e2;
                        str2 = A00;
                        str = A002;
                    }
                } catch (IllegalArgumentException | IllegalStateException | BufferUnderflowException e3) {
                    e = e3;
                    str2 = A00;
                    str = str2;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e.getMessage());
                    sb2.append(" -- ByteBuffer size:");
                    sb2.append(remaining);
                    sb2.append(", effect id:");
                    sb2.append(str2);
                    sb2.append(", error string:");
                    sb2.append(str);
                    throw new IOException(sb2.toString());
                }
            } else {
                throw new IOException(AnonymousClass001.A0Q("Invalid data: ", j));
            }
        } catch (IllegalArgumentException | IllegalStateException | BufferUnderflowException e4) {
            e = e4;
        }
    }

    public static String A00(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i == -1) {
            return null;
        }
        if (i >= 0) {
            if (i != 0) {
                if (i <= 4096) {
                    byte[] bArr = new byte[i];
                    byteBuffer.get(bArr);
                    return new String(bArr);
                }
                throw new IllegalStateException(AnonymousClass001.A0c("trying to allocate ", " bytes which exceeds the buffer limit.", i));
            }
            throw new IllegalStateException("the number of bytes shouldn't be 0");
        }
        throw new IllegalStateException("read the wrong cache");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C174407pa(com.facebook.cameracore.ardelivery.model.ARAssetType r3, com.facebook.cameracore.ardelivery.model.ARRequestAsset.CompressionMethod r4, com.facebook.cameracore.ardelivery.model.EffectAssetType r5, X.EnumC202068wl r6, X.EnumC1825988f r7, com.facebook.cameracore.ardelivery.model.VersionedCapability r8, java.lang.Boolean r9, java.lang.Boolean r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16) {
        /*
            r2 = this;
            r1 = 0
            r2.<init>()
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L22;
                case 1: goto L2d;
                case 2: goto L26;
                case 3: goto L26;
                case 4: goto L37;
                case 5: goto L29;
                default: goto Lb;
            }
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Got unsupported type: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L22:
            r12.getClass()
            goto L37
        L26:
            r6.getClass()
        L29:
            r14.getClass()
            goto L37
        L2d:
            r0 = 0
            if (r12 != 0) goto L31
            r0 = 1
        L31:
            X.C0J8.A06(r0)
            r8.getClass()
        L37:
            r2.A09 = r11
            r2.A0A = r12
            r2.A0B = r13
            r2.A02 = r3
            r2.A00 = r8
            com.facebook.cameracore.ardelivery.model.ARAssetType r0 = com.facebook.cameracore.ardelivery.model.ARAssetType.EFFECT
            if (r3 != r0) goto L60
            if (r5 != 0) goto L49
            com.facebook.cameracore.ardelivery.model.EffectAssetType r5 = com.facebook.cameracore.ardelivery.model.EffectAssetType.NORMAL_EFFECT
        L49:
            r2.A04 = r5
            r2.A0C = r1
            r2.A03 = r4
            r0 = r16
            r2.A01 = r0
            r2.A08 = r14
            r2.A07 = r9
            r2.A05 = r7
            r2.A0E = r6
            r2.A06 = r10
            r2.A0D = r15
            return
        L60:
            r5 = 0
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174407pa.<init>(com.facebook.cameracore.ardelivery.model.ARAssetType, com.facebook.cameracore.ardelivery.model.ARRequestAsset$CompressionMethod, com.facebook.cameracore.ardelivery.model.EffectAssetType, X.8wl, X.88f, com.facebook.cameracore.ardelivery.model.VersionedCapability, java.lang.Boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
