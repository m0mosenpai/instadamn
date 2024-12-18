package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jb8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43898Jb8 {
    public static final /* synthetic */ C0YR[] A05 = {new AnonymousClass013(C43898Jb8.class, "suggestionsACRUpdatedMs", "getSuggestionsACRUpdatedMs()J", 0), new AnonymousClass013(C43898Jb8.class, "suggestionsSmartAlbumsUpdatedMs", "getSuggestionsSmartAlbumsUpdatedMs()J", 0), new AnonymousClass013(C43898Jb8.class, "suggestionsMagicMediaUpdatedMs", "getSuggestionsMagicMediaUpdatedMs()J", 0)};
    public final UserSession A00;
    public final InterfaceC09390do A01;
    public final InterfaceC16530ry A02;
    public final InterfaceC16530ry A03;
    public final InterfaceC16530ry A04;

    public C43898Jb8(UserSession userSession) {
        this.A00 = userSession;
        C17050sx A01 = AbstractC09440dt.A01(new C50152MDf(this, 33));
        this.A01 = A01;
        C1AU c1au = (C1AU) A01.getValue();
        C1AV c1av = C1AV.A0d;
        Class<?> cls = getClass();
        this.A02 = AbstractC19590xm.A02(c1au.A04(c1av, cls), "suggestions_acr_last_updated_key", 0L, false);
        this.A04 = AbstractC19590xm.A02(((C1AU) this.A01.getValue()).A04(c1av, cls), "suggestions_smart_album_last_updated_key", 0L, false);
        this.A03 = AbstractC19590xm.A02(((C1AU) this.A01.getValue()).A04(c1av, cls), "suggestions_magic_media_last_updated_key", 0L, false);
    }

    public final C09530e4 A00() {
        InterfaceC19630xq A0Y = JQ0.A0Y(this);
        if (!A0Y.contains("suggestions_home_latitude_prefs_key")) {
            return null;
        }
        return AbstractC166987dD.A1L(Float.valueOf(A0Y.getFloat("suggestions_home_latitude_prefs_key", 0.0f)), Float.valueOf(A0Y.getFloat("suggestions_home_longitude_prefs_key", 0.0f)));
    }
}
