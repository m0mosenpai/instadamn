package X;

import android.content.UriMatcher;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class QBA extends AbstractC63763StJ {
    public static final UriMatcher A00;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        A00 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // X.InterfaceC65570Tn3
    public final Class Avg() {
        return InputStream.class;
    }
}
