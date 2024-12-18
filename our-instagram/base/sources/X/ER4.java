package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.business.fragment.CategorySearchFragment;

/* loaded from: classes6.dex */
public final class ER4 extends AbstractC65632xz {
    public final Context A00;
    public final CategorySearchFragment A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 4;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i;
        if (obj instanceof C36213FyR) {
            i = 0;
        } else if (obj instanceof String) {
            i = 1;
        } else if (obj instanceof FLO) {
            i = 2;
        } else {
            if (!(obj instanceof Integer)) {
                return;
            }
            i = 3;
            if (AbstractC166987dD.A0H(obj) != 3) {
                return;
            }
        }
        anonymousClass306.A7a(i);
    }

    public ER4(Context context, CategorySearchFragment categorySearchFragment) {
        this.A00 = context;
        this.A01 = categorySearchFragment;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        TextView textView;
        int i2;
        int A03 = C0f9.A03(365983717);
        if (i != 0) {
            i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AbstractC43591JPw.A00(122));
                        C0f9.A0A(927317546, A03);
                        throw unsupportedOperationException;
                    }
                } else {
                    FLO flo = (FLO) obj;
                    View view2 = ((C3OO) AbstractC31172DnG.A0x(view)).itemView;
                    C0fQ.A00(flo.A01, view2);
                    CompoundButton compoundButton = (CompoundButton) view2;
                    compoundButton.setText(flo.A02);
                    compoundButton.setChecked(flo.A00);
                }
                C0f9.A0A(-1492256036, A03);
            }
            textView = ((C33582Esu) AbstractC31172DnG.A0x(view)).A00;
            textView.setText((String) obj);
        } else {
            C34400FEq c34400FEq = (C34400FEq) AbstractC31172DnG.A0x(view);
            C36213FyR c36213FyR = (C36213FyR) obj;
            CategorySearchFragment categorySearchFragment = this.A01;
            textView = c34400FEq.A00;
            textView.setText(c36213FyR.A02);
            ViewOnClickListenerC35683FpI.A00(textView, 14, c36213FyR, categorySearchFragment);
            i2 = 2;
        }
        AbstractC010103p.A0B(textView, new UEG(i2));
        C0f9.A0A(-1492256036, A03);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.Esu] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int i2;
        View view;
        int A03 = C0f9.A03(201135655);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        i2 = -848552359;
                        view = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.divider_layout);
                    } else {
                        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AbstractC43591JPw.A00(122));
                        C0f9.A0A(-475478758, A03);
                        throw unsupportedOperationException;
                    }
                } else {
                    View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_selection_item);
                    A0A.setTag(new C3OO(A0A));
                    i2 = 1061642694;
                    view = A0A;
                }
            } else {
                View A0A2 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.categories_header);
                ?? obj = new Object();
                obj.A00 = AbstractC166997dE.A0T(A0A2, R.id.categories_header_text);
                A0A2.setTag(obj);
                i2 = -553750416;
                view = A0A2;
            }
        } else {
            View A0A3 = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.row_category);
            A0A3.setTag(new C34400FEq(A0A3));
            i2 = -1951458875;
            view = A0A3;
        }
        C0f9.A0A(i2, A03);
        return view;
    }
}
