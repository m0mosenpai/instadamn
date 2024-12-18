package X;

import android.os.SystemClock;
import com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4R3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4R3 implements C4R4 {
    public final WeakReference A00;

    @Override // X.C4R4
    public final void Dym() {
    }

    @Override // X.C4R4
    public final void DzF(C5n5 c5n5, String str, long j, long j2, boolean z) {
        String str2;
        C14360o3.A0B(str, 4);
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            Long valueOf = Long.valueOf(j);
            C4QV c4qv = c95334Qt.A0M;
            if (c4qv != null) {
                c4qv.DzK(valueOf.longValue(), str);
            }
            VideoPerformanceProvider videoPerformanceProvider = C95334Qt.A0s;
            if (videoPerformanceProvider != null) {
                videoPerformanceProvider.onVideoPaused(SystemClock.elapsedRealtime(), str);
            }
            C4AN c4an = c95334Qt.A0I;
            if (c4an != null && (str2 = c4an.A0G) != null) {
                C4S0.A02(str2, c95334Qt.A09.A04);
            }
        }
    }

    @Override // X.C4R4
    public final void D9S(long j, String str, boolean z) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            if (z) {
                C4R0 c4r0 = c95334Qt.A0j;
                c4r0.A02 = str;
                c4r0.A00 = (int) j;
            } else {
                c95334Qt.A0j.A01 = str;
            }
            C66354UBs c66354UBs = c95334Qt.A0P;
            if (c66354UBs != null && z) {
                c66354UBs.A0B = str;
            }
        }
    }

    @Override // X.C4R4
    public final void D9T(int i, int i2, int i3, int i4) {
        this.A00.get();
    }

    @Override // X.C4R4
    public final void DBq(C98704bq c98704bq, String str, List list, long j, boolean z) {
        C95334Qt c95334Qt;
        if (list != null && (c95334Qt = (C95334Qt) this.A00.get()) != null) {
            if ((c98704bq.equals(c95334Qt.A0F) || c98704bq.equals(c95334Qt.A0G)) && c95334Qt.A0p) {
                return;
            }
            String str2 = c98704bq.A0E;
            boolean startsWith = str2.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND);
            if (str2.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                c95334Qt.A0F = c98704bq;
            }
            if (startsWith) {
                c95334Qt.A0G = c98704bq;
            }
            c95334Qt.A0E = c98704bq;
            if (c95334Qt.A0M == null) {
                return;
            }
            c95334Qt.A09(c98704bq, list);
        }
    }

    @Override // X.C4R4
    public final void DIJ(String str, long j) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null && C4S0.A03()) {
            if (C18U.A06(C06090Tz.A05, c95334Qt.A0i, 36318930650274587L)) {
                C4S0.A01(c95334Qt.A09.A04, str, j);
            }
        }
    }

    @Override // X.C4R4
    public final void DVN(byte[] bArr, long j) {
        C4QV c4qv;
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null && (c4qv = c95334Qt.A0M) != null) {
            c4qv.DVN(bArr, j);
        }
    }

    @Override // X.C4R4
    public final void DZ0() {
        this.A00.get();
    }

    @Override // X.C4R4
    public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            C4Y0 c4y0 = C4Y0.A0j;
            C4Y0 c4y02 = c117275Sm.A00;
            if (c4y0 == c4y02 && !c95334Qt.A0h.A25) {
                C0w9.A03("local_socket_no_connection", AnonymousClass001.A0b(c117275Sm.A02, ", address in use: ", C42871yF.A00().A06.hashCode()));
                if (!c95334Qt.A0X) {
                    C41711wL c41711wL = c95334Qt.A0m;
                    if (!c41711wL.A01.A25) {
                        C42871yF.A00().A05(true);
                        C41711wL.A04(c41711wL);
                    }
                    c95334Qt.A0X = true;
                }
            }
            String str2 = c117275Sm.A01.A00;
            String name = c4y02.name();
            String str3 = c117275Sm.A02;
            C4QV c4qv = c95334Qt.A0M;
            if (c4qv != null) {
                c4qv.DEE(c95334Qt, str2, name, str3);
            }
            C66354UBs c66354UBs = c95334Qt.A0P;
            if (c66354UBs != null) {
                c66354UBs.setErrorOrWarningCause(str2, name, str3);
            }
            VideoPerformanceProvider videoPerformanceProvider = C95334Qt.A0s;
            if (videoPerformanceProvider != null) {
                videoPerformanceProvider.onError(c95334Qt.A06(), str2, name, str3);
            }
            if (C18U.A06(C06090Tz.A05, c95334Qt.A0i, 2342155583311840432L) && str3 != null && Pattern.matches("length=\\d; index=\\d", str3)) {
                C0w9.A03("IgGrootPlayer", "ArrayIndexOutOfBoundsException");
            }
        }
    }

    @Override // X.C4R4
    public final void DaU(long j, String str) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            if (!c95334Qt.A0W) {
                C4QV c4qv = c95334Qt.A0M;
                if (c4qv != null) {
                    c4qv.DaX(c95334Qt, j);
                }
                C66354UBs c66354UBs = c95334Qt.A0P;
                if (c66354UBs != null) {
                    c66354UBs.A05(C05F.A00);
                }
                VideoPerformanceProvider videoPerformanceProvider = C95334Qt.A0s;
                if (videoPerformanceProvider != null) {
                    videoPerformanceProvider.endStall(c95334Qt.A06(), VideoPerformanceProvider.Stalls.INIT);
                }
            }
            c95334Qt.A0W = true;
        }
    }

    @Override // X.C4R4
    public final void DaY() {
        C4QV c4qv;
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null && (c4qv = c95334Qt.A0M) != null) {
            c4qv.DaZ(c95334Qt);
        }
    }

    @Override // X.C4R4
    public final void Dnx(boolean z) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            C4QV c4qv = c95334Qt.A0M;
            if (c4qv != null) {
                c4qv.D0Z(c95334Qt);
            }
            C66354UBs c66354UBs = c95334Qt.A0P;
            if (c66354UBs != null) {
                C69364VmA c69364VmA = c66354UBs.A0a;
                if (c69364VmA.A02) {
                    long[] jArr = c69364VmA.A03;
                    if (jArr[1] == 0) {
                        jArr[1] = SystemClock.elapsedRealtime();
                    }
                }
            }
            VideoPerformanceProvider videoPerformanceProvider = C95334Qt.A0s;
            if (videoPerformanceProvider != null && c95334Qt.A0V) {
                videoPerformanceProvider.onVideoPaused(SystemClock.elapsedRealtime(), c95334Qt.A06());
                videoPerformanceProvider.onPrepare(c95334Qt.A06(), VideoPerformanceProvider.Stalls.BUFFERING);
            }
        }
    }

    @Override // X.C4R4
    public final void Dot(int i) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            C4QV c4qv = c95334Qt.A0M;
            if (c4qv != null) {
                c4qv.D0Y(c95334Qt, i);
            }
            C66354UBs c66354UBs = c95334Qt.A0P;
            if (c66354UBs != null) {
                c66354UBs.A05(C05F.A01);
            }
            VideoPerformanceProvider videoPerformanceProvider = C95334Qt.A0s;
            if (videoPerformanceProvider != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                videoPerformanceProvider.endStall(c95334Qt.A06(), VideoPerformanceProvider.Stalls.BUFFERING);
                videoPerformanceProvider.onVideoStarted(elapsedRealtime, c95334Qt.A06());
            }
        }
    }

    @Override // X.C4R4
    public final void DrA() {
        this.A00.get();
    }

    @Override // X.C4R4
    public final void Duj(C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            String str3 = c98704bq.A0E;
            boolean startsWith = str3.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND);
            if (str3.startsWith(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                c95334Qt.A0F = c98704bq;
            }
            if (startsWith) {
                c95334Qt.A0G = c98704bq;
            }
            c95334Qt.A0E = c98704bq2;
            C66354UBs c66354UBs = c95334Qt.A0P;
            if (c66354UBs != null) {
                c66354UBs.setFormat(c98704bq2);
            }
        }
    }

    @Override // X.C4R4
    public final void Dyv(C5n5 c5n5, long j) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            if (c95334Qt.A09.A0I.A0X) {
                C4QV c4qv = c95334Qt.A0M;
                if (c4qv != null) {
                    c4qv.DQs(c95334Qt);
                    return;
                }
                return;
            }
            C4QV c4qv2 = c95334Qt.A0M;
            if (c4qv2 == null) {
                return;
            }
            c4qv2.D6i(c95334Qt);
        }
    }

    @Override // X.C4R4
    public final void Dzx(int i, int i2, float f) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            c95334Qt.A05 = i;
            c95334Qt.A04 = i2;
            C4QV c4qv = c95334Qt.A0M;
            if (c4qv != null) {
                c4qv.Dzw(c95334Qt, f, i, i2);
            }
            C95334Qt.A03(c95334Qt);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.4T2, X.0Zx] */
    @Override // X.C4R4
    public final void E07(C4RU c4ru, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        String str6;
        Boolean bool;
        String str7;
        C4AN c4an;
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            if (c4ru.A0R && (c4an = c95334Qt.A0I) != null) {
                String str8 = c4an.A0A;
                String str9 = c4an.A0G;
                if (str9 != null) {
                    boolean z2 = C1KM.A08;
                    long j2 = c4ru.A0G;
                    C14360o3.A0B(str8, 1);
                    boolean z3 = C1KT.A05;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (C1KT.A05) {
                        C1KT.A01(new C1KR(C1KT.A04, str9, str8, uptimeMillis));
                    }
                    if (C1KM.A08) {
                        C1KM.A05(new C1KR(C1KM.A01(), str9, str8, j2));
                    }
                }
            }
            C4SN c4sn = c95334Qt.A0L;
            if (c4sn != 0 && (str7 = C1QM.A00.A02.A00) != null) {
                ?? c0Zx = new C0Zx();
                c0Zx.A06("nav_chain", str7);
                c4sn.A01(c0Zx);
            }
            c95334Qt.A09(c95334Qt.A0E, null);
            C4QV c4qv = c95334Qt.A0M;
            if (c4qv != null) {
                c4qv.E05(c4ru.A00());
            }
            VideoPerformanceProvider videoPerformanceProvider = C95334Qt.A0s;
            if (videoPerformanceProvider != null) {
                videoPerformanceProvider.onVideoStarted(SystemClock.elapsedRealtime(), str5);
                c95334Qt.A0V = true;
            }
            C4AN c4an2 = c95334Qt.A0I;
            if (c4an2 != null && (str6 = c4an2.A0G) != null) {
                C5RC c5rc = (C5RC) C4S0.A07.get(C4S0.A00(c95334Qt.A09.A04, str6));
                if (c5rc != null) {
                    long A00 = C5RC.A00();
                    long A01 = C5RC.A01(c5rc, str6);
                    L5N l5n = c5rc.A03;
                    C5RC.A02(c5rc, "started_playing", l5n.A00, A01, A00);
                    l5n.A09.put(Long.valueOf(A00), Long.valueOf(A01));
                    InterfaceC95164Qc interfaceC95164Qc = (InterfaceC95164Qc) c5rc.A00.get();
                    if (interfaceC95164Qc != null) {
                        bool = Boolean.valueOf(interfaceC95164Qc.CfM());
                    } else {
                        bool = null;
                    }
                    l5n.A02 = bool;
                }
            }
        }
    }

    @Override // X.C4R4
    public final void E1J(boolean z) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            C4AN c4an = c95334Qt.A0I;
            if (c4an != null) {
                String str = c4an.A0A;
                String str2 = c4an.A0G;
                if (str2 != null && !z) {
                    boolean z2 = C1KM.A08;
                    C14360o3.A0B(str, 1);
                    if (C1KT.A05) {
                        C1KT.A01(new C1KR(C1KT.A04, str2, str, SystemClock.uptimeMillis()));
                    }
                    if (C1KM.A08) {
                        C1KM.A05(new C1KR(C1KM.A01(), str2, str, SystemClock.uptimeMillis()));
                    }
                }
            }
            C95354Qv c95354Qv = c95334Qt.A0l;
            synchronized (c95354Qv) {
                if (z) {
                    C95394Qz c95394Qz = c95354Qv.A00;
                    if (!c95394Qz.A02) {
                        c95394Qz.A02();
                    }
                } else {
                    C95394Qz c95394Qz2 = c95354Qv.A00;
                    if (c95394Qz2.A02) {
                        c95394Qz2.A03();
                    }
                }
            }
        }
    }

    @Override // X.C4R4
    public final void E1j(C117275Sm c117275Sm) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null) {
            c95334Qt.A08(c117275Sm.A00, c117275Sm.A01, c117275Sm.A02);
        }
    }

    @Override // X.C4R4
    public final void onCues(List list) {
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null && c95334Qt.A0M != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C131315wK) it.next()).A00);
            }
            c95334Qt.A0M.D8s(c95334Qt, arrayList);
        }
    }

    @Override // X.C4R4
    public final void onDrawnToSurface() {
        C4QV c4qv;
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null && (c4qv = c95334Qt.A0M) != null) {
            c4qv.DCT(c95334Qt);
        }
    }

    @Override // X.C4R4
    public final void onSeeking(long j) {
        C4QV c4qv;
        C95334Qt c95334Qt = (C95334Qt) this.A00.get();
        if (c95334Qt != null && (c4qv = c95334Qt.A0M) != null) {
            c4qv.Dk0(c95334Qt, j);
        }
    }

    public C4R3(C95334Qt c95334Qt) {
        this.A00 = new WeakReference(c95334Qt);
    }
}
