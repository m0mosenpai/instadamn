package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.G8w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36524G8w implements InterfaceC58152PqH {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ FFX A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C36524G8w(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FFX ffx, String str, List list) {
        this.A02 = ffx;
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
        this.A04 = list;
        this.A03 = str;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        AbstractC34339FCh.A00(this.A02.A00, this.A00, this.A01, "reply_modal", this.A03, this.A04);
    }
}
