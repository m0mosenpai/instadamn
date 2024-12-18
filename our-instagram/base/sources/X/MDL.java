package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectAREffectShare;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.List;

/* loaded from: classes8.dex */
public final /* synthetic */ class MDL extends C03E implements InterfaceC16620sF {
    public static final MDL A00 = new MDL();

    public MDL() {
        super(2, AbstractC46455KhF.class, "generateArEffect", "generateArEffect(Lcom/instagram/direct/pending/pendinggenericxma/Environment;Lcom/instagram/direct/model/DirectAREffectShare;)Lcom/instagram/direct/model/GenericFBAttachment;", 1);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl;
        ImageUrl A0t;
        List list;
        C38321qM c38321qM;
        LEN len = (LEN) obj;
        DirectAREffectShare directAREffectShare = (DirectAREffectShare) obj2;
        AbstractC167007dF.A1K(len, directAREffectShare);
        Context context = (Context) len.A00.invoke();
        ImageUrl A002 = directAREffectShare.A00();
        if (A002 != null) {
            extendedImageUrl = new ExtendedImageUrl(A002);
        } else {
            extendedImageUrl = null;
        }
        C37771pE c37771pE = directAREffectShare.A03;
        if (c37771pE == null || (list = c37771pE.A1k) == null || (c38321qM = (C38321qM) AbstractC001800i.A0J(list)) == null || (A0t = c38321qM.A1S()) == null) {
            A0t = AbstractC25225BEi.A0t("");
        }
        return AbstractC47996LLi.A09(new ExtendedImageUrl(A0t), extendedImageUrl, null, null, directAREffectShare.A03(), AbstractC167007dF.A0f(context, directAREffectShare.A01(), 2131969509), LEN.A00(len), 4, 0);
    }
}
