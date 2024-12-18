package X;

import android.content.Context;

/* renamed from: X.NLg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52513NLg extends V5W {
    public final boolean A00;

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C52513NLg c52513NLg;
        V5W v5w = (V5W) obj;
        if (v5w instanceof C52513NLg) {
            c52513NLg = (C52513NLg) v5w;
        } else {
            c52513NLg = null;
        }
        if (c52513NLg == null || this.A00 != c52513NLg.A00) {
            return false;
        }
        return true;
    }

    public C52513NLg(boolean z) {
        this.A00 = z;
    }

    @Override // X.V5W
    public final int A00(Context context) {
        return AbstractC13880nE.A09(context) - 286;
    }
}
