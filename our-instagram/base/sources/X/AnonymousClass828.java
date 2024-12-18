package X;

import android.graphics.Rect;
import android.view.View;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.828, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass828 {
    public View A00;
    public final View A01;
    public final AbstractC59962oe A02;
    public final C57112jm A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final UserSession A06;

    public AnonymousClass828(View view, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(abstractC59962oe, 1);
        C14360o3.A0B(view, 2);
        this.A02 = abstractC59962oe;
        this.A01 = view;
        this.A06 = userSession;
        this.A03 = C57112jm.A00();
        this.A04 = C1XM.A00(new C9ES(this, 48));
        this.A05 = C1XM.A00(new C9ES(this, 49));
        this.A03.A08(this.A01, C71163Hc.A00(this.A02), new InterfaceC57142jp() { // from class: X.829
            @Override // X.InterfaceC57142jp
            public final void Ao7(Rect rect) {
                InterfaceC09390do interfaceC09390do = AnonymousClass828.this.A04;
                if (((View) interfaceC09390do.getValue()).isShown()) {
                    ((View) interfaceC09390do.getValue()).getGlobalVisibleRect(rect);
                } else {
                    rect.setEmpty();
                }
            }
        }, new InterfaceC57142jp() { // from class: X.82A
            @Override // X.InterfaceC57142jp
            public final void Ao7(Rect rect) {
                InterfaceC09390do interfaceC09390do = AnonymousClass828.this.A05;
                if (((View) interfaceC09390do.getValue()).isShown()) {
                    ((View) interfaceC09390do.getValue()).getGlobalVisibleRect(rect);
                } else {
                    rect.setEmpty();
                }
            }
        }, new InterfaceC57142jp() { // from class: X.82B
            @Override // X.InterfaceC57142jp
            public final void Ao7(Rect rect) {
                AnonymousClass828 anonymousClass828 = AnonymousClass828.this;
                View view2 = anonymousClass828.A00;
                if (view2 == null) {
                    view2 = anonymousClass828.A01.findViewById(R.id.clips_review_container);
                    anonymousClass828.A00 = view2;
                }
                if (view2 != null && view2.isShown()) {
                    View view3 = anonymousClass828.A00;
                    if (view3 != null) {
                        view3.getGlobalVisibleRect(rect);
                        return;
                    }
                    return;
                }
                rect.setEmpty();
            }
        });
    }
}
