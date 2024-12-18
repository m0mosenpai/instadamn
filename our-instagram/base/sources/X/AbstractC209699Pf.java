package X;

/* renamed from: X.9Pf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC209699Pf {
    public static final boolean A01() {
        C18720vz c18720vz = AbstractC12960li.A00;
        if (!AbstractC19730y1.A00(c18720vz).A00.getBoolean("has_used_text_emphasis_button", false) && AbstractC19730y1.A00(c18720vz).A00.getInt("text_emphasis_button_tooltip_impressions", 0) < 1) {
            return true;
        }
        return false;
    }

    public static final boolean A00() {
        if (!A01()) {
            C18720vz c18720vz = AbstractC12960li.A00;
            if (!AbstractC19730y1.A00(c18720vz).A00.getBoolean("has_used_text_animation_button", false) && AbstractC19730y1.A00(c18720vz).A00.getInt("text_animation_button_tooltip_impressions", 0) < 3) {
                return true;
            }
        }
        return false;
    }
}
