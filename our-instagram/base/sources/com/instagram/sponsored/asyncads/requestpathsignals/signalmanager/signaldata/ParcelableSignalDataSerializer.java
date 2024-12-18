package com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata;

import X.AbstractC102504jj;
import X.AbstractC913345m;
import X.AnonymousClass182;
import X.C121555ex;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: classes12.dex */
public class ParcelableSignalDataSerializer extends JsonSerializer {
    static {
        C121555ex.A08.putIfAbsent(ParcelableSignalData.class, new Object());
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final /* bridge */ /* synthetic */ void A0A(AnonymousClass182 anonymousClass182, AbstractC913345m abstractC913345m, Object obj) {
        AbstractC102504jj.A00(anonymousClass182, (ParcelableSignalData) obj);
    }
}
