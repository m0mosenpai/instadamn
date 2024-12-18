package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AudienceMessageEntityRange;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class VB4 extends AnonymousClass772 {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB4(C38657Gyy c38657Gyy, InterfaceC71978XDn interfaceC71978XDn, int i) {
        super(Integer.valueOf(i));
        this.A01 = interfaceC71978XDn;
        this.A02 = c38657Gyy;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y;
        switch (this.A00) {
            case 0:
                C69655Vsw c69655Vsw = (C69655Vsw) this.A02;
                A0y = AbstractC25228BEl.A0y(c69655Vsw.A02, c69655Vsw.A07, C2Fb.A35, ((AudienceMessageEntityRange) this.A01).getUrl());
                break;
            case 1:
                C67892V0z c67892V0z = (C67892V0z) this.A02;
                C70399WUb c70399WUb = c67892V0z.A0B;
                if (c70399WUb != null) {
                    c70399WUb.A0G(VG4.A1Q, "audience_validation_learn_more");
                }
                FragmentActivity requireActivity = c67892V0z.requireActivity();
                UserSession userSession = c67892V0z.A0H;
                if (userSession == null) {
                    C14360o3.A0F("userSession");
                    throw C00O.createAndThrow();
                }
                A0y = AbstractC25228BEl.A0y(requireActivity, userSession, C2Fb.A35, ((AudienceMessageEntityRange) this.A01).getUrl());
                A0y.A0S = "promote_review";
                break;
            default:
                ((InterfaceC71978XDn) this.A01).DjY((C38657Gyy) this.A02);
                return;
        }
        A0y.A0A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB4(AudienceMessageEntityRange audienceMessageEntityRange, C69655Vsw c69655Vsw, int i) {
        super(Integer.valueOf(i));
        this.A02 = c69655Vsw;
        this.A01 = audienceMessageEntityRange;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VB4(AudienceMessageEntityRange audienceMessageEntityRange, C67892V0z c67892V0z, int i) {
        super(Integer.valueOf(i));
        this.A02 = c67892V0z;
        this.A01 = audienceMessageEntityRange;
    }
}
