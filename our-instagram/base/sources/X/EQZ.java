package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EQZ extends AbstractC65632xz {
    public final Context A00;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public EQZ(Context context) {
        this.A00 = context;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1053591665);
        AbstractC167017dG.A1P(view, obj);
        if (MUG.A02(obj, 13)) {
            MUG mug = (MUG) obj;
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.direct.ui.GroupSupportMessageLearnMoreViewBinderGroup.ViewHolder");
            FGW fgw = (FGW) tag;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Context context = view.getContext();
            String A0p = AbstractC166997dE.A0p(context, 2131965054);
            String A0p2 = AbstractC166997dE.A0p(context, 2131965060);
            int i2 = 2131959105;
            if (mug.A01) {
                i2 = 2131959106;
            }
            String A0t = AbstractC31174DnI.A0t(context, A0p, A0p2, i2);
            C14360o3.A07(A0t);
            spannableStringBuilder.append((CharSequence) A0t);
            int A08 = AbstractC001900j.A08(A0t, A0p, 0, false);
            spannableStringBuilder.setSpan(mug.A03, A08, A0p.length() + A08, 17);
            int A082 = AbstractC001900j.A08(A0t, A0p2, 0, false);
            spannableStringBuilder.setSpan(mug.A00, A082, A0p2.length() + A082, 17);
            TextView textView = fgw.A00;
            textView.setText(spannableStringBuilder);
            textView.setContentDescription(spannableStringBuilder);
            AbstractC25227BEk.A11(textView);
        }
        C0f9.A0A(-498142857, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, -2034897296);
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(this.A00), viewGroup, R.layout.layout_thread_detail_group_support_message_learn_more);
        C14360o3.A0A(A0A);
        A0A.setTag(new FGW(A0A));
        C0f9.A0A(1103474530, A0G);
        return A0A;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
