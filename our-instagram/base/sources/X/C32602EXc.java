package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.EXc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32602EXc extends AbstractC66412zI {
    public final UserSession A00;
    public final FQ9 A01;
    public final FFF A02;
    public final String A03;
    public final boolean A04;

    public C32602EXc(UserSession userSession, FQ9 fq9, FFF fff, String str, boolean z) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = fq9;
        this.A03 = str;
        this.A04 = z;
        this.A02 = fff;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        String str;
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        int A00 = AbstractC47114Ks9.A00(viewGroup);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        boolean A01 = LC3.A01(userSession);
        int i = R.layout.card_gallery_card_base_legacy_layout;
        if (A01) {
            i = R.layout.card_gallery_card_base_layout;
        }
        String str2 = this.A03;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -1782234803:
                    if (str2.equals("questions")) {
                        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        return new C32701EaS(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false), userSession, this.A01, A00, this.A04);
                    }
                    break;
                case -697290194:
                    str = "shared_stack";
                    break;
                case 348943746:
                    str = "add_yours";
                    break;
                case 531959920:
                    if (str2.equals("challenges")) {
                        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        FQ9 fq9 = this.A01;
                        return new C32709Eaa(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false), userSession, fq9, this.A02, A00, this.A04);
                    }
                    break;
                case 535918816:
                    if (str2.equals("roll_call")) {
                        int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        return new C32708EaZ(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false), userSession, this.A01, A00, this.A04);
                    }
                    break;
            }
            if (str2.equals(str)) {
                int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C32710Eab(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false), userSession, this.A01, A00, this.A04);
            }
        }
        int i6 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C32711Eac(AbstractC25226BEj.A0R(layoutInflater, viewGroup, i, false), userSession, this.A01, A00, this.A04);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C32716Eah c32716Eah = (C32716Eah) interfaceC66482zP;
        E48 e48 = (E48) c3oo;
        AbstractC167017dG.A1N(c32716Eah, e48);
        e48.A01(c32716Eah);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32716Eah.class;
    }
}
