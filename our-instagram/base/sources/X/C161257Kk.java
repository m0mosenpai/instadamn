package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.7Kk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161257Kk extends AbstractC161267Kl {
    public final C7Kp A00;

    @Override // X.AbstractC161267Kl, X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        ViewGroup viewGroup;
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 2);
        super.ADX(c47701L4i, c7l3, str, z, z2);
        C7Kp c7Kp = this.A00;
        View view = c47701L4i.A01;
        C14360o3.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        c7Kp.A00((C66340UAd) view, str);
        View view2 = c47701L4i.A02;
        C14360o3.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        c7Kp.A01((C66340UAd) view2, str);
        if (!z && (viewGroup = c47701L4i.A05) != null) {
            viewGroup.post(new M5H(c47701L4i, this, str));
        }
    }

    @Override // X.InterfaceC161277Km
    public final C47701L4i Csm(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, C162867Qx c162867Qx) {
        C14360o3.A0B(context, 0);
        return new C47701L4i(shapeDrawable, new C66340UAd(context), new C66340UAd(context), new UAV(context), view, viewGroup, imageView, c162867Qx);
    }

    @Override // X.AbstractC161267Kl, X.InterfaceC161277Km
    public final boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 3);
        super.D3T(c47701L4i, c7l3, str, z);
        if (this.A00.A04(str)) {
            return A04(c47701L4i, str, new MHY(this, c47701L4i, C05F.A01, str, 3, z), MFC.A00, true);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C161257Kk(X.C161227Kh r8, X.C161237Ki r9, X.C161247Kj r10) {
        /*
            r7 = this;
            X.7Kn r3 = new X.7Kn
            r3.<init>()
            r1 = 1
            r0 = 0
            X.7Ko r4 = new X.7Ko
            r4.<init>(r0, r0, r1)
            X.7Kp r0 = new X.7Kp
            r0.<init>()
            r1 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161257Kk.<init>(X.7Kh, X.7Ki, X.7Kj):void");
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return AnonymousClass541.A0C;
    }
}
