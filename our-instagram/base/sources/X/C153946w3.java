package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6w3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153946w3 extends AbstractC66422zJ {
    public final int A00;
    public final int A01;
    public final InterfaceC153566vR A02;
    public final InterfaceC11380iw A03;
    public final C153936w2 A04;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(layoutInflater, 1);
        this.A04.A07(true);
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
        C154016wA c154016wA = (C154016wA) interfaceC66482zP;
        C25593BTg c25593BTg = (C25593BTg) c3oo;
        C14360o3.A0B(c154016wA, 0);
        C14360o3.A0B(c25593BTg, 1);
        ImageUrl imageUrl = c154016wA.A01.A00;
        if (imageUrl == null && (imageUrl = (ImageUrl) c154016wA.A00.A00) == null) {
            c25593BTg.A01.A0B();
        } else {
            c25593BTg.A01.setUrl(imageUrl, this.A03);
        }
        c25593BTg.A00.setText(2131961171);
        C0fQ.A00(new ViewOnClickListenerC28626CkZ(this, c25593BTg), c25593BTg.itemView);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C154016wA.class;
    }

    public C153946w3(InterfaceC153566vR interfaceC153566vR, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i, int i2) {
        this.A03 = interfaceC11380iw;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = interfaceC153566vR;
        this.A04 = AbstractC153926w1.A01(interfaceC11380iw, userSession, str);
    }
}
