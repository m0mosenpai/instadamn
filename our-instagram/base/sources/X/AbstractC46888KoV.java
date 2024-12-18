package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.notifications.impl.DirectNotificationActionReceiver;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.KoV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46888KoV {
    public static final Intent A00(Context context, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("ig").authority(str).appendQueryParameter("intended_recipient_user_id", str2).appendQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str3).appendQueryParameter("uuid", str4).appendQueryParameter("category", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING).appendQueryParameter("push_id", str5);
        if (str6 != null) {
            appendQueryParameter.appendQueryParameter("message_id", str6);
        }
        if (str7 != null) {
            appendQueryParameter.appendQueryParameter("message_client_context", str7);
        }
        if (str8 != null) {
            appendQueryParameter.appendQueryParameter("experiments_mask", str8);
        }
        if (str9 != null) {
            appendQueryParameter.appendQueryParameter(TraceFieldType.TransportType, str9);
        }
        if (l != null) {
            appendQueryParameter.appendQueryParameter("occamadillo_thread_id", AbstractC43592JPx.A0y(l));
        }
        appendQueryParameter.appendQueryParameter("is_vm_active", String.valueOf(z));
        appendQueryParameter.appendQueryParameter("is_instamadillo", String.valueOf(z2));
        appendQueryParameter.appendQueryParameter("is_e2ee", String.valueOf(z3));
        Intent data = new Intent(context, (Class<?>) DirectNotificationActionReceiver.class).setAction(str).setData(appendQueryParameter.build());
        C14360o3.A07(data);
        return data;
    }
}
