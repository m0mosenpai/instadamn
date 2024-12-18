package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.9R2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9R2 {
    public boolean A00;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final C174757qB A06;
    public final UserSession A07;
    public final C9R5 A08;
    public final C9R3 A09;
    public final C9R4 A0A;
    public final InterfaceC1810081c A0B;
    public final Runnable A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC16620sF A0J;
    public final ComponentActivity A0K;

    public static final void A01(C9R2 c9r2) {
        c9r2.A01 = false;
        C174757qB c174757qB = c9r2.A06;
        c174757qB.A0H.A00().setVisibility(4);
        View view = c174757qB.A0F;
        C14360o3.A07(view);
        AbstractC13880nE.A0h(view, c9r2.A05, c9r2.A04);
        AbstractC185998Mt.A00(view);
        view.setX(0.0f);
        view.setY(0.0f);
        C11T.A04(new RunnableC24393Ara(c9r2), 170L);
    }

    public C9R2(Activity activity, ViewGroup viewGroup, C174757qB c174757qB, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, InterfaceC1810081c interfaceC1810081c, Runnable runnable, InterfaceC16620sF interfaceC16620sF) {
        C14360o3.A0B(activity, 1);
        AbstractC167017dG.A1R(userSession, c174757qB);
        C14360o3.A0B(interfaceC1810081c, 4);
        C14360o3.A0B(targetViewSizeProvider, 5);
        C14360o3.A0B(viewGroup, 6);
        this.A07 = userSession;
        this.A06 = c174757qB;
        this.A0B = interfaceC1810081c;
        this.A0C = runnable;
        this.A0J = interfaceC16620sF;
        ComponentActivity componentActivity = (ComponentActivity) activity;
        this.A0K = componentActivity;
        this.A01 = true;
        this.A0I = new C60842q8(new B8Q(componentActivity, 11), new B8Q(this, 13), new B61(47, null, componentActivity), new C0YZ(C208779Ll.class));
        this.A09 = new C9R3(viewGroup, userSession, targetViewSizeProvider, new B8Q(this, 4));
        this.A0G = B8Q.A01(viewGroup, 8);
        this.A0F = B8Q.A01(this, 7);
        this.A0E = B8Q.A01(viewGroup, 6);
        this.A0D = B8Q.A01(this, 5);
        this.A0H = B8Q.A01(viewGroup, 12);
        float A00 = AbstractC13880nE.A00(componentActivity, 296.0f);
        this.A03 = A00;
        float f = A00 / 2.0f;
        this.A02 = f;
        InterfaceC1812882f interfaceC1812882f = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        int width = interfaceC1812882f.getWidth();
        this.A05 = width;
        int height = interfaceC1812882f.getHeight();
        this.A04 = height;
        this.A08 = new C9R5(AbstractC166987dD.A0d(this.A0D), AbstractC166987dD.A0d(this.A0F), viewGroup, c174757qB, f, (int) A00, width, height);
        this.A0A = new C9R4(componentActivity, userSession, (IgTextView) this.A0H.getValue());
        interfaceC1810081c.A82(new C9PZ(this, 4));
    }

    public static final void A00(Bitmap bitmap, C9R2 c9r2) {
        Bitmap A01 = AbstractC70197WGf.A01(c9r2.A0K, bitmap, c9r2.A05, c9r2.A04, -16777216, false);
        InterfaceC09390do interfaceC09390do = c9r2.A0F;
        ((ImageView) interfaceC09390do.getValue()).setImageBitmap(A01);
        AbstractC185998Mt.A00(AbstractC166987dD.A0d(interfaceC09390do));
        AbstractC166987dD.A0d(interfaceC09390do).setVisibility(4);
        InterfaceC09390do interfaceC09390do2 = c9r2.A0D;
        ((ImageView) interfaceC09390do2.getValue()).setImageBitmap(bitmap);
        AbstractC185998Mt.A00(AbstractC166987dD.A0d(interfaceC09390do2));
        AbstractC166987dD.A0d(interfaceC09390do2).setVisibility(0);
    }

    public static final void A02(final C9R2 c9r2, boolean z) {
        if (z) {
            c9r2.A01 = false;
            c9r2.A06.A0H.A00().setVisibility(4);
            if (!AbstractC166987dD.A1a(c9r2.A0J.invoke(new Runnable() { // from class: X.ArX
                @Override // java.lang.Runnable
                public final void run() {
                    C11T.A04(new RunnableC24392ArZ(C9R2.this), 170L);
                }
            }, new RunnableC24391ArY(c9r2)))) {
                c9r2.A00 = false;
                ((C208779Ll) c9r2.A0I.getValue()).A00();
                return;
            }
            return;
        }
        A01(c9r2);
    }

    public final void A03() {
        if (!this.A00) {
            C208779Ll c208779Ll = (C208779Ll) this.A0I.getValue();
            C05A c05a = c208779Ll.A04;
            String str = ((C38052Gof) c05a.getValue()).A00;
            boolean z = ((C38052Gof) c05a.getValue()).A01;
            c05a.getValue();
            C14360o3.A0B(str, 1);
            c05a.Egh(new C38052Gof(str, true, z));
            AnonymousClass195 anonymousClass195 = c208779Ll.A00;
            if (anonymousClass195 == null || !anonymousClass195.isActive()) {
                C141796aw A00 = AbstractC141776au.A00(c208779Ll);
                c208779Ll.A00 = AbstractC23641Du.A04(AnonymousClass191.A00, new MBs(c208779Ll, null, 15), A00);
            }
            this.A00 = true;
            A02(this, this.A06.CR9());
            AbstractC27695CJo.A00(this.A0K, this.A07);
            C9R4 c9r4 = this.A0A;
            C57312k6 A002 = C07Y.A00(c9r4.A03);
            c9r4.A00 = AbstractC23641Du.A04(AnonymousClass191.A00, new C25024B5f(c9r4, null, 27), A002);
        }
    }
}
