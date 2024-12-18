package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.TextureView;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8nr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197208nr implements InterfaceC197218ns {
    public IgGPUImageLoader A02;
    public C197768on A03;
    public C200558ty A04;
    public C1819485e A05;
    public C8Lw A06;
    public InterfaceC197718oi A07;
    public InterfaceC199648sG A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public OJK A0C;
    public final int A0D;
    public final Context A0E;
    public final C178577wV A0F;
    public final UserSession A0G;
    public final TargetViewSizeProvider A0H;
    public final InterfaceC197238nu A0I;
    public final C197328o3 A0J;
    public final C197268nx A0K;
    public final boolean A0M;
    public final int A0N;
    public final CropInfo A0O;
    public final InterfaceC197178nn A0P;
    public final AtomicBoolean A0L = new AtomicBoolean(false);
    public int A01 = -1;
    public int A00 = -1;

    public C197208nr(Context context, Bitmap bitmap, C178577wV c178577wV, UserSession userSession, CropInfo cropInfo, TargetViewSizeProvider targetViewSizeProvider, InterfaceC197238nu interfaceC197238nu, InterfaceC197258nw interfaceC197258nw, InterfaceC197178nn interfaceC197178nn, int i, int i2, boolean z) {
        this.A0E = context;
        this.A0P = interfaceC197178nn;
        this.A0O = cropInfo;
        this.A0G = userSession;
        this.A0F = c178577wV;
        this.A0I = interfaceC197238nu;
        this.A0N = i;
        this.A0D = i2;
        this.A0M = z;
        this.A0H = targetViewSizeProvider;
        long j = C197268nx.A05;
        this.A0K = new C197268nx(new InterfaceC197288nz() { // from class: X.8ny
            @Override // X.InterfaceC197288nz
            public final void EGo() {
                C197208nr c197208nr = C197208nr.this;
                if (c197208nr.A09) {
                    c197208nr.EGV();
                    C197268nx c197268nx = c197208nr.A0K;
                    c197268nx.A02.A00(c197268nx.A01);
                }
            }
        });
        this.A0J = new C197328o3(bitmap, userSession, cropInfo, null, interfaceC197258nw, interfaceC197178nn, i, true);
    }

    public final void A00() {
        this.A09 = true;
        C197268nx c197268nx = this.A0K;
        c197268nx.A03 = true;
        c197268nx.A04 = false;
        if (c197268nx.A03) {
            c197268nx.A02.A00(c197268nx.A01);
        }
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void AP4() {
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
    public final boolean Co2(InterfaceC58147PqC interfaceC58147PqC, FilterGroupModel filterGroupModel, EnumC53116NeT[] enumC53116NeTArr, boolean z) {
        Object obj = null;
        obj.getClass();
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void ESU(CropInfo cropInfo) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EVj(float f) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void Ecn(O7G o7g) {
    }

    @Override // X.InterfaceC197218ns
    public final /* synthetic */ void EdA(C55769Opd c55769Opd) {
    }

    @Override // X.InterfaceC197218ns
    public final void Ee2() {
        this.A0B = true;
    }

    @Override // X.InterfaceC197218ns
    public final void AP5() {
        this.A0F.A04();
        this.A0J.A06();
        IgGPUImageLoader igGPUImageLoader = this.A02;
        if (igGPUImageLoader != null) {
            igGPUImageLoader.releaseImage();
            this.A02 = null;
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
    public final void EEI() {
        this.A0F.A04();
        this.A0B = true;
    }

    @Override // X.C8MA
    public final void EGV() {
        ((InterfaceC180137z3) this.A0F.A02(InterfaceC180137z3.A00)).AwM().A0C(new Runnable() { // from class: X.8oJ
            @Override // java.lang.Runnable
            public final void run() {
                C197208nr c197208nr = C197208nr.this;
                C200558ty c200558ty = c197208nr.A04;
                if (c200558ty != null) {
                    AtomicBoolean atomicBoolean = c197208nr.A0L;
                    if (atomicBoolean.get()) {
                        atomicBoolean.set(false);
                        c200558ty.A0C(c197208nr.A03, null);
                    }
                }
                if (!c197208nr.A0A && c197208nr.A03 != null) {
                    C178577wV c178577wV = c197208nr.A0F;
                    C179837yX c179837yX = InterfaceC180137z3.A00;
                    if (((InterfaceC180137z3) c178577wV.A02(c179837yX)).AwM().A04 != null) {
                        try {
                            C197768on c197768on = c197208nr.A03;
                            InterfaceC197718oi interfaceC197718oi = c197208nr.A07;
                            interfaceC197718oi.getClass();
                            c197768on.A02(interfaceC197718oi.getTexture());
                        } catch (IllegalStateException | InterruptedException e) {
                            ((InterfaceC180137z3) c178577wV.A02(c179837yX)).AwM().A0D("OneCameraArImageRenderController SharedTextureVideoInput onFrameAvailable exception", "OneCameraArImageRenderController", e);
                            AbstractC12120kG.A0H("OneCameraArImageRenderController SharedTextureVideoInput onFrameAvailable exception", e);
                        }
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC197218ns
    public final void EUY(FilterModel filterModel) {
        if (filterModel != null) {
            ((InterfaceC180137z3) this.A0F.A02(InterfaceC180137z3.A00)).AwM().A07(filterModel);
        }
    }

    @Override // X.InterfaceC197218ns
    public final void EaN(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        OJK ojk = this.A0C;
        if (ojk != null) {
            ojk.A00(i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0091, code lost:
    
        if (r4 == false) goto L12;
     */
    @Override // X.InterfaceC197218ns
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Efe(android.view.View r16, final X.C8Lw r17, final com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r18) {
        /*
            r15 = this;
            r12 = r17
            int r6 = r12.getWidth()
            int r5 = r12.getHeight()
            float r1 = (float) r6
            float r0 = (float) r5
            float r1 = r1 / r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r11 = r15
            if (r0 == 0) goto L4c
            java.lang.String r2 = "Invalid aspect ratio in output view"
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            r4.<init>(r2)
            X.0wb r1 = X.C18950wb.A01
            r0 = 817902771(0x30c034b3, float:1.3984817E-9)
            X.0f5 r3 = r1.AEp(r2, r0)
            java.lang.String r0 = "outputWidth"
            r3.ABU(r0, r6)
            java.lang.String r0 = "outputHeight"
            r3.ABU(r0, r5)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r15.A0H
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.82f r2 = r0.A0K
            int r1 = r2.getWidth()
            java.lang.String r0 = "expectedWidth"
            r3.ABU(r0, r1)
            int r1 = r2.getHeight()
            java.lang.String r0 = "expectedHeight"
            r3.ABU(r0, r1)
            r3.ERI(r4)
            r3.report()
        L4c:
            X.7wV r7 = r15.A0F
            boolean r0 = r7.A08()
            if (r0 != 0) goto L57
            r7.A03()
        L57:
            X.7yX r0 = X.InterfaceC180117z1.A01
            X.7yV r2 = r7.A02(r0)
            X.7z1 r2 = (X.InterfaceC180117z1) r2
            r2.EJx()
            X.8nu r1 = r15.A0I
            r1.getClass()
            X.8oM r0 = new X.8oM
            r0.<init>(r1)
            X.7z0 r2 = (X.C180107z0) r2
            r2.A00 = r0
            X.7yX r0 = X.InterfaceC180137z3.A00
            X.7yV r0 = r7.A02(r0)
            X.7z3 r0 = (X.InterfaceC180137z3) r0
            X.8o7 r10 = r0.AwM()
            boolean r4 = android.os.Process.is64Bit()
            com.instagram.common.session.UserSession r8 = r15.A0G
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321919946991506(0x810a9800002792, double:3.0334666588851253E-306)
            boolean r0 = X.C18U.A06(r2, r8, r0)
            r3 = 1
            if (r0 == 0) goto L93
            r14 = 1
            if (r4 != 0) goto L94
        L93:
            r14 = 0
        L94:
            X.8oN r9 = new X.8oN
            r13 = r18
            r9.<init>()
            r10.A0C(r9)
            X.1Vq r4 = X.C27631Vq.A00
            android.content.Context r5 = r15.A0E
            r9 = 0
            r6 = r16
            r10 = r9
            X.8ty r2 = r4.A00(r5, r6, r7, r8, r9, r10)
            X.8sG r0 = r15.A08
            if (r0 != 0) goto Lba
            X.8sE r1 = new X.8sE
            r1.<init>(r7)
            X.8sF r0 = new X.8sF
            r0.<init>(r2, r1)
            r15.A08 = r0
        Lba:
            r15.A04 = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r15.A0L
            r0.set(r3)
            X.85e r1 = r15.A05
            if (r1 == 0) goto Ld5
            X.85h r0 = r1.A00()
            r0.EP5(r2)
            X.85h r1 = r1.A00()
            X.8sG r0 = r15.A08
            r1.EP6(r0)
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197208nr.Efe(android.view.View, X.8Lw, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter):void");
    }

    @Override // X.InterfaceC197218ns
    public final void Ea5(OJK ojk) {
        this.A0C = ojk;
    }
}
