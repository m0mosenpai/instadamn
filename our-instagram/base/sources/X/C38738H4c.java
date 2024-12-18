package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;

/* renamed from: X.H4c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38738H4c extends C0T6 implements JL3 {
    public final OriginalSoundData A00;
    public final TrackData A01;
    public final TrackMetadata A02;

    @Override // X.JL3
    public final C38738H4c EyB(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38738H4c) {
                C38738H4c c38738H4c = (C38738H4c) obj;
                if (!C14360o3.A0K(this.A02, c38738H4c.A02) || !C14360o3.A0K(this.A00, c38738H4c.A00) || !C14360o3.A0K(this.A01, c38738H4c.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL3
    public final TrackMetadata BTR() {
        return this.A02;
    }

    @Override // X.JL3
    public final /* bridge */ /* synthetic */ OriginalSoundDataIntf BZv() {
        return this.A00;
    }

    @Override // X.JL3
    public final TrackData CA8() {
        return this.A01;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38738H4c(OriginalSoundData originalSoundData, TrackData trackData, TrackMetadata trackMetadata) {
        this.A02 = trackMetadata;
        this.A00 = originalSoundData;
        this.A01 = trackData;
    }

    @Override // X.JL3
    public final JL3 E9e(C1DY c1dy) {
        return this;
    }
}
