package X;

import android.graphics.Rect;
import android.hardware.Camera;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9MI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9MI extends AbstractC176797tb implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C176877tj A02;
    public C176877tj A03;
    public C176877tj A04;
    public C176877tj A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Double A0C;
    public Double A0D;
    public Double A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Long A0V;
    public String A0W;
    public List A0X;
    public List A0Y;
    public final C9MK A0Z;
    public final Float A0a;
    public final Float A0b;
    public final String A0c;
    public final int[] A0d = new int[2];
    public Boolean A0B = false;

    public static void A01(C176877tj c176877tj, StringBuilder sb) {
        if (c176877tj != null) {
            sb.append(c176877tj.A02);
            sb.append('x');
            sb.append(c176877tj.A01);
            return;
        }
        sb.append("null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:923)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processFallThroughCases(RegionMaker.java:841)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:800)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0010. Please report as an issue. */
    @Override // X.AbstractC176797tb
    public final java.lang.Object A02(X.C176807tc r8) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9MI.A02(X.7tc):java.lang.Object");
    }

    public final String A03() {
        String str;
        StringBuilder sb = new StringBuilder(1000);
        sb.append("mFocusMode");
        sb.append('=');
        sb.append(this.A0J);
        sb.append(",mAntibanding");
        sb.append('=');
        sb.append(this.A0F);
        sb.append(",mColorEffect");
        sb.append('=');
        sb.append(this.A0G);
        sb.append(",mIsAutoExposureLock");
        sb.append('=');
        sb.append(this.A07);
        sb.append(",mIsAutoWhiteBalanceLock");
        sb.append('=');
        sb.append(this.A08);
        sb.append(",mFlashMode");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mExposureCompensation");
        sb.append('=');
        sb.append(this.A0H);
        sb.append(",mFocusAreas");
        sb.append('=');
        sb.append(AbstractC176797tb.A00(this.A0X));
        sb.append(",mHorizontalViewAngle");
        sb.append('=');
        sb.append(this.A0a);
        sb.append(",mVerticalViewAngle");
        sb.append('=');
        sb.append(this.A0b);
        sb.append(",mJpegQuality");
        sb.append('=');
        sb.append(this.A0L);
        sb.append(",mJpegThumbnailQuality");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mJpegThumbnailSize");
        sb.append('=');
        String str2 = "null";
        A01(this.A02, sb);
        sb.append(",mMeteringAreas");
        sb.append('=');
        sb.append(AbstractC176797tb.A00(this.A0Y));
        sb.append(",mPictureFormat");
        sb.append('=');
        sb.append(this.A0O);
        sb.append(",mPictureSize");
        sb.append('=');
        A01(this.A03, sb);
        sb.append(",mYuvPictureSize");
        sb.append('=');
        sb.append("null");
        sb.append(",mPreviewFormat");
        sb.append('=');
        sb.append(this.A0P);
        sb.append(",mPreviewFpsRange");
        sb.append('=');
        int[] iArr = this.A0d;
        sb.append(iArr[0]);
        sb.append('-');
        sb.append(iArr[1]);
        sb.append(",mPreviewSize");
        sb.append('=');
        A01(this.A04, sb);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSceneMode");
        sb.append('=');
        sb.append(this.A0R);
        sb.append(",mIsVideoStabilizationEnabled");
        sb.append('=');
        sb.append(this.A0A);
        sb.append(",mIsPreviewStabilizationEnabled");
        sb.append('=');
        sb.append(false);
        sb.append(",mVideoSize");
        sb.append('=');
        A01(this.A05, sb);
        sb.append(",mWhiteBalance");
        sb.append('=');
        sb.append(this.A0T);
        sb.append(",mZoom");
        sb.append('=');
        sb.append(this.A0U);
        sb.append(",mPreviewRect");
        sb.append("=(");
        Rect rect = this.A01;
        if (rect == null) {
            str = "null";
        } else {
            str = rect.flattenToString();
        }
        sb.append(str);
        sb.append(')');
        sb.append(",mPictureRect");
        sb.append("=(");
        Rect rect2 = this.A00;
        if (rect2 != null) {
            str2 = rect2.flattenToString();
        }
        sb.append(str2);
        sb.append(')');
        sb.append(",mRecordingHint");
        sb.append('=');
        sb.append(this.A0B);
        sb.append(",mGpsAltitude");
        sb.append('=');
        sb.append(this.A0C);
        sb.append(",mGpsLongitude");
        sb.append('=');
        sb.append(this.A0E);
        sb.append(",mGpsLatitude");
        sb.append('=');
        sb.append(this.A0D);
        sb.append(",mGpsProcessingMethod");
        sb.append('=');
        sb.append(this.A0W);
        sb.append(",mGpsTimestamp");
        sb.append('=');
        sb.append(this.A0V);
        sb.append(",mPhotoRotation");
        sb.append('=');
        sb.append(this.A0N);
        sb.append(",mVideoRotation");
        sb.append('=');
        sb.append(this.A0S);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mSourceConfig");
        sb.append('=');
        return AbstractC166997dE.A0x(this.A0c, sb);
    }

    public final void A04(C176807tc c176807tc, Object obj) {
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
                                                        this.A0B = (Boolean) obj;
                                                        return;
                                                    case 9:
                                                        this.A0J = (Integer) obj;
                                                        return;
                                                    case 10:
                                                        this.A0I = (Integer) obj;
                                                        return;
                                                    case 11:
                                                        this.A0F = (Integer) obj;
                                                        return;
                                                    case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                                        this.A0G = (Integer) obj;
                                                        return;
                                                    case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                                        this.A0H = (Integer) obj;
                                                        return;
                                                    case 14:
                                                        this.A0L = (Integer) obj;
                                                        return;
                                                    case Process.SIGTERM /* 15 */:
                                                        this.A0M = (Integer) obj;
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 17:
                                                                this.A0O = (Integer) obj;
                                                                return;
                                                            case 18:
                                                                this.A0P = (Integer) obj;
                                                                return;
                                                            case Process.SIGSTOP /* 19 */:
                                                                this.A0Q = (Integer) obj;
                                                                return;
                                                            default:
                                                                switch (i) {
                                                                    case 21:
                                                                        this.A0N = (Integer) obj;
                                                                        return;
                                                                    case 22:
                                                                        this.A0K = (Integer) obj;
                                                                        return;
                                                                    case 23:
                                                                        this.A0R = (Integer) obj;
                                                                        return;
                                                                    case 24:
                                                                        this.A0T = (Integer) obj;
                                                                        return;
                                                                    case 25:
                                                                        this.A0U = (Integer) obj;
                                                                        return;
                                                                    default:
                                                                        Rect rect = null;
                                                                        switch (i) {
                                                                            case 30:
                                                                                this.A0C = (Double) obj;
                                                                                return;
                                                                            case 31:
                                                                                this.A0E = (Double) obj;
                                                                                return;
                                                                            case 32:
                                                                                this.A0D = (Double) obj;
                                                                                return;
                                                                            case 33:
                                                                                C176877tj c176877tj = (C176877tj) obj;
                                                                                this.A04 = c176877tj;
                                                                                if (c176877tj != null) {
                                                                                    rect = new Rect(0, 0, c176877tj.A02, c176877tj.A01);
                                                                                }
                                                                                this.A01 = rect;
                                                                                return;
                                                                            case 34:
                                                                                C176877tj c176877tj2 = (C176877tj) obj;
                                                                                this.A03 = c176877tj2;
                                                                                if (c176877tj2 != null) {
                                                                                    rect = new Rect(0, 0, c176877tj2.A02, c176877tj2.A01);
                                                                                }
                                                                                this.A00 = rect;
                                                                                return;
                                                                            case 35:
                                                                                this.A05 = (C176877tj) obj;
                                                                                return;
                                                                            case 36:
                                                                                this.A02 = (C176877tj) obj;
                                                                                return;
                                                                            case 37:
                                                                                this.A0X = C9MX.A00((List) obj);
                                                                                return;
                                                                            case 38:
                                                                                this.A0Y = C9MX.A00((List) obj);
                                                                                return;
                                                                            case 39:
                                                                                int[] iArr = (int[]) obj;
                                                                                if (iArr != null && iArr.length == 2) {
                                                                                    int[] iArr2 = this.A0d;
                                                                                    iArr2[0] = iArr[0];
                                                                                    iArr2[1] = iArr[1];
                                                                                    return;
                                                                                }
                                                                                return;
                                                                            default:
                                                                                throw AbstractC166987dD.A18(AnonymousClass001.A0O("Cannot directly set: ", i));
                                                                        }
                                                                }
                                                        }
                                                }
                                            }
                                            this.A0S = (Integer) obj;
                                            return;
                                        }
                                        this.A09 = (Boolean) obj;
                                        return;
                                    }
                                    return;
                                }
                                this.A06 = (Boolean) obj;
                                return;
                            }
                            this.A0W = (String) obj;
                            return;
                        }
                        this.A0V = (Long) obj;
                        return;
                    }
                    this.A0A = (Boolean) obj;
                    return;
                }
                if (AbstractC167007dF.A1S(AbstractC176767tY.A0K, this.A0Z)) {
                    obj.getClass();
                    boolean A1a = AbstractC166987dD.A1a(obj);
                    int i2 = 0;
                    if (A1a) {
                        i2 = 17;
                    }
                    A04(AbstractC176797tb.A0s, Integer.valueOf(i2));
                    if (A1a) {
                        A04(AbstractC176797tb.A0r, false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.A08 = (Boolean) obj;
            return;
        }
        this.A07 = (Boolean) obj;
    }

    public C9MI(Camera.Parameters parameters, C9MK c9mk) {
        List emptyList;
        int i;
        List emptyList2;
        Camera.Size size;
        C176877tj c176877tj;
        Camera.Size size2;
        this.A07 = false;
        this.A08 = false;
        this.A0H = 0;
        this.A0Q = 0;
        Double valueOf = Double.valueOf(0.0d);
        this.A0C = valueOf;
        this.A0E = valueOf;
        this.A0D = valueOf;
        this.A0V = AbstractC167007dF.A0d();
        this.A0N = 0;
        this.A0K = 0;
        this.A09 = false;
        this.A0S = 0;
        this.A06 = true;
        this.A0c = parameters.flatten();
        this.A0Z = c9mk;
        this.A0J = Integer.valueOf(C9MW.A02(parameters.getFocusMode()));
        this.A0F = Integer.valueOf(C9MW.A00(parameters.getAntibanding()));
        this.A0G = Integer.valueOf(C9MW.A01(parameters.getColorEffect()));
        if (AbstractC167007dF.A1S(AbstractC176767tY.A03, c9mk)) {
            this.A07 = Boolean.valueOf(parameters.getAutoExposureLock());
        }
        if (AbstractC167007dF.A1S(AbstractC176767tY.A06, c9mk)) {
            this.A08 = Boolean.valueOf(parameters.getAutoWhiteBalanceLock());
        }
        this.A0I = Integer.valueOf(AbstractC208929Ma.A00(parameters.getFlashMode()));
        if (AbstractC167007dF.A1S(AbstractC176767tY.A0G, c9mk)) {
            this.A0H = Integer.valueOf(parameters.getExposureCompensation());
        }
        if (AbstractC167007dF.A1S(AbstractC176767tY.A0V, c9mk)) {
            Rect rect = C9MZ.A00;
            emptyList = C9MX.A00(C9MZ.A02(parameters.get("focus-areas")));
        } else {
            emptyList = Collections.emptyList();
        }
        this.A0X = emptyList;
        this.A0a = Float.valueOf(parameters.getHorizontalViewAngle());
        this.A0b = Float.valueOf(parameters.getVerticalViewAngle());
        this.A0L = Integer.valueOf(parameters.getJpegQuality());
        Rect rect2 = C9MZ.A00;
        try {
            i = parameters.getJpegThumbnailQuality();
        } catch (NumberFormatException e) {
            android.util.Log.e("ParametersHelper", AnonymousClass001.A0R("Invalid jpeg thumbnail quality parameter string=", parameters.get("jpeg-thumbnail-quality")), e);
            i = 85;
        }
        this.A0M = Integer.valueOf(i);
        try {
            Camera.Size jpegThumbnailSize = parameters.getJpegThumbnailSize();
            this.A02 = new C176877tj(jpegThumbnailSize.width, jpegThumbnailSize.height);
        } catch (NumberFormatException unused) {
        }
        if (AbstractC167007dF.A1S(AbstractC176767tY.A0W, c9mk)) {
            emptyList2 = C9MX.A00(C9MZ.A02(parameters.get("metering-areas")));
        } else {
            emptyList2 = Collections.emptyList();
        }
        this.A0Y = emptyList2;
        this.A0O = Integer.valueOf(parameters.getPictureFormat());
        try {
            size = parameters.getPictureSize();
        } catch (NumberFormatException unused2) {
            size = null;
        }
        C176807tc c176807tc = AbstractC176797tb.A0k;
        if (size != null) {
            c176877tj = new C176877tj(size.width, size.height);
        } else {
            c176877tj = null;
        }
        A04(c176807tc, c176877tj);
        this.A0P = Integer.valueOf(parameters.getPreviewFormat());
        parameters.getPreviewFpsRange(this.A0d);
        if (AbstractC166987dD.A1b(c9mk.A01)) {
            this.A0Q = Integer.valueOf(parameters.getPreviewFrameRate());
        }
        this.A0R = Integer.valueOf(C9MW.A03(parameters.getSceneMode()));
        this.A0A = Boolean.valueOf(parameters.getVideoStabilization());
        this.A0T = Integer.valueOf(C9MW.A04(parameters.getWhiteBalance()));
        this.A0U = Integer.valueOf(parameters.getZoom());
        try {
            size2 = parameters.getPreviewSize();
        } catch (NumberFormatException unused3) {
            size2 = null;
        }
        A04(AbstractC176797tb.A0q, size2 != null ? new C176877tj(size2.width, size2.height) : null);
    }

    public final Object clone() {
        return super.clone();
    }
}
