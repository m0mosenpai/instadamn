package X;

import android.view.View;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.AQh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnClickListenerC23198AQh implements View.OnClickListener {
    public final /* synthetic */ Ai7 A00;

    public ViewOnClickListenerC23198AQh(Ai7 ai7) {
        this.A00 = ai7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-912708433);
        Ai7 ai7 = this.A00;
        A5O a5o = ai7.A04;
        C9ZL c9zl = ai7.A05;
        C81Z c81z = a5o.A00;
        c81z.A0Z.A0D(false);
        String A0o = AbstractC166997dE.A0o();
        int ordinal = c81z.A0n.A02.A01().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c81z.A0f.A0Q(new ACA(null, null, ShareType.A0G), null, C05F.A00, A0o, null, false);
            } else {
                throw AbstractC166987dD.A1D("Unknown media type");
            }
        } else {
            C8LZ.A0A(c81z.A0b, new ACA(null, null, ShareType.A0G), null, c9zl, null, A0o, null);
        }
        C0f9.A0C(1657714300, A05);
    }
}
