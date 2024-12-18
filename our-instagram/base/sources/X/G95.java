package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* loaded from: classes6.dex */
public final class G95 implements InterfaceC58152PqH {
    public final /* synthetic */ int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C38321qM A03;
    public final /* synthetic */ InterfaceC60442pS A04;
    public final /* synthetic */ SavedCollection A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public G95(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, SavedCollection savedCollection, String str, String str2, int i) {
        this.A02 = userSession;
        this.A04 = interfaceC60442pS;
        this.A03 = c38321qM;
        this.A00 = i;
        this.A07 = str;
        this.A05 = savedCollection;
        this.A01 = fragmentActivity;
        this.A06 = str2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        if (AbstractC35273Fh8.A0D(this.A05)) {
            C1XH A00 = FB6.A00();
            FragmentActivity fragmentActivity = this.A01;
            UserSession userSession = this.A02;
            String str = this.A07;
            A00.A07(fragmentActivity, userSession, str, this.A06);
            AbstractC35273Fh8.A05(userSession, this.A03, this.A04, str, this.A00);
        }
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        UserSession userSession = this.A02;
        InterfaceC60442pS interfaceC60442pS = this.A04;
        AbstractC35273Fh8.A06(userSession, this.A03, interfaceC60442pS, this.A07, this.A00);
    }
}
