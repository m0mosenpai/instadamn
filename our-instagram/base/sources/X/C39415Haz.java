package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Haz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39415Haz extends Hj5 {
    public final NY5 A00;

    public final void A00(C38321qM c38321qM) {
        NY5 ny5 = this.A00;
        C39414Hay c39414Hay = ny5.A00;
        C146076i5 c146076i5 = (C146076i5) ((ILS) ny5).A00.getValue();
        UpcomingEvent upcomingEvent = c39414Hay.A00;
        String id = c38321qM.getId();
        InterfaceC60442pS interfaceC60442pS = c39414Hay.A02;
        c146076i5.A04(upcomingEvent, id, "edit_event", interfaceC60442pS.getModuleName());
        C4M5.A00().A01(null, ((AbstractC41110IIb) c39414Hay).A00, null, c39414Hay.A01, upcomingEvent, interfaceC60442pS.getModuleName(), true);
    }

    public C39415Haz(NY5 ny5) {
        this.A00 = ny5;
    }
}
