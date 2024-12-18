package X;

import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.OvM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56102OvM implements InterfaceC66482zP {
    public final Venue A00;
    public final List A01;
    public final boolean A02;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_location";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56102OvM c56102OvM = (C56102OvM) obj;
        C14360o3.A0B(c56102OvM, 0);
        if (C14360o3.A0K(this.A00, c56102OvM.A00) && C14360o3.A0K(this.A01, c56102OvM.A01)) {
            return true;
        }
        return false;
    }

    public C56102OvM(Venue venue, List list, boolean z) {
        this.A00 = venue;
        this.A01 = list;
        this.A02 = z;
    }
}
