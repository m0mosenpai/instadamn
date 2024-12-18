package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WFk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70182WFk {
    public static final C70182WFk A00 = new Object();

    public static final void A01(Context context, ImageView imageView, InterfaceC11380iw interfaceC11380iw, Hashtag hashtag, boolean z) {
        if (z) {
            boolean A03 = AbstractC81033jX.A03(hashtag.Bhu());
            String A002 = AbstractC111324zv.A00(21);
            if (!A03) {
                ImageUrl Bhu = hashtag.Bhu();
                if (Bhu != null) {
                    C14360o3.A0C(imageView, A002);
                    ((IgImageView) imageView).setUrl(Bhu, interfaceC11380iw);
                }
                imageView.setPadding(0, 0, 0, 0);
            } else {
                C14360o3.A0C(imageView, A002);
                IgImageView igImageView = (IgImageView) imageView;
                igImageView.setPlaceHolderColor(context.getColor(R.color.baseline_neutral_80));
                igImageView.A0B();
            }
            imageView.setColorFilter((ColorFilter) null);
            return;
        }
        C14360o3.A0C(imageView, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView");
        U3G.A00(context, (CircularImageView) imageView, C05F.A01);
    }

    public static final void A03(Hashtag hashtag, Tx0 tx0, C69652Vst c69652Vst, boolean z, boolean z2) {
        String BrA;
        IgTextView igTextView;
        if (!z) {
            if (tx0.A0J) {
                BrA = tx0.A09;
            } else {
                BrA = hashtag.BrA();
            }
            if (BrA != null && BrA.length() != 0) {
                if (z2) {
                    c69652Vst.A06.setVisibility(8);
                    igTextView = c69652Vst.A07;
                } else {
                    c69652Vst.A07.setVisibility(8);
                    igTextView = c69652Vst.A06;
                }
                igTextView.setText(BrA);
                igTextView.setVisibility(0);
                return;
            }
        }
        c69652Vst.A06.setVisibility(8);
        c69652Vst.A07.setVisibility(8);
    }

    public static final View A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_hashtag);
        C14360o3.A0A(A0A);
        A0A.setTag(new C69652Vst(A0A));
        return A0A;
    }

    public static final void A02(View view) {
        AbstractC65702TsY.A0w(AbstractC25228BEl.A0M(view), AbstractC31177DnL.A0G(view));
    }
}
