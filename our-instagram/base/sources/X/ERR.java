package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.text.CustomTypefaceSpan;

/* loaded from: classes6.dex */
public final class ERR extends AbstractC65632xz {
    public final Context A00;
    public final C31535DtK A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERR(Context context, C31535DtK c31535DtK) {
        this.A00 = context;
        this.A01 = c31535DtK;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1108019498);
        C14360o3.A0B(view, 1);
        AbstractC25225BEi.A1S(obj);
        String str = (String) obj;
        C31535DtK c31535DtK = this.A01;
        AbstractC167007dF.A1D(str, 1, c31535DtK);
        ViewOnClickListenerC35682FpH.A01(view, 32, c31535DtK);
        C34534FJu c34534FJu = (C34534FJu) view.getTag();
        Context context = view.getContext();
        if (c34534FJu != null && context != null) {
            String A0q = AbstractC166997dE.A0q(view.getResources(), 2131962711);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) A0q);
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str);
            Typeface A0R = AbstractC167017dG.A0R(context);
            if (A0R != null) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan(A0R), length, spannableStringBuilder.length(), 33);
                TextView textView = c34534FJu.A01;
                textView.setText(spannableStringBuilder);
                textView.setContentDescription(AbstractC167007dF.A0f(context, spannableStringBuilder, 2131963468));
                AbstractC56952jT.A01(c34534FJu.A00);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C0f9.A0A(-2069395098, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -409124397);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.follow_list_sorting_entry_row, false);
        A0C.setTag(new C34534FJu(A0C));
        C0f9.A0A(1403025550, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
