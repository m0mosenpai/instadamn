package X;

import android.content.Context;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.io.File;
import java.util.HashSet;
import java.util.concurrent.Executors;

/* renamed from: X.1U5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1U5 {
    public Context A01;
    public int A00 = 0;
    public java.util.Set A02 = new HashSet();
    public boolean A03 = false;

    public C1U5(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.A01 = applicationContext;
        if (applicationContext == null) {
            this.A01 = context;
        }
    }

    public final C1UI A00() {
        return new C1UI(this.A02, Executors.newSingleThreadExecutor(), new InterfaceC08830cm() { // from class: X.1UE
            @Override // X.InterfaceC08830cm
            public final Object get() {
                Context context = C1U5.this.A01;
                String A00 = C1UY.A00();
                if (A00 == null) {
                    A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                }
                return new File(context.getDir("light_prefs", 0), A00);
            }
        }, this.A00, this.A03);
    }
}
