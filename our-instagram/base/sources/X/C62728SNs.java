package X;

import java.util.Arrays;

/* renamed from: X.SNs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62728SNs {
    public final EnumC61232Rit A00;
    public final SNP A01;
    public final Boolean A02;

    public /* synthetic */ C62728SNs(EnumC61232Rit enumC61232Rit, SNP snp, Boolean bool) {
        this.A00 = enumC61232Rit;
        this.A02 = bool;
        this.A01 = snp;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C62728SNs) {
                C62728SNs c62728SNs = (C62728SNs) obj;
                if (!SSI.A01(this.A00, c62728SNs.A00) || !SSI.A01(this.A02, c62728SNs.A02) || !SSI.A01(this.A01, c62728SNs.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, null, this.A02, null, this.A01});
    }
}
