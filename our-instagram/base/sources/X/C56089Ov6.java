package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Ov6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56089Ov6 implements InterfaceC66482zP {
    public final UpcomingEvent A00;

    public C56089Ov6(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 1);
        this.A00 = upcomingEvent;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.getId();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56089Ov6 c56089Ov6 = (C56089Ov6) obj;
        String id = this.A00.getId();
        if (c56089Ov6 != null) {
            str = c56089Ov6.A00.getId();
        } else {
            str = null;
        }
        return C14360o3.A0K(id, str);
    }
}
