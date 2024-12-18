package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.HIg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39082HIg extends AbstractC66412zI {
    public final InterfaceC11380iw A00;
    public final InterfaceC43387JFc A01;
    public final ID7 A02;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        ID7 id7;
        C42330Ios c42330Ios = (C42330Ios) interfaceC66482zP;
        C38506GwR c38506GwR = (C38506GwR) c3oo;
        AbstractC167007dF.A1K(c42330Ios, c38506GwR);
        C41643IbZ c41643IbZ = c42330Ios.A02;
        InterfaceC11380iw interfaceC11380iw = this.A00;
        InterfaceC43387JFc interfaceC43387JFc = this.A01;
        String str = c42330Ios.A03;
        C38628GyV c38628GyV = c42330Ios.A00;
        C38052Gof c38052Gof = c42330Ios.A01;
        if (c42330Ios.A04) {
            id7 = this.A02;
        } else {
            id7 = null;
        }
        I6H.A00(c38628GyV, c38052Gof, interfaceC11380iw, interfaceC43387JFc, c38506GwR, id7, c41643IbZ, str, false, false);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C38506GwR(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.publishing_product_row, false));
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C42330Ios.class;
    }

    public C39082HIg(InterfaceC11380iw interfaceC11380iw, InterfaceC43387JFc interfaceC43387JFc) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC43387JFc;
        this.A02 = null;
    }

    public C39082HIg(InterfaceC11380iw interfaceC11380iw, InterfaceC43387JFc interfaceC43387JFc, ID7 id7) {
        this.A00 = interfaceC11380iw;
        this.A01 = interfaceC43387JFc;
        this.A02 = id7;
    }
}
