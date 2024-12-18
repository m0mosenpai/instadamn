package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Elh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33247Elh extends AnonymousClass772 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33247Elh(FragmentActivity fragmentActivity, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        this.A02 = str;
    }

    @Override // X.AnonymousClass772, android.text.style.ClickableSpan
    public final void onClick(View view) {
        C63397SjR A0y = AbstractC25228BEl.A0y(this.A00, this.A01, C2Fb.A35, this.A02);
        A0y.A0S = "promote";
        A0y.A0A();
    }
}
