package X;

import android.content.ContentValues;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.ByteArrayOutputStream;

/* renamed from: X.9o4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220189o4 extends C2RB {
    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ ContentValues A0B(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, this.A00.userId);
        contentValues.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A0A(byteArrayOutputStream, obj));
        return contentValues;
    }

    @Override // X.C2RB
    public final String A0E() {
        return IntentModule.EXTRA_MAP_KEY_FOR_VALUE;
    }

    @Override // X.C2RB
    public final String A0F() {
        return "db_created_config";
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ void A0G(AnonymousClass182 anonymousClass182, Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            synchronized (number) {
                try {
                    anonymousClass182.A0d();
                    anonymousClass182.A0R("db_created_time", number.longValue());
                    anonymousClass182.A0a();
                    anonymousClass182.close();
                } catch (Exception e) {
                    C0w9.A06("DirectDatabaseCreatedConfigSQLiteTable", "Failed to serialize config", e);
                }
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0C(C16L c16l, boolean z) {
        try {
            c16l.A1J();
            if ("db_created_time".equals(c16l.A0q())) {
                c16l.A1J();
                return Long.valueOf(c16l.A0j());
            }
            return null;
        } catch (Exception e) {
            C0w9.A06("DirectDatabaseCreatedConfigSQLiteTable", "Failed to parse db config", e);
            return null;
        }
    }

    @Override // X.C2RB
    public final /* bridge */ /* synthetic */ Object A0D(UserSession userSession, Object obj) {
        return obj;
    }
}
