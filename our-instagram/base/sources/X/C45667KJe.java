package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.KJe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45667KJe extends AbstractC66422zJ {
    public final Context A00;
    public final UserSession A01;
    public final C69681VtR A02;

    public C45667KJe(Context context, UserSession userSession, C69681VtR c69681VtR) {
        C14360o3.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c69681VtR;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC167007dF.A1K(viewGroup, layoutInflater);
        return new C44701Jqk(AbstractC25227BEk.A0D(layoutInflater, viewGroup, R.layout.layout_meta_ai_hcm_sources_list_item, false));
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        String str;
        K02 k02 = (K02) interfaceC66482zP;
        C44701Jqk c44701Jqk = (C44701Jqk) c3oo;
        AbstractC167017dG.A1N(k02, c44701Jqk);
        String A0g = AnonymousClass001.A0g(String.valueOf(k02.A00), ". ", k02.A01);
        C14360o3.A07(A0g);
        c44701Jqk.A01.setText(A0g);
        IgTextView igTextView = c44701Jqk.A02;
        String host = AbstractC08820cl.A03(k02.A02).getHost();
        if (host != null) {
            str = new C11L("^www\\.").A01(host, "");
        } else {
            str = null;
        }
        igTextView.setText(str);
        LQ1.A00(c44701Jqk.A00, 49, this, k02);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return K02.class;
    }
}
