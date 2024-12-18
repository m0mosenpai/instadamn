package X;

import android.content.Context;

/* renamed from: X.0jg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11820jg {
    public final C11830jh A01(AbstractC12990ll abstractC12990ll) {
        C14360o3.A0B(abstractC12990ll, 0);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        return (C11830jh) abstractC12990ll.A01(C11830jh.class, new C0Q5(context, abstractC12990ll));
    }

    public static final C63000SaO A00(final Context context, C19T c19t, final AbstractC12990ll abstractC12990ll) {
        Context context2 = AbstractC12290kX.A00;
        C14360o3.A07(context2);
        C11880jn c11880jn = (C11880jn) abstractC12990ll.A01(C11880jn.class, new AnonymousClass033(1, context2, c19t, abstractC12990ll));
        return new C63000SaO(context, null, new InterfaceC65348TiV() { // from class: X.0jf
            @Override // X.InterfaceC65348TiV
            public final void DxE(C19U c19u, C19U c19u2, Integer num, String str) {
                C14120nc.A00().ATO(new C0x8(new C11860jl(context), abstractC12990ll, c19u2.A01));
            }
        }, c11880jn, c11880jn, null);
    }
}
