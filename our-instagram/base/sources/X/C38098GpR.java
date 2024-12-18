package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GpR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38098GpR extends AbstractC66412zI {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AbstractC42425IqS A03;
    public final JPS A04;
    public final InterfaceC43406JFw A05;
    public final InterfaceC60442pS A06;
    public final IM0 A07;
    public final String A08;
    public final boolean A09;

    public C38098GpR(Context context, Fragment fragment, UserSession userSession, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, InterfaceC60442pS interfaceC60442pS, IM0 im0, String str, boolean z) {
        C14360o3.A0B(userSession, 7);
        this.A01 = fragment;
        this.A06 = interfaceC60442pS;
        this.A00 = context;
        this.A03 = abstractC42425IqS;
        this.A05 = interfaceC43406JFw;
        this.A04 = jps;
        this.A02 = userSession;
        this.A08 = str;
        this.A09 = z;
        this.A07 = im0;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_item_ad_image, false);
        return new C38524Gwk(this.A01.requireActivity(), this.A00, A0R, this.A02);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C37931GmT c37931GmT = (C37931GmT) interfaceC66482zP;
        C38524Gwk c38524Gwk = (C38524Gwk) c3oo;
        AbstractC167007dF.A1K(c37931GmT, c38524Gwk);
        C127915qK c127915qK = ((AbstractC127945qN) c37931GmT).A02;
        C5qT BAM = this.A04.BAM(c37931GmT);
        InterfaceC43406JFw interfaceC43406JFw = this.A05;
        View view = c38524Gwk.A02;
        interfaceC43406JFw.EE0(view, BAM, c127915qK, c37931GmT, false);
        IM0 im0 = this.A07;
        if (im0 != null) {
            String id = c37931GmT.BQN().getId();
            if (id != null) {
                im0.A00(view, id);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C41605Iau c41605Iau = C41605Iau.A00;
        Fragment fragment = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A06;
        c41605Iau.A00(AbstractC166997dE.A0L(view), fragment, BAM, this.A02, c127915qK, this.A03, c38524Gwk, c37931GmT, null, interfaceC60442pS, this.A08, this.A09);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C37931GmT.class;
    }
}
