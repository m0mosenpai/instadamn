package com.instagram.react.modules.product;

import X.AbstractC10360h2;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC25651Mw;
import X.C1563870i;
import X.C17060sy;
import X.C41693IdM;
import X.C42256Ing;
import X.C63255SgD;
import X.C64134Szx;
import X.InterfaceC65213Tg3;
import X.InterfaceC65622ToD;
import X.J5O;
import X.R3M;
import X.RunnableC64604TLp;
import X.RunnableC64713TQu;
import X.TPC;
import X.TPD;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@ReactModule(name = "IGPurchaseExperienceBridgeModule")
/* loaded from: classes10.dex */
public class IgReactPurchaseExperienceBridgeModule extends NativeIGPurchaseExperienceBridgeModuleSpec {
    public static final String MODULE_NAME = "IGPurchaseExperienceBridgeModule";
    public static final String RN_PAYMENT_TYPE_KEY = "paymentType";
    public static final String RN_SHOP_PAY_CODE = "code";
    public static final String RN_SHOP_PAY_SESSION_ID = "session_id";
    public static final String RN_SHOP_PAY_STATE = "state";
    public static final String RN_SHOP_PAY_STATUS = "status";
    public static final int SHOP_PAY_REQUEST_CODE = 1;
    public final InterfaceC65213Tg3 mActivityEventListener;
    public List mProducts;
    public InterfaceC65622ToD mShopPayPromise;
    public C41693IdM mSurveyController;
    public UserSession mUserSession;

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void authenticate(double d, ReadableMap readableMap, InterfaceC65622ToD interfaceC65622ToD) {
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void checkoutConfirmationWillDismiss() {
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGPurchaseExperienceBridgeModule";
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void openConnectFlow(double d, String str, String str2, InterfaceC65622ToD interfaceC65622ToD) {
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void openPaypalConsentFlow(double d, String str, String str2, String str3, InterfaceC65622ToD interfaceC65622ToD) {
    }

    public static AbstractC10360h2 getFragmentManager(FragmentActivity fragmentActivity, Fragment fragment) {
        if (fragment != null) {
            return fragment.getChildFragmentManager();
        }
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        throw AbstractC166987dD.A12("FragmentActivity and fragment cannot both be empty");
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void dismissCheckout(double d, ReadableArray readableArray, boolean z, boolean z2) {
        AbstractC25651Mw.A00(this.mUserSession).E4s(new C42256Ing(getProductIdsFromReadableArray(readableArray), z, z2));
        C63255SgD.A01(new RunnableC64604TLp(this));
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void initCheckout(double d, ReadableMap readableMap) {
        C63255SgD.A01(new TPD(readableMap, this));
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void onPaymentSuccess(String str, boolean z, String str2, ReadableArray readableArray, ReadableArray readableArray2) {
        UserSession userSession = this.mUserSession;
        if (userSession != null) {
            User A01 = C17060sy.A01.A01(userSession);
            A01.A03.EVc(AbstractC166997dE.A0b());
            if (z && str2 != null) {
                ArrayList A1E = AbstractC166987dD.A1E();
                if (readableArray2 != null) {
                    Iterator it = readableArray2.toArrayList().iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof String) {
                            A1E.add(next);
                        }
                    }
                }
                AbstractC25651Mw.A00(userSession).E4s(new C1563870i(str2, Collections.unmodifiableList(A1E)));
            }
        }
        C41693IdM c41693IdM = this.mSurveyController;
        if (c41693IdM != null) {
            c41693IdM.A01 = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void openShopPayFlow(double d, String str, String str2, InterfaceC65622ToD interfaceC65622ToD) {
        this.mShopPayPromise = interfaceC65622ToD;
        try {
            C63255SgD.A01(new TPC(this, str));
        } catch (IllegalArgumentException | NullPointerException e) {
            interfaceC65622ToD.reject(e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void openShopPayInterstitial(double d, String str, String str2, InterfaceC65622ToD interfaceC65622ToD) {
        try {
            C63255SgD.A01(new RunnableC64713TQu(interfaceC65622ToD, this, str2, str));
        } catch (IllegalArgumentException | NullPointerException e) {
            interfaceC65622ToD.reject(e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeIGPurchaseExperienceBridgeModuleSpec
    public void sharePurchaseToStory(double d, String str, String str2) {
        C63255SgD.A01(new J5O(this, str, str2));
    }

    public IgReactPurchaseExperienceBridgeModule(R3M r3m) {
        super(r3m);
        C64134Szx c64134Szx = new C64134Szx(this);
        this.mActivityEventListener = c64134Szx;
        r3m.A0B.add(c64134Szx);
    }

    private List getProductIdsFromReadableArray(ReadableArray readableArray) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (readableArray != null) {
            Iterator it = readableArray.toArrayList().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    A1E.add(next);
                }
            }
        }
        return A1E;
    }

    public void setProducts(List list) {
        this.mProducts = list;
    }

    public void setSurveyController(C41693IdM c41693IdM) {
        this.mSurveyController = c41693IdM;
    }

    public void setUserSession(UserSession userSession) {
        this.mUserSession = userSession;
    }
}
