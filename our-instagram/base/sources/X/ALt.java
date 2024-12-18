package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* loaded from: classes4.dex */
public final class ALt {
    public C9U6 A00;
    public final Activity A01;
    public final View A02;
    public final ViewGroup A03;
    public final C07X A04;
    public final InterfaceC58362lv A05;
    public final C018307d A06;
    public final UserSession A07;
    public final C1821185v A08;
    public final InterfaceC1810081c A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final C1824787m A0D;

    public ALt(Activity activity, View view, C07X c07x, C018307d c018307d, C1824787m c1824787m, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C1821185v c1821185v, C9U6 c9u6, InterfaceC1810081c interfaceC1810081c) {
        C14360o3.A0B(interfaceC1810081c, 5);
        C14360o3.A0B(c1821185v, 6);
        C14360o3.A0B(c018307d, 8);
        C14360o3.A0B(c1824787m, 10);
        this.A07 = userSession;
        this.A01 = activity;
        this.A02 = view;
        this.A00 = c9u6;
        this.A09 = interfaceC1810081c;
        this.A08 = c1821185v;
        this.A04 = c07x;
        this.A06 = c018307d;
        this.A0D = c1824787m;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0B = B8T.A01(this, enumC09460dv, 9);
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0R(view, R.id.post_capture_effect_mini_gallery_footer_container);
        this.A03 = viewGroup;
        this.A0A = B8T.A01(this, enumC09460dv, 8);
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new B61(22, targetViewSizeProvider, this));
        this.A05 = new C208309Jp(this, 1);
        LayoutInflater.from(view.getContext()).inflate(R.layout.layout_post_capture_effect_mini_gallery_footer_stub, viewGroup, true);
        C9U6 c9u62 = this.A00;
        List A1Q = AbstractC16960so.A1Q(EnumC1810181d.A0x, EnumC1810181d.A1I);
        C1810281e c1810281e = ((C1809981b) interfaceC1810081c).A01;
        C14360o3.A0B(c1810281e, 0);
        InterfaceC19390xP A01 = C0ST.A01(new C43818JZg(21, AnonymousClass111.A04(new C15340po(new B5g(interfaceC1810081c, c9u62, null, 22), AnonymousClass111.A01(new GSB(7, null), new C198578q6(new C198558q4(A1Q, AbstractC184118Fa.A00(c1810281e))))), new C15340po(new B5g(interfaceC1810081c, c9u62, null, 23), AnonymousClass111.A01(new GSB(8, null), new C198608qA(new C198598q9(A1Q, C0ST.A01(new C8q8(C0JE.A00(new C9D4(c1810281e, (InterfaceC23621Ds) null, 35, 42))))))))), c9u62));
        AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
        A01(c07x, AbstractC58232lf.A00(anonymousClass191, A01), this, 6);
        A01(c07x, AbstractC58232lf.A00(anonymousClass191, C0ST.A01(new PVJ(2, interfaceC1810081c, this.A00, AnonymousClass111.A01(new D44(0, null), AbstractC191638eL.A04)))), this, 7);
        A01(c07x, C75M.A00(AbstractC58232lf.A00(anonymousClass191, A00(this).A02.A0N)), this, 8);
        C87T c87t = A00(this).A02;
        A01(c07x, AbstractC58232lf.A00(anonymousClass191, new C43818JZg(6, c87t.A0O, c87t)), this, 9);
    }

    public static final C8ZD A00(ALt aLt) {
        Object value;
        if (C2B0.A00(C05F.A0L)) {
            value = aLt.A0D.A00.A00();
        } else {
            value = aLt.A0B.getValue();
        }
        return (C8ZD) value;
    }

    public static void A01(C07X c07x, C2GT c2gt, Object obj, int i) {
        c2gt.A06(c07x, new C24997B3t(new B8U(obj, i)));
    }

    public static final void A02(CameraAREffect cameraAREffect, ALt aLt) {
        C23760AfX c23760AfX = (C23760AfX) aLt.A0A.getValue();
        if (cameraAREffect != null) {
            c23760AfX.A00(cameraAREffect);
        } else {
            ((C195328kY) c23760AfX.A02.getValue()).A0F();
        }
        A00(aLt).A06(cameraAREffect);
    }
}
