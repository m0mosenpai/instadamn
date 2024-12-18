package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
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

/* renamed from: X.AbR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23511AbR implements InterfaceC25204BDc {
    public C198658qF A00;
    public C178577wV A01;
    public AZB A02;
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

    public final AZB A00() {
        AZB azb = this.A02;
        if (azb != null) {
            return azb;
        }
        C14360o3.A0F("compositeMediaGraph");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC25204BDc
    public final InterfaceC25205BDd AMx(EGLContext eGLContext, Handler handler, InterfaceC178837wv interfaceC178837wv, InterfaceC178897x1 interfaceC178897x1, WDI wdi, U7W u7w, Object obj) {
        String str;
        AbstractC167017dG.A1Q(eGLContext, obj);
        C14360o3.A0B(interfaceC178837wv, 4);
        C23329AVo c23329AVo = new C23329AVo(interfaceC178837wv, 3);
        Context context = this.A04;
        UserSession userSession = this.A05;
        C178747wm c178747wm = new C178747wm();
        C178267w0 c178267w0 = new C178267w0();
        C201438vY c201438vY = new C201438vY();
        Integer num = null;
        Handler handler2 = null;
        if (handler != null) {
            handler2 = handler;
        }
        C179107xM A00 = AbstractC179127xO.A00(context, handler2, null, c178747wm, c201438vY, c178267w0, true, true, false, true, false, true, false, false);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36319446046416318L);
        if (A06) {
            AbstractC167027dH.A0y(C18950wb.A01, "IgStoriesArFrameLiteRendererCallback");
        }
        this.A00 = AbstractC198488px.A01(context, userSession, "IgStoriesArFrameLiteRendererCallback", true, A06, true, false);
        this.A03 = new C9RE(context, c178747wm, AbstractC198488px.A01(context, userSession, "IgStoriesArFrameLiteRendererCallback", true, false, true, false), userSession);
        C15900qk.A01();
        if (C15900qk.A00(context, false) >= C18U.A01(c06090Tz, userSession, 36601612512661785L) * 1048576 && C18U.A06(c06090Tz, userSession, 36320137535692889L)) {
            num = C9O7.A01(c06090Tz, userSession);
        }
        this.A02 = new AZB(c178747wm);
        A00().A05 = true;
        A00().A0D.A03 = true;
        A00().A01(EnumC222969sb.A06, new C212459bE(c178747wm, true));
        A00().A01(EnumC222969sb.A03, A00);
        if (num != null) {
            A00().A01(EnumC222969sb.A05, AbstractC198488px.A02(context, userSession, num));
        }
        AZB A002 = A00();
        EnumC222969sb enumC222969sb = EnumC222969sb.A04;
        C198658qF c198658qF = this.A00;
        if (c198658qF != null) {
            A002.A01(enumC222969sb, c198658qF);
            AZB A003 = A00();
            EnumC222969sb enumC222969sb2 = EnumC222969sb.A07;
            C9RE c9re = this.A03;
            if (c9re != null) {
                A003.A01(enumC222969sb2, c9re);
                C178927x4 c178927x4 = new C178927x4(obj, 3);
                if (interfaceC178897x1 != null) {
                    c178927x4.A0A(interfaceC178897x1, 1);
                } else {
                    c178927x4.A09(eGLContext, 1);
                }
                C178017va c178017va = new C178017va("instagram_post_capture");
                c178017va.A02(InterfaceC178137vm.A00, A00);
                c178017va.A02(InterfaceC178107vj.A0E, A00());
                c178017va.A02(InterfaceC178047vd.A00, userSession);
                c178017va.A02(InterfaceC198728qU.A00, true);
                c178017va.A02(InterfaceC178107vj.A0I, handler);
                C178017va.A01(c178017va, c23329AVo, c178927x4, obj);
                c178017va.A02(InterfaceC178107vj.A08, true);
                C178577wV A004 = AD9.A00(context, c178017va);
                this.A01 = A004;
                return new C23513AbT(A004);
            }
            str = "regionTrackingOverlayMediaGraph";
        } else {
            str = "igluMediaGraph";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C23511AbR(Context context, UserSession userSession) {
        this.A04 = context;
        this.A05 = userSession;
    }
}
