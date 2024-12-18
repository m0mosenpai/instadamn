package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class LW5 implements InterfaceC161277Km {
    public final AnonymousClass541 A00 = AnonymousClass541.A0H;

    @Override // X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        C44409Jjo c44409Jjo;
        C14360o3.A0B(c47701L4i, 0);
        View view = c47701L4i.A02;
        if ((view instanceof C44409Jjo) && (c44409Jjo = (C44409Jjo) view) != null) {
            c44409Jjo.setIsFromMe(z2);
        }
    }

    @Override // X.InterfaceC161277Km
    public final C47701L4i Csm(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, C162867Qx c162867Qx) {
        C14360o3.A0B(context, 0);
        return new C47701L4i(shapeDrawable, null, new C44409Jjo(context), null, null, viewGroup, null, c162867Qx);
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ void F90(C47701L4i c47701L4i, String str) {
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return this.A00;
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ boolean CRi(String str) {
        return false;
    }

    @Override // X.InterfaceC161277Km
    public final /* synthetic */ boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        return false;
    }
}
