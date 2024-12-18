package X;

import androidx.core.widget.NestedScrollView;
import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController;

/* renamed from: X.Old, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55543Old implements InterfaceC71872X8f {
    public final /* synthetic */ ClipsStackedTimelineViewController A00;

    public C55543Old(ClipsStackedTimelineViewController clipsStackedTimelineViewController) {
        this.A00 = clipsStackedTimelineViewController;
    }

    @Override // X.InterfaceC71872X8f
    public final void Dis(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        ClipsStackedTimelineViewController clipsStackedTimelineViewController = this.A00;
        if (clipsStackedTimelineViewController.A03) {
            clipsStackedTimelineViewController.A00 = i2;
        }
    }
}
