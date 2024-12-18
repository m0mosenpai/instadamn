package X;

import com.facebook.tigon.tigonhuc.HucClient;
import java.util.ArrayList;

/* renamed from: X.TZd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64903TZd extends ArrayList {
    public final int A00;

    public C64903TZd(int i) {
        Object obj;
        this.A00 = i;
        if (i != 0) {
            AbstractC166997dE.A1W(this, 60);
            AbstractC166997dE.A1W(this, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
            AbstractC166997dE.A1W(this, 240);
            AbstractC166997dE.A1W(this, 480);
            obj = 900;
        } else {
            AbstractC166997dE.A1X(this, 86400000L);
            AbstractC166997dE.A1X(this, 43200000L);
            AbstractC166997dE.A1X(this, 3600000L);
            AbstractC166997dE.A1X(this, 1800000L);
            obj = 900000L;
        }
        add(obj);
    }
}
