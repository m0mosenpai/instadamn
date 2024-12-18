package X;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.spotlight.fetch.SpotlightFetchRepository;
import go.Seq;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class J8V extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8V(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static C17050sx A00(Object obj, int i) {
        return AbstractC09440dt.A01(new J8V(obj, i));
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                return AnonymousClass001.A0R("endpoint:", "reconsideration_destination");
            case 1:
                C38648Gyp c38648Gyp = (C38648Gyp) this.A01;
                return AnonymousClass001.A0g(AbstractC25225BEi.A15(c38648Gyp.A04), ",paginationToken:", c38648Gyp.A03);
            case 2:
                return new C41220IMj((UserSession) this.A01);
            case 3:
                return new C2GT(Boolean.valueOf(AbstractC167007dF.A1T(C17060sy.A01.A01(((C41220IMj) this.A01).A00).A03.CQF())));
            case 4:
            case 5:
            case 6:
                AbstractC166987dD.A1Y(this.A01);
                break;
            case 7:
                IMF imf = ((C41598Ial) this.A01).A04;
                synchronized (imf) {
                    Iterator it = imf.A04.iterator();
                    while (it.hasNext()) {
                        C006802i.A0p.markerPoint(AbstractC167007dF.A0B(it), "FETCH_BEGIN");
                    }
                    break;
                }
            case 8:
                IMF imf2 = ((C41598Ial) this.A01).A04;
                synchronized (imf2) {
                    java.util.Set set = imf2.A04;
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        AbstractC37304Gc5.A0o(AbstractC167007dF.A0B(it2));
                    }
                    set.clear();
                    break;
                }
            case 9:
                IMF imf3 = ((C41598Ial) this.A01).A04;
                synchronized (imf3) {
                    java.util.Set set2 = imf3.A04;
                    Iterator it3 = set2.iterator();
                    while (it3.hasNext()) {
                        int A0B = AbstractC167007dF.A0B(it3);
                        C006802i.A0p.markerPoint(A0B, "USER_NAVIGATION_CANCELLATION");
                        C006802i.A0p.markerEnd(A0B, (short) 4);
                    }
                    set2.clear();
                    break;
                }
            case 10:
                ((C41598Ial) this.A01).A02.A01();
                break;
            case 11:
                ((C41598Ial) this.A01).A02.A00();
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return new IDN((UserSession) this.A01);
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C38477Gvy(AbstractC166997dE.A0S(((C38495GwG) this.A01).A00, R.id.full_width_product_tile_header));
            case 14:
                View view = ((C38495GwG) this.A01).A00;
                return AbstractC16960so.A1M(view.requireViewById(R.id.image_tint_0), view.requireViewById(R.id.image_tint_1), view.requireViewById(R.id.image_tint_2));
            case Process.SIGTERM /* 15 */:
                View view2 = ((C38495GwG) this.A01).A00;
                return AbstractC16960so.A1M((IgImageView) view2.requireViewById(R.id.image_0), (IgImageView) view2.requireViewById(R.id.image_1), (IgImageView) view2.requireViewById(R.id.image_2));
            case 16:
                View view3 = ((C38495GwG) this.A01).A00;
                return AbstractC16960so.A1Q((TouchOverlayView) view3.requireViewById(R.id.touch_overlay_0), (TouchOverlayView) view3.requireViewById(R.id.touch_overlay_1), (TouchOverlayView) view3.requireViewById(R.id.touch_overlay_2));
            case 17:
                return ((IJL) this.A01).A02.getView().findViewById(R.id.avatar);
            case 18:
                return ((IJL) this.A01).A02.getView().findViewById(R.id.username);
            case Process.SIGSTOP /* 19 */:
                return new IDU((UserSession) this.A01);
            case 20:
                IgShowreelCompositionView igShowreelCompositionView = (IgShowreelCompositionView) this.A01;
                return new BFR(AbstractC166997dE.A0L(igShowreelCompositionView), igShowreelCompositionView, igShowreelCompositionView);
            case 21:
                return new C38217GrM((UserSession) this.A01);
            case 22:
                return new C104444nA((UserSession) this.A01);
            case 23:
                return AbstractC92484Cf.A00(((C37952Gmu) this.A01).A11);
            case 24:
                return new C1PP((UserSession) this.A01);
            case 25:
                return new C26231Pe((UserSession) this.A01);
            case 26:
                UserSession userSession = (UserSession) this.A01;
                return new C48508Lcz(C1AT.A01(userSession).A03(C1AV.A2c), userSession);
            case 27:
                return new C42285Io9((UserSession) this.A01, AbstractC166987dD.A1G());
            case 28:
                return C3HY.A00(((C42285Io9) this.A01).A01);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return C3HY.A00(((C42997Izn) this.A01).A00);
            case 30:
                return new C25431Lx((UserSession) this.A01, AbstractC166987dD.A1G());
            case 31:
                return new C147436kT((UserSession) this.A01);
            case 32:
                return new C63178Sed((UserSession) this.A01);
            case 33:
            case 34:
                C77123cy c77123cy = (C77123cy) this.A01;
                C2XV.A00();
                Animator animator = (Animator) c77123cy.A00;
                if (animator != null) {
                    animator.cancel();
                    break;
                }
                break;
            case 35:
                ((C37605Gh0) this.A01).A0A.CvE();
                break;
            case 36:
                return new SpotlightFetchRepository((UserSession) this.A01);
            case 37:
                return new C1563670g((UserSession) this.A01);
            case 38:
            case Seq.NULL_REFNUM /* 41 */:
            case 43:
            default:
                return ((InterfaceC018407e) this.A01).getViewModelStore();
            case 39:
                return ((C07N) ((InterfaceC018407e) this.A01)).getDefaultViewModelProviderFactory();
            case 40:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return this.A01;
            case 44:
                return new C40979IDa((View) this.A01);
            case 45:
                AnonymousClass693 A00 = C68U.A00(((C41590Iad) this.A01).A02.A04.getContext(), R.raw.story_likes_crowd_noise);
                if (A00 != null) {
                    return A00;
                }
                throw AbstractC166997dE.A0g();
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return AbstractC166997dE.A0c(C06090Tz.A05, (AbstractC12990ll) this.A01, 2342156051466094224L);
            case 47:
                Context context = ((NX1) this.A01).A00;
                int i2 = R.drawable.notification_icon;
                int A0H = AbstractC53242c7.A0H(context, R.attr.defaultNotificationIcon);
                if (A0H != 0) {
                    i2 = A0H;
                }
                return new C54786OJd(context, i2);
            case 48:
                return ((AbstractC53639Nnk) ((AbstractC55106ObM) this.A01).A01.getValue()).A02();
            case 49:
                return Boolean.valueOf(((AbstractC55106ObM) this.A01).A0J());
        }
        return C0eB.A00;
    }
}
