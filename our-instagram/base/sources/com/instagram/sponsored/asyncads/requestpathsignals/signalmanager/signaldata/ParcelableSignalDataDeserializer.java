package com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata;

import X.AbstractC102504jj;
import X.AnonymousClass469;
import X.C16L;
import com.facebook.common.json.FbJsonDeserializer;

/* loaded from: classes2.dex */
public class ParcelableSignalDataDeserializer extends FbJsonDeserializer {
    public ParcelableSignalDataDeserializer() {
        this.A00 = ParcelableSignalData.class;
    }

    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        return AbstractC102504jj.parseFromJson(c16l);
    }
}
