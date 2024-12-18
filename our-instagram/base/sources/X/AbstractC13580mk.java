package X;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.0mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13580mk {
    public static final Bundle A00(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            return extras;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Intent extras must be set for ");
        sb.append(intent);
        throw new IllegalStateException(sb.toString());
    }
}
