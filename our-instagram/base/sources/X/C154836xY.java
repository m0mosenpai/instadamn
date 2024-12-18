package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6xY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154836xY extends C154846xZ {
    public Integer A00;
    public boolean A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C154836xY(UserSession userSession, boolean z, boolean z2) {
        super(userSession, "clips_profile_tab", 31795244);
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A03 = z;
        this.A04 = z2;
        this.A00 = C05F.A00;
    }

    @Override // X.JQS
    public final void A0N(Context context, C55782hJ c55782hJ, InterfaceC11380iw interfaceC11380iw, InterfaceC59992oh interfaceC59992oh) {
        throw new IllegalStateException("Use initAndStartLogging() method instead for Clips Profile");
    }

    @Override // X.JQS
    public final void A0O(Context context, C55782hJ c55782hJ, InterfaceC11380iw interfaceC11380iw, InterfaceC59992oh interfaceC59992oh, boolean z) {
        throw new IllegalStateException("Use initAndStartLogging() method instead for Clips Profile");
    }

    @Override // X.JQS
    public final void A0Q(Context context, C55782hJ c55782hJ, InterfaceC59992oh interfaceC59992oh) {
        throw new IllegalStateException("Use initAndStartLogging() method instead for Clips Profile");
    }

    @Override // X.C154846xZ, X.AbstractC69603Au
    public final void A05() {
        super.A05();
        A0K("is_self_profile", this.A03);
        A0K("is_clips_profile_starting_tab", this.A04);
    }
}
