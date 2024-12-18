package com.facebook.msys.cql.dataclasses;

import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.C61795Rtp;
import X.LA0;
import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadata;
import com.facebook.messaging.dataclasses.threadmetadata.ThreadMetadataSerializer;

/* loaded from: classes10.dex */
public final class ThreadMetadataAdapter extends LA0 {
    public static final C61795Rtp Companion = new Object();
    public static final ThreadMetadataAdapter INSTANCE = new LA0();

    @Override // X.LA0
    public ThreadMetadata toAdaptedObject(String str) {
        if (str != null) {
            AbstractC09800fd.A01("ThreadMetadataAdapter.toAdaptedObject.Deserialize", 896616569);
            try {
                ThreadMetadata fromString = ThreadMetadataSerializer.fromString(str);
                if (fromString != null) {
                    AbstractC09800fd.A00(2073494177);
                    return fromString;
                }
                throw AbstractC166987dD.A15("ThreadMetadata deserialization failed");
            } catch (Throwable th) {
                AbstractC09800fd.A00(1388633988);
                throw th;
            }
        }
        throw AbstractC166987dD.A15("Trying to create ThreadMetadata from null string");
    }

    @Override // X.LA0
    public ThreadMetadata toNullableAdaptedObject(String str) {
        if (str != null) {
            AbstractC09800fd.A01("ThreadMetadataAdapter.toNullableAdaptedObject.Deserialize", -1651333892);
            try {
                ThreadMetadata fromString = ThreadMetadataSerializer.fromString(str);
                AbstractC09800fd.A00(131500484);
                return fromString;
            } catch (Throwable th) {
                AbstractC09800fd.A00(837029235);
                throw th;
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object toNullableRawObject(Object obj) {
        ThreadMetadata threadMetadata = (ThreadMetadata) obj;
        if (threadMetadata != null) {
            return ThreadMetadataSerializer.toString(threadMetadata);
        }
        return null;
    }

    public String toRawObject(ThreadMetadata threadMetadata) {
        String threadMetadataSerializer;
        if (threadMetadata != null && (threadMetadataSerializer = ThreadMetadataSerializer.toString(threadMetadata)) != null) {
            return threadMetadataSerializer;
        }
        throw AbstractC166987dD.A15("Trying to get string from null ThreadMetadata");
    }

    public String toNullableRawObject(ThreadMetadata threadMetadata) {
        if (threadMetadata != null) {
            return ThreadMetadataSerializer.toString(threadMetadata);
        }
        return null;
    }
}
