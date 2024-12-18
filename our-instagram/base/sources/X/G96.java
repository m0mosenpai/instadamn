package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* loaded from: classes6.dex */
public final class G96 implements InterfaceC58152PqH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ Runnable A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G96(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, Runnable runnable, String str, List list, int i) {
        this.A02 = interfaceC11380iw;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = savedCollection;
        this.A06 = str;
        this.A07 = list;
        this.A00 = i;
        this.A05 = runnable;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        InterfaceC11380iw interfaceC11380iw = this.A02;
        AbstractC35260Fgu.A02(this.A01, interfaceC11380iw, this.A03, this.A04, this.A05, this.A06, this.A07, this.A00);
    }
}
