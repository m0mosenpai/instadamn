package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gu6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38370Gu6 extends C2UU {
    public UserSession A00;
    public final InterfaceC11380iw A03;
    public final JPi A04;
    public final InterfaceC62602sz A05;
    public final Integer A06;
    public final List A01 = AbstractC166987dD.A1E();
    public final List A07 = AbstractC166987dD.A1E();
    public final C8SI A02 = new C8SI(0);

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        IF7 if7 = (IF7) this.A07.get(i);
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    ((C38516Gwc) c3oo).A00.A04(this.A05, null);
                    return;
                }
                C38455Gvc c38455Gvc = (C38455Gvc) c3oo;
                C41628IbJ c41628IbJ = if7.A00;
                if (c41628IbJ != null) {
                    JPi jPi = this.A04;
                    I5Q.A00(this.A03, this.A00, c41628IbJ, jPi, c38455Gvc, this.A06, i);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            C38479Gw0 c38479Gw0 = (C38479Gw0) c3oo;
            C41628IbJ c41628IbJ2 = if7.A00;
            if (c41628IbJ2 != null) {
                I5R.A00(c41628IbJ2, this.A04, c38479Gw0, this.A06, i);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
        C38456Gvd c38456Gvd = (C38456Gvd) c3oo;
        C41628IbJ c41628IbJ3 = if7.A00;
        if (c41628IbJ3 != null) {
            I5S.A00(c41628IbJ3, this.A04, c38456Gvd, this.A06, i);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static void A00(C38370Gu6 c38370Gu6) {
        List list = c38370Gu6.A07;
        list.clear();
        Iterator it = c38370Gu6.A01.iterator();
        while (it.hasNext()) {
            list.add(I5K.A00((C41628IbJ) it.next()));
        }
        list.add(new IF7(null, C05F.A0j));
        c38370Gu6.notifyDataSetChanged();
    }

    public C38370Gu6(InterfaceC11380iw interfaceC11380iw, UserSession userSession, JPi jPi, InterfaceC62602sz interfaceC62602sz, Integer num) {
        this.A05 = interfaceC62602sz;
        this.A04 = jPi;
        this.A00 = userSession;
        this.A06 = num;
        this.A03 = interfaceC11380iw;
        A00(this);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(670645217);
        int size = this.A07.size();
        C0f9.A0A(-1070318273, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        String id;
        int A03 = C0f9.A03(252738607);
        IF7 if7 = (IF7) this.A07.get(i);
        int intValue = if7.A01.intValue();
        if (intValue != 1 && intValue != 2 && intValue != 3) {
            if (intValue == 5) {
                id = "ITEM_ID_KEY.LOAD_MORE_ROW";
            } else {
                IllegalArgumentException A12 = AbstractC166987dD.A12("Unhandled view model type");
                C0f9.A0A(-1854659249, A03);
                throw A12;
            }
        } else {
            C41628IbJ c41628IbJ = if7.A00;
            if (c41628IbJ != null) {
                id = c41628IbJ.A00.getId();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        long A00 = this.A02.A00(id);
        C0f9.A0A(-745225818, A03);
        return A00;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int i2;
        int A03 = C0f9.A03(1630774086);
        int intValue = ((IF7) this.A07.get(i)).A01.intValue();
        int i3 = 1;
        if (intValue != 1) {
            if (intValue != 2) {
                i3 = 3;
                if (intValue != 3) {
                    if (intValue == 5) {
                        i2 = -469774960;
                    } else {
                        IllegalArgumentException A12 = AbstractC166987dD.A12("Unhandled View Model Type");
                        C0f9.A0A(-1208270400, A03);
                        throw A12;
                    }
                } else {
                    C0f9.A0A(938801847, A03);
                    return 2;
                }
            } else {
                i2 = -315298185;
            }
        } else {
            i3 = 0;
            i2 = -545347533;
        }
        C0f9.A0A(i2, A03);
        return i3;
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                        return new C38516Gwc(LoadMoreButton.A00(context, R.layout.question_responses_list_empty_state, viewGroup));
                    }
                    throw AbstractC166987dD.A1D(AnonymousClass001.A0O(AbstractC111324zv.A00(703), i));
                }
                int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new C38455Gvc(LayoutInflater.from(context).inflate(R.layout.question_response_grid_item, viewGroup, false));
            }
            int i4 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            return new C38479Gw0(LayoutInflater.from(context).inflate(R.layout.question_response_grid_item, viewGroup, false));
        }
        int i5 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new C38456Gvd(LayoutInflater.from(context).inflate(R.layout.question_response_grid_item, viewGroup, false));
    }
}
