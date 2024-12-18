package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.FXk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34852FXk {
    public static void A01(C31911E0r c31911E0r, C35246Fgf c35246Fgf) {
        TextView textView = c31911E0r.A00;
        c35246Fgf.A03(textView);
        View.OnClickListener onClickListener = c35246Fgf.A04;
        if (onClickListener != null) {
            C0fQ.A00(onClickListener, textView);
        } else {
            textView.setClickable(false);
            textView.setLongClickable(false);
        }
        int i = 8388627;
        if (c35246Fgf.A06) {
            i = 17;
        }
        textView.setGravity(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3OO, java.lang.Object, X.E0r] */
    public static C31911E0r A00(Context context, ViewGroup viewGroup) {
        View A0A = AbstractC31172DnG.A0A(LayoutInflater.from(context), viewGroup, R.layout.row_text);
        ?? c3oo = new C3OO(A0A);
        TextView A0T = AbstractC166997dE.A0T(A0A, R.id.row_text_textview);
        c3oo.A00 = A0T;
        AbstractC25227BEk.A11(A0T);
        AbstractC010103p.A07(c3oo.A00);
        A0A.setTag(c3oo);
        return c3oo;
    }
}
