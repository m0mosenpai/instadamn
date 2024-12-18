package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;

/* loaded from: classes6.dex */
public final class EPO extends EPQ {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ String A01;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C14360o3.A0B(view, 0);
        SimpleWebViewActivity.A02.A02(AbstractC166997dE.A0L(view), this.A00, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, false, true, false, false, false, this.A01, "https://help.instagram.com/264014872646980"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EPO(C012804r c012804r, UserSession userSession, Integer num, String str, int i) {
        super(c012804r, Integer.valueOf(i), num, str);
        this.A01 = str;
        this.A00 = userSession;
    }
}
