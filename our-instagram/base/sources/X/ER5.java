package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ER5 extends AbstractC65632xz {
    public final Context A00;
    public final ENK A01;

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        anonymousClass306.A7a(0);
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ER5(Context context, ENK enk) {
        this.A00 = context;
        this.A01 = enk;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = C0f9.A03(1681916901);
        C34401FEr c34401FEr = (C34401FEr) AbstractC31172DnG.A0x(view);
        FJC fjc = (FJC) obj;
        ENK enk = this.A01;
        AbstractC167027dH.A12(c34401FEr, fjc, enk);
        TextView textView = c34401FEr.A00;
        textView.setText(fjc.A01);
        ViewOnClickListenerC35683FpI.A00(textView, 15, fjc, enk);
        C0f9.A0A(-622014360, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(-1365289419);
        View A07 = AbstractC31175DnJ.A07(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.row_city, false);
        A07.setTag(new C34401FEr(A07));
        C0f9.A0A(977374153, A03);
        return A07;
    }
}
