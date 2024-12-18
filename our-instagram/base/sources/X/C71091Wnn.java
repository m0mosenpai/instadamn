package X;

import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;

/* renamed from: X.Wnn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71091Wnn implements XEE {
    public final /* synthetic */ V0M A00;

    public C71091Wnn(V0M v0m) {
        this.A00 = v0m;
    }

    @Override // X.XEE
    public final IgTextView BQ7() {
        IgTextView igTextView = this.A00.A03;
        if (igTextView != null) {
            return igTextView;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XEE
    public final IgTextView BU0() {
        IgTextView igTextView = this.A00.A04;
        if (igTextView != null) {
            return igTextView;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XEE
    public final float Bk0() {
        return this.A00.A00;
    }

    @Override // X.XEE
    public final RangeSeekBar Bk2() {
        RangeSeekBar rangeSeekBar = this.A00.A08;
        if (rangeSeekBar != null) {
            return rangeSeekBar;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.XEE
    public final float Bk3() {
        return this.A00.A01;
    }
}
