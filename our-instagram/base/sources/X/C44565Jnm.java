package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Jnm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44565Jnm extends C2UU {
    public final UserSession A00;
    public final LinkedHashMap A01;
    public final Activity A02;
    public final LinkedHashMap A03;
    public final LinkedHashMap A04;
    public final List A05;

    public C44565Jnm(Activity activity, UserSession userSession, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, List list) {
        AbstractC167007dF.A1F(activity, 1, linkedHashMap2);
        C14360o3.A0B(userSession, 6);
        this.A02 = activity;
        this.A05 = list;
        this.A03 = linkedHashMap;
        this.A01 = linkedHashMap2;
        this.A04 = linkedHashMap3;
        this.A00 = userSession;
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        Float f;
        C14360o3.A0B(c3oo, 0);
        if (c3oo instanceof C44686JqV) {
            String A1I = AbstractC25226BEj.A1I(this.A05, i);
            C44686JqV c44686JqV = (C44686JqV) c3oo;
            IgImageView igImageView = c44686JqV.A02;
            int dimensionPixelSize = AbstractC25228BEl.A0M(igImageView).getDimensionPixelSize(R.dimen.alt_text_carousel_card_width);
            Number A0W = AbstractC31171DnF.A0W(A1I, this.A03);
            Bitmap bitmap = null;
            if (A0W != null) {
                float floatValue = dimensionPixelSize / A0W.floatValue();
                f = Float.valueOf(floatValue);
                if (f != null) {
                    bitmap = C1NC.A0E(A1I, dimensionPixelSize, (int) floatValue);
                }
            } else {
                f = null;
            }
            igImageView.setImageBitmap(bitmap);
            String A0h = AbstractC31171DnF.A0h(A1I, this.A04);
            IgTextView igTextView = c44686JqV.A01;
            igTextView.setText((CharSequence) this.A01.get(A0h));
            C0fQ.A00(new ViewOnClickListenerC35674Fp9(A0W, this, A0h, A1I, 3), igTextView);
            if (f != null) {
                c44686JqV.A00.getLayoutParams().height = (int) (f.floatValue() + AbstractC166987dD.A04(AbstractC25228BEl.A0M(igTextView), R.dimen.alt_text_carousel_input_height));
            }
            ViewTreeObserver viewTreeObserver = igTextView.getViewTreeObserver();
            if (viewTreeObserver != null) {
                JXP.A00(viewTreeObserver, c3oo, 2);
            }
        }
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C44686JqV(AbstractC25227BEk.A0D(LayoutInflater.from(this.A02), viewGroup, R.layout.alt_text_carousel_card_layout, false));
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1575395510);
        int size = this.A05.size();
        C0f9.A0A(654883563, A03);
        return size;
    }
}
