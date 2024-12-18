package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import instagram.features.clips.edit.ClipsEditMetadataController;

/* renamed from: X.Ahf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23886Ahf implements C8BK, AnonymousClass844 {
    public final int A00;
    public final Object A01;

    public C23886Ahf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AnonymousClass844
    public final String BVY() {
        if (this.A00 != 0) {
            return ((ClipsEditMetadataController) this.A01).A14;
        }
        C8JU c8ju = ((C8YY) this.A01).A0Z;
        C14360o3.A0C(c8ju, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.music.ClipsTrackSelector.Delegate");
        return ((AnonymousClass844) c8ju).BVY();
    }

    @Override // X.C8BK
    public final void Dub(AudioOverlayTrack audioOverlayTrack, boolean z) {
        if (this.A00 != 0) {
            C54839OLy c54839OLy = ((ClipsEditMetadataController) this.A01).A0B;
            if (c54839OLy != null) {
                c54839OLy.A02(null);
                return;
            }
            return;
        }
        C193838i4 c193838i4 = ((C8YY) this.A01).A02;
        if (c193838i4 == null) {
            return;
        }
        c193838i4.A0n.A03();
    }

    @Override // X.C8BK
    public final void Due(AudioOverlayTrack audioOverlayTrack) {
        int i = this.A00;
        C14360o3.A0B(audioOverlayTrack, 0);
        if (i != 0) {
            C54839OLy c54839OLy = ((ClipsEditMetadataController) this.A01).A0B;
            if (c54839OLy != null) {
                c54839OLy.A02(audioOverlayTrack);
                return;
            }
            return;
        }
        C8YY c8yy = (C8YY) this.A01;
        C8JU c8ju = c8yy.A0Z;
        C14360o3.A0C(c8ju, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.sundial.music.ClipsTrackSelector.Delegate");
        ((C8BK) c8ju).Due(audioOverlayTrack);
        C193838i4 c193838i4 = c8yy.A02;
        if (c193838i4 == null) {
            return;
        }
        c193838i4.A0n.A03();
    }

    @Override // X.C8BK
    public final /* synthetic */ void DUX(boolean z) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void DuZ(AudioOverlayTrack audioOverlayTrack) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Duc(AudioOverlayTrack audioOverlayTrack, AudioOverlayTrack audioOverlayTrack2) {
    }

    @Override // X.C8BK
    public final /* synthetic */ void Dui(AudioOverlayTrack audioOverlayTrack, Integer num) {
        AbstractC226899zl.A00(this, audioOverlayTrack);
    }
}
