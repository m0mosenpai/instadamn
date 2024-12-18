package X;

import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;

/* renamed from: X.Wnj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71087Wnj implements XBP {
    public final /* synthetic */ C67869V0a A00;

    public C71087Wnj(C67869V0a c67869V0a) {
        this.A00 = c67869V0a;
    }

    @Override // X.XBP
    public final void Dcy(float f, float f2, float f3, float f4) {
        C67869V0a c67869V0a = this.A00;
        RangeSeekBar rangeSeekBar = c67869V0a.A0B;
        String str = "ageRangeSeekBar";
        if (rangeSeekBar != null) {
            rangeSeekBar.requestFocus();
            c67869V0a.A01 = (int) f;
            c67869V0a.A00 = (int) f2;
            RangeSeekBar rangeSeekBar2 = c67869V0a.A0B;
            if (rangeSeekBar2 != null) {
                XEE xee = c67869V0a.A0A;
                if (xee == null) {
                    str = "delegate";
                } else {
                    rangeSeekBar2.A03(xee);
                    C67869V0a.A01(c67869V0a);
                    return;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
