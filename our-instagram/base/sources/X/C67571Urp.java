package X;

/* renamed from: X.Urp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67571Urp extends C2JS implements XJu {
    @Override // X.XJu
    public final boolean Ako() {
        return getCoercedBooleanField(0, "can_see_fxim");
    }

    @Override // X.XJu
    public final boolean Akq() {
        return getCoercedBooleanField(1, "can_see_native_reminders");
    }

    @Override // X.XJu
    public final XHY BFF() {
        return (XHY) getOptionalTreeField(5, "identities", C67569Urn.class, 612826622);
    }

    @Override // X.XJu
    public final XIQ Bhr() {
        return (XIQ) A04(C60506R1n.class, "fxim_reminder_info(field:\"PROFILE_PHOTO\")", 1272976757);
    }

    @Override // X.XJu
    public final XK0 Bqm() {
        return (XK0) getOptionalTreeField(4, "screen_resources", C67570Uro.class, 201217818);
    }

    @Override // X.XJu
    public final InterfaceC37282Gbj CEA() {
        return (InterfaceC37282Gbj) getOptionalTreeField(3, "fxim_reminder_info(field:\"USERNAME\")", C60507R1o.class, -280533698);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C95124Py c95124Py = C95124Py.A00;
        return new C4OU(new C4OM[]{new C4OW(c95124Py, "can_see_fxim"), new C4OW(c95124Py, "can_see_native_reminders"), new C4OK(C60506R1n.class, "fxim_reminder_info(field:\"PROFILE_PHOTO\")", 1272976757), new C4OK(C60507R1o.class, "fxim_reminder_info(field:\"USERNAME\")", -280533698), new C4OK(C67570Uro.class, "screen_resources", 201217818), new C4OK(C67569Urn.class, "identities", 612826622)});
    }

    public C67571Urp(int i) {
        super(i);
    }

    public C67571Urp() {
        super(-1287955954);
    }
}
