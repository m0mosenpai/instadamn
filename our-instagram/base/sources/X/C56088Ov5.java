package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Ov5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56088Ov5 implements InterfaceC66482zP {
    public final UpcomingEvent A00;

    public C56088Ov5(UpcomingEvent upcomingEvent) {
        C14360o3.A0B(upcomingEvent, 1);
        this.A00 = upcomingEvent;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        String id = this.A00.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C56088Ov5 c56088Ov5 = (C56088Ov5) obj;
        UpcomingEvent upcomingEvent = this.A00;
        String id = upcomingEvent.getId();
        if (id == null) {
            id = "";
        }
        if (c56088Ov5 != null) {
            str = c56088Ov5.A00.getId();
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        if (id.equals(str) && c56088Ov5 != null) {
            if (upcomingEvent.getReminderEnabled() == c56088Ov5.A00.getReminderEnabled()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
