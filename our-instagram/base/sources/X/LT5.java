package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import com.instagram.model.direct.stickerstore.StickerPackResponseItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes8.dex */
public final class LT5 implements InterfaceC48192Ji {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C47645L2e A02;
    public final /* synthetic */ boolean A03;

    public LT5(C47645L2e c47645L2e, int i, int i2, boolean z) {
        this.A02 = c47645L2e;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = z;
    }

    @Override // X.InterfaceC48192Ji
    public final void invoke(AnonymousClass436 anonymousClass436) {
        C2JS A0k;
        C2JS A03;
        ImmutableList requiredCompactedTreeListField;
        C47645L2e c47645L2e = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        boolean z = this.A03;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (anonymousClass436 != null && (A0k = AbstractC25225BEi.A0k(anonymousClass436)) != null && (A03 = A0k.A03(C59444Qef.class, "ig_sticker_pack_root_query(first:$number_of_sticker_packs)", -728301347)) != null && (requiredCompactedTreeListField = A03.getRequiredCompactedTreeListField(1, "nodes", C59443Qee.class, 1042045914)) != null) {
            Iterator<E> it = requiredCompactedTreeListField.iterator();
            while (it.hasNext()) {
                C2JS A0l = AbstractC25225BEi.A0l(it);
                String A07 = A0l.A07("strong_id__");
                if (A07 != null) {
                    String A08 = A0l.A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    if (A08 == null) {
                        A08 = "";
                    }
                    StickerPackResponseItem stickerPackResponseItem = new StickerPackResponseItem(A07, A08, A0l.A0A("preview_image(height:$pack_icon_size,width:$pack_icon_size)"), "image/webp");
                    C2JS optionalTreeField = A0l.getOptionalTreeField(4, "stickers(first:$stickers_per_pack)", C59442Qed.class, 585193735);
                    if (optionalTreeField != null) {
                        ImmutableList requiredCompactedTreeListField2 = optionalTreeField.getRequiredCompactedTreeListField(1, "nodes", C59441Qec.class, -1265666345);
                        ArrayList A10 = AbstractC31174DnI.A10(requiredCompactedTreeListField2);
                        Iterator<E> it2 = requiredCompactedTreeListField2.iterator();
                        while (it2.hasNext()) {
                            C59436QeX c59436QeX = (C59436QeX) AbstractC25225BEi.A0l(it2).A01(C59436QeX.class, -1559682641);
                            C14360o3.A07(c59436QeX);
                            DirectStoreSticker A00 = LHH.A00(c59436QeX, A07, i, i2, z);
                            if (A00 != null) {
                                A10.add(A00);
                            }
                        }
                        A1I.put(stickerPackResponseItem, A10);
                    }
                }
            }
        }
        c47645L2e.A03.invoke(A1I);
    }
}
