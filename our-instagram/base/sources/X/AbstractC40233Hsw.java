package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.SellerBadgeDict;
import com.instagram.api.schemas.SellerBadgeSurfaces;
import com.instagram.api.schemas.SellerBadgeType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hsw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40233Hsw {
    public static SellerBadgeDict parseFromJson(C16L c16l) {
        String A1P;
        String A1P2;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            SellerBadgeType sellerBadgeType = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("surfaces".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P2 = null;
                            } else {
                                A1P2 = c16l.A1P();
                            }
                            SellerBadgeSurfaces sellerBadgeSurfaces = (SellerBadgeSurfaces) SellerBadgeSurfaces.A01.get(A1P2);
                            if (sellerBadgeSurfaces == null) {
                                sellerBadgeSurfaces = SellerBadgeSurfaces.A08;
                            }
                            arrayList.add(sellerBadgeSurfaces);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1E(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    sellerBadgeType = (SellerBadgeType) SellerBadgeType.A01.get(A1P);
                    if (sellerBadgeType == null) {
                        sellerBadgeType = SellerBadgeType.A06;
                    }
                }
                c16l.A0z();
            }
            return new SellerBadgeDict(sellerBadgeType, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
