package X;

import android.os.Handler;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.AZz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23426AZz implements InterfaceC197408oB {
    public final InterfaceC16660sJ A00;
    public final int A01;
    public final int A02;
    public final Handler A03;
    public final UserSession A04;
    public final C197328o3 A05;
    public final FilterGroupModel A06;
    public final InterfaceC197178nn A07;

    public C23426AZz(UserSession userSession, C197328o3 c197328o3, FilterGroupModel filterGroupModel, InterfaceC197178nn interfaceC197178nn, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        C14360o3.A0B(interfaceC197178nn, 2);
        this.A04 = userSession;
        this.A07 = interfaceC197178nn;
        this.A05 = c197328o3;
        this.A06 = filterGroupModel;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = interfaceC16660sJ;
        this.A03 = AbstractC167007dF.A0J();
    }

    @Override // X.InterfaceC197408oB
    public final /* synthetic */ void CNl(C197368o7 c197368o7) {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    @Override // X.InterfaceC197408oB
    public final void EGX(C197368o7 c197368o7) {
        int i;
        int i2;
        int A01;
        C14360o3.A0B(c197368o7, 0);
        ?? obj = new Object();
        try {
            FilterGroupModel filterGroupModel = this.A06;
            if (filterGroupModel != null && (i = this.A02) > 0 && (i2 = this.A01) > 0) {
                FilterChain deepCopy = ((FilterGroupModelImpl) filterGroupModel).A02.deepCopy();
                UserSession userSession = this.A04;
                InterfaceC197178nn interfaceC197178nn = this.A07;
                C54777OIr c54777OIr = new C54777OIr(userSession, interfaceC197178nn, C05F.A01);
                FilterModel A0g = AbstractC166987dD.A0g(deepCopy.A01, 3);
                if (A0g instanceof SurfaceCropFilterModel) {
                    SurfaceCropFilterModel surfaceCropFilterModel = (SurfaceCropFilterModel) A0g;
                    ?? obj2 = new Object();
                    obj2.A00 = surfaceCropFilterModel;
                    C9RG c9rg = new C9RG(this.A05, obj2, interfaceC197178nn, false);
                    c9rg.A00 = new C23330AVp(deepCopy, c54777OIr);
                    c197368o7.A0B(c9rg);
                    C9RG.A00(c9rg);
                    int i3 = surfaceCropFilterModel.A05;
                    c197368o7.A06(i3, i3, 0, false, false);
                    float f = surfaceCropFilterModel.A01;
                    if (f > 0.0f) {
                        int i4 = i;
                        float f2 = i;
                        float f3 = i2;
                        if (f <= f2 / f3) {
                            A01 = C1H4.A01(f2 / f);
                        } else {
                            i4 = AbstractC166987dD.A0B(f3, f);
                            A01 = i2;
                        }
                        c197368o7.A05(i4, A01);
                        c197368o7.A09(null, i, i2);
                        c197368o7.A07(deepCopy);
                        C179067xI.A00(c197368o7.A0C, null);
                        obj.A00 = c197368o7.A00();
                    }
                }
            }
        } finally {
            this.A03.post(new RunnableC24593Auo(this, obj));
            c197368o7.A03();
        }
    }

    @Override // X.InterfaceC197408oB
    public final void cancel() {
        this.A03.post(new RunnableC24312AqH(this));
    }
}
