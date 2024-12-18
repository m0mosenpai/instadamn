package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.animation.Animation;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.io.IOException;

/* renamed from: X.9MF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9MF extends C9KW {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public C95334Qt A04;
    public Integer A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final UserSession A0D;
    public final AbstractC209369Nu A0E;
    public final C208719Lf A0F;
    public final boolean A0G;
    public final Context A0H;
    public volatile int A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9MF(Context context, UserSession userSession, C23105AGr c23105AGr, RunnableC208819Lp runnableC208819Lp, C208719Lf c208719Lf, boolean z, boolean z2) {
        super(userSession, null, c23105AGr);
        AbstractC167007dF.A1H(context, 1, userSession);
        this.A0H = context;
        this.A0F = c208719Lf;
        this.A06 = z;
        this.A07 = z2;
        this.A0D = userSession;
        this.A0G = C18U.A06(C06090Tz.A05, userSession, 36317702289429992L);
        this.A0E = new C219899nb(this, runnableC208819Lp, c208719Lf);
        this.A0I = -1;
        this.A09 = true;
        this.A00 = 1.0f;
        this.A02 = -1;
        this.A01 = -1;
        this.A05 = C05F.A01;
    }

    public static final void A05(C9MF c9mf, boolean z) {
        View view;
        c9mf.A02 = -1;
        if (z) {
            c9mf.A05 = C05F.A01;
            A04(c9mf, A00(c9mf), false);
        }
        C23105AGr c23105AGr = ((C9KW) c9mf).A07;
        if (c23105AGr != null && (view = c23105AGr.A00) != null) {
            view.clearAnimation();
            c23105AGr.A00.setVisibility(0);
            View view2 = c23105AGr.A00;
            Animation animation = c23105AGr.A02;
            animation.getClass();
            view2.startAnimation(animation);
        }
        c9mf.A09 = true;
        InterfaceC25215BDn interfaceC25215BDn = ((C9KW) c9mf).A04;
        if (interfaceC25215BDn != null) {
            interfaceC25215BDn.E0B();
        }
    }

    public static final int A00(C9MF c9mf) {
        int i = ((C9KW) c9mf).A00;
        if (i <= 0) {
            ClipInfo clipInfo = ((C9KW) c9mf).A08;
            if (clipInfo != null) {
                return clipInfo.A07;
            }
            return 0;
        }
        return i;
    }

    public static final void A01(C9MF c9mf) {
        C95334Qt c95334Qt;
        SlideInAndOutIconView slideInAndOutIconView;
        Object obj = ((C9KW) c9mf).A0C;
        C14360o3.A06(obj);
        synchronized (obj) {
            if (((C9KW) c9mf).A0D && (c95334Qt = c9mf.A04) != null) {
                c9mf.A07 = false;
                c95334Qt.EhH(0.0f);
                C47Z c47z = ((C9KW) c9mf).A09;
                if (c47z != null && c47z.A5C && C36A.A0K(c9mf.A0D, true, c47z.A11())) {
                    c9mf.A0F();
                } else {
                    C23105AGr c23105AGr = ((C9KW) c9mf).A07;
                    if (c23105AGr != null && (slideInAndOutIconView = c23105AGr.A05) != null) {
                        C23105AGr.A00(slideInAndOutIconView.getContext().getDrawable(R.drawable.soundoff), c23105AGr, C30R.A0B, null);
                    }
                }
            }
        }
    }

    public static final void A02(C9MF c9mf) {
        Object obj = ((C9KW) c9mf).A0C;
        C14360o3.A06(obj);
        synchronized (obj) {
            if (((C9KW) c9mf).A0D) {
                ((C9KW) c9mf).A0D = false;
                c9mf.A0B = false;
                C95334Qt c95334Qt = c9mf.A04;
                if (c95334Qt != null) {
                    c95334Qt.A0M = null;
                    c95334Qt.EE5(false);
                }
                c9mf.A04 = null;
            }
        }
    }

    public static final void A03(final C9MF c9mf) {
        ClipInfo clipInfo;
        C95334Qt c95334Qt = new C95334Qt(c9mf.A0H, c9mf.A0D, "media_player_manager");
        try {
            clipInfo = ((C9KW) c9mf).A08;
        } catch (IOException unused) {
        }
        if (clipInfo != null) {
            String str = clipInfo.A0F;
            if (str != null) {
                android.net.Uri A0I = AbstractC167007dF.A0I(str);
                C47Z c47z = ((C9KW) c9mf).A09;
                if (c47z != null) {
                    c95334Qt.ESy(A0I, null, c47z.A3t, "", false, false);
                    c95334Qt.A0M = new C4QU() { // from class: X.9ML
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
                        
                            if (r0 != null) goto L13;
                         */
                        @Override // X.C4QU, X.C4QV
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void Dk0(X.InterfaceC95344Qu r7, long r8) {
                            /*
                                r6 = this;
                                r5 = 0
                                X.9MF r4 = X.C9MF.this
                                java.lang.Object r3 = r4.A0C
                                X.C14360o3.A06(r3)
                                monitor-enter(r3)
                                boolean r0 = r4.A0D     // Catch: java.lang.Throwable -> L4a
                                if (r0 == 0) goto L48
                                r4.A0B = r5     // Catch: java.lang.Throwable -> L4a
                                r7.getCurrentPosition()     // Catch: java.lang.Throwable -> L4a
                                int r1 = r4.A01     // Catch: java.lang.Throwable -> L4a
                                r0 = -1
                                if (r1 == r0) goto L1e
                                r4.A01 = r0     // Catch: java.lang.Throwable -> L4a
                                r0 = 1
                                X.C9MF.A04(r4, r1, r0)     // Catch: java.lang.Throwable -> L4a
                                goto L48
                            L1e:
                                int r1 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                int r0 = r4.A03     // Catch: java.lang.Throwable -> L4a
                                int r1 = r1 - r0
                                r0 = -3000(0xfffffffffffff448, float:NaN)
                                if (r1 >= r0) goto L35
                                int r0 = r7.getCurrentPosition()     // Catch: java.lang.Throwable -> L4a
                                r4.A02 = r0     // Catch: java.lang.Throwable -> L4a
                                X.9OB r0 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                if (r0 == 0) goto L48
                            L31:
                                r0.A00()     // Catch: java.lang.Throwable -> L4a
                                goto L48
                            L35:
                                int r2 = r7.getCurrentPosition()     // Catch: java.lang.Throwable -> L4a
                                int r1 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                int r0 = r1 + 500
                                if (r2 <= r0) goto L43
                                X.C9MF.A06(r4, r1, r5)     // Catch: java.lang.Throwable -> L4a
                                goto L48
                            L43:
                                X.9OB r0 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                if (r0 == 0) goto L48
                                goto L31
                            L48:
                                monitor-exit(r3)
                                return
                            L4a:
                                r0 = move-exception
                                monitor-exit(r3)
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C9ML.Dk0(X.4Qu, long):void");
                        }

                        @Override // X.C4QU, X.C4QV
                        public final void D6i(InterfaceC95344Qu interfaceC95344Qu) {
                            C9MF c9mf2 = C9MF.this;
                            Object obj = ((C9KW) c9mf2).A0C;
                            C14360o3.A06(obj);
                            synchronized (obj) {
                                if (((C9KW) c9mf2).A0D && !c9mf2.A0B && ((C9KW) c9mf2).A0B) {
                                    C95334Qt c95334Qt2 = c9mf2.A04;
                                    if (c95334Qt2 != null) {
                                        c95334Qt2.seekTo(C9MF.A00(c9mf2));
                                        C95334Qt c95334Qt3 = c9mf2.A04;
                                        if (c95334Qt3 != null) {
                                            c95334Qt3.start();
                                        }
                                        C9PR c9pr = ((C9KW) c9mf2).A06;
                                        if (c9pr != null) {
                                            c9pr.A00.run();
                                        }
                                    } else {
                                        throw AbstractC166997dE.A0g();
                                    }
                                } else if (!((C9KW) c9mf2).A0B) {
                                    C9MF.A05(c9mf2, true);
                                }
                            }
                        }

                        @Override // X.C4QU, X.C4QV
                        public final void DQs(InterfaceC95344Qu interfaceC95344Qu) {
                            C9PR c9pr = ((C9KW) C9MF.this).A06;
                            if (c9pr != null) {
                                c9pr.A00.run();
                            }
                        }
                    };
                    c9mf.A04 = c95334Qt;
                    Object obj = ((C9KW) c9mf).A0C;
                    C14360o3.A06(obj);
                    synchronized (obj) {
                        SurfaceTexture A00 = c9mf.A0F.A00();
                        if (A00 != null) {
                            c95334Qt.setSurface(new Surface(A00));
                            A00.setOnFrameAvailableListener(c9mf);
                            c95334Qt.A0M = new C4QU() { // from class: X.9ML
                                @Override // X.C4QU, X.C4QV
                                public final void Dk0(InterfaceC95344Qu interfaceC95344Qu, long j) {
                                    /*  JADX ERROR: Method code generation error
                                        java.lang.NullPointerException
                                        */
                                    /*
                                        this = this;
                                        r5 = 0
                                        X.9MF r4 = X.C9MF.this
                                        java.lang.Object r3 = r4.A0C
                                        X.C14360o3.A06(r3)
                                        monitor-enter(r3)
                                        boolean r0 = r4.A0D     // Catch: java.lang.Throwable -> L4a
                                        if (r0 == 0) goto L48
                                        r4.A0B = r5     // Catch: java.lang.Throwable -> L4a
                                        r7.getCurrentPosition()     // Catch: java.lang.Throwable -> L4a
                                        int r1 = r4.A01     // Catch: java.lang.Throwable -> L4a
                                        r0 = -1
                                        if (r1 == r0) goto L1e
                                        r4.A01 = r0     // Catch: java.lang.Throwable -> L4a
                                        r0 = 1
                                        X.C9MF.A04(r4, r1, r0)     // Catch: java.lang.Throwable -> L4a
                                        goto L48
                                    L1e:
                                        int r1 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                        int r0 = r4.A03     // Catch: java.lang.Throwable -> L4a
                                        int r1 = r1 - r0
                                        r0 = -3000(0xfffffffffffff448, float:NaN)
                                        if (r1 >= r0) goto L35
                                        int r0 = r7.getCurrentPosition()     // Catch: java.lang.Throwable -> L4a
                                        r4.A02 = r0     // Catch: java.lang.Throwable -> L4a
                                        X.9OB r0 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                        if (r0 == 0) goto L48
                                    L31:
                                        r0.A00()     // Catch: java.lang.Throwable -> L4a
                                        goto L48
                                    L35:
                                        int r2 = r7.getCurrentPosition()     // Catch: java.lang.Throwable -> L4a
                                        int r1 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                        int r0 = r1 + 500
                                        if (r2 <= r0) goto L43
                                        X.C9MF.A06(r4, r1, r5)     // Catch: java.lang.Throwable -> L4a
                                        goto L48
                                    L43:
                                        X.9OB r0 = r4.A02     // Catch: java.lang.Throwable -> L4a
                                        if (r0 == 0) goto L48
                                        goto L31
                                    L48:
                                        monitor-exit(r3)
                                        return
                                    L4a:
                                        r0 = move-exception
                                        monitor-exit(r3)
                                        throw r0
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C9ML.Dk0(X.4Qu, long):void");
                                }

                                @Override // X.C4QU, X.C4QV
                                public final void D6i(InterfaceC95344Qu interfaceC95344Qu) {
                                    C9MF c9mf2 = C9MF.this;
                                    Object obj2 = ((C9KW) c9mf2).A0C;
                                    C14360o3.A06(obj2);
                                    synchronized (obj2) {
                                        if (((C9KW) c9mf2).A0D && !c9mf2.A0B && ((C9KW) c9mf2).A0B) {
                                            C95334Qt c95334Qt2 = c9mf2.A04;
                                            if (c95334Qt2 != null) {
                                                c95334Qt2.seekTo(C9MF.A00(c9mf2));
                                                C95334Qt c95334Qt3 = c9mf2.A04;
                                                if (c95334Qt3 != null) {
                                                    c95334Qt3.start();
                                                }
                                                C9PR c9pr = ((C9KW) c9mf2).A06;
                                                if (c9pr != null) {
                                                    c9pr.A00.run();
                                                }
                                            } else {
                                                throw AbstractC166997dE.A0g();
                                            }
                                        } else if (!((C9KW) c9mf2).A0B) {
                                            C9MF.A05(c9mf2, true);
                                        }
                                    }
                                }

                                @Override // X.C4QU, X.C4QV
                                public final void DQs(InterfaceC95344Qu interfaceC95344Qu) {
                                    C9PR c9pr = ((C9KW) C9MF.this).A06;
                                    if (c9pr != null) {
                                        c9pr.A00.run();
                                    }
                                }
                            };
                            c95334Qt.EhH(0.0f);
                            try {
                                c95334Qt.E5Q(null, null);
                                c9mf.A09 = true;
                                ((C9KW) c9mf).A0D = true;
                                c9mf.A08 = false;
                                c9mf.A02 = -1;
                            } catch (IllegalStateException e) {
                                AbstractC167007dF.A15(C18950wb.A01.AEp("MediaPlayerManager", 817901174), DialogModule.KEY_MESSAGE, "Error during MediaPlayer prepare", e);
                                InterfaceC25215BDn interfaceC25215BDn = ((C9KW) c9mf).A04;
                                if (interfaceC25215BDn != null) {
                                    interfaceC25215BDn.Dz1("Error during MediaPlayer prepare");
                                    throw e;
                                }
                                throw e;
                            }
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    }
                    c9mf.A0C();
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    public static final void A04(final C9MF c9mf, int i, boolean z) {
        if (i != c9mf.A02) {
            if (z) {
                ((C9KW) c9mf).A01.post(new Runnable() { // from class: X.9MN
                    @Override // java.lang.Runnable
                    public final void run() {
                        C9MF c9mf2 = C9MF.this;
                        c9mf2.A0E();
                        C23105AGr c23105AGr = ((C9KW) c9mf2).A07;
                        if (c23105AGr != null) {
                            AbstractC167007dF.A0w(c23105AGr.A01);
                        }
                    }
                });
            }
            c9mf.A08 = false;
            if (A06(c9mf, i, true)) {
                c9mf.A02 = i;
                C95334Qt c95334Qt = c9mf.A04;
                if (c95334Qt != null) {
                    c95334Qt.EhH(0.0f);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            c9mf.A01 = i;
        }
    }

    public static final boolean A06(C9MF c9mf, int i, boolean z) {
        int i2;
        Object obj = ((C9KW) c9mf).A0C;
        C14360o3.A06(obj);
        synchronized (obj) {
            if (((C9KW) c9mf).A0D) {
                if (z) {
                    if (!c9mf.A0B) {
                        c9mf.A0B = true;
                        i2 = 200;
                    }
                } else {
                    i2 = c9mf.A03 + 1000;
                }
                c9mf.A03 = i2;
                int max = Math.max(i - i2, 0);
                if (!C18U.A06(C06090Tz.A05, c9mf.A0D, 36312621342786761L)) {
                    C95334Qt c95334Qt = c9mf.A04;
                    if (c95334Qt != null) {
                        c95334Qt.start();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
                C95334Qt c95334Qt2 = c9mf.A04;
                if (c95334Qt2 != null) {
                    c95334Qt2.seekTo(max);
                    return true;
                }
                throw AbstractC166997dE.A0g();
            }
            return false;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = super.A0C;
        C14360o3.A06(obj);
        synchronized (obj) {
            if (super.A0D) {
                C95334Qt c95334Qt = this.A04;
                if (c95334Qt != null) {
                    this.A0I = c95334Qt.getCurrentPosition();
                    Integer num = this.A05;
                    if ((num == C05F.A01 || num == C05F.A0C) && this.A0I > this.A02 - 500) {
                        int i = this.A0I;
                        int i2 = this.A02;
                        if (i > i2 + 500) {
                            A06(this, i2, false);
                        } else {
                            this.A0B = false;
                            C95334Qt c95334Qt2 = this.A04;
                            if (c95334Qt2 != null) {
                                c95334Qt2.pause();
                            }
                            if (this.A06) {
                                A0F();
                            }
                            Integer num2 = this.A05;
                            Integer num3 = C05F.A0C;
                            if (num2 == num3) {
                                int i3 = this.A02;
                                int A00 = A00(this);
                                if (i3 != A00) {
                                    this.A05 = num3;
                                    A04(this, A00, false);
                                }
                            }
                            C176567tE.A00(new Runnable() { // from class: X.9Mi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    View view;
                                    View view2;
                                    C9MF c9mf = C9MF.this;
                                    c9mf.A08 = true;
                                    C23105AGr c23105AGr = ((C9KW) c9mf).A07;
                                    if (c23105AGr != null && (view2 = c23105AGr.A01) != null) {
                                        view2.setVisibility(4);
                                    }
                                    if (c9mf.A0C) {
                                        c9mf.A0E();
                                        c9mf.A0D();
                                        c9mf.A0C = false;
                                    } else {
                                        if (c23105AGr == null || (view = c23105AGr.A00) == null) {
                                            return;
                                        }
                                        view.clearAnimation();
                                        c23105AGr.A00.setVisibility(0);
                                    }
                                }
                            });
                        }
                    }
                    if (this.A05 == C05F.A00) {
                        int i4 = this.A0I;
                        ClipInfo clipInfo = super.A08;
                        if (clipInfo != null) {
                            if (i4 >= clipInfo.A05) {
                                C9PR c9pr = super.A06;
                                if (c9pr != null) {
                                    c9pr.A00.run();
                                }
                                A06(this, A00(this), true);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    ((AbstractC208809Lo) this.A0E).A00.A03(null);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
    }
}
