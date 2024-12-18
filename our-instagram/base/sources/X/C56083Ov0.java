package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Ov0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56083Ov0 implements InterfaceC66482zP {
    public final UpcomingEvent A00;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_upcoming_event";
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C56083Ov0 c56083Ov0 = (C56083Ov0) obj;
        C14360o3.A0B(c56083Ov0, 0);
        return AbstractC167007dF.A1M(C14360o3.A0K(this.A00, c56083Ov0.A00) ? 1 : 0);
    }

    public C56083Ov0(UpcomingEvent upcomingEvent) {
        this.A00 = upcomingEvent;
    }
}
