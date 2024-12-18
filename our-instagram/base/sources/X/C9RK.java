package X;

import android.content.Context;
import android.util.SparseArray;
import android.view.TextureView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.9RK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9RK implements InterfaceC197218ns {
    public GainmapFilter A04;
    public IgGPUImageLoader A05;
    public C197768on A06;
    public C197768on A07;
    public InterfaceC178297w3 A08;
    public C197368o7 A09;
    public CropInfo A0A;
    public InterfaceC197718oi A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public C55070OaQ A0G;
    public OJK A0I;
    public boolean A0J;
    public final C178577wV A0K;
    public final AnonymousClass840 A0L;
    public final InterfaceC197238nu A0M;
    public final C197328o3 A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final int A0Q;
    public final Context A0R;
    public final UserSession A0S;
    public final C23328AVn A0T;
    public final InterfaceC197178nn A0U;
    public int A03 = -1;
    public int A02 = -1;
    public float A01 = 1.0f;
    public float A00 = 1.0f;
    public C55769Opd A0H = null;
    public C8Lw A0B = null;

    @Override // X.InterfaceC197218ns
    public final void AP4() {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void AQ1(FilterGroupModel filterGroupModel, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void AQ8(FilterGroupModel filterGroupModel) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void CO2(C81N c81n, int i, int i2) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void CO3(TextureView textureView, C55003OVg c55003OVg, int i, int i2) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void Ecn(O7G o7g) {
    }

    @Override // X.InterfaceC197218ns
    public final void Ee2() {
        this.A0F = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r4 == false) goto L9;
     */
    @Override // X.InterfaceC197218ns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Efe(android.view.View r11, final X.C8Lw r12, final com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r13) {
        /*
            r10 = this;
            r6 = r10
            X.7wV r1 = r10.A0K
            boolean r0 = r1.A08()
            if (r0 != 0) goto Lc
            r1.A03()
        Lc:
            X.7yX r0 = X.InterfaceC180117z1.A01
            X.7yV r2 = r1.A02(r0)
            X.7z1 r2 = (X.InterfaceC180117z1) r2
            r2.EJx()
            X.8nu r1 = r10.A0M
            r1.getClass()
            X.8oM r0 = new X.8oM
            r0.<init>(r1)
            X.7z0 r2 = (X.C180107z0) r2
            r2.A00 = r0
            X.8o7 r5 = A00(r10)
            boolean r4 = android.os.Process.is64Bit()
            com.instagram.common.session.UserSession r3 = r10.A0S
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321919947057043(0x810a9800012793, double:3.033466658926571E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L3f
            r9 = 1
            if (r4 != 0) goto L40
        L3f:
            r9 = 0
        L40:
            X.AzQ r4 = new X.AzQ
            r7 = r12
            r8 = r13
            r4.<init>()
            r5.A0C(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9RK.Efe(android.view.View, X.8Lw, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter):void");
    }

    public static C197368o7 A00(C9RK c9rk) {
        C197368o7 c197368o7 = c9rk.A09;
        if (c197368o7 == null) {
            C197368o7 AN0 = ((InterfaceC180137z3) c9rk.A0K.A02(InterfaceC180137z3.A00)).AN0(null);
            c9rk.A09 = AN0;
            return AN0;
        }
        return c197368o7;
    }

    @Override // X.InterfaceC197218ns
    public final void AP5() {
        String str;
        this.A0K.A04();
        this.A0N.A06();
        IgGPUImageLoader igGPUImageLoader = this.A05;
        if (igGPUImageLoader != null) {
            igGPUImageLoader.releaseImage();
            this.A05 = null;
        }
        InterfaceC178297w3 interfaceC178297w3 = this.A08;
        if (interfaceC178297w3 != null && (str = this.A0D) != null) {
            interfaceC178297w3.E7h(str);
            this.A08 = null;
            this.A0D = null;
        }
    }

    @Override // X.InterfaceC197218ns
    public final CropInfo AtF() {
        return this.A0A;
    }

    @Override // X.InterfaceC197218ns
    public final boolean CS5() {
        return this.A0J;
    }

    @Override // X.InterfaceC197218ns
    public final boolean CVj() {
        return this.A0P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36321623594378892L) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36323083883129789L) == false) goto L32;
     */
    @Override // X.InterfaceC197218ns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Co2(X.InterfaceC58147PqC r40, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r41, X.EnumC53116NeT[] r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9RK.Co2(X.PqC, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel, X.NeT[], boolean):boolean");
    }

    @Override // X.InterfaceC197218ns
    public final void EEI() {
        C197368o7 c197368o7 = this.A09;
        if (c197368o7 != null) {
            c197368o7.A03();
            this.A09 = null;
        }
        this.A0K.A04();
        this.A0F = true;
    }

    @Override // X.InterfaceC197218ns
    public final void ESU(CropInfo cropInfo) {
        this.A0N.A01 = cropInfo;
        this.A0A = cropInfo;
        this.A0J = true;
    }

    @Override // X.InterfaceC197218ns
    public final void EUY(FilterModel filterModel) {
        String str;
        if (filterModel != null) {
            if (filterModel instanceof FilterChain) {
                SparseArray sparseArray = ((FilterChain) filterModel).A01;
                SurfaceCropFilterModel surfaceCropFilterModel = (SurfaceCropFilterModel) AbstractC166987dD.A0g(sparseArray, 3);
                if (surfaceCropFilterModel != null) {
                    if (this.A0P) {
                        str = "gainmap_alpha";
                    } else {
                        str = "surface_crop";
                    }
                    surfaceCropFilterModel.A08 = str;
                }
                GainmapFilter gainmapFilter = (GainmapFilter) AbstractC166987dD.A0g(sparseArray, 28);
                this.A04 = gainmapFilter;
                if (gainmapFilter != null) {
                    gainmapFilter.A0A = this.A0P;
                }
            }
            A00(this).A07(filterModel);
        }
    }

    @Override // X.InterfaceC197218ns
    public final void EaN(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        OJK ojk = this.A0I;
        if (ojk != null) {
            ojk.A00(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if (X.C2J9.A05(r15) == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.PzK, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.U7W, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9RK(android.content.Context r12, X.C178577wV r13, X.OJQ r14, com.instagram.common.session.UserSession r15, com.instagram.creation.base.CropInfo r16, X.AnonymousClass840 r17, X.InterfaceC197238nu r18, X.InterfaceC197258nw r19, X.C23328AVn r20, X.InterfaceC197178nn r21, int r22, boolean r23) {
        /*
            r11 = this;
            r11.<init>()
            r0 = -1
            r11.A03 = r0
            r11.A02 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.A01 = r0
            r11.A00 = r0
            r3 = 0
            r11.A0H = r3
            r11.A0B = r3
            r11.A0R = r12
            r8 = r21
            r11.A0U = r8
            r5 = r16
            r11.A0A = r5
            r4 = r15
            r11.A0S = r15
            r0 = r20
            r11.A0T = r0
            r11.A0K = r13
            r0 = r18
            r11.A0M = r0
            r2 = r17
            r11.A0L = r2
            r9 = r22
            r11.A0Q = r9
            r0 = r23
            r11.A0O = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r1 < r0) goto L49
            boolean r0 = r8.Cev()
            if (r0 == 0) goto L49
            boolean r1 = X.C2J9.A05(r15)
            r0 = 1
            if (r1 != 0) goto L4a
        L49:
            r0 = 0
        L4a:
            r11.A0P = r0
            r10 = 0
            r2.getClass()
            X.841 r6 = r2.A00()
            X.8o3 r2 = new X.8o3
            r7 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A0N = r2
            r2.A04 = r0
            r0 = 1
            r2.A03 = r0
            r5 = r14
            if (r14 == 0) goto L82
            java.lang.String r10 = r14.A01
            X.MYi r0 = new X.MYi
            r0.<init>(r15)
            X.OLV r7 = new X.OLV
            r7.<init>(r0, r10)
            X.PzK r6 = new X.PzK
            r6.<init>()
            X.U7W r8 = new X.U7W
            r8.<init>()
            r9 = r3
            X.OaQ r0 = r5.A00(r6, r7, r8, r9, r10)
            r11.A0G = r0
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9RK.<init>(android.content.Context, X.7wV, X.OJQ, com.instagram.common.session.UserSession, com.instagram.creation.base.CropInfo, X.840, X.8nu, X.8nw, X.AVn, X.8nn, int, boolean):void");
    }

    @Override // X.C8MA
    public final void EGV() {
        A00(this).A0C(new Runnable() { // from class: X.ArI
            @Override // java.lang.Runnable
            public final void run() {
                GainmapFilter gainmapFilter;
                C9RK c9rk = C9RK.this;
                if (!c9rk.A0E && c9rk.A07 != null && C9RK.A00(c9rk).A04 != null) {
                    if (c9rk.A0P && (gainmapFilter = c9rk.A04) != null) {
                        float f = 1.0f;
                        if (c9rk.A00 > 1.0f) {
                            f = c9rk.A01;
                        }
                        gainmapFilter.A00(f);
                    }
                    try {
                        C197768on c197768on = c9rk.A07;
                        InterfaceC197718oi interfaceC197718oi = c9rk.A0C;
                        interfaceC197718oi.getClass();
                        c197768on.A02(interfaceC197718oi.getTexture());
                    } catch (IllegalStateException | InterruptedException e) {
                        C9RK.A00(c9rk).A0D("OneCameraImageRenderController SharedTextureVideoInput onFrameAvailable exception", "OneCameraImageRenderController", e);
                        AbstractC12120kG.A0H("OneCameraImageRenderController SharedTextureVideoInput onFrameAvailable exception", e);
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC197218ns
    public final void EVj(float f) {
        this.A01 = f;
    }

    @Override // X.InterfaceC197218ns
    public final void Ea5(OJK ojk) {
        this.A0I = ojk;
    }

    @Override // X.InterfaceC197218ns
    public final void EdA(C55769Opd c55769Opd) {
        this.A0H = c55769Opd;
    }
}
