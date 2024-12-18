package X;

import java.util.ArrayList;

/* renamed from: X.7nc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173247nc {
    public boolean A00;
    public final C173257nd A01;
    public final ArrayList A02;

    public final void A00() {
        this.A00 = true;
        this.A01.A00.A02("use_fx_upsell_eligibility_checker", true);
    }

    public C173247nc() {
        C173257nd c173257nd = new C173257nd();
        C2JM c2jm = c173257nd.A00;
        c2jm.A02("ig_story_xpost_upsell", false);
        c2jm.A02("ig_profile_photo_change", false);
        c2jm.A02("ig_profile_photo_completeness", false);
        c2jm.A02("ig_feed_xpost_upsell", false);
        c2jm.A02("ig_discover_people_upsell", false);
        c2jm.A02("ig_import_from_fb", false);
        c2jm.A02("use_fx_upsell_eligibility_checker", false);
        c2jm.A02("impression_limit_check_enabled", true);
        c2jm.A02("recently_seen_check_enabled", true);
        this.A01 = c173257nd;
        this.A02 = new ArrayList();
    }
}
