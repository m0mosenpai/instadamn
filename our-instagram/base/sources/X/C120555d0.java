package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.5d0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120555d0 implements InterfaceC120515cw {
    public static final C1OZ A02 = new C1OZ() { // from class: X.5d1
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C120555d0 parseFromJson = AbstractC120575d2.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C120555d0 c120555d0 = (C120555d0) obj;
            anonymousClass182.A0d();
            anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, c120555d0.A01);
            anonymousClass182.A0S("clips_session_id", c120555d0.A00);
            anonymousClass182.A0a();
        }
    };
    public final String A00;
    public final String A01;

    public C120555d0(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // X.InterfaceC120515cw
    public final boolean CXb(Context context, UserSession userSession, String str) {
        C14360o3.A0B(context, 0);
        if (!AbstractC50102Ry.A00(this.A01, userSession.userId)) {
            return true;
        }
        return ((Boolean) C2ST.A00(AnonymousClass191.A00, new C9D3(this, C2OY.A00(context, userSession), (InterfaceC23621Ds) null, 38))).booleanValue();
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "ClipsDraftFileOwner";
    }
}
