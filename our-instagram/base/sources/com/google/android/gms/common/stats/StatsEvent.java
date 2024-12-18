package com.google.android.gms.common.stats;

import X.AbstractC166987dD;
import X.MSZ;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

@Deprecated
/* loaded from: classes10.dex */
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    public final String toString() {
        String join;
        WakeLockEvent wakeLockEvent = (WakeLockEvent) this;
        long j = wakeLockEvent.A05;
        int i = wakeLockEvent.A02;
        List list = wakeLockEvent.A0A;
        String str = "";
        if (list == null) {
            join = "";
        } else {
            join = TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, list);
        }
        int i2 = wakeLockEvent.A04;
        String str2 = wakeLockEvent.A07;
        String str3 = wakeLockEvent.A09;
        float f = wakeLockEvent.A00;
        String str4 = wakeLockEvent.A08;
        int i3 = wakeLockEvent.A03;
        String str5 = wakeLockEvent.A06;
        boolean z = wakeLockEvent.A0B;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("\t");
        A1C.append(str5);
        A1C.append("\t");
        A1C.append(i3);
        A1C.append("\t");
        A1C.append(join);
        A1C.append("\t");
        A1C.append(i2);
        A1C.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        A1C.append(str2);
        A1C.append("\t");
        if (str3 == null) {
            str3 = "";
        }
        A1C.append(str3);
        A1C.append("\t");
        A1C.append(f);
        A1C.append("\t");
        if (str4 != null) {
            str = str4;
        }
        A1C.append(str);
        A1C.append("\t");
        A1C.append(z);
        String obj = A1C.toString();
        StringBuilder A1C2 = AbstractC166987dD.A1C();
        A1C2.append(j);
        A1C2.append("\t");
        A1C2.append(i);
        return MSZ.A0u("\t-1", obj, A1C2);
    }
}
