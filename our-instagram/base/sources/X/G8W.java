package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G8W implements GZB {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8W(UserSession userSession, String str, String str2, String str3, String str4) {
        this.A00 = userSession;
        this.A01 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = str4;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        UserSession userSession = this.A00;
        FragmentActivity A07 = AbstractC31179DnN.A07();
        if (A07 != null) {
            AbstractC55224Oeq.A0A(A07, userSession, this.A01, this.A03, this.A04, this.A02, false);
        }
    }
}
