package X;

import com.instagram.direct.model.DirectAREffectShare;

/* loaded from: classes8.dex */
public final /* synthetic */ class MD2 extends C03E implements InterfaceC16620sF {
    public static final MD2 A00 = new MD2();

    public MD2() {
        super(2, LJK.class, "generateArEffectUrl", "generateArEffectUrl(Lcom/instagram/direct/model/DirectAREffectShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        DirectAREffectShare directAREffectShare = (DirectAREffectShare) obj;
        AbstractC167017dG.A1N(directAREffectShare, obj2);
        return AnonymousClass001.A0R("https://www.instagram.com/ar/", directAREffectShare.A02());
    }
}
