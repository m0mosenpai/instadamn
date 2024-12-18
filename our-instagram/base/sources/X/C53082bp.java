package X;

import android.os.LocaleList;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Locale;

/* renamed from: X.2bp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C53082bp {
    public static final C53082bp A01 = new C53082bp(new C53092bq(new LocaleList(new Locale[0])));
    public final InterfaceC53102br A00;

    public static C53082bp A00(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = Locale.forLanguageTag(split[i]);
            }
            return new C53082bp(new C53092bq(new LocaleList(localeArr)));
        }
        return A01;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C53082bp) && this.A00.equals(((C53082bp) obj).A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public C53082bp(InterfaceC53102br interfaceC53102br) {
        this.A00 = interfaceC53102br;
    }
}
