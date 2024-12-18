package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AbO, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23508AbO implements InterfaceC25204BDc {
    public C198658qF A00;
    public C9RD A01;
    public C178577wV A02;
    public C9RE A03;
    public final Context A04;
    public final UserSession A05;

    @Override // X.InterfaceC25204BDc
    public final boolean AJF(WDI wdi, MediaComposition mediaComposition, InterfaceC25205BDd interfaceC25205BDd, U7W u7w, Map map, int i, int i2, int i3, int i4) {
        MediaEffect mediaEffect;
        FilterModel A00;
        String str;
        List unmodifiableList;
        List list;
        List unmodifiableList2;
        FilterModel A0g;
        C69688VtY c69688VtY;
        C14360o3.A0B(interfaceC25205BDd, 0);
        AbstractC167027dH.A0a(1, wdi, u7w, mediaComposition, map);
        InterfaceC178817wt BQp = interfaceC25205BDd.BQp();
        C14360o3.A07(BQp);
        BQp.FBm(0, i, i2, false, i3, i4);
        List list2 = (List) mediaComposition.A00.get(EnumC1125356h.VIDEO);
        boolean z = false;
        if (list2 != null && (c69688VtY = (C69688VtY) list2.get(0)) != null) {
            mediaEffect = c69688VtY.A01;
        } else {
            mediaEffect = null;
        }
        if (mediaEffect instanceof C55779Opo) {
            C47Z c47z = ((C55779Opo) mediaEffect).A00;
            Context context = this.A04;
            UserSession userSession = this.A05;
            C1125256f c1125256f = c47z.A1K;
            if (c1125256f != null) {
                A00 = AbstractC23113AHc.A01(userSession, c1125256f);
            } else {
                A00 = AGX.A00.A00(context, userSession, c47z);
            }
            List list3 = c47z.A1i.A03;
            if (list3 != null && (unmodifiableList = Collections.unmodifiableList(list3)) != null && (list = c47z.A1i.A02) != null && (unmodifiableList2 = Collections.unmodifiableList(list)) != null) {
                ArrayList A0q = AbstractC167017dG.A0q(unmodifiableList);
                Iterator it = unmodifiableList.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1X(A0q, TimeUnit.MILLISECONDS.toMicros(AbstractC167007dF.A0B(it)));
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it2 = unmodifiableList2.iterator();
                while (it2.hasNext()) {
                    A1E.add(AbstractC001800i.A0w(((A65) it2.next()).A00));
                }
                if ((A00 instanceof FilterChain) && (A0g = AbstractC166987dD.A0g(((FilterChain) A00).A01, 17)) != null) {
                    C198658qF c198658qF = this.A00;
                    if (c198658qF != null) {
                        c198658qF.A05.A00.add(new C22899A7t(A0g, A0q, A1E));
                    } else {
                        str = "igluMediaGraph";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
            }
            List A002 = C199758sR.A00(c47z, i3, i4);
            C9RE c9re = this.A03;
            if (c9re != null) {
                C9RE.A01(BQp, c47z, c9re, A002);
                C178577wV c178577wV = this.A02;
                if (c178577wV != null) {
                    C178577wV.A00(A00, c178577wV);
                    CameraAREffect cameraAREffect = c47z.A10;
                    C27631Vq c27631Vq = C27631Vq.A00;
                    if (c27631Vq != null) {
                        C178577wV c178577wV2 = this.A02;
                        if (c178577wV2 != null) {
                            C200558ty A003 = c27631Vq.A00(context, null, c178577wV2, userSession, true, false);
                            A003.A0C(null, null);
                            A003.A0B();
                            A003.A0D(cameraAREffect);
                            C178577wV c178577wV3 = this.A02;
                            if (c178577wV3 != null) {
                                InterfaceC199428rj interfaceC199428rj = (InterfaceC199428rj) c178577wV3.A02(InterfaceC199428rj.A00);
                                if (cameraAREffect != null) {
                                    z = true;
                                }
                                ((C199418ri) interfaceC199428rj).A00.A00 = Boolean.valueOf(z);
                            }
                        }
                    } else {
                        str = "instance";
                    }
                }
                str = "cameraService";
            } else {
                str = "regionTrackingOverlayMediaGraph";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        return true;
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC179117xN Bmn() {
        return null;
    }

    @Override // X.InterfaceC25204BDc
    public final /* synthetic */ void CiT() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0110  */
    @Override // X.InterfaceC25204BDc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC25205BDd AMx(android.opengl.EGLContext r32, android.os.Handler r33, X.InterfaceC178837wv r34, X.InterfaceC178897x1 r35, X.WDI r36, X.U7W r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23508AbO.AMx(android.opengl.EGLContext, android.os.Handler, X.7wv, X.7x1, X.WDI, X.U7W, java.lang.Object):X.BDd");
    }

    public C23508AbO(Context context, UserSession userSession) {
        this.A04 = context;
        this.A05 = userSession;
    }
}
