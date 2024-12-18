package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.textcell.IgdsListCell;

/* loaded from: classes9.dex */
public final class NEZ extends AbstractC66412zI {
    public final Context A00;
    public final UserSession A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(this.A00), viewGroup, R.layout.row_iglive_igds_action, false);
        Object A0Q = AbstractC37303Gc4.A0Q(A0D, new C51287MlA(A0D));
        if (A0Q instanceof C51287MlA) {
            return (C3OO) A0Q;
        }
        return null;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C56116Ovb c56116Ovb = (C56116Ovb) interfaceC66482zP;
        C51287MlA c51287MlA = (C51287MlA) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c56116Ovb, c51287MlA);
        IgdsListCell igdsListCell = c51287MlA.A01;
        String str = c56116Ovb.A08;
        if (str == null) {
            str = String.valueOf(c56116Ovb.A00);
        }
        igdsListCell.A0I(str);
        String str2 = c56116Ovb.A07;
        if (str2 != null) {
            igdsListCell.A0H(str2);
        }
        Drawable drawable = c56116Ovb.A01;
        Integer num = c56116Ovb.A06;
        if (num != null) {
            igdsListCell.A0A(drawable, num);
        } else {
            igdsListCell.A09(drawable);
        }
        igdsListCell.A0G(c56116Ovb.A04, A1a);
        C0fQ.A00(c56116Ovb.A02, igdsListCell);
        InterfaceC190658cN interfaceC190658cN = c56116Ovb.A03;
        if (interfaceC190658cN != null) {
            igdsListCell.A0E(interfaceC190658cN);
        }
        Integer num2 = c56116Ovb.A05;
        if (num2 != null) {
            int intValue = num2.intValue();
            Resources resources = c51287MlA.A00.getResources();
            igdsListCell.setPadding(resources.getDimensionPixelSize(intValue), igdsListCell.getPaddingTop(), resources.getDimensionPixelSize(intValue), igdsListCell.getPaddingBottom());
        }
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C56116Ovb.class;
    }

    public NEZ(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
