package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.List;

/* loaded from: classes6.dex */
public final class G94 implements InterfaceC58152PqH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ InterfaceC11380iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ SavedCollection A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G94(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, String str, List list, int i) {
        this.A02 = interfaceC11380iw;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = savedCollection;
        this.A05 = str;
        this.A06 = list;
        this.A00 = i;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        AbstractC35260Fgu.A05(this.A01, this.A02, this.A03, this.A04, this.A05, this.A06, this.A00);
    }
}
