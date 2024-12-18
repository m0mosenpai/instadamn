package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6mC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C148426mC {
    public final C145826hf A00;
    public final InterfaceC1118853a A01;
    public final C57112jm A02;
    public final C148436mD A03;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.6mD] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.2uS, java.lang.Object] */
    public C148426mC(final C675432t c675432t, final UserSession userSession, C57112jm c57112jm, final InterfaceC60442pS interfaceC60442pS, C145826hf c145826hf, InterfaceC1118853a interfaceC1118853a) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC60442pS, 2);
        C14360o3.A0B(c57112jm, 4);
        this.A01 = interfaceC1118853a;
        this.A02 = c57112jm;
        this.A00 = c145826hf;
        final ?? obj = new Object();
        final InterfaceC63482uV A00 = AbstractC63462uT.A00(userSession);
        this.A03 = new AbstractC63592ug(c675432t, userSession, interfaceC60442pS, A00, obj) { // from class: X.6mD
            public final C675432t A00;
            public final C63452uS A01;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(C1BX.A03.A01(AbstractC62752tE.A00(userSession, "story_comment_impression")), userSession, null, interfaceC60442pS, A00, 1008, 0L, false);
                C14360o3.A0B(A00, 5);
                this.A00 = c675432t;
                this.A01 = obj;
            }

            @Override // X.AbstractC63592ug
            public final /* bridge */ /* synthetic */ C82713mZ A01(Object obj2, Object obj3) {
                C84923qg c84923qg = (C84923qg) obj2;
                C14360o3.A0B(c84923qg, 0);
                if (c84923qg.A07 != null) {
                    return this.A00.A01(c84923qg, null);
                }
                return null;
            }

            @Override // X.AbstractC63592ug
            public final String A02() {
                return null;
            }

            @Override // X.AbstractC63592ug
            public final String A04() {
                return "story_comment";
            }
        };
    }

    public final void A00(View view, C84923qg c84923qg) {
        String A04 = AnonymousClass001.A04(0, "::", c84923qg.A0G);
        C68731VbA c68731VbA = new C68731VbA();
        C59062n7 c59062n7 = C59062n7.A07;
        C59072n8 c59072n8 = new C59072n8(c84923qg, c68731VbA, A04);
        c59072n8.A00(this.A03);
        this.A02.A05(view, c59072n8.A01());
    }
}
