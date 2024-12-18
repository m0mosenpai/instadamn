package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.KHl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45622KHl extends AbstractC66412zI {
    public final C47437KxS A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        LZT lzt = (LZT) interfaceC66482zP;
        C44676JqL c44676JqL = (C44676JqL) c3oo;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        TextView textView = c44676JqL.A01;
        textView.setText(lzt.A01.A00);
        LQ1.A00(c44676JqL.itemView, 46, lzt, this);
        C47437KxS c47437KxS = this.A00;
        final View view = c44676JqL.A00;
        final LLk lLk = c47437KxS.A00;
        if (!AbstractC31172DnG.A1a(lLk.A0s.A00, "has_seen_pending_inbox_filter_tooltip")) {
            view.postDelayed(new Runnable() { // from class: X.M4V
                @Override // java.lang.Runnable
                public final void run() {
                    LLk lLk2 = lLk;
                    View view2 = view;
                    FragmentActivity activity = lLk2.A0b.getActivity();
                    if (activity != null) {
                        C5SU A0U = AbstractC167007dF.A0U(activity, 2131960129);
                        A0U.A03(view2);
                        AbstractC43594JPz.A1L(A0U);
                        KYR.A00(A0U, lLk2, 12).A06();
                    }
                }
            }, 500L);
            return;
        }
        C54685ODl c54685ODl = lLk.A0q;
        C64742wY c64742wY = c54685ODl.A05;
        C64842wi c64842wi = c54685ODl.A01;
        if (c64842wi == null) {
            C14360o3.A0F("quickPromotionPresenter");
            throw C00O.createAndThrow();
        }
        c64742wY.A00(textView, QPTooltipAnchor.A0s, c64842wi);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C44676JqL(AbstractC31172DnG.A0A(layoutInflater, viewGroup, R.layout.pending_threads_inbox_sort_row));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return LZT.class;
    }

    public C45622KHl(C47437KxS c47437KxS) {
        this.A00 = c47437KxS;
    }
}
