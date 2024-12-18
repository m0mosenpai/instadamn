package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.api.schemas.ProductVariantPossibleValueDictIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.9fL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214839fL extends AbstractC59962oe implements InterfaceC60072op {
    public static final String __redex_internal_original_name = "ShoppingCameraFragment";
    public C22P A00;
    public C81Y A01;
    public C81I A02;
    public ProductItemWithAR A03;
    public ShoppingCameraSurveyMetadata A04;
    public C1821585z A05;
    public String A06;
    public long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public final InterfaceC25214BDm A0F = new C23765Afc(this, 5);
    public final InterfaceC09390do A0G = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "instagram_shopping_camera";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.shopping_camera_container);
        C81I c81i = new C81I();
        registerLifecycleListener(c81i);
        this.A02 = c81i;
        C1XJ c1xj = C1XJ.A00;
        UserSession A0r = AbstractC166987dD.A0r(this.A0G);
        String str2 = this.A0B;
        if (str2 == null) {
            str = "shoppingSessionId";
        } else {
            String str3 = this.A0E;
            ProductItemWithAR productItemWithAR = this.A03;
            if (productItemWithAR == null) {
                str = "productItemWithAR";
            } else {
                C1821585z A06 = c1xj.A06(this, A0r, productItemWithAR, str2, str3);
                C22P c22p = this.A00;
                if (c22p == null) {
                    str = "entryPoint";
                } else {
                    A06.A00 = c22p;
                    String str4 = this.A0A;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    A06.A06 = str4;
                    String str6 = this.A08;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    A06.A03 = str5;
                    A06.A07 = this.A0C;
                    A06.A08 = this.A06;
                    A06.A04 = this.A09;
                    ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = this.A04;
                    if (shoppingCameraSurveyMetadata == null) {
                        str = "surveyMetadata";
                    } else {
                        A06.A02 = shoppingCameraSurveyMetadata;
                        A06.A09 = this.A0D;
                        this.A05 = A06;
                        AbstractC167007dF.A0z(this, new RunnableC24705Awm(viewGroup, this));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0G);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        String str;
        Product A04;
        C1821585z c1821585z;
        C1821585z c1821585z2;
        Product A042;
        List list;
        ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = this.A04;
        if (shoppingCameraSurveyMetadata != null) {
            shoppingCameraSurveyMetadata.A01 = SystemClock.elapsedRealtime() - this.A07;
            C81Y c81y = this.A01;
            if (c81y != null && c81y.A06()) {
                return true;
            }
            C22P c22p = this.A00;
            str = "entryPoint";
            if (c22p != null) {
                if (c22p == C22P.A4J || c22p == C22P.A4K) {
                    FragmentActivity requireActivity = requireActivity();
                    Intent intent = new Intent();
                    C1821585z c1821585z3 = this.A05;
                    if (c1821585z3 != null && (A04 = c1821585z3.A04()) != null && !C14360o3.A0K(A04.A0H, c1821585z3.A01.A01.A0h) && (c1821585z = this.A05) != null && c1821585z.A04() != null && (c1821585z2 = this.A05) != null && (A042 = c1821585z2.A04()) != null && (list = A042.A0O) != null && !list.isEmpty()) {
                        ProductVariantPossibleValueDictIntf productVariantPossibleValueDictIntf = (ProductVariantPossibleValueDictIntf) list.get(0);
                        intent.putExtra("variant_dimension_id", this.mFragmentId);
                        intent.putExtra(AbstractC111324zv.A00(555), productVariantPossibleValueDictIntf.getValue());
                    }
                    ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata2 = this.A04;
                    if (shoppingCameraSurveyMetadata2 != null) {
                        intent.putExtra("shopping_camera_survey_metadata", shoppingCameraSurveyMetadata2);
                        requireActivity.setResult(-1, intent);
                        requireActivity.finish();
                    }
                }
                return false;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        str = "surveyMetadata";
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        int A02 = C0f9.A02(-967037942);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0E = bundle2.getString(AbstractC111324zv.A00(1369));
            this.A03 = (ProductItemWithAR) AbstractC153636vY.A00(bundle2, ProductItemWithAR.class, AbstractC111324zv.A00(2022));
            this.A00 = AbstractC167027dH.A0D(bundle2, "camera_entry_point");
            this.A0A = bundle2.getString(AbstractC111324zv.A00(256));
            this.A0B = AbstractC61112qZ.A00(bundle2);
            this.A08 = bundle2.getString(AbstractC58317Pt9.A00(35));
            this.A0C = bundle2.getString("source_media_id");
            this.A06 = bundle2.getString("ch");
            this.A09 = bundle2.getString(AbstractC111324zv.A00(2180));
            this.A0D = bundle2.getString(AbstractC111324zv.A00(1332));
            ProductItemWithAR productItemWithAR = this.A03;
            if (productItemWithAR == null) {
                str = "productItemWithAR";
            } else {
                Product A01 = AbstractC38048Gob.A01(productItemWithAR.A01);
                String str2 = A01.A0H;
                User user = A01.A0B;
                String str3 = this.A0B;
                if (str3 == null) {
                    str = "shoppingSessionId";
                } else {
                    C22P c22p = this.A00;
                    if (c22p == null) {
                        str = "entryPoint";
                    } else {
                        this.A04 = new ShoppingCameraSurveyMetadata(c22p, user, str2, str3, 0, 0L);
                        C0f9.A09(-1379263649, A02);
                        return;
                    }
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(232924851, A02);
        throw A0g;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1658902588);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.shopping_camera_fragment_layout, viewGroup, false);
        C0f9.A09(-1170063803, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(295456488);
        super.onDestroyView();
        this.A01 = null;
        this.A05 = null;
        C81I c81i = this.A02;
        if (c81i != null) {
            unregisterLifecycleListener(c81i);
        }
        C81I c81i2 = this.A02;
        if (c81i2 != null) {
            c81i2.onDestroyView();
        }
        this.A02 = null;
        C0f9.A09(-512154493, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1504379531);
        super.onResume();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) rootActivity).EfL(8);
        }
        Activity rootActivity2 = getRootActivity();
        C14360o3.A0A(rootActivity2);
        this.A0G.getValue();
        AbstractC65987Txg.A00(rootActivity2);
        this.A07 = SystemClock.elapsedRealtime();
        C0f9.A09(1835103321, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        int A02 = C0f9.A02(56367929);
        super.onStop();
        ComponentCallbacks2 rootActivity = getRootActivity();
        if (rootActivity instanceof InterfaceC53712dA) {
            ((InterfaceC53712dA) rootActivity).EfL(0);
        }
        Activity rootActivity2 = getRootActivity();
        if (rootActivity2 != null && (window = rootActivity2.getWindow()) != null) {
            AbstractC56402iY.A07(window.getDecorView(), window, true);
        }
        C0f9.A09(-2141030459, A02);
    }
}
