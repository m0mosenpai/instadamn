package X;

import android.content.Context;
import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* loaded from: classes9.dex */
public final class P0A implements InterfaceC197218ns, InterfaceC197258nw, InterfaceC57934Pme {
    public int A00;
    public int A01;
    public FilterChain A02;
    public C197368o7 A03;
    public O7G A04;
    public C81N A05;
    public boolean A06;
    public CropInfo A07;
    public OJK A08;
    public boolean A09;
    public final Context A0A;
    public final Handler A0B;
    public final UserSession A0C;
    public final MXC A0D;
    public final MXC A0E;
    public final MXD A0F;
    public final C54777OIr A0G;
    public final C197328o3 A0H;
    public final InterfaceC197178nn A0I;
    public final Runnable A0J;
    public final InterfaceC185668Ll A0K;
    public final InterfaceC25169BBp A0L;
    public volatile int A0M;
    public volatile int A0N;
    public volatile SurfaceCropFilter A0O;
    public volatile InterfaceC197718oi A0P;
    public volatile boolean A0Q;
    public volatile boolean A0R;

    public P0A(Context context, UserSession userSession, CropInfo cropInfo, MXC mxc, MXC mxc2, MXD mxd, InterfaceC197178nn interfaceC197178nn, int i) {
        AbstractC167017dG.A1R(userSession, mxd);
        this.A0A = context;
        this.A0C = userSession;
        this.A0F = mxd;
        this.A0I = interfaceC197178nn;
        this.A07 = cropInfo;
        this.A0D = mxc;
        this.A0E = mxc2;
        this.A0B = AbstractC167007dF.A0J();
        this.A0G = new C54777OIr(userSession, interfaceC197178nn, C05F.A00);
        C197328o3 c197328o3 = new C197328o3(null, userSession, this.A07, null, this, interfaceC197178nn, i, false);
        this.A0H = c197328o3;
        this.A0Q = true;
        this.A0J = new RunnableC56865PLk(this);
        this.A0K = new C56223OxW(this);
        this.A0L = new C56224OxX(this);
        c197328o3.A03 = true;
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void AP5() {
    }

    @Override // X.InterfaceC197218ns
    public final void CO2(C81N c81n, int i, int i2) {
        C14360o3.A0B(c81n, 0);
        if (!C14360o3.A0K(this.A05, c81n)) {
            C81N c81n2 = this.A05;
            if (c81n2 != null) {
                InterfaceC185668Ll interfaceC185668Ll = this.A0K;
                C14360o3.A0B(interfaceC185668Ll, 0);
                c81n2.A0E.A00.remove(interfaceC185668Ll);
            }
            C81N c81n3 = this.A05;
            if (c81n3 != null) {
                c81n3.A09 = null;
            }
            c81n.A08(this.A0K);
            boolean z = this.A0G.A02;
            c81n.A0A = z;
            c81n.A00 = 1.0f;
            if (z) {
                InterfaceC25169BBp interfaceC25169BBp = this.A0L;
                c81n.A09 = interfaceC25169BBp;
                if (interfaceC25169BBp != null) {
                    interfaceC25169BBp.DKG(c81n.A01);
                }
            }
        }
        this.A05 = c81n;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = false;
        this.A0R = false;
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void CO3(TextureView textureView, C55003OVg c55003OVg, int i, int i2) {
    }

    @Override // X.InterfaceC197218ns
    public final boolean Co2(InterfaceC58147PqC interfaceC58147PqC, FilterGroupModel filterGroupModel, EnumC53116NeT[] enumC53116NeTArr, boolean z) {
        C14360o3.A0B(enumC53116NeTArr, 3);
        this.A0F.A02.post(new PTA(this, interfaceC58147PqC, filterGroupModel, enumC53116NeTArr));
        return true;
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EEI() {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EUY(FilterModel filterModel) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EVj(float f) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EdA(C55769Opd c55769Opd) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void Ee2() {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void Efe(View view, C8Lw c8Lw, SurfaceCropFilter surfaceCropFilter) {
    }

    public static final void A00(InterfaceC197408oB interfaceC197408oB, P0A p0a) {
        MXD mxd = p0a.A0F;
        C178577wV c178577wV = mxd.A00;
        if (c178577wV != null) {
            c178577wV.A06();
            p0a.E3i();
            C197368o7 A00 = mxd.A00(interfaceC197408oB);
            if (A00 != null) {
                A00.A04();
                MXC mxc = p0a.A0E;
                AbstractC50523MSb.A0j(mxc.A00.A02, mxc.A01);
                return;
            }
        }
        interfaceC197408oB.cancel();
    }

    @Override // X.InterfaceC197218ns
    public final void AP4() {
        this.A0F.A02.post(new RunnableC56864PLj(this));
    }

    @Override // X.InterfaceC197218ns
    public final void AQ1(FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        this.A0F.A02.post(new PTY(this, filterGroupModel, interfaceC16660sJ, i, i2));
    }

    @Override // X.InterfaceC197218ns
    public final void AQ8(FilterGroupModel filterGroupModel) {
        if (filterGroupModel != null) {
            FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
            if (!C14360o3.A0K(filterChain, this.A02)) {
                this.A02 = filterChain;
                InterfaceC197718oi interfaceC197718oi = this.A0P;
                if (interfaceC197718oi != null) {
                    this.A0G.A00(filterChain, interfaceC197718oi.B9M());
                }
            }
        }
        EGV();
    }

    @Override // X.InterfaceC197218ns
    public final CropInfo AtF() {
        return this.A07;
    }

    @Override // X.InterfaceC197218ns
    public final boolean CS5() {
        return this.A09;
    }

    @Override // X.InterfaceC197218ns
    public final boolean CVj() {
        return this.A0G.A02;
    }

    @Override // X.InterfaceC197258nw
    public final void DV1(CropInfo cropInfo, String str, int i) {
        MXA.A01(cropInfo, this.A0D.A03, str, i);
    }

    @Override // X.InterfaceC57934Pme
    public final void E3i() {
        Handler handler = this.A0F.A02;
        Runnable runnable = this.A0J;
        handler.removeCallbacks(runnable);
        handler.postAtFrontOfQueue(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    @Override // X.C8MA
    public final void EGV() {
        int i;
        int i2;
        int A02;
        FilterChain filterChain = this.A02;
        if (filterChain != null) {
            FilterModel A0C = MSX.A0C(filterChain, 3);
            if (A0C instanceof SurfaceCropFilterModel) {
                SurfaceCropFilterModel surfaceCropFilterModel = (SurfaceCropFilterModel) A0C;
                ?? obj = new Object();
                obj.A00 = surfaceCropFilterModel;
                this.A0O = obj;
                float f = surfaceCropFilterModel.A01;
                if (f > 0.0f && (i = this.A01) > 0 && (i2 = this.A00) > 0) {
                    int max = Math.max(i, i2);
                    float f2 = max;
                    if (f < 1.0f) {
                        A02 = max;
                        max = AbstractC166987dD.A0B(f2, f);
                    } else {
                        A02 = MSW.A02(f2, f);
                    }
                    if (this.A0N != max || this.A0M != A02) {
                        this.A0N = max;
                        this.A0M = A02;
                        OJK ojk = this.A08;
                        if (ojk != null) {
                            ojk.A00(max, A02);
                        }
                    }
                }
            }
        }
        this.A0F.A02.post(new RunnableC56866PLl(this));
    }

    @Override // X.InterfaceC197218ns
    public final void ESU(CropInfo cropInfo) {
        this.A07 = cropInfo;
        this.A0H.A01 = cropInfo;
        this.A09 = true;
    }

    @Override // X.InterfaceC197218ns
    public final void EaN(int i, int i2) {
        if (i > 0 && i2 > 0) {
            this.A01 = i;
            this.A00 = i2;
        }
    }

    @Override // X.InterfaceC197218ns
    public final void Ea5(OJK ojk) {
        this.A08 = ojk;
    }

    @Override // X.InterfaceC197218ns
    public final void Ecn(O7G o7g) {
        this.A04 = o7g;
    }
}
