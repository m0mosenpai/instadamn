package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* loaded from: classes6.dex */
public final class G8Y implements GZB {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C2OG A01;
    public final /* synthetic */ InterfaceC83713oG A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public G8Y(UserSession userSession, C2OG c2og, InterfaceC83713oG interfaceC83713oG, String str, String str2, boolean z, boolean z2) {
        this.A01 = c2og;
        this.A00 = userSession;
        this.A02 = interfaceC83713oG;
        this.A03 = str;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = str2;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        FragmentActivity A06;
        if (C36881nl.A13 != null && (A06 = this.A01.A06()) != null) {
            C36881nl A01 = C36881nl.A01(A06, AbstractC34379FDv.A00, this.A00, "banner");
            A01.A0B = this.A02;
            A01.A0X = this.A03;
            A01.A0t = this.A05;
            A01.A0x = this.A06;
            A01.A06();
        }
    }

    @Override // X.GZB
    public final void onDismiss() {
        C27741Wc.A01().A04(this.A00, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, this.A04);
    }
}
