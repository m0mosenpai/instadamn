package com.facebook.msys.cql.dataclasses;

import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC907342m;
import X.C46566Kj5;
import X.LA0;
import X.MS1;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class XmaDataclassAdapter extends LA0 {
    public static final C46566Kj5 Companion = new Object();
    public static final XmaDataclassAdapter INSTANCE = new LA0();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.42m, X.MS1] */
    @Override // X.LA0
    public MS1 toAdaptedObject(String str) {
        if (str != null) {
            return new AbstractC907342m(new JSONObject(str));
        }
        throw AbstractC166987dD.A15("Trying to create XmaDataclass from null string");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.42m, X.MS1] */
    @Override // X.LA0
    public MS1 toNullableAdaptedObject(String str) {
        if (str != null) {
            AbstractC09800fd.A01("XmaDataclassImpl.toNullableAdaptedObject.Deserialize", 324103212);
            try {
                ?? abstractC907342m = new AbstractC907342m(new JSONObject(str));
                AbstractC09800fd.A00(462920064);
                return abstractC907342m;
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1418394067);
                throw th;
            }
        }
        return null;
    }

    public String toNullableRawObject(MS1 ms1) {
        if (ms1 != null) {
            return toRawObject(ms1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toRawObject(MS1 ms1) {
        String obj;
        if (ms1 != 0 && (obj = ((AbstractC907342m) ms1).A00.toString()) != null) {
            return obj;
        }
        throw AbstractC166987dD.A15("Trying to get string from null XmaDataclass");
    }
}
