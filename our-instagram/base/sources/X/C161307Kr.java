package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.7Kr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161307Kr extends AbstractC161267Kl {
    @Override // X.AbstractC161267Kl, X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 2);
        super.ADX(c47701L4i, c7l3, str, z, z2);
        A01(c47701L4i, c7l3, this);
        if (!z) {
            A04(c47701L4i, str, new ME5(39, c7l3, this, c47701L4i), new ME5(38, c7l3, this, c47701L4i), false);
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
        return A04(c47701L4i, str, new ME5(39, c7l3, this, c47701L4i), new ME5(38, c7l3, this, c47701L4i), true);
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
    }

    public static final void A01(C47701L4i c47701L4i, C7L3 c7l3, C161307Kr c161307Kr) {
        Context context;
        ImageView imageView;
        ImageView imageView2 = c47701L4i.A06;
        if (imageView2 != null && (context = imageView2.getContext()) != null) {
            View view = c47701L4i.A01;
            if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
                imageView.setImageDrawable(new C45357K5q(context, c161307Kr.A00, c7l3.A00));
            }
        }
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return AnonymousClass541.A0D;
    }
}
