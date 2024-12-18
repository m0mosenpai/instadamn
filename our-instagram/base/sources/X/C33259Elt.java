package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;

/* renamed from: X.Elt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33259Elt extends AnonymousClass522 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33259Elt(Context context, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C35133Fea.A01(this.A00, this.A01, SimpleWebViewActivity.A02, AbstractC31171DnF.A0R("https://help.instagram.com/652943337035777"), this.A02);
    }
}
