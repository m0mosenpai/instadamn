package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.7Kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161387Kz implements InterfaceC161277Km {
    public final AnonymousClass541 A01 = AnonymousClass541.A0I;
    public final C7Kp A00 = new C7Kp();

    @Override // X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        ViewGroup viewGroup;
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C7Kp c7Kp = this.A00;
        View view = c47701L4i.A01;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        c7Kp.A00((C66340UAd) view, str);
        View view2 = c47701L4i.A02;
        C14360o3.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        c7Kp.A01((C66340UAd) view2, str);
        if (!z && (viewGroup = c47701L4i.A05) != null) {
            viewGroup.post(new RunnableC49980M4v(this, c47701L4i, str));
        }
    }

    @Override // X.InterfaceC161277Km
    public final C47701L4i Csm(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, C162867Qx c162867Qx) {
        C14360o3.A0B(context, 0);
        return new C47701L4i(shapeDrawable, new C66340UAd(context), new C66340UAd(context), new UAV(context), null, viewGroup, null, c162867Qx);
    }

    @Override // X.InterfaceC161277Km
    public final boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C7Kp c7Kp = this.A00;
        if (c7Kp.A04(str)) {
            return VNB.A00(c7Kp, c47701L4i, C05F.A01, str, true, z);
        }
        return false;
    }

    @Override // X.InterfaceC161277Km
    public final void F90(C47701L4i c47701L4i, String str) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C7Kp c7Kp = this.A00;
        View view = c47701L4i.A01;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        c7Kp.A02((C66340UAd) view, str);
        View view2 = c47701L4i.A02;
        C14360o3.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        c7Kp.A03((C66340UAd) view2, str);
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return this.A01;
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ boolean CRi(String str) {
        return false;
    }
}
