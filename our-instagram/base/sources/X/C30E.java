package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.30E, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C30E extends C30F implements AudioManager.OnAudioFocusChangeListener, View.OnKeyListener {
    public Toast A00;
    public C4S6 A01;
    public C4S6 A02;
    public InterfaceC61432r6 A03;
    public C4SB A04;
    public C4QW A05;
    public Integer A06;
    public Runnable A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Context A0H;
    public final Handler A0I;
    public final C41101vI A0J;
    public final UserSession A0K;
    public final C30N A0L;
    public final Runnable A0M;
    public final String A0N;
    public final HashSet A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final AudioManager A0X;
    public final Fragment A0Y;
    public final InterfaceC60442pS A0Z;
    public final InterfaceC61782rf A0a;
    public final C57462kL A0b;
    public final C30S A0c;
    public final C30R A0d;
    public final C30R A0e;
    public final Runnable A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;

    public C30E(Context context, Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC61782rf interfaceC61782rf, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C14360o3.A0B(str, 11);
        this.A0H = context;
        this.A0K = userSession;
        this.A0Z = interfaceC60442pS;
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (systemService != null) {
            AudioManager audioManager = (AudioManager) systemService;
            this.A0X = audioManager;
            this.A0Q = new CopyOnWriteArrayList();
            this.A0O = new HashSet();
            this.A0f = new Runnable() { // from class: X.30H
                @Override // java.lang.Runnable
                public final void run() {
                    C3Y7 c3y7;
                    C30E c30e = C30E.this;
                    C4S6 c4s6 = c30e.A02;
                    if (c4s6 != null && (c3y7 = c4s6.A08) != null && c30e.A06 == C05F.A0N) {
                        InterfaceC74323Vo B62 = c3y7.B62();
                        if (B62 != null) {
                            B62.Dm7();
                        }
                        InterfaceC74323Vo B622 = c3y7.B62();
                        if (B622 != null) {
                            B622.removeCallbacks(c30e.A0M);
                        }
                        InterfaceC74323Vo B623 = c3y7.B62();
                        if (B623 != null) {
                            B623.postDelayed(c30e.A0M, 2000L);
                        }
                    }
                }
            };
            this.A0M = new Runnable() { // from class: X.30I
                @Override // java.lang.Runnable
                public final void run() {
                    C3Y7 c3y7;
                    InterfaceC74323Vo B62;
                    C30E c30e = C30E.this;
                    C4S6 c4s6 = c30e.A02;
                    if (c4s6 != null && (c3y7 = c4s6.A08) != null && c30e.A06 == C05F.A0N && (B62 = c3y7.B62()) != null) {
                        B62.DKh();
                    }
                }
            };
            this.A06 = C05F.A00;
            interfaceC60442pS.getModuleName();
            this.A0J = new C41101vI(audioManager, userSession);
            this.A0Y = fragment;
            this.A0g = z;
            this.A0U = true;
            this.A0P = new CopyOnWriteArrayList();
            this.A0R = new CopyOnWriteArrayList();
            this.A0i = z2;
            this.A0T = z3;
            this.A0b = new C57462kL(userSession);
            this.A0j = AbstractC56862jK.A00(context);
            this.A0W = z4;
            this.A0D = z5;
            this.A0N = str;
            C06090Tz c06090Tz = C06090Tz.A05;
            this.A0S = C18U.A06(c06090Tz, userSession, 36312097357497237L);
            this.A0h = C18U.A06(c06090Tz, userSession, 36312097357562774L);
            this.A0L = new C30N(userSession, interfaceC60442pS, str, new InterfaceC08830cm() { // from class: X.30J
                @Override // X.InterfaceC08830cm
                public final /* bridge */ /* synthetic */ Object get() {
                    C38321qM c38321qM;
                    int i;
                    C4S6 c4s6 = C30E.this.A02;
                    C116375Os c116375Os = null;
                    if (c4s6 != null && (c38321qM = (C38321qM) ((C4S7) c4s6).A03) != null && c38321qM.A5M() && (i = c4s6.A0D) != -1) {
                        C38321qM A1e = c38321qM.A1e(i);
                        int i2 = 0;
                        C38321qM A1e2 = c38321qM.A1e(0);
                        if (A1e != null && A1e2 != null) {
                            int A0p = c38321qM.A0p();
                            int i3 = A1e.BRp().A00;
                            boolean A08 = A1e.CFR().A08();
                            String id = A1e.getId();
                            if (id != null) {
                                String id2 = A1e2.getId();
                                if (id2 != null) {
                                    c116375Os = new C116375Os(id, id2, i, A0p, i3, A08);
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            String id3 = c38321qM.getId();
                            if (A1e2 != null) {
                                i2 = i;
                            }
                            String A07 = AnonymousClass001.A07(i2, "Media ID: ", id3, ", carousel index: ");
                            C14360o3.A07(A07);
                            C0w9.A03("FeedVideoPlayer_getCarouselInfo", A07);
                        }
                    }
                    return C46h.A00(c116375Os);
                }
            }, new InterfaceC08830cm() { // from class: X.30K
                @Override // X.InterfaceC08830cm
                public final /* bridge */ /* synthetic */ Object get() {
                    if (C30E.this.A0Z()) {
                        return "click";
                    }
                    return "auto";
                }
            }, new InterfaceC08830cm() { // from class: X.30L
                @Override // X.InterfaceC08830cm
                public final /* bridge */ /* synthetic */ Object get() {
                    return C46h.A00(C30E.this.A0G());
                }
            }, new InterfaceC08830cm() { // from class: X.30M
                @Override // X.InterfaceC08830cm
                public final /* bridge */ /* synthetic */ Object get() {
                    return C46h.A00(C30E.this.A0H());
                }
            });
            C30Q c30q = C30Q.SLIDE_OUT;
            this.A0d = new C30R(c30q, 0, 5000, false);
            this.A0e = new C30R(c30q, 0, -1, false);
            this.A0a = interfaceC61782rf;
            this.A0I = new Handler(C1CG.A00());
            this.A0V = C18U.A06(c06090Tz, userSession, 36323281451625608L);
            this.A0c = new C30S();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A07(C30E c30e, String str, boolean z, boolean z2) {
        C86083sf B61;
        c30e.A0B(true);
        C4QW c4qw = c30e.A05;
        if (c4qw != null) {
            c4qw.E4T(str, z);
            C4S6 c4s6 = c30e.A02;
            if (c4s6 != null) {
                C4QT c4qt = (C4QT) c4qw;
                if (c4qt.A0M == C3Q0.PLAYING) {
                    C3Y7 c3y7 = c4s6.A08;
                    if (c3y7 != null) {
                        InterfaceC74323Vo B62 = c3y7.B62();
                        if (B62 != null) {
                            B62.setVisibility(0);
                        }
                        if (z2 && (B61 = c3y7.B61()) != null) {
                            B61.A02(R.drawable.instagram_play_pano_filled_24);
                        }
                    }
                    c4s6.A05 = c4qt.A03;
                    boolean z3 = C4S5.A00(c30e.A0K, A00(c30e), c30e.A0H()) && A0F(c30e);
                    if (z3 != ((C4S7) c4s6).A00) {
                        c4s6.A01(z3);
                        A06(c30e, -5, ((C4S7) c4s6).A00);
                        C38321qM A00 = A00(c30e);
                        if (A00 != null) {
                            A03(A00, c30e.A0H(), c30e);
                        }
                    }
                }
            }
        }
    }

    public final void A0L() {
        FrameLayout A00;
        this.A07 = null;
        A0X(false);
        A0W(false);
        C4S6 c4s6 = this.A02;
        if (c4s6 != null) {
            c4s6.A0C = false;
            C3Y7 c3y7 = c4s6.A08;
            if (c3y7 != null) {
                c3y7.B62();
                C3W4 Adr = c3y7.Adr();
                if (Adr != null && (A00 = Adr.A00()) != null) {
                    A00.setOnClickListener(null);
                }
            }
        }
        this.A01 = null;
        C4QW c4qw = this.A05;
        if (c4qw != null) {
            c4qw.EE4("fragment_paused");
        }
        this.A05 = null;
    }

    public final void A0Q(final FrameLayout frameLayout, final C75113Zb c75113Zb) {
        C4JD c4jd;
        C14360o3.A0B(frameLayout, 0);
        if (A0Y()) {
            c4jd = C4JD.A04;
        } else {
            c4jd = C4JD.A03;
        }
        A05(c4jd, this);
        Context context = this.A0H;
        int i = 2131963924;
        if (A0Y()) {
            i = 2131963925;
        }
        frameLayout.setContentDescription(context.getString(i));
        C0fQ.A00(new View.OnClickListener() { // from class: X.4JE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int A05 = C0f9.A05(-495543566);
                C30E c30e = this;
                c30e.A0T(C30E.A00(c30e), c75113Zb, -3);
                FrameLayout frameLayout2 = frameLayout;
                Context context2 = c30e.A0H;
                int i2 = 2131963924;
                if (c30e.A0Y()) {
                    i2 = 2131963925;
                }
                frameLayout2.setContentDescription(context2.getString(i2));
                C0f9.A0C(-236348929, A05);
            }
        }, frameLayout);
    }

    public final void A0R(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C3Y7 c3y7, C75113Zb c75113Zb, InterfaceC86303t2 interfaceC86303t2, int i) {
        C38321qM c38321qM2;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(interfaceC60442pS, 4);
        int i2 = c75113Zb.A03;
        InterfaceC38381qS A00 = C4QR.A00(c38321qM, i2);
        if (A00 instanceof C38321qM) {
            c38321qM2 = (C38321qM) A00;
        } else {
            c38321qM2 = null;
        }
        C4QW c4qw = this.A05;
        if (!A0D(c38321qM, this) || c38321qM2 == null || c38321qM2.Cff()) {
            C4S6 c4s6 = this.A02;
            if (c4s6 != null && c38321qM2 != null && c38321qM2.equals(c4s6.A00())) {
                if (c4qw == null) {
                    return;
                }
                if (this.A0j) {
                    if (!c4qw.isPlaying()) {
                        A07(this, "start", false, true);
                        return;
                    } else {
                        A0U("tapped");
                        return;
                    }
                }
                if (interfaceC86303t2 != null) {
                    if (!c38321qM.CdW() && AbstractC76273bX.A02(c38321qM)) {
                        interfaceC86303t2.D56(c3y7.BQt(), EnumC120795dP.A0s, interfaceC60442pS, c38321qM, c75113Zb);
                        InterfaceC61432r6 interfaceC61432r6 = this.A03;
                        if (interfaceC61432r6 == null) {
                            return;
                        }
                        interfaceC61432r6.DVi(C6T5.A00(), AnonymousClass317.A0W, c38321qM, c75113Zb);
                        return;
                    }
                    UserSession userSession = this.A0K;
                    if (C86833tv.A08(userSession, c38321qM, interfaceC60442pS.getModuleName(), true) || C86833tv.A07(userSession, c38321qM, interfaceC60442pS.getModuleName(), true)) {
                        interfaceC86303t2.Dyk(c3y7.BQt(), c38321qM, interfaceC60442pS, c75113Zb, C86833tv.A00(userSession, c38321qM, interfaceC60442pS.getModuleName(), false));
                        return;
                    }
                }
            } else {
                Iterator it = this.A0P.iterator();
                while (it.hasNext()) {
                    ((C30B) it.next()).DsL(c38321qM, c3y7, c75113Zb);
                }
                A0S(c38321qM, interfaceC60442pS, c3y7, new C4QP(false, false, false, C4QO.A00(this.A0K)), i, i2, c75113Zb.A01(), c75113Zb.A21, c75113Zb.A2G);
                A0K();
                return;
            }
        }
        A0T(c38321qM, c75113Zb, -1);
    }

    public final void A0S(final C38321qM c38321qM, final InterfaceC60442pS interfaceC60442pS, final C3Y7 c3y7, final C4QP c4qp, final int i, final int i2, final int i3, final boolean z, boolean z2) {
        final C38321qM c38321qM2;
        C38321qM A00;
        String str;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(interfaceC60442pS, 7);
        InterfaceC38381qS A002 = C4QR.A00(c38321qM, i2);
        if (A002 instanceof C38321qM) {
            c38321qM2 = (C38321qM) A002;
        } else {
            c38321qM2 = null;
        }
        if (A0J() != C3Q0.STOPPING && c38321qM2 != null && !c38321qM2.A5n()) {
            UserSession userSession = this.A0K;
            if (!c38321qM2.A6d(userSession)) {
                if (!c38321qM2.A6d(userSession)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Media ID: ");
                    String id = c38321qM2.getId();
                    if (id == null) {
                        id = "null";
                    }
                    sb.append(id);
                    sb.append(", type: ");
                    sb.append(c38321qM2.BRp());
                    sb.append(", carousel index: ");
                    sb.append(i2);
                    sb.append(", host media ID: ");
                    sb.append(c38321qM.getId());
                    sb.append(", host media type: ");
                    sb.append(c38321qM.BRp());
                    if (c38321qM.A5M()) {
                        sb.append(", children of host media: ");
                        int A0p = c38321qM.A0p();
                        for (int i4 = 0; i4 < A0p; i4++) {
                            C38321qM A1e = c38321qM.A1e(i4);
                            sb.append("(");
                            if (A1e == null || (str = A1e.getId()) == null) {
                                str = "null";
                            }
                            sb.append(str);
                            sb.append(", ");
                            if (A1e != null) {
                                sb.append(A1e.BRp());
                                sb.append(")");
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                    }
                    C4S6 c4s6 = this.A02;
                    if (c4s6 != null && (A00 = c4s6.A00()) != null) {
                        sb.append(", current media of video meta data: ");
                        sb.append(A00.getId());
                    }
                    C0f5 AEp = C18950wb.A01.AEp("FeedVideoPlayer_PrepareNonVideoMedia", 817899586);
                    AEp.ABW(DialogModule.KEY_MESSAGE, sb.toString());
                    AEp.report();
                    return;
                }
                return;
            }
            this.A07 = null;
            boolean z3 = false;
            this.A0G = false;
            C4QW c4qw = this.A05;
            final C4QW c4qw2 = c4qw;
            if (c4qw == null) {
                C4QT A003 = C4QS.A00(this.A0H, userSession, this.A0L, this, interfaceC60442pS.getModuleName());
                A003.A0Z = false;
                A003.ERX(this.A0A);
                A003.EYb(this.A0U);
                Iterator it = this.A0O.iterator();
                C14360o3.A07(it);
                if (it.hasNext()) {
                    C14360o3.A07(it.next());
                    A003.A10.add(null);
                    throw new NullPointerException("onStateChanged");
                }
                this.A05 = A003;
                c4qw2 = A003;
            }
            C4QT c4qt = (C4QT) c4qw2;
            c4qt.A0W = this.A0i;
            C4S6 c4s62 = this.A02;
            if (c4s62 != null && Math.abs(((C4S7) c4s62).A01 - i) == 1) {
                z3 = true;
            }
            A0V("scroll", true, z3);
            this.A0C = z;
            this.A0F = z2;
            Runnable runnable = new Runnable() { // from class: X.4S4
                /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
                
                    if (X.C30E.A0F(r10) == false) goto L6;
                 */
                /* JADX WARN: Type inference failed for: r2v2, types: [X.4SB, java.lang.Object] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r20 = this;
                        r5 = r20
                        X.1qM r2 = X.C38321qM.this
                        X.3Y7 r6 = r4
                        X.3Zb r1 = r6.BRY()
                        X.30E r10 = r5
                        com.instagram.common.session.UserSession r0 = r10.A0K
                        boolean r0 = X.C4S5.A00(r0, r2, r1)
                        r9 = 0
                        if (r0 == 0) goto L1c
                        boolean r0 = X.C30E.A0F(r10)
                        r8 = 1
                        if (r0 != 0) goto L1d
                    L1c:
                        r8 = 0
                    L1d:
                        X.1qM r13 = r2
                        int r2 = r8
                        int r1 = r9
                        int r4 = r10
                        boolean r0 = r11
                        X.2pS r7 = r3
                        X.4S6 r12 = new X.4S6
                        r14 = r7
                        r15 = r2
                        r16 = r1
                        r17 = r4
                        r18 = r8
                        r19 = r0
                        r12.<init>(r13, r14, r15, r16, r17, r18, r19)
                        r10.A02 = r12
                        boolean r0 = r13.CdW()
                        if (r0 != 0) goto L44
                        X.4S6 r0 = r10.A02
                        r10.A01 = r0
                    L44:
                        r12.A08 = r6
                        X.3Zb r0 = r6.BRY()
                        r12.A09 = r0
                        r12.A01(r8)
                        X.3Vo r1 = r6.B62()
                        if (r1 == 0) goto L5a
                        java.lang.Integer r0 = X.C05F.A00
                        r1.AJM(r0, r9, r9)
                    L5a:
                        X.3Vo r0 = r6.B62()
                        if (r0 == 0) goto L63
                        r0.setVisibility(r9)
                    L63:
                        android.content.Context r0 = r10.A0H
                        r6.CFi()
                        r3 = 1
                        X.C14360o3.A0B(r0, r3)
                        X.4SB r2 = new X.4SB
                        r2.<init>()
                        android.content.res.Resources r1 = r0.getResources()
                        r0 = 2131165207(0x7f070017, float:1.7944625E38)
                        r1.getDimensionPixelSize(r0)
                        r0 = 2131165271(0x7f070057, float:1.7944754E38)
                        r1.getDimensionPixelSize(r0)
                        r0 = 2131165289(0x7f070069, float:1.794479E38)
                        r1.getDimensionPixelSize(r0)
                        r10.A04 = r2
                        boolean r0 = X.C30E.A0D(r13, r10)
                        if (r0 == 0) goto L9a
                        X.3Vo r1 = r6.B62()
                        if (r1 == 0) goto L9a
                        X.3Vt r0 = X.EnumC74373Vt.A07
                        r1.setVideoIconState(r0)
                    L9a:
                        X.1qM r2 = r12.A00()
                        r10.A0B = r9
                        X.4QW r1 = r7
                        r13 = 0
                        if (r2 == 0) goto Lcf
                        X.3a3 r11 = r2.CFR()
                    La9:
                        X.3Ww r9 = r6.C6y()
                        r15 = 0
                        if (r8 == 0) goto Lb2
                        r15 = 1065353216(0x3f800000, float:1.0)
                    Lb2:
                        java.lang.String r14 = r7.getModuleName()
                        r0 = 6
                        X.C14360o3.A0B(r14, r0)
                        if (r2 == 0) goto Lbe
                        java.lang.String r13 = r2.A0M
                    Lbe:
                        int r16 = r6.C6z()
                        X.4QP r10 = r6
                        X.4SC r8 = new X.4SC
                        r18 = r3
                        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                        r1.E5v(r8)
                        return
                    Lcf:
                        r11 = r13
                        goto La9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C4S4.run():void");
                }
            };
            this.A07 = runnable;
            if (c4qt.A0M == C3Q0.IDLE) {
                runnable.run();
                this.A07 = null;
            }
        }
    }

    public final void A0T(C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C4S6 c4s6;
        C3Y7 c3y7;
        int i2;
        boolean z = false;
        if (i == -1) {
            z = true;
        }
        if (A0Y()) {
            A0N(i);
            if (A0D(c38321qM, this)) {
                A0U("paused_for_music_audio_off");
            }
        } else if (C4S5.A00(this.A0K, c38321qM, c75113Zb)) {
            A0O(i);
            if (A0D(c38321qM, this)) {
                A0M();
            }
        } else {
            A01();
        }
        if (z && (c4s6 = this.A02) != null && (c3y7 = c4s6.A08) != null) {
            boolean A00 = C4S5.A00(this.A0K, c38321qM, c75113Zb);
            boolean z2 = !A0Y();
            C86083sf B61 = c3y7.B61();
            if (B61 != null) {
                if (!A00) {
                    i2 = R.drawable.instagram_volume_none_pano_filled_24;
                } else {
                    i2 = R.drawable.instagram_volume_pano_filled_24;
                    if (z2) {
                        i2 = R.drawable.instagram_volume_off_pano_filled_24;
                    }
                }
                B61.A02(i2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if ("bottom_sheet".equals(r5) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0U(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 0
            r4.A0B(r3)
            X.4S6 r0 = r4.A02
            if (r0 == 0) goto L37
            X.3Y7 r1 = r0.A08
            if (r1 == 0) goto L37
            java.lang.String r0 = "scroll"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "tapped"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "paused_for_music_audio_off"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L2c
            java.lang.String r0 = "long_pressed_persistent_pause"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L37
        L2c:
            X.3Vo r1 = r1.B62()
            if (r1 == 0) goto L37
            r0 = 8
            r1.setVisibility(r0)
        L37:
            X.4QW r0 = r4.A05
            if (r0 == 0) goto L6d
            r0.E3d(r5)
            java.lang.String r0 = "fragment_paused"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L4f
            java.lang.String r0 = "bottom_sheet"
            boolean r0 = r0.equals(r5)
            r2 = 0
            if (r0 == 0) goto L50
        L4f:
            r2 = 1
        L50:
            boolean r0 = r4.A0S
            if (r0 == 0) goto L6d
            X.1qM r0 = A00(r4)
            r1 = 1
            if (r0 == 0) goto L6d
            boolean r0 = r0.CdW()
            if (r0 != r1) goto L6d
            if (r2 == 0) goto L6d
            boolean r0 = r4.A0C
            if (r0 == 0) goto L6a
            r4.A02()
        L6a:
            r4.A0W(r3)
        L6d:
            X.1vI r0 = r4.A0J
            r0.A03(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30E.A0U(java.lang.String):void");
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        float f;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        return;
                    } else {
                        f = 1.0f;
                    }
                } else {
                    A0N(0);
                    return;
                }
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.5f;
        }
        C4QW c4qw = this.A05;
        if (c4qw == null) {
            return;
        }
        if (this.A0D) {
            f = 0.0f;
        }
        c4qw.EhI(f, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008a, code lost:
    
        if (r10 == 24) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
    
        if (r1.getStreamVolume(3) > 0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKey(android.view.View r9, int r10, android.view.KeyEvent r11) {
        /*
            r8 = this;
            r0 = 2
            X.C14360o3.A0B(r11, r0)
            X.4QW r0 = r8.A05
            if (r0 == 0) goto L26
            X.4QT r0 = (X.C4QT) r0
            X.3Q0 r1 = r0.A0M
        Lc:
            X.3Q0 r0 = X.C3Q0.PLAYING
            r4 = 0
            if (r1 != r0) goto L25
            int r0 = r11.getAction()
            if (r0 != 0) goto L25
            X.4S6 r0 = r8.A02
            if (r0 == 0) goto L25
            boolean r5 = r0.A00
            r6 = 24
            r7 = 25
            if (r10 == r7) goto L28
            if (r10 == r6) goto L28
        L25:
            return r4
        L26:
            r1 = 0
            goto Lc
        L28:
            X.1qM r2 = r0.A00()
            if (r2 == 0) goto L49
            com.instagram.common.session.UserSession r1 = r8.A0K
            boolean r0 = r2.A5N()
            if (r0 == 0) goto L49
            boolean r0 = r2.Cff()
            if (r0 == 0) goto L49
            boolean r0 = X.C41E.A00(r1, r2)
            if (r0 == 0) goto L49
            boolean r0 = X.C36A.A07(r1)
            if (r0 == 0) goto L49
            return r4
        L49:
            r3 = 1
            if (r5 == 0) goto L52
            if (r10 != r7) goto L88
            r5 = 1
            r4 = 1
        L50:
            r2 = -1
            goto L8d
        L52:
            X.1qM r1 = A00(r8)
            X.3Zb r0 = r8.A0H()
            com.instagram.common.session.UserSession r5 = r8.A0K
            boolean r0 = X.C4S5.A00(r5, r1, r0)
            if (r0 == 0) goto L85
            if (r10 != r7) goto L81
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36328821959442234(0x8110df00003f3a, double:3.037831519351139E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L75
            r5 = 0
            goto L50
        L75:
            android.media.AudioManager r1 = r8.A0X
            X.C14360o3.A0B(r1, r4)
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            if (r0 <= 0) goto L88
        L81:
            r8.A0O(r10)
            goto L88
        L85:
            r8.A01()
        L88:
            r5 = 1
            r2 = 1
            if (r10 == r6) goto L8d
            goto L50
        L8d:
            android.media.AudioManager r1 = r8.A0X     // Catch: java.lang.SecurityException -> L94
            r0 = 3
            r1.adjustStreamVolume(r0, r2, r3)     // Catch: java.lang.SecurityException -> L94
            goto La2
        L94:
            X.0wb r2 = X.C18950wb.A01
            r1 = 817890849(0x30c00621, float:1.3971581E-9)
            java.lang.String r0 = "feed_video_crash_when_adjusting_volume"
            X.0f5 r0 = r2.AEp(r0, r1)
            r0.report()
        La2:
            if (r4 == 0) goto Lb4
            android.media.AudioManager r1 = r8.A0X
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = 3
            int r0 = r1.getStreamVolume(r0)
            if (r0 != 0) goto Lb4
            r8.A0N(r10)
        Lb4:
            boolean r0 = r8.A0g
            if (r0 == 0) goto Lbc
            if (r5 == 0) goto Lbc
            r8.A0G = r3
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30E.onKey(android.view.View, int, android.view.KeyEvent):boolean");
    }

    public static final C38321qM A00(C30E c30e) {
        C4S6 c4s6 = c30e.A02;
        if (c4s6 != null) {
            return (C38321qM) ((C4S7) c4s6).A03;
        }
        return null;
    }

    private final void A02() {
        C4QW c4qw;
        C38321qM A00;
        int i;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null && (c4qw = this.A05) != null && (A00 = A00(this)) != null) {
            UserSession userSession = this.A0K;
            Context context = this.A0H;
            int currentPositionMs = c4qw.getCurrentPositionMs();
            int i2 = c4s6.A07;
            int Azm = c4qw.Azm();
            int i3 = ((C4S7) c4s6).A01;
            int i4 = c4s6.A0D;
            C4SE c4se = ((C4QT) c4qw).A0O;
            if (c4se == null) {
                i = -1;
            } else {
                i = c4se.A01;
            }
            C133145zg.A01(context, userSession, A00, c4s6.A0E, currentPositionMs, i2, Azm, i3, i4, i - c4s6.A06, ((C4S7) c4s6).A00);
        }
    }

    public static final void A03(C38321qM c38321qM, C75113Zb c75113Zb, C30E c30e) {
        C4S6 c4s6;
        C30R c30r;
        if (C4S5.A00(c30e.A0K, c38321qM, c75113Zb)) {
            if (c30e.A05 != null && (c4s6 = c30e.A02) != null) {
                if (A0E(c38321qM, c30e)) {
                    c30r = c30e.A0e;
                } else {
                    c30r = c30e.A0d;
                }
                if (((C4S7) c4s6).A00) {
                    c30e.A0A(c30r, R.drawable.instagram_volume_pano_filled_24, false);
                    A05(C4JD.A04, c30e);
                    return;
                } else {
                    c30e.A09(c30r);
                    return;
                }
            }
            return;
        }
        c30e.A01();
    }

    public static final void A05(C4JD c4jd, C30E c30e) {
        Iterator it = c30e.A0Q.iterator();
        while (it.hasNext()) {
            ((MP5) it.next()).Cy7(c4jd);
        }
    }

    public static final void A06(C30E c30e, int i, boolean z) {
        if (z) {
            float f = 1.0f;
            C4QW c4qw = c30e.A05;
            if (c4qw != null) {
                if (c30e.A0D) {
                    f = 0.0f;
                }
                c4qw.EhI(f, i);
            }
            c30e.A0J.A04(c30e);
            return;
        }
        C4QW c4qw2 = c30e.A05;
        if (c4qw2 != null) {
            c4qw2.EhI(0.0f, i);
        }
        c30e.A0J.A03(c30e);
    }

    public static final void A08(C30E c30e, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        InterfaceC80343iO interfaceC80343iO;
        C4S6 c4s6 = c30e.A02;
        if (c4s6 != null) {
            C3Y7 c3y7 = c4s6.A08;
            if (c3y7 != null) {
                interfaceC80343iO = c3y7.BRd();
            } else {
                interfaceC80343iO = null;
            }
            if (((Boolean) interfaceC16620sF.invoke(c30e.A0G(), Boolean.valueOf(((C4S7) c4s6).A00))).booleanValue()) {
                if (interfaceC80343iO != null) {
                    interfaceC80343iO.EhE(true);
                }
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                    return;
                }
                return;
            }
            if (interfaceC80343iO == null) {
                return;
            }
            interfaceC80343iO.EhE(false);
        }
    }

    private final void A0A(C30R c30r, int i, boolean z) {
        C3Y7 c3y7;
        C3W4 Adr;
        SlideInAndOutIconView A01;
        float f;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null && (c3y7 = c4s6.A08) != null && (Adr = c3y7.Adr()) != null && (A01 = Adr.A01()) != null) {
            Resources resources = A01.getContext().getResources();
            A01.setTextSize(resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size));
            TitleTextView titleTextView = A01.A0C;
            int lineHeight = titleTextView.getLineHeight() + (resources.getDimensionPixelSize(R.dimen.media_tag_indicator_padding) * 2);
            int lineHeight2 = (titleTextView.getLineHeight() - resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size)) / 2;
            Context context = this.A0H;
            if (z) {
                AnonymousClass693 A00 = C68U.A00(context, i);
                if (A00 != null) {
                    A00.EH1();
                    A00.E4S();
                }
                A01.A03(A00, lineHeight, lineHeight);
                f = 1.0f;
            } else {
                A01.A03(context.getDrawable(i), lineHeight, lineHeight);
                A01.A0B.setPadding(lineHeight2, lineHeight2, lineHeight2, lineHeight2);
                A01.setIconColor(context.getColor(R.color.design_dark_default_color_on_background));
                f = 0.5f;
            }
            A01.setIconScale(f);
            A01.setIconColor(context.getColor(R.color.design_dark_default_color_on_background));
            C75113Zb A0H = A0H();
            if (A0H != null) {
                A0H.A0H(null, c30r, i);
            }
        }
    }

    private final void A0B(boolean z) {
        C3Y7 c3y7;
        C75113Zb A0H;
        C75113Zb A0H2;
        C3W4 Adr;
        float f;
        float f2;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null) {
            c3y7 = c4s6.A08;
        } else {
            c3y7 = null;
        }
        if (A0C() && c3y7 != null && (Adr = c3y7.Adr()) != null) {
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            if (Adr.A01().getAlpha() != f) {
                Adr.A01().setAlpha(f2);
                Adr.A01().animate().alpha(f).setDuration(200L).start();
            }
        }
        if (A0C() && (A0H2 = A0H()) != null && A0H2.A1w != z) {
            A0H2.A1w = z;
            C75113Zb.A00(A0H2, 40);
        }
        if (A0C()) {
            A08(this, null, new DS9(15, this, z));
        }
        if (A0C() && (A0H = A0H()) != null && A0H.A1u != z) {
            A0H.A1u = z;
            C75113Zb.A00(A0H, 51);
        }
    }

    public static final boolean A0D(C38321qM c38321qM, C30E c30e) {
        if (c38321qM != null) {
            UserSession userSession = c30e.A0K;
            if ((AbstractC76273bX.A01(userSession, c38321qM) || AbstractC76273bX.A00(userSession, c38321qM)) && c38321qM.CFR().A0U) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A00, 36322778940451357L) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (X.AbstractC76273bX.A02(r6) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0E(X.C38321qM r6, X.C30E r7) {
        /*
            if (r6 == 0) goto Lf
            boolean r0 = r6.CdW()
            if (r0 != 0) goto Lf
            boolean r1 = X.AbstractC76273bX.A02(r6)
            r0 = 1
            if (r1 != 0) goto L10
        Lf:
            r0 = 0
        L10:
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L68
            X.2pS r2 = r7.A0Z
            java.lang.String r0 = r2.getModuleName()
            com.instagram.common.session.UserSession r1 = r7.A0K
            boolean r0 = X.C86833tv.A07(r1, r6, r0, r3)
            if (r0 != 0) goto L68
            java.lang.String r0 = r2.getModuleName()
            boolean r0 = X.C86833tv.A08(r1, r6, r0, r3)
            if (r0 != 0) goto L68
            boolean r0 = A0D(r6, r7)
            if (r0 != 0) goto L68
            if (r6 == 0) goto L69
            boolean r0 = r6.CdW()
            if (r0 != r4) goto L69
            X.2kL r5 = r7.A0b
            boolean r0 = r6.A5w()
            if (r0 != 0) goto L51
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36322778940451357(0x810b6000002a1d, double:3.034009889808024E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L68
        L51:
            com.instagram.api.schemas.IGPostTriggerExperience r0 = com.instagram.api.schemas.IGPostTriggerExperience.A07
            boolean r0 = r6.A6W(r0)
            if (r0 != 0) goto L68
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36321937127384993(0x810a9c000827a1, double:3.0334775238351464E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L69
        L68:
            return r4
        L69:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30E.A0E(X.1qM, X.30E):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r4.A08 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A0F(X.C30E r4) {
        /*
            boolean r0 = r4.A0g
            r3 = 0
            if (r0 != 0) goto Le
            boolean r0 = r4.A0G
            if (r0 != 0) goto Le
            boolean r0 = r4.A08
            r2 = 0
            if (r0 == 0) goto Lf
        Le:
            r2 = 1
        Lf:
            com.instagram.common.session.UserSession r1 = r4.A0K
            X.1Hd r0 = X.AbstractC24321Hb.A00(r1)
            java.lang.Boolean r0 = r0.A01
            if (r0 == 0) goto L1d
            boolean r2 = r0.booleanValue()
        L1d:
            if (r2 == 0) goto L2e
            X.5in r0 = X.AbstractC123725im.A00(r1)
            X.7DK r0 = r0.A00
            if (r0 == 0) goto L2d
            boolean r0 = r0.A0C()
            if (r0 != 0) goto L2e
        L2d:
            r3 = 1
        L2e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30E.A0F(X.30E):boolean");
    }

    public final C75113Zb A0H() {
        C3Y7 c3y7;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null && (c3y7 = c4s6.A08) != null) {
            return c3y7.BRY();
        }
        return null;
    }

    public final C3Q0 A0J() {
        C3Q0 c3q0;
        C4QW c4qw = this.A05;
        if (c4qw == null || (c3q0 = ((C4QT) c4qw).A0M) == null) {
            return C3Q0.IDLE;
        }
        return c3q0;
    }

    public final void A0K() {
        C4JD c4jd;
        C4ZF c4zf;
        if (!this.A0B && this.A02 != null) {
            if (A0Y()) {
                c4jd = C4JD.A04;
            } else {
                c4jd = C4JD.A03;
            }
            A05(c4jd, this);
            this.A0B = true;
            C75113Zb A0H = A0H();
            if (A0H != null && A0H.A30 && (c4zf = A0H.A0s) != null) {
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
                c4zf.A03 = duration;
                duration.setStartDelay(0L);
                ValueAnimator valueAnimator = c4zf.A03;
                ValueAnimator.AnimatorUpdateListener animatorUpdateListener = c4zf.A01;
                if (animatorUpdateListener == null) {
                    animatorUpdateListener = new C48002LLx(c4zf);
                    c4zf.A01 = animatorUpdateListener;
                }
                valueAnimator.addUpdateListener(animatorUpdateListener);
                ValueAnimator valueAnimator2 = c4zf.A03;
                AbstractC87373uv abstractC87373uv = c4zf.A06;
                if (abstractC87373uv == null) {
                    abstractC87373uv = new C46070KaR(c4zf);
                    c4zf.A06 = abstractC87373uv;
                }
                valueAnimator2.addListener(abstractC87373uv);
                c4zf.A03.start();
            }
        }
    }

    public final void A0M() {
        A07(this, "start", false, false);
    }

    public final void A0N(int i) {
        C30R c30r;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null) {
            c4s6.A01(false);
        }
        if (i != -5 && i != -7) {
            AbstractC24321Hb.A00(this.A0K).A00(false);
        }
        A06(this, i, false);
        if (A0E(A00(this), this)) {
            c30r = C30R.A0C;
        } else {
            c30r = C30R.A0B;
        }
        C14360o3.A0A(c30r);
        A09(c30r);
        C75113Zb A0H = A0H();
        if (A0H != null) {
            A0H.A31 = false;
        }
    }

    public final void A0O(int i) {
        C30R c30r;
        UserSession userSession = this.A0K;
        AbstractC123725im.A00(userSession).A02(true);
        C4S6 c4s6 = this.A02;
        if (c4s6 != null) {
            c4s6.A01(true);
        }
        if (i != -5 && i != -7) {
            AbstractC24321Hb.A00(userSession).A00(true);
        }
        A06(this, i, true);
        C75113Zb A0H = A0H();
        if (A0H != null) {
            A0H.A31 = true;
        }
        if (A0E(A00(this), this)) {
            c30r = C30R.A0C;
        } else {
            c30r = C30R.A0B;
        }
        C14360o3.A0A(c30r);
        A0A(c30r, R.drawable.instagram_volume_pano_filled_24, false);
        A05(C4JD.A04, this);
    }

    public final void A0P(int i) {
        C38321qM A00;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null && (A00 = A00(this)) != null && A00.CdW()) {
            if (this.A0C) {
                c4s6.A07 = i;
            }
            if (this.A0F) {
                c4s6.A03 = i;
            }
        }
        C4QW c4qw = this.A05;
        if (c4qw != null) {
            c4qw.EMg(i, true);
        }
        A07(this, "start", true, false);
    }

    public final void A0V(final String str, final boolean z, boolean z2) {
        int i;
        final C4S6 c4s6 = this.A02;
        if (c4s6 != null) {
            if (str.equals("scroll")) {
                C11T.A02(new Runnable() { // from class: X.5iW
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC74323Vo B62;
                        C3Y7 c3y7 = C4S6.this.A08;
                        if (c3y7 != null && (B62 = c3y7.B62()) != null) {
                            B62.setVisibility(8);
                        }
                    }
                });
            }
            c4s6.A0C = z2;
            C38321qM A00 = A00(this);
            C4QW c4qw = this.A05;
            if (A00 != null && A00.CdW() && this.A0C && c4qw != null) {
                C4QT c4qt = (C4QT) c4qw;
                if (C4QT.A1M.contains(c4qt.A0M)) {
                    int currentPositionMs = c4qw.getCurrentPositionMs();
                    int Azm = c4qw.Azm();
                    C4SE c4se = c4qt.A0O;
                    if (c4se == null) {
                        i = -1;
                    } else {
                        i = c4se.A01;
                    }
                    int i2 = i - c4s6.A02;
                    boolean z3 = ((C4S7) c4s6).A00;
                    UserSession userSession = this.A0K;
                    Context context = this.A0H;
                    int i3 = c4s6.A07;
                    int i4 = ((C4S7) c4s6).A01;
                    int i5 = c4s6.A0D;
                    InterfaceC60442pS interfaceC60442pS = c4s6.A0E;
                    C133145zg.A01(context, userSession, A00, interfaceC60442pS, currentPositionMs, i3, Azm, i4, i5, i2, z3);
                    C133145zg.A00(context, userSession, A00, interfaceC60442pS, currentPositionMs, c4s6.A03, Azm, i4, i5, i2, z3);
                }
            }
        }
        final C4QW c4qw2 = this.A05;
        if (c4qw2 != null) {
            C11T.A07(false, new Runnable() { // from class: X.4S3
                @Override // java.lang.Runnable
                public final void run() {
                    C4QW.this.Eol(str, z);
                }
            });
        }
    }

    public final void A0W(boolean z) {
        C4QW c4qw;
        int i;
        C4QW c4qw2;
        C38321qM A00;
        int i2;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null && (c4qw = this.A05) != null) {
            C38321qM A002 = A00(this);
            if (A002 != null && A002.CdW() && this.A0F && !z && C4QT.A1M.contains(((C4QT) c4qw).A0M)) {
                C4S6 c4s62 = this.A02;
                if (c4s62 != null && (c4qw2 = this.A05) != null && (A00 = A00(this)) != null) {
                    UserSession userSession = this.A0K;
                    Context context = this.A0H;
                    int currentPositionMs = c4qw2.getCurrentPositionMs();
                    int i3 = c4s62.A03;
                    int Azm = c4qw2.Azm();
                    int i4 = ((C4S7) c4s62).A01;
                    int i5 = c4s62.A0D;
                    C4SE c4se = ((C4QT) c4qw2).A0O;
                    if (c4se == null) {
                        i2 = -1;
                    } else {
                        i2 = c4se.A01;
                    }
                    C133145zg.A00(context, userSession, A00, c4s62.A0E, currentPositionMs, i3, Azm, i4, i5, i2 - c4s62.A02, ((C4S7) c4s62).A00);
                }
            } else if (!this.A0F && z) {
                c4s6.A03 = c4qw.getCurrentPositionMs();
                C4SE c4se2 = ((C4QT) c4qw).A0O;
                if (c4se2 == null) {
                    i = -1;
                } else {
                    i = c4se2.A01;
                }
                c4s6.A02 = i;
            }
        }
        this.A0F = z;
    }

    public final void A0X(boolean z) {
        C4QW c4qw;
        boolean contains;
        int i;
        C4S6 c4s6 = this.A02;
        if (c4s6 != null && (c4qw = this.A05) != null) {
            if (this.A0h) {
                contains = c4qw.isPlaying();
            } else {
                contains = C4QT.A1M.contains(((C4QT) c4qw).A0M);
            }
            C38321qM A00 = A00(this);
            if (A00 != null && A00.CdW() && this.A0C && !z && contains) {
                A02();
            } else if (!this.A0C && z) {
                c4s6.A07 = c4qw.getCurrentPositionMs();
                C4SE c4se = ((C4QT) c4qw).A0O;
                if (c4se == null) {
                    i = -1;
                } else {
                    i = c4se.A01;
                }
                c4s6.A06 = i;
            }
        }
        this.A0C = z;
    }

    public final boolean A0Y() {
        C4S6 c4s6 = this.A02;
        if (c4s6 != null && ((C4S7) c4s6).A00) {
            return true;
        }
        return false;
    }

    public final boolean A0Z() {
        if (C3Q3.A00(this.A0K).A00() && !AbstractC56862jK.A00(this.A0H)) {
            return false;
        }
        return true;
    }

    public final boolean A0a(C38321qM c38321qM) {
        if (c38321qM != null) {
            C57462kL c57462kL = this.A0b;
            ((C30P) this.A0L).A00.getModuleName();
            if (c57462kL.A05(c38321qM) || A0D(c38321qM, this)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        if (r6 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r8 = this;
            X.3Zb r0 = r8.A0H()
            X.1qM r6 = A00(r8)
            if (r0 == 0) goto La6
            X.4ZF r0 = r0.A0s
            if (r0 == 0) goto La2
            X.4Cv r1 = r0.A05
            X.C14360o3.A0A(r1)
        L13:
            X.4Cv r0 = X.EnumC92614Cv.STOPPED
            if (r1 == r0) goto La6
            android.widget.Toast r0 = r8.A00
            if (r0 != 0) goto La6
            androidx.fragment.app.Fragment r3 = r8.A0Y
            if (r3 == 0) goto L66
            if (r6 == 0) goto L83
            com.instagram.common.session.UserSession r5 = r8.A0K
            boolean r0 = X.C2TN.A02(r5, r6)
            if (r0 == 0) goto L68
            boolean r0 = X.OXs.A02(r5, r6)
            if (r0 == 0) goto L68
            r7 = 0
            X.C14360o3.A0B(r5, r7)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36323466136726814(0x810c0000172d1e, double:3.0344444754997404E-306)
            boolean r0 = X.C18U.A06(r2, r5, r0)
            if (r0 == 0) goto L68
            android.content.Context r2 = r8.A0H
            X.2pS r4 = r8.A0Z
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.OXs.A00(r1, r2, r3, r4, r5, r6, r7)
        L4b:
            r2 = 2131239059(0x7f082093, float:1.8094414E38)
            boolean r0 = A0E(r6, r8)
            if (r0 == 0) goto L63
            X.30R r1 = X.C30R.A08
        L56:
            X.C14360o3.A0A(r1)
            r0 = 0
            r8.A0A(r1, r2, r0)
            X.4JD r0 = X.C4JD.A02
            A05(r0, r8)
            return
        L63:
            X.30R r1 = X.C30R.A07
            goto L56
        L66:
            if (r6 == 0) goto L83
        L68:
            com.instagram.common.session.UserSession r1 = r8.A0K
            boolean r0 = X.C2TN.A02(r1, r6)
            if (r0 != 0) goto L83
            boolean r0 = X.AbstractC76643c9.A0G(r1, r6)
            if (r0 == 0) goto L83
            X.30S r3 = r8.A0c
            android.content.Context r2 = r8.A0H
            java.lang.String r1 = X.AbstractC76643c9.A03(r2, r1, r6)
            r0 = 1
            r3.A00(r2, r1, r0)
            goto L4b
        L83:
            com.instagram.common.session.UserSession r1 = r8.A0K
            boolean r0 = X.AbstractC76643c9.A0H(r1, r6)
            if (r0 == 0) goto L98
            java.lang.String r3 = X.AbstractC76643c9.A08(r1, r6)
        L8f:
            android.content.Context r2 = r8.A0H
            r1 = 0
            r0 = 0
            android.widget.Toast r0 = X.C9GR.A00(r2, r3, r1, r0)
            goto Lae
        L98:
            android.content.Context r1 = r8.A0H
            r0 = 2131968899(0x7f134383, float:1.9574706E38)
            java.lang.String r3 = r1.getString(r0)
            goto L8f
        La2:
            X.4Cv r1 = X.EnumC92614Cv.STOPPED
            goto L13
        La6:
            android.widget.Toast r0 = r8.A00
            if (r0 == 0) goto Lad
            r0.cancel()
        Lad:
            r0 = 0
        Lae:
            r8.A00 = r0
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30E.A01():void");
    }

    public static final void A04(C38321qM c38321qM, C30E c30e, InterfaceC74323Vo interfaceC74323Vo, EnumC74373Vt enumC74373Vt) {
        if (c30e.A0a(c38321qM) && enumC74373Vt != EnumC74373Vt.A0B) {
            interfaceC74323Vo.setVideoIconState(EnumC74373Vt.A06);
        } else {
            interfaceC74323Vo.setVideoIconState(enumC74373Vt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r6.A0K, 36327589303827147L) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r0 == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A09(X.C30R r7) {
        /*
            r6 = this;
            X.1qM r0 = A00(r6)
            r5 = 1
            if (r0 == 0) goto L36
            boolean r0 = r0.A5w()
            if (r0 != r5) goto L36
        Ld:
            r4 = 2131239065(0x7f082099, float:1.8094426E38)
        L10:
            X.1qM r0 = A00(r6)
            if (r0 == 0) goto L26
            boolean r0 = r0.A5w()
            if (r0 != r5) goto L26
        L1c:
            r5 = 0
        L1d:
            r6.A0A(r7, r4, r5)
            X.4JD r0 = X.C4JD.A03
            A05(r0, r6)
            return
        L26:
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327589303827147(0x810fc000003acb, double:3.0370519829766523E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L1c
            goto L1d
        L36:
            com.instagram.common.session.UserSession r3 = r6.A0K
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36327589303827147(0x810fc000003acb, double:3.0370519829766523E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r4 = 2131886082(0x7f120002, float:1.9406733E38)
            if (r0 != 0) goto L10
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30E.A09(X.30R):void");
    }

    private final boolean A0C() {
        C38321qM A0G = A0G();
        if (A0G != null && this.A0b.A06(A0G, ((C30P) this.A0L).A00.getModuleName())) {
            return true;
        }
        return false;
    }

    public final C38321qM A0G() {
        Object obj;
        C4S6 c4s6;
        C0UO A00 = C3Q1.A00();
        if (A00 != null) {
            obj = A00.getValue();
        } else {
            obj = null;
        }
        if (obj == C3Q2.A02 || (c4s6 = this.A02) == null) {
            return null;
        }
        return c4s6.A00();
    }

    public final EnumC74373Vt A0I(C38321qM c38321qM) {
        C38321qM c38321qM2;
        if (!c38321qM.Cff()) {
            return EnumC74373Vt.A05;
        }
        if (!A0a(c38321qM)) {
            C4QW c4qw = this.A05;
            C4S6 c4s6 = this.A02;
            if (c4s6 != null) {
                c38321qM2 = c4s6.A00();
            } else {
                c38321qM2 = null;
            }
            if (!c38321qM.equals(c38321qM2)) {
                if (c4qw != null && c4qw.isPlaying()) {
                    return EnumC74373Vt.A0A;
                }
                if (this.A0W) {
                    return EnumC74373Vt.A03;
                }
                return EnumC74373Vt.A02;
            }
            if (c4qw != null && C4QT.A1M.contains(((C4QT) c4qw).A0M)) {
                if (c38321qM.A5P() && !c38321qM.CdW() && AbstractC76273bX.A02(c38321qM)) {
                    return EnumC74373Vt.A04;
                }
            } else {
                if (this.A0W) {
                    return EnumC74373Vt.A09;
                }
                return EnumC74373Vt.A08;
            }
        }
        return EnumC74373Vt.A06;
    }
}
