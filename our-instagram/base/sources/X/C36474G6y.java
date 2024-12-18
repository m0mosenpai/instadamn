package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.G6y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36474G6y implements C7YN {
    public final /* synthetic */ FQS A00;

    public C36474G6y(FQS fqs) {
        this.A00 = fqs;
    }

    @Override // X.C7YN
    public final void En8(String str) {
        int i;
        FQS fqs = this.A00;
        FragmentActivity activity = fqs.A02.getActivity();
        if (activity != null) {
            User user = fqs.A00;
            if (user != null) {
                ArrayList A01 = C4GO.A01(AbstractC166987dD.A1J(user));
                C36881nl A012 = C36881nl.A01(activity, fqs.A03, fqs.A04, "rtc_call_entry_point");
                A012.A0A(str);
                A012.A0B(A01);
                A012.A0y = true;
                Boolean bool = fqs.A01;
                if (bool != null) {
                    C7T3 c7t3 = fqs.A06;
                    boolean booleanValue = bool.booleanValue();
                    InterfaceC83713oG interfaceC83713oG = A012.A0B;
                    C18C.A07(interfaceC83713oG, "Missing ThreadTarget");
                    A012.A0C = c7t3;
                    if (booleanValue) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                    C36881nl.A03(A012, interfaceC83713oG, i);
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
