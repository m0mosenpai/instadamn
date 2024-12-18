package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.loadmore.LoadMoreButton;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UGk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66416UGk extends C2UU {
    public final List A00;
    public final UserSession A01;
    public final InterfaceC62602sz A02;
    public final InterfaceC186168Nk A03;

    public C66416UGk(UserSession userSession, InterfaceC62602sz interfaceC62602sz, InterfaceC186168Nk interfaceC186168Nk) {
        C14360o3.A0B(interfaceC62602sz, 3);
        this.A01 = userSession;
        this.A03 = interfaceC186168Nk;
        this.A02 = interfaceC62602sz;
        this.A00 = new ArrayList();
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        if (getItemViewType(i) != 0) {
            ((UIC) c3oo).A00.A04(this.A02, null);
            return;
        }
        UJK ujk = (UJK) c3oo;
        UpcomingEvent upcomingEvent = (UpcomingEvent) this.A00.get(i);
        C14360o3.A0B(upcomingEvent, 0);
        if (upcomingEvent.equals(ujk.A00)) {
            return;
        }
        ujk.A00 = upcomingEvent;
        ujk.A03.A02();
        ImageView imageView = ujk.A01;
        Context A0L = AbstractC166997dE.A0L(imageView);
        UpcomingEvent upcomingEvent2 = ujk.A00;
        if (upcomingEvent2 != null) {
            Integer num = C05F.A00;
            imageView.setImageDrawable(new C130205uQ(A0L, ujk.A02, upcomingEvent2, num, num));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                return new UIC(LoadMoreButton.A00(viewGroup.getContext(), R.layout.layout_empty_state_view, viewGroup));
            }
            throw new IllegalArgumentException(AbstractC111324zv.A00(3269));
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        return new UJK(AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.upcoming_event_sticker_list_item, false), this.A01, this.A03);
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(-1530454933);
        int size = this.A00.size() + (this.A02.CXf() ? 1 : 0);
        C0f9.A0A(2037069425, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(669956213);
        int i2 = 1;
        if (i < this.A00.size()) {
            i2 = 0;
        }
        C0f9.A0A(158393736, A03);
        return i2;
    }
}
