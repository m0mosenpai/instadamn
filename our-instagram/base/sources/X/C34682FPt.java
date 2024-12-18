package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.FPt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34682FPt {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ EMG A02;

    public C34682FPt(FragmentActivity fragmentActivity, UserSession userSession, EMG emg) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = emg;
    }

    public final void A00(ImageUrl imageUrl, SavedCollection savedCollection) {
        String A0p;
        boolean z;
        boolean A05;
        EnumC33416Epn enumC33416Epn;
        boolean z2 = savedCollection.A0N;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        EMG emg = this.A02;
        C14360o3.A0B(emg, 3);
        C36519G8r c36519G8r = new C36519G8r(fragmentActivity, emg, userSession, savedCollection);
        String str = savedCollection.A0G;
        if (z2) {
            A0p = AbstractC166997dE.A0p(fragmentActivity, 2131952155);
            z = true;
            enumC33416Epn = savedCollection.A07;
            C14360o3.A07(enumC33416Epn);
            A05 = true;
        } else {
            int i = 2131952155;
            if (savedCollection.A05 != null) {
                i = 2131952368;
            }
            A0p = AbstractC166997dE.A0p(fragmentActivity, i);
            z = true;
            A05 = savedCollection.A05();
            enumC33416Epn = savedCollection.A07;
            C14360o3.A07(enumC33416Epn);
        }
        AbstractC35236FgV.A00(fragmentActivity, imageUrl, c36519G8r, enumC33416Epn, str, A0p, z, A05, z);
    }
}
