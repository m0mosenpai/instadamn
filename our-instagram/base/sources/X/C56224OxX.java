package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import java.util.List;

/* renamed from: X.OxX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56224OxX implements InterfaceC25169BBp {
    public final /* synthetic */ P0A A00;

    public C56224OxX(P0A p0a) {
        this.A00 = p0a;
    }

    @Override // X.InterfaceC25169BBp
    public final void DKG(float f) {
        FilterModel A0C;
        GainmapFilter gainmapFilter;
        P0A p0a = this.A00;
        C54777OIr c54777OIr = p0a.A0G;
        FilterChain filterChain = p0a.A02;
        c54777OIr.A00 = f;
        if (filterChain != null && (A0C = MSX.A0C(filterChain, 28)) != null && (A0C instanceof GainmapFilter) && (gainmapFilter = (GainmapFilter) A0C) != null) {
            gainmapFilter.A00(f);
        }
        O7G o7g = p0a.A04;
        if (o7g != null) {
            C52254NAu c52254NAu = o7g.A00;
            C50727MaS c50727MaS = o7g.A01;
            if (OOP.A01(c52254NAu)) {
                c52254NAu.A0R.EJI(c50727MaS);
                return;
            }
            List list = c52254NAu.A0E;
            int indexOf = list.indexOf(c50727MaS);
            int max = Math.max(0, c52254NAu.A01 - 1);
            int min = Math.min(AbstractC25226BEj.A05(list), c52254NAu.A01 + 1);
            c50727MaS.A00 = true;
            if (indexOf < max || indexOf > min) {
                return;
            }
            c50727MaS.CoJ();
            return;
        }
        p0a.EGV();
    }
}
