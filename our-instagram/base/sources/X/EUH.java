package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.nux.cal.model.ConnectContent;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class EUH extends C1P1 {
    public final /* synthetic */ ELk A00;

    public EUH(ELk eLk) {
        this.A00 = eLk;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-73495242);
        super.onFail(abstractC115105If);
        ELk eLk = this.A00;
        eLk.A0D = true;
        eLk.A03 = null;
        ELk.A03(eLk);
        C0f9.A0A(-1259406401, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(562536679);
        super.onFinish();
        this.A00.A0E = false;
        C0f9.A0A(1289497317, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1551456905);
        super.onStart();
        this.A00.A0E = true;
        C0f9.A0A(-1385974922, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A03 = C0f9.A03(1985533374);
        ConnectContent connectContent = (ConnectContent) obj;
        int A032 = C0f9.A03(1712231303);
        super.onSuccess(connectContent);
        ELk eLk = this.A00;
        eLk.A0D = true;
        eLk.A03 = connectContent;
        if (!ELk.A05(connectContent)) {
            UserSession A00 = ELk.A00(eLk);
            A00.getClass();
            String obj2 = EnumC33360Eot.A05.toString();
            ConnectContent connectContent2 = eLk.A03;
            HashMap A1G = AbstractC166987dD.A1G();
            if (connectContent2 == null) {
                str = "content";
            } else {
                if (connectContent2.A09 == null) {
                    A1G.put(DialogModule.KEY_TITLE, "null");
                }
                if (connectContent2.A05 == null) {
                    A1G.put(MSV.A00(249), "null");
                }
                if (connectContent2.A06 == null) {
                    A1G.put(MSV.A00(566), "null");
                }
                if (connectContent2.A03 == null) {
                    str = "target_accounts";
                }
                String obj3 = A1G.toString();
                AbstractC167017dG.A1N(A00, obj2);
                C35191Ffj.A01(A00, "generic_error", obj2, obj3);
            }
            A1G.put(str, "null");
            String obj32 = A1G.toString();
            AbstractC167017dG.A1N(A00, obj2);
            C35191Ffj.A01(A00, "generic_error", obj2, obj32);
        }
        ELk.A03(eLk);
        C0f9.A0A(1537463763, A032);
        C0f9.A0A(-440996921, A03);
    }
}
