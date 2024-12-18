package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.os.PowerManager;
import com.facebook.common.build.BuildConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88633xO {
    public static List A09;
    public PowerManager.WakeLock A00;
    public InterfaceC88683xU A01;
    public final int A02;
    public final Context A03;
    public final Bundle A04;
    public final Messenger A05;
    public final C40401u8 A06;
    public final C88623xN A07;
    public final String A08;

    public static C88633xO A00(Context context, Bundle bundle) {
        C88623xN c88623xN;
        Messenger messenger = (Messenger) bundle.getParcelable("_messenger");
        Bundle bundle2 = bundle.getBundle("_extras");
        String string = bundle.getString("_hack_action");
        int i = bundle.getInt("_job_id", -1);
        if (i != -1) {
            Bundle bundle3 = bundle.getBundle("_fallback_config");
            C40401u8 c40401u8 = new C40401u8(bundle.getBundle("_upload_job_config"));
            if (bundle3 != null) {
                c88623xN = new C88623xN(bundle3.getLong("min_delay_ms", -1L), bundle3.getLong("max_delay_ms", -1L), bundle3.getString("action"));
            } else {
                c88623xN = null;
            }
            return new C88633xO(context, bundle2, messenger, c40401u8, c88623xN, string, i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("_job_id is ");
        sb.append(bundle.get("_job_id"));
        throw new Exception(sb.toString());
    }

    public static List A01() {
        List list;
        synchronized (C88633xO.class) {
            list = A09;
            if (list == null) {
                list = Collections.synchronizedList(new ArrayList(1));
                A09 = list;
            }
        }
        return list;
    }

    public final Bundle A02() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("_messenger", this.A05);
        bundle.putBundle("_extras", this.A04);
        bundle.putString("_hack_action", this.A08);
        C40401u8 c40401u8 = this.A06;
        Bundle bundle2 = new Bundle();
        bundle2.putString("uploader_class", c40401u8.A0B);
        bundle2.putString("flexible_sampling_updater", c40401u8.A08);
        bundle2.putString("privacy_policy", c40401u8.A07);
        bundle2.putString("thread_handler_factory", c40401u8.A09);
        bundle2.putString("upload_job_instrumentation", c40401u8.A0A);
        bundle2.putString("priority_dir", c40401u8.A02.getAbsolutePath());
        bundle2.putInt("network_priority", c40401u8.A03.intValue());
        bundle2.putString("marauder_tier", c40401u8.A06);
        bundle2.putInt("multi_batch_payload_size", c40401u8.A01);
        bundle2.putInt("non_sticky_handling", c40401u8.A0C ? 1 : 0);
        bundle2.putInt("use_fifo_uploads", c40401u8.A0D ? 1 : 0);
        bundle2.putString("batch_payload_iterator_factory", c40401u8.A04);
        bundle2.putString("acs_provider", c40401u8.A00);
        bundle2.putString("ffdb_provider", c40401u8.A05);
        bundle.putBundle("_upload_job_config", new Bundle(bundle2));
        bundle.putInt("_job_id", this.A02);
        C88623xN c88623xN = this.A07;
        if (c88623xN != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("min_delay_ms", c88623xN.A01);
            bundle3.putLong("max_delay_ms", c88623xN.A00);
            bundle3.putString("action", c88623xN.A02);
            bundle3.putInt("__VERSION_CODE", BuildConstants.A01());
            bundle.putBundle("_fallback_config", bundle3);
        }
        return bundle;
    }

    public C88633xO(Context context, Bundle bundle, Messenger messenger, C40401u8 c40401u8, C88623xN c88623xN, String str, int i) {
        this.A05 = messenger;
        this.A04 = bundle;
        this.A08 = str;
        this.A06 = c40401u8;
        this.A02 = i;
        this.A03 = context;
        this.A07 = c88623xN;
    }
}
