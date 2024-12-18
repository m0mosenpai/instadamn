package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.5yN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132425yN extends C3OO implements C33R {
    public C9BH A00;
    public UserSession A01;
    public InterfaceC60442pS A02;
    public C75113Zb A03;
    public final IgTextLayoutView A04;
    public final C57332k8 A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C132425yN(View view, C57332k8 c57332k8) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = c57332k8;
        View findViewById = view.findViewById(R.id.row_feed_headline);
        C14360o3.A07(findViewById);
        this.A04 = (IgTextLayoutView) findViewById;
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i == 4) {
            Context context = this.A04.getContext();
            C14360o3.A07(context);
            C9BH c9bh = this.A00;
            if (c9bh != null) {
                C38321qM c38321qM = (C38321qM) c9bh.A00;
                int i2 = c75113Zb.A02;
                C57332k8 c57332k8 = this.A05;
                InterfaceC60442pS interfaceC60442pS = this.A02;
                if (interfaceC60442pS != null) {
                    UserSession userSession = this.A01;
                    if (userSession != null) {
                        C132415yM.A02(context, userSession, this, c38321qM, interfaceC60442pS, c57332k8, i2);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
