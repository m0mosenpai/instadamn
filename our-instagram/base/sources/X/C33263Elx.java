package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Elx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33263Elx extends AnonymousClass522 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33263Elx(Activity activity, Bundle bundle, C5G6 c5g6, SZO szo, Integer num) {
        super(num);
        this.A01 = activity;
        this.A02 = szo;
        this.A04 = bundle;
        this.A03 = c5g6;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        String A00;
        if (this.A00 != 0) {
            ((C34493FIf) this.A04).A00.onActionClicked();
            User user = (User) this.A02;
            if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                UserSession userSession = (UserSession) this.A03;
                C1YY A01 = FVI.A01();
                java.util.Set set = FE3.A00;
                A01.A05(fragmentActivity, userSession, A00, "fan_dm_upsell");
                return;
            }
            return;
        }
        C12260kU.A0G((Context) this.A01, AbstractC08820cl.A03(AbstractC111324zv.A00(981)));
        AbstractC63402SjX.A0A((Bundle) this.A04, (C5G6) this.A03, (SZO) this.A02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33263Elx(FragmentActivity fragmentActivity, UserSession userSession, C34493FIf c34493FIf, User user, int i) {
        super(Integer.valueOf(i));
        this.A04 = c34493FIf;
        this.A02 = user;
        this.A01 = fragmentActivity;
        this.A03 = userSession;
    }
}
