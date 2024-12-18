package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Ac, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158667Ac implements C7Q8 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C7Q8 A02;

    @Override // X.C7Q8
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final boolean DBb(C129535tI c129535tI, C158697Af c158697Af) {
        C14360o3.A0B(c129535tI, 0);
        C14360o3.A0B(c158697Af, 1);
        if (c129535tI.A01 != null) {
            UserSession userSession = this.A01;
            AbstractC43821JZj.A00(this.A00, userSession, null, AbstractC43591JPw.A00(1317), "double_tap", "direct_thread", null, AbstractC06930Yk.A02(new C09530e4("viewer_is_sender", String.valueOf(((AbstractC129515tG) c129535tI).A00.CVC()))));
        }
        this.A02.DBb(c129535tI, c158697Af);
        return true;
    }

    public C158667Ac(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7Q8 c7q8) {
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = c7q8;
    }
}
