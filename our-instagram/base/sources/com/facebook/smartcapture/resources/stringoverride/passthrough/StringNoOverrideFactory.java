package com.facebook.smartcapture.resources.stringoverride.passthrough;

import X.AbstractC61600RqP;
import X.C63472SlD;
import X.C64164T1s;
import X.InterfaceC65373Tj5;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;

/* loaded from: classes10.dex */
public final class StringNoOverrideFactory extends AbstractC61600RqP implements StringOverrideFactory {
    public static final Parcelable.Creator CREATOR = new C63472SlD(StringNoOverrideFactory.class, 0);

    @Override // com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory
    public final InterfaceC65373Tj5 ALD() {
        return new C64164T1s();
    }
}
