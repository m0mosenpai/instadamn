package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.util.Range;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.webrtc.HardwareVideoEncoder;

/* loaded from: classes11.dex */
public final class U7T {
    public static final List A01;
    public static final Map A02;
    public static final java.util.Set A03;
    public static final java.util.Set A04;
    public W8P A00 = W8P.A00;

    public static C65831Tuo A00(MediaCodec mediaCodec, MediaFormat mediaFormat, Surface surface, U7W u7w) {
        String str;
        if (mediaCodec.getName().equals("OMX.Exynos.avc.dec") && Build.VERSION.SDK_INT >= 31) {
            mediaFormat.removeKey("color-range");
        }
        if (u7w.A1T()) {
            mediaFormat.setInteger("priority", 1);
        }
        try {
            mediaCodec.getName();
            C0fT.A07(mediaCodec, null, mediaFormat, surface, 0, -1826708405);
            try {
                str = String.format(Locale.US, "media codec:%s, format:%s", A03(mediaCodec, mediaFormat), mediaFormat);
            } catch (Throwable unused) {
                str = "";
            }
            boolean A1W = AbstractC167007dF.A1W(surface);
            boolean A06 = u7w.A06();
            boolean A1R = u7w.A1R();
            return new C65831Tuo(mediaCodec, null, C05F.A00, str, u7w.A0j(), A1W, A06, A1R);
        } catch (IllegalStateException e) {
            throw new IllegalStateException(AnonymousClass001.A0R("codec name:", mediaCodec.getName()), e);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        hashSet.add("OMX.ittiam.video.encoder.avc");
        hashSet.add("OMX.Exynos.avc.enc");
        HashMap hashMap = new HashMap();
        A02 = hashMap;
        hashMap.put("OMX.qcom.video.encoder.avc", 21);
        HashSet hashSet2 = new HashSet();
        A04 = hashSet2;
        hashSet2.add("GT-S6812i");
        hashSet2.add("GT-I8552");
        hashSet2.add("GT-I8552B");
        hashSet2.add("GT-I8262B");
        ArrayList arrayList = new ArrayList();
        A01 = arrayList;
        arrayList.add("OMX.SEC.AVC.Encoder");
        arrayList.add("OMX.SEC.avc.enc");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:15|16|(1:20)|21|(6:23|(1:25)|26|(1:28)|29|(1:31))(8:(1:50)|35|36|37|(1:39)|(1:43)|44|45)|32|(1:34)|35|36|37|(0)|(2:41|43)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c5, code lost:
    
        r14 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9 A[Catch: Exception -> 0x00e5, TryCatch #1 {Exception -> 0x00e5, blocks: (B:16:0x003e, B:18:0x0050, B:20:0x0056, B:21:0x005f, B:23:0x006d, B:25:0x0077, B:26:0x007c, B:28:0x008c, B:29:0x0092, B:31:0x0098, B:32:0x009b, B:34:0x00a1, B:35:0x00a4, B:39:0x00c9, B:41:0x00cf, B:44:0x00d7), top: B:15:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C65831Tuo A02(android.media.MediaFormat r17, X.VCV r18, X.U7W r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U7T.A02(android.media.MediaFormat, X.VCV, X.U7W, java.lang.String, java.lang.String):X.Tuo");
    }

    public static boolean A04(String str) {
        if (!str.equals("video/avc") && !str.equals("video/hevc") && !str.equals("video/av01") && !str.equals("video/3gpp") && !str.equals("video/mp4v-es") && !str.equals("video/x-vnd.on2.vp8") && !str.equals("video/mp4")) {
            return false;
        }
        return true;
    }

    public final C65831Tuo A05(MediaFormat mediaFormat, Surface surface, U7W u7w, List list, boolean z) {
        String string = mediaFormat.getString("mime");
        string.getClass();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(string)) {
                String name = codecInfoAt.getName();
                if ((list.isEmpty() || !list.contains(name)) && (!z || Build.VERSION.SDK_INT < 29 || codecInfoAt.isSoftwareOnly())) {
                    MediaCodec A00 = C0fT.A00(name, 924315838);
                    mediaFormat.setInteger("max-input-size", 0);
                    return A00(A00, mediaFormat, surface, u7w);
                }
            }
        }
        AbstractC1126356r.A07(false, null);
        throw C00O.createAndThrow();
    }

    public static C65831Tuo A01(MediaFormat mediaFormat, Surface surface, U7W u7w, String str) {
        if (!A04(str) && !u7w.A1L()) {
            throw new Exception(AnonymousClass001.A0R(AbstractC58317Pt9.A00(210), str));
        }
        try {
            return A00(C0fT.A01(str, -1041164561), mediaFormat, surface, u7w);
        } catch (IOException e) {
            throw new Exception(e);
        }
    }

