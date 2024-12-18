package com.instagram.react.modules.navigator;

import X.AbstractC12990ll;
import X.AbstractC166987dD;
import X.AbstractC18680vv;
import X.AbstractC27401Ut;
import X.AbstractC58318PtA;
import X.AbstractC58321PtD;
import X.AbstractC62816SSn;
import X.C0K8;
import X.C63255SgD;
import X.C64501TGn;
import X.InterfaceC65532Tm2;
import X.InterfaceC65542TmH;
import X.InterfaceC65657Tqj;
import X.MSY;
import X.R3M;
import X.Rb1;
import X.RunnableC64601TLm;
import X.RunnableC64602TLn;
import X.RunnableC64711TQs;
import X.RunnableC64712TQt;
import X.TP8;
import X.TP9;
import X.TPA;
import X.TQJ;
import X.TRD;
import X.TRL;
import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.fbreact.specs.NativeNavigationSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.delegate.IgReactDelegate;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;

@ReactModule(name = "Navigation", needsEagerInit = true)
/* loaded from: classes10.dex */
public class IgReactNavigatorModule extends NativeNavigationSpec implements InterfaceC65542TmH {
    public static final String MODULE_NAME = "Navigation";
    public static final String URL = "url";
    public View mCustomActionBarView;
    public boolean mIsHostResumed;
    public Map mRoutesMap;
    public final AbstractC18680vv mSession;

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void clearRightBarButton(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Navigation";
    }

    @Override // X.InterfaceC65542TmH
    public void onHostDestroy() {
    }

    @Override // X.InterfaceC65542TmH
    public void onHostPause() {
        this.mIsHostResumed = false;
    }

