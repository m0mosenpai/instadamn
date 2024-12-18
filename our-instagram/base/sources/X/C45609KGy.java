package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.KGy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45609KGy extends AbstractC66412zI {
    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        return new C44598Jox(AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.row_appreciation_education, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C45640KId c45640KId = (C45640KId) interfaceC66482zP;
        C44598Jox c44598Jox = (C44598Jox) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c45640KId, c44598Jox);
        IgdsHeadline igdsHeadline = c44598Jox.A00;
        igdsHeadline.setHeadline(2131953081);
        igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_gifts_refresh);
        C35228FgL A01 = C35228FgL.A01(AbstractC37301Gc2.A03(c44598Jox), A1a);
        for (C26062Bfp c26062Bfp : c45640KId.A00) {
            A01.A04(c26062Bfp.A02, c26062Bfp.A01, c26062Bfp.A00);
        }
        igdsHeadline.setBulletList(A01.A03());
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C45640KId.class;
    }
}
