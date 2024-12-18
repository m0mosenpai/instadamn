package X;

import android.content.ContentValues;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.2RA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2RA extends C2RB {
    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        C14360o3.A0B(obj, 0);
        ContentValues contentValues = new ContentValues(3);
        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A00.userId);
        contentValues.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0A(byteArrayOutputStream, obj));
        return contentValues;
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0D(UserSession userSession, Object obj) {
        return obj;
    }

    @Override // X.C2RB
    public final String A0E() {
        return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
    }

    @Override // X.C2RB
    public final String A0F() {
        return "session";
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ void A0G(AnonymousClass182 anonymousClass182, Object obj) {
        C46952Dj c46952Dj = (C46952Dj) obj;
        C14360o3.A0B(c46952Dj, 1);
        synchronized (c46952Dj) {
            C2Rt.A00(anonymousClass182, c46952Dj);
        }
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, boolean z) {
        try {
            return C2Rt.parseFromJson(c16l);
        } catch (IOException unused) {
            C0w9.A03("DirectSessionSQLiteTable", "Error parsing json string into DirectSession.");
            return null;
        }
    }

    public final C46952Dj A0H() {
        ArrayList A05 = A05(A04());
        if (A05.size() > 1) {
            C0w9.A03("DirectSessionSQLiteTable", AnonymousClass001.A0O("Session table can only contain one row per user. size: ", A05.size()));
        }
        if (!A05.isEmpty()) {
            return (C46952Dj) A05.get(0);
        }
        return new C46952Dj(AbstractC46932Dh.A00(this.A00));
    }
}
