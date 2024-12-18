package X;

import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;

/* renamed from: X.OIr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54777OIr {
    public float A00;
    public boolean A01;
    public final boolean A02;
    public final Integer A03;

    public final void A00(FilterChain filterChain, C197728oj c197728oj) {
        SurfaceCropFilterModel surfaceCropFilterModel;
        GainmapFilter gainmapFilter;
        boolean z;
        String str;
        SparseArray sparseArray = filterChain.A01;
        FilterModel A0g = AbstractC166987dD.A0g(sparseArray, 3);
        if (A0g != null && (A0g instanceof SurfaceCropFilterModel)) {
            surfaceCropFilterModel = (SurfaceCropFilterModel) A0g;
        } else {
            surfaceCropFilterModel = null;
        }
        FilterModel A0g2 = AbstractC166987dD.A0g(sparseArray, 28);
        if (A0g2 != null && (A0g2 instanceof GainmapFilter)) {
            gainmapFilter = (GainmapFilter) A0g2;
        } else {
            gainmapFilter = null;
        }
        if (surfaceCropFilterModel != null && gainmapFilter != null) {
            if (this.A03.intValue() != 0) {
                int i = 0;
                if (this.A02 && c197728oj != null && c197728oj.A04.A00) {
                    z = true;
                    str = "gainmap_alpha";
                } else {
                    z = false;
                    str = "normal";
                }
                surfaceCropFilterModel.A08 = str;
                gainmapFilter.A0A = true;
                if (z) {
                    i = 4;
                }
                gainmapFilter.A09 = i;
                gainmapFilter.A01(true);
                return;
            }
            if (this.A02 && c197728oj != null && c197728oj.A04.A00) {
                C15080pO c15080pO = c197728oj.A05;
                if (c15080pO.A00 > 1.0f) {
                    surfaceCropFilterModel.A08 = "gainmap_alpha";
                    gainmapFilter.A0A = true;
                    C197728oj.A00(gainmapFilter, c197728oj);
                    gainmapFilter.A05 = c15080pO.A00;
                    gainmapFilter.A09 = 2;
                    gainmapFilter.A01(false);
                    gainmapFilter.A00(this.A00);
                    this.A01 = true;
                    return;
                }
            }
            surfaceCropFilterModel.A08 = "normal";
            gainmapFilter.A0A = false;
            this.A01 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C54777OIr(com.instagram.common.session.UserSession r6, X.InterfaceC197178nn r7, java.lang.Integer r8) {
        /*
            r5 = this;
            boolean r4 = X.AbstractC167007dF.A1U(r7)
            r5.<init>()
            r5.A03 = r8
            int r2 = r8.intValue()
            r3 = 0
            r1 = 34
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r2 == r4) goto L37
            if (r0 < r1) goto L30
            boolean r0 = r7.Cev()
            if (r0 == 0) goto L30
            boolean r0 = X.C2J9.A06(r6)
            if (r0 == 0) goto L30
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321623594378892(0x810a530002268c, double:3.033279244299592E-306)
            boolean r0 = X.C18U.A06(r2, r6, r0)
        L2d:
            if (r0 == 0) goto L30
            r3 = 1
        L30:
            r5.A02 = r3
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A00 = r0
            return
        L37:
            if (r0 < r1) goto L30
            boolean r0 = r7.Cev()
            if (r0 == 0) goto L30
            boolean r0 = X.C2J9.A05(r6)
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54777OIr.<init>(com.instagram.common.session.UserSession, X.8nn, java.lang.Integer):void");
    }
}
