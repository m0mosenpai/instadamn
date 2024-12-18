package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

/* renamed from: X.0qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16040qz extends AbstractC06620Ww {
    public boolean A00;
    public final AwakeTimeSinceBootClock A01;

    public static void A00(C0X2 c0x2, C0XX c0xx, C16040qz c16040qz, int i) {
        long A02;
        C0Xc[] c0XcArr;
        long nowNanos;
        C0XG BdP = c0xx.BdP();
        if (BdP == null) {
            A02 = c16040qz.A02(c0xx.getMarkerId(), c0xx.B6x());
        } else {
            A02 = c16040qz.A02(BdP.A00, c0xx.B6x()) | c16040qz.A02(BdP.A01, c0xx.B6x());
        }
        if (A02 != 0 && (c0XcArr = c16040qz.A02) != null) {
            long j = 1;
            int i2 = 0;
            boolean z = false;
            if (c16040qz.A00) {
                z = true;
            }
            if (c0x2 == null) {
                nowNanos = 0;
            } else {
                nowNanos = c16040qz.A01.nowNanos();
            }
            while (i2 < c0XcArr.length) {
                if ((A02 & j) != 0) {
                    if (z) {
                        try {
                            String str = "QuickEventListenersList::notify [%s %d %d]";
                            String name = c0XcArr[i2].getName();
                            Integer valueOf = Integer.valueOf(c0xx.getMarkerId());
                            Integer valueOf2 = Integer.valueOf(i);
                            if ((ExternalProviders.A07.A01 & TraceEvents.sProviders) != 0) {
                                AbstractC09800fd.A02(StringFormatUtil.formatStrLocaleSafe("QuickEventListenersList::notify [%s %d %d]", name, valueOf, valueOf2), -2133951513);
                            } else if (Systrace.A0E(32L)) {
                                try {
                                    str = StringFormatUtil.formatStrLocaleSafe("QuickEventListenersList::notify [%s %d %d]", name, valueOf, valueOf2);
                                } catch (IllegalFormatException e) {
                                    C0K8.A0J("Tracer", "Bad format string", e);
                                }
                                Systrace.A03(32L, str);
                            }
                        } catch (Throwable th) {
                            if (z) {
                                AbstractC09800fd.A00(-1037984516);
                            }
                            throw th;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                c0XcArr[i2].onMarkerDrop(c0xx);
                            } else {
                                c0XcArr[i2].onMarkerRestart(c0xx);
                            }
                        } else {
                            c0XcArr[i2].onMarkerStop(c0xx);
                        }
                    } else {
                        c0XcArr[i2].onMarkerStart(c0xx);
                    }
                    if (c0x2 != null) {
                        long nowNanos2 = c16040qz.A01.nowNanos();
                        c0x2.A00(c0XcArr[i2].getName(), nowNanos2 - nowNanos);
                        nowNanos = nowNanos2;
                    }
                    if (z) {
                        AbstractC09800fd.A00(-1670938798);
                    }
                }
                i2++;
                j <<= 1;
            }
        }
    }

    public C16040qz(AwakeTimeSinceBootClock awakeTimeSinceBootClock, AbstractC208510h abstractC208510h, C10390h6 c10390h6, C0R9 c0r9, C0Xc[] c0XcArr) {
        super(c10390h6, c0r9, c0XcArr);
        this.A01 = awakeTimeSinceBootClock;
        this.A00 = abstractC208510h == null;
    }

    @Override // X.AbstractC06620Ww
    public final int A03(C0Xc c0Xc) {
        C0Xa listenerFlags = c0Xc.getListenerFlags();
        if (listenerFlags == null) {
            return 0;
        }
        return listenerFlags.A00;
    }

    @Override // X.AbstractC06620Ww
    public final int[] A04(C0Xc c0Xc) {
        C06650Xb listenerMarkers = c0Xc.getListenerMarkers();
        if (listenerMarkers == null) {
            return null;
        }
        return listenerMarkers.A00;
    }
}
