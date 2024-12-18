package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.androidlink.AndroidLink;

/* loaded from: classes6.dex */
public final class GHE implements C7XU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    @Override // X.C7XU
    public final void DB3() {
    }

    public GHE(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A04 = str;
        this.A05 = str2;
    }

    @Override // X.C7XU
    public final void DAy() {
        if (this.A00 != 0) {
            C37952Gmu c37952Gmu = (C37952Gmu) this.A01;
            AbstractC41772Ieo.A08((AndroidLink) this.A02, c37952Gmu, (C3DN) this.A03, this.A05, this.A04);
            return;
        }
        Context context = (Context) this.A02;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
        N48 n48 = (N48) this.A03;
        AbstractC35253Fgm.A01(context, fragmentActivity, n48, AbstractC166987dD.A0r(n48.A00), this.A04, this.A05, "feed", "share_from_media_creation");
    }
}
