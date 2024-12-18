package X;

import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.WWz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70462WWz implements InterfaceC65496TlK {
    public final BaseViewManager A00;

    @Override // X.InterfaceC65496TlK
    public void Ebq(View view, Object obj, String str) {
        AbstractC167007dF.A1K(view, str);
        float f = 1.0f;
        boolean z = false;
        Integer num = 0;
        float f2 = Float.NaN;
        float f3 = 0.0f;
        switch (str.hashCode()) {
            case -1721943862:
                if (!str.equals("translateX")) {
                    return;
                }
                BaseViewManager baseViewManager = this.A00;
                Number number = (Number) obj;
                if (number != null) {
                    f3 = (float) number.doubleValue();
                }
                baseViewManager.setTranslateX(view, f3);
                return;
            case -1721943861:
                if (!str.equals("translateY")) {
                    return;
                }
                BaseViewManager baseViewManager2 = this.A00;
                Number number2 = (Number) obj;
                if (number2 != null) {
                    f3 = (float) number2.doubleValue();
                }
                baseViewManager2.setTranslateY(view, f3);
                return;
            case -1589741021:
                if (!str.equals("shadowColor")) {
                    return;
                }
                if (obj != null) {
                    num = C63233Sfl.A00(view.getContext(), obj);
                }
                C14360o3.A0A(num);
                int intValue = num.intValue();
                view.setOutlineAmbientShadowColor(intValue);
                view.setOutlineSpotShadowColor(intValue);
                return;
            case -1267206133:
                if (!str.equals("opacity")) {
                    return;
                }
                BaseViewManager baseViewManager3 = this.A00;
                Number number3 = (Number) obj;
                if (number3 != null) {
                    f = (float) number3.doubleValue();
                }
                baseViewManager3.setOpacity(view, f);
                return;
            case -1228066334:
                if (!str.equals("borderTopLeftRadius")) {
                    return;
                }
                BaseViewManager baseViewManager4 = this.A00;
                Number number4 = (Number) obj;
                if (number4 != null) {
                    f2 = (float) number4.doubleValue();
                }
                baseViewManager4.setBorderTopLeftRadius(view, f2);
                return;
            case -908189618:
                if (!str.equals("scaleX")) {
                    return;
                }
                Number number5 = (Number) obj;
                if (number5 != null) {
                    f = (float) number5.doubleValue();
                }
                view.setScaleX(f);
                return;
            case -908189617:
                if (!str.equals("scaleY")) {
                    return;
                }
                Number number6 = (Number) obj;
                if (number6 != null) {
                    f = (float) number6.doubleValue();
                }
                view.setScaleY(f);
                return;
            case -877170387:
                if (!str.equals("testID")) {
                    return;
                }
                this.A00.setTestId(view, (String) obj);
                return;
            case -781597262:
                if (!str.equals("transformOrigin")) {
                    return;
                }
                this.A00.setTransformOrigin(view, (ReadableArray) obj);
                return;
            case -731417480:
                if (!str.equals("zIndex")) {
                    return;
                }
                BaseViewManager baseViewManager5 = this.A00;
                Number number7 = (Number) obj;
                if (number7 != null) {
                    f3 = (float) number7.doubleValue();
                }
                baseViewManager5.setZIndex(view, f3);
                return;
            case -101663499:
                if (!str.equals("accessibilityHint")) {
                    return;
                }
                this.A00.setAccessibilityHint(view, (String) obj);
                return;
            case -101359900:
                if (!str.equals("accessibilityRole")) {
                    return;
                }
                this.A00.setAccessibilityRole(view, (String) obj);
                return;
            case -80891667:
                if (!str.equals("renderToHardwareTextureAndroid")) {
                    return;
                }
                BaseViewManager baseViewManager6 = this.A00;
                Boolean bool = (Boolean) obj;
                if (bool != null) {
                    z = bool.booleanValue();
                }
                baseViewManager6.setRenderToHardwareTexture(view, z);
                return;
            case -40300674:
                if (!str.equals("rotation")) {
                    return;
                }
                Number number8 = (Number) obj;
                if (number8 != null) {
                    f3 = (float) number8.doubleValue();
                }
                view.setRotation(f3);
                return;
            case -4379043:
                if (!str.equals("elevation")) {
                    return;
                }
                BaseViewManager baseViewManager7 = this.A00;
                Number number9 = (Number) obj;
                if (number9 != null) {
                    f3 = (float) number9.doubleValue();
                }
                baseViewManager7.setElevation(view, f3);
                return;
            case 3506294:
                if (!str.equals("role")) {
                    return;
                }
                this.A00.setRole(view, (String) obj);
                return;
            case 36255470:
                if (!str.equals("accessibilityLiveRegion")) {
                    return;
                }
                this.A00.setAccessibilityLiveRegion(view, (String) obj);
                return;
            case 333432965:
                if (!str.equals("borderTopRightRadius")) {
                    return;
                }
                BaseViewManager baseViewManager8 = this.A00;
                Number number10 = (Number) obj;
                if (number10 != null) {
                    f2 = (float) number10.doubleValue();
                }
                baseViewManager8.setBorderTopRightRadius(view, f2);
                return;
            case 581268560:
                if (!str.equals("borderBottomLeftRadius")) {
                    return;
                }
                BaseViewManager baseViewManager9 = this.A00;
                Number number11 = (Number) obj;
                if (number11 != null) {
                    f2 = (float) number11.doubleValue();
                }
                baseViewManager9.setBorderBottomLeftRadius(view, f2);
                return;
            case 588239831:
                if (!str.equals("borderBottomRightRadius")) {
                    return;
                }
                BaseViewManager baseViewManager10 = this.A00;
                Number number12 = (Number) obj;
                if (number12 != null) {
                    f2 = (float) number12.doubleValue();
                }
                baseViewManager10.setBorderBottomRightRadius(view, f2);
                return;
            case 746986311:
                if (!str.equals("importantForAccessibility")) {
                    return;
                }
                this.A00.setImportantForAccessibility(view, (String) obj);
                return;
            case 1052666732:
                if (!str.equals("transform")) {
                    return;
                }
                this.A00.setTransform(view, (ReadableArray) obj);
                return;
            case 1146842694:
                if (!str.equals("accessibilityLabel")) {
                    return;
                }
                this.A00.setAccessibilityLabel(view, (String) obj);
                return;
            case 1153872867:
                if (!str.equals("accessibilityState")) {
                    return;
                }
                this.A00.setViewState(view, (ReadableMap) obj);
                return;
            case 1287124693:
                if (!str.equals("backgroundColor")) {
                    return;
                }
                BaseViewManager baseViewManager11 = this.A00;
                if (obj != null) {
                    num = C63233Sfl.A00(view.getContext(), obj);
                }
                C14360o3.A0A(num);
                baseViewManager11.setBackgroundColor(view, num.intValue());
                return;
            case 1349188574:
                if (!str.equals("borderRadius")) {
                    return;
                }
                BaseViewManager baseViewManager12 = this.A00;
                Number number13 = (Number) obj;
                if (number13 != null) {
                    f2 = (float) number13.doubleValue();
                }
                baseViewManager12.setBorderRadius(view, f2);
                return;
            case 1505602511:
                if (!str.equals("accessibilityActions")) {
                    return;
                }
                this.A00.setAccessibilityActions(view, (ReadableArray) obj);
                return;
            case 1761903244:
                if (!str.equals("accessibilityCollection")) {
                    return;
                }
                this.A00.setAccessibilityCollection(view, (ReadableMap) obj);
                return;
            case 1865277756:
                if (!str.equals("accessibilityLabelledBy")) {
                    return;
                }
                this.A00.setAccessibilityLabelledBy(view, new T02(obj));
                return;
            case 1993034687:
                if (!str.equals("accessibilityCollectionItem")) {
                    return;
                }
                this.A00.setAccessibilityCollectionItem(view, (ReadableMap) obj);
                return;
            case 2045685618:
                if (!str.equals("nativeID")) {
                    return;
                }
                this.A00.setNativeId(view, (String) obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC65496TlK
    public void E8c(View view, String str, ReadableArray readableArray) {
        if ((this instanceof C67607UsU) && str.equals("setNativeRefreshing")) {
            ((SwipeRefreshLayout) view).setRefreshing(readableArray.getBoolean(0));
        }
    }

    public AbstractC70462WWz(BaseViewManager baseViewManager) {
        this.A00 = baseViewManager;
    }
}