    @Override // X.InterfaceC65542TmH
    public void onHostResume() {
        this.mIsHostResumed = true;
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void reloadReact() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r4 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.InterfaceC65532Tm2 configureReactNativeLauncherWithRouteInfo(X.InterfaceC65532Tm2 r4, android.os.Bundle r5, com.facebook.react.bridge.ReadableMap r6) {
        /*
            if (r5 == 0) goto L6e
            X.AbstractC62816SSn.A01(r5, r6)
            r1 = 0
            java.lang.String r0 = "title"
            java.lang.String r3 = r5.getString(r0, r1)
            java.lang.String r0 = "logoAsTitle"
            r2 = 0
            boolean r1 = r5.getBoolean(r0, r2)
            if (r3 == 0) goto L18
            if (r1 != 0) goto L19
        L18:
            r2 = 1
        L19:
            java.lang.String r0 = "Screen navigationOptions cannot have both 'title' and 'logoAsTitle'"
            X.C18C.A0G(r2, r0)
            X.TGn r4 = (X.C64501TGn) r4
            r4.A07 = r3
            r4.A0A = r1
            java.lang.String r1 = "orientation"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L32
            int r0 = r5.getInt(r1)
            r4.A00 = r0
        L32:
            java.lang.String r1 = "analyticsModule"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.getString(r1)
            r4.A03 = r0
        L40:
            java.lang.String r1 = "perfLogger_ttiEventName"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L4e
            java.lang.String r0 = r5.getString(r1)
            r4.A06 = r0
        L4e:
            java.lang.String r0 = "fb_analyticsExtras"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L5e
            r1 = 0
            X.WdR r0 = new X.WdR
            r0.<init>(r1, r5, r6)
            r4.A01 = r0
        L5e:
            java.lang.String r1 = "navigationBar"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L6e
            boolean r0 = r5.getBoolean(r1)
            r0 = r0 ^ 1
            r4.A09 = r0
        L6e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.react.modules.navigator.IgReactNavigatorModule.configureReactNativeLauncherWithRouteInfo(X.Tm2, android.os.Bundle, com.facebook.react.bridge.ReadableMap):X.Tm2");
    }

    public static int contentDescriptionForIconType(String str) {
        if (str.equals("done")) {
            return 2131961124;
        }
        if (str.equals("next")) {
            return 2131968535;
        }
        if (str.equals("reload")) {
            return 2131972101;
        }
        if (str.equals("cancel")) {
            return 2131954754;
        }
        if (str.equals("back")) {
            return 2131953583;
        }
        if (str.equals("more")) {
            return 2131966888;
        }
        if (str.equals(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
            return R.string.res_0x7f13004b_name_removed;
        }
        if (str.equals("lock")) {
            return 2131965680;
        }
        if (str.equals("loading")) {
            return 2131965660;
        }
        if (str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return 2131954438;
        }
        throw MSY.A0d("Unsupported IconType: ", str);
    }

    public static int resourceForIconType(String str) {
        if (str.equals("done")) {
            return R.drawable.instagram_check_pano_outline_24;
        }
        if (str.equals("next")) {
            return R.drawable.nav_arrow_next;
        }
        if (str.equals("reload")) {
            return R.drawable.instagram_arrow_cw_pano_outline_24;
        }
        if (str.equals("cancel")) {
            return R.drawable.instagram_x_pano_outline_24;
        }
        if (str.equals("back")) {
            return R.drawable.instagram_arrow_back_24;
        }
        if (str.equals("more")) {
            return R.drawable.instagram_more_vertical_pano_outline_24;
        }
        if (str.equals(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING)) {
            return R.drawable.instagram_direct_pano_outline_24;
        }
        if (str.equals("lock")) {
            return R.drawable.instagram_lock_filled_12;
        }
        if (str.equals("loading") || str.equals(NetInfoModule.CONNECTION_TYPE_NONE)) {
            return 0;
        }
        throw MSY.A0d("Unsupported IconType: ", str);
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void dismiss(double d, ReadableMap readableMap) {
        C63255SgD.A01(new RunnableC64602TLn(this));
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void navigate(double d, String str, ReadableMap readableMap) {
        FragmentActivity fragmentActivity;
        InterfaceC65657Tqj fromBundle;
        InterfaceC65532Tm2 createReactNativeLauncherFromRouteName;
        if (str.equals("IgExternalUrlRoute")) {
            openURL(readableMap);
        }
        Map map = this.mRoutesMap;
        if (map != null && map.get(str) != null) {
            Activity A01 = AbstractC58321PtD.A0b(this).A01();
            if ((A01 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A01) != null) {
                Bundle bundle = ((Bundle) this.mRoutesMap.get(str)).getBundle("navigationOptions");
                if (bundle == null) {
                    fromBundle = null;
                } else {
                    fromBundle = Arguments.fromBundle(bundle);
                }
                boolean containsKey = ((BaseBundle) this.mRoutesMap.get(str)).containsKey("isFromRegistry");
                AbstractC18680vv abstractC18680vv = this.mSession;
                if (containsKey) {
                    createReactNativeLauncherFromRouteName = createReactNativeLauncherFromAppKey(abstractC18680vv, str, readableMap, fromBundle);
                } else {
                    createReactNativeLauncherFromRouteName = createReactNativeLauncherFromRouteName(abstractC18680vv, str, readableMap, fromBundle);
                }
                C63255SgD.A01(new TRD(fragmentActivity, fromBundle, createReactNativeLauncherFromRouteName, this, d));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void openURL(double d, String str) {
        C63255SgD.A01(new TP8(this, str));
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void pop(double d) {
        C63255SgD.A01(new RunnableC64601TLm(this));
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void popToScreen(double d, double d2) {
        C63255SgD.A01(new TPA(this, d2));
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void setBarLeftAction(double d, ReadableMap readableMap) {
        String str;
        int i;
        if (readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            if (readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
                str = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
                if (str != null) {
                    i = resourceForIconType(str);
                    C63255SgD.A01(new RunnableC64711TQs(this, str, d, i));
                }
            } else {
                str = null;
            }
            i = 0;
            C63255SgD.A01(new RunnableC64711TQs(this, str, d, i));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void setBarTitle(double d, String str) {
        C63255SgD.A01(new TQJ(this, str, d));
    }

    public IgReactNavigatorModule(R3M r3m, AbstractC18680vv abstractC18680vv) {
        super(r3m);
        this.mSession = abstractC18680vv;
        r3m.A0A(this);
        try {
            R3M A0b = AbstractC58321PtD.A0b(this);
            this.mRoutesMap = AbstractC62816SSn.A00(A0b, A0b.getAssets().open("react_native_routes.json"));
        } catch (IOException unused) {
        }
    }

    private InterfaceC65532Tm2 createReactNativeLauncherFromAppKey(AbstractC12990ll abstractC12990ll, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        Bundle bundle = Arguments.toBundle(readableMap2);
        AbstractC27401Ut.getInstance();
        C64501TGn A00 = new C64501TGn(abstractC12990ll, str).A00(Arguments.toBundle(readableMap));
        configureReactNativeLauncherWithRouteInfo(A00, bundle, readableMap);
        return A00;
    }

    private InterfaceC65532Tm2 createReactNativeLauncherFromRouteName(AbstractC12990ll abstractC12990ll, String str, ReadableMap readableMap, ReadableMap readableMap2) {
        Bundle bundle = Arguments.toBundle(readableMap2);
        AbstractC27401Ut.getInstance();
        C64501TGn A01 = new C64501TGn(abstractC12990ll).A01(str);
        A01.A00(Arguments.toBundle(readableMap));
        configureReactNativeLauncherWithRouteInfo(A01, bundle, readableMap);
        return A01;
    }

    private Map createRouteMapFromJson(String str) {
        try {
            return AbstractC62816SSn.A00(AbstractC58321PtD.A0b(this), new ByteArrayInputStream(str.getBytes()));
        } catch (IOException e) {
            C0K8.A0I("ReactNative", "Failed to create routes map.", e);
            throw AbstractC58318PtA.A0f(e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void getSavedInstanceState(double d, String str, Callback callback) {
        FragmentActivity fragmentActivity;
        Object[] objArr;
        Object obj;
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (!(A01 instanceof FragmentActivity)) {
            fragmentActivity = null;
        } else {
            fragmentActivity = (FragmentActivity) A01;
        }
        Rb1 rb1 = null;
        if (fragmentActivity != null) {
            Fragment A0Q = fragmentActivity.getSupportFragmentManager().A0Q(str);
            if (A0Q instanceof Rb1) {
                rb1 = (Rb1) A0Q;
            }
        }
        if (rb1 != null) {
            objArr = new Object[1];
            obj = Arguments.fromBundle(((IgReactDelegate) rb1.A00).A01);
        } else {
            objArr = new Object[1];
            obj = 0;
        }
        objArr[0] = obj;
        callback.invoke(objArr);
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public Map getTypedExportedConstants() {
        return AbstractC166987dD.A1G();
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void setBarPrimaryAction(double d, ReadableMap readableMap) {
        String str;
        int i;
        String str2 = null;
        if (readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) && (str2 = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) != null) {
            i = resourceForIconType(str2);
        } else {
            i = 0;
        }
        C63255SgD.A01(new TRL(readableMap, this, str, str2, d, i));
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void setBarTitleWithConfig(double d, ReadableMap readableMap) {
        String str;
        int i;
        FragmentActivity fragmentActivity;
        String str2 = null;
        if (readableMap.hasKey(DialogModule.KEY_TITLE)) {
            str = readableMap.getString(DialogModule.KEY_TITLE);
        } else {
            str = null;
        }
        if (readableMap.hasKey(PublicKeyCredentialControllerUtility.JSON_KEY_ICON) && (str2 = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) != null) {
            i = resourceForIconType(str2);
        } else {
            i = 0;
        }
        if (str == null) {
            if (i == 0) {
                return;
            }
        } else if (i == 0) {
            setBarTitle(d, str);
            return;
        }
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if (!(A01 instanceof FragmentActivity)) {
            fragmentActivity = null;
        } else {
            fragmentActivity = (FragmentActivity) A01;
        }
        C63255SgD.A01(new RunnableC64712TQt(fragmentActivity, this, str, str2));
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void setInstanceStateToSave(double d, String str, ReadableMap readableMap) {
        FragmentActivity fragmentActivity;
        Rb1 rb1;
        Bundle bundle = Arguments.toBundle(readableMap);
        Activity A01 = AbstractC58321PtD.A0b(this).A01();
        if ((A01 instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) A01) != null) {
            Fragment A0Q = fragmentActivity.getSupportFragmentManager().A0Q(str);
            if ((A0Q instanceof Rb1) && (rb1 = (Rb1) A0Q) != null) {
                ((IgReactDelegate) rb1.A00).A01.putAll(bundle);
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeNavigationSpec
    public void updateNativeRoutesConfiguration(String str) {
        this.mRoutesMap = createRouteMapFromJson(str);
    }

    private void openURL(ReadableMap readableMap) {
        String string = readableMap.getString("url");
        string.getClass();
        C63255SgD.A01(new TP9(this, string));
    }
}
