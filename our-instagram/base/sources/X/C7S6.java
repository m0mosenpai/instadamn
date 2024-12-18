package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.7S6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7S6 implements C7QD {
    public Drawable A00;
    public LayerDrawable A01;
    public LinearLayout A02;
    public TextView A03;
    public IgSimpleImageView A04;
    public C7BQ A05;
    public final C57012jc A06;
    public final C7ZX A07;
    public final Context A08;

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        if (r5.contentEquals(r0) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C7BQ r15) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7S6.A00(X.7BQ):void");
    }

    @Override // X.C7QD
    public final View BKF() {
        C57012jc c57012jc = this.A06;
        if (c57012jc.A00 != null) {
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            return A01;
        }
        ViewStub viewStub = c57012jc.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C7S6(C57012jc c57012jc, C7ZX c7zx) {
        this.A06 = c57012jc;
        this.A07 = c7zx;
        Context context = BKF().getContext();
        C14360o3.A07(context);
        this.A08 = context;
        c57012jc.A02 = new InterfaceC69513Al() { // from class: X.7S7
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                Drawable findDrawableByLayerId;
                C7S6 c7s6 = C7S6.this;
                c7s6.A02 = (LinearLayout) view.requireViewById(R.id.message_comments_pill_container);
                c7s6.A03 = (TextView) view.requireViewById(R.id.comments_number);
                c7s6.A04 = (IgSimpleImageView) view.requireViewById(R.id.comment_icon);
                LinearLayout linearLayout = c7s6.A02;
                if (linearLayout == null) {
                    C14360o3.A0F("commentsMessagePill");
                    throw C00O.createAndThrow();
                }
                Drawable background = linearLayout.getBackground();
                if (background != null) {
                    LayerDrawable layerDrawable = (LayerDrawable) background;
                    c7s6.A01 = layerDrawable;
                    if (layerDrawable != null && (findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.message_comments_pill_shadow_layer)) != null) {
                        c7s6.A00 = findDrawableByLayerId;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
        };
    }
}
