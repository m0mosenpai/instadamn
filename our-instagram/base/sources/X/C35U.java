package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.35U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C35U extends AnonymousClass346 {
    public final UserSession A00;
    public final InterfaceC60442pS A01;
    public final C35X A02;
    public final Context A03;
    public final C35V A04;
    public final C35W A05;

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void Cu3(C59072n8 c59072n8, C38321qM c38321qM, C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c59072n8, 1);
        C14360o3.A0B(c38321qM, 2);
        C75993b4 c75993b4 = C75993b4.A00;
        if (C75993b4.A02(i) && c75993b4.A05(this.A00, c38321qM, this.A01)) {
            c59072n8.A00(this.A05);
        }
    }

    @Override // X.AnonymousClass346, X.AnonymousClass347
    public final void DeT(View view, int i, Object obj, Object obj2) {
        C14360o3.A0B(view, 0);
        C14360o3.A0B(obj, 2);
        if ((obj instanceof C38321qM) && C75993b4.A02(i)) {
            C35V c35v = this.A04;
            C38321qM c38321qM = (C38321qM) obj;
            C14360o3.A0B(c38321qM, 1);
            Map map = c35v.A00;
            AnonymousClass016.A17(map.entrySet(), new C206969Eb(view, 6));
            String id = c38321qM.getId();
            if (id != null) {
                map.put(id, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.35W] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.35X] */
    public C35U(final Context context, final UserSession userSession, final InterfaceC60442pS interfaceC60442pS) {
        this.A00 = userSession;
        this.A03 = context;
        this.A01 = interfaceC60442pS;
        final C35V c35v = new C35V();
        this.A04 = c35v;
        this.A05 = new InterfaceC43071ya(context, userSession, interfaceC60442pS, c35v) { // from class: X.35W
            public final Context A00;
            public final UserSession A01;
            public final InterfaceC60442pS A02;
            public final C35V A03;

            /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
            
                if (r6 != false) goto L30;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List, java.lang.Object] */
            @Override // X.InterfaceC43071ya
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void ATP(X.C59062n7 r18, X.InterfaceC57162jr r19) {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C35W.ATP(X.2n7, X.2jr):void");
            }

            {
                this.A00 = context;
                this.A01 = userSession;
                this.A02 = interfaceC60442pS;
                this.A03 = c35v;
            }
        };
        this.A02 = new InterfaceC43071ya(context, userSession, interfaceC60442pS, c35v) { // from class: X.35X
            public final Context A00;
            public final UserSession A01;
            public final InterfaceC60442pS A02;
            public final C35V A03;

            @Override // X.InterfaceC43071ya
            public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
                C14360o3.A0B(c59062n7, 0);
                C14360o3.A0B(interfaceC57162jr, 1);
                C38321qM c38321qM = (C38321qM) c59062n7.A03;
                C75113Zb c75113Zb = ((C42C) c59062n7.A04).A01;
                C38321qM A1e = c38321qM.A1e(c75113Zb.A03);
                if (A1e == null) {
                    A1e = c38321qM;
                }
                String id = c38321qM.getId();
                if (id != null) {
                    C35V c35v2 = this.A03;
                    View view = (View) c35v2.A00.get(id);
                    if (view != null) {
                        int intValue = interfaceC57162jr.CFq(c59062n7).intValue();
                        if (intValue != 0 && intValue != 1) {
                            c35v2.A00(id);
                            if (c75113Zb.A12 != null && c75113Zb.A11 != null) {
                                c75113Zb.A11 = null;
                                return;
                            }
                            return;
                        }
                        if (A1e.A5Q()) {
                            return;
                        }
                        Map map = c35v2.A02;
                        if (map.containsKey(id)) {
                            return;
                        }
                        C75993b4 c75993b4 = C75993b4.A00;
                        View A00 = C75993b4.A00(view, -1);
                        if (A00 == null) {
                            return;
                        }
                        View A03 = c75993b4.A03(A00);
                        if (A03 != null) {
                            A00 = A03;
                        }
                        List<View> singletonList = Collections.singletonList(A00);
                        C14360o3.A07(singletonList);
                        map.put(id, singletonList);
                        for (View view2 : singletonList) {
                            UserSession userSession2 = this.A01;
                            C75993b4.A01(view, view2, userSession2, c38321qM, c75113Zb, "cta_extension_tap_on_media", AbstractC86543tS.A00(this.A00, userSession2, c38321qM, this.A02.getModuleName(), "cta_extension_tap_on_media"));
                        }
                    }
                }
            }

            {
                this.A00 = context;
                this.A01 = userSession;
                this.A02 = interfaceC60442pS;
                this.A03 = c35v;
            }
        };
    }
}
