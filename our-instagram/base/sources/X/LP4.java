package X;

import android.net.Uri;
import android.view.View;

/* loaded from: classes8.dex */
public final class LP4 implements View.OnClickListener {
    public final /* synthetic */ C7S8 A00;
    public final /* synthetic */ C76K A01;
    public final /* synthetic */ String A02;

    public LP4(C7S8 c7s8, C76K c76k, String str) {
        this.A02 = str;
        this.A00 = c7s8;
        this.A01 = c76k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(1684290741);
        Uri.Builder buildUpon = android.net.Uri.parse(this.A02).buildUpon();
        C76K c76k = this.A01;
        C7S8 c7s8 = this.A00;
        buildUpon.appendQueryParameter("s", "direct_forwarding_eyebrow");
        String str = c76k.A07;
        if (str != null) {
            if (C18U.A06(C06090Tz.A05, c7s8.A02, 36319312903085219L)) {
                buildUpon.appendQueryParameter("x", str);
            }
        }
        buildUpon.build();
        c7s8.A04.Cs6(AbstractC166987dD.A19(buildUpon), null, null);
        C142846ck A00 = AbstractC147806l5.A00(c7s8.A02);
        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
        if (AbstractC25226BEj.A1Z(A0I)) {
            AbstractC31175DnJ.A1B(A0I, A00);
            AbstractC31174DnI.A1I(A0I, "thread_open");
            AbstractC43593JPy.A1N(A0I, "channel_eybrow_link");
            A0I.A0n("broadcast");
            A0I.A0r(null);
            AbstractC31177DnL.A1H(A0I, A00, null);
        }
        C0f9.A0C(1825928180, A05);
    }
}
