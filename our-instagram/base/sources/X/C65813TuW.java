package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.TuW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65813TuW implements InterfaceC77833eB {
    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ Object ADU(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C65822Tuf c65822Tuf = (C65822Tuf) obj2;
        recyclerView.setAdapter(c65822Tuf.A0D);
        recyclerView.setItemAnimator(null);
        C68690VaQ c68690VaQ = c65822Tuf.A07;
        if (c68690VaQ != null && c68690VaQ.A00 != null) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            abstractC70663Fe.getClass();
            abstractC70663Fe.A1P(c65822Tuf.A07.A00);
        } else {
            int i = c65822Tuf.A03;
            if (i >= 0) {
                recyclerView.A0n(i);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ boolean Ek2(Object obj, Object obj2, Object obj3, Object obj4) {
        return AbstractC25229BEm.A1a(((C65822Tuf) obj).A0D, ((C65822Tuf) obj2).A0D);
    }

    @Override // X.InterfaceC77833eB
    public final /* bridge */ /* synthetic */ void F8z(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        RecyclerView recyclerView = (RecyclerView) obj;
        C68690VaQ c68690VaQ = ((C65822Tuf) obj2).A07;
        if (c68690VaQ != null) {
            AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
            abstractC70663Fe.getClass();
            c68690VaQ.A00 = abstractC70663Fe.A1M();
        }
        recyclerView.setAdapter(null);
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ Class CBk() {
        return getClass();
    }

    @Override // X.InterfaceC77833eB
    public final /* synthetic */ String getDescription() {
        return AbstractC75733ae.A00(getClass());
    }
}
