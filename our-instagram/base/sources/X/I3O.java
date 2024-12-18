package X;

import com.instagram.model.shopping.ShoppingHomeDestination;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class I3O {
    public static ShoppingHomeDestination parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ShoppingHomeDestination shoppingHomeDestination = new ShoppingHomeDestination();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("destination_type".equals(A0s)) {
                    EnumC39588Hdy enumC39588Hdy = (EnumC39588Hdy) EnumC39588Hdy.A01.get(AbstractC167017dG.A0m(c16l));
                    if (enumC39588Hdy == null) {
                        enumC39588Hdy = EnumC39588Hdy.A0S;
                    }
                    shoppingHomeDestination.A00 = enumC39588Hdy;
                } else if ("pinned_content_token".equals(A0s)) {
                    shoppingHomeDestination.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("referral_id".equals(A0s)) {
                    shoppingHomeDestination.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("referral_sender_id".equals(A0s)) {
                    shoppingHomeDestination.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("hoisted_discount_ids".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    }
                    shoppingHomeDestination.A07 = arrayList;
                } else if ("override_discount_id".equals(A0s)) {
                    shoppingHomeDestination.A01 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    shoppingHomeDestination.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1C(A0s)) {
                    shoppingHomeDestination.A06 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return shoppingHomeDestination;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
