package X;

import android.os.Bundle;

/* loaded from: classes11.dex */
public final class VCA extends AbstractC67881V0m {
    public static final String __redex_internal_original_name = "ReelUserPayBadgesThanksSupporterCameraFragment";
    public int A00;
    public Long A02;
    public String A03;
    public String A04;
    public String A05;
    public C22P A01 = C22P.A5N;
    public final C23765Afc A06 = new C23765Afc(this, 12);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ReelUserPayBadgesSupporterThankYouFragment";
    }

    @Override // X.AbstractC67881V0m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C22P c22p;
        int A02 = C0f9.A02(9776759);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        Object obj = requireArguments.get("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_ENTRY_POINT");
        if (!(obj instanceof C22P) || (c22p = (C22P) obj) == null) {
            c22p = C22P.A5N;
        }
        this.A01 = c22p;
        this.A04 = requireArguments.getString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_ID");
        this.A05 = requireArguments.getString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_KEY_MEDIA_INSIGHTS_ID");
        if (requireArguments.containsKey("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_NUM_SUPPORTERS")) {
            this.A00 = requireArguments.getInt("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_NUM_SUPPORTERS");
            this.A03 = requireArguments.getString("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_TITLE");
            this.A02 = Long.valueOf(requireArguments.getLong("USER_PAY_BADGES_SUPPORTER_THANK_YOU_ARGUMENTS_INSIGHTS_CREATION_DATE"));
            C0f9.A09(200518461, A02);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Missing user pay supporters count");
        C0f9.A09(-217050875, A02);
        throw illegalStateException;
    }
}
