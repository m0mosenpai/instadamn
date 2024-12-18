package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.V2z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67934V2z extends AbstractC65632xz {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C45125Jxu c45125Jxu = (C45125Jxu) obj;
        boolean A1R = AbstractC167007dF.A1R(0, anonymousClass306, c45125Jxu);
        int intValue = ((Number) c45125Jxu.A00).intValue();
        if (intValue != 0) {
            if (intValue == A1R) {
                anonymousClass306.A7a(A1R ? 1 : 0);
                return;
            }
            throw new RuntimeException();
        }
        anonymousClass306.A7a(0);
    }

    public C67934V2z(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A02 = userSession;
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A0G = AbstractC25231BEo.A0G(view, 2078285879);
        C14360o3.A0B(obj, 2);
        Context context = this.A00;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Object tag = view.getTag();
        C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.business.promote.adtools.binder.AdToolsListViewBinder.Holder");
        UJM ujm = (UJM) tag;
        C45125Jxu c45125Jxu = (C45125Jxu) obj;
        UserSession userSession = this.A02;
        boolean A1R = AbstractC167007dF.A1R(0, context, interfaceC11380iw);
        AbstractC25233BEq.A0w(2, ujm, c45125Jxu, userSession);
        int intValue = ((Number) c45125Jxu.A00).intValue();
        if (intValue != 0) {
            if (intValue == A1R) {
                ujm.A02.setVisibility(8);
                ujm.A01.setVisibility(0);
                ujm.A00.setVisibility(8);
            } else {
                throw new RuntimeException();
            }
        } else {
            AbstractC166987dD.A1P(context, ujm.A02, 2131970329);
            TextView textView = ujm.A03;
            textView.setVisibility(AbstractC167007dF.A05(c45125Jxu.A02 ? 1 : 0));
            C0fQ.A00((View.OnClickListener) c45125Jxu.A04, textView);
        }
        RecyclerView recyclerView = ujm.A04;
        recyclerView.A14(new UHO(A1R ? 1 : 0, c45125Jxu, ujm, userSession));
        VRP.A00(c45125Jxu, ujm, userSession);
        UGd uGd = (UGd) recyclerView.A0A;
        if (uGd == null) {
            UGd uGd2 = new UGd(context, interfaceC11380iw, userSession, (Integer) c45125Jxu.A00);
            List list = (List) c45125Jxu.A01;
            C14360o3.A0B(list, 0);
            if (!list.equals(uGd2.A00)) {
                uGd2.A00 = list;
                uGd2.notifyDataSetChanged();
            }
            recyclerView.setAdapter(uGd2);
        } else {
            List list2 = (List) c45125Jxu.A01;
            C14360o3.A0B(list2, 0);
            if (!C14360o3.A0K(uGd.A00, list2)) {
                if (!list2.equals(uGd.A00)) {
                    uGd.A00 = list2;
                    uGd.notifyDataSetChanged();
                }
                recyclerView.A0n(0);
            } else {
                uGd.notifyDataSetChanged();
            }
        }
        C0f9.A0A(-1121455550, A0G);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        LinearLayoutManager linearLayoutManager;
        int A03 = C0f9.A03(943249331);
        C14360o3.A0B(viewGroup, 1);
        Context context = this.A00;
        View A0D = AbstractC25227BEk.A0D(AbstractC31172DnG.A09(context), viewGroup, R.layout.promote_ad_tools_highlights_hub_container, false);
        UJM ujm = new UJM(A0D);
        A0D.setTag(ujm);
        if (i == 0) {
            linearLayoutManager = new LinearLayoutManager(context, 1, false);
        } else {
            linearLayoutManager = new LinearLayoutManager(context, 0, false);
        }
        RecyclerView recyclerView = ujm.A04;
        recyclerView.setLayoutManager(linearLayoutManager);
        try {
            AbstractC37304Gc5.A0z(recyclerView, context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap), AbstractC166997dE.A04(context, R.dimen.account_discovery_bottom_gap));
        } catch (Resources.NotFoundException unused) {
            recyclerView.A10(new C3YB(12, 12));
        }
        C3FQ A00 = C3FN.A00(recyclerView);
        C14360o3.A0C(A00, "null cannot be cast to non-null type com.instagram.migration.scrollingviewproxy.RefreshableScrollingViewProxy<*>");
        ((C3FR) A00).ARj();
        C0f9.A0A(667823986, A03);
        return A0D;
    }
}
