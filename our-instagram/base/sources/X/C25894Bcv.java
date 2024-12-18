package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Bcv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25894Bcv extends C2UU {
    public List A00 = C16930sl.A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;

    @Override // X.C2UU
    public final void onBindViewHolder(C3OO c3oo, int i) {
        C14360o3.A0B(c3oo, 0);
        CAY cay = C7J.values()[getItemViewType(i)].A00;
        List list = this.A00;
        cay.A01(c3oo, this.A01, this.A02, list, i);
    }

    @Override // X.C2UU
    public final C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return C7J.values()[i].A00.A00(viewGroup);
    }

    public C25894Bcv(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1305103358);
        int size = this.A00.size();
        C0f9.A0A(298397061, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public final int getItemViewType(int i) {
        C7J c7j;
        int A03 = C0f9.A03(-969903628);
        Object obj = this.A00.get(i);
        C14360o3.A0B(obj, 0);
        if (C26079Bg8.A00(obj, 4)) {
            c7j = C7J.A03;
        } else if (C45116Jxl.A00(obj, 9)) {
            c7j = C7J.A04;
        } else {
            throw AbstractC166987dD.A12(MSV.A00(18));
        }
        int ordinal = c7j.ordinal();
        C0f9.A0A(321839275, A03);
        return ordinal;
    }
}
