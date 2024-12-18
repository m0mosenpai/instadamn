package com.instagram.trust.noncemanager;

import X.AbstractC68612VXn;
import X.AnonymousClass001;
import X.C00O;
import X.C0T6;
import X.C106794re;
import X.C14360o3;
import X.C3R9;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class VettedDeviceNonces extends C0T6 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;

    /* loaded from: classes2.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C106794re.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VettedDeviceNonces) {
                VettedDeviceNonces vettedDeviceNonces = (VettedDeviceNonces) obj;
                if (!C14360o3.A0K(this.A00, vettedDeviceNonces.A00) || !C14360o3.A0K(this.A01, vettedDeviceNonces.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return AnonymousClass001.A0v("VettedDeviceNonces(vetted_device_first_factor_nonce=", this.A00, ", vetted_device_second_factor_nonce=", this.A01, ')');
    }

    public VettedDeviceNonces(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public /* synthetic */ VettedDeviceNonces(String str, String str2, int i) {
        if (3 != (i & 3)) {
            AbstractC68612VXn.A00(C106794re.A01, i, 3);
            throw C00O.createAndThrow();
        }
        this.A00 = str;
        this.A01 = str2;
    }
}
