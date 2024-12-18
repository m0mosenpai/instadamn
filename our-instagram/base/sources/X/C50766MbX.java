package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;

/* renamed from: X.MbX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50766MbX extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C50766MbX(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                C63397SjR A0y = AbstractC25228BEl.A0y((Context) this.A02, (UserSession) this.A03, C2Fb.A0b, "https://help.instagram.com/1695974997209192");
                A0y.A0S = "ViolationAlertFragment";
                A0y.A0A();
                return;
            case 1:
                C191578eE.A03((EnumC50631MWs) this.A01, (C191578eE) this.A03, null, "https://help.instagram.com/270447560766967");
                ((C47947LGc) this.A02).A01();
                return;
            case 2:
                C191578eE c191578eE = (C191578eE) this.A03;
                C191578eE.A03((EnumC50631MWs) this.A01, c191578eE, (Boolean) this.A02, C18U.A04(C06090Tz.A05, c191578eE.A05, 36878637902921926L));
                return;
            case 3:
                ((C38325GtK) this.A03).A03.A00.F8m(new C51929MxC((C41181vS) this.A01, C05F.A00));
                return;
            default:
                ((INT) this.A03).A03((OriginalAudioPartMetadataIntf) this.A01, (OriginalAudioSubtype) this.A02, 1, false);
                return;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 0:
                AbstractC25229BEm.A13(textPaint);
                Context context = (Context) this.A01;
                AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A06(context));
                return;
            case 1:
            default:
                super.updateDrawState(textPaint);
                return;
            case 2:
            case 4:
                AbstractC25229BEm.A13(textPaint);
                return;
            case 3:
                C14360o3.A0B(textPaint, 0);
                boolean z = false;
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                if (((C1NB) this.A02).CBs() == C05F.A1F) {
                    z = true;
                }
                textPaint.setFakeBoldText(z);
                return;
        }
    }
}
