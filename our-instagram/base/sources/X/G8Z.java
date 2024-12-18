package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes6.dex */
public final class G8Z implements GZB {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ List A06;

    @Override // X.GZB
    public final void D3J(Context context) {
        C14360o3.A0B(context, 0);
        List list = this.A06;
        if (list != null && !list.isEmpty()) {
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A02;
            C31368DqX.A02(AbstractC25225BEi.A0r(fragmentActivity, userSession), userSession, AbstractC31364DqT.A02(), AbstractC31402Dr6.A00(userSession, this.A04, this.A01.getModuleName()));
        } else {
            List list2 = this.A05;
            if (list2 == null) {
                return;
            }
            AbstractC34339FCh.A00(context, this.A01, this.A02, this.A03, null, list2);
        }
    }

    @Override // X.GZB
    public final void onDismiss() {
    }

    public G8Z(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, List list, List list2) {
        this.A06 = list;
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = str;
        this.A01 = interfaceC11380iw;
        this.A05 = list2;
        this.A03 = str2;
    }
}
