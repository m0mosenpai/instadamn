package X;

import java.util.Locale;

/* renamed from: X.Kb9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46109Kb9 extends AbstractC47733L5u {
    public final Locale A00;

    public C46109Kb9() {
        Locale locale = Locale.getDefault();
        if (locale != null) {
            this.A00 = locale;
            return;
        }
        throw null;
    }
}
