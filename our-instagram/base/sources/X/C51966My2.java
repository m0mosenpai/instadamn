package X;

import com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.My2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51966My2 extends C83P {
    public int A00;
    public final /* synthetic */ C55143Od2 A01;
    public final /* synthetic */ boolean A02;

    @Override // X.C83P
    public final void A05(EffectManifest effectManifest) {
        C14360o3.A0B(effectManifest, 0);
    }

    @Override // X.C83P
    public final void A06(String str) {
        QuickPerformanceLogger quickPerformanceLogger;
        C14360o3.A0B(str, 0);
        if (this.A02) {
            C55143Od2 c55143Od2 = this.A01;
            C55143Od2.A02(c55143Od2, C05F.A0j);
            C47815L9x c47815L9x = c55143Od2.A0C;
            if (c47815L9x != null && c47815L9x.A09 && (quickPerformanceLogger = c55143Od2.A0G) != null) {
                quickPerformanceLogger.markerPoint(603995461, "avatar_rendered_start");
                quickPerformanceLogger.markerPoint(603995461, "avatar_load_start");
            }
        }
    }

    @Override // X.C83P
    public final void A0A(String str, Throwable th) {
        C14360o3.A0B(str, 0);
        C55143Od2.A02(this.A01, C05F.A15);
    }

    public C51966My2(C55143Od2 c55143Od2, boolean z) {
        this.A02 = z;
        this.A01 = c55143Od2;
    }

    @Override // X.C83P
    public final void A03() {
        String str;
        if (this.A02) {
            C55143Od2 c55143Od2 = this.A01;
            OdrSnapshotHelper odrSnapshotHelper = c55143Od2.A01;
            if (odrSnapshotHelper == null) {
                str = "odrSnapshotHelper";
            } else {
                AKN akn = c55143Od2.A04;
                if (akn == null) {
                    str = "richMediaViewerAr3d";
                } else {
                    odrSnapshotHelper.A07.markerPoint(603995461, "/take_snapshot/render_frame/1_start");
                    if (akn.A04) {
                        AKN.A01(akn);
                        return;
                    }
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    @Override // X.C83P
    public final void A04() {
        boolean z;
        if (this.A02) {
            C55143Od2 c55143Od2 = this.A01;
            C47815L9x c47815L9x = c55143Od2.A0C;
            if (c47815L9x != null) {
                z = c47815L9x.A09;
            } else {
                z = false;
            }
            String str = "odrSnapshotHelper";
            if (z && (!c55143Od2.A0A || !c55143Od2.A08)) {
                if (this.A00 == 0) {
                    OdrSnapshotHelper odrSnapshotHelper = c55143Od2.A01;
                    if (odrSnapshotHelper != null) {
                        int i = odrSnapshotHelper.A00 + 1;
                        odrSnapshotHelper.A00 = i;
                        odrSnapshotHelper.A07.markerPoint(603995461, AnonymousClass001.A0R(AnonymousClass001.A0O("/take_snapshot/render_frame/", i), "_end"));
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                AKN akn = c55143Od2.A04;
                if (akn == null) {
                    str = "richMediaViewerAr3d";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                if (akn.A04) {
                    akn.A0B.EGZ(null);
                }
            } else if (c47815L9x != null && c47815L9x.A09 && !c55143Od2.A09) {
                QuickPerformanceLogger quickPerformanceLogger = c55143Od2.A0G;
                if (quickPerformanceLogger != null) {
                    quickPerformanceLogger.markerPoint(603995461, "avatar_ready_end");
                }
                c55143Od2.A09 = true;
                C55143Od2.A02(c55143Od2, C05F.A07);
            } else {
                OdrSnapshotHelper odrSnapshotHelper2 = c55143Od2.A01;
                if (odrSnapshotHelper2 != null) {
                    int i2 = odrSnapshotHelper2.A00 + 1;
                    odrSnapshotHelper2.A00 = i2;
                    odrSnapshotHelper2.A07.markerPoint(603995461, AnonymousClass001.A0R(AnonymousClass001.A0O("/take_snapshot/render_frame/", i2), "_end"));
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        int i3 = this.A00;
        if (i3 <= 3) {
            int i4 = i3 + 1;
            this.A00 = i4;
            if (i4 == 3) {
                C55143Od2.A02(this.A01, C05F.A0Y);
            }
        }
    }

    @Override // X.C83P
    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        AbstractC167017dG.A1N(str, effectManifest);
        C55143Od2.A02(this.A01, C05F.A0N);
    }
}
