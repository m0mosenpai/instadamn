package X;

import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.Orn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55899Orn implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "InstagramMainActivity$TabDerivedAnalyticsModule";
    public final /* synthetic */ InstagramMainActivity A00;

    public C55899Orn(InstagramMainActivity instagramMainActivity) {
        this.A00 = instagramMainActivity;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String A02;
        C54762fZ c54762fZ = this.A00.A09;
        if (c54762fZ == null || (A02 = c54762fZ.A02()) == null) {
            return "main_activity";
        }
        return A02;
    }
}
