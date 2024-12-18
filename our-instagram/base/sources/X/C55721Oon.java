package X;

import android.view.Surface;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.Oon, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55721Oon implements InterfaceC197408oB {
    public int A00;
    public int A01;
    public final FilterChain A02;
    public final Surface A03;
    public final /* synthetic */ P0A A04;

    @Override // X.InterfaceC197408oB
    public final void CNl(C197368o7 c197368o7) {
        int i;
        int i2;
        int A02;
        C14360o3.A0B(c197368o7, 0);
        P0A p0a = this.A04;
        C9RG c9rg = new C9RG(p0a.A0H, p0a.A0O, p0a.A0I, p0a.A0G.A02);
        c9rg.A00 = new C55604Oml(this, p0a);
        c197368o7.A0B(c9rg);
        c197368o7.A0A(c9rg.A02);
        C9RG.A00(c9rg);
        SurfaceCropFilter surfaceCropFilter = p0a.A0O;
        if (surfaceCropFilter != null) {
            SurfaceCropFilterModel surfaceCropFilterModel = surfaceCropFilter.A00;
            this.A01 = surfaceCropFilterModel.A05;
            this.A00 = surfaceCropFilterModel.A04;
            float f = surfaceCropFilterModel.A01;
            if (f > 0.0f && (i = p0a.A01) > 0 && (i2 = p0a.A00) > 0) {
                int max = Math.max(i, i2);
                float f2 = max;
                if (f < 1.0f) {
                    int A0B = AbstractC166987dD.A0B(f2, f);
                    A02 = max;
                    max = A0B;
                } else {
                    A02 = MSW.A02(f2, f);
                }
                p0a.A0N = max;
                p0a.A0M = A02;
            }
        }
        c197368o7.A06(this.A01, this.A00, 0, false, false);
        C176517t9 c176517t9 = new C176517t9(C178747wm.A01, new C176507t8(this.A03, false));
        c197368o7.A07 = c176517t9;
        c197368o7.A0C(new RunnableC24567AuO(c176517t9, c197368o7));
        c197368o7.A05(p0a.A0N, p0a.A0M);
        c197368o7.A07(this.A02);
    }

    @Override // X.InterfaceC197408oB
    public final void EGX(C197368o7 c197368o7) {
        float f;
        C14360o3.A0B(c197368o7, 0);
        int i = this.A01;
        int i2 = this.A00;
        P0A p0a = this.A04;
        int i3 = p0a.A0N;
        int i4 = p0a.A0M;
        if (p0a.A0Q && i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            C81N c81n = p0a.A05;
            if (c81n != null) {
                C54777OIr c54777OIr = p0a.A0G;
                if (c54777OIr.A01) {
                    f = c54777OIr.A00;
                } else {
                    f = 1.0f;
                }
                c81n.A00 = f;
            }
            c197368o7.A06(i, i2, 0, false, false);
            c197368o7.A05(i3, i4);
            C179067xI.A00(c197368o7.A0C, null);
            p0a.A0R = false;
            if (!p0a.A06) {
                p0a.A06 = true;
                p0a.A0B.post(new RunnableC56863PLi(p0a));
                return;
            }
            return;
        }
        p0a.A0R = false;
    }

    @Override // X.InterfaceC197408oB
    public final /* synthetic */ void cancel() {
        throw C00O.createAndThrow();
    }

    public C55721Oon(Surface surface, FilterChain filterChain, P0A p0a) {
        this.A04 = p0a;
        this.A02 = filterChain;
        this.A03 = surface;
    }
}
