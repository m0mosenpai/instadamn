package X;

import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.rangeseekbar.RangeSeekBar;

/* renamed from: X.Wnm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71090Wnm implements XEE {
    public final /* synthetic */ C67869V0a A00;

    public C71090Wnm(C67869V0a c67869V0a) {
        this.A00 = c67869V0a;
    }

    @Override // X.XEE
    public final IgTextView BQ7() {
        IgTextView igTextView = this.A00.A06;
        if (igTextView == null) {
            C14360o3.A0F("ageMaxText");
            throw C00O.createAndThrow();
        }
        return igTextView;
    }

    @Override // X.XEE
    public final IgTextView BU0() {
        IgTextView igTextView = this.A00.A07;
        if (igTextView == null) {
            C14360o3.A0F("ageMinText");
            throw C00O.createAndThrow();
        }
        return igTextView;
    }

    @Override // X.XEE
    public final float Bk0() {
        return this.A00.A00;
    }

    @Override // X.XEE
    public final RangeSeekBar Bk2() {
        RangeSeekBar rangeSeekBar = this.A00.A0B;
        if (rangeSeekBar == null) {
            C14360o3.A0F("ageRangeSeekBar");
            throw C00O.createAndThrow();
        }
        return rangeSeekBar;
    }

    @Override // X.XEE
    public final float Bk3() {
        return this.A00.A01;
    }
}
