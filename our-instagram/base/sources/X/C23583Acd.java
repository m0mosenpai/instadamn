package X;

import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Acd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23583Acd implements InterfaceC37149GYk {
    public final /* synthetic */ C8Y8 A00;

    @Override // X.InterfaceC37149GYk
    public final void Ei1(List list) {
    }

    public C23583Acd(C8Y8 c8y8) {
        this.A00 = c8y8;
    }

    @Override // X.InterfaceC37149GYk
    public final void Cxg(List list, boolean z) {
        C8Y8 c8y8 = this.A00;
        if (z) {
            if (list.size() == 1 && ((AudienceListViewModel) AbstractC166987dD.A16(list)).A05) {
                c8y8.A0D();
                return;
            }
            if (list.isEmpty()) {
                return;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1E.add(((AudienceListViewModel) it.next()).A01);
            }
            C8Y8.A0A(c8y8, A1E, 3);
            return;
        }
        c8y8.A0A.A0e();
    }
}
