package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;

/* renamed from: X.CrP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29036CrP implements C2YT {
    public final C93F A00;
    public final CharSequence A01;

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        Context context = c2yr.A00.A04;
        int A01 = AbstractC78603fS.A01(j);
        int A00 = AbstractC78603fS.A00(j);
        Pair A012 = C6BL.A01(context, this.A00, this.A01, A01, A00);
        C14360o3.A0A(A012);
        Rect rect = (Rect) A012.first;
        return new C2YU(A012.second, Math.max(rect.width(), C78613fT.A03(j)), Math.max(rect.height(), C78613fT.A02(j)));
    }

    public C29036CrP(C93F c93f, CharSequence charSequence) {
        this.A01 = charSequence;
        this.A00 = c93f;
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
