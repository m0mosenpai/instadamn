package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.NXv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52786NXv extends AnonymousClass522 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C54601OAc A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52786NXv(View view, FragmentActivity fragmentActivity, UserSession userSession, C54601OAc c54601OAc, int i) {
        super(Integer.valueOf(i));
        this.A00 = view;
        this.A03 = c54601OAc;
        this.A02 = userSession;
        this.A01 = fragmentActivity;
    }

    @Override // X.AnonymousClass522, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.A00.setVisibility(8);
        N4K n4k = new N4K();
        C54601OAc c54601OAc = this.A03;
        C14360o3.A0B(c54601OAc, 0);
        n4k.A00 = c54601OAc;
        AbstractC31175DnJ.A0N(this.A02).A02(this.A01, n4k);
    }
}
