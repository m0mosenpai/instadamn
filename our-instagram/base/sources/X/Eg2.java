package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class Eg2 extends EV5 {
    public static final String __redex_internal_original_name = "ChallengeUtil$1";
    public final /* synthetic */ UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eg2(Context context, Fragment fragment, FragmentActivity fragmentActivity, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, UserSession userSession2, EnumC33353Eom enumC33353Eom, List list, boolean z) {
        super(context, fragment, fragmentActivity, abstractC10360h2, interfaceC11380iw, userSession, enumC33353Eom, list, z);
        this.A00 = userSession2;
    }

    @Override // X.EV5, X.U7H
    public final /* bridge */ /* synthetic */ void A05(Object obj) {
        super.A05(obj);
        FTX.A00(this.A00).A01();
    }
}
