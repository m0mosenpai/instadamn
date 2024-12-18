package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.97y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2054997y {
    public static final AnonymousClass983 A00(Bundle bundle, AbstractC59962oe abstractC59962oe, UserSession userSession, boolean z) {
        Integer valueOf;
        C14360o3.A0B(userSession, 1);
        AbstractC09800fd.A01("DirectThreadToggleController.create", 1598024782);
        try {
            Capabilities capabilities = (Capabilities) bundle.getParcelable("DirectFragment.DIRECT_FRAGMENT_THREAD_CAPABILITIES");
            if (capabilities != null) {
                int i = bundle.getInt("DirectFragment.DIRECT_FRAGMENT_THREAD_POSITION", -1);
                if (i == -1) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(i);
                }
                C226418s A01 = C226218q.A01(AbstractC12960li.A00);
                C2055097z c2055097z = new C2055097z(A01);
                A01.A0S(c2055097z);
                AnonymousClass983 anonymousClass983 = new AnonymousClass983(bundle, abstractC59962oe, abstractC59962oe, userSession, abstractC59962oe, capabilities, new AnonymousClass982(abstractC59962oe, userSession, capabilities, valueOf, z), c2055097z, new AnonymousClass981(abstractC59962oe, new C19270xB("direct_thread_toggle"), userSession), z);
                AbstractC09800fd.A00(683103509);
                return anonymousClass983;
            }
            String string = bundle.getString("DirectFragment.ENTRY_POINT", "not_in_arguments");
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(", ");
            }
            sb.append("]");
            String format = String.format(Locale.US, "Starting thread with no capabilities.  DeepLinkingEntryPoint: %s, Found %d keys: %s.", Arrays.copyOf(new Object[]{string, Integer.valueOf(bundle.size()), sb.toString()}, 3));
            C14360o3.A07(format);
            throw new IllegalStateException(format);
        } catch (Throwable th) {
            AbstractC09800fd.A00(2020206641);
            throw th;
        }
    }
}
