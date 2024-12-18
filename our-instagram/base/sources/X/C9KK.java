package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.ConstrainedTextureView;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.9KK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9KK implements TextureView.SurfaceTextureListener, InterfaceC185668Ll {
    public int A00;
    public int A01;
    public C1819485e A02;
    public ConstrainedTextureView A03;
    public C208699Ld A04;
    public C8MI A05;
    public C44529JmZ A06;
    public InterfaceC25193BCq A07;
    public C209359Nt A08;
    public String A09;
    public final Context A0A;
    public final C199468rn A0B;
    public final UserSession A0C;
    public final C81N A0D;
    public final FilterGroupModel A0E;
    public final Integer A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9KK(Context context, UserSession userSession, String str) {
        this(context, null, userSession, null, null, null, str, false, true, false, false, false, true, true, false);
        AbstractC167007dF.A1D(context, 1, userSession);
    }

    @Override // X.InterfaceC185668Ll
    public final void Dr3(int i, int i2) {
    }

    @Override // X.InterfaceC185668Ll
    public final void Dr6(Surface surface, int i, int i2) {
        InterfaceC1819785h A00;
        C14360o3.A0B(surface, 0);
        InterfaceC25193BCq interfaceC25193BCq = this.A07;
        if (interfaceC25193BCq != null) {
            Context context = this.A0A;
            Context A0O = AbstractC166987dD.A0O(context);
            UserSession userSession = this.A0C;
            boolean z = this.A0J;
            boolean z2 = this.A0N;
            boolean z3 = this.A0M;
            boolean z4 = this.A0G;
            FilterGroupModel filterGroupModel = this.A0E;
            boolean A1W = AbstractC167007dF.A1W(filterGroupModel);
            C208699Ld c208699Ld = new C208699Ld(A0O, this.A0B, userSession, this.A0F, this.A09, z, z2, z3, z4, A1W, this.A0K, this.A0H, this.A0I);
            C208699Ld.A03(c208699Ld, "connect");
            C178577wV c178577wV = c208699Ld.A07;
            c178577wV.A03();
            this.A04 = c208699Ld;
            C200558ty c200558ty = null;
            View view = null;
            if (z4) {
                C27631Vq c27631Vq = C27631Vq.A00;
                if (c27631Vq != null) {
                    C81N c81n = this.A0D;
                    if (c81n != null) {
                        view = c81n.A05();
                    }
                    c200558ty = c27631Vq.A00(context, view, c178577wV, userSession, true, z);
                } else {
                    C14360o3.A0F("instance");
                    throw C00O.createAndThrow();
                }
            }
            int i3 = this.A01;
            int i4 = this.A00;
            C8MI c8mi = this.A05;
            C208699Ld c208699Ld2 = this.A04;
            if (c208699Ld2 != null) {
                C208719Lf c208719Lf = new C208719Lf(surface, c200558ty, userSession, c208699Ld2, c8mi, filterGroupModel, i3, i4, this.A0L);
                C209359Nt c209359Nt = new C209359Nt(this.A05, interfaceC25193BCq, new RunnableC208819Lp(userSession, c208719Lf, i3, i4, i, i2), c208719Lf);
                C1819485e c1819485e = this.A02;
                if (c1819485e != null && (A00 = c1819485e.A00()) != null && z4 && c200558ty != null) {
                    A00.EP5(c200558ty);
                    A00.EP6(c209359Nt.A01);
                }
                this.A08 = c209359Nt;
                RunnableC208819Lp runnableC208819Lp = c209359Nt.A00;
                if (runnableC208819Lp != null) {
                    Looper myLooper = Looper.myLooper();
                    C14360o3.A0A(myLooper);
                    Handler handler = new Handler(myLooper);
                    C50161MDo c50161MDo = new C50161MDo(runnableC208819Lp, 27);
                    C14360o3.A0C(runnableC208819Lp.A05, "null cannot be cast to non-null type com.instagram.video.gl.AsyncRendererInitializer");
                    if (C14360o3.A0K(Looper.myLooper(), handler.getLooper())) {
                        c50161MDo.invoke();
                    } else {
                        handler.post(new RunnableC24502AtL(c50161MDo));
                    }
                }
                C44529JmZ c44529JmZ = this.A06;
                if (c44529JmZ != null) {
                    c44529JmZ.A02.F8m(new C45761KNo(i, i2));
                    return;
                }
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C14360o3.A0B(surfaceTexture, 0);
        Dr6(new Surface(surfaceTexture), i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void A00() {
        RunnableC208819Lp runnableC208819Lp;
        C209359Nt c209359Nt = this.A08;
        if (c209359Nt != null && (runnableC208819Lp = c209359Nt.A00) != null) {
            Object obj = runnableC208819Lp.A06;
            synchronized (obj) {
                runnableC208819Lp.A0E = false;
                obj.notify();
            }
        }
    }

    @Override // X.InterfaceC185668Ll
    public final void DrA() {
        C209359Nt c209359Nt = this.A08;
        if (c209359Nt != null) {
            InterfaceC25193BCq interfaceC25193BCq = this.A07;
            RunnableC208819Lp runnableC208819Lp = c209359Nt.A00;
            if (interfaceC25193BCq != null && runnableC208819Lp != null) {
                interfaceC25193BCq.DfH();
                c209359Nt.A01.A02 = null;
                runnableC208819Lp.A00();
                c209359Nt.A00 = null;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C209359Nt c209359Nt = this.A08;
        if (c209359Nt != null) {
            InterfaceC25193BCq interfaceC25193BCq = this.A07;
            RunnableC208819Lp runnableC208819Lp = c209359Nt.A00;
            if (interfaceC25193BCq != null && runnableC208819Lp != null) {
                interfaceC25193BCq.DfH();
                c209359Nt.A01.A02 = null;
                runnableC208819Lp.A00();
                c209359Nt.A00 = null;
                return true;
            }
            return true;
        }
        return true;
    }

    public C9KK(Context context, C199468rn c199468rn, UserSession userSession, C81N c81n, FilterGroupModel filterGroupModel, Integer num, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C14360o3.A0B(userSession, 2);
        this.A0A = context;
        this.A0C = userSession;
        this.A0G = z;
        this.A0D = c81n;
        this.A0J = z2;
        this.A0N = z3;
        this.A0M = z4;
        this.A0E = filterGroupModel;
        this.A0L = z5;
        this.A0F = num;
        this.A0B = c199468rn;
        this.A0K = z6;
        this.A0H = z7;
        this.A0I = z8;
        this.A09 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9KK(Context context, UserSession userSession, FilterGroupModel filterGroupModel, String str, boolean z, boolean z2) {
        this(context, null, userSession, null, filterGroupModel, null, str, false, true, false, true, false, z, false, z2);
        AbstractC167007dF.A1D(context, 1, userSession);
    }
}