    public static String A03(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z;
        int[] iArr;
        boolean z2;
        MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
        StringBuilder sb = new StringBuilder();
        AbstractC50523MSb.A1N("name=", codecInfo.getName(), sb);
        sb.append(AnonymousClass001.A1D(" is encoder=", codecInfo.isEncoder()));
        AbstractC50523MSb.A1N(" supported types=", Arrays.toString(codecInfo.getSupportedTypes()), sb);
        if (Build.VERSION.SDK_INT >= 29) {
            sb.append(AnonymousClass001.A1D(" is vendor=", codecInfo.isVendor()));
            sb.append(AnonymousClass001.A1D(" is alias=", codecInfo.isAlias()));
            sb.append(AnonymousClass001.A1D(" is software only=", codecInfo.isSoftwareOnly()));
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(mediaFormat.getString("mime"));
        try {
            i = mediaFormat.getInteger("color-format");
        } catch (Exception unused) {
            i = -1;
        }
        if (i > 0 && (iArr = capabilitiesForType.colorFormats) != null) {
            int length = iArr.length;
            int i9 = 0;
            while (true) {
                if (i9 < length) {
                    if (iArr[i9] == i) {
                        z2 = true;
                        break;
                    }
                    i9++;
                } else {
                    z2 = false;
                    break;
                }
            }
            sb.append(AnonymousClass001.A1D(" color format supported=", z2));
        }
        try {
            i2 = mediaFormat.getInteger("profile");
        } catch (Exception unused2) {
            i2 = -1;
        }
        try {
            i3 = mediaFormat.getInteger("level");
        } catch (Exception unused3) {
            i3 = -1;
        }
        sb.append(AnonymousClass001.A02(i2, i3, " Checking for profile=", " level="));
        if (i2 > 0 && i3 > 0 && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
            int length2 = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length2) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i10];
                    int i11 = codecProfileLevel.profile;
                    sb.append(AnonymousClass001.A02(i11, codecProfileLevel.level, " codecProfileLevel.profile=", " codecProfileLevel.level="));
                    if (i11 == i2 && codecProfileLevel.level == i3) {
                        z = true;
                        break;
                    }
                    i10++;
                } else {
                    z = false;
                    break;
                }
            }
            sb.append(AnonymousClass001.A1D(" profile level supported=", z));
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
        try {
            i4 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
        } catch (Exception unused4) {
            i4 = -1;
        }
        try {
            i5 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
        } catch (Exception unused5) {
            i5 = -1;
        }
        boolean isSizeSupported = videoCapabilities.isSizeSupported(i4, i5);
        sb.append(AnonymousClass001.A1D(" size supported=", isSizeSupported));
        if (isSizeSupported) {
            try {
                i8 = mediaFormat.getInteger("frame-rate");
            } catch (Exception unused6) {
                i8 = -1;
            }
            double d = i8;
            if (d > 0.0d) {
                sb.append(AnonymousClass001.A1D(" frame-rate supported=", videoCapabilities.getSupportedFrameRatesFor(i4, i5).contains((Range<Double>) Double.valueOf(d))));
            }
            sb.append(String.format(Locale.US, " supported frame-rates for %d x %d = [%.2f, %.2f]", Integer.valueOf(i4), Integer.valueOf(i5), videoCapabilities.getSupportedFrameRatesFor(i4, i5).getLower(), videoCapabilities.getSupportedFrameRatesFor(i4, i5).getUpper()));
        }
        sb.append(AnonymousClass001.A0O(" width alignment=", videoCapabilities.getWidthAlignment()));
        sb.append(AnonymousClass001.A0O(" height alignment=", videoCapabilities.getHeightAlignment()));
        try {
            i6 = mediaFormat.getInteger(TraceFieldType.Bitrate);
        } catch (Exception unused7) {
            i6 = -1;
        }
        if (i6 > 0) {
            sb.append(AnonymousClass001.A1D(" bitrate supported=", videoCapabilities.getBitrateRange().contains((Range<Integer>) Integer.valueOf(i6))));
        }
        try {
            i7 = mediaFormat.getInteger(HardwareVideoEncoder.KEY_BITRATE_MODE);
        } catch (Exception unused8) {
            i7 = -1;
        }
        if (i7 > 0) {
            encoderCapabilities.getClass();
            sb.append(AnonymousClass001.A1D(" bitrate mode supported=", encoderCapabilities.isBitrateModeSupported(i7)));
        }
        return AbstractC166997dE.A0x(String.format(Locale.US, " supported widths=[%d, %d] supported heights=[%d, %d] supported bitrate=[%d, %d]", videoCapabilities.getSupportedWidths().getLower(), videoCapabilities.getSupportedWidths().getUpper(), videoCapabilities.getSupportedHeights().getLower(), videoCapabilities.getSupportedHeights().getUpper(), videoCapabilities.getBitrateRange().getLower(), videoCapabilities.getBitrateRange().getUpper()), sb);
    }
}
