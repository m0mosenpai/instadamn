package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* loaded from: classes11.dex */
public final class WHK implements DialogInterface.OnClickListener {
    public final /* synthetic */ C70093W2q A00;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C14360o3.A0B(dialogInterface, 0);
        dialogInterface.dismiss();
        C70093W2q c70093W2q = this.A00;
        CharSequence charSequence = C70093W2q.A00(c70093W2q)[i];
        Fragment fragment = c70093W2q.A02;
        if (C14360o3.A0K(charSequence, fragment.getString(2131974339))) {
            C140966Yy c140966Yy = new C140966Yy(fragment.requireActivity(), c70093W2q.A03);
            IgFragmentFactoryImpl.A00();
            c140966Yy.A0D(new C60887Rav());
            c140966Yy.A04();
            return;
        }
        if (C14360o3.A0K(charSequence, fragment.getString(2131963555))) {
            C69116Vi6 c69116Vi6 = c70093W2q.A00;
            if (c69116Vi6 != null) {
                Integer num = C05F.A01;
                C42666IuN c42666IuN = c69116Vi6.A02;
                c42666IuN.A01 = num;
                C63922vD.A01(c69116Vi6.A00, c69116Vi6.A01, c42666IuN);
            }
            IQX.A00(c70093W2q.A03, c70093W2q.A04, c70093W2q.A05, false);
            return;
        }
        if (!C14360o3.A0K(charSequence, fragment.getString(2131963529))) {
            return;
        }
        C69116Vi6 c69116Vi62 = c70093W2q.A00;
        if (c69116Vi62 != null) {
            Integer num2 = C05F.A0C;
            C42666IuN c42666IuN2 = c69116Vi62.A02;
            c42666IuN2.A01 = num2;
            C63922vD.A01(c69116Vi62.A00, c69116Vi62.A01, c42666IuN2);
        }
        IQX.A00(c70093W2q.A03, c70093W2q.A04, c70093W2q.A05, true);
    }

    public WHK(C70093W2q c70093W2q) {
        this.A00 = c70093W2q;
    }
}
