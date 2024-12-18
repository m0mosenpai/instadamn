package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NZx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52840NZx extends C56163OwV {
    public final ViewGroup A00;
    public final C171197kB A01;
    public final C171197kB A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.7kB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.7kB, java.lang.Object] */
    public C52840NZx(View view, AbstractC59962oe abstractC59962oe, UserSession userSession, EnumC142806cg enumC142806cg) {
        super(view, abstractC59962oe, userSession, enumC142806cg, R.layout.iglive_broadcaster_buttons_container);
        C14360o3.A0B(userSession, 2);
        this.A00 = AbstractC31176DnK.A0C(view, R.id.iglive_reactions_layout);
        this.A01 = new Object();
        this.A02 = new Object();
    }

    @Override // X.C56163OwV
    public final void A04(Fragment fragment) {
        C53010Nci c53010Nci;
        super.A04(fragment);
        AbstractC50987Mfu abstractC50987Mfu = (AbstractC50987Mfu) this.A0I.getValue();
        if ((abstractC50987Mfu instanceof C53010Nci) && (c53010Nci = (C53010Nci) abstractC50987Mfu) != null) {
            JQ0.A11(fragment, C57167PZl.A01(this, null, 32), c53010Nci.A04);
        }
    }
}
