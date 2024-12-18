package X;

import android.content.Context;

/* renamed from: X.1Ae, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22991Ae implements C0LR {
    public static boolean A01;
    public final Context A00;

    @Override // X.C0LR
    public final void E4h(C024209q c024209q, C0M6 c0m6) {
        String A00;
        C14360o3.A0B(c024209q, 0);
        if (A01 && (A00 = AbstractC02740Ay.A00(this.A00, "anr_timeout_setting", false)) != null) {
            c024209q.A03(C0LK.A44, A00);
        }
    }

    @Override // X.C0LR
    public final Integer BW4() {
        return C05F.A10;
    }

    @Override // X.C0LR
    public final /* synthetic */ boolean CKv(Integer num) {
        return false;
    }

    public C22991Ae(Context context) {
        this.A00 = context;
    }
}
