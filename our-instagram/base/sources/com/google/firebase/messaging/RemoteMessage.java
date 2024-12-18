package com.google.firebase.messaging;

import X.AbstractC128825rw;
import X.AbstractC58319PtB;
import X.C20030yX;
import X.C63469Sl9;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C63469Sl9(19);
    public Bundle A00;
    public Map A01;

    public final int A00() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.original_priority");
        if (string == null) {
            string = bundle.getString("google.priority");
        }
        if ("high".equals(string)) {
            return 1;
        }
        if (!"normal".equals(string)) {
            return 0;
        }
        return 2;
    }

    public final int A01() {
        Bundle bundle = this.A00;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if (!RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(bundle.getString("google.priority_reduced"))) {
                string = bundle.getString("google.priority");
            } else {
                return 2;
            }
        }
        if ("high".equals(string)) {
            return 1;
        }
        if (!"normal".equals(string)) {
            return 0;
        }
        return 2;
    }

    public final Map A02() {
        Map map = this.A01;
        Map map2 = map;
        if (map == null) {
            Bundle bundle = this.A00;
            C20030yX A0A = AbstractC58319PtB.A0A();
            Iterator A14 = AbstractC58319PtB.A14(bundle);
            while (A14.hasNext()) {
                String str = (String) A14.next();
                Object obj = bundle.get(str);
                if ((obj instanceof String) && !str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                    A0A.put(str, obj);
                }
            }
            this.A01 = A0A;
            map2 = A0A;
        }
        return map2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        AbstractC128825rw.A02(this.A00, parcel, 2);
        AbstractC128825rw.A06(parcel, A04);
    }
}
