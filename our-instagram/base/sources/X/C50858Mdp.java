package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsAudioMixEditorViewModel$1;

/* renamed from: X.Mdp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50858Mdp extends C193578hc {
    public final UserSession A00;
    public final C87D A01;
    public final InterfaceC19390xP A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50858Mdp(Application application, UserSession userSession, ClipsAudioStore clipsAudioStore, C84G c84g, C87D c87d) {
        super(application);
        InterfaceC19390xP A00;
        AbstractC167007dF.A1E(clipsAudioStore, 2, c84g);
        C14360o3.A0B(c87d, 4);
        C14360o3.A0B(userSession, 5);
        this.A01 = c87d;
        this.A00 = userSession;
        C0UO c0uo = clipsAudioStore.A0n;
        c87d.A0I(MSY.A00(c0uo));
        c87d.A0F(MSY.A00(clipsAudioStore.A0W));
        C0UO c0uo2 = clipsAudioStore.A0g;
        c87d.A0G(MSY.A00(c0uo2));
        C0UO c0uo3 = clipsAudioStore.A0i;
        c87d.A0H(MSY.A00(c0uo3));
        C0UO c0uo4 = clipsAudioStore.A0k;
        c87d.A01.A06(MSY.A00(c0uo4));
        C0UO c0uo5 = clipsAudioStore.A0l;
        C43817JZf c43817JZf = new C43817JZf(c0uo5, 6);
        C0UO c0uo6 = clipsAudioStore.A0f;
        C43817JZf c43817JZf2 = new C43817JZf(c0uo6, 7);
        C0UO c0uo7 = clipsAudioStore.A0h;
        C43817JZf c43817JZf3 = new C43817JZf(c0uo7, 8);
        C43817JZf c43817JZf4 = new C43817JZf(new AnonymousClass058(new C57171PZp(this, null, 7)), 9);
        C15150pV A03 = C10Q.A03(new C57177Pa2(application, null, 2), c0uo5, c0uo);
        C007802s A02 = AnonymousClass111.A02(new MU8(this, (InterfaceC23621Ds) null, 13), clipsAudioStore.A0V);
        PVJ pvj = new PVJ(application, this, c84g.A03, 3);
        PVJ pvj2 = new PVJ(application, this, c0uo4, 4);
        C15150pV A032 = C10Q.A03(new C57177Pa2(application, null, 0), c0uo6, c0uo2);
        C15150pV A033 = C10Q.A03(new C57177Pa2(application, null, 1), c0uo7, c0uo3);
        if (C1LE.A0F(userSession) && C18U.A06(C06090Tz.A05, userSession, 36330329493029693L)) {
            A00 = new PVJ(application, this, clipsAudioStore.A0b, 5);
        } else {
            A00 = C10E.A00(null);
        }
        C15200pa A01 = C10Q.A01(C57209Pat.A00, c43817JZf, c43817JZf2, c43817JZf3, c43817JZf4);
        C15150pV A16 = AbstractC43593JPy.A16(pvj2, pvj, 12);
        ClipsAudioMixEditorViewModel$1 clipsAudioMixEditorViewModel$1 = new ClipsAudioMixEditorViewModel$1(null);
        C15230pd A002 = C10Q.A00(new C50632MWt(null, clipsAudioMixEditorViewModel$1, 1), C10Q.A00(C57203Pan.A00, A16, A03, A02), C10Q.A00(C57204Pao.A00, A032, A033, A01), A00);
        this.A02 = AbstractC208910l.A01(new C51666Mrx(EnumC46148Kbm.A04, C16930sl.A00, false, false, false), AbstractC141776au.A00(this), A002, C10I.A01);
    }
}
