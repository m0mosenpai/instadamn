package org.webrtc;

import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import android.graphics.ImageFormat;
import com.facebook.tigon.tigonhuc.HucClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes12.dex */
public class CameraEnumerationAndroid {
    public static final ArrayList COMMON_RESOLUTIONS = AbstractC166987dD.A1F(Arrays.asList(new Size(160, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS), new Size(240, 160), new Size(320, 240), new Size(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI, 240), new Size(480, 320), new Size(640, 360), new Size(640, 480), new Size(768, 480), new Size(854, 480), new Size(800, 600), new Size(960, 540), new Size(960, 640), new Size(1024, 576), new Size(1024, 600), new Size(1280, 720), new Size(1280, 1024), new Size(1920, 1080), new Size(1920, 1440), new Size(2560, 1440), new Size(3840, 2160)));
    public static final String TAG = "CameraEnumerationAndroid";

    /* loaded from: classes12.dex */
    public class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        /* loaded from: classes12.dex */
        public class FramerateRange {
            public int max;
            public int min;

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                if (this.min != framerateRange.min || this.max != framerateRange.max) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public FramerateRange(int i, int i2) {
                this.min = i;
                this.max = i2;
            }

            public String toString() {
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("[");
                A1C.append(this.min / 1000.0f);
                A1C.append(":");
                A1C.append(this.max / 1000.0f);
                return AbstractC58319PtB.A0w(A1C);
            }
        }

        public static int frameSize(int i, int i2, int i3) {
            if (i3 == 17) {
                return ((i * i2) * ImageFormat.getBitsPerPixel(i3)) / 8;
            }
            throw AbstractC166987dD.A1D("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            if (this.width != captureFormat.width || this.height != captureFormat.height || !this.framerate.equals(captureFormat.framerate)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return AbstractC166987dD.A0I(this.framerate, (((this.width * 65497) + this.height) * 251) + 1);
        }

        public CaptureFormat(int i, int i2, FramerateRange framerateRange) {
            this.width = i;
            this.height = i2;
            this.framerate = framerateRange;
        }

        public String toString() {
            StringBuilder A1C = AbstractC166987dD.A1C();
            A1C.append(this.width);
            A1C.append("x");
            A1C.append(this.height);
            A1C.append("@");
            A1C.append(this.framerate);
            return A1C.toString();
        }

        public CaptureFormat(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.framerate = new FramerateRange(i3, i4);
        }

        public int frameSize() {
            return ((this.width * this.height) * ImageFormat.getBitsPerPixel(17)) / 8;
        }
    }

    /* loaded from: classes12.dex */
    public abstract class ClosestComparator implements Comparator {
        public abstract int diff(Object obj);

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return diff(obj) - diff(obj2);
        }

        public /* synthetic */ ClosestComparator(AnonymousClass1 anonymousClass1) {
        }

        public ClosestComparator() {
        }
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List list, final int i) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator() { // from class: org.webrtc.CameraEnumerationAndroid.1
            public static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            public static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            public static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            public static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            public static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            public static final int MIN_FPS_THRESHOLD = 8000;

            private int progressivePenalty(int i2, int i3, int i4, int i5) {
                int i6 = i2 * i4;
                if (i2 < i3) {
                    return i6;
                }
                return ((i2 - i3) * i5) + (i4 * i3);
            }

            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                int i2 = framerateRange.min;
                if (i2 >= 8000) {
                    i2 = ((i2 - MIN_FPS_THRESHOLD) * 4) + MIN_FPS_THRESHOLD;
                }
                int abs = Math.abs((i * 1000) - framerateRange.max);
                if (abs >= 5000) {
                    abs = ((abs - 5000) * 3) + 5000;
                }
                return i2 + abs;
            }
        });
    }

    public static Size getClosestSupportedSize(List list, final int i, final int i2) {
        return (Size) Collections.min(list, new ClosestComparator() { // from class: org.webrtc.CameraEnumerationAndroid.2
            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                return Math.abs(i - size.width) + Math.abs(i2 - size.height);
            }
        });
    }

    public static void reportCameraResolution(Histogram histogram, Size size) {
        histogram.addSample(COMMON_RESOLUTIONS.indexOf(size) + 1);
    }
}
