package X;

import android.os.SystemClock;
import android.util.Pair;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.29y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C461429y {
    public static final int[] A07;
    public long A00;
    public boolean A01;
    public final InterfaceC460429o A02;
    public final List A03;
    public final List A04;
    public final boolean A05;
    public final C2A0[] A06;

    static {
        A07 = r2;
        int[] iArr = {CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 0, 500, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 500, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 500, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD, 500, 30000, 30000, 1, 1, 0, 0, 500, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, 0};
    }

    public C461429y(HeroPlayerSetting heroPlayerSetting, InterfaceC460429o interfaceC460429o) {
        C2A0 c2a0;
        C2A0 c2a02;
        C2A0 c2a03;
        C2A0 c2a04;
        C2A0 c2a05;
        C2A0[] c2a0Arr = new C2A0[19];
        this.A06 = c2a0Arr;
        int i = 0;
        this.A01 = false;
        this.A05 = heroPlayerSetting.A3L;
        C2A2 c2a2 = C2A2.DEGRADED;
        Pair pair = new Pair(c2a2, 100000);
        C2A2 c2a22 = C2A2.POOR;
        Pair pair2 = new Pair(c2a22, 1000);
        C2A2 c2a23 = C2A2.MODERATE;
        Pair pair3 = new Pair(c2a23, 500);
        C2A2 c2a24 = C2A2.GOOD;
        this.A03 = Collections.unmodifiableList(Arrays.asList(pair, pair2, pair3, new Pair(c2a24, Integer.valueOf(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION))));
        C42301xK c42301xK = heroPlayerSetting.A0r;
        this.A04 = Collections.unmodifiableList(Arrays.asList(new Pair(c2a2, Integer.valueOf(c42301xK.A01)), new Pair(c2a22, Integer.valueOf(c42301xK.A05)), new Pair(c2a23, Integer.valueOf(c42301xK.A04)), new Pair(c2a24, Integer.valueOf(c42301xK.A03))));
        C42301xK c42301xK2 = heroPlayerSetting.A0n;
        if (c42301xK2 != null) {
            c2a0 = new C2A0(c42301xK2);
        } else {
            c2a0 = null;
        }
        c2a0Arr[0] = c2a0;
        c2a0Arr[1] = null;
        C42301xK c42301xK3 = heroPlayerSetting.A0p;
        c2a0Arr[2] = c42301xK3 != null ? new C2A0(c42301xK3) : null;
        C42301xK c42301xK4 = heroPlayerSetting.A0q;
        if (c42301xK4 != null) {
            c2a02 = new C2A0(c42301xK4);
        } else {
            c2a02 = null;
        }
        c2a0Arr[3] = c2a02;
        c2a0Arr[4] = null;
        c2a0Arr[5] = null;
        c2a0Arr[6] = null;
        c2a0Arr[7] = null;
        C42301xK c42301xK5 = heroPlayerSetting.A0m;
        if (c42301xK5 != null) {
            c2a03 = new C2A0(c42301xK5);
        } else {
            c2a03 = null;
        }
        c2a0Arr[8] = c2a03;
        c2a0Arr[9] = null;
        C42301xK c42301xK6 = heroPlayerSetting.A0s;
        if (c42301xK6 != null) {
            c2a04 = new C2A0(c42301xK6);
        } else {
            c2a04 = null;
        }
        c2a0Arr[10] = c2a04;
        C42301xK c42301xK7 = heroPlayerSetting.A0l;
        if (c42301xK7 != null) {
            c2a05 = new C2A0(c42301xK7);
        } else {
            c2a05 = null;
        }
        c2a0Arr[11] = c2a05;
        c2a0Arr[12] = null;
        c2a0Arr[14] = null;
        c2a0Arr[15] = null;
        c2a0Arr[18] = null;
        c2a0Arr[13] = null;
        c2a0Arr[16] = null;
        c2a0Arr[17] = null;
        while (true) {
            if (this.A06[i] != null) {
                this.A01 = true;
                break;
            } else {
                i++;
                if (i >= 19) {
                    break;
                }
            }
        }
        this.A02 = interfaceC460429o;
    }

    public static int A00(C461429y c461429y, int i) {
        C2A2 c2a2;
        int i2;
        long j;
        C2A0[] c2a0Arr = c461429y.A06;
        if (c2a0Arr[i] == null) {
            return A07[i];
        }
        if (c461429y.A01 && c461429y.A02 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - c461429y.A00 > 2000) {
                long j2 = -1;
                if (c461429y.A05) {
                    C2A6 A00 = C2A6.A00();
                    synchronized (A00) {
                        j = A00.A02;
                    }
                    if (j >= 0) {
                        j2 = j;
                    }
                }
                List list = c461429y.A04;
                if (j2 < 0) {
                    c2a2 = C2A2.UNKNOWN;
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            if (j2 < ((Number) pair.second).intValue()) {
                                c2a2 = (C2A2) pair.first;
                                break;
                            }
                        } else {
                            c2a2 = C2A2.EXCELLENT;
                            break;
                        }
                    }
                }
                int i3 = 0;
                loop0: while (true) {
                    C2A0 c2a0 = c2a0Arr[i3];
                    if (c2a0 != null && c2a2 != null) {
                        C42301xK c42301xK = c2a0.A01;
                        if (c42301xK.A06) {
                            int ordinal = c2a2.ordinal();
                            if (ordinal != 4) {
                                if (ordinal != 3) {
                                    if (ordinal != 2) {
                                        if (ordinal != 1) {
                                            if (ordinal != 0) {
                                                i2 = c42301xK.A00;
                                            } else {
                                                i2 = c42301xK.A01;
                                            }
                                        } else {
                                            i2 = c42301xK.A05;
                                        }
                                    } else {
                                        i2 = c42301xK.A04;
                                    }
                                } else {
                                    i2 = c42301xK.A03;
                                }
                            } else {
                                i2 = c42301xK.A02;
                            }
                            c2a0.A00 = i2;
                        }
                    }
                    do {
                        i3++;
                        if (i3 >= 19) {
                            break loop0;
                        }
                    } while (i3 == 1);
                }
                c461429y.A00 = elapsedRealtime;
            }
        }
        return c2a0Arr[i].A00;
    }

    public C461429y() {
        this(HeroPlayerSetting.A3e, null);
    }
}
