package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;

/* renamed from: X.Mft, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50986Mft extends AbstractC52922bZ {
    public final OGt A00;
    public final UserSession A01;
    public final ClipsAudioStore A02;
    public final C87H A03;
    public final C23031Ai A04;
    public final InterfaceC19390xP A05;
    public final C8ED A06;

    public final void A00() {
        if (C18U.A06(C06090Tz.A06, this.A01, 36330329492964156L)) {
            this.A06.AV9(new C23290AUb(this, 3), true);
        }
    }

    public final void A01(float f) {
        ClipsAudioStore clipsAudioStore = this.A02;
        if (clipsAudioStore.A0b.getValue() == null) {
            clipsAudioStore.A07(0.0f);
        }
        this.A03.A0I.A0B(Float.valueOf(C17s.A01(f)));
    }

    public C50986Mft(UserSession userSession, ClipsAudioStore clipsAudioStore, C87H c87h) {
        AbstractC167027dH.A13(userSession, clipsAudioStore, c87h);
        this.A01 = userSession;
        this.A02 = clipsAudioStore;
        this.A03 = c87h;
        this.A05 = new C43817JZf(clipsAudioStore.A0k, 5);
        this.A06 = new C8ED(userSession, AbstractC166987dD.A1J(new C8E5("ctal_ferraris_ns", "model_opt", C16930sl.A00, 12L)));
        this.A04 = AbstractC23021Ah.A00(userSession);
        this.A00 = new OGt(new C54506O6j(userSession, EnumC27091Ti.A0H));
    }
}
