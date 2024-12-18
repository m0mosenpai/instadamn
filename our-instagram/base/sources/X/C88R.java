package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.88R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88R {
    public View A00;
    public View A01;
    public ImageView A02;
    public IgTextView A03;
    public TouchInterceptorFrameLayout A04;
    public final int A05;
    public final Context A06;
    public final View A07;
    public final C57012jc A08;
    public final C88T A09;
    public final C88Q A0A;
    public final InterfaceC1810081c A0B;

    public final void A00() {
        C88T c88t = this.A09;
        C88R c88r = c88t.A0B.A00;
        c88r.A00.getClass();
        c88r.A00.setBackgroundColor(c88r.A06.getColor(R.color.black_60_transparent));
        c88r.A00.setOnTouchListener(new ATE(c88r));
        c88t.A03.setText((CharSequence) null);
        c88t.A08 = true;
        c88t.A07.setOnFocusChangeListener(c88t);
        SearchEditText searchEditText = c88t.A07;
        searchEditText.A0C = c88t;
        searchEditText.A0F = c88t;
        searchEditText.A05();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if (r7.A05() > 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r0 > r5) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(X.ACt r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88R.A01(X.ACt):void");
    }

    public C88R(Context context, View view, C3I9 c3i9, C57012jc c57012jc, C88Q c88q, InterfaceC1810081c interfaceC1810081c, boolean z) {
        int i;
        this.A06 = context;
        this.A0A = c88q;
        this.A0B = interfaceC1810081c;
        this.A08 = c57012jc;
        this.A09 = new C88T(context, c3i9, new C88S(this), c88q, interfaceC1810081c);
        this.A07 = view;
        Resources resources = context.getResources();
        if (z) {
            i = resources.getDimensionPixelOffset(R.dimen.audition_flow_picker_subtitle_margin_bottom);
        } else {
            i = 0;
        }
        this.A05 = i;
    }
}
