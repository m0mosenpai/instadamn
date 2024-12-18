package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;

/* renamed from: X.NAc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52239NAc extends AbstractC65806TuP {
    public final C07X A00;

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        AbstractC167017dG.A1N(view, c6fg);
        C14360o3.A0B(c102884kP, 2);
        Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
        C57312k6 A00 = C07Y.A00(this.A00);
        C12T c12t = C12P.A00;
        AbstractC23641Du.A05(AnonymousClass131.A00, new C57170PZo((InterfaceC23621Ds) null, this, A06, A00, c6fg, view, c102884kP, 2), A00);
        return null;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        C14360o3.A0B(context, 0);
        return new FrameLayout(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0L(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) view;
        AbstractC167027dH.A12(viewGroup, c6fg, c102884kP);
        AvatarRetextureSparkPreviewController avatarRetextureSparkPreviewController = (AvatarRetextureSparkPreviewController) AnonymousClass634.A06(c6fg, c102884kP);
        if (avatarRetextureSparkPreviewController != null) {
            C07X c07x = this.A00;
            C14360o3.A0B(c07x, 0);
            c07x.getLifecycle().A0A(avatarRetextureSparkPreviewController.A04);
        }
        viewGroup.removeAllViews();
    }

    public C52239NAc(C07X c07x, C6FG c6fg, C102884kP c102884kP) {
        super(c6fg, c102884kP);
        this.A00 = c07x;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }
}
