package X;

import android.view.View;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* loaded from: classes8.dex */
public final class LPF implements View.OnClickListener {
    public final /* synthetic */ C9CP A00;
    public final /* synthetic */ C7Ze A01;
    public final /* synthetic */ C7QY A02;
    public final /* synthetic */ C158697Af A03;

    public LPF(C9CP c9cp, C7Ze c7Ze, C7QY c7qy, C158697Af c158697Af) {
        this.A01 = c7Ze;
        this.A00 = c9cp;
        this.A02 = c7qy;
        this.A03 = c158697Af;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1851681584);
        C7Ze c7Ze = this.A01;
        C9CP c9cp = this.A00;
        String str = c9cp.A04;
        String str2 = c9cp.A05;
        String str3 = c9cp.A06;
        String str4 = c9cp.A02;
        String str5 = c9cp.A03;
        C7QY c7qy = this.A02;
        String str6 = c7qy.A08.A00;
        DirectMessageIdentifier directMessageIdentifier = c7qy.A0L;
        Integer A0p = AbstractC25227BEk.A0p();
        c7Ze.CKa(AbstractC13880nE.A0G(this.A03.A0V), c7qy.A0B.A04, directMessageIdentifier, null, A0p, str, str2, str3, str4, str5, str6, null, null, null, null);
        C0f9.A0C(1644738767, A05);
    }
}
