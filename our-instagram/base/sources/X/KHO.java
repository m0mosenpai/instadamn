package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes8.dex */
public final class KHO extends AbstractC66412zI {
    public final C47338Kvn A00;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        View A0D = AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.direct_poll_sticker_tray_item, false);
        C44616JpM c44616JpM = new C44616JpM(A0D);
        c44616JpM.A00.setTypeface(AbstractC167017dG.A0S(AbstractC166997dE.A0L(A0D)));
        KKp.A01(AbstractC166987dD.A0s(A0D), this, 19);
        return c44616JpM;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C44616JpM c44616JpM = (C44616JpM) c3oo;
        C14360o3.A0B(c44616JpM, 1);
        C7IK c7ik = this.A00.A00.A03.A0A;
        if (c7ik != null) {
            JQ1.A0X(c44616JpM.A00, c7ik);
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45662KIz.class;
    }

    public KHO(C47338Kvn c47338Kvn) {
        this.A00 = c47338Kvn;
    }
}
