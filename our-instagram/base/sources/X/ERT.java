package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class ERT extends AbstractC65632xz {
    public final Context A00;
    public final C31535DtK A01;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    public ERT(Context context, C31535DtK c31535DtK) {
        this.A00 = context;
        this.A01 = c31535DtK;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 910661818);
        C14360o3.A0B(obj, 2);
        Object tag = view.getTag();
        if (tag != null) {
            C34536FJw c34536FJw = (C34536FJw) tag;
            FLV flv = (FLV) obj;
            C31535DtK c31535DtK = this.A01;
            AbstractC167017dG.A1N(c34536FJw, flv);
            C14360o3.A0B(c31535DtK, 2);
            c34536FJw.A01.setText(flv.A02);
            String str = flv.A01;
            if (str.length() > 0) {
                TextView textView = c34536FJw.A00;
                textView.setText(str);
                ViewOnClickListenerC35670Fp5.A00(textView, 10, c31535DtK, flv);
            }
            C0f9.A0A(1773298089, A0G);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(-347397007, A0G);
        throw A0g;
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        int A0G = AbstractC25231BEo.A0G(viewGroup, 883733818);
        View A0C = AbstractC31173DnH.A0C(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.user_group_header_text, false);
        A0C.setTag(new C34536FJw(A0C));
        C0f9.A0A(-1047130465, A0G);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
