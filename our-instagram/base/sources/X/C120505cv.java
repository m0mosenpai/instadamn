package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.5cv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120505cv extends C0T6 implements InterfaceC120515cw {
    public static final C1OZ A02 = new C1OZ() { // from class: X.5cx
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C120505cv parseFromJson = AbstractC47086Krh.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C120505cv c120505cv = (C120505cv) obj;
            anonymousClass182.A0d();
            String str = c120505cv.A01;
            if (str != null) {
                anonymousClass182.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
            }
            String str2 = c120505cv.A00;
            if (str2 != null) {
                anonymousClass182.A0S("pending_media_key", str2);
            }
            anonymousClass182.A0a();
        }
    };
    public String A01 = null;
    public String A00 = null;

    @Override // X.InterfaceC120515cw
    public final boolean CXb(Context context, UserSession userSession, String str) {
        if (!C14360o3.A0K(this.A01, userSession.userId)) {
            return true;
        }
        PendingMediaStore A00 = C25A.A00(userSession);
        if (!A00.A0E() || A00.A03(this.A00) != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C120505cv) {
                C120505cv c120505cv = (C120505cv) obj;
                if (!C14360o3.A0K(this.A01, c120505cv.A01) || !C14360o3.A0K(this.A00, c120505cv.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C1OX
    public final String getTypeName() {
        return "PendingMediaFileOwner";
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A00;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
