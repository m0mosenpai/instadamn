package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AbQ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23510AbQ implements InterfaceC25204BDc {
    public C178577wV A00;
    public AZB A01;
    public C9RE A02;
    public final boolean A03;
    public final Context A04;
    public final UserSession A05;

    @Override // X.InterfaceC25204BDc
    public final boolean AJF(WDI wdi, MediaComposition mediaComposition, InterfaceC25205BDd interfaceC25205BDd, U7W u7w, Map map, int i, int i2, int i3, int i4) {
        MediaEffect mediaEffect;
        FilterModel A00;
        String str;
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
                AZB A002 = A00();
                Context context = this.A04;
                boolean z = true;
                AbstractC225399x2.A00(context, BQp, new C201438vY(), A002, u7w, list, false);
                AZB A003 = A00();
                C178907x2 c178907x2 = A003.A02;
                if (c178907x2 != null) {
                    c178907x2.A00.post(new RunnableC24581Auc(c178907x2, A003));
                }
                BQp.FBm(0, i3, i4, false, i3, i4);
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
                    UserSession userSession = this.A05;
                    C1125256f c1125256f = c47z.A1K;
                    if (c1125256f != null) {
                        A00 = AbstractC23113AHc.A01(userSession, c1125256f);
                    } else {
                        A00 = AGX.A00.A00(context, userSession, c47z);
                    }
                    List A004 = C199758sR.A00(c47z, i3, i4);
                    C9RE c9re = this.A02;
                    if (c9re != null) {
                        C9RE.A01(BQp, c47z, c9re, A004);
                        C178577wV c178577wV = this.A00;
                        if (c178577wV != null) {
                            C178577wV.A00(A00, c178577wV);
                            CameraAREffect cameraAREffect = c47z.A10;
                            C27631Vq c27631Vq = C27631Vq.A00;
                            if (c27631Vq != null) {
                                C178577wV c178577wV2 = this.A00;
                                if (c178577wV2 != null) {
                                    C200558ty A005 = c27631Vq.A00(context, null, c178577wV2, userSession, true, false);
                                    A005.A0C(null, null);
                                    A005.A0B();
                                    A005.A0D(cameraAREffect);
                                    C178577wV c178577wV3 = this.A00;
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
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC179117xN Bmn() {
        return null;
    }

    @Override // X.InterfaceC25204BDc
    public final /* synthetic */ void CiT() {
    }

    public final AZB A00() {
        AZB azb = this.A01;
        if (azb != null) {
            return azb;
        }
        C14360o3.A0F("stitchGraph");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC25205BDd AMx(EGLContext eGLContext, Handler handler, InterfaceC178837wv interfaceC178837wv, InterfaceC178897x1 interfaceC178897x1, WDI wdi, U7W u7w, Object obj) {
        AbstractC167017dG.A1Q(eGLContext, obj);
        C14360o3.A0B(interfaceC178837wv, 4);
        C23329AVo c23329AVo = new C23329AVo(interfaceC178837wv, 1);
        Context context = this.A04;
        UserSession userSession = this.A05;
        C178747wm c178747wm = new C178747wm();
        C178267w0 c178267w0 = new C178267w0();
        C201438vY c201438vY = new C201438vY();
        Handler handler2 = null;
        int i = 1;
        boolean z = this.A03;
        if (handler != null) {
            handler2 = handler;
        }
        C179107xM A00 = AbstractC179127xO.A00(context, handler2, null, c178747wm, c201438vY, c178267w0, true, z, false, false, false, true, false, false);
        boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36319446046285244L);
        if (A06) {
            AbstractC167027dH.A0y(C18950wb.A01, "IgArFrameLiteRendererCallback");
        }
        C198658qF A01 = AbstractC198488px.A01(context, userSession, "IgArFrameLiteRendererCallback", z, A06, true, false);
        this.A02 = new C9RE(context, c178747wm, AbstractC198488px.A01(context, userSession, "IgArFrameLiteRendererCallback", true, false, true, false), userSession);
        this.A01 = new AZB(c178747wm);
        A00().A05 = true;
        A00().A0D.A03 = true;
        A00().A01(EnumC222969sb.A03, A00);
        A00().A01(EnumC222969sb.A04, A01);
        AZB A002 = A00();
        EnumC222969sb enumC222969sb = EnumC222969sb.A07;
        C9RE c9re = this.A02;
        if (c9re != null) {
            A002.A01(enumC222969sb, c9re);
            C178927x4 c178927x4 = new C178927x4(obj, 3);
            if (interfaceC178897x1 != null) {
                int AqC = interfaceC178897x1.AqC();
                if ((AqC & 32) != 0) {
                    i = AbstractC225059wU.A00(interfaceC178897x1, 33);
                    if ((AqC & 8192) != 0) {
                        i |= 8192;
                    }
                }
                c178927x4.A0A(interfaceC178897x1, i);
            } else {
                c178927x4.A09(eGLContext, 1);
            }
            C178017va c178017va = new C178017va("instagram_post_capture_transcoder");
            c178017va.A02(InterfaceC178137vm.A00, A00);
            c178017va.A02(InterfaceC178107vj.A0E, A00());
            c178017va.A02(InterfaceC178047vd.A00, userSession);
            c178017va.A02(InterfaceC198728qU.A00, true);
            c178017va.A02(InterfaceC178107vj.A0I, handler);
            C178017va.A01(c178017va, c23329AVo, c178927x4, obj);
            c178017va.A02(InterfaceC178107vj.A0G, 3);
            c178017va.A02(InterfaceC178107vj.A08, true);
            C178577wV A003 = AD9.A00(context, c178017va);
            this.A00 = A003;
            return new C23513AbT(A003);
        }
        C14360o3.A0F("regionTrackingOverlayMediaGraph");
        throw C00O.createAndThrow();
    }

    public C23510AbQ(UserSession userSession, Context context, boolean z) {
        this.A04 = context;
        this.A05 = userSession;
        this.A03 = z;
    }
}
