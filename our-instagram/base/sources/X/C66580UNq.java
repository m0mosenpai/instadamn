package X;

import org.json.JSONObject;

/* renamed from: X.UNq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66580UNq extends AbstractC907342m implements XJu {
    @Override // X.XJu
    public final boolean Ako() {
        return A06("can_see_fxim");
    }

    @Override // X.XJu
    public final boolean Akq() {
        return A06("can_see_native_reminders");
    }

    @Override // X.XJu
    public final XHY BFF() {
        return (XHY) A00(C66578UNo.class, "identities");
    }

    @Override // X.XJu
    public final XIQ Bhr() {
        return (XIQ) A00(C58908QHs.class, "profile_photo_reminder_info");
    }

    @Override // X.XJu
    public final XK0 Bqm() {
        return (XK0) A00(C66579UNp.class, "screen_resources");
    }

    @Override // X.XJu
    public final InterfaceC37282Gbj CEA() {
        return (InterfaceC37282Gbj) A00(C58909QHt.class, "username_reminder_info");
    }

    public C66580UNq(JSONObject jSONObject) {
        super(jSONObject);
    }
}
