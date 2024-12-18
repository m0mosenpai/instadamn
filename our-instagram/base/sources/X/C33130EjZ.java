package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EjZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33130EjZ extends ETO {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ InterfaceC60442pS A01;
    public final /* synthetic */ C41181vS A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33130EjZ(Context context, View view, AbstractC10360h2 abstractC10360h2, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C41181vS c41181vS, Runnable runnable, String str, boolean z) {
        super(context, view, abstractC10360h2, z);
        this.A03 = runnable;
        this.A00 = userSession;
        this.A01 = interfaceC60442pS;
        this.A02 = c41181vS;
        this.A04 = str;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String id;
        int A03 = C0f9.A03(-1084700062);
        EC2 ec2 = (EC2) obj;
        int A032 = C0f9.A03(-2109512826);
        int A033 = C0f9.A03(1911547496);
        Context context = super.A00;
        AbstractC13900nG.A00(context, ec2.A00);
        AbstractC34301FAv.A00(context, super.A01, null, super.A03);
        C0f9.A0A(1612674992, A033);
        String str = ec2.A00;
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C41181vS c41181vS = this.A02;
        String str2 = c41181vS.A0j;
        String str3 = this.A04;
        AbstractC73317Y7a.A0J(interfaceC60442pS, userSession, str2, str3, "copy_link", str);
        User user = c41181vS.A0i;
        if (user == null) {
            id = null;
        } else {
            id = user.getId();
        }
        AbstractC31510Dsu.A0X(userSession, interfaceC60442pS, str2, str3, "copy_link", id, str);
        C0f9.A0A(-83867847, A032);
        C0f9.A0A(165530387, A03);
    }

    @Override // X.ETO, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        String id;
        int A03 = C0f9.A03(-1327370076);
        super.onFail(abstractC115105If);
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
        UserSession userSession = this.A00;
        InterfaceC60442pS interfaceC60442pS = this.A01;
        C41181vS c41181vS = this.A02;
        String str = c41181vS.A0j;
        String str2 = this.A04;
        AbstractC73317Y7a.A0H(interfaceC60442pS, userSession, str, str2, "copy_link", abstractC115105If.A01());
        User user = c41181vS.A0i;
        if (user == null) {
            id = null;
        } else {
            id = user.getId();
        }
        AbstractC31510Dsu.A0X(userSession, interfaceC60442pS, str, str2, "copy_link", id, null);
        C0f9.A0A(-1409751932, A03);
    }
}
