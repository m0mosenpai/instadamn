package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filter.FilterGroup;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class P09 implements InterfaceC197218ns {
    public InterfaceC58147PqC A00;
    public OJK A01;
    public C55003OVg A02;
    public InterfaceC197718oi A03;
    public YRL A04;
    public boolean A05;
    public boolean A06;
    public C55070OaQ A08;
    public C55003OVg A0A;
    public C56395P2i A0B;
    public final int A0C;
    public final UserSession A0E;
    public final MYS A0F;
    public final MYS A0G;
    public final C197328o3 A0H;
    public final C197268nx A0I;
    public final Context A0J;
    public final OA8 A0K;
    public final O7U A0L;
    public final InterfaceC197258nw A0M;
    public final O2O A0N;
    public final InterfaceC58047PoY A0O;
    public volatile FilterGroupModel A0P;
    public C55769Opd A09 = null;
    public TextureView A07 = null;
    public final Handler A0D = AbstractC167007dF.A0J();

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.instagram.filterkit.filter.FilterGroup$UnifiedFilterParamCallback] */
    public static boolean A00(InterfaceC58147PqC interfaceC58147PqC, final P09 p09, FilterGroupModel filterGroupModel, EnumC53116NeT... enumC53116NeTArr) {
        p09.A0P = filterGroupModel;
        InterfaceC58147PqC interfaceC58147PqC2 = p09.A00;
        if (interfaceC58147PqC2 != null) {
            interfaceC58147PqC2.DfF();
        }
        p09.A00 = interfaceC58147PqC;
        Context context = p09.A0J;
        UserSession userSession = p09.A0E;
        ArrayList A00 = AbstractC53931Nt4.A00(context, userSession, p09.A0K, p09.A0L, enumC53116NeTArr, 1, false, false, false);
        if (A00.size() == 0) {
            C11T.A02(new Runnable() { // from class: X.PMK
                @Override // java.lang.Runnable
                public final void run() {
                    InterfaceC58147PqC interfaceC58147PqC3 = P09.this.A00;
                    interfaceC58147PqC3.getClass();
                    interfaceC58147PqC3.DfI(AbstractC166987dD.A1E());
                }
            });
            return false;
        }
        if (p09.A01()) {
            p09.A00.DfK();
            if (p09.A0A == null) {
                p09.A0A = new C55003OVg();
            }
            InterfaceC58147PqC interfaceC58147PqC3 = p09.A00;
            MYS mys = p09.A0G;
            C55126Obn A002 = mys.A00();
            A002.getClass();
            InterfaceC58176Pqg interfaceC58176Pqg = A002.A02;
            FilterGroupModel filterGroupModel2 = p09.A0P;
            filterGroupModel2.getClass();
            FilterGroup filterGroup = new FilterGroup(((FilterGroupModelImpl) filterGroupModel2).A02, new Object());
            SurfaceCropFilter A003 = A0R.A00(p09.A0P, "ImageRenderController");
            FilterGroupModel filterGroupModel3 = p09.A0P;
            filterGroupModel3.getClass();
            Integer num = ((FilterGroupModelImpl) filterGroupModel3).A03;
            int i = p09.A0C;
            C56396P2j c56396P2j = new C56396P2j(context, userSession, interfaceC58147PqC3, A003, interfaceC58176Pqg, p09.A0A, filterGroup, num, A00, new MW9(p09, 1), new MW9(p09, 2), i);
            C55126Obn A004 = mys.A00();
            A004.getClass();
            synchronized (A004.A04) {
                if (A004.A00) {
                    throw AbstractC31175DnJ.A0V("requestRender called after requestDestroy ", A004.A05);
                }
            }
            A004.A07.offer(c56396P2j);
            C55126Obn.A01(A004);
            return true;
        }
        C0K8.A0C("ImageRenderController", "maybeDoFinalRender(): failed render request, return false.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
    
        if (r1 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            X.MYS r1 = r3.A0G     // Catch: java.lang.Throwable -> L1d
            X.Obn r0 = r1.A00()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1a
            X.Obn r0 = r1.A00()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = r0.A04     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r0.A00     // Catch: java.lang.Throwable -> L14
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0     // Catch: java.lang.Throwable -> L1d
        L17:
            r0 = 1
            if (r1 == 0) goto L1b
        L1a:
            r0 = 0
        L1b:
            monitor-exit(r3)
            return r0
        L1d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P09.A01():boolean");
    }

    @Override // X.InterfaceC197218ns
    public final synchronized void AP5() {
        InterfaceC197718oi interfaceC197718oi = this.A03;
        if (interfaceC197718oi != null) {
            interfaceC197718oi.cleanup();
            this.A03 = null;
        }
        this.A05 = false;
        this.A00 = null;
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void AQ1(FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void CO2(C81N c81n, int i, int i2) {
    }

    @Override // X.InterfaceC197218ns
    public final synchronized boolean Co2(InterfaceC58147PqC interfaceC58147PqC, FilterGroupModel filterGroupModel, EnumC53116NeT[] enumC53116NeTArr, boolean z) {
        boolean A00;
        TextureView textureView = this.A07;
        C55070OaQ c55070OaQ = this.A08;
        if (c55070OaQ != null && textureView != null && textureView.getBitmap() != null && this.A09 != null) {
            C26076Bg5 c26076Bg5 = new C26076Bg5(textureView.getBitmap(), 0L);
            C55769Opd c55769Opd = this.A09;
            C14360o3.A0B(c55769Opd, 1);
            c55070OaQ.A09.submit(new PSA(c26076Bg5, c55769Opd, c55070OaQ));
        }
        if (z) {
            if (C18U.A06(C06090Tz.A05, this.A0E, 36322637206530424L)) {
                C14120nc.A00().ATO(new C52387NGi(interfaceC58147PqC, this, filterGroupModel, enumC53116NeTArr));
                A00 = true;
            }
        }
        A00 = A00(interfaceC58147PqC, this, filterGroupModel, enumC53116NeTArr);
        return A00;
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EEI() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0011, code lost:
    
        if (r0 != false) goto L14;
     */
    @Override // X.C8MA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void EGV() {
        /*
            r5 = this;
            monitor-enter(r5)
            X.P2i r4 = r5.A0B     // Catch: java.lang.Throwable -> L49
            boolean r0 = com.instagram.util.creation.ShaderBridge.sLoaded     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L13
            java.lang.Object r1 = com.instagram.util.creation.ShaderBridge.sLock     // Catch: java.lang.Throwable -> L49
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L49
            boolean r0 = com.instagram.util.creation.ShaderBridge.sLoaded     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            goto L46
        L11:
            if (r0 == 0) goto L47
        L13:
            if (r4 == 0) goto L47
            boolean r0 = r5.A01()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L47
            X.MYS r0 = r5.A0G     // Catch: java.lang.Throwable -> L49
            X.Obn r3 = r0.A00()     // Catch: java.lang.Throwable -> L49
            r3.getClass()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r2 = r3.A04     // Catch: java.lang.Throwable -> L49
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
            boolean r0 = r3.A00     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L3b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            java.util.Queue r1 = r3.A07     // Catch: java.lang.Throwable -> L49
            boolean r0 = r1.contains(r4)     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L37
            r1.offer(r4)     // Catch: java.lang.Throwable -> L49
        L37:
            X.C55126Obn.A01(r3)     // Catch: java.lang.Throwable -> L49
            goto L47
        L3b:
            java.lang.String r1 = "requestRender called after requestDestroy "
            java.lang.String r0 = r3.A05     // Catch: java.lang.Throwable -> L44
            java.lang.IllegalStateException r0 = X.AbstractC31175DnJ.A0V(r1, r0)     // Catch: java.lang.Throwable -> L44
            throw r0     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
        L46:
            throw r0     // Catch: java.lang.Throwable -> L49
        L47:
            monitor-exit(r5)
            return
        L49:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P09.EGV():void");
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EUY(FilterModel filterModel) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EVj(float f) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void Ecn(O7G o7g) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void Ee2() {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void Efe(View view, C8Lw c8Lw, SurfaceCropFilter surfaceCropFilter) {
    }

    @Override // X.InterfaceC197218ns
    public final void AP4() {
        C56395P2i c56395P2i = this.A0B;
        if (c56395P2i != null) {
            synchronized (c56395P2i.A00) {
            }
            this.A0B = null;
            this.A04 = null;
            this.A02 = null;
        }
        this.A0F.A01.A05.A08(C05F.A00);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.instagram.filterkit.filter.FilterGroup$UnifiedFilterParamCallback] */
    @Override // X.InterfaceC197218ns
    public final void AQ8(FilterGroupModel filterGroupModel) {
        this.A0P = filterGroupModel;
        C56395P2i c56395P2i = this.A0B;
        if (c56395P2i != null) {
            FilterGroupModel filterGroupModel2 = this.A0P;
            filterGroupModel2.getClass();
            c56395P2i.A05 = new FilterGroup(((FilterGroupModelImpl) filterGroupModel2).A02, new Object());
            EGV();
        }
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ CropInfo AtF() {
        return null;
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ boolean CS5() {
        return false;
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ boolean CVj() {
        return false;
    }

    @Override // X.InterfaceC197218ns
    public final void ESU(CropInfo cropInfo) {
        this.A0H.A01 = cropInfo;
    }

    @Override // X.InterfaceC197218ns
    public final void EaN(int i, int i2) {
        C56395P2i c56395P2i = this.A0B;
        c56395P2i.getClass();
        c56395P2i.A09 = Integer.valueOf(i);
        c56395P2i.A08 = Integer.valueOf(i2);
        OJK ojk = this.A01;
        if (ojk != null) {
            ojk.A00(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.PzK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [X.U7W, java.lang.Object] */
    public P09(Context context, OJQ ojq, UserSession userSession, CropInfo cropInfo, MYS mys, MYS mys2, InterfaceC197178nn interfaceC197178nn, int i) {
        P04 p04 = new P04(this);
        this.A0M = p04;
        this.A0N = new O2O(this);
        this.A0O = new C56394P2h(this);
        this.A0J = context;
        this.A0E = userSession;
        this.A0F = mys;
        this.A0C = i;
        this.A0K = new OA8(userSession, true, false);
        this.A0L = new O7U(userSession, false);
        this.A0H = new C197328o3(null, userSession, cropInfo, null, p04, interfaceC197178nn, i, false);
        this.A0G = mys2;
        synchronized (mys2) {
            if (mys2.A00 == null) {
                MXA mxa = mys2.A01;
                Activity activity = mxa.A02;
                UserSession userSession2 = mxa.A03;
                C55126Obn c55126Obn = new C55126Obn(activity, userSession2, mys2);
                mys2.A00 = c55126Obn;
                c55126Obn.A01 = C18U.A06(C06090Tz.A05, userSession2, 36312617047819464L);
            }
        }
        long j = C197268nx.A05;
        this.A0I = new C197268nx(new InterfaceC197288nz() { // from class: X.P08
            @Override // X.InterfaceC197288nz
            public final void EGo() {
                P09.this.EGV();
            }
        });
        if (ojq != 0) {
            String str = ojq.A01;
            this.A08 = ojq.A00(new Object(), new OLV(new C50665MYi(userSession), str), new Object(), null, str);
        }
    }

    @Override // X.InterfaceC197218ns
    public final void CO3(TextureView textureView, C55003OVg c55003OVg, int i, int i2) {
        if (A01()) {
            this.A05 = false;
            SurfaceTexture surfaceTexture = textureView.getSurfaceTexture();
            surfaceTexture.getClass();
            C55003OVg c55003OVg2 = this.A02;
            if (c55003OVg2 != null && AbstractC50102Ry.A00(c55003OVg2.A00(), surfaceTexture)) {
                return;
            }
            this.A02 = new C55003OVg(surfaceTexture);
            surfaceTexture.setDefaultBufferSize(i, i2);
            C55126Obn A00 = this.A0G.A00();
            A00.getClass();
            C56395P2i c56395P2i = new C56395P2i(this.A0N, A00.A02, this.A02);
            this.A0B = c56395P2i;
            C56397P2k c56397P2k = new C56397P2k(i, i2, true);
            this.A04 = c56397P2k;
            c56395P2i.A01.add(new PSW(c56395P2i, c56397P2k, new MW9(this, 3)));
            this.A07 = textureView;
        }
    }

    @Override // X.InterfaceC197218ns
    public final void Ea5(OJK ojk) {
        this.A01 = ojk;
    }

    @Override // X.InterfaceC197218ns
    public final void EdA(C55769Opd c55769Opd) {
        this.A09 = c55769Opd;
    }
}
