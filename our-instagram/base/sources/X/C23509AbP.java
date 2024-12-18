package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AbP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23509AbP implements InterfaceC25204BDc {
    public C9RD A00;
    public C178577wV A01;
    public AZB A02;
    public C9RE A03;
    public DefectDetectorFilter A04;
    public InterfaceC178407wE A05;
    public final boolean A06;
    public final Context A07;
    public final UserSession A08;
    public final boolean A09;

    @Override // X.InterfaceC25204BDc
    public final boolean AJF(WDI wdi, MediaComposition mediaComposition, InterfaceC25205BDd interfaceC25205BDd, U7W u7w, Map map, int i, int i2, int i3, int i4) {
        String str;
        MediaEffect mediaEffect;
        FilterModel A00;
        C14360o3.A0B(interfaceC25205BDd, 0);
        AbstractC167027dH.A0a(1, wdi, u7w, mediaComposition, map);
        InterfaceC178817wt BQp = interfaceC25205BDd.BQp();
        C14360o3.A07(BQp);
        InterfaceC179037xF BQq = BQp.BQq();
        EnumC1125356h enumC1125356h = EnumC1125356h.VIDEO;
        HashMap A07 = mediaComposition.A07(enumC1125356h);
        if (A07 != null) {
            Iterator A0l = AbstractC167007dF.A0l(A07);
            while (A0l.hasNext()) {
                Number number = (Number) A0l.next();
                C14360o3.A0A(number);
                C1809380v c1809380v = (C1809380v) BQq.BHv(number.intValue());
                c1809380v.A07 = false;
                c1809380v.A00(new AnonymousClass814(true), i3, i4);
            }
            List list = (List) mediaComposition.A00.get(enumC1125356h);
            if (list != null) {
                AZB azb = this.A02;
                if (azb != null) {
                    Context context = this.A07;
                    boolean z = true;
                    AbstractC225399x2.A00(context, BQp, new C201438vY(), azb, u7w, list, false);
                    AZB azb2 = this.A02;
                    if (azb2 != null) {
                        C178907x2 c178907x2 = azb2.A02;
                        if (c178907x2 != null) {
                            c178907x2.A00.post(new RunnableC24581Auc(c178907x2, azb2));
                        }
                        BQp.FBm(0, i, i2, false, i3, i4);
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (Object obj : list) {
                            if (((C69688VtY) obj).A01 instanceof C55779Opo) {
                                A1E.add(obj);
                            }
                        }
                        C69688VtY c69688VtY = (C69688VtY) AbstractC001800i.A0J(A1E);
                        if (c69688VtY != null) {
                            mediaEffect = c69688VtY.A01;
                        } else {
                            mediaEffect = null;
                        }
                        C14360o3.A0C(mediaEffect, "null cannot be cast to non-null type com.facebook.videolite.instagram.onecamera.PendingMediaEffect");
                        C55779Opo c55779Opo = (C55779Opo) mediaEffect;
                        if (c55779Opo != null) {
                            C47Z c47z = c55779Opo.A00;
                            UserSession userSession = this.A08;
                            C1125256f c1125256f = c47z.A1K;
                            if (c1125256f != null) {
                                A00 = AbstractC23113AHc.A01(userSession, c1125256f);
                            } else {
                                A00 = AGX.A00.A00(context, userSession, c47z);
                            }
                            if ((A00 instanceof FilterChain) && this.A06 && C18U.A06(C06090Tz.A05, userSession, 36330990917928041L)) {
                                DefectDetectorFilter defectDetectorFilter = new DefectDetectorFilter("defect_detection");
                                FilterGroup filterGroup = new FilterGroup();
                                filterGroup.A00(new ColorFilter("normal"), 17);
                                filterGroup.A00(defectDetectorFilter, 27);
                                ((FilterChain) A00).A01(filterGroup, 27);
                                this.A04 = defectDetectorFilter;
                            }
                            List A002 = C199758sR.A00(c47z, i3, i4);
                            C9RE c9re = this.A03;
                            if (c9re != null) {
                                C9RE.A01(BQp, c47z, c9re, A002);
                                C178577wV c178577wV = this.A01;
                                if (c178577wV != null) {
                                    C178577wV.A00(A00, c178577wV);
                                    CameraAREffect cameraAREffect = c47z.A10;
                                    C27631Vq c27631Vq = C27631Vq.A00;
                                    if (c27631Vq != null) {
                                        C178577wV c178577wV2 = this.A01;
                                        if (c178577wV2 != null) {
                                            C200558ty A003 = c27631Vq.A00(context, null, c178577wV2, userSession, true, false);
                                            A003.A0C(null, null);
                                            A003.A0B();
                                            A003.A0D(cameraAREffect);
                                            C178577wV c178577wV3 = this.A01;
                                            if (c178577wV3 != null) {
                                                InterfaceC199428rj interfaceC199428rj = (InterfaceC199428rj) c178577wV3.A02(InterfaceC199428rj.A00);
                                                if (cameraAREffect == null) {
                                                    z = false;
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
                }
                str = "stitchGraph";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC179117xN Bmn() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0147  */
    @Override // X.InterfaceC25204BDc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC25205BDd AMx(android.opengl.EGLContext r32, android.os.Handler r33, X.InterfaceC178837wv r34, X.InterfaceC178897x1 r35, X.WDI r36, X.U7W r37, java.lang.Object r38) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23509AbP.AMx(android.opengl.EGLContext, android.os.Handler, X.7wv, X.7x1, X.WDI, X.U7W, java.lang.Object):X.BDd");
    }

    @Override // X.InterfaceC25204BDc
    public final void CiT() {
        Float f;
        if (this.A06) {
            if (C18U.A06(C06090Tz.A05, this.A08, 36330990917928041L)) {
                if (this.A05 == null) {
                    C178577wV c178577wV = this.A01;
                    if (c178577wV != null) {
                        this.A05 = (InterfaceC178407wE) c178577wV.A00.Aq1(InterfaceC178407wE.A00);
                    } else {
                        C14360o3.A0F("cameraService");
                        throw C00O.createAndThrow();
                    }
                }
                HashMap A1G = AbstractC166987dD.A1G();
                DefectDetectorFilter defectDetectorFilter = this.A04;
                if (defectDetectorFilter != null) {
                    f = Float.valueOf(defectDetectorFilter.getBlackFrameRate());
                } else {
                    f = null;
                }
                A1G.put("black_frame_rate", String.valueOf(f));
                InterfaceC178407wE interfaceC178407wE = this.A05;
                if (interfaceC178407wE != null) {
                    interfaceC178407wE.CkX(AbstractC166987dD.A0M(this), "media_pipeline_black_frame_rate", "ClipsArFrameLiteRendererCallback", A1G);
                }
            }
        }
    }

    public C23509AbP(Context context, UserSession userSession, boolean z, boolean z2) {
        this.A07 = context;
        this.A08 = userSession;
        this.A06 = z;
        this.A09 = z2;
    }
}
