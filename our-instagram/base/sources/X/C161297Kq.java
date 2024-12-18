package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.7Kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161297Kq extends AbstractC161267Kl {
    private final boolean A01(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z) {
        View view = c47701L4i.A01;
        if ((view instanceof IgImageView) && view != null) {
            return A04(c47701L4i, str, new MEC(c47701L4i, c7l3, this, view, str, 3), new ME5(36, view, this, c47701L4i), z);
        }
        return false;
    }

    @Override // X.AbstractC161267Kl, X.InterfaceC161277Km
    public final void ADX(C47701L4i c47701L4i, C7L3 c7l3, String str, boolean z, boolean z2) {
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(c7l3, 2);
        super.ADX(c47701L4i, c7l3, str, z, z2);
        C162867Qx c162867Qx = c47701L4i.A07;
        if (c162867Qx != null) {
            c162867Qx.A01(new C44914JuS(this.A00, c7l3.A00));
        }
        if (!z) {
            A01(c47701L4i, c7l3, str, false);
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
        return A01(c47701L4i, c7l3, str, true);
    }

    @Override // X.InterfaceC161277Km
    public final void F90(C47701L4i c47701L4i, String str) {
        ImageView imageView;
        C14360o3.A0B(c47701L4i, 0);
        C14360o3.A0B(str, 1);
        C162867Qx c162867Qx = c47701L4i.A07;
        if (c162867Qx != null) {
            c162867Qx.A01(null);
        }
        View view = c47701L4i.A01;
        if ((view instanceof IgImageView) && (imageView = (ImageView) view) != null) {
            imageView.setImageDrawable(null);
        }
        C7Ko c7Ko = this.A02;
        HashMap hashMap = c7Ko.A01;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                c7Ko.A00.removeCallbacks((Runnable) it.next());
            }
        }
        hashMap.remove(str);
    }

    @Override // X.InterfaceC161277Km
    public final AnonymousClass541 CBO() {
        return AnonymousClass541.A0A;
    }
}
