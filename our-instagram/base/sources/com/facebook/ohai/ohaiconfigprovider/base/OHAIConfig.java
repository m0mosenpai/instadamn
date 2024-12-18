package com.facebook.ohai.ohaiconfigprovider.base;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C71735X0a;
import com.facebook.common.dextricks.StringTreeSet;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class OHAIConfig extends C0T6 {
    public static final Companion Companion = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final String A06;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71735X0a.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OHAIConfig) {
                OHAIConfig oHAIConfig = (OHAIConfig) obj;
                if (this.A03 != oHAIConfig.A03 || !C14360o3.A0K(this.A06, oHAIConfig.A06) || this.A02 != oHAIConfig.A02 || this.A01 != oHAIConfig.A01 || this.A00 != oHAIConfig.A00 || this.A04 != oHAIConfig.A04 || this.A05 != oHAIConfig.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ OHAIConfig(String str, int i, int i2, int i3, int i4, int i5, long j, long j2) {
        if (127 != (i & StringTreeSet.MAX_SYMBOL_COUNT)) {
            AbstractC68612VXn.A00(C71735X0a.A01, i, StringTreeSet.MAX_SYMBOL_COUNT);
            throw C00O.createAndThrow();
        }
        this.A03 = i2;
        this.A06 = str;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A04 = j;
        this.A05 = j2;
    }

    public final int hashCode() {
        int A07 = AbstractC167007dF.A07(this.A04, (((((AbstractC166997dE.A0K(this.A06, this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31);
        long j = this.A05;
        return A07 + ((int) (j ^ (j >>> 32)));
    }

    public OHAIConfig(String str, int i, int i2, int i3, int i4, long j, long j2) {
        this.A03 = i;
        this.A06 = str;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A04 = j;
        this.A05 = j2;
    }
}
