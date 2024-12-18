package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadata;
import com.instagram.api.schemas.TrackMetadataImpl;

/* loaded from: classes7.dex */
public final class HYY extends AbstractC65924TwV {
    public OriginalSoundData A00;
    public TrackDataImpl A01;
    public TrackMetadataImpl A02;
    public JIN A03;

    public HYY(TrackData trackData, TrackMetadata trackMetadata) {
        super(7);
        this.A01 = trackData.F3P();
        this.A02 = trackMetadata.F3Q();
        C37964Gn6 c37964Gn6 = new C37964Gn6(trackData);
        this.A03 = c37964Gn6;
        c37964Gn6.A00 = trackMetadata;
    }

    @Override // X.AbstractC65924TwV
    public final boolean A05(String str) {
        String str2;
        C14360o3.A0B(str, 0);
        JIN jin = this.A03;
        if (jin == null || (str2 = jin.getTitle()) == null) {
            str2 = "";
        }
        return U12.A03(str2, str);
    }

    @Override // X.AbstractC65924TwV
    public final Object A00() {
        Object obj = this.A01;
        if (obj == null && (obj = this.A00) == null) {
            throw AbstractC166997dE.A0g();
        }
        return obj;
    }

    @Override // X.AbstractC65924TwV
    public final String A01() {
        String id;
        JIN jin = this.A03;
        if (jin == null || (id = jin.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // X.AbstractC65924TwV
    public final String A04() {
        return "AUDIO";
    }

    public final JIN A06() {
        JIN jin;
        OriginalSoundData originalSoundData = this.A00;
        if (originalSoundData != null) {
            jin = new C42733IvT(originalSoundData);
        } else {
            TrackDataImpl trackDataImpl = this.A01;
            if (trackDataImpl != null) {
                C37964Gn6 c37964Gn6 = new C37964Gn6(trackDataImpl);
                c37964Gn6.A00 = this.A02;
                jin = c37964Gn6;
            } else {
                return null;
            }
        }
        return jin;
    }

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        String str;
        if (obj instanceof HYY) {
            JIN jin = this.A03;
            String str2 = null;
            if (jin != null) {
                str = jin.getId();
            } else {
                str = null;
            }
            JIN jin2 = ((HYY) obj).A03;
            if (jin2 != null) {
                str2 = jin2.getId();
            }
            if (C14360o3.A0K(str, str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        String id;
        JIN jin = this.A03;
        if (jin != null && (id = jin.getId()) != null) {
            return id.hashCode();
        }
        return 0;
    }

    @Override // X.AbstractC65924TwV
    public final String A02() {
        String title;
        JIN A06 = A06();
        if (A06 == null || (title = A06.getTitle()) == null) {
            return "";
        }
        return title;
    }

    @Override // X.AbstractC65924TwV
    public final String A03() {
        return A01();
    }

    public HYY() {
    }
}
