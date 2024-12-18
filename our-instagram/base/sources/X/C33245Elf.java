package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33245Elf extends AnonymousClass772 {
    public final /* synthetic */ C70N A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33245Elf(C70N c70n, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = c70n;
        this.A01 = str;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C70N c70n = this.A00;
        String str = this.A01;
        C1YY A01 = FVI.A01();
        FragmentActivity fragmentActivity = c70n.A00;
        UserSession userSession = c70n.A01;
        java.util.Set set = FE3.A00;
        A01.A05(fragmentActivity, userSession, str, "profile_upsell");
    }
}
