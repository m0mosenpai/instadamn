package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

/* renamed from: X.Gsk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38301Gsk extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C38301Gsk(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                ((C38325GtK) this.A02).A03.A00.F8m(new C51930MxD((C41181vS) this.A01, C05F.A00));
                return;
            case 1:
                IGA iga = ((C38944HCt) this.A02).A02;
                if (iga == null) {
                    return;
                }
                User user = (User) this.A01;
                C146036i0 c146036i0 = iga.A01;
                if (c146036i0.A0C.A0A) {
                    return;
                }
                UserSession userSession = c146036i0.A09;
                C6XJ A0L = AbstractC31171DnF.A0L(c146036i0.A07, AbstractC37301Gc2.A04(userSession, AbstractC31364DqT.A02(), AbstractC37304Gc5.A0J(c146036i0.A08, userSession, user.getId(), "countdown_sticker_creator")), userSession, ModalActivity.class, "profile");
                A0L.A0J = ModalActivity.A08;
                A0L.A0C(c146036i0.A06);
                return;
            default:
                ((HFN) this.A01).A00.A0A.A05(((User) this.A02).getId());
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0003. Please report as an issue. */
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(textPaint, 0);
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                return;
            case 1:
                C14360o3.A0B(textPaint, 0);
            default:
                textPaint.setUnderlineText(false);
                textPaint.setFakeBoldText(true);
                return;
        }
    }
}
