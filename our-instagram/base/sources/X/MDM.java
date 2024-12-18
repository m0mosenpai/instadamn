package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDM extends C03E implements InterfaceC16620sF {
    public static final MDM A00 = new MDM();

    public MDM() {
        super(2, AbstractC46455KhF.class, "generateMedia", "generateMedia(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/model/direct/DirectPendingMedia;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        LEN len = (LEN) obj;
        C7Q4 c7q4 = (C7Q4) obj2;
        AbstractC167017dG.A1N(len, c7q4);
        String str = c7q4.A08;
        if (str != null) {
            extendedImageUrl = new ExtendedImageUrl(null, null, null, null, str, null, null, null);
        } else {
            extendedImageUrl = null;
        }
        return AbstractC47996LLi.A04(null, extendedImageUrl, null, null, null, null, LEN.A00(len), 4, 8);
    }
}
