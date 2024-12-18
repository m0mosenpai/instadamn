package X;

import android.view.View;
import com.facebook.R;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import java.util.Map;

/* renamed from: X.Ctg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29175Ctg implements InterfaceC43071ya {
    public float A00;
    public final Map A01;
    public final boolean A02;

    private final InterfaceC115845Ly A00(C120985dq c120985dq) {
        View view;
        View view2 = (View) this.A01.get(c120985dq);
        if (view2 != null) {
            view = view2.findViewById(R.id.clips_showreel_bloks_v2_component_id);
        } else {
            view = null;
        }
        if (!(view instanceof InterfaceC115845Ly)) {
            return null;
        }
        return (InterfaceC115845Ly) view;
    }

    private final ServerRenderedSponsoredContentView A01(C120985dq c120985dq) {
        View view = (View) this.A01.get(c120985dq);
        if (view != null) {
            ServerRenderedSponsoredContentView serverRenderedSponsoredContentView = (ServerRenderedSponsoredContentView) view.findViewById(R.id.sponsored_clips_showreel_view);
            if (serverRenderedSponsoredContentView == null) {
                return (ServerRenderedSponsoredContentView) view.findViewById(R.id.clips_server_rendered_component_id);
            }
            return serverRenderedSponsoredContentView;
        }
        return null;
    }

    public C29175Ctg(boolean z) {
        this.A02 = z;
        C18B c18b = new C18B();
        c18b.A04(MapMakerInternalMap.Strength.A01);
        c18b.A01();
        this.A01 = c18b.A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r7.A02 == false) goto L8;
     */
    @Override // X.InterfaceC43071ya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ATP(X.C59062n7 r8, X.InterfaceC57162jr r9) {
        /*
            r7 = this;
            X.AbstractC167017dG.A1N(r8, r9)
            java.lang.Object r4 = r8.A03
            X.5dq r4 = (X.C120985dq) r4
            X.1v4 r0 = r4.A06()
            boolean r0 = r0.A06()
            if (r0 == 0) goto L4b
            float r2 = r9.CGk(r8)
            X.1v4 r0 = r4.A06()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L24
            boolean r0 = r7.A02
            r6 = 1
            if (r0 != 0) goto L25
        L24:
            r6 = 0
        L25:
            float r5 = r7.A00
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r0 = X.AbstractC167007dF.A1N(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L36
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L61
        L36:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L61
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L61
            if (r6 == 0) goto L4c
            X.5Ly r0 = r7.A00(r4)
            if (r0 == 0) goto L49
            r0.E0o()
        L49:
            r7.A00 = r2
        L4b:
            return
        L4c:
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r1 = r7.A01(r4)
            if (r1 == 0) goto L49
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r0 = r1.A03
            if (r0 == 0) goto L59
            r0.E0o()
        L59:
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r0 = r1.A02
            if (r0 == 0) goto L49
            r0.E0o()
            goto L49
        L61:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8a
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L8a
            if (r6 == 0) goto L75
            X.5Ly r0 = r7.A00(r4)
            if (r0 == 0) goto L49
            r0.E0c()
            goto L49
        L75:
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r1 = r7.A01(r4)
            if (r1 == 0) goto L49
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r0 = r1.A03
            if (r0 == 0) goto L82
            r0.E0c()
        L82:
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r0 = r1.A02
            if (r0 == 0) goto L49
            r0.E0c()
            goto L49
        L8a:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L49
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 != 0) goto L49
            if (r6 == 0) goto L9e
            X.5Ly r0 = r7.A00(r4)
            if (r0 == 0) goto L49
            r0.E0l()
            goto L49
        L9e:
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r1 = r7.A01(r4)
            if (r1 == 0) goto L49
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r0 = r1.A03
            if (r0 == 0) goto Lab
            r0.E0l()
        Lab:
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r0 = r1.A02
            if (r0 == 0) goto L49
            r0.E0l()
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29175Ctg.ATP(X.2n7, X.2jr):void");
    }
}
