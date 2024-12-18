package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: X.85z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1821585z implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "ShoppingCameraControllerImpl";
    public C22P A00;
    public ProductItemWithAR A01;
    public ShoppingCameraSurveyMetadata A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public final AbstractC59962oe A0A;
    public final UserSession A0B;
    public final IgFundedIncentive A0C;
    public final C41201ILp A0D;
    public final C22883A7d A0E;
    public final C41644Iba A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;
    public final Map A0J;
    public final Map A0K;
    public final InterfaceC60442pS A0L;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_camera";
    }

    public static final C38321qM A00(C1821585z c1821585z) {
        C38321qM A02;
        if (c1821585z.A07 != null && (A02 = C1DW.A00(c1821585z.A0B).A02(c1821585z.A07)) != null && A02.CdW()) {
            return A02;
        }
        return null;
    }

    public static final List A01(C1821585z c1821585z) {
        ProductItemWithAR A01 = c1821585z.A0F.A01(c1821585z.A05);
        String str = "";
        if (A01 == null) {
            C0w9.A03(__redex_internal_original_name, "Unable to getCurrentEffectId as the current master product is null");
        } else {
            String str2 = A01.A00.A03;
            if (str2 != null) {
                str = str2;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c1821585z.A0I.iterator();
        while (it.hasNext()) {
            String str3 = ((ProductItemWithAR) it.next()).A00.A03;
            if (!str.equals(str3)) {
                arrayList.add(str3);
            }
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public static final void A02(ProductItemWithAR productItemWithAR, C1821585z c1821585z) {
        JSONObject jSONObject;
        HashMap hashMap = productItemWithAR.A00.A05;
        if (hashMap != null && (!hashMap.isEmpty())) {
            jSONObject = new JSONObject(hashMap);
        } else {
            jSONObject = new JSONObject();
        }
        c1821585z.A0J.put(AbstractC41555Ia4.A00(AbstractC38048Gob.A01(productItemWithAR.A01)), jSONObject);
    }

    public final Product A04() {
        Object obj = this.A0K.get(this.A05);
        if (obj != null) {
            return (Product) this.A0F.A03.get(obj);
        }
        return null;
    }

    public final boolean A05() {
        String str;
        String Bgj = C17060sy.A01.A01(this.A0B).A03.Bgj();
        if (Bgj != null && Bgj.length() != 0) {
            str = "United Kingdom";
        } else {
            Context context = this.A0A.getContext();
            if (context == null) {
                return true;
            }
            Bgj = context.getResources().getConfiguration().locale.getCountry();
            str = "GB";
        }
        return !str.equalsIgnoreCase(Bgj);
    }

    public C1821585z(AbstractC59962oe abstractC59962oe, UserSession userSession, ProductItemWithAR productItemWithAR, String str, String str2) {
        String str3;
        this.A0A = abstractC59962oe;
        this.A0B = userSession;
        this.A01 = productItemWithAR;
        if (str2 == null) {
            str2 = UUID.randomUUID().toString();
            C14360o3.A07(str2);
        }
        this.A0H = str2;
        this.A00 = C22P.A5N;
        C41644Iba c41644Iba = new C41644Iba(abstractC59962oe, userSession);
        this.A0F = c41644Iba;
        ArrayList arrayList = new ArrayList();
        this.A0I = arrayList;
        this.A0J = new HashMap();
        HashMap hashMap = new HashMap();
        this.A0K = hashMap;
        this.A0C = C70Y.A00(userSession).A00;
        Aj9 aj9 = new Aj9(this);
        this.A0L = aj9;
        if (str == null) {
            str3 = AbstractC61112qZ.A00(null);
        } else {
            str3 = str;
        }
        this.A0G = str3;
        ProductItemWithAR productItemWithAR2 = this.A01;
        arrayList.add(productItemWithAR2);
        c41644Iba.A02(productItemWithAR2);
        A02(this.A01, this);
        Product A01 = AbstractC38048Gob.A01(this.A01.A01);
        c41644Iba.A03(A01);
        String A00 = AbstractC41555Ia4.A00(A01);
        this.A05 = A00;
        hashMap.put(A00, A00);
        this.A0E = new C22883A7d(userSession);
        this.A0D = new C41201ILp(userSession, aj9, str == null ? "" : str);
    }

    public final Product A03() {
        Product A04 = A04();
        if (A04 == null) {
            ProductItemWithAR A01 = this.A0F.A01(this.A05);
            if (A01 == null) {
                C0w9.A03(__redex_internal_original_name, "Master ProductItemWithAR should not be null for fallback product");
                return null;
            }
            return AbstractC38048Gob.A01(A01.A01);
        }
        return A04;
    }

    public final boolean A06() {
        Product A04 = A04();
        if (A04 == null) {
            A04 = AbstractC38048Gob.A01(this.A01.A01);
        }
        ProductCheckoutProperties productCheckoutProperties = A04.A01.A0C;
        if (productCheckoutProperties != null) {
            Boolean bool = true;
            if (bool.equals(productCheckoutProperties.A02)) {
                if (C18U.A06(C06090Tz.A05, this.A0B, 36311822478869276L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C1821585z() {
    }
}
