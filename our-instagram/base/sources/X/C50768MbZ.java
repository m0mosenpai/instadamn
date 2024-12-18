package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.MbZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50768MbZ extends ClickableSpan {
    public final /* synthetic */ EnumC50631MWs A00;
    public final /* synthetic */ C191578eE A01;
    public final /* synthetic */ C47947LGc A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ C15370ps A04;

    public C50768MbZ(EnumC50631MWs enumC50631MWs, C191578eE c191578eE, C47947LGc c47947LGc, Boolean bool, C15370ps c15370ps) {
        this.A04 = c15370ps;
        this.A01 = c191578eE;
        this.A00 = enumC50631MWs;
        this.A03 = bool;
        this.A02 = c47947LGc;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String A04;
        Object obj = this.A04.A00;
        C191578eE c191578eE = this.A01;
        EnumC50631MWs enumC50631MWs = this.A00;
        Boolean bool = this.A03;
        if (obj == null) {
            A04 = "https://help.instagram.com/270447560766967";
        } else {
            A04 = C18U.A04(C06090Tz.A05, c191578eE.A05, 36878637902921926L);
        }
        C191578eE.A03(enumC50631MWs, c191578eE, bool, A04);
        this.A02.A01();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC25229BEm.A13(textPaint);
    }
}
