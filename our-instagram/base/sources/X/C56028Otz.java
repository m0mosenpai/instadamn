package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Otz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56028Otz implements InterfaceC41501vz {
    public final /* synthetic */ C53K A00;

    public C56028Otz(C53K c53k) {
        this.A00 = c53k;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(-610698230);
        C3HX c3hx = (C3HX) obj;
        int A032 = C0f9.A03(-637364229);
        C14360o3.A0B(c3hx, 0);
        if (c3hx.A01) {
            C38321qM c38321qM = c3hx.A00;
            if (c38321qM.A5H()) {
                C53K c53k = this.A00;
                FragmentActivity activity = c53k.getActivity();
                if (activity == null) {
                    i = -1235642582;
                    C0f9.A0A(i, A032);
                    C0f9.A0A(1173620446, A03);
                }
                AbstractC50558MTp.A08(activity, AbstractC166987dD.A0r(c53k.A06), c38321qM, 0);
            }
        }
        i = 290323350;
        C0f9.A0A(i, A032);
        C0f9.A0A(1173620446, A03);
    }
}
