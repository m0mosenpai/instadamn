package X;

import com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment;

/* loaded from: classes9.dex */
public final class PTC implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ClipsStackedTimelineFragment A02;
    public final /* synthetic */ C09530e4 A03;

    public PTC(ClipsStackedTimelineFragment clipsStackedTimelineFragment, C09530e4 c09530e4, int i, int i2) {
        this.A02 = clipsStackedTimelineFragment;
        this.A00 = i;
        this.A03 = c09530e4;
        this.A01 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ClipsStackedTimelineFragment clipsStackedTimelineFragment = this.A02;
        C87H c87h = clipsStackedTimelineFragment.A0j;
        if (c87h == null) {
            str = "videoPlaybackViewModel";
        } else {
            c87h.A01();
            ClipsStackedTimelineFragment.A0C(clipsStackedTimelineFragment, this.A00);
            C187358Sd c187358Sd = clipsStackedTimelineFragment.A0d;
            if (c187358Sd == null) {
                str = "clipsTimelineEditorViewModel";
            } else {
                c187358Sd.A0G(new C8T3(this.A01, AbstractC25230BEn.A0F(this.A03)));
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
