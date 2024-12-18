package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7Ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161317Ks extends AbstractC161267Kl {
    @Override // X.AbstractC161267Kl, X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 2);
        super.ADX(c47701L4i, c7l3, str, z, z2);
        C162867Qx c162867Qx = c47701L4i.A07;
        if (c162867Qx != null) {
            c162867Qx.A01(new C45353K5m(this.A00, c7l3.A00));
        }
        if (!z) {
            A04(c47701L4i, str, new ME5(37, c7l3, this, c47701L4i), new MHS(c47701L4i, 36), false);
        }
    }

    @Override // X.InterfaceC161277Km
    public final C47701L4i Csm(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, C162867Qx c162867Qx) {
        C14360o3.A0B(context, 0);
        return new C47701L4i(shapeDrawable, new IgImageView(context), null, null, view, viewGroup, imageView, c162867Qx);
    }

    @Override // X.AbstractC161267Kl, X.InterfaceC161277Km
    public final boolean D3T(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 3);
        super.D3T(c47701L4i, c7l3, str, z);
        if (this.A01.A00.contains(str)) {
            return false;
        }
        return A04(c47701L4i, str, new ME5(37, c7l3, this, c47701L4i), new MHS(c47701L4i, 36), true);
    }

    @Override // X.InterfaceC161277Km
    public final void F90(C47701L4i c47701L4i, String str) {
        ImageView imageView;
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        View view = c47701L4i.A01;
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable(null);
        }
        C162867Qx c162867Qx = c47701L4i.A07;
        if (c162867Qx != null) {
            c162867Qx.A01(null);
        }
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return AnonymousClass541.A0B;
    }
}
