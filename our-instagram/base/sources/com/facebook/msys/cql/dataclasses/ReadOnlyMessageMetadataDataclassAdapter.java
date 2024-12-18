package com.facebook.msys.cql.dataclasses;

import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC907342m;
import X.C46565Kj4;
import X.LA0;
import X.MS0;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ReadOnlyMessageMetadataDataclassAdapter extends LA0 {
    public static final C46565Kj4 Companion = new Object();
    public static final ReadOnlyMessageMetadataDataclassAdapter INSTANCE = new LA0();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.42m, X.MS0] */
    @Override // X.LA0
    public MS0 toAdaptedObject(String str) {
        if (str != null) {
            return new AbstractC907342m(new JSONObject(str));
        }
        throw AbstractC166987dD.A15("Trying to create ReadOnlyMessageMetadataDataclass from null string");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.42m, X.MS0] */
    @Override // X.LA0
    public MS0 toNullableAdaptedObject(String str) {
        if (str != null) {
            AbstractC09800fd.A01("ReadOnlyMessageMetadataDataclassAdapter.toNullableAdaptedObject.Deserialize", 912460440);
            try {
                ?? abstractC907342m = new AbstractC907342m(new JSONObject(str));
                AbstractC09800fd.A00(-1169828240);
                return abstractC907342m;
            } catch (Throwable th) {
                AbstractC09800fd.A00(-698625127);
                throw th;
            }
        }
        return null;
    }

    public String toNullableRawObject(MS0 ms0) {
        if (ms0 != null) {
            return toRawObject(ms0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toRawObject(MS0 ms0) {
        String obj;
        if (ms0 != 0 && (obj = ((AbstractC907342m) ms0).A00.toString()) != null) {
            return obj;
        }
        throw AbstractC166987dD.A15("Trying to get string from null ReadOnlyMessageMetadataDataclass");
    }
}
