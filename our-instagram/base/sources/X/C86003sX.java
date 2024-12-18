package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.3sX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86003sX implements C33R {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;

    public C86003sX(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        this.A09 = AbstractC09440dt.A01(new C9EM(viewStub, 46));
        this.A05 = AbstractC09440dt.A01(new C9EX(this, 1));
        this.A02 = AbstractC09440dt.A01(new C9EM(this, 48));
        this.A01 = AbstractC09440dt.A01(new C9EM(this, 47));
        this.A04 = AbstractC09440dt.A01(new C9EX(this, 0));
        this.A00 = AbstractC09440dt.A01(new C9EM(this, 45));
        this.A03 = AbstractC09440dt.A01(new C9EM(this, 49));
        this.A08 = AbstractC09440dt.A01(new C9EX(this, 4));
        this.A07 = AbstractC09440dt.A01(new C9EX(this, 3));
        this.A06 = AbstractC09440dt.A01(new C9EX(this, 2));
    }

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        C14360o3.A0B(c75113Zb, 0);
        if (i != 48) {
            if (i == 81) {
                Object obj = c75113Zb.A3b.A00;
                TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder = (TranslatedCaptionsStickerViewBinder$Holder) this.A07.getValue();
                EnumC75183Zl enumC75183Zl = EnumC75183Zl.A06;
                boolean z = true;
                boolean z2 = false;
                if (obj == enumC75183Zl) {
                    z2 = true;
                }
                translatedCaptionsStickerViewBinder$Holder.FCM(z2, true);
                C4ZU c4zu = (C4ZU) this.A08.getValue();
                if (obj != enumC75183Zl) {
                    z = false;
                }
                c4zu.FCM(z, true);
                return;
            }
            return;
        }
        A00().setAlpha(1.0f);
        ((TranslatedCaptionsStickerViewBinder$Holder) this.A07.getValue()).A05(c75113Zb.A05, c75113Zb.A0C);
        ((C4ZU) this.A08.getValue()).A04(c75113Zb.A05);
    }

    public final View A00() {
        Object value = this.A09.getValue();
        C14360o3.A07(value);
        return (View) value;
    }
}
