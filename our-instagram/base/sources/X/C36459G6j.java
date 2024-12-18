package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.G6j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36459G6j implements InterfaceC58148PqD {
    public final UserSession A00;
    public final DirectPrivateStoryRecipientController A01;
    public final C51690MsL A02;
    public final InterfaceC37209GaK A03;
    public final C36005Fv3 A04;
    public final InterfaceC58010Pnu A05;
    public final Context A06;
    public final InterfaceC11380iw A07;

    public C36459G6j(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, DirectPrivateStoryRecipientController directPrivateStoryRecipientController, InterfaceC37209GaK interfaceC37209GaK, C36005Fv3 c36005Fv3, InterfaceC58010Pnu interfaceC58010Pnu) {
        C14360o3.A0B(interfaceC37209GaK, 1);
        AbstractC25234BEr.A1R(interfaceC58010Pnu, c36005Fv3, directPrivateStoryRecipientController, userSession, context);
        C14360o3.A0B(interfaceC11380iw, 7);
        this.A03 = interfaceC37209GaK;
        this.A05 = interfaceC58010Pnu;
        this.A04 = c36005Fv3;
        this.A01 = directPrivateStoryRecipientController;
        this.A00 = userSession;
        this.A06 = context;
        this.A07 = interfaceC11380iw;
        C51690MsL c51690MsL = C51690MsL.A03;
        DirectShareTarget directShareTarget = c36005Fv3.A09;
        if (directShareTarget != null) {
            this.A02 = OP5.A00(directShareTarget);
            return;
        }
        throw AbstractC166987dD.A14("VisualMessageOneTapSendButtonDelegate must have a valid ShareTarget set in the model");
    }

    @Override // X.InterfaceC58148PqD
    public final int BQ4(TextView textView) {
        C14360o3.A0B(textView, 0);
        return this.A03.BYu(textView);
    }

    private final void A00() {
        Context context = this.A06;
        Resources resources = context.getResources();
        DirectShareTarget directShareTarget = this.A04.A09;
        if (directShareTarget != null) {
            Spanned A0B = AbstractC31173DnH.A0B(resources, AbstractC31172DnG.A14(directShareTarget), 2131964662);
            C14360o3.A07(A0B);
            AbstractC35254Fgn.A05(context, A0B, context.getString(2131973724));
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC58148PqD
    public final void DAS() {
        DirectShareTarget directShareTarget = this.A04.A09;
        if (directShareTarget != null && directShareTarget.A0V()) {
            A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (X.AbstractC31178DnM.A1X(X.C06090Tz.A05, r1.A0B, 2342165792449571367L) == false) goto L20;
     */
    @Override // X.InterfaceC58148PqD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dka() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36459G6j.Dka():void");
    }

    @Override // X.InterfaceC58148PqD
    public final void Dw9() {
        this.A05.AXK().A08(this.A02);
        InterfaceC37209GaK interfaceC37209GaK = this.A03;
        C36005Fv3 c36005Fv3 = this.A04;
        DirectShareTarget directShareTarget = c36005Fv3.A09;
        if (directShareTarget != null) {
            interfaceC37209GaK.DwC(directShareTarget, c36005Fv3.A01, c36005Fv3.A03);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
