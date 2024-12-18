package X;

import android.os.Bundle;

/* renamed from: X.FRo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34725FRo {
    public C34567FLb A00;
    public final Bundle A01 = AbstractC166987dD.A0b();

    public final void A02(String str) {
        C14360o3.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.content_id", str);
    }

    public final void A03(String str) {
        C14360o3.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.reel_id", str);
    }

    public final void A04(String str) {
        C14360o3.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.reel_item_id", str);
    }

    public final void A05(String str) {
        C14360o3.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.subtitle_string", str);
    }

    public final void A06(String str) {
        C14360o3.A0B(str, 0);
        this.A01.putString("DirectReplyModalFragment.viewer_user_id", str);
    }

    public final C32331EMd A00() {
        C32331EMd c32331EMd = new C32331EMd();
        Bundle bundle = this.A01;
        AbstractC153636vY.A01(bundle, "IgSessionManager.SESSION_TOKEN_KEY");
        AbstractC153636vY.A01(bundle, MSV.A00(74));
        AbstractC153636vY.A01(bundle, "DirectReplyModalFragment.source_module_name");
        c32331EMd.setArguments(bundle);
        c32331EMd.A02 = this.A00;
        return c32331EMd;
    }

    public final void A01(String str) {
        this.A01.putString(MSV.A00(74), str);
    }

    public final void A07(String str, String str2) {
        AbstractC167017dG.A1N(str, str2);
        Bundle bundle = this.A01;
        bundle.putString("DirectReplyModalFragment.interactive_sticker_id", str);
        bundle.putString("DirectReplyModalFragment.interactive_sticker_type", str2);
    }
}
