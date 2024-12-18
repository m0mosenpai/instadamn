package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import com.instagram.user.model.User;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.30F, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C30F implements C30G {
    @Override // X.C30G
    public void onSeeking(long j) {
    }

    @Override // X.C30G
    public void onCompletion() {
        if (this instanceof C30E) {
            Iterator it = ((C30E) this).A0R.iterator();
            while (it.hasNext()) {
                ((C33Q) it.next()).Dyw();
            }
        }
    }

    @Override // X.C30G
    public void onCues(List list) {
        C3Y7 c3y7;
        C38321qM c38321qM;
        String str;
        if (this instanceof C30E) {
            C30E c30e = (C30E) this;
            C14360o3.A0B(list, 0);
            C4S6 c4s6 = c30e.A02;
            if (c4s6 != null && (c3y7 = c4s6.A08) != null && (c38321qM = (C38321qM) ((C4S7) c4s6).A03) != null) {
                UserSession userSession = c30e.A0K;
                Boolean valueOf = Boolean.valueOf(((C4S7) c4s6).A00);
                boolean CdW = c38321qM.CdW();
                boolean Cff = c38321qM.Cff();
                boolean A5A = c38321qM.A5A();
                boolean A4T = c38321qM.A4T();
                List CAf = c38321qM.A0C.CAf();
                C75363a3 CFR = c38321qM.CFR();
                User CDj = c38321qM.A0C.CDj();
                if (CDj != null) {
                    str = CDj.getId();
                } else {
                    str = null;
                }
                boolean A09 = AbstractC75343a1.A09(userSession, CFR, valueOf, str, c38321qM.A0C.CFX(), CAf, true, CdW, Cff, A5A, A4T);
                if (A09 && AbstractC75343a1.A0B((C38321qM) ((C4S7) c4s6).A03)) {
                    C14360o3.A0B(userSession, 0);
                    C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                    InterfaceC16530ry interfaceC16530ry = A00.A2M;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    if (!((Boolean) interfaceC16530ry.CES(A00, c0yrArr[30])).booleanValue() && (!list.isEmpty())) {
                        list.add(0, C41720Idr.A00(c30e.A0H, userSession));
                        C23031Ai A002 = AbstractC23021Ah.A00(userSession);
                        A002.A2M.Egi(A002, true, c0yrArr[30]);
                        c30e.A0I.post(new RunnableC24693AwZ(c4s6, c30e));
                    }
                }
                InterfaceC80343iO BRd = c3y7.BRd();
                if (BRd != null) {
                    BRd.EhE(A09);
                    BRd.ESX(list);
                    return;
                }
                return;
            }
            return;
        }
        if (!(this instanceof C4ZE)) {
            return;
        }
        C14360o3.A0B(list, 0);
        C37707Gii c37707Gii = ((C4ZE) this).A00;
        for (C37560GgG c37560GgG : c37707Gii.A0F) {
            C120985dq c120985dq = c37707Gii.A01;
            if (c120985dq != null) {
                Iterator it = c37560GgG.A0I.iterator();
                while (it.hasNext()) {
                    ((JIH) it.next()).D8r(c120985dq, list);
                }
            }
        }
    }

    @Override // X.C30G
    public final void onDrawnToSurface() {
        if (this instanceof C4ZE) {
            C37707Gii c37707Gii = ((C4ZE) this).A00;
            if (c37707Gii.A07 != null) {
                for (C37560GgG c37560GgG : c37707Gii.A0F) {
                    Iterator it = c37560GgG.A0J.iterator();
                    while (it.hasNext()) {
                        ((JIK) it.next()).DCS(C37560GgG.A03(c37560GgG).A00());
                    }
                }
            }
        }
    }

    @Override // X.C30G
    public final void onLoop(int i) {
        if (this instanceof C30E) {
            for (C33Q c33q : ((C30E) this).A0R) {
                if (c33q != null) {
                    c33q.DzB();
                }
            }
            return;
        }
        if (this instanceof C4ZE) {
            C37707Gii c37707Gii = ((C4ZE) this).A00;
            for (C37560GgG c37560GgG : c37707Gii.A0F) {
                C120985dq c120985dq = c37707Gii.A01;
                if (c120985dq != null) {
                    c37560GgG.A0O(c120985dq, i);
                }
            }
        }
    }

    @Override // X.C30G
    public void onPrepare(C4S7 c4s7) {
        if (this instanceof C4ZE) {
            C37707Gii c37707Gii = ((C4ZE) this).A00;
            for (C37560GgG c37560GgG : c37707Gii.A0F) {
                C120985dq c120985dq = c37707Gii.A01;
                if (c120985dq != null) {
                    c37560GgG.A0L(c120985dq);
                }
            }
            return;
        }
        if (this instanceof C30E) {
            C14360o3.A0B(c4s7, 0);
            Iterator it = ((C30E) this).A0P.iterator();
            while (it.hasNext()) {
                ((C30B) it.next()).DaS((C38321qM) c4s7.A03, c4s7.A01);
            }
        }
    }

    @Override // X.C30G
    public final void onProgressStateChanged(boolean z) {
        C30E c30e;
        C4S6 c4s6;
        C3Y7 c3y7;
        InterfaceC74323Vo B62;
        int i;
        int i2;
        int i3;
        int i4;
        if (this instanceof C4ZE) {
            C37707Gii c37707Gii = ((C4ZE) this).A00;
            Iterator it = c37707Gii.A0F.iterator();
            while (it.hasNext()) {
                ((C37560GgG) it.next()).A0U(c37707Gii, z);
            }
            return;
        }
        if ((this instanceof C30E) && (c4s6 = (c30e = (C30E) this).A02) != null && (c3y7 = c4s6.A08) != null && (B62 = c3y7.B62()) != null) {
            C4QW c4qw = c30e.A05;
            if (z) {
                if (c30e.A0W && c4qw != null) {
                    B62.EcU(c4qw.Azm() - c4qw.getCurrentPositionMs(), false);
                    C30E.A04((C38321qM) ((C4S7) c4s6).A03, c30e, B62, EnumC74373Vt.A09);
                    i2 = c4qw.getCurrentPositionMs();
                } else {
                    C30E.A04((C38321qM) ((C4S7) c4s6).A03, c30e, B62, EnumC74373Vt.A08);
                    return;
                }
            } else {
                if (c4qw != null) {
                    i = c4qw.getCurrentPositionMs();
                } else {
                    i = 0;
                }
                if ((c30e.A0W && (i4 = c4s6.A04) >= 0 && i - i4 < 3000) || (c30e.A0E && i < 3000)) {
                    C30E.A04((C38321qM) ((C4S7) c4s6).A03, c30e, B62, EnumC74373Vt.A0C);
                    C4QW c4qw2 = c30e.A05;
                    if (c4qw2 != null) {
                        i3 = c4qw2.Azm() - c4qw2.getCurrentPositionMs();
                    } else {
                        i3 = 0;
                    }
                    B62.EcU(i3, false);
                    return;
                }
                C30E.A04((C38321qM) ((C4S7) c4s6).A03, c30e, B62, EnumC74373Vt.A06);
                i2 = -1;
            }
            c4s6.A04 = i2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r0.booleanValue() == false) goto L22;
     */
    @Override // X.C30G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onProgressUpdate(int r20, int r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30F.onProgressUpdate(int, int, boolean):void");
    }

    @Override // X.C30G
    public void onStopVideo(String str, boolean z) {
        C38321qM c38321qM;
        EnumC74373Vt enumC74373Vt;
        int i;
        C4ZF c4zf;
        SlideInAndOutIconView A01;
        SlideInAndOutIconView A012;
        if (this instanceof C4ZE) {
            C14360o3.A0B(str, 0);
            C37707Gii c37707Gii = ((C4ZE) this).A00;
            Runnable runnable = c37707Gii.A09;
            if (runnable != null) {
                runnable.run();
            }
            c37707Gii.A09 = null;
            if (c37707Gii.A05 != null && str.equals("fragment_paused")) {
                Iterator it = c37707Gii.A0F.iterator();
                while (it.hasNext()) {
                    it.next();
                    C4QW c4qw = c37707Gii.A06;
                    if (c4qw != null) {
                        c4qw.getCurrentPositionMs();
                    }
                }
                return;
            }
            return;
        }
        if (this instanceof C30E) {
            final C30E c30e = (C30E) this;
            C14360o3.A0B(str, 0);
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.5iX
                {
                    super(131, 2, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C30E c30e2 = C30E.this;
                    c30e2.A0J.A03(c30e2);
                }
            });
            C4S6 c4s6 = c30e.A02;
            if (c4s6 != null) {
                C3Y7 c3y7 = c4s6.A08;
                if (c3y7 != null) {
                    C3W4 Adr = c3y7.Adr();
                    if (Adr != null && (A012 = Adr.A01()) != null) {
                        A012.A01();
                    }
                    C86083sf B61 = c3y7.B61();
                    if (B61 != null && (A01 = B61.A01()) != null) {
                        A01.A01();
                    }
                    C75113Zb BRY = c3y7.BRY();
                    if (BRY != null && (c4zf = BRY.A0s) != null) {
                        c4zf.A01();
                    }
                    if (z) {
                        InterfaceC74323Vo B62 = c3y7.B62();
                        if (B62 != null) {
                            if (c30e.A0T) {
                                c38321qM = (C38321qM) ((C4S7) c4s6).A03;
                                if ("error".equals(str)) {
                                    enumC74373Vt = EnumC74373Vt.A0B;
                                } else if (c30e.A0W) {
                                    enumC74373Vt = EnumC74373Vt.A03;
                                } else {
                                    enumC74373Vt = EnumC74373Vt.A02;
                                }
                            } else {
                                boolean z2 = c30e.A0W;
                                if (z2) {
                                    C4QW c4qw2 = c30e.A05;
                                    if (c4qw2 != null) {
                                        i = c4qw2.Azm() - c4qw2.getCurrentPositionMs();
                                    } else {
                                        i = 0;
                                    }
                                    B62.EcU(i, false);
                                }
                                c38321qM = (C38321qM) ((C4S7) c4s6).A03;
                                if (z2) {
                                    enumC74373Vt = EnumC74373Vt.A09;
                                } else {
                                    enumC74373Vt = EnumC74373Vt.A08;
                                }
                            }
                            C30E.A04(c38321qM, c30e, B62, enumC74373Vt);
                        }
                        View BGa = c3y7.BGa();
                        if (BGa != null) {
                            BGa.clearAnimation();
                            BGa.setVisibility(0);
                        }
                    }
                }
                for (C30B c30b : c30e.A0P) {
                    C4QW c4qw3 = c30e.A05;
                    if (c4qw3 != null) {
                        c30b.Dp2(C30E.A00(c30e), c4qw3.getCurrentPositionMs(), ((C4QT) c4qw3).A03, c4qw3.Azm());
                    }
                }
                c30e.A02 = null;
                return;
            }
            return;
        }
        if (this instanceof ViewOnKeyListenerC98854c5) {
            ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5 = (ViewOnKeyListenerC98854c5) this;
            C68105VBj c68105VBj = viewOnKeyListenerC98854c5.A01;
            if (c68105VBj != null) {
                c68105VBj.A02 = false;
                if (z) {
                    c68105VBj.A01.A01.clearAnimation();
                    c68105VBj.A01.A01.setVisibility(0);
                }
                viewOnKeyListenerC98854c5.A07.A03(viewOnKeyListenerC98854c5);
                ViewOnKeyListenerC67971V4l viewOnKeyListenerC67971V4l = viewOnKeyListenerC98854c5.A00;
                if (viewOnKeyListenerC67971V4l == null) {
                    C14360o3.A0F("listener");
                    throw C00O.createAndThrow();
                }
                V2P v2p = c68105VBj.A00;
                C4QW c4qw4 = viewOnKeyListenerC98854c5.A02;
                if (c4qw4 != null) {
                    int currentPositionMs = c4qw4.getCurrentPositionMs();
                    C14360o3.A0B(v2p, 0);
                    viewOnKeyListenerC67971V4l.A05.A00(v2p).A01 = currentPositionMs;
                    viewOnKeyListenerC98854c5.A01 = null;
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    @Override // X.C30G
    public final void onStopped(C4S7 c4s7, int i) {
        File A01;
        if (this instanceof C4ZE) {
            Iterator it = ((C4ZE) this).A00.A0F.iterator();
            while (it.hasNext()) {
                ((C37560GgG) it.next()).A0G();
            }
            return;
        }
        if (this instanceof C30E) {
            C30E c30e = (C30E) this;
            C14360o3.A0B(c4s7, 0);
            C4S6 c4s6 = (C4S6) c4s7;
            C38321qM c38321qM = (C38321qM) ((C4S7) c4s6).A03;
            C3Y7 c3y7 = c4s6.A08;
            UserSession userSession = c30e.A0K;
            boolean z = !C18U.A06(C06090Tz.A05, userSession, 36319295721970826L);
            if (c38321qM != null && c3y7 != null && z) {
                View BGa = c3y7.BGa();
                String A02 = AbstractC97414Zb.A02(userSession, c38321qM);
                if (c4s6.A0C && BGa != null && A02 != null) {
                    String id = c38321qM.getId();
                    Object tag = BGa.getTag(R.id.key_media_id);
                    Object obj = null;
                    if (tag instanceof String) {
                        obj = tag;
                    }
                    if (C14360o3.A0K(id, obj) && (A01 = AbstractC97414Zb.A01(c30e.A0H, userSession, A02)) != null) {
                        c3y7.EgX(c4s6.A0E, AbstractC81033jX.A02(A01, -1, -1), true);
                    }
                }
            }
            Runnable runnable = c30e.A07;
            if (runnable != null) {
                runnable.run();
            }
            c30e.A07 = null;
            return;
        }
        if (!(this instanceof ViewOnKeyListenerC98854c5)) {
            return;
        }
        ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5 = (ViewOnKeyListenerC98854c5) this;
        Runnable runnable2 = viewOnKeyListenerC98854c5.A03;
        if (runnable2 != null) {
            runnable2.run();
        }
        viewOnKeyListenerC98854c5.A03 = null;
    }

    @Override // X.C30G
    public final void onSurfaceTextureDestroyed() {
        C68105VBj c68105VBj;
        if ((this instanceof ViewOnKeyListenerC98854c5) && (c68105VBj = ((ViewOnKeyListenerC98854c5) this).A01) != null) {
            c68105VBj.A01.A01.clearAnimation();
            c68105VBj.A01.A01.setVisibility(0);
            c68105VBj.A03 = true;
        }
    }

    @Override // X.C30G
    public final void onSurfaceTextureUpdated(C4S7 c4s7) {
        ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5;
        C68105VBj c68105VBj;
        C37644Ghd c37644Ghd;
        if (this instanceof C4ZE) {
            C37707Gii c37707Gii = ((C4ZE) this).A00;
            if (c37707Gii.A07 != null) {
                Integer num = c37707Gii.A08;
                if (num == C05F.A01) {
                    c37707Gii.A08 = C05F.A0C;
                    return;
                }
                if (num != C05F.A0C) {
                    return;
                }
                for (C37560GgG c37560GgG : c37707Gii.A0F) {
                    C120985dq c120985dq = c37707Gii.A01;
                    if (c120985dq != null && (c37644Ghd = c37707Gii.A02) != null) {
                        c37560GgG.A0Q(c120985dq, c37644Ghd, c37707Gii);
                    }
                }
                return;
            }
            return;
        }
        if (!(this instanceof ViewOnKeyListenerC98854c5) || (c68105VBj = (viewOnKeyListenerC98854c5 = (ViewOnKeyListenerC98854c5) this).A01) == null || !c68105VBj.A03) {
            return;
        }
        if (c68105VBj.A02) {
            IgProgressImageView igProgressImageView = c68105VBj.A01.A01;
            Animation animation = viewOnKeyListenerC98854c5.A06;
            if (animation != null) {
                igProgressImageView.startAnimation(animation);
                c68105VBj.A01.A01.setVisibility(4);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        c68105VBj.A03 = false;
    }

    @Override // X.C30G
    public final void onVideoDownloading(C4S7 c4s7) {
        if (this instanceof C30E) {
            C30E c30e = (C30E) this;
            C14360o3.A0B(c4s7, 0);
            C4S6 c4s6 = (C4S6) c4s7;
            C3Y7 c3y7 = c4s6.A08;
            if (c3y7 != null) {
                InterfaceC74323Vo B62 = c3y7.B62();
                if (c30e.A0W) {
                    C4QW c4qw = c30e.A05;
                    if (c4qw != null) {
                        if (B62 != null) {
                            B62.EcU(c4qw.Azm() - c4qw.getCurrentPositionMs(), false);
                            C30E.A04((C38321qM) ((C4S7) c4s6).A03, c30e, B62, EnumC74373Vt.A09);
                        }
                        c4s6.A04 = c4s6.A05;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                if (B62 == null) {
                    return;
                }
                C30E.A04((C38321qM) ((C4S7) c4s6).A03, c30e, B62, EnumC74373Vt.A08);
            }
        }
    }

    @Override // X.C30G
    public void onVideoPlayerError(C4S7 c4s7, String str) {
        if (this instanceof C30E) {
            C30E c30e = (C30E) this;
            C14360o3.A0B(c4s7, 0);
            C38321qM c38321qM = (C38321qM) c4s7.A03;
            if (c38321qM != null) {
                if (c38321qM.A4x()) {
                    C0K8.A03(C30E.class, MSV.A00(805));
                    c38321qM.A0M = null;
                }
                Iterator it = c30e.A0P.iterator();
                while (it.hasNext()) {
                    ((C30B) it.next()).DzI(c38321qM, str);
                }
                return;
            }
            return;
        }
        if (this instanceof C4ZE) {
            Iterator it2 = ((C4ZE) this).A00.A0F.iterator();
            while (it2.hasNext()) {
                ((C37560GgG) it2.next()).A0V(str);
            }
        }
    }

    @Override // X.C30G
    public void onVideoPrepared(C4S7 c4s7, boolean z) {
        C68105VBj c68105VBj;
        FrameLayout A00;
        View BQt;
        C3W4 Adr;
        C4S6 c4s6;
        if (this instanceof C4ZE) {
            C37707Gii c37707Gii = ((C4ZE) this).A00;
            for (C37560GgG c37560GgG : c37707Gii.A0F) {
                C120985dq c120985dq = c37707Gii.A01;
                if (c120985dq != null) {
                    c37560GgG.A0R(c120985dq, c37707Gii, z);
                }
            }
            return;
        }
        if (this instanceof C30E) {
            final C30E c30e = (C30E) this;
            C14360o3.A0B(c4s7, 0);
            C4QW c4qw = c30e.A05;
            if (c4qw != null && (c4s6 = c30e.A02) != null) {
                C30E.A06(c30e, -5, ((C4S7) c4s6).A00);
                if (c30e.A0C) {
                    c4s6.A07 = c4qw.getCurrentPositionMs();
                }
            }
            Iterator it = c30e.A0P.iterator();
            while (it.hasNext()) {
                ((C30B) it.next()).DzZ((C38321qM) c4s7.A03, z);
            }
            C3Y7 c3y7 = ((C4S6) c4s7).A08;
            C38321qM A002 = C30E.A00(c30e);
            C75113Zb A0H = c30e.A0H();
            SlideInAndOutIconView slideInAndOutIconView = null;
            if (c3y7 != null && (Adr = c3y7.Adr()) != null) {
                slideInAndOutIconView = Adr.A01();
            }
            if (A002 != null && slideInAndOutIconView != null && slideInAndOutIconView.getVisibility() != 0 && C30E.A0E(A002, c30e)) {
                C30E.A03(A002, A0H, c30e);
            }
            if (c3y7 != null) {
                if (A0H != null && A0H.A0o == AnonymousClass341.A0U) {
                    Context context = c30e.A0H;
                    if (AbstractC56862jK.A00(context) && (BQt = c3y7.BQt()) != null) {
                        AbstractC56932jR.A08(BQt, context.getString(2131971948));
                    }
                }
                C3W4 Adr2 = c3y7.Adr();
                if (Adr2 != null && (A00 = Adr2.A00()) != null) {
                    if (!A00.hasOnClickListeners()) {
                        c30e.A0Q(A00, A0H);
                    }
                    AbstractC56952jT.A04(A00, C05F.A01);
                    if (A002 != null) {
                        Context context2 = A00.getContext();
                        if (context2 instanceof Activity) {
                            Resources resources = A00.getResources();
                            if (A002.A5R() && !AbstractC23021Ah.A00(c30e.A0K).A01.getBoolean(AbstractC111324zv.A00(2520), false)) {
                                int i = 2131964195;
                                if (c30e.A0Y()) {
                                    i = 2131964194;
                                }
                                String string = resources.getString(i);
                                C14360o3.A07(string);
                                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.igtv_feed_preview_sound_tooltip_above_anchor_point_y);
                                EnumC58132lV enumC58132lV = EnumC58132lV.A02;
                                C33H c33h = new C33H() { // from class: X.9oP
                                    @Override // X.C33H, X.C33I
                                    public final void Dtt(C5SW c5sw) {
                                        AbstractC167007dF.A17(AbstractC166987dD.A0x(C30E.this.A0K).ARD(), AbstractC111324zv.A00(2520));
                                    }
                                };
                                C14360o3.A0C(context2, "null cannot be cast to non-null type android.app.Activity");
                                C5SU c5su = new C5SU((Activity) context2, new C149686oL(string));
                                c5su.A04(A00, 0, dimensionPixelSize, true);
                                c5su.A0B = true;
                                c5su.A06(enumC58132lV);
                                c5su.A0A = false;
                                c5su.A04 = c33h;
                                c5su.A00().A07(null);
                            }
                        }
                    }
                }
            }
            UserSession userSession = c30e.A0K;
            C14360o3.A0B(userSession, 0);
            c30e.A09 = AbstractC75373a4.A06(userSession);
            return;
        }
        if (this instanceof ViewOnKeyListenerC98854c5) {
            ViewOnKeyListenerC98854c5 viewOnKeyListenerC98854c5 = (ViewOnKeyListenerC98854c5) this;
            if (viewOnKeyListenerC98854c5.A02 != null && (c68105VBj = viewOnKeyListenerC98854c5.A01) != null) {
                ViewOnKeyListenerC98854c5.A01(viewOnKeyListenerC98854c5, ((C4S7) c68105VBj).A00);
            }
        }
    }

    @Override // X.C30G
    public void onVideoStartedPlaying(C4S7 c4s7) {
        C3Y7 c3y7;
        View BGa;
        Integer num;
        if (this instanceof C4ZE) {
            C14360o3.A0B(c4s7, 0);
            C4S8 c4s8 = c4s7.A02;
            boolean z = c4s8.A02;
            EnumC92424Bx enumC92424Bx = c4s8.A01;
            C14360o3.A06(enumC92424Bx);
            EnumC92424Bx enumC92424Bx2 = c4s8.A00;
            C14360o3.A06(enumC92424Bx2);
            boolean z2 = c4s8.A03;
            for (C37560GgG c37560GgG : ((C4ZE) this).A00.A0F) {
                synchronized (c37560GgG) {
                    C206199Bc c206199Bc = new C206199Bc(enumC92424Bx, enumC92424Bx2, z, z2);
                    Iterator it = c37560GgG.A0J.iterator();
                    while (it.hasNext()) {
                        ((JIK) it.next()).E0A(c206199Bc, C37560GgG.A03(c37560GgG).A00());
                    }
                    C120985dq A03 = C37560GgG.A03(c37560GgG).A03.A03(C37560GgG.A03(c37560GgG).A00());
                    if (A03 != null) {
                        if (A03.A02 != null) {
                            C120985dq A01 = C37560GgG.A01(c37560GgG);
                            if (A01 != null) {
                                num = C37560GgG.A03(c37560GgG).A01(A01).A0H;
                            } else {
                                num = null;
                            }
                            Iterator it2 = c37560GgG.A0I.iterator();
                            while (it2.hasNext()) {
                                ((JIH) it2.next()).DzP(A03, num, C37560GgG.A03(c37560GgG).A00());
                            }
                        }
                        C41699IdS c41699IdS = c37560GgG.A02;
                        if (c41699IdS != null) {
                            c41699IdS.A02(A03.getId());
                        }
                        C43749JWk A00 = AbstractC43751JWn.A00(c37560GgG.A0E);
                        C38801rC c38801rC = C38321qM.A0h;
                        A00.A00(C38801rC.A06(A03.getId()));
                    }
                }
            }
            return;
        }
        if (this instanceof C30E) {
            C30E c30e = (C30E) this;
            C14360o3.A0B(c4s7, 0);
            if (c30e.A0V && (c4s7 instanceof C4S6) && (c3y7 = ((C4S6) c4s7).A08) != null && (BGa = c3y7.BGa()) != null) {
                BGa.setVisibility(8);
            }
            C38321qM c38321qM = (C38321qM) c4s7.A03;
            if (c38321qM != null) {
                C38321qM A1e = c38321qM.A1e(c38321qM.A0x());
                if (A1e != null) {
                    c38321qM = A1e;
                }
                for (C30B c30b : c30e.A0P) {
                    EnumC92424Bx enumC92424Bx3 = c4s7.A02.A00;
                    C14360o3.A06(enumC92424Bx3);
                    c30b.E01(enumC92424Bx3, c38321qM);
                }
                String id = c38321qM.getId();
                if (id != null) {
                    UserSession userSession = c30e.A0K;
                    InterfaceC60442pS interfaceC60442pS = ((C30P) c30e.A0L).A00;
                    C14360o3.A0B(userSession, 0);
                    ClipsViewerSource A002 = AbstractC116865Qp.A00(interfaceC60442pS);
                    if (A002 == ClipsViewerSource.A1S || A002 == ClipsViewerSource.A1W) {
                        C5R5 A012 = C77453dV.A01(A002, userSession, interfaceC60442pS.getModuleName());
                        if (A012 instanceof C5R4) {
                            ((C5R4) A012).CoG(userSession, id);
                        }
                    }
                }
            }
        }
    }

    @Override // X.C30G
    public final void onVideoSwitchToWarmupPlayer(C4S7 c4s7) {
        if (this instanceof C4ZE) {
            for (C37560GgG c37560GgG : ((C4ZE) this).A00.A0F) {
                Iterator it = c37560GgG.A0J.iterator();
                while (it.hasNext()) {
                    ((JIK) it.next()).E0D(C37560GgG.A03(c37560GgG).A00());
                }
            }
        }
    }

    @Override // X.C30G
    public final void onVideoViewPrepared(C4S7 c4s7) {
        C75113Zb c75113Zb;
        EnumC74373Vt enumC74373Vt;
        InterfaceC74323Vo B62;
        if (this instanceof C30E) {
            C30E c30e = (C30E) this;
            C14360o3.A0B(c4s7, 0);
            C4S6 c4s6 = (C4S6) c4s7;
            C3Y7 c3y7 = c4s6.A08;
            if (c3y7 != null) {
                c75113Zb = c3y7.BRY();
            } else {
                c75113Zb = null;
            }
            boolean z = false;
            if (c75113Zb != c4s6.A09) {
                z = true;
            }
            if (z) {
                if (c3y7 != null && (B62 = c3y7.B62()) != null) {
                    B62.setVisibility(8);
                    return;
                }
                return;
            }
            C4QW c4qw = c30e.A05;
            C4S6 c4s62 = c30e.A02;
            if (c4s62 != null && c4qw != null) {
                boolean z2 = false;
                if (c4qw.Azm() - c4s62.A05 > 15500) {
                    z2 = true;
                }
                c30e.A0E = z2;
            }
            if (c3y7 == null) {
                return;
            }
            View BGa = c3y7.BGa();
            C38321qM A00 = C30E.A00(c30e);
            if (BGa != null && (A00 == null || !C30E.A0D(A00, c30e))) {
                BGa.setVisibility(8);
            }
            c3y7.EFy(R.id.listener_id_for_media_video_binder);
            InterfaceC74323Vo B622 = c3y7.B62();
            if (B622 == null) {
                return;
            }
            if (c30e.A0E && c4qw != null && c4s62 != null) {
                C30E.A04(A00, c30e, B622, EnumC74373Vt.A0C);
                B622.EcU(c4qw.Azm() - c4s62.A05, false);
                return;
            }
            if (A00 != null && A00.A5P() && !A00.CdW() && AbstractC76273bX.A02(A00)) {
                enumC74373Vt = EnumC74373Vt.A04;
            } else {
                enumC74373Vt = EnumC74373Vt.A06;
            }
            C30E.A04(A00, c30e, B622, enumC74373Vt);
            return;
        }
        if (this instanceof C4ZE) {
            ((C4ZE) this).A00.A08 = C05F.A01;
            return;
        }
        if (!(this instanceof ViewOnKeyListenerC98854c5)) {
            return;
        }
        C14360o3.A0B(c4s7, 0);
        C68105VBj c68105VBj = (C68105VBj) c4s7;
        c68105VBj.A02 = true;
        IgProgressImageView igProgressImageView = c68105VBj.A01.A01;
        Animation animation = ((ViewOnKeyListenerC98854c5) this).A06;
        if (animation != null) {
            igProgressImageView.startAnimation(animation);
            igProgressImageView.setVisibility(4);
            igProgressImageView.A06(R.id.listener_id_for_media_video_binder);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
