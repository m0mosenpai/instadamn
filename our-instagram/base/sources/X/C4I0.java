package X;

import android.content.ContentValues;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: X.4I0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4I0 extends C2RB {
    @Override // X.C2RB
    public final String A0E() {
        return "mutation";
    }

    @Override // X.C2RB
    public final String A0F() {
        return "mutations";
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        C1OW c1ow = (C1OW) obj;
        C14360o3.A0B(c1ow, 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A00.userId);
        contentValues.put("mutation_type", c1ow.A02());
        contentValues.put("mutation", A0A(byteArrayOutputStream, c1ow));
        return contentValues;
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, boolean z) {
        try {
            C1OW c1ow = (C1OW) AbstractC26151Ow.A00.A01(c16l);
            if (c1ow != null) {
                if ("executing".equals(c1ow.A06)) {
                    c1ow.A06 = "queued";
                    return c1ow;
                }
                return c1ow;
            }
            return null;
        } catch (IOException e) {
            C0w9.A06("DirectMutationSQLiteTable", "Error parsing json string into DirectMutation.", e);
            return null;
        }
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ void A0G(AnonymousClass182 anonymousClass182, Object obj) {
        C1OW c1ow = (C1OW) obj;
        C14360o3.A0B(c1ow, 1);
        AbstractC26151Ow.A00.A02(anonymousClass182, c1ow);
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0D(UserSession userSession, Object obj) {
        return obj;
    }
}
