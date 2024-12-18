package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class GCO implements InterfaceC55112gB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    @Override // X.InterfaceC55112gB
    public final void DMz(Context context, C4NL c4nl, InterfaceC55362gb interfaceC55362gb, String str) {
        int A06 = AbstractC167007dF.A06(1, c4nl, context);
        if (!AbstractC31172DnG.A0D(this.A00).A0G) {
            AbstractC54912fq.A00();
            UserSession userSession = this.A01;
            String str2 = this.A02;
            Locale locale = Locale.US;
            C14360o3.A08(locale);
            QuickPromotionSlot valueOf = QuickPromotionSlot.valueOf(AbstractC166997dE.A10(locale, str2));
            C14360o3.A0B(userSession, 1);
            C14360o3.A0B(valueOf, A06);
            AbstractC69976Vys.A01(context, userSession, c4nl, valueOf, null);
        }
    }

    public GCO(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }
}
