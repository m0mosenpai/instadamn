package X;

import android.hardware.Camera;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.9Md, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208959Md {
    public static final AtomicInteger A05 = new AtomicInteger(Integer.MIN_VALUE);
    public final Camera.Parameters A00;
    public final Camera A01;
    public final C9MI A02;
    public final int A03;
    public final C9MK A04;

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0030. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:22:0x0033. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0036. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x003a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A01(C176807tc c176807tc, Object obj) {
        C176807tc c176807tc2;
        Number number;
        C9MI c9mi;
        C9MI c9mi2;
        C176807tc c176807tc3;
        String str;
        String str2;
        C176807tc c176807tc4;
        String str3;
        Number number2;
        C9MI c9mi3;
        String str4;
        int i = c176807tc.A00;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 27) {
                            if (i != 42) {
                                if (i != 45) {
                                    if (i != 52) {
                                        if (i != 57) {
                                            if (i != 59) {
                                                switch (i) {
                                                    case 8:
                                                        obj.getClass();
                                                        Boolean bool = (Boolean) obj;
                                                        boolean booleanValue = bool.booleanValue();
                                                        if (!AbstractC176937tp.A02(AbstractC176907tm.A06)) {
                                                            this.A00.setRecordingHint(booleanValue);
                                                            C9MI c9mi4 = this.A02;
                                                            c176807tc2 = AbstractC176797tb.A0r;
                                                            c9mi = c9mi4;
                                                            number = bool;
                                                            break;
                                                        }
                                                        break;
                                                    case 9:
                                                        obj.getClass();
                                                        Number number3 = (Number) obj;
                                                        switch (number3.intValue()) {
                                                            case 0:
                                                                str = "fixed";
                                                                break;
                                                            case 1:
                                                                str = "auto";
                                                                break;
                                                            case 2:
                                                                str = "macro";
                                                                break;
                                                            case 3:
                                                                str = "continuous-video";
                                                                break;
                                                            case 4:
                                                                str = "continuous-picture";
                                                                break;
                                                            case 5:
                                                                str = "edof";
                                                                break;
                                                            case 6:
                                                                str = "infinity";
                                                                break;
                                                            default:
                                                                return false;
                                                        }
                                                        if (A00(AbstractC176767tY.A0w, this.A04, number3)) {
                                                            this.A00.setFocusMode(str);
                                                            this.A02.A04(AbstractC176797tb.A0D, number3);
                                                            return true;
                                                        }
                                                        break;
                                                    case 10:
                                                        obj.getClass();
                                                        Number number4 = (Number) obj;
                                                        String A01 = AbstractC208929Ma.A01(number4.intValue());
                                                        if (A01 != null) {
                                                            if (A00(AbstractC176767tY.A0v, this.A04, number4)) {
                                                                this.A00.setFlashMode(A01);
                                                                this.A02.A04(AbstractC176797tb.A0B, number4);
                                                                return true;
                                                            }
                                                        }
                                                        break;
                                                    case 11:
                                                        obj.getClass();
                                                        Number number5 = (Number) obj;
                                                        int intValue = number5.intValue();
                                                        if (intValue != 0) {
                                                            if (intValue != 1) {
                                                                if (intValue != 2) {
                                                                    if (intValue == 3) {
                                                                        str2 = "auto";
                                                                    }
                                                                } else {
                                                                    str2 = "60hz";
                                                                }
                                                            } else {
                                                                str2 = "50hz";
                                                            }
                                                        } else {
                                                            str2 = "off";
                                                        }
                                                        if (A00(AbstractC176767tY.A0q, this.A04, number5)) {
                                                            this.A00.setAntibanding(str2);
                                                            C9MI c9mi5 = this.A02;
                                                            c176807tc4 = AbstractC176797tb.A00;
                                                            c9mi3 = c9mi5;
                                                            number2 = number5;
                                                            c9mi3.A04(c176807tc4, number2);
                                                            break;
                                                        }
                                                        break;
                                                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                                        obj.getClass();
                                                        Number number6 = (Number) obj;
                                                        switch (number6.intValue()) {
                                                            case 0:
                                                                str3 = NetInfoModule.CONNECTION_TYPE_NONE;
                                                                break;
                                                            case 1:
                                                                str3 = "mono";
                                                                break;
                                                            case 2:
                                                                str3 = "negative";
                                                                break;
                                                            case 3:
                                                                str3 = "solarize";
                                                                break;
                                                            case 4:
                                                                str3 = "sepia";
                                                                break;
                                                            case 5:
                                                                str3 = "posterize";
                                                                break;
                                                            case 6:
                                                                str3 = "whiteboard";
                                                                break;
                                                            case 7:
                                                                str3 = "blackboard";
                                                                break;
                                                            case 8:
                                                                str3 = "aqua";
                                                                break;
                                                            default:
                                                                return false;
                                                        }
                                                        if (A00(AbstractC176767tY.A0s, this.A04, number6)) {
                                                            this.A00.setColorEffect(str3);
                                                            this.A02.A04(AbstractC176797tb.A07, number6);
                                                            return true;
                                                        }
                                                        break;
                                                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                                        obj.getClass();
                                                        Number number7 = (Number) obj;
                                                        int intValue2 = number7.intValue();
                                                        if (AbstractC167007dF.A1S(AbstractC176767tY.A0G, this.A04)) {
                                                            this.A00.setExposureCompensation(intValue2);
                                                            this.A02.A04(AbstractC176797tb.A09, number7);
                                                            return true;
                                                        }
                                                        break;
                                                    case 14:
                                                        obj.getClass();
                                                        Number number8 = (Number) obj;
                                                        int intValue3 = number8.intValue();
                                                        if (intValue3 > 0 && intValue3 <= 100) {
                                                            this.A00.setJpegQuality(intValue3);
                                                            this.A02.A04(AbstractC176797tb.A0a, number8);
                                                            return true;
                                                        }
                                                        break;
                                                    case Process.SIGTERM /* 15 */:
                                                        obj.getClass();
                                                        Number number9 = (Number) obj;
                                                        int intValue4 = number9.intValue();
                                                        if (intValue4 > 0 && intValue4 <= 100) {
                                                            this.A00.setJpegThumbnailQuality(intValue4);
                                                            this.A02.A04(AbstractC176797tb.A0b, number9);
                                                            return true;
                                                        }
                                                        break;
                                                    default:
                                                        switch (i) {
                                                            case 17:
                                                                obj.getClass();
                                                                Number number10 = (Number) obj;
                                                                int intValue5 = number10.intValue();
                                                                if (A00(AbstractC176767tY.A0z, this.A04, number10)) {
                                                                    this.A00.setPictureFormat(intValue5);
                                                                    this.A02.A04(AbstractC176797tb.A0i, number10);
                                                                    return true;
                                                                }
                                                                break;
                                                            case 18:
                                                                obj.getClass();
                                                                Number number11 = (Number) obj;
                                                                int intValue6 = number11.intValue();
                                                                if (A00(AbstractC176767tY.A11, this.A04, number11)) {
                                                                    this.A00.setPreviewFormat(intValue6);
                                                                    this.A02.A04(AbstractC176797tb.A0m, number11);
                                                                    return true;
                                                                }
                                                                break;
                                                            case Process.SIGSTOP /* 19 */:
                                                                obj.getClass();
                                                                Number number12 = (Number) obj;
                                                                int intValue7 = number12.intValue();
                                                                if (A00(AbstractC176767tY.A13, this.A04, number12)) {
                                                                    this.A00.setPreviewFrameRate(intValue7);
                                                                    this.A02.A04(AbstractC176797tb.A0o, number12);
                                                                    return true;
                                                                }
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 21:
                                                                        obj.getClass();
                                                                        Number number13 = (Number) obj;
                                                                        int intValue8 = number13.intValue();
                                                                        Camera.Parameters parameters = this.A00;
                                                                        parameters.setRotation(intValue8);
                                                                        C9MI c9mi6 = this.A02;
                                                                        c9mi6.A04(AbstractC176797tb.A0g, number13);
                                                                        if (AbstractC167017dG.A1Y(AbstractC176797tb.A0V, c9mi6)) {
                                                                            if (AbstractC167007dF.A1S(AbstractC176767tY.A0I, this.A04)) {
                                                                                if (intValue8 != 90 && intValue8 != 270) {
                                                                                    parameters.set("snapshot-picture-flip", "flip-h");
                                                                                    return true;
                                                                                }
                                                                                parameters.set("snapshot-picture-flip", "flip-v");
                                                                                return true;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 22:
                                                                        obj.getClass();
                                                                        Number number14 = (Number) obj;
                                                                        int intValue9 = number14.intValue();
                                                                        C209579Os c209579Os = this.A04.A00;
                                                                        if (c209579Os != null) {
                                                                            this.A00.set(c209579Os.A03, (String) c209579Os.A01.get(intValue9));
                                                                            this.A02.A04(AbstractC176797tb.A0L, number14);
                                                                            return true;
                                                                        }
                                                                        break;
                                                                    case 23:
                                                                        obj.getClass();
                                                                        Number number15 = (Number) obj;
                                                                        String A052 = C9MW.A05(number15.intValue());
                                                                        if (A052 != null) {
                                                                            if (A00(AbstractC176767tY.A17, this.A04, number15)) {
                                                                                this.A00.setSceneMode(A052);
                                                                                this.A02.A04(AbstractC176797tb.A0s, number15);
                                                                                return true;
                                                                            }
                                                                        }
                                                                        break;
                                                                    case 24:
                                                                        obj.getClass();
                                                                        Number number16 = (Number) obj;
                                                                        switch (number16.intValue()) {
                                                                            case 1:
                                                                                str4 = "auto";
                                                                                break;
                                                                            case 2:
                                                                                str4 = "incandescent";
                                                                                break;
                                                                            case 3:
                                                                                str4 = "fluorescent";
                                                                                break;
                                                                            case 4:
                                                                                str4 = "warm-fluorescent";
                                                                                break;
                                                                            case 5:
                                                                                str4 = "daylight";
                                                                                break;
                                                                            case 6:
                                                                                str4 = "cloudy-daylight";
                                                                                break;
                                                                            case 7:
                                                                                str4 = "twilight";
                                                                                break;
                                                                            case 8:
                                                                                str4 = "shade";
                                                                                break;
                                                                        }
                                                                        if (A00(AbstractC176767tY.A1B, this.A04, number16)) {
                                                                            this.A00.setWhiteBalance(str4);
                                                                            this.A02.A04(AbstractC176797tb.A0z, number16);
                                                                            return true;
                                                                        }
                                                                        break;
                                                                    case 25:
                                                                        obj.getClass();
                                                                        Number number17 = (Number) obj;
                                                                        int intValue10 = number17.intValue();
                                                                        if (AbstractC167007dF.A1S(AbstractC176767tY.A0f, this.A04)) {
                                                                            this.A00.setZoom(intValue10);
                                                                            this.A02.A04(AbstractC176797tb.A11, number17);
                                                                            return true;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        List<Camera.Area> list = null;
                                                                        switch (i) {
                                                                            case 30:
                                                                                obj.getClass();
                                                                                Number number18 = (Number) obj;
                                                                                this.A00.setGpsAltitude(number18.doubleValue());
                                                                                C9MI c9mi7 = this.A02;
                                                                                c176807tc4 = AbstractC176797tb.A0E;
                                                                                c9mi3 = c9mi7;
                                                                                number2 = number18;
                                                                                c9mi3.A04(c176807tc4, number2);
                                                                                break;
                                                                            case 31:
                                                                                obj.getClass();
                                                                                Number number19 = (Number) obj;
                                                                                this.A00.setGpsLongitude(number19.doubleValue());
                                                                                C9MI c9mi8 = this.A02;
                                                                                c176807tc4 = AbstractC176797tb.A0G;
                                                                                c9mi3 = c9mi8;
                                                                                number2 = number19;
                                                                                c9mi3.A04(c176807tc4, number2);
                                                                                break;
                                                                            case 32:
                                                                                obj.getClass();
                                                                                Number number20 = (Number) obj;
                                                                                this.A00.setGpsLatitude(number20.doubleValue());
                                                                                C9MI c9mi9 = this.A02;
                                                                                c176807tc4 = AbstractC176797tb.A0F;
                                                                                c9mi3 = c9mi9;
                                                                                number2 = number20;
                                                                                c9mi3.A04(c176807tc4, number2);
                                                                                break;
                                                                            case 33:
                                                                                C176877tj c176877tj = (C176877tj) obj;
                                                                                if (A00(AbstractC176767tY.A14, this.A04, c176877tj)) {
                                                                                    Camera.Parameters parameters2 = this.A00;
                                                                                    c176877tj.getClass();
                                                                                    parameters2.setPreviewSize(c176877tj.A02, c176877tj.A01);
                                                                                    this.A02.A04(AbstractC176797tb.A0q, c176877tj);
                                                                                    return true;
                                                                                }
                                                                                break;
                                                                            case 34:
                                                                                C176877tj c176877tj2 = (C176877tj) obj;
                                                                                if (A00(AbstractC176767tY.A10, this.A04, c176877tj2)) {
                                                                                    Camera.Parameters parameters3 = this.A00;
                                                                                    c176877tj2.getClass();
                                                                                    parameters3.setPictureSize(c176877tj2.A02, c176877tj2.A01);
                                                                                    this.A02.A04(AbstractC176797tb.A0k, c176877tj2);
                                                                                    return true;
                                                                                }
                                                                                break;
                                                                            case 35:
                                                                                if (AbstractC167007dF.A1S(AbstractC176767tY.A0F, this.A04)) {
                                                                                    Camera.Parameters parameters4 = this.A00;
                                                                                    obj.getClass();
                                                                                    parameters4.set("video-size", obj.toString());
                                                                                }
                                                                                c9mi2 = this.A02;
                                                                                c176807tc3 = AbstractC176797tb.A0y;
                                                                                break;
                                                                            case 36:
                                                                                obj.getClass();
                                                                                C176877tj c176877tj3 = (C176877tj) obj;
                                                                                this.A00.setJpegThumbnailSize(c176877tj3.A02, c176877tj3.A01);
                                                                                C9MI c9mi10 = this.A02;
                                                                                c176807tc4 = AbstractC176797tb.A0c;
                                                                                c9mi3 = c9mi10;
                                                                                number2 = c176877tj3;
                                                                                c9mi3.A04(c176807tc4, number2);
                                                                                break;
                                                                            case 37:
                                                                                List<Camera.Area> list2 = (List) obj;
                                                                                C9MK c9mk = this.A04;
                                                                                if (AbstractC167007dF.A1S(AbstractC176767tY.A0V, c9mk)) {
                                                                                    list2.getClass();
                                                                                    if (list2.size() <= AbstractC166987dD.A0H(c9mk.A01(AbstractC176767tY.A0h))) {
                                                                                        Camera.Parameters parameters5 = this.A00;
                                                                                        if (!list2.isEmpty()) {
                                                                                            list = list2;
                                                                                        }
                                                                                        parameters5.setFocusAreas(list);
                                                                                        this.A02.A04(AbstractC176797tb.A0C, list2);
                                                                                        return true;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 38:
                                                                                List<Camera.Area> list3 = (List) obj;
                                                                                C9MK c9mk2 = this.A04;
                                                                                if (AbstractC167007dF.A1S(AbstractC176767tY.A0W, c9mk2)) {
                                                                                    list3.getClass();
                                                                                    if (list3.size() <= AbstractC166987dD.A0H(c9mk2.A01(AbstractC176767tY.A0i))) {
                                                                                        Camera.Parameters parameters6 = this.A00;
                                                                                        if (!list3.isEmpty()) {
                                                                                            list = list3;
                                                                                        }
                                                                                        parameters6.setMeteringAreas(list);
                                                                                        this.A02.A04(AbstractC176797tb.A0f, list3);
                                                                                        return true;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 39:
                                                                                int[] iArr = (int[]) obj;
                                                                                List<int[]> list4 = (List) this.A04.A01(AbstractC176767tY.A12);
                                                                                if (list4 != null && iArr != null) {
                                                                                    for (int[] iArr2 : list4) {
                                                                                        int i2 = iArr2[0];
                                                                                        int i3 = iArr[0];
                                                                                        if (i2 == i3) {
                                                                                            int i4 = iArr2[1];
                                                                                            int i5 = iArr[1];
                                                                                            if (i4 == i5) {
                                                                                                this.A00.setPreviewFpsRange(i3, i5);
                                                                                                this.A02.A04(AbstractC176797tb.A0n, iArr);
                                                                                                return true;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                throw AbstractC166987dD.A18(AnonymousClass001.A0O("Invalid Settings key: ", i));
                                                                        }
                                                                }
                                                        }
                                                }
                                            } else {
                                                C9MI c9mi11 = this.A02;
                                                if (AbstractC167017dG.A1Y(AbstractC176797tb.A0V, c9mi11)) {
                                                    if (AbstractC167007dF.A1S(AbstractC176767tY.A0I, this.A04)) {
                                                        obj.getClass();
                                                        Number number21 = (Number) obj;
                                                        int intValue11 = number21.intValue();
                                                        c9mi11.A04(AbstractC176797tb.A0x, number21);
                                                        if (intValue11 != 90 && intValue11 != 270) {
                                                            this.A00.set("video-flip", "flip-h");
                                                            return true;
                                                        }
                                                        this.A00.set("video-flip", "flip-v");
                                                        return true;
                                                    }
                                                }
                                            }
                                            return true;
                                        }
                                        obj.getClass();
                                        if (this.A03 == 1) {
                                            if (AbstractC167007dF.A1S(AbstractC176767tY.A0I, this.A04)) {
                                                c9mi2 = this.A02;
                                                c176807tc3 = AbstractC176797tb.A0V;
                                            }
                                        }
                                    } else {
                                        Object obj2 = null;
                                        if (AbstractC167007dF.A1S(AbstractC176767tY.A0F, this.A04)) {
                                            obj2.getClass();
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                } else {
                                    obj.getClass();
                                    c9mi2 = this.A02;
                                    c176807tc3 = AbstractC176797tb.A0N;
                                }
                                c9mi2.A04(c176807tc3, obj);
                                return true;
                            }
                            String str5 = (String) obj;
                            this.A00.setGpsProcessingMethod(str5);
                            C9MI c9mi12 = this.A02;
                            c176807tc2 = AbstractC176797tb.A0H;
                            c9mi = c9mi12;
                            number = str5;
                        } else {
                            obj.getClass();
                            Number number22 = (Number) obj;
                            this.A00.setGpsTimestamp(number22.longValue());
                            C9MI c9mi13 = this.A02;
                            c176807tc2 = AbstractC176797tb.A0I;
                            c9mi = c9mi13;
                            number = number22;
                        }
                        c9mi.A04(c176807tc2, number);
                        return true;
                    }
                    obj.getClass();
                    Boolean bool2 = (Boolean) obj;
                    boolean booleanValue2 = bool2.booleanValue();
                    if (AbstractC167007dF.A1S(AbstractC176767tY.A0b, this.A04) && !AbstractC176937tp.A02(AbstractC176907tm.A07)) {
                        this.A00.setVideoStabilization(booleanValue2);
                        this.A02.A04(AbstractC176797tb.A0Z, bool2);
                        return true;
                    }
                } else {
                    obj.getClass();
                    boolean A1a = AbstractC166987dD.A1a(obj);
                    if (AbstractC167007dF.A1S(AbstractC176767tY.A0K, this.A04)) {
                        int i6 = 0;
                        if (A1a) {
                            i6 = 17;
                        }
                        this.A00.setSceneMode(C9MW.A05(i6));
                        this.A02.A04(AbstractC176797tb.A0s, Integer.valueOf(i6));
                        if (A1a) {
                            A01(AbstractC176797tb.A0r, false);
                            return true;
                        }
                        return true;
                    }
                }
            } else {
                obj.getClass();
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue3 = bool3.booleanValue();
                if (AbstractC167007dF.A1S(AbstractC176767tY.A06, this.A04)) {
                    this.A00.setAutoWhiteBalanceLock(booleanValue3);
                    this.A02.A04(AbstractC176797tb.A0R, bool3);
                    return true;
                }
            }
        } else {
            obj.getClass();
            Boolean bool4 = (Boolean) obj;
            boolean booleanValue4 = bool4.booleanValue();
            if (AbstractC167007dF.A1S(AbstractC176767tY.A03, this.A04)) {
                this.A00.setAutoExposureLock(booleanValue4);
                this.A02.A04(AbstractC176797tb.A0P, bool4);
                return true;
            }
        }
        return false;
    }

    public C208959Md(Camera.Parameters parameters, Camera camera, C9MK c9mk, C9MI c9mi, int i) {
        this.A01 = camera;
        this.A00 = parameters;
        this.A04 = c9mk;
        this.A02 = c9mi;
        this.A03 = i;
    }

    public static boolean A00(C176777tZ c176777tZ, AbstractC176767tY abstractC176767tY, Object obj) {
        List list = (List) abstractC176767tY.A01(c176777tZ);
        if (list != null && obj != null && list.contains(obj)) {
            return true;
        }
        return false;
    }
}
