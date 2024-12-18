package X;

import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.TrackMetadataImpl;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.keyword.Keyword;
import com.instagram.model.mapquery.MapQuery;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class U0v extends AbstractC65924TwV {
    public OriginalSoundData A00;
    public TrackDataImpl A01;
    public TrackMetadataImpl A02;
    public HashtagImpl A03;
    public Keyword A04;
    public MapQuery A05;
    public C69794Vvd A06;
    public User A07;
    public Integer A08;
    public Object A09;
    public String A0A = "";
    public String A0B = "";

    @Override // X.AbstractC65924TwV
    public final boolean equals(Object obj) {
        if (!(obj instanceof U0v) || this.A08 == null) {
            return false;
        }
        U0v u0v = (U0v) obj;
        if (!C14360o3.A0K(this.A0A, u0v.A0A) || this.A08 != u0v.A08) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC65924TwV
    public final int hashCode() {
        int i;
        int hashCode = this.A0A.hashCode() * 31;
        Integer num = this.A08;
        if (num != null) {
            i = AbstractC25230BEn.A0C(num, AbstractC66135U1c.A00(num));
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
