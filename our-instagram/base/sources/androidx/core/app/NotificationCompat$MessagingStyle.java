package androidx.core.app;

import X.AbstractC166987dD;
import X.AbstractC72869Xpo;
import X.Y3W;
import X.Y3n;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes12.dex */
public final class NotificationCompat$MessagingStyle extends AbstractC72869Xpo {
    public Y3n A00;
    public Boolean A01;
    public CharSequence A02;
    public final List A04 = AbstractC166987dD.A1E();
    public final List A03 = AbstractC166987dD.A1E();

    public NotificationCompat$MessagingStyle(Y3n y3n) {
        if (!TextUtils.isEmpty(y3n.A01)) {
            this.A00 = y3n;
            return;
        }
        throw AbstractC166987dD.A12("User's name must not be empty.");
    }

    @Override // X.AbstractC72869Xpo
    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0027. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    @Override // X.AbstractC72869Xpo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A03(android.os.Bundle):void");
    }

    @Override // X.AbstractC72869Xpo
    public final void A04(Bundle bundle) {
        Y3n y3n;
        super.A04(bundle);
        List list = this.A04;
        list.clear();
        if (bundle.containsKey("android.messagingStyleUser")) {
            y3n = Y3n.A00(bundle.getBundle("android.messagingStyleUser"));
        } else {
            y3n = new Y3n(null, bundle.getString("android.selfDisplayName"), null, null, false, false);
        }
        this.A00 = y3n;
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.A02 = charSequence;
        if (charSequence == null) {
            this.A02 = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(Y3W.A00(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.A03.addAll(Y3W.A00(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.A01 = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public NotificationCompat$MessagingStyle() {
    }
}
