package X;

import android.content.Context;
import android.opengl.EGLContext;
import android.os.Handler;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.List;
import java.util.Map;

/* renamed from: X.AbM, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23506AbM implements InterfaceC25204BDc {
    public C198658qF A00;
    public C178577wV A01;
    public AZB A02;
    public final Context A03;
    public final UserSession A04;

    @Override // X.InterfaceC25204BDc
    public final boolean AJF(WDI wdi, MediaComposition mediaComposition, InterfaceC25205BDd interfaceC25205BDd, U7W u7w, Map map, int i, int i2, int i3, int i4) {
        String str;
        C69688VtY c69688VtY;
        C14360o3.A0B(interfaceC25205BDd, 0);
        AbstractC167027dH.A0a(1, wdi, u7w, mediaComposition, map);
        InterfaceC178817wt BQp = interfaceC25205BDd.BQp();
        C14360o3.A07(BQp);
        BQp.FBm(0, i, i2, false, i3, i4);
        List list = (List) mediaComposition.A00.get(EnumC1125356h.VIDEO);
        MediaEffect mediaEffect = null;
        if (list != null && (c69688VtY = (C69688VtY) list.get(0)) != null) {
            mediaEffect = c69688VtY.A01;
        }
        if (mediaEffect instanceof C55779Opo) {
            FilterGroupModel filterGroupModel = ((C55779Opo) mediaEffect).A00.A1D;
            if (filterGroupModel != null) {
                FilterChain filterChain = ((FilterGroupModelImpl) filterGroupModel).A02;
                C178577wV c178577wV = this.A01;
                if (c178577wV != null) {
                    C178577wV.A00(filterChain, c178577wV);
                    C27631Vq c27631Vq = C27631Vq.A00;
                    if (c27631Vq != null) {
                        Context context = this.A03;
                        UserSession userSession = this.A04;
                        C178577wV c178577wV2 = this.A01;
                        if (c178577wV2 != null) {
                            c27631Vq.A00(context, null, c178577wV2, userSession, true, false).A0B();
                        }
                    } else {
                        str = "instance";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                str = "cameraService";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
            throw AbstractC166997dE.A0g();
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

    @Override // X.InterfaceC25204BDc
    public final InterfaceC25205BDd AMx(EGLContext eGLContext, Handler handler, InterfaceC178837wv interfaceC178837wv, InterfaceC178897x1 interfaceC178897x1, WDI wdi, U7W u7w, Object obj) {
        String str;
        AbstractC167017dG.A1Q(eGLContext, obj);
        C14360o3.A0B(interfaceC178837wv, 4);
        C23329AVo c23329AVo = new C23329AVo(interfaceC178837wv, 2);
        Context context = this.A03;
        UserSession userSession = this.A04;
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318157557864416L);
        C178747wm c178747wm = new C178747wm();
        C198548q3 A00 = C198548q3.A00(context, C18U.A06(c06090Tz, userSession, 36316233410285758L));
        this.A00 = new C198658qF(AbstractC198488px.A00(userSession), A00, new AnonymousClass814(false), null, -1, A06, AbstractC166987dD.A0y().A0b(), false, true, true);
        AZB azb = new AZB(c178747wm);
        this.A02 = azb;
        azb.A05 = true;
        azb.A0D.A03 = true;
        if (!A06) {
            azb.A01(EnumC222969sb.A06, new C212459bE(c178747wm, true));
        }
        AZB azb2 = this.A02;
        if (azb2 != null) {
            EnumC222969sb enumC222969sb = EnumC222969sb.A04;
            C198658qF c198658qF = this.A00;
            if (c198658qF != null) {
                azb2.A01(enumC222969sb, c198658qF);
                C178927x4 c178927x4 = new C178927x4(obj, 3);
                if (interfaceC178897x1 != null) {
                    c178927x4.A0A(interfaceC178897x1, 1);
                } else {
                    c178927x4.A09(eGLContext, 1);
                }
                C178017va c178017va = new C178017va("instagram_post_capture");
                C178037vc c178037vc = InterfaceC178107vj.A0E;
                AZB azb3 = this.A02;
                if (azb3 != null) {
                    c178017va.A02(c178037vc, azb3);
                    c178017va.A02(InterfaceC178047vd.A00, userSession);
                    c178017va.A02(InterfaceC198728qU.A00, false);
                    c178017va.A02(InterfaceC178107vj.A0I, handler);
                    c178017va.A02(InterfaceC178107vj.A01, false);
                    c178017va.A02(InterfaceC178107vj.A0F, c23329AVo);
                    c178017va.A02(InterfaceC178107vj.A03, c178927x4);
                    c178017va.A02(InterfaceC178107vj.A02, obj);
                    C178017va.A00(c178017va, InterfaceC178107vj.A08, true);
                    C178577wV A002 = AD9.A00(context, c178017va);
                    this.A01 = A002;
                    return new C23513AbT(A002);
                }
            } else {
                str = "igluMediaGraph";
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
        str = "compositeMediaGraph";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public C23506AbM(Context context, UserSession userSession) {
        this.A03 = context;
        this.A04 = userSession;
    }
}
