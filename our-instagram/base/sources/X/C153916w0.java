package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153916w0 extends AbstractC66422zJ {
    public final int A00;
    public final int A01;
    public final InterfaceC153576vS A02;
    public final InterfaceC11380iw A03;
    public final C153936w2 A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        this.A04.A07(false);
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.layout_clips_grid_drafts_item, viewGroup, false);
        C14360o3.A07(inflate);
        C25593BTg c25593BTg = new C25593BTg(inflate);
        View view = c25593BTg.itemView;
        C14360o3.A06(view);
        AbstractC13880nE.A0g(view, this.A01);
        View view2 = c25593BTg.itemView;
        C14360o3.A06(view2);
        AbstractC13880nE.A0W(view2, this.A00);
        return c25593BTg;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C154006w9 c154006w9 = (C154006w9) interfaceC66482zP;
        C25593BTg c25593BTg = (C25593BTg) c3oo;
        C14360o3.A0B(c154006w9, 0);
        C14360o3.A0B(c25593BTg, 1);
        ImageUrl imageUrl = (ImageUrl) c154006w9.A00.A00;
        if (imageUrl != null) {
            c25593BTg.A01.setUrl(imageUrl, this.A03);
        } else {
            c25593BTg.A01.A0B();
        }
        c25593BTg.A00.setText(2131975752);
        C0fQ.A00(new ViewOnClickListenerC28627Cka(this, c25593BTg), c25593BTg.itemView);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C154006w9.class;
    }

    public C153916w0(InterfaceC153576vS interfaceC153576vS, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, int i2) {
        this.A03 = interfaceC11380iw;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = interfaceC153576vS;
        this.A04 = AbstractC153926w1.A01(interfaceC11380iw, userSession, str);
    }
}
