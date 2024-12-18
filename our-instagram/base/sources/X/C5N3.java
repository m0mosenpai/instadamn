package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5N3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5N3 {
    public static final void A01(UserSession userSession, String str, long j, boolean z) {
        try {
            C18920wW A00 = new C12210kP(userSession).A00();
            InterfaceC02590Ai A002 = A00.A00(A00.A00, "mobile_config_sampled_access");
            A002.A9K("internal_sampling_rate", 50000L);
            A002.A7v("is_default_fallback", Boolean.valueOf(z));
            A002.AAP("param_specifier", String.valueOf(j));
            A002.AAP("client_value", str);
            A002.A9K("config_id", Long.valueOf(AbstractC20120yj.A00(j)));
            A002.A9K("param_id", Long.valueOf(C0UM.A00(j)));
            A002.Cht();
        } catch (C0UI e) {
            C0K8.A0M("QuickExperimentManagerFactoryImpl", "Failed to get config key with specifier:%d", e, Long.valueOf(j));
        }
    }

    public static final void A00(InterfaceC10260gi interfaceC10260gi, Object obj, Object obj2, String str, StringBuilder sb, long j) {
        Object valueOf;
        if (!obj2.equals(obj)) {
            sb.append(str);
            sb.append(" ");
        }
        if (obj instanceof Boolean) {
            valueOf = Boolean.valueOf(interfaceC10260gi.AhB(j, true));
        } else if (obj instanceof Double) {
            valueOf = Double.valueOf(interfaceC10260gi.Az3(j, -123.5d));
        } else if (obj instanceof String) {
            valueOf = interfaceC10260gi.C2l(j, "__NVAL__");
            C14360o3.A07(valueOf);
        } else {
            valueOf = Long.valueOf(interfaceC10260gi.BP3(j, -2021L));
        }
        if (!C14360o3.A0K(obj, valueOf)) {
            sb.append(str);
            sb.append("_mc ");
        }
    }
}
