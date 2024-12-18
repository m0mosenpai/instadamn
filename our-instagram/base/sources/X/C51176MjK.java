package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.MjK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51176MjK extends C2UU implements InterfaceC58087PpC {
    public final Context A00;
    public final UserSession A01;
    public final C54487O5p A02;
    public final InterfaceC58087PpC A03;
    public final List A04;
    public final boolean A05;

    public C51176MjK(Context context, UserSession userSession, C54487O5p c54487O5p, InterfaceC58087PpC interfaceC58087PpC, boolean z) {
        AbstractC167007dF.A1G(userSession, 2, c54487O5p);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = z;
        this.A03 = interfaceC58087PpC;
        this.A02 = c54487O5p;
        this.A04 = AbstractC166987dD.A1E();
    }

    @Override // X.InterfaceC58087PpC
    public final void DEU(UpcomingEvent upcomingEvent) {
        this.A03.DEU(upcomingEvent);
        C141986bH A00 = AbstractC146056i3.A00(this.A01);
        String id = upcomingEvent.getId();
        C14360o3.A0B(id, 0);
        A00.A00.remove(id);
        A00.A01.add(id);
        this.A04.remove(upcomingEvent.getId());
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        if (getItemViewType(i) != 0) {
            View view = c3oo.itemView;
            Ok4.A00(view, 7, this);
            AbstractC56952jT.A01(view);
            return;
        }
        C51227MkC c51227MkC = (C51227MkC) c3oo;
        UserSession userSession = this.A01;
        UpcomingEvent A00 = AbstractC146056i3.A00(userSession).A00(AbstractC25226BEj.A1I(this.A04, i));
        if (A00 == null) {
            c51227MkC.itemView.setVisibility(8);
            return;
        }
        c51227MkC.itemView.setVisibility(0);
        c51227MkC.A02.setText(A00.getTitle());
        Context context = this.A00;
        String A02 = MX0.A02(context, userSession, AbstractC41774Ieq.A02(A00));
        TextView textView = c51227MkC.A01;
        int i2 = 2131976244;
        if (AbstractC41774Ieq.A0B(A00)) {
            i2 = 2131976243;
        }
        MSZ.A10(context, textView, context.getString(i2), A02, 2131961906);
        TextView textView2 = c51227MkC.A00;
        textView2.setVisibility(0);
        ViewOnClickListenerC55468OkN.A00(c51227MkC.itemView, 18, A00, this);
        ViewOnClickListenerC55468OkN.A00(textView2, 19, A00, this);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.3OO, X.MkC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.3OO, X.MkA] */
    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
                View A0R = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.new_upcoming_event_item, false);
                ?? c3oo = new C3OO(A0R);
                c3oo.A00 = A0R;
                return c3oo;
            }
            throw AbstractC166987dD.A14("unsupported viewType");
        }
        int i3 = C3OO.FLAG_ADAPTER_FULLUPDATE;
        View A0R2 = AbstractC25226BEj.A0R(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.upcoming_event_item, false);
        ?? c3oo2 = new C3OO(A0R2);
        c3oo2.A02 = AbstractC167007dF.A0N(A0R2, R.id.event_name);
        c3oo2.A01 = AbstractC167007dF.A0N(A0R2, R.id.event_details);
        c3oo2.A00 = AbstractC167007dF.A0N(A0R2, R.id.edit_button);
        return c3oo2;
    }

    public static final void A00(C51176MjK c51176MjK, InterfaceC58087PpC interfaceC58087PpC, UpcomingEvent upcomingEvent) {
        C52124N4x c52124N4x = c51176MjK.A02.A00;
        EnumC53233NgW enumC53233NgW = c52124N4x.A00;
        if (enumC53233NgW == null) {
            C14360o3.A0F("priorSurface");
            throw C00O.createAndThrow();
        }
        if (enumC53233NgW.A00) {
            C50695MZq.A00(AbstractC166987dD.A0r(c52124N4x.A05), new NL5(interfaceC58087PpC, upcomingEvent, true));
            return;
        }
        N6R n6r = new N6R();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putSerializable("prior_surface", EnumC53233NgW.A06);
        A0b.putParcelable("initial_upcoming_event", upcomingEvent);
        n6r.setArguments(A0b);
        n6r.A06 = interfaceC58087PpC;
        n6r.A01 = c52124N4x.A04;
        AbstractC31177DnL.A16(n6r, c52124N4x.requireActivity(), AbstractC166987dD.A0o(c52124N4x.A05));
    }

    @Override // X.InterfaceC58087PpC
    public final void DET(UpcomingEvent upcomingEvent) {
        this.A03.DET(upcomingEvent);
        AbstractC146056i3.A00(this.A01).A01(upcomingEvent);
        notifyDataSetChanged();
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(855619134);
        int size = this.A04.size() + 1;
        C0f9.A0A(333155569, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        int A03 = C0f9.A03(-57844363);
        int i2 = 1;
        if (i < this.A04.size()) {
            i2 = 0;
        }
        C0f9.A0A(441404165, A03);
        return i2;
    }
}
