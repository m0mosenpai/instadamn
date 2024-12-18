package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.Bv8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26967Bv8 extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        String str;
        ImageView.ScaleType scaleType;
        PorterDuffColorFilter porterDuffColorFilter;
        ImageView imageView = (ImageView) view;
        AbstractC167017dG.A1N(c6fg, c102884kP);
        android.net.Uri A00 = C6BR.A00(c6fg, c102884kP);
        if (A00 != null) {
            str = A00.toString();
        } else {
            str = null;
        }
        String A0F = c102884kP.A0F();
        if (A0F == null) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else {
            try {
                scaleType = C6BE.A0A(A0F);
            } catch (C41M unused) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
        }
        C102884kP A08 = c102884kP.A08(35);
        if (A08 != null) {
            int A002 = C6BK.A00(c6fg, A08, 0);
            if (A002 != 0) {
                porterDuffColorFilter = new PorterDuffColorFilter(A002, PorterDuff.Mode.SRC_ATOP);
            } else {
                porterDuffColorFilter = null;
            }
        } else {
            porterDuffColorFilter = null;
        }
        AbstractC131765xC.A00(porterDuffColorFilter, scaleType, imageView, c6fg, c102884kP, c102884kP.A0B(44), str, c102884kP.A0U(false));
        return null;
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
        AbstractC131765xC.A01((ImageView) view);
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return new ImageView(context);
    }

    @Override // X.AbstractC65806TuP
    public final /* bridge */ /* synthetic */ View A0J(Context context) {
        throw C00O.createAndThrow();
    }
}
