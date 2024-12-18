package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9KW, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9KW implements SurfaceTexture.OnFrameAvailableListener {
    public static InterfaceC25217BDq A0E = new InterfaceC25217BDq() { // from class: X.9KX
        @Override // X.InterfaceC25217BDq
        public final void DHN(String str) {
        }

        @Override // X.InterfaceC25217BDq
        public final void DHO(String str, String str2, Throwable th) {
        }

        @Override // X.InterfaceC25217BDq
        public final void DhC(Throwable th, String str) {
        }

        @Override // X.InterfaceC25217BDq
        public final void DyQ() {
        }

        @Override // X.InterfaceC25217BDq
        public final void DyR() {
        }

        @Override // X.InterfaceC25217BDq
        public final void DyS() {
        }

        @Override // X.InterfaceC25217BDq
        public final void DyT() {
        }

        @Override // X.InterfaceC25217BDq
        public final void onFirstFrameRendered() {
        }
    };
    public int A00;
    public C9OB A02;
    public C191478dz A03;
    public InterfaceC25215BDn A04;
    public InterfaceC25217BDq A05;
    public C9PR A06;
    public C23105AGr A07;
    public ClipInfo A08;
    public C47Z A09;
    public java.util.Set A0A;
    public final Object A0C = new Object();
    public volatile boolean A0D = false;
    public Handler A01 = new Handler();
    public boolean A0B = true;

    public final int A07() {
        long j;
        if (this instanceof C9MF) {
            C9MF c9mf = (C9MF) this;
            int i = -1;
            if (c9mf.A0G) {
                if (!((C9KW) c9mf).A0D) {
                    return -1;
                }
                C95334Qt c95334Qt = c9mf.A04;
                if (c95334Qt != null) {
                    return c95334Qt.getCurrentPosition();
                }
                throw AbstractC166997dE.A0g();
            }
            Object obj = ((C9KW) c9mf).A0C;
            C14360o3.A06(obj);
            synchronized (obj) {
                if (((C9KW) c9mf).A0D) {
                    C95334Qt c95334Qt2 = c9mf.A04;
                    if (c95334Qt2 != null) {
                        i = c95334Qt2.getCurrentPosition();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                }
            }
            return i;
        }
        C55208OeM c55208OeM = ((C219919nd) this).A05;
        if (c55208OeM != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            InterfaceC58201Pr7 interfaceC58201Pr7 = c55208OeM.A04;
            if (interfaceC58201Pr7 != null) {
                j = interfaceC58201Pr7.Aui();
            } else {
                j = 0;
            }
            return (int) timeUnit.toMillis(j);
        }
        return 0;
    }

    public final AbstractC209369Nu A08() {
        if (this instanceof C219919nd) {
            return ((C219919nd) this).A06;
        }
        return ((C9MF) this).A0E;
    }

    public final void A09() {
        if (this instanceof C9MF) {
            C9MF.A01((C9MF) this);
            return;
        }
        C55208OeM c55208OeM = ((C219919nd) this).A05;
        if (c55208OeM == null) {
            return;
        }
        c55208OeM.A08(0.0f);
    }

    public final void A0A() {
        C95334Qt c95334Qt;
        C23105AGr c23105AGr;
        SlideInAndOutIconView slideInAndOutIconView;
        SlideInAndOutIconView slideInAndOutIconView2;
        if (this instanceof C219919nd) {
            C219919nd c219919nd = (C219919nd) this;
            C55208OeM c55208OeM = c219919nd.A05;
            if (c55208OeM != null) {
                c55208OeM.A08(c219919nd.A00);
                return;
            }
            return;
        }
        C9MF c9mf = (C9MF) this;
        Object obj = ((C9KW) c9mf).A0C;
        C14360o3.A06(obj);
        synchronized (obj) {
            if (((C9KW) c9mf).A0D && (c95334Qt = c9mf.A04) != null) {
                C47Z c47z = ((C9KW) c9mf).A09;
                if (c47z != null) {
                    if (!c47z.A5F) {
                        c9mf.A07 = true;
                        c95334Qt.EhH(c9mf.A00);
                        C23105AGr c23105AGr2 = ((C9KW) c9mf).A07;
                        if (c23105AGr2 != null && (slideInAndOutIconView2 = c23105AGr2.A05) != null) {
                            C23105AGr.A00(slideInAndOutIconView2.getContext().getDrawable(R.drawable.soundon), c23105AGr2, C30R.A0B, null);
                        }
                    } else if ((!c47z.A5C || !C36A.A0K(c9mf.A0D, true, c47z.A11())) && (c23105AGr = ((C9KW) c9mf).A07) != null && (slideInAndOutIconView = c23105AGr.A05) != null) {
                        C23105AGr.A00(slideInAndOutIconView.getContext().getDrawable(R.drawable.soundoff), c23105AGr, C30R.A07, c23105AGr.A05.getResources().getString(2131968899));
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
        }
        if (c9mf.A0A) {
            return;
        }
        c9mf.A0A = true;
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(c9mf.A0D);
        AbstractC167007dF.A18(A0x, "creation_audio_toggle_nux_countdown", A0x.getInt("creation_audio_toggle_nux_countdown", 25) - 1);
    }

    public final void A0B() {
        if (this instanceof C219919nd) {
            throw AbstractC166987dD.A1D(AbstractC111324zv.A00(322));
        }
        C9MF c9mf = (C9MF) this;
        c9mf.A05 = C05F.A01;
        ClipInfo clipInfo = ((C9KW) c9mf).A08;
        if (clipInfo != null) {
            C9MF.A04(c9mf, clipInfo.A05, true);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0C() {
        if (this instanceof C9MF) {
            C9MF c9mf = (C9MF) this;
            c9mf.A05 = C05F.A01;
            C9MF.A04(c9mf, C9MF.A00(c9mf), true);
        } else {
            C55208OeM c55208OeM = ((C219919nd) this).A05;
            if (c55208OeM == null) {
                return;
            }
            c55208OeM.A09(0);
        }
    }

    public final void A0D() {
        C23105AGr c23105AGr;
        SlideInAndOutIconView slideInAndOutIconView;
        if (this instanceof C219919nd) {
            C219919nd c219919nd = (C219919nd) this;
            c219919nd.A08 = true;
            C55208OeM c55208OeM = c219919nd.A05;
            if (c55208OeM != null) {
                c55208OeM.A06();
                InterfaceC25215BDn interfaceC25215BDn = ((C9KW) c219919nd).A04;
                if (interfaceC25215BDn != null) {
                    interfaceC25215BDn.E03();
                    return;
                }
                return;
            }
            c219919nd.A0A = false;
            return;
        }
        C9MF c9mf = (C9MF) this;
        C95334Qt c95334Qt = c9mf.A04;
        if (c95334Qt == null) {
            return;
        }
        c9mf.A09 = false;
        ((C9KW) c9mf).A00 = 0;
        c95334Qt.start();
        c9mf.A05 = C05F.A00;
        if (c9mf.A06 && !c9mf.A07) {
            c95334Qt.EhH(0.0f);
            if (AbstractC166987dD.A0x(c9mf.A0D).getInt("creation_audio_toggle_nux_countdown", 25) > 0 && (c23105AGr = ((C9KW) c9mf).A07) != null && (slideInAndOutIconView = c23105AGr.A05) != null) {
                C23105AGr.A00(slideInAndOutIconView.getContext().getDrawable(R.drawable.soundoff), c23105AGr, C30R.A09, c23105AGr.A05.getResources().getString(2131968886));
            }
        } else {
            c95334Qt.EhH(c9mf.A00);
        }
        InterfaceC25215BDn interfaceC25215BDn2 = ((C9KW) c9mf).A04;
        if (interfaceC25215BDn2 != null) {
            interfaceC25215BDn2.E03();
        }
        C47Z c47z = ((C9KW) c9mf).A09;
        if (c47z != null) {
            if (!c47z.A5F) {
                return;
            }
            C9MF.A01(c9mf);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void A0E() {
        View view;
        C23105AGr c23105AGr = this.A07;
        if (c23105AGr != null && (view = c23105AGr.A00) != null) {
            view.clearAnimation();
            c23105AGr.A00.setVisibility(4);
        }
    }

    public final void A0F() {
        C23105AGr c23105AGr = this.A07;
        if (c23105AGr != null) {
            SlideInAndOutIconView slideInAndOutIconView = c23105AGr.A05;
            if (slideInAndOutIconView != null) {
                slideInAndOutIconView.A01();
            }
            C4ZF c4zf = c23105AGr.A04;
            if (c4zf != null) {
                c4zf.A01();
            }
        }
    }

    public final void A0G(float f) {
        if (this instanceof C219919nd) {
            C219919nd c219919nd = (C219919nd) this;
            C55208OeM c55208OeM = c219919nd.A05;
            if (c55208OeM != null) {
                c55208OeM.A08(f);
            }
            c219919nd.A00 = f;
            return;
        }
        C9MF c9mf = (C9MF) this;
        C95334Qt c95334Qt = c9mf.A04;
        if (c95334Qt == null) {
            return;
        }
        c9mf.A00 = f;
        c95334Qt.EhH(f);
    }

    public final void A0H(int i) {
        if (this instanceof C219919nd) {
            C55208OeM c55208OeM = ((C219919nd) this).A05;
            if (c55208OeM != null) {
                c55208OeM.A09(i);
                return;
            }
            return;
        }
        C9MF c9mf = (C9MF) this;
        c9mf.A05 = C05F.A01;
        c9mf.A02 = i;
        C95334Qt c95334Qt = c9mf.A04;
        if (c95334Qt == null) {
            return;
        }
        c95334Qt.seekTo(i);
    }

    public final void A0I(int i, int i2) {
        C55208OeM c55208OeM;
        if ((this instanceof C219919nd) && (c55208OeM = ((C219919nd) this).A05) != null) {
            c55208OeM.A03 = i;
            c55208OeM.A02 = i2;
            InterfaceC58201Pr7 interfaceC58201Pr7 = c55208OeM.A04;
            if (interfaceC58201Pr7 != null) {
                interfaceC58201Pr7.Eaw(new C1125456i(TimeUnit.MILLISECONDS, i, i2));
            }
        }
    }

    public void A0J(UserSession userSession, C47Z c47z, int i) {
        this.A09 = c47z;
        if (c47z.A1N == null) {
            C0f5 AEp = C18950wb.A01.AEp("MediaDecoderManager", 817901174);
            AEp.ABW(DialogModule.KEY_MESSAGE, "mPendingMedia.getStitchedClipInfo() is null in com.instagram.creation.video.compat.MediaDecoderManager.setPendingMedia");
            AEp.ERI(AbstractC166987dD.A15("mPendingMedia.getStitchedClipInfo() is null com.instagram.creation.video.compat.MediaDecoderManager.setPendingMedia"));
            AEp.report();
        }
        this.A08 = this.A09.A1N;
        this.A00 = i;
    }

    public final void A0K(boolean z) {
        if (this instanceof C219919nd) {
            ((C219919nd) this).A07 = z;
        } else {
            ((C9MF) this).A06 = z;
        }
    }

    public final void A0L(boolean z) {
        if (this instanceof C219919nd) {
            C219919nd c219919nd = (C219919nd) this;
            ((C9KW) c219919nd).A0B = z;
            C55208OeM c55208OeM = c219919nd.A05;
            if (c55208OeM != null) {
                c55208OeM.A09 = z;
                InterfaceC58201Pr7 interfaceC58201Pr7 = c55208OeM.A04;
                if (interfaceC58201Pr7 != null) {
                    interfaceC58201Pr7.Ee0(z);
                    return;
                }
                return;
            }
            return;
        }
        this.A0B = z;
    }

    public final void A0M(boolean z) {
        if (this instanceof C219919nd) {
            C219919nd c219919nd = (C219919nd) this;
            c219919nd.A08 = false;
            C55208OeM c55208OeM = c219919nd.A05;
            if (c55208OeM != null) {
                c55208OeM.A05();
                if (z) {
                    c55208OeM.A09(0);
                }
                c219919nd.A0A = false;
            }
            InterfaceC25215BDn interfaceC25215BDn = ((C9KW) c219919nd).A04;
            if (interfaceC25215BDn != null) {
                interfaceC25215BDn.E0B();
                return;
            }
            return;
        }
        C9MF c9mf = (C9MF) this;
        C95334Qt c95334Qt = c9mf.A04;
        if (c95334Qt == null || !c95334Qt.A09.A0I.A0J()) {
            return;
        }
        C95334Qt c95334Qt2 = c9mf.A04;
        if (c95334Qt2 != null) {
            c95334Qt2.pause();
        }
        if (c9mf.A06) {
            c9mf.A0F();
        }
        C9MF.A05(c9mf, z);
        c9mf.A0E();
    }

    public final boolean A0N() {
        InterfaceC58201Pr7 interfaceC58201Pr7;
        boolean A0J;
        if (this instanceof C9MF) {
            C9MF c9mf = (C9MF) this;
            Object obj = ((C9KW) c9mf).A0C;
            C14360o3.A06(obj);
            synchronized (obj) {
                if (((C9KW) c9mf).A0D) {
                    C95334Qt c95334Qt = c9mf.A04;
                    if (c95334Qt != null) {
                        A0J = c95334Qt.A09.A0I.A0J();
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    A0J = false;
                }
            }
            return A0J;
        }
        C55208OeM c55208OeM = ((C219919nd) this).A05;
        if (c55208OeM != null && (interfaceC58201Pr7 = c55208OeM.A04) != null) {
            return interfaceC58201Pr7.isPlaying();
        }
        return false;
    }

    public final boolean A0O() {
        boolean z;
        View view;
        if (this instanceof C219919nd) {
            C219919nd c219919nd = (C219919nd) this;
            C55208OeM c55208OeM = c219919nd.A05;
            z = true;
            if (c55208OeM != null) {
                InterfaceC58201Pr7 interfaceC58201Pr7 = c55208OeM.A04;
                if ((interfaceC58201Pr7 == null || !interfaceC58201Pr7.isPlaying()) && !c219919nd.A0A) {
                    c219919nd.A0A = true;
                    c219919nd.A0D();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            C9MF c9mf = (C9MF) this;
            if (c9mf.A09) {
                z = true;
                if (c9mf.A08) {
                    c9mf.A0D();
                    C23105AGr c23105AGr = ((C9KW) c9mf).A07;
                    if (c23105AGr != null && (view = c23105AGr.A00) != null && view.getVisibility() == 0) {
                        c23105AGr.A00.clearAnimation();
                        View view2 = c23105AGr.A00;
                        Animation animation = c23105AGr.A03;
                        animation.getClass();
                        view2.startAnimation(animation);
                        return true;
                    }
                } else {
                    C23105AGr c23105AGr2 = ((C9KW) c9mf).A07;
                    if (c23105AGr2 != null) {
                        AbstractC167007dF.A0w(c23105AGr2.A01);
                    }
                    c9mf.A0E();
                    if (c9mf.A02 < 0) {
                        c9mf.A05 = C05F.A0C;
                        C9MF.A04(c9mf, C9MF.A00(c9mf), false);
                    }
                    c9mf.A0C = true;
                    return true;
                }
            } else {
                return false;
            }
        }
        return z;
    }

    public C9KW(UserSession userSession, InterfaceC25217BDq interfaceC25217BDq, C23105AGr c23105AGr) {
        java.util.Set A1H;
        this.A07 = c23105AGr;
        this.A05 = interfaceC25217BDq;
        if (C18U.A06(C06090Tz.A05, userSession, 36319394506481055L)) {
            A1H = new CopyOnWriteArraySet();
        } else {
            A1H = AbstractC166987dD.A1H();
        }
        this.A0A = A1H;
    }
}
