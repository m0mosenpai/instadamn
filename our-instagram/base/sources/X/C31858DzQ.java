package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.DzQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31858DzQ extends UGO {
    public final /* synthetic */ C32279EJq A00;

    @Override // X.C8S8
    public final void clearView(RecyclerView recyclerView, C3OO c3oo) {
        boolean A1R = AbstractC167007dF.A1R(0, recyclerView, c3oo);
        super.clearView(recyclerView, c3oo);
        CardView cardView = (CardView) c3oo.itemView;
        if (cardView != null) {
            AnimatorSet A04 = AbstractC31181DnP.A04();
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            fArr[0] = cardView.getAlpha();
            fArr[A1R ? 1 : 0] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) property, fArr);
            C14360o3.A07(ofFloat);
            float cardElevation = cardView.getCardElevation();
            float A042 = AbstractC166997dE.A04(cardView.getContext(), R.dimen.action_bar_item_spacing_left);
            float[] fArr2 = new float[2];
            fArr2[0] = cardElevation;
            fArr2[A1R ? 1 : 0] = A042;
            C35292FhR.A00(ofFloat, A04, ValueAnimator.ofFloat(fArr2), cardView, 6);
        }
    }

    @Override // X.C8S8
    public final boolean isLongPressDragEnabled() {
        return false;
    }

    @Override // X.C8S8
    public final void onSelectedChanged(C3OO c3oo, int i) {
        CardView cardView;
        if (i == 2) {
            View view = null;
            if (c3oo != null) {
                view = c3oo.itemView;
            }
            if ((view instanceof CardView) && (cardView = (CardView) view) != null) {
                AnimatorSet A04 = AbstractC31181DnP.A04();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, (Property<CardView, Float>) View.ALPHA, cardView.getAlpha(), 0.7f);
                C14360o3.A07(ofFloat);
                C35292FhR.A00(ofFloat, A04, ValueAnimator.ofFloat(cardView.getCardElevation(), AbstractC166997dE.A04(cardView.getContext(), R.dimen.abc_button_padding_horizontal_material)), cardView, 6);
            }
        }
    }

    @Override // X.C8S8
    public final void onSwiped(C3OO c3oo, int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31858DzQ(C32279EJq c32279EJq) {
        super(3, 0);
        this.A00 = c32279EJq;
    }

    @Override // X.C8S8
    public final boolean onMove(RecyclerView recyclerView, C3OO c3oo, C3OO c3oo2) {
        boolean A1b = AbstractC25233BEq.A1b(recyclerView, c3oo, c3oo2);
        int bindingAdapterPosition = c3oo.getBindingAdapterPosition();
        int bindingAdapterPosition2 = c3oo2.getBindingAdapterPosition();
        C32279EJq c32279EJq = this.A00;
        List list = c32279EJq.A03;
        Object obj = list.get(bindingAdapterPosition2);
        List list2 = c32279EJq.A03;
        list2.set(bindingAdapterPosition2, list2.get(bindingAdapterPosition));
        list.set(bindingAdapterPosition, obj);
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            c2uu.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        }
        return A1b;
    }
}
