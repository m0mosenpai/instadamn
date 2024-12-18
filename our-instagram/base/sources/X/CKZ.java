package X;

import com.instagram.wonderwall.model.WallPostItem;

/* loaded from: classes5.dex */
public abstract class CKZ {
    public static final void A00(C5Tl c5Tl, WallPostItem wallPostItem, InterfaceC16660sJ interfaceC16660sJ, int i, int i2) {
        int i3;
        C14360o3.A0B(wallPostItem, 0);
        c5Tl.Enr(1184731576);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, wallPostItem) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                interfaceC16660sJ = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1228158997, "com.instagram.wonderwall.ui.compose.components.RepostAttachmentPreview (WallRepostAttachment.kt:19)");
            }
            CKV.A00(c5Tl, null, C5UA.A01(c5Tl, C30487DbW.A00(interfaceC16660sJ, wallPostItem, wallPostItem.Bez(), 33), 1290229571), 1.0f, 27696, 5, false, false);
            if (C0fH.A02()) {
                C0fH.A00(-1288948366);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30504Dbn.A01(interfaceC16660sJ, wallPostItem, i2, i, 42);
        }
    }
}
