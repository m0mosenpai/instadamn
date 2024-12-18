package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.onecamera.configurations.AppSpecific;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8Lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185768Lv {
    public FilterChain A00;
    public C178577wV A01;
    public C197208nr A02;
    public C8MI A03;
    public final Context A04;
    public final UserSession A05;
    public final C81N A06;
    public final C185758Lu A07;
    public final TargetViewSizeProvider A08;
    public final C8Lw A09;
    public final Map A0B = new HashMap();
    public final Map A0C = new HashMap();
    public final Map A0A = new HashMap();

    public static synchronized C178577wV A00(C185768Lv c185768Lv) {
        C178577wV c178577wV;
        synchronized (c185768Lv) {
            c178577wV = c185768Lv.A01;
            if (c178577wV == null) {
                Context context = c185768Lv.A04;
                UserSession userSession = c185768Lv.A05;
                C14360o3.A0B(context, 0);
                C14360o3.A0B(userSession, 1);
                C178017va c178017va = new C178017va("instagram_post_capture");
                c178017va.A02(InterfaceC178107vj.A0C, AbstractC198488px.A01(context, userSession, "OneCameraImageRenderUtil", true, true, false, false));
                c178017va.A02(InterfaceC178047vd.A00, userSession);
                c178017va.A02(InterfaceC178107vj.A05, true);
                c178017va.A02(InterfaceC198728qU.A00, true);
                c178017va.A02(InterfaceC178107vj.A02, C178117vk.A06);
                C178037vc c178037vc = InterfaceC178107vj.A0A;
                C06090Tz c06090Tz = C06090Tz.A05;
                c178017va.A02(c178037vc, Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36324187689856981L)));
                c178017va.A02(InterfaceC178107vj.A06, Boolean.valueOf(C18U.A06(c06090Tz, userSession, 36324187689856981L)));
                c178017va.A02(InterfaceC178107vj.A0L, Integer.valueOf((int) C18U.A01(c06090Tz, userSession, 36605662666691904L)));
                C178027vb c178027vb = new C178027vb(c178017va);
                C197128nh c197128nh = new C197128nh();
                C178167vp c178167vp = C178167vp.A00;
                Context applicationContext = context.getApplicationContext();
                C14360o3.A07(applicationContext);
                c178577wV = c178167vp.A00(applicationContext, c178027vb, new C178177vr(AppSpecific.class), c197128nh);
                c185768Lv.A01 = c178577wV;
            }
        }
        return c178577wV;
    }

    public final void A01() {
        C197208nr c197208nr = this.A02;
        if (c197208nr != null) {
            C8MI c8mi = this.A03;
            c8mi.getClass();
            c8mi.Da9();
            C197368o7 AwM = ((InterfaceC180137z3) A00(this).A02(InterfaceC180137z3.A00)).AwM();
            FilterChain filterChain = this.A00;
            filterChain.getClass();
            AwM.A07(filterChain);
            c197208nr.EGV();
        }
    }

    public final void A02(FilterGroupModel filterGroupModel, String str) {
        this.A0A.put(str, filterGroupModel);
        this.A00 = ((FilterGroupModelImpl) filterGroupModel).A02;
        ((InterfaceC180137z3) A00(this).A02(InterfaceC180137z3.A00)).AwM().A07(this.A00);
    }

    public C185768Lv(Context context, UserSession userSession, C81N c81n, C185758Lu c185758Lu, TargetViewSizeProvider targetViewSizeProvider) {
        this.A04 = context;
        this.A05 = userSession;
        this.A06 = c81n;
        this.A09 = new C8Lw(c81n);
        this.A07 = c185758Lu;
        this.A08 = targetViewSizeProvider;
    }
}
