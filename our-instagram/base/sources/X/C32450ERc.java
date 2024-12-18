package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.ERc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32450ERc extends AbstractC65632xz {
    public final Context A00;
    public final C31535DtK A01;
    public final boolean A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public C32450ERc(Context context, C31535DtK c31535DtK, boolean z) {
        this.A00 = context;
        this.A02 = z;
        this.A01 = c31535DtK;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 667563362);
        C14360o3.A0B(obj, 2);
        C33604EtG c33604EtG = (C33604EtG) view.getTag();
        String str = (String) obj;
        Context context = this.A00;
        boolean z = this.A02;
        C31535DtK c31535DtK = this.A01;
        C14360o3.A0B(str, 1);
        AbstractC167007dF.A1F(context, 2, c31535DtK);
        if (c33604EtG != null) {
            c33604EtG.A01.setText(str);
            TextView textView = c33604EtG.A00;
            AbstractC166987dD.A1P(context, textView, 2131962718);
            ViewOnClickListenerC35682FpH.A01(textView, 30, c31535DtK);
            if (z) {
                textView.getLayoutParams().width = AbstractC31171DnF.A02(context.getResources(), R.dimen.avatar_size_ridiculously_xxlarge);
            }
        }
        C0f9.A0A(991319, A0G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.EtG] */
    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = C0f9.A03(898148220);
        C14360o3.A0B(viewGroup, 1);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.batch_action_header, false);
        C14360o3.A0B(A0C, 1);
        ?? obj = new Object();
        obj.A01 = AbstractC167007dF.A0N(A0C, R.id.text);
        obj.A00 = AbstractC167007dF.A0N(A0C, R.id.button);
        A0C.setTag(obj);
        AbstractC13880nE.A0d(A0C, 12);
        AbstractC13880nE.A0Y(A0C, 12);
        C0f9.A0A(391204203, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
