package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.litho.ComponentHost;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class B61 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B61(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        ViewGroup viewGroup;
        AnonymousClass822 anonymousClass822;
        java.util.Set set;
        C141796aw A00;
        InterfaceC16620sF b5g;
        Object invoke;
        Object invoke2;
        C07N c07n;
        Object invoke3;
        switch (this.A00) {
            case 0:
            case 1:
                C27943CTc c27943CTc = (C27943CTc) this.A01;
                View view = c27943CTc.A00;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null && !(viewGroup instanceof ComponentHost) && viewGroup.isAttachedToWindow()) {
                        viewGroup.removeView(view);
                        c27943CTc.A00 = null;
                    }
                }
                ((C51762Yz) this.A02).A01(AbstractC166997dE.A0a());
                return C0eB.A00;
            case 2:
                if (!AbstractC166987dD.A1a(((C51762Yz) this.A01).A03)) {
                    ((C2XI) this.A02).A00(Float.valueOf(0.0f));
                    return null;
                }
                return null;
            case 3:
                C1810981l c1810981l = (C1810981l) this.A02;
                anonymousClass822 = (AnonymousClass822) this.A01;
                C14360o3.A0B(anonymousClass822, 0);
                c1810981l.A08.A01(anonymousClass822);
                set = c1810981l.A0I;
                set.remove(anonymousClass822);
                return C0eB.A00;
            case 4:
                C1810981l c1810981l2 = (C1810981l) this.A02;
                anonymousClass822 = (AnonymousClass822) this.A01;
                C14360o3.A0B(anonymousClass822, 0);
                c1810981l2.A09.A01(anonymousClass822);
                set = c1810981l2.A0J;
                set.remove(anonymousClass822);
                return C0eB.A00;
            case 5:
                C447324d c447324d = (C447324d) this.A01;
                C44063Jdo c44063Jdo = (C44063Jdo) this.A02;
                boolean z = true;
                if (c44063Jdo.A07.size() <= c44063Jdo.A00 && !AbstractC166987dD.A1b(c44063Jdo.A06)) {
                    z = false;
                }
                boolean z2 = c447324d.A01;
                if (z) {
                    if (!z2 && c447324d.A03) {
                        C24Q c24q = c447324d.A04;
                        c24q.A0C("ui_load_success", c447324d.A00);
                        c447324d.A00 = c24q.A02(17640780, c447324d.A00);
                        c447324d.A01 = true;
                    }
                } else if (!z2 && c447324d.A03) {
                    C24Q c24q2 = c447324d.A04;
                    c24q2.A0C("ui_load_failure", c447324d.A00);
                    c447324d.A00 = c24q2.A07("ui_load_failure", "", 17640780, c447324d.A00);
                }
                return C0eB.A00;
            case 6:
            case 7:
            case 8:
                ((C447324d) this.A02).A01(((C148276lx) this.A01).A0Z);
                return C0eB.A00;
            case 9:
            case 16:
            case 18:
            case 23:
            case 27:
            case 31:
            case 34:
            case 37:
            case 38:
            case 44:
            case 45:
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ == null || (invoke3 = interfaceC16820sZ.invoke()) == null) {
                    InterfaceC018407e interfaceC018407e = (InterfaceC018407e) ((InterfaceC09390do) this.A02).getValue();
                    if ((interfaceC018407e instanceof C07N) && (c07n = (C07N) interfaceC018407e) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke3;
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ2 != null && (invoke = interfaceC16820sZ2.invoke()) != null) {
                    return invoke;
                }
                return ((Fragment) this.A02).requireActivity().getDefaultViewModelCreationExtras();
            case 11:
                return new CutoutStickerRepository((Context) this.A01, (UserSession) this.A02);
            case 14:
                Activity activity = (Activity) AbstractC13320mI.A00((Context) this.A01, Activity.class);
                if (activity != null) {
                    UserSession userSession = (UserSession) this.A02;
                    C14360o3.A0B(userSession, 1);
                    C3DO c3do = C3DN.A00;
                    C3DN A002 = c3do.A00(activity);
                    boolean z3 = true;
                    if (A002 == null || !((C3DP) A002).A0h) {
                        z3 = false;
                    }
                    Fragment fragment = null;
                    if (z3) {
                        C3DN A003 = c3do.A00(activity);
                        if (A003 != null) {
                            fragment = A003.A09();
                        }
                        C3DN A004 = c3do.A00(activity);
                        if (A004 != null) {
                            ((C3DP) A004).A0H = new C24128AnD(0, activity, fragment, userSession);
                        }
                        AbstractC167017dG.A0y(activity, c3do);
                    } else {
                        AbstractC226299ym.A00(activity, null, userSession);
                    }
                }
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs = (GestureDetectorOnGestureListenerC43829JZs) this.A02;
                ArrayList arrayList = (ArrayList) this.A01;
                try {
                    LIH lih = A3m.A00;
                    UserSession userSession2 = gestureDetectorOnGestureListenerC43829JZs.A0z;
                    AbstractC59962oe abstractC59962oe = gestureDetectorOnGestureListenerC43829JZs.A0x;
                    Resources resources = gestureDetectorOnGestureListenerC43829JZs.getResources();
                    C14360o3.A07(resources);
                    gestureDetectorOnGestureListenerC43829JZs.A0X(null, AbstractC166987dD.A1F(lih.A02(resources, abstractC59962oe, userSession2, "posts", arrayList)), false);
                } catch (C40e unused) {
                    C9GR.A0F(AbstractC166997dE.A0L(gestureDetectorOnGestureListenerC43829JZs), AbstractC43591JPw.A00(373), 2131963095);
                }
                return C0eB.A00;
            case 17:
                return new ABW((Context) this.A01, (UserSession) this.A02);
            case Process.SIGSTOP /* 19 */:
                C70861WiR c70861WiR = (C70861WiR) this.A02;
                Context context = c70861WiR.A0H;
                C14360o3.A07(context);
                return new C88W(context, (C3I9) this.A01, c70861WiR.A0P);
            case 20:
                return new AnonymousClass831((View) this.A02, (C81J) this.A01);
            case 21:
                return new C1809080s((Activity) this.A01, (UserSession) this.A02);
            case 22:
                return new C172227lr((TargetViewSizeProvider) this.A01, new C23738AfB((ALt) this.A02));
            case 24:
                C193838i4 c193838i4 = (C193838i4) this.A02;
                C193838i4.A0K(c193838i4, (List) this.A01);
                c193838i4.A10.A0C.Egh(null);
                return C0eB.A00;
            case 25:
                C193838i4.A0J((C193838i4) this.A02, AbstractC166987dD.A1J(this.A01));
                return C0eB.A00;
            case 26:
                ((Runnable) this.A01).run();
                C448124l c448124l = AnonymousClass229.A01(((C8YY) this.A02).A0E).A09;
                C25531Mh A08 = C25531Mh.A08(c448124l.A02);
                EnumC114925Hg A0J = c448124l.A0J();
                if (((AbstractC02600Aj) A08).A00.isSampled() && A0J != null) {
                    A08.A0s("IG_CAMERA_ENTITY_TAP");
                    A08.A0q("TIMELINE_SWAP_SHORTER_DONE_TAP");
                    C448124l.A00(A08, c448124l);
                    A08.A0a(A0J);
                    C22M c22m = c448124l.A04;
                    AbstractC167007dF.A14(A08, c22m);
                    A08.A0U();
                    A08.A0m(C22F.A09.getModuleName());
                    A08.A0c(c22m.A0A);
                    AbstractC167017dG.A1D(A08);
                }
                return C0eB.A00;
            case 28:
                A00 = AbstractC141776au.A00(null);
                b5g = new B5g(null, null, null, 35);
                AbstractC166987dD.A1Z(b5g, A00);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                return AbstractC166997dE.A0a();
            case 30:
                UserSession userSession3 = (UserSession) this.A02;
                return new InspirationHubRepository(userSession3, new InspirationHubNetworkDataSource(userSession3, (Context) this.A01), AbstractC23021Ah.A00(userSession3));
            case 32:
                final float f = ((C24150AnZ) this.A02).A01;
                final UserSession userSession4 = (UserSession) this.A01;
                return new AbstractC61132qb(userSession4, f) { // from class: X.9gj
                    public final float A00;
                    public final UserSession A01;

                    {
                        C14360o3.A0B(userSession4, 2);
                        this.A00 = f;
                        this.A01 = userSession4;
                    }

                    @Override // X.AbstractC61132qb
                    public final /* bridge */ /* synthetic */ AbstractC52922bZ create() {
                        return new C9U2(this.A01, this.A00);
                    }
                };
            case 33:
                C171287kK c171287kK = (C171287kK) this.A02;
                EnumC171297kL enumC171297kL = c171287kK.A01;
                EnumC171297kL enumC171297kL2 = EnumC171297kL.A03;
                if (enumC171297kL != enumC171297kL2) {
                    C171287kK.A01(enumC171297kL2, c171287kK);
                }
                AbstractC166987dD.A1Y(this.A01);
                return C0eB.A00;
            case 35:
                C70860WiQ c70860WiQ = (C70860WiQ) this.A02;
                Context context2 = c70860WiQ.A08;
                C14360o3.A07(context2);
                return new C88W(context2, (C3I9) this.A01, c70860WiQ.A0E);
            case 36:
                View findViewById = ((C23807AgI) this.A02).A00.A0O().findViewById(R.id.exit_button);
                C0fQ.A00(new ViewOnClickListenerC23249ASk((C8DN) this.A01, 33), findViewById);
                return findViewById;
            case 39:
                ((InterfaceC16660sJ) this.A02).invoke(this.A01);
                return C0eB.A00;
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) ((KBO) this.A02).A01.getValue();
                boolean A1a = AbstractC166987dD.A1a(((InterfaceC74963Ym) this.A01).getValue());
                A00 = AbstractC141776au.A00(abstractC52922bZ);
                b5g = new PZW(abstractC52922bZ, (InterfaceC23621Ds) null, 16, A1a);
                AbstractC166987dD.A1Z(b5g, A00);
                return C0eB.A00;
            case 43:
                return Boolean.valueOf(AbstractC167007dF.A1O(((WindowInsets) ((InterfaceC74963Ym) this.A02).getValue()).AhR((InterfaceC1128957x) this.A01)));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                C9R5 c9r5 = (C9R5) this.A02;
                c9r5.A01((InterfaceC16820sZ) this.A01);
                c9r5.A00 = null;
                return C0eB.A00;
            case 47:
            case 48:
                InterfaceC16820sZ interfaceC16820sZ3 = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ3 != null && (invoke2 = interfaceC16820sZ3.invoke()) != null) {
                    return invoke2;
                }
                return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
        }
    }
}
