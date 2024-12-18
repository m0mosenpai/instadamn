package X;

import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;

/* renamed from: X.Wnk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71088Wnk implements XBP {
    public final /* synthetic */ V0M A00;

    public C71088Wnk(V0M v0m) {
        this.A00 = v0m;
    }

    @Override // X.XBP
    public final void Dcy(float f, float f2, float f3, float f4) {
        V0M v0m = this.A00;
        RangeSeekBar rangeSeekBar = v0m.A08;
        if (rangeSeekBar != null) {
            rangeSeekBar.requestFocus();
        }
        v0m.A01 = (int) f;
        v0m.A00 = (int) f2;
        RangeSeekBar rangeSeekBar2 = v0m.A08;
        if (rangeSeekBar2 != null) {
            XEE xee = v0m.A07;
            if (xee == null) {
                C14360o3.A0F("delegate");
                throw C00O.createAndThrow();
            }
            rangeSeekBar2.A03(xee);
        }
        V0M.A01(v0m);
    }
}
