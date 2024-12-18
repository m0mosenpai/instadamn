package com.facebook.msys.cql.dataclasses;

import X.AbstractC09800fd;
import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC907342m;
import X.C61794Rto;
import X.InterfaceC65640Tq4;
import X.LA0;

/* loaded from: classes10.dex */
public final class AIBotProfileMetadataDataclassAdapter extends LA0 {
    public static final C61794Rto Companion = new Object();
    public static final AIBotProfileMetadataDataclassAdapter INSTANCE = new LA0();

    /* JADX WARN: Type inference failed for: r0v2, types: [X.42m, X.Tq4] */
    @Override // X.LA0
    public InterfaceC65640Tq4 toAdaptedObject(String str) {
        if (str != null) {
            return new AbstractC907342m(AbstractC58318PtA.A17(str));
        }
        throw AbstractC166987dD.A15("Trying to create AIBotProfileMetadataDataclass from null string");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.42m, X.Tq4] */
    @Override // X.LA0
    public InterfaceC65640Tq4 toNullableAdaptedObject(String str) {
        if (str != null) {
            AbstractC09800fd.A01("AIBotProfileMetadataDataclassImpl.toNullableAdaptedObject.Deserialize", -1988403300);
            try {
                ?? abstractC907342m = new AbstractC907342m(AbstractC58318PtA.A17(str));
                AbstractC09800fd.A00(609547912);
                return abstractC907342m;
            } catch (Throwable th) {
                AbstractC09800fd.A00(-1328794345);
                throw th;
            }
        }
        return null;
    }

    public String toNullableRawObject(InterfaceC65640Tq4 interfaceC65640Tq4) {
        if (interfaceC65640Tq4 != null) {
            return toRawObject(interfaceC65640Tq4);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toRawObject(InterfaceC65640Tq4 interfaceC65640Tq4) {
        String obj;
        if (interfaceC65640Tq4 != 0 && (obj = ((AbstractC907342m) interfaceC65640Tq4).A00.toString()) != null) {
            return obj;
        }
        throw AbstractC166987dD.A15("Trying to get string from null AIBotProfileMetadataDataclass");
    }
}
