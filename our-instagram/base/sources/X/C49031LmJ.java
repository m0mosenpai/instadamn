package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.LmJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49031LmJ implements C7Q8 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC165247aD A02;

    @Override // X.C7Q8
    public final /* bridge */ /* synthetic */ boolean DBb(Object obj, Object obj2) {
        AbstractC129515tG abstractC129515tG = (AbstractC129515tG) obj;
        AbstractC167017dG.A1N(abstractC129515tG, obj2);
        HashMap A1G = AbstractC166987dD.A1G();
        String valueOf = String.valueOf(abstractC129515tG.CVC());
        A1G.put("viewer_is_sender", valueOf);
        AbstractC43821JZj.A00(this.A00, this.A01, null, "selfie_thumbnail_xma", "double_tap", "direct_thread", null, AbstractC167017dG.A0r("viewer_is_sender", valueOf));
        return new C7Q7(this.A02).A01(abstractC129515tG, obj2);
    }

    public C49031LmJ(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC165247aD interfaceC165247aD) {
        this.A02 = interfaceC165247aD;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
    }
}
