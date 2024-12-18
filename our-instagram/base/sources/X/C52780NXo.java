package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import java.util.List;

/* renamed from: X.NXo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52780NXo extends EPV {
    public final /* synthetic */ ReelMoreOptionsFragment A00;

    @Override // X.EPV, X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != -3) {
            if (i != -2) {
                return super.onCreateViewHolder(viewGroup, i);
            }
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            ReelMoreOptionsFragment reelMoreOptionsFragment = this.A00;
            AbstractC53625NnW abstractC53625NnW = reelMoreOptionsFragment.A05;
            abstractC53625NnW.getClass();
            return new C3OO(abstractC53625NnW.A02(reelMoreOptionsFragment.requireContext(), viewGroup));
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        ReelMoreOptionsFragment reelMoreOptionsFragment2 = this.A00;
        AbstractC53625NnW abstractC53625NnW2 = reelMoreOptionsFragment2.A06;
        abstractC53625NnW2.getClass();
        return new C3OO(abstractC53625NnW2.A02(reelMoreOptionsFragment2.requireContext(), viewGroup));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52780NXo(Context context, InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, ReelMoreOptionsFragment reelMoreOptionsFragment) {
        super(context, abstractC12990ll, interfaceC11380iw);
        this.A00 = reelMoreOptionsFragment;
    }

    @Override // X.EPV, X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int itemViewType;
        int i2;
        int A03 = C0f9.A03(1061781676);
        Object item = getItem(i);
        if (item instanceof C52773NXe) {
            itemViewType = -2;
            i2 = -1910746502;
        } else if (item instanceof C52772NXd) {
            itemViewType = -3;
            i2 = 868380927;
        } else {
            itemViewType = super.getItemViewType(i);
            i2 = 22269046;
        }
        C0f9.A0A(i2, A03);
        return itemViewType;
    }

    @Override // X.EPV, android.widget.Adapter
    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 3;
    }

    @Override // X.EPV, X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType != -3) {
            if (itemViewType != -2) {
                super.onBindViewHolder(c3oo, i);
                return;
            }
            C52773NXe c52773NXe = (C52773NXe) getItem(i);
            List list = c52773NXe.A06;
            list.getClass();
            Integer num = C05F.A0C;
            Integer num2 = c52773NXe.A05;
            if (!num.equals(num2) && !C05F.A01.equals(num2)) {
                C52773NXe.A01(c52773NXe, C05F.A00, false);
                c52773NXe.A02.setVisibility(0);
                O4G o4g = c52773NXe.A09;
                UserSession userSession = c52773NXe.A08;
                NAD nad = new NAD(10, o4g, c52773NXe.A07, userSession);
                C25621Ms A0C = AbstractC31179DnN.A0C(userSession);
                A0C.A0B("creatives/camera_graphql/");
                A0C.A9s("query_id", "2253728161315083");
                C1ON A0J = AbstractC31178DnM.A0J(A0C, C38868H9q.class, C41295IPk.class);
                A0J.A00 = nad;
                C1GJ.A03(A0J);
                return;
            }
            if (c52773NXe.A06.isEmpty()) {
                C52773NXe.A01(c52773NXe, num, false);
                return;
            }
            C52773NXe.A01(c52773NXe, num, true);
            C51138Mih c51138Mih = c52773NXe.A04;
            c51138Mih.A01 = list;
            c51138Mih.notifyDataSetChanged();
            C52773NXe.A00(c52773NXe);
            return;
        }
        getItem(i);
        Object obj = null;
        obj.getClass();
        throw C00O.createAndThrow();
    }
}
