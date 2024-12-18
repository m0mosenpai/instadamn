package X;

/* loaded from: classes11.dex */
public abstract class VXF {
    public static final void A00(MUW muw, AnonymousClass182 anonymousClass182) {
        C14360o3.A0B(muw, 1);
        anonymousClass182.A0d();
        Number number = (Number) muw.A00;
        if (number != null) {
            anonymousClass182.A0Q("count", number.intValue());
        }
        String str = muw.A02;
        if (str != null) {
            anonymousClass182.A0S("hint_text", str);
        }
        Boolean bool = (Boolean) muw.A01;
        if (bool != null) {
            anonymousClass182.A0T("is_hint_row", bool.booleanValue());
        }
        AbstractC37301Gc2.A1E(anonymousClass182, muw.A03);
        anonymousClass182.A0a();
    }
}
