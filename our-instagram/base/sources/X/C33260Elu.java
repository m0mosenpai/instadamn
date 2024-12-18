package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* renamed from: X.Elu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33260Elu extends AnonymousClass522 {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33260Elu(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, int i) {
        super(Integer.valueOf(i));
        this.A01 = userSession;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = fragmentActivity;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        UserSession userSession = this.A01;
        AbstractC25228BEl.A1G(this.A00, AbstractC31364DqT.A02().A01(userSession, AbstractC31402Dr6.A03(userSession, this.A02, "direct_thread_ugc_ai", this.A03)), userSession, ModalActivity.class, "profile");
    }
}
