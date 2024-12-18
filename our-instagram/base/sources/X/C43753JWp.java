package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JWp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43753JWp implements InterfaceC85403rV {
    public final /* synthetic */ List A00;
    public final /* synthetic */ InterfaceC16820sZ A01;
    public final /* synthetic */ InterfaceC16620sF A02;

    public C43753JWp(List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF) {
        this.A00 = list;
        this.A02 = interfaceC16620sF;
        this.A01 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC85403rV
    public final void D4A(ClickableSpan clickableSpan, View view, UserSession userSession, String str) {
        AbstractC167017dG.A1P(str, view);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            User A15 = AbstractC25226BEj.A15(it);
            if (C14360o3.A0K(AbstractC43593JPy.A0z(A15), str)) {
                this.A02.invoke(A15, view);
                return;
            }
        }
        this.A01.invoke();
    }
}
