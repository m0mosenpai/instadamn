package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.util.fragment.IgFragmentFactoryImpl;

/* loaded from: classes11.dex */
public final class WHL implements DialogInterface.OnClickListener {
    public final /* synthetic */ C70089W2l A00;

    public WHL(C70089W2l c70089W2l) {
        this.A00 = c70089W2l;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C69176Vj5 c69176Vj5;
        C70089W2l c70089W2l = this.A00;
        CharSequence charSequence = C70089W2l.A00(c70089W2l)[i];
        Context context = c70089W2l.A02;
        if (context.getString(2131963556).contentEquals(charSequence) && (c69176Vj5 = c70089W2l.A00) != null) {
            C685736u.A00(c69176Vj5.A00, c69176Vj5.A01, EnumC114405Eh.A02, c69176Vj5.A02);
        } else {
            if (!context.getString(2131951992).contentEquals(charSequence)) {
                return;
            }
            C140966Yy c140966Yy = new C140966Yy(c70089W2l.A03.requireActivity(), c70089W2l.A04);
            IgFragmentFactoryImpl.A00();
            c140966Yy.A0E(new C60887Rav());
            c140966Yy.A04();
        }
    }
}
