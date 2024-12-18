package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ER6 extends AbstractC65632xz {
    public final Context A00;
    public final FKB A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER6(Context context, FKB fkb) {
        this.A00 = context;
        this.A01 = fkb;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1038010292);
        FIJ fij = (FIJ) obj;
        TextView textView = (TextView) view;
        Integer num = fij.A00;
        String str = fij.A01;
        FKB fkb = this.A01;
        Context context = textView.getContext();
        int intValue = num.intValue();
        Resources resources = context.getResources();
        SpannableString spannableString = new SpannableString(resources.getString(2131969274));
        spannableString.setSpan(new C31753Dx6(context, fkb, str, 1), 0, spannableString.length(), 18);
        String A0W = AbstractC31175DnJ.A0W(resources, num, R.plurals.anonymous_likers_message, intValue);
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A0W);
        int indexOf = A0W.indexOf("{original_post}");
        A0H.replace(indexOf, indexOf + 15, (CharSequence) spannableString);
        textView.setText(A0H);
        C0f9.A0A(639240891, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(216419037);
        TextView textView = (TextView) AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.aggregated_engagement_view);
        AbstractC25227BEk.A11(textView);
        C0f9.A0A(-653188946, A03);
        return textView;
    }
}
