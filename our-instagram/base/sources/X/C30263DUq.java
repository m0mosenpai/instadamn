package X;

import com.instagram.common.session.UserSession;
import com.instagram.interactive.translations.TranslatedCaptionsStickerViewBinder$Holder;

/* renamed from: X.DUq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30263DUq extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ TranslatedCaptionsStickerViewBinder$Holder A01;
    public final /* synthetic */ InterfaceC97454Zf A02;
    public final /* synthetic */ C84823qW A03;
    public final /* synthetic */ InterfaceC41201vU A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30263DUq(UserSession userSession, TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder, InterfaceC97454Zf interfaceC97454Zf, C84823qW c84823qW, InterfaceC41201vU interfaceC41201vU, String str, String str2, boolean z) {
        super(2);
        this.A07 = z;
        this.A01 = translatedCaptionsStickerViewBinder$Holder;
        this.A02 = interfaceC97454Zf;
        this.A04 = interfaceC41201vU;
        this.A00 = userSession;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = c84823qW;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        TranslatedCaptionsStickerViewBinder$Holder translatedCaptionsStickerViewBinder$Holder;
        boolean A1a = AbstractC166987dD.A1a(obj);
        boolean A1a2 = AbstractC166987dD.A1a(obj2);
        if (this.A07) {
            C19K A02 = AnonymousClass194.A02(C12L.A00.A04);
            translatedCaptionsStickerViewBinder$Holder = this.A01;
            UserSession userSession = this.A00;
            String str = this.A06;
            AbstractC166987dD.A1Z(new B5N(this.A03, userSession, translatedCaptionsStickerViewBinder$Holder, this.A05, str, null, 1, A1a), A02);
        } else {
            translatedCaptionsStickerViewBinder$Holder = this.A01;
            TranslatedCaptionsStickerViewBinder$Holder.A00(translatedCaptionsStickerViewBinder$Holder).setAlpha(AbstractC25230BEn.A01(A1a ? 1 : 0));
        }
        if (A1a2) {
            this.A02.DvX(translatedCaptionsStickerViewBinder$Holder, this.A04);
        }
        return C0eB.A00;
    }
}
