package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;

/* renamed from: X.Cth, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29176Cth implements InterfaceC30989Djo {
    public final AbstractC59962oe A00;
    public final C26025BfE A01;
    public final C25814BbV A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final C1M1 A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;

    @Override // X.InterfaceC30989Djo
    public final /* bridge */ /* synthetic */ void ADv(View view, Object obj) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("CommentComposerComposeBinder.bindView", 591484045);
        }
        try {
            C166617cX.A02(view, this.A00, this.A01, this.A02, this.A03, null, this.A04, this.A05, this.A07, this.A06);
            if (Systrace.A0E(1L)) {
                C0fO.A00(-387103382);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1017658726);
            }
            throw th;
        }
    }

    @Override // X.InterfaceC30989Djo
    public final View ANS(Context context) {
        if (Systrace.A0E(1L)) {
            C0fO.A01("CommentComposerComposeBinder.createView", 867123784);
        }
        try {
            View A0C = AbstractC25227BEk.A0C(LayoutInflater.from(context), R.layout.comment_composer_container);
            if (Systrace.A0E(1L)) {
                C0fO.A00(150694346);
            }
            C14360o3.A07(A0C);
            return A0C;
        } catch (Throwable th) {
            if (Systrace.A0E(1L)) {
                C0fO.A00(-1805678786);
            }
            throw th;
        }
    }

    public C29176Cth(AbstractC59962oe abstractC59962oe, C26025BfE c26025BfE, C25814BbV c25814BbV, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C1M1 c1m1, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC167017dG.A1Q(userSession, c25814BbV);
        AbstractC167007dF.A1I(c26025BfE, 7, c1m1);
        this.A03 = userSession;
        this.A00 = abstractC59962oe;
        this.A02 = c25814BbV;
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A04 = interfaceC60442pS;
        this.A01 = c26025BfE;
        this.A05 = c1m1;
    }
}
