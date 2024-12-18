package X;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.litho.annotations.Comparable;
import com.facebook.litho.annotations.Prop;

/* renamed from: X.Bpr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26656Bpr extends AbstractC50792Va {

    @Comparable(type = 3)
    @Prop(optional = true, resType = EnumC27347C5c.COLOR)
    public int A00;

    @Comparable(type = JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET)
    @Prop(optional = true, resType = EnumC27347C5c.DRAWABLE)
    public Drawable A01;

    @Override // X.AbstractC50812Vc
    public final boolean A0S() {
        return true;
    }

    @Override // X.AbstractC50812Vc
    public final boolean A0T() {
        return true;
    }

    @Override // X.AbstractC50792Va
    public final void A0o(C2XE c2xe) {
        Drawable A00 = CCK.A00(c2xe, 0);
        if (A00 != null) {
            this.A01 = A00;
        }
    }

    @Override // X.AbstractC50792Va
    public final boolean A19(AbstractC50812Vc abstractC50812Vc, boolean z) {
        if (this != abstractC50812Vc) {
            if (abstractC50812Vc != null && getClass() == abstractC50812Vc.getClass()) {
                C26656Bpr c26656Bpr = (C26656Bpr) abstractC50812Vc;
                if (this.A00 == c26656Bpr.A00) {
                    Drawable drawable = this.A01;
                    Drawable drawable2 = c26656Bpr.A01;
                    if (drawable != null) {
                        if (!drawable.equals(drawable2)) {
                        }
                    } else if (drawable2 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C26656Bpr() {
        super("Progress");
        this.A00 = 0;
    }

    @Override // X.AbstractC50812Vc
    public final Object A0R(Context context) {
        return new ProgressBar(context);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5Mh, java.lang.Object] */
    @Override // X.AbstractC50792Va
    public final /* bridge */ /* synthetic */ InterfaceC115915Mh A0f() {
        return new Object();
    }

    @Override // X.AbstractC50792Va
    public final void A0p(C2XE c2xe) {
        Drawable drawable = this.A01;
        if (drawable == null) {
            drawable = CCK.A00(c2xe, R.attr.progressBarStyle);
        }
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        ((C28940Cpo) c2y5.A05).A00 = drawable;
    }

    @Override // X.AbstractC50792Va
    public final void A0u(C2XE c2xe, C2WI c2wi, Object obj) {
        ProgressBar progressBar = (ProgressBar) obj;
        int i = this.A00;
        C2Y5 c2y5 = c2xe.A05;
        c2y5.getClass();
        Drawable drawable = ((C28940Cpo) c2y5.A05).A00;
        if (drawable != null) {
            progressBar.setIndeterminateDrawable(drawable);
        }
        if (i != 0 && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().mutate().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        }
    }

    @Override // X.AbstractC50792Va
    public final void A0w(C2XE c2xe, C2WI c2wi, Object obj) {
        ProgressBar progressBar = (ProgressBar) obj;
        int i = this.A00;
        c2xe.A05.getClass();
        if (i != 0 && progressBar.getIndeterminateDrawable() != null) {
            progressBar.getIndeterminateDrawable().mutate().clearColorFilter();
        }
        progressBar.setIndeterminateDrawable(null);
    }

    @Override // X.AbstractC50792Va
    public final void A0z(InterfaceC115915Mh interfaceC115915Mh, InterfaceC115915Mh interfaceC115915Mh2) {
        ((C28940Cpo) interfaceC115915Mh).A00 = ((C28940Cpo) interfaceC115915Mh2).A00;
    }

    @Override // X.AbstractC50812Vc
    public final Integer A0Q() {
        return C05F.A0C;
    }

    @Override // X.AbstractC50792Va
    public final void A0r(C2XE c2xe, C2WI c2wi, C2Vj c2Vj, C2W6 c2w6, int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i) == 0 && View.MeasureSpec.getMode(i2) == 0) {
            size = 50;
        } else {
            C14360o3.A0B(c2Vj, 2);
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 0) {
                if (mode2 == 0) {
                    size = 0;
                }
                c2Vj.A00 = size2;
                c2Vj.A01 = size2;
                return;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    c2Vj.A01 = size;
                    if (mode2 != Integer.MIN_VALUE) {
                        if (mode2 != 0) {
                            if (mode2 == 1073741824) {
                                c2Vj.A00 = size2;
                                return;
                            }
                        }
                    } else {
                        size = Math.min(size, size2);
                    }
                }
            } else if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 == 1073741824) {
                        c2Vj.A00 = size2;
                        c2Vj.A01 = Math.min(size, size2);
                        return;
                    }
                }
            } else {
                size = Math.min(size, size2);
            }
            c2Vj.A00 = size2;
            c2Vj.A01 = size2;
            return;
            c2Vj.A00 = size;
        }
        c2Vj.A01 = size;
        c2Vj.A00 = size;
    }
}
