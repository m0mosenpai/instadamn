package X;

import android.content.res.TypedArray;

/* renamed from: X.7ee, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167847ee extends AbstractC84783qS {
    public final void A05(int i) {
        C84793qT c84793qT = this.A00;
        c84793qT.A05 = (i & 16777215) | (c84793qT.A05 & (-16777216));
    }

    public C167847ee() {
        this.A00.A0G = false;
    }

    @Override // X.AbstractC84783qS
    public final /* bridge */ /* synthetic */ AbstractC84783qS A00(TypedArray typedArray) {
        super.A00(typedArray);
        if (typedArray.hasValue(2)) {
            A05(typedArray.getColor(2, this.A00.A05));
        }
        if (typedArray.hasValue(12)) {
            C84793qT c84793qT = this.A00;
            c84793qT.A09 = typedArray.getColor(12, c84793qT.A09);
        }
        return this;
    }
}
