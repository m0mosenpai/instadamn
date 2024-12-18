package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.textcell.IgdsListCell;

/* renamed from: X.EYd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32629EYd extends AbstractC66422zJ {
    public final Context A00;
    public final InterfaceC16660sJ A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C31939E1t(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_manage_folders_folder_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        float f;
        C32089E8n c32089E8n = (C32089E8n) interfaceC66482zP;
        C31939E1t c31939E1t = (C31939E1t) c3oo;
        AbstractC167007dF.A1K(c32089E8n, c31939E1t);
        IgdsListCell igdsListCell = c31939E1t.A01;
        igdsListCell.A0I(c32089E8n.A02);
        Context context = this.A00;
        igdsListCell.A07(R.style.PrivacyTextStyle, AbstractC53242c7.A09(context));
        if (c32089E8n.A05) {
            int i = 2131959837;
            if (c32089E8n.A00 instanceof C2E6) {
                i = 2131959836;
            }
            igdsListCell.A0H(AbstractC25227BEk.A0u(context, i));
            igdsListCell.A05(R.drawable.instagram_folder_pano_outline_24);
            igdsListCell.setTextCellType(EnumC53237Nga.A04);
            ViewOnClickListenerC35683FpI.A00(igdsListCell, 61, c32089E8n, this);
        } else {
            AbstractC31180DnO.A12(context, igdsListCell, 2131959838);
            igdsListCell.A05(R.drawable.instagram_folder_settings_pano_outline_24);
        }
        if (c32089E8n.A07) {
            igdsListCell.setOnClickListener(null);
            if (c32089E8n.A06) {
                c31939E1t.A00.setVisibility(0);
                igdsListCell.setTextCellType(EnumC53237Nga.A09);
                return;
            }
            f = 0.6f;
        } else {
            c31939E1t.A00.setVisibility(8);
            f = 1.0f;
        }
        igdsListCell.setAlpha(f);
    }

    public C32629EYd(Context context, InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = context;
        this.A01 = interfaceC16660sJ;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C32089E8n.class;
    }
}
