package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class N91 extends AbstractC65632xz {
    public final int A00 = R.layout.title_row;
    public final C54404O2k A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public N91(C54404O2k c54404O2k) {
        this.A01 = c54404O2k;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1921310715);
        ((TextView) view).setText(((C54486O5o) obj).A00);
        C0f9.A0A(1738667362, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(910683936);
        Context context = viewGroup.getContext();
        TextView textView = (TextView) AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, this.A00);
        textView.setTypeface(AbstractC167017dG.A0R(context));
        C0f9.A0A(571359792, A03);
        return textView;
    }
}
