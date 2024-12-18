package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.StickerPack;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class LT8 implements InterfaceC48192Ji {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C47555KzQ A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ boolean A05;

    public LT8(C47555KzQ c47555KzQ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i, int i2, boolean z) {
        this.A02 = c47555KzQ;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A04 = interfaceC16660sJ;
        this.A03 = interfaceC16660sJ2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS optionalTreeField;
        String optionalStringField;
        ?? r14;
        ImmutableList requiredCompactedTreeListField;
        C14360o3.A0A(anonymousClass436);
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A05;
        C2JS A0k = AbstractC25225BEi.A0k(anonymousClass436);
        if (A0k != null && (optionalTreeField = A0k.getOptionalTreeField(0, "fetch__XIGStickerStorePack(id:$id)", C59439Qea.class, -1832187948)) != null && (optionalStringField = optionalTreeField.getOptionalStringField(0, "strong_id__")) != null) {
            C2JS optionalTreeField2 = optionalTreeField.getOptionalTreeField(5, "stickers", C59438QeZ.class, 695599951);
            if (optionalTreeField2 != null && (requiredCompactedTreeListField = optionalTreeField2.getRequiredCompactedTreeListField(1, "nodes", C59437QeY.class, 1319341)) != null) {
                r14 = AbstractC166987dD.A1E();
                Iterator it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    DirectStoreSticker A00 = LHH.A00((C59436QeX) AbstractC25225BEi.A0l(it).reinterpretRequired(0, C59436QeX.class, -1559682641), optionalStringField, i, i2, z);
                    if (A00 != null) {
                        r14.add(A00);
                    }
                }
            } else {
                r14 = C16930sl.A00;
            }
            String A08 = optionalTreeField.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (A08 == null) {
                A08 = "";
            }
            this.A04.invoke(new StickerPack(optionalStringField, A08, optionalTreeField.A09(DevServerEntity.COLUMN_DESCRIPTION), optionalTreeField.A0B("preview_image(height:$pack_icon_size,width:$pack_icon_size)"), r14));
            return;
        }
        this.A03.invoke(new Throwable("Sticker pack is null"));
    }
}
