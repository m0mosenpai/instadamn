package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GpT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38100GpT extends AbstractC66412zI {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AbstractC42425IqS A03;
    public final JPS A04;
    public final InterfaceC43406JFw A05;
    public final JIG A06;
    public final InterfaceC60442pS A07;
    public final IM0 A08;
    public final String A09;
    public final boolean A0A;

    public C38100GpT(Context context, Fragment fragment, UserSession userSession, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, JIG jig, InterfaceC60442pS interfaceC60442pS, IM0 im0, String str, boolean z) {
        AbstractC25229BEm.A1K(userSession, 7, jig);
        this.A01 = fragment;
        this.A07 = interfaceC60442pS;
        this.A00 = context;
        this.A03 = abstractC42425IqS;
        this.A05 = interfaceC43406JFw;
        this.A04 = jps;
        this.A02 = userSession;
        this.A09 = str;
        this.A0A = z;
        this.A08 = im0;
        this.A06 = jig;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AbstractC31175DnJ.A1R(viewGroup, layoutInflater);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_grid_item_video_ad_tall, false);
        Context context = this.A00;
        JIG jig = this.A06;
        return new C38218GrN(this.A01.requireActivity(), context, A0R, this.A02, jig);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C38205GrA c38205GrA = (C38205GrA) interfaceC66482zP;
        C38213GrI c38213GrI = (C38213GrI) c3oo;
        boolean A1a = AbstractC167017dG.A1a(c38205GrA, c38213GrI);
        C127915qK c127915qK = ((AbstractC127945qN) c38205GrA).A02;
        C5qT BAM = this.A04.BAM(c38205GrA);
        InterfaceC43406JFw interfaceC43406JFw = this.A05;
        View view = c38213GrI.A01;
        interfaceC43406JFw.EE0(view, BAM, c127915qK, c38205GrA, A1a);
        IM0 im0 = this.A08;
        if (im0 != null) {
            String id = c38205GrA.A00.getId();
            if (id != null) {
                im0.A00(view, id);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        Fragment fragment = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A07;
        AbstractC38209GrE.A00(AbstractC166997dE.A0L(view), fragment, BAM, this.A02, c127915qK, this.A03, c38213GrI, c38205GrA, interfaceC60442pS, this.A09, this.A0A);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return HKO.class;
    }
}