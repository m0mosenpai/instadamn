package X;

import android.content.Context;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDQ extends C03E implements InterfaceC16620sF {
    public static final MDQ A00 = new MDQ();

    public MDQ() {
        super(2, AbstractC46455KhF.class, "generateReelShare", "generateReelShare(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectReelMedia;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        LEN len = (LEN) obj;
        C7QR c7qr = (C7QR) obj2;
        AbstractC167017dG.A1N(len, c7qr);
        Context context = (Context) len.A00.invoke();
        C38321qM c38321qM = c7qr.A02;
        C14360o3.A07(c38321qM);
        return AbstractC47996LLi.A0B(c38321qM.A1q(context), LEN.A00(len), 4);
    }
}
