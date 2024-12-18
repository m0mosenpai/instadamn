package X;

import android.os.Build;
import android.text.StaticLayout;

/* renamed from: X.5hO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122885hO implements C5hP {
    @Override // X.C5hP
    public final boolean CUH(StaticLayout staticLayout, boolean z) {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC122905hR.A01(staticLayout);
        }
        return true;
    }

    @Override // X.C5hP
    public final StaticLayout AL2(C122895hQ c122895hQ) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(c122895hQ.A0D, 0, c122895hQ.A02, c122895hQ.A0B, c122895hQ.A08);
        obtain.setTextDirection(c122895hQ.A0A);
        obtain.setAlignment(c122895hQ.A09);
        obtain.setMaxLines(c122895hQ.A07);
        obtain.setEllipsize(c122895hQ.A0C);
        obtain.setEllipsizedWidth(c122895hQ.A01);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(false);
        obtain.setBreakStrategy(c122895hQ.A00);
        obtain.setHyphenationFrequency(c122895hQ.A03);
        obtain.setIndents(null, null);
        obtain.setJustificationMode(c122895hQ.A04);
        obtain.setUseLineSpacingFromFallbacks(true);
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC122905hR.A00(obtain, c122895hQ.A05, c122895hQ.A06);
        }
        return obtain.build();
    }
}
