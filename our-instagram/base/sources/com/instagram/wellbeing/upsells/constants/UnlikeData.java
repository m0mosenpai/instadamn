package com.instagram.wellbeing.upsells.constants;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25228BEl;
import X.AbstractC25236BEt;
import X.AbstractC68612VXn;
import X.C00O;
import X.C0T6;
import X.C14360o3;
import X.C3R9;
import X.C71745X0k;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes11.dex */
public final class UnlikeData extends C0T6 {
    public static final Companion Companion = new Object();
    public final long A00;
    public final String A01;
    public final String A02;

    /* loaded from: classes11.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return C71745X0k.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UnlikeData) {
                UnlikeData unlikeData = (UnlikeData) obj;
                if (this.A00 != unlikeData.A00 || !C14360o3.A0K(this.A02, unlikeData.A02) || !C14360o3.A0K(this.A01, unlikeData.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC25228BEl.A03(this.A00) * 31) + AbstractC167017dG.A0O(this.A01);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnlikeData(timestamp=");
        sb.append(this.A00);
        sb.append(", mediaId=");
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1398));
        return AbstractC25236BEt.A0Y(this.A01, sb);
    }

    public UnlikeData(long j, String str, String str2) {
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }

    public /* synthetic */ UnlikeData(int i, String str, String str2, long j) {
        if (7 != (i & 7)) {
            AbstractC68612VXn.A00(C71745X0k.A01, i, 7);
            throw C00O.createAndThrow();
        }
        this.A00 = j;
        this.A02 = str;
        this.A01 = str2;
    }
}
