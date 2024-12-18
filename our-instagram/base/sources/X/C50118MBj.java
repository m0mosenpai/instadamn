package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.google.android.gms.common.api.Status;
import com.instagram.common.session.UserSession;
import com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.MBj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50118MBj extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final boolean A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50118MBj(View view, Fragment fragment, GoogleAuthController googleAuthController, L69 l69, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = googleAuthController;
        this.A03 = fragment;
        this.A06 = interfaceC16820sZ;
        this.A08 = view;
        this.A07 = interfaceC16660sJ;
        this.A01 = l69;
        this.A09 = z;
        this.A05 = interfaceC16660sJ2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            UserSession userSession = (UserSession) this.A08;
            Context context = (Context) this.A03;
            C54799OJt c54799OJt = (C54799OJt) this.A06;
            C50118MBj c50118MBj = new C50118MBj(context, (AbstractC59962oe) this.A05, userSession, (OAD) this.A07, c54799OJt, (ReelDashboardFragment) this.A04, interfaceC23621Ds, this.A09);
            c50118MBj.A01 = obj;
            return c50118MBj;
        }
        GoogleAuthController googleAuthController = (GoogleAuthController) this.A04;
        Fragment fragment = (Fragment) this.A03;
        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
        View view = (View) this.A08;
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A07;
        return new C50118MBj(view, fragment, googleAuthController, (L69) this.A01, interfaceC23621Ds, interfaceC16820sZ, interfaceC16660sJ, (InterfaceC16660sJ) this.A05, this.A09);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        Runnable m5k;
        if (this.A02 != 0) {
            C1JX c1jx = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                C19L c19l = (C19L) this.A01;
                UserSession userSession = (UserSession) this.A08;
                MBp mBp = new MBp(userSession, null, 49);
                AbstractC23641Du.A01(C05F.A00, AnonymousClass191.A00, mBp, c19l);
                C12T c12t = C12P.A00;
                AnonymousClass137 anonymousClass137 = AnonymousClass131.A00;
                Context context = (Context) this.A03;
                C54799OJt c54799OJt = (C54799OJt) this.A06;
                FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2 fxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2 = new FxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2(context, (AbstractC59962oe) this.A05, userSession, (OAD) this.A07, c54799OJt, (ReelDashboardFragment) this.A04, null, this.A09);
                this.A00 = 1;
                if (AbstractC23641Du.A00(this, anonymousClass137, fxShareToFbRowViewBinder$Companion$fetchFbAudienceForStory$1$2) == c1jx) {
                    return c1jx;
                }
            }
        } else {
            C1JX c1jx2 = C1JX.A02;
            if (this.A00 != 0) {
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                GoogleAuthController googleAuthController = (GoogleAuthController) this.A04;
                FragmentActivity A0C = AbstractC31172DnG.A0C(this.A03);
                this.A00 = 1;
                obj = googleAuthController.A08(A0C, this, true);
                if (obj == c1jx2) {
                    return c1jx2;
                }
            }
            AbstractC46349KfX abstractC46349KfX = (AbstractC46349KfX) obj;
            InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A06;
            View view = (View) this.A08;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A07;
            L69 l69 = (L69) this.A01;
            Fragment fragment = (Fragment) this.A03;
            GoogleAuthController googleAuthController2 = (GoogleAuthController) this.A04;
            boolean z = this.A09;
            InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A05;
            if (abstractC46349KfX instanceof C44809Jsg) {
                interfaceC16660sJ2.invoke(((C47228Ku1) ((C44809Jsg) abstractC46349KfX).A00).A00);
            } else if (abstractC46349KfX instanceof C44808Jsf) {
                InterfaceC50380MMi interfaceC50380MMi = (InterfaceC50380MMi) ((C44808Jsf) abstractC46349KfX).A00;
                if (C14360o3.A0K(interfaceC50380MMi, C48152LTb.A00)) {
                    interfaceC16820sZ.invoke();
                } else if (C45130JyW.A00(interfaceC50380MMi, 1)) {
                    if (view != null) {
                        view.post(new RunnableC50013M6c(fragment, interfaceC50380MMi, googleAuthController2, l69, z));
                    }
                    interfaceC16660sJ.invoke(interfaceC50380MMi);
                } else if (C45130JyW.A00(interfaceC50380MMi, 0)) {
                    if (((Rk3) ((C45130JyW) interfaceC50380MMi).A01).A00.A00 == 7) {
                        if (view != null) {
                            m5k = new M5J(fragment, interfaceC50380MMi, interfaceC16660sJ);
                            view.post(m5k);
                        }
                    } else if (view != null) {
                        m5k = new M6G(fragment, interfaceC50380MMi, interfaceC16660sJ, z);
                        view.post(m5k);
                    }
                } else if (C14360o3.A0K(interfaceC50380MMi, LTX.A00)) {
                    C45130JyW c45130JyW = new C45130JyW(new Rk3(new Status(5, null)));
                    if (view != null) {
                        m5k = new M6H(fragment, c45130JyW, interfaceC16660sJ, z);
                        view.post(m5k);
                    }
                } else if (!C14360o3.A0K(interfaceC50380MMi, LTV.A00) && !C14360o3.A0K(interfaceC50380MMi, LTW.A00) && !C14360o3.A0K(interfaceC50380MMi, LTZ.A00) && !C14360o3.A0K(interfaceC50380MMi, C48151LTa.A00) && !(interfaceC50380MMi instanceof C45129JyV)) {
                    if (!C14360o3.A0K(interfaceC50380MMi, LTY.A00)) {
                        throw B4Z.A00();
                    }
                } else if (view != null) {
                    m5k = new M5K(fragment, interfaceC50380MMi, interfaceC16660sJ);
                    view.post(m5k);
                }
            } else {
                throw B4Z.A00();
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C50118MBj) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50118MBj(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, OAD oad, C54799OJt c54799OJt, ReelDashboardFragment reelDashboardFragment, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        super(2, interfaceC23621Ds);
        this.A08 = userSession;
        this.A03 = context;
        this.A06 = c54799OJt;
        this.A07 = oad;
        this.A05 = abstractC59962oe;
        this.A04 = reelDashboardFragment;
        this.A09 = z;
    }
}
