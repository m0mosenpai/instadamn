package X;

import android.media.AudioDeviceInfo;
import android.view.Surface;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import java.util.List;

/* renamed from: X.Y8p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73334Y8p implements YRF, YMG {
    public int A00;
    public YQ7 A02;
    public YMF A03;
    public C73316Y4i A04;
    public final int A05;
    public final Object A07 = AbstractC58318PtA.A0b();
    public final C69514Vqd A06 = new Object();
    public Timeline A01 = Timeline.A00;

    public void A01() {
    }

    @Override // X.YNI
    public final void CK0(int i, Object obj) {
        SAD sad;
        Surface surface;
        Surface surface2;
        YQB yqb;
        if (this instanceof XQI) {
            XQI xqi = (XQI) this;
            if (i == 8) {
                xqi.A00 = (YMY) obj;
                return;
            }
            return;
        }
        if (this instanceof XQJ) {
            XQJ xqj = (XQJ) this;
            if (i != 15) {
                return;
            }
            if (!(obj instanceof YQB) || (yqb = (YQB) obj) == null) {
                yqb = YQB.A00;
            }
            xqj.A01 = yqb;
            return;
        }
        if (this instanceof XQM) {
            XQM xqm = (XQM) this;
            if (i != 1) {
                if (i != 7) {
                    if (i != 10) {
                        if (i != 16) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i != 13) {
                                        if (i != 14) {
                                            return;
                                        }
                                        obj.getClass();
                                        C73309Y1m c73309Y1m = (C73309Y1m) obj;
                                        if (c73309Y1m.A01 == 0 || c73309Y1m.A00 == 0) {
                                            return;
                                        }
                                        xqm.A04 = c73309Y1m;
                                        return;
                                    }
                                    obj.getClass();
                                    xqm.A06 = (List) obj;
                                    return;
                                }
                                C72790XnA c72790XnA = xqm.A08;
                                obj.getClass();
                                int A0H = AbstractC166987dD.A0H(obj);
                                C72797XnK c72797XnK = c72790XnA.A03;
                                if (c72797XnK.A01 == A0H) {
                                    return;
                                }
                                c72797XnK.A01 = A0H;
                                if (Util.A01 < 30 || (surface2 = c72797XnK.A02) == null || A0H == Integer.MIN_VALUE) {
                                    return;
                                }
                                AbstractC72523Xfc.A00(surface2);
                                return;
                            }
                            obj.getClass();
                            ((Number) obj).intValue();
                            return;
                        }
                        obj.getClass();
                        xqm.A00 = AbstractC166987dD.A0H(obj);
                        return;
                    }
                    obj.getClass();
                    int A0H2 = AbstractC166987dD.A0H(obj);
                    if (xqm.A01 == A0H2) {
                        return;
                    }
                    xqm.A01 = A0H2;
                    return;
                }
                obj.getClass();
                xqm.A05 = (YMV) obj;
                return;
            }
            if (obj instanceof Surface) {
                surface = (Surface) obj;
            } else {
                surface = null;
            }
            if (xqm.A02 == surface) {
                return;
            }
            xqm.A02 = surface;
            C72790XnA c72790XnA2 = xqm.A08;
            C72797XnK c72797XnK2 = c72790XnA2.A03;
            if (c72797XnK2.A02 != surface) {
                int i2 = Util.A01;
                c72797XnK2.A02 = surface;
                if (i2 >= 30 && surface != null && c72797XnK2.A01 != Integer.MIN_VALUE) {
                    AbstractC72523Xfc.A00(surface);
                }
            }
            c72790XnA2.A01 = Math.min(c72790XnA2.A01, 1);
            return;
        }
        if (!(this instanceof XQL)) {
            return;
        }
        XQL xql = (XQL) this;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 12) {
                        if (i != 16) {
                            if (i != 9) {
                                if (i != 10) {
                                    return;
                                }
                                YNK ynk = xql.A03;
                                obj.getClass();
                                int A0H3 = AbstractC166987dD.A0H(obj);
                                C73340Y8v c73340Y8v = (C73340Y8v) ynk;
                                if (c73340Y8v.A01 == A0H3) {
                                    return;
                                }
                                c73340Y8v.A01 = A0H3;
                                return;
                            }
                            YNK ynk2 = xql.A03;
                            obj.getClass();
                            C73340Y8v c73340Y8v2 = (C73340Y8v) ynk2;
                            c73340Y8v2.A08 = new C72665Xkg(c73340Y8v2.A04);
                            return;
                        }
                        obj.getClass();
                        xql.A00 = AbstractC166987dD.A0H(obj);
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    C73340Y8v c73340Y8v3 = (C73340Y8v) xql.A03;
                    if (audioDeviceInfo == null) {
                        sad = null;
                    } else {
                        sad = new SAD(audioDeviceInfo);
                    }
                    c73340Y8v3.A06 = sad;
                    return;
                }
                YNK ynk3 = xql.A03;
                obj.getClass();
                C72840Xob c72840Xob = (C72840Xob) obj;
                C73340Y8v c73340Y8v4 = (C73340Y8v) ynk3;
                if (c73340Y8v4.A03.equals(c72840Xob)) {
                    return;
                }
                c73340Y8v4.A03 = c72840Xob;
                return;
            }
            YNK ynk4 = xql.A03;
            obj.getClass();
            Y1h y1h = (Y1h) obj;
            C73340Y8v c73340Y8v5 = (C73340Y8v) ynk4;
            if (c73340Y8v5.A02.equals(y1h)) {
                return;
            }
            c73340Y8v5.A02 = y1h;
            return;
        }
        YNK ynk5 = xql.A03;
        obj.getClass();
        float floatValue = ((Number) obj).floatValue();
        C73340Y8v c73340Y8v6 = (C73340Y8v) ynk5;
        if (c73340Y8v6.A00 == floatValue) {
            return;
        }
        c73340Y8v6.A00 = floatValue;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.Vqd] */
    public AbstractC73334Y8p(int i) {
        this.A05 = i;
    }
}
