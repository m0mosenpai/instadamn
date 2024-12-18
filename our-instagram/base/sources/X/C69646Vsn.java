package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.user.model.User;

/* renamed from: X.Vsn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69646Vsn {
    public UP8 A00;
    public OriginalSoundData A01;
    public UPT A02;
    public C99534dT A03;
    public TrackDataImpl A04;
    public TrackMetadataImpl A05;
    public User A06;
    public Long A07;

    public final JIN A00() {
        JIN jin;
        OriginalSoundData originalSoundData = this.A01;
        if (originalSoundData != null) {
            jin = new C42733IvT(originalSoundData);
        } else {
            TrackDataImpl trackDataImpl = this.A04;
            if (trackDataImpl != null) {
                C37964Gn6 c37964Gn6 = new C37964Gn6(trackDataImpl);
                c37964Gn6.A00 = this.A05;
                jin = c37964Gn6;
            } else {
                return null;
            }
        }
        return jin;
    }
}
