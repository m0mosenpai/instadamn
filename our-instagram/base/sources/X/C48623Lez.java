package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.common.session.UserSession;
import com.instagram.ui.text.fittingtextview.FittingTextView;

/* renamed from: X.Lez, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48623Lez implements InterfaceC25184BCh {
    public View A00;
    public final View A01;
    public final ViewStub A02;
    public final UserSession A03;
    public final C8NX A04;
    public final C24010Ako A05;
    public final FittingTextView A06;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.Ako, java.lang.Object] */
    public C48623Lez(Context context, View view, UserSession userSession, C8NX c8nx) {
        C14360o3.A0B(context, 3);
        this.A03 = userSession;
        this.A04 = c8nx;
        SubscriptionStickerDict subscriptionStickerDict = new SubscriptionStickerDict(AbstractC166987dD.A10(userSession), null, null, null);
        ?? obj = new Object();
        obj.A00 = subscriptionStickerDict;
        this.A05 = obj;
        this.A01 = AbstractC166997dE.A0S(view, R.id.text_overlay_edit_text_container);
        this.A06 = (FittingTextView) AbstractC166997dE.A0R(view, R.id.done_button);
        ViewStub A0M = AbstractC167007dF.A0M(view, R.id.subscriptions_sticker_editor_stub);
        this.A02 = A0M;
        A0M.setOnInflateListener(new ViewStubOnInflateListenerC48089LQp(0, context, view, this));
    }

    @Override // X.InterfaceC25184BCh
    public final void DDv(Object obj) {
        View view = this.A00;
        if (view == null) {
            view = this.A02.inflate();
            this.A00 = view;
        }
        View view2 = this.A01;
        if (view == null) {
            C14360o3.A0F("containerView");
            throw C00O.createAndThrow();
        }
        AbstractC125325le.A07(new View[]{view2, view, this.A06}, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.5NL, X.Ako, java.lang.Object] */
    @Override // X.InterfaceC25184BCh
    public final void DEy() {
        C8NX c8nx = this.A04;
        SubscriptionStickerDict subscriptionStickerDict = new SubscriptionStickerDict(AbstractC166987dD.A10(this.A03), null, null, null);
        ?? obj = new Object();
        obj.A00 = subscriptionStickerDict;
        c8nx.Dog(obj, null);
        View view = this.A01;
        View view2 = this.A00;
        if (view2 == null) {
            C14360o3.A0F("containerView");
            throw C00O.createAndThrow();
        }
        AbstractC125325le.A05(new View[]{view, view2, this.A06}, false);
    }
}
