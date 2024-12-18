package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.8Gs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184528Gs implements C82M {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public Drawable A04;
    public Drawable A05;
    public C177497uj A06;
    public C8D0 A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final int A0B;
    public final Context A0C;
    public final TextureView A0D;
    public final C5GJ A0E;
    public final InterfaceC184558Gw A0F;
    public final UserSession A0G;
    public final C1810981l A0H;
    public final C89F A0I;
    public final C183688Ct A0J;
    public final C184538Gu A0K;
    public final InteractiveDrawableContainer A0L;
    public final C89G A0M;
    public final RoundedCornerFrameLayout A0N;
    public final InterfaceC16660sJ A0O;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.89p, X.8Gu] */
    public C184528Gs(Context context, ViewGroup viewGroup, UserSession userSession, C1810981l c1810981l, C1810981l c1810981l2, C89F c89f, C183688Ct c183688Ct, InteractiveDrawableContainer interactiveDrawableContainer, InteractiveDrawableContainer interactiveDrawableContainer2, int i, int i2) {
        C14360o3.A0B(context, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(viewGroup, 4);
        C14360o3.A0B(c183688Ct, 5);
        C14360o3.A0B(c89f, 7);
        this.A0C = context;
        this.A0G = userSession;
        this.A0H = c1810981l;
        this.A0J = c183688Ct;
        this.A0L = interactiveDrawableContainer;
        this.A0I = c89f;
        this.A0B = i;
        this.A0A = i2;
        View requireViewById = viewGroup.requireViewById(R.id.dual_layout);
        C14360o3.A07(requireViewById);
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) requireViewById;
        this.A0N = roundedCornerFrameLayout;
        View requireViewById2 = roundedCornerFrameLayout.requireViewById(R.id.dual_camera_view);
        C14360o3.A07(requireViewById2);
        this.A0D = (TextureView) requireViewById2;
        this.A00 = 0.27499998f;
        this.A01 = -0.23499998f;
        this.A03 = 0.35f;
        this.A0E = C5GJ.ASSET_PICKER;
        this.A0M = new C89G() { // from class: X.8Gt
            @Override // X.C89G
            public final /* synthetic */ void DM8(int i3) {
            }

            @Override // X.C89G
            public final void DWV(float f) {
                C184528Gs c184528Gs = C184528Gs.this;
                c184528Gs.A00 = f;
                c184528Gs.A0N.setTranslationX(f);
                C184528Gs.A00(c184528Gs);
            }

            @Override // X.C89G
            public final void DWW(float f) {
                C184528Gs c184528Gs = C184528Gs.this;
                c184528Gs.A01 = f;
                c184528Gs.A0N.setTranslationY(f);
                C184528Gs.A00(c184528Gs);
            }

            @Override // X.C89G
            public final void DhY(float f) {
                C184528Gs c184528Gs = C184528Gs.this;
                c184528Gs.A02 = f;
                c184528Gs.A0N.setRotation(f);
                C184528Gs.A00(c184528Gs);
            }

            @Override // X.C89G
            public final void DiN(float f) {
                C184528Gs c184528Gs = C184528Gs.this;
                c184528Gs.A03 = f;
                RoundedCornerFrameLayout roundedCornerFrameLayout2 = c184528Gs.A0N;
                roundedCornerFrameLayout2.setScaleX(f);
                roundedCornerFrameLayout2.setScaleY(f);
                C184528Gs.A00(c184528Gs);
            }
        };
        ?? r1 = new InterfaceC1829489p() { // from class: X.8Gu
            public boolean A00;

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Cud(Drawable drawable) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Cuq() {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Cvp(Drawable drawable, int i3) {
            }

            @Override // X.InterfaceC1829489p
            public final void DCJ(Drawable drawable, int i3) {
                this.A00 = false;
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DCL(Drawable drawable) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void DQa(Drawable drawable, int i3, float f, float f2) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Dep(Drawable drawable, int i3, boolean z) {
            }

            @Override // X.InterfaceC1829489p
            public final void Din(Drawable drawable, float f, float f2, float f3, float f4) {
                this.A00 = true;
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Dmk(Drawable drawable, int i3, float f, float f2) {
            }

            @Override // X.InterfaceC1829489p
            public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i3) {
            }

            @Override // X.InterfaceC1829489p
            public final void Cur() {
            }

            @Override // X.InterfaceC1829489p
            public final void DQk() {
            }

            @Override // X.InterfaceC1829489p
            public final void DuD() {
                String str;
                C22C A01 = AnonymousClass229.A01(C184528Gs.this.A0G);
                if (this.A00) {
                    str = "TRANSFORM_MULTICAM_PIP";
                } else {
                    str = "MULTICAM_PIP";
                }
                A01.A1R(((C22F) A01).A04.A0C, str);
            }

            @Override // X.InterfaceC1829489p
            public final void DCK(float f, float f2) {
            }
        };
        this.A0K = r1;
        ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        roundedCornerFrameLayout.setLayoutParams(layoutParams);
        interactiveDrawableContainer2.A0v(r1);
        C9EB c9eb = new C9EB(this, 26);
        this.A0O = c9eb;
        this.A0F = new InterfaceC184558Gw() { // from class: X.8Gv
            @Override // X.InterfaceC184558Gw
            public final void Dak() {
                C184528Gs c184528Gs = C184528Gs.this;
                RoundedCornerFrameLayout roundedCornerFrameLayout2 = c184528Gs.A0N;
                roundedCornerFrameLayout2.setVisibility(4);
                c184528Gs.A0D.setVisibility(4);
                roundedCornerFrameLayout2.setAlpha(0.0f);
                roundedCornerFrameLayout2.setCornerRadius(50);
                c184528Gs.A0L.A0S = true;
                roundedCornerFrameLayout2.post(new RunnableC24354Aqx(c184528Gs));
            }
        };
        c1810981l2.A0I(new C184568Gx(c9eb));
    }

    @Override // X.C82M
    public final /* synthetic */ void A7T(Parcelable parcelable) {
    }

    public static final void A00(C184528Gs c184528Gs) {
        C177497uj c177497uj = c184528Gs.A06;
        if (c177497uj != null) {
            float f = (-c184528Gs.A00) / c184528Gs.A0B;
            float f2 = c184528Gs.A01 / c184528Gs.A0A;
            float f3 = c184528Gs.A03;
            float f4 = c184528Gs.A02;
            C175007qa c175007qa = ((BasicCameraOutputController) C174757qB.A02(c177497uj.A00)).A04;
            if (c175007qa != null) {
                C174997qZ c174997qZ = c175007qa.A0R;
                c174997qZ.A03 = f;
                c174997qZ.A04 = f2;
                c174997qZ.A06 = f3;
                c174997qZ.A05 = f4;
                C69716VuB c69716VuB = c174997qZ.A00;
                if (c69716VuB != null) {
                    c69716VuB.A01(f, f2, f3, f4);
                }
            }
        }
    }

    public static final void A01(C184528Gs c184528Gs, boolean z) {
        C177497uj c177497uj = c184528Gs.A06;
        if (c177497uj != null && c184528Gs.A08 != z) {
            c184528Gs.A08 = z;
            boolean A0T = c177497uj.A00.A0T();
            if (z) {
                if (!A0T) {
                    c184528Gs.A09 = true;
                    RoundedCornerFrameLayout roundedCornerFrameLayout = c184528Gs.A0N;
                    roundedCornerFrameLayout.setVisibility(0);
                    TextureView textureView = c184528Gs.A0D;
                    textureView.setVisibility(0);
                    roundedCornerFrameLayout.setAlpha(0.0f);
                    C1813982r c1813982r = c177497uj.A01;
                    C174757qB c174757qB = c1813982r.A02;
                    if (c174757qB != null) {
                        c1813982r.A0A = false;
                        C198038pE c198038pE = new C198038pE(c1813982r);
                        InterfaceC179847yZ A02 = C174757qB.A02(c174757qB);
                        C198108pL c198108pL = new C198108pL(c198038pE, c174757qB);
                        C175007qa c175007qa = ((BasicCameraOutputController) A02).A04;
                        if (c175007qa != null) {
                            c175007qa.A09(textureView, c198108pL);
                        }
                    }
                    InterfaceC184558Gw interfaceC184558Gw = c184528Gs.A0F;
                    C14360o3.A0B(interfaceC184558Gw, 0);
                    c177497uj.A00.A0F(interfaceC184558Gw);
                }
            } else if (A0T) {
                RoundedCornerFrameLayout roundedCornerFrameLayout2 = c184528Gs.A0N;
                AbstractC125325le.A00(roundedCornerFrameLayout2).A0G();
                roundedCornerFrameLayout2.setVisibility(4);
                InteractiveDrawableContainer interactiveDrawableContainer = c184528Gs.A0L;
                interactiveDrawableContainer.A0Q(c184528Gs.A04);
                c184528Gs.A04 = null;
                if (interactiveDrawableContainer.getInteractiveDrawables().size() == 0) {
                    interactiveDrawableContainer.A0S = false;
                }
                InterfaceC184558Gw interfaceC184558Gw2 = c184528Gs.A0F;
                C14360o3.A0B(interfaceC184558Gw2, 0);
                c177497uj.A00.A0G(interfaceC184558Gw2);
                C1813982r c1813982r2 = c177497uj.A01;
                C174757qB c174757qB2 = c1813982r2.A02;
                if (c174757qB2 != null) {
                    c1813982r2.A0A = false;
                    C198028pD c198028pD = new C198028pD(c1813982r2);
                    C175007qa c175007qa2 = ((BasicCameraOutputController) C174757qB.A02(c174757qB2)).A04;
                    if (c175007qa2 != null) {
                        c175007qa2.A0A(c198028pD);
                    }
                }
            }
            C1810981l c1810981l = c184528Gs.A0H;
            C55U c55u = (C55U) c1810981l.A08.A00;
            C81W c81w = C81W.A0G;
            boolean z2 = true;
            if (c1810981l.A0W(C81W.A0D) || c1810981l.A0W(C81W.A0M)) {
                z2 = false;
            }
            c1810981l.A0K(c55u, c81w, z2);
        }
    }

    public final void A02() {
        Drawable drawable = this.A04;
        if (drawable != null) {
            InteractiveDrawableContainer interactiveDrawableContainer = this.A0L;
            interactiveDrawableContainer.A0m(drawable, 0.35f);
            interactiveDrawableContainer.A0l(this.A04, 0.0f);
            interactiveDrawableContainer.A0n(this.A04, this.A0B * 0.27499998f, this.A0A * (-0.23499998f));
        }
    }

    @Override // X.C82M
    public final /* synthetic */ Parcelable ANh() {
        return null;
    }
}
