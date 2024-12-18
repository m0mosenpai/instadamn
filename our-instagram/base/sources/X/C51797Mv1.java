package X;

import com.instagram.api.schemas.TrackData;
import java.util.List;

/* renamed from: X.Mv1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51797Mv1 extends C0T6 implements JJH {
    public final int A00;
    public final TrackData A01;
    public final List A02;
    public final List A03;

    @Override // X.JJH
    public final C51797Mv1 Ezi() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51797Mv1) {
                C51797Mv1 c51797Mv1 = (C51797Mv1) obj;
                if (!C14360o3.A0K(this.A03, c51797Mv1.A03) || !C14360o3.A0K(this.A02, c51797Mv1.A02) || !C14360o3.A0K(this.A01, c51797Mv1.A01) || this.A00 != c51797Mv1.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03))) + this.A00;
    }

    public C51797Mv1(TrackData trackData, List list, List list2, int i) {
        AbstractC167027dH.A13(list, list2, trackData);
        this.A03 = list;
        this.A02 = list2;
        this.A01 = trackData;
        this.A00 = i;
    }
}
