package X;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.List;

/* renamed from: X.AnX, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24148AnX implements InterfaceC1829489p {
    public final ColorDrawable A00;
    public final UserSession A01;
    public final C8FC A02;
    public final InteractiveDrawableContainer A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;

    public C24148AnX(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, C183618Cm c183618Cm, C1810281e c1810281e, InteractiveDrawableContainer interactiveDrawableContainer) {
        int A06 = AbstractC167007dF.A06(1, interactiveDrawableContainer, userSession);
        C14360o3.A0B(c1810281e, 3);
        C14360o3.A0B(abstractC59962oe, 4);
        AbstractC167017dG.A1T(c183618Cm, view);
        this.A03 = interactiveDrawableContainer;
        this.A01 = userSession;
        this.A08 = AbstractC186288Nw.A00(new AUT(userSession, c1810281e), c183618Cm, new C0YZ(C210769Ty.class));
        this.A06 = C1XM.A00(new C57523Pfx(view, 3));
        this.A05 = C1XM.A00(new C57523Pfx(this, A06));
        this.A07 = C1XM.A00(new C57523Pfx(this, 4));
        this.A04 = C1XM.A00(new C57523Pfx(this, 1));
        ColorDrawable colorDrawable = new ColorDrawable(interactiveDrawableContainer.getContext().getColor(R.color.black_60_transparent));
        colorDrawable.setBounds(new Rect(0, 0, interactiveDrawableContainer.getWidth(), interactiveDrawableContainer.getHeight()));
        this.A00 = colorDrawable;
        Integer num = C05F.A00;
        this.A02 = new C8FC((C8D0) new C221619qQ(colorDrawable.getBounds()), (C8FD) null, (C89G) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 8, false, false, false, false, false, false, false, true, true, true, true, true, false, false);
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        C57312k6 A00 = C07Y.A00(viewLifecycleOwner);
        AbstractC23641Du.A03(num, AnonymousClass191.A00, new C57160PZe(viewLifecycleOwner, c07s, this, (InterfaceC23621Ds) null, 12), A00);
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cud(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cuq() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cur() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Cvp(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCJ(Drawable drawable, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCK(float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DCL(Drawable drawable) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQa(Drawable drawable, int i, float f, float f2) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DQk() {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dep(Drawable drawable, int i, boolean z) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Din(Drawable drawable, float f, float f2, float f3, float f4) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1829489p
    public final void Dmk(Drawable drawable, int i, float f, float f2) {
        Object value;
        java.util.Set set;
        C14360o3.A0B(drawable, 1);
        C210769Ty c210769Ty = (C210769Ty) this.A08.getValue();
        C05A c05a = c210769Ty.A03;
        do {
            value = c05a.getValue();
            C183888Do c183888Do = c210769Ty.A01;
            if ((drawable instanceof C74Q) && ((C74Q) drawable).CaH(c183888Do.A01)) {
                java.util.Set set2 = c183888Do.A00;
                Integer valueOf = Integer.valueOf(i);
                boolean contains = set2.contains(valueOf);
                java.util.Set set3 = c183888Do.A00;
                if (contains) {
                    set = AnonymousClass090.A03(valueOf, set3);
                } else {
                    set = AnonymousClass090.A01(valueOf, set3);
                }
                c183888Do.A00 = set;
            } else {
                set = c183888Do.A00;
            }
        } while (!c05a.AIi(value, new C219369mk(set, false)));
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void Dmm(Drawable drawable, float f, float f2, float f3, float f4, int i) {
    }

    @Override // X.InterfaceC1829489p
    public final /* synthetic */ void DuD() {
    }
}
