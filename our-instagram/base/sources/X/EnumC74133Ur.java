package X;

import android.os.Bundle;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A09' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.3Ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC74133Ur {
    public static final /* synthetic */ EnumC74133Ur[] A02;
    public static final EnumC74133Ur A03;
    public static final EnumC74133Ur A04;
    public static final EnumC74133Ur A05;
    public static final EnumC74133Ur A06;
    public static final EnumC74133Ur A07;
    public static final EnumC74133Ur A08;
    public static final EnumC74133Ur A09;
    public static final EnumC74133Ur A0A;
    public static final EnumC74133Ur A0B;
    public static final EnumC74133Ur A0C;
    public static final EnumC74133Ur A0D;
    public static final EnumC74133Ur A0E;
    public final AbstractC74143Us A00;
    public final String A01;

    static {
        AbstractC74143Us abstractC74143Us = AbstractC74143Us.A03;
        EnumC74133Ur enumC74133Ur = new EnumC74133Ur(abstractC74143Us, "BLOCKED_COUNTRIES_HOSTNAME", "host_name_ipv6", 0);
        A09 = enumC74133Ur;
        EnumC74133Ur enumC74133Ur2 = new EnumC74133Ur(abstractC74143Us, "BLOCKED_COUNTRIES_ANALYTICS_ENDPOINT", "analytics_endpoint", 1);
        A07 = enumC74133Ur2;
        AbstractC74143Us abstractC74143Us2 = AbstractC74143Us.A02;
        EnumC74133Ur enumC74133Ur3 = new EnumC74133Ur(abstractC74143Us2, "BLOCKED_COUNTRIES_HN_TIMESTAMP", "bc_host_name_timestamp", 2);
        A08 = enumC74133Ur3;
        EnumC74133Ur enumC74133Ur4 = new EnumC74133Ur(abstractC74143Us, "ANALYTIC_FB_UID", "fb_uid", 3);
        A03 = enumC74133Ur4;
        EnumC74133Ur enumC74133Ur5 = new EnumC74133Ur(abstractC74143Us, "ANALYTIC_UID", CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, 4);
        A05 = enumC74133Ur5;
        AbstractC74143Us abstractC74143Us3 = AbstractC74143Us.A00;
        EnumC74133Ur enumC74133Ur6 = new EnumC74133Ur(abstractC74143Us3, "ANALYTIC_IS_EMPLOYEE", "is_employee", 5);
        A04 = enumC74133Ur6;
        AbstractC74143Us abstractC74143Us4 = AbstractC74143Us.A01;
        EnumC74133Ur enumC74133Ur7 = new EnumC74133Ur(abstractC74143Us4, "ANALYTIC_YEAR_CLASS", "year_class", 6);
        A06 = enumC74133Ur7;
        EnumC74133Ur enumC74133Ur8 = new EnumC74133Ur(abstractC74143Us4, "LOGGING_HEALTH_STATS_SAMPLE_RATE", "logging_health_stats_sample_rate", 7);
        A0A = enumC74133Ur8;
        EnumC74133Ur enumC74133Ur9 = new EnumC74133Ur(abstractC74143Us3, "LOG_ANALYTICS_EVENTS", "log_analytic_events", 8);
        A0B = enumC74133Ur9;
        EnumC74133Ur enumC74133Ur10 = new EnumC74133Ur(abstractC74143Us4, "LOG_SR", "log_sr", 9);
        A0C = enumC74133Ur10;
        EnumC74133Ur enumC74133Ur11 = new EnumC74133Ur(abstractC74143Us, "MQTT_DEVICE_ID", "/settings/mqtt/id/mqtt_device_id", 10);
        A0D = enumC74133Ur11;
        EnumC74133Ur enumC74133Ur12 = new EnumC74133Ur(abstractC74143Us, "MQTT_DEVICE_SECRET", "/settings/mqtt/id/mqtt_device_secret", 11);
        A0E = enumC74133Ur12;
        A02 = new EnumC74133Ur[]{enumC74133Ur, enumC74133Ur2, enumC74133Ur3, enumC74133Ur4, enumC74133Ur5, enumC74133Ur6, enumC74133Ur7, enumC74133Ur8, enumC74133Ur9, enumC74133Ur10, enumC74133Ur11, enumC74133Ur12, new EnumC74133Ur(abstractC74143Us2, "MQTT_DEVICE_CREDENTIALS_TIMESTAMP", "/settings/mqtt/id/timestamp", 12)};
    }

    public static EnumC74133Ur valueOf(String str) {
        return (EnumC74133Ur) Enum.valueOf(EnumC74133Ur.class, str);
    }

    public static EnumC74133Ur[] values() {
        return (EnumC74133Ur[]) A02.clone();
    }

    public final void A00(Bundle bundle, Object obj) {
        if (obj != null && !this.A00.A00().isInstance(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot cast");
            sb.append(obj.getClass());
            throw new ClassCastException(sb.toString());
        }
        this.A00.A02(bundle, obj, name());
    }

    public final void A01(C91M c91m, Object obj) {
        if (obj != null && !this.A00.A00().isInstance(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot cast");
            sb.append(obj.getClass());
            throw new ClassCastException(sb.toString());
        }
        this.A00.A03(c91m, obj, name());
    }

    public EnumC74133Ur(AbstractC74143Us abstractC74143Us, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = abstractC74143Us;
    }
}
