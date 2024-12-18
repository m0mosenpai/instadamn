package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.2Ls, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48742Ls implements InterfaceC48752Lt {
    @Override // X.InterfaceC48752Lt
    public final void Da1(InterfaceC37481ol interfaceC37481ol) {
        String str;
        interfaceC37481ol.ATG("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        Object[] objArr = new Object[0];
        C37471ok c37471ok = (C37471ok) interfaceC37481ol;
        int i = 0;
        if (contentValues.size() != 0) {
            int size = contentValues.size();
            Object[] objArr2 = new Object[size];
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE ");
            sb.append(C37471ok.A01[3]);
            sb.append("WorkSpec");
            sb.append(" SET ");
            for (String str2 : contentValues.keySet()) {
                if (i > 0) {
                    str = InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1;
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(str2);
                objArr2[i] = contentValues.get(str2);
                sb.append("=?");
                i++;
            }
            for (int i2 = size; i2 < size; i2++) {
                objArr2[i2] = objArr[i2 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb.append(" WHERE ");
                sb.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            String obj = sb.toString();
            C14360o3.A07(obj);
            C37551os AIj = c37471ok.AIj(obj);
            C37491om.A02.A00(AIj, objArr2);
            AIj.ATb();
            return;
        }
        throw new IllegalArgumentException("Empty values");
    }
}
