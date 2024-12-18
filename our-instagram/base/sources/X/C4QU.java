package X;

import android.os.SystemClock;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4QU, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4QU implements C4QV {
    @Override // X.C4QV
    public void DVN(byte[] bArr, long j) {
    }

    @Override // X.C4QV
    public void DzK(long j, String str) {
    }

    @Override // X.C4QV
    public final void CuH(C121955fn c121955fn) {
        if (this instanceof C4QT) {
            ((C4QT) this).A0o.EHH(c121955fn);
        }
    }

    @Override // X.C4QV
    public final void Cxx() {
        C4QT c4qt;
        C4SE c4se;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null) {
            c4se.A05 = true;
            c4qt.A0r.A04(true);
        }
    }

    @Override // X.C4QV
    public final void D0Y(InterfaceC95344Qu interfaceC95344Qu, int i) {
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            C4SE c4se = c4qt.A0O;
            if (c4se != null) {
                C95264Qm c95264Qm = c4qt.A0o;
                C4S7 c4s7 = c4se.A0B;
                c95264Qm.EIY(C4QT.A00(c4s7, c4qt), c4s7.A03, i);
            }
            c4qt.A0b = false;
        }
    }

    @Override // X.C4QV
    public final void D0Z(InterfaceC95344Qu interfaceC95344Qu) {
        C4QT c4qt;
        C4SE c4se;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null && c4qt.A0K != null) {
            C95264Qm c95264Qm = c4qt.A0o;
            C4S7 c4s7 = c4se.A0B;
            c95264Qm.EIZ(C4QT.A00(c4s7, c4qt), c4s7.A03, c4qt.A0K.BEF());
            if (c4qt.A15) {
                C4QT.A0F(c4qt);
            }
        }
    }

    @Override // X.C4QV
    public void D6i(InterfaceC95344Qu interfaceC95344Qu) {
        View view;
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            if (c4qt.A15) {
                C4QT.A0F(c4qt);
            }
            c4qt.A0N.onCompletion();
            C95294Qp c95294Qp = c4qt.A0t;
            String CFA = c4qt.CFA();
            C95314Qr c95314Qr = c95294Qp.A05;
            if (CFA != null && c95314Qr.A04) {
                String str = (String) AbstractC001900j.A0R(CFA, new String[]{"_"}, 0).get(0);
                WeakReference weakReference = c95314Qr.A03;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    view.setContentDescription(AnonymousClass001.A0R("Playback completed ", str));
                }
                c95314Qr.A00 = 0;
            }
        }
    }

    @Override // X.C4QV
    public final void D8s(InterfaceC95344Qu interfaceC95344Qu, List list) {
        if (this instanceof C4QT) {
            ((C4QT) this).A0N.onCues(list);
        }
    }

    @Override // X.C4QV
    public final void DBs(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, int i, int i2, int i3) {
        C4QT c4qt;
        C4SE c4se;
        String str3 = str2;
        String str4 = str;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null) {
            C95264Qm c95264Qm = c4qt.A0o;
            C4S7 c4s7 = c4se.A0B;
            Object obj = c4s7.A03;
            if (str == null) {
                str4 = "";
            }
            int round = Math.round(i3);
            if (str2 == null) {
                str3 = "";
            }
            c95264Qm.EHU(C4QT.A02(c4s7, c4qt, null, i, i2, c4qt.A03, c4qt.getCurrentPositionMs(), c4qt.A0O.A0B.A00), obj, str4, str3, round, i);
        }
    }

    @Override // X.C4QV
    public final void DCT(InterfaceC95344Qu interfaceC95344Qu) {
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            C4SE c4se = c4qt.A0O;
            if ((c4se != null && c4se.A03.A03) || C4R8.A01(c4qt.A0m, c4qt.A0Q)) {
                c4qt.A0V = false;
            }
            if (c4qt.A0a || C4R8.A01(c4qt.A0m, c4qt.A0Q)) {
                C4QT.A0H(c4qt);
            }
            C30G c30g = c4qt.A0N;
            if (c30g != null) {
                c30g.onDrawnToSurface();
            }
        }
    }

    @Override // X.C4QV
    public void DEE(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, String str3) {
        int i;
        int i2;
        if (this instanceof C4QT) {
            final C4QT c4qt = (C4QT) this;
            C0K8.A0O("VideoPlayerImpl", "IgBaseVideoPlayer Error: %s %s %s", str, str2, str3);
            c4qt.A0R.set(false);
            if (str2.equals("RESPONSE_CODE_403") && c4qt.A1A) {
                c4qt.A0l.A01(1827799077, new Runnable() { // from class: X.J3n
                    @Override // java.lang.Runnable
                    public final void run() {
                        C75363a3 c75363a3;
                        C4QT c4qt2 = C4QT.this;
                        C4SE c4se = c4qt2.A0O;
                        if (c4se != null && (c75363a3 = c4se.A0A) != null) {
                            C92104Aq A00 = C92104Aq.A00();
                            if (A00 != null) {
                                A00.A01();
                            }
                            UserSession userSession = c4qt2.A0m;
                            String str4 = c75363a3.A0G.split("_")[0];
                            C39030HGg c39030HGg = new C39030HGg(c4qt2, 28);
                            AbstractC167007dF.A1K(userSession, str4);
                            C25621Ms A0M = AbstractC31177DnL.A0M(userSession);
                            AbstractC31173DnH.A1Q(A0M, "video/refresh_resources/%s/", new Object[]{str4});
                            C1ON A0e = AbstractC25227BEk.A0e(A0M, HAT.class, C41348IRt.class);
                            A0e.A00 = c39030HGg;
                            A0e.run();
                        }
                    }
                });
                return;
            }
            if (c4qt.A0O != null && c4qt.A0Q != null) {
                UserSession userSession = c4qt.A0m;
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, userSession, 36310950600769925L) && C18U.A06(c06090Tz, userSession, 36310950600835462L) && (i2 = c4qt.A08) < c4qt.A09) {
                    c4qt.A0c = true;
                    c4qt.A08 = i2 + 1;
                    C4SE c4se = c4qt.A0O;
                    C75363a3 c75363a3 = c4se.A0A;
                    InterfaceC74623Ww interfaceC74623Ww = c4qt.A0J;
                    C4S7 c4s7 = c4se.A0B;
                    float f = c4qt.A02;
                    boolean z = c4se.A0E;
                    String str4 = c4qt.A0Q;
                    C14360o3.A0B(c4s7, 3);
                    C14360o3.A0B(str4, 6);
                    String str5 = c4qt.A0O.A0C;
                    int currentPositionMs = c4qt.getCurrentPositionMs();
                    int i3 = c4qt.A0A;
                    C4QP c4qp = c4qt.A0O.A03;
                    C14360o3.A0B(c4qp, 0);
                    c4qt.E5v(new C4SC(interfaceC74623Ww, c4qp, c75363a3, c4s7, str5, str4, f, i3, currentPositionMs, z));
                    return;
                }
            }
            if (c4qt.A0K != null) {
                UserSession userSession2 = c4qt.A0m;
                C06090Tz c06090Tz2 = C06090Tz.A05;
                if (C18U.A06(c06090Tz2, userSession2, 36310950600769925L) && C18U.A06(c06090Tz2, userSession2, 36310950600507778L) && (i = c4qt.A08) < c4qt.A09) {
                    c4qt.A08 = i + 1;
                    c4qt.A0K.EKu();
                    return;
                }
            }
            C4SE c4se2 = c4qt.A0O;
            if (c4se2 == null) {
                return;
            }
            C95264Qm c95264Qm = c4qt.A0o;
            C4S7 c4s72 = c4se2.A0B;
            c95264Qm.EIa(C4QT.A00(c4s72, c4qt), c4s72.A03, str, str2, str3);
            c4qt.A0N.onVideoPlayerError(c4qt.A0O.A0B, str3);
            if (c4qt.A0O.A0B.A03 instanceof InterfaceC120995dr) {
                return;
            }
            c4qt.Eol("error", true);
        }
    }

    @Override // X.C4QV
    public void DQs(InterfaceC95344Qu interfaceC95344Qu) {
        C4QT c4qt;
        C4SE c4se;
        View view;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null) {
            c4qt.A0U = true;
            c4qt.A0b = true;
            c4se.A01++;
            C95264Qm c95264Qm = c4qt.A0o;
            C4S7 c4s7 = c4se.A0B;
            c95264Qm.EId(C4QT.A00(c4s7, c4qt), c4s7.A03, c4se.A0D);
            C4QT.A0F(c4qt);
            c4qt.A0N.onLoop(c4qt.A0O.A01);
            c4qt.A0U = false;
            C95294Qp c95294Qp = c4qt.A0t;
            String CFA = c4qt.CFA();
            C95314Qr c95314Qr = c95294Qp.A05;
            if (CFA != null && c95314Qr.A04) {
                String str = (String) AbstractC001900j.A0R(CFA, new String[]{"_"}, 0).get(0);
                WeakReference weakReference = c95314Qr.A03;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    view.setContentDescription(AnonymousClass001.A0R("Playback looping ", str));
                }
            }
        }
    }

    @Override // X.C4QV
    public final void DRP(C53302cE c53302cE) {
        if (this instanceof C4QT) {
            ((C4QT) this).A0o.EHp(c53302cE);
        }
    }

    @Override // X.C4QV
    public void DaX(InterfaceC95344Qu interfaceC95344Qu, long j) {
        C4SE c4se;
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            boolean z = false;
            c4qt.A0V = false;
            C95334Qt c95334Qt = c4qt.A0K;
            if (c95334Qt != null && (c4se = c4qt.A0O) != null) {
                c4se.A0B.A02.A03 = c95334Qt.FE0();
                C4SE c4se2 = c4qt.A0O;
                C4S7 c4s7 = c4se2.A0B;
                if (c4s7.A02.A03 && c4s7.A00) {
                    z = true;
                }
                c4se2.A05 = z;
                c4qt.A0r.A04(z);
            }
            C4QT.A0G(c4qt);
            if (!c4qt.A17) {
                C4QT.A0E(c4qt);
            }
        }
    }

    @Override // X.C4QV
    public final void DaZ(InterfaceC95344Qu interfaceC95344Qu) {
        C4QT c4qt;
        C4SE c4se;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null) {
            c4qt.A0o.EIi(C4QT.A00(c4qt.A0O.A0B, c4qt), c4se.A0B.A03, c4qt.getCurrentPositionMs());
        }
    }

    @Override // X.C4QV
    public void Dk0(InterfaceC95344Qu interfaceC95344Qu, long j) {
        if (this instanceof C4QT) {
            ((C4QT) this).A0N.onSeeking(j);
        }
    }

    @Override // X.C4QV
    public final void DrP() {
        boolean z;
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            long currentPositionMs = c4qt.getCurrentPositionMs();
            long currentPositionMs2 = c4qt.getCurrentPositionMs();
            long currentTimeMillis = System.currentTimeMillis();
            C95744Si c95744Si = c4qt.A0E;
            if (C4S0.A03()) {
                if (!C18U.A06(C06090Tz.A05, c4qt.A0m, 36318930650274587L)) {
                    C4S0.A01(c4qt.CFf(), c4qt.CFA(), currentPositionMs2);
                }
            }
            if (c95744Si != null) {
                C4SE c4se = c4qt.A0O;
                if (c4se == null) {
                    z = false;
                } else {
                    z = c4se.A0B.A00;
                }
                XNT xnt = new XNT(currentPositionMs, currentPositionMs2, currentTimeMillis);
                if (z) {
                    xnt.A00 = currentPositionMs2 * 100;
                }
                c95744Si.A03(xnt);
            }
            if (!c4qt.A0a) {
                C4QT.A0H(c4qt);
            }
            AtomicBoolean atomicBoolean = c4qt.A11;
            if (!atomicBoolean.get() && c4qt.A0w != null && c4qt.A12) {
                atomicBoolean.set(true);
            }
        }
    }

    @Override // X.C4QV
    public final void Dz4(EnumC92424Bx enumC92424Bx, InterfaceC95344Qu interfaceC95344Qu) {
        C4QT c4qt;
        C4SE c4se;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null) {
            boolean z = false;
            if (enumC92424Bx == EnumC92424Bx.CACHED) {
                z = true;
            }
            C4S7 c4s7 = c4se.A0B;
            c4s7.A02.A02 = z;
            c4qt.A0o.EIc(c4s7.A03, z);
        }
    }

    @Override // X.C4QV
    public final void Dz5(EnumC92424Bx enumC92424Bx, InterfaceC95344Qu interfaceC95344Qu, long j) {
        C4QT c4qt;
        C4SE c4se;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null) {
            C4S7 c4s7 = c4se.A0B;
            C4S8 c4s8 = c4s7.A02;
            if (c4s8.A00 == EnumC92424Bx.NOT_APPLY) {
                c4s8.A00 = enumC92424Bx;
                c4qt.A0o.EHb(enumC92424Bx, c4s7.A03);
                c4qt.A0q.A02(enumC92424Bx);
            }
        }
    }

    @Override // X.C4QV
    public final void DzA(EnumC92424Bx enumC92424Bx, InterfaceC95344Qu interfaceC95344Qu) {
        C4QT c4qt;
        C4SE c4se;
        if ((this instanceof C4QT) && (c4se = (c4qt = (C4QT) this).A0O) != null) {
            C4S7 c4s7 = c4se.A0B;
            c4s7.A02.A01 = enumC92424Bx;
            c4qt.A0o.EHk(enumC92424Bx, c4s7.A03);
        }
    }

    @Override // X.C4QV
    public final void Dzw(InterfaceC95344Qu interfaceC95344Qu, float f, int i, int i2) {
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            AbstractC97724aA abstractC97724aA = c4qt.A0P;
            if (abstractC97724aA != null && (abstractC97724aA instanceof C4a9)) {
                ScalingTextureView scalingTextureView = ((C4a9) abstractC97724aA).A02;
                scalingTextureView.A02 = i;
                scalingTextureView.A01 = i2;
                ScalingTextureView.A00(scalingTextureView);
            }
            c4qt.A0B = i;
            c4qt.A07 = i2;
        }
    }

    @Override // X.C4QV
    public void E05(long j) {
        View view;
        boolean z;
        String str;
        String str2;
        Runnable runnable;
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            if (c4qt.A0K != null && ((c4qt.A0P == null || c4qt.CfM()) && (runnable = c4qt.A0w) != null && !c4qt.A11.get() && c4qt.A12)) {
                HandlerC25861Nt handlerC25861Nt = c4qt.A0l;
                handlerC25861Nt.removeCallbacks(runnable);
                handlerC25861Nt.A02(runnable, 1827799077, c4qt.A0j);
            }
            if (c4qt.A14) {
                C4QT.A0C(C3Q0.PLAYING, c4qt);
                c4qt.A0u.sendEmptyMessage(2);
            }
            C4SE c4se = c4qt.A0O;
            if (c4se != null) {
                C4SG A01 = C4QT.A01(c4se.A0B, c4qt, (int) j);
                C4QT.A0F(c4qt);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C4SF c4sf = c4qt.A0O.A04;
                long j2 = elapsedRealtime - c4sf.A00;
                c4qt.A0s.A02(c4sf.A01);
                c4qt.A0q.A03(C4QT.A0M(c4qt), c4qt.A0O.A0B.A02.A03);
                C95264Qm c95264Qm = c4qt.A0o;
                C4SE c4se2 = c4qt.A0O;
                C4S7 c4s7 = c4se2.A0B;
                Object obj = c4s7.A03;
                boolean A0M = C4QT.A0M(c4qt);
                boolean z2 = c4s7.A02.A03;
                String str3 = c4se2.A04.A01;
                if (!c4qt.A16 && ((str = c4qt.A0Q) == null || (str2 = c4qt.A0z) == null || !c4qt.CdZ() || !str.equals(str2))) {
                    z = false;
                } else {
                    z = true;
                }
                c95264Qm.EIm(A01, obj, str3, j2, A0M, z2, z);
                c4qt.A0N.onVideoStartedPlaying(c4qt.A0O.A0B);
                C95634Rx c95634Rx = c4qt.A0r;
                c95634Rx.A01.set(Float.valueOf(0.0f));
                c95634Rx.A00.set(false);
                c95634Rx.A02(c4qt.A02, -5);
                c95264Qm.EIX(A01, c4qt.A0O.A0B.A03, -5, true);
            }
            if (c4qt.A18) {
                int i = (int) j;
                c4qt.A03 = i;
                if (c4qt.A0S) {
                    C4QT.A0J(c4qt, i - c4qt.A05);
                }
            }
            C95294Qp c95294Qp = c4qt.A0t;
            String CFA = c4qt.CFA();
            C95314Qr c95314Qr = c95294Qp.A05;
            if (CFA != null && c95314Qr.A04) {
                String str4 = (String) AbstractC001900j.A0R(CFA, new String[]{"_"}, 0).get(0);
                WeakReference weakReference = c95314Qr.A03;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    view.setContentDescription(AnonymousClass001.A0R("Playback started ", str4));
                }
            }
        }
    }

    @Override // X.C4QV
    public final void E1l(InterfaceC95344Qu interfaceC95344Qu, String str, String str2, String str3) {
        if (this instanceof C4QT) {
            C4QT c4qt = (C4QT) this;
            C0K8.A0O("VideoPlayerImpl", "IgBaseVideoPlayer Warning: %s %s %s", str, str2, str3);
            C4SE c4se = c4qt.A0O;
            if (c4se != null) {
                c4qt.A0o.EIs(c4se.A0B.A03, str, str2, str3);
            }
        }
    }
}
