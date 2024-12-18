package X;

import android.widget.ImageView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;

/* loaded from: classes11.dex */
public final class WDr {
    public static HashMap A00() {
        HashMap hashMap = new HashMap();
        hashMap.put("topChange", AbstractC31174DnI.A12("phasedRegistrationNames", AbstractC65702TsY.A0m("bubbled", "onChange", "captured", "onChangeCapture")));
        hashMap.put("topSelect", AbstractC65703TsZ.A1B("onSelect", "onSelectCapture"));
        hashMap.put(C62799SRt.A00(C05F.A00), AbstractC65703TsZ.A1B("onTouchStart", "onTouchStartCapture"));
        hashMap.put(C62799SRt.A00(C05F.A0C), AbstractC65703TsZ.A1B("onTouchMove", "onTouchMoveCapture"));
        hashMap.put(C62799SRt.A00(C05F.A01), AbstractC65703TsZ.A1B("onTouchEnd", "onTouchEndCapture"));
        hashMap.put(C62799SRt.A00(C05F.A0N), AbstractC65703TsZ.A1B("onTouchCancel", "onTouchCancelCapture"));
        return hashMap;
    }

    public static HashMap A01() {
        HashMap hashMap = new HashMap();
        Integer valueOf = Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal());
        Integer valueOf2 = Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal());
        Integer valueOf3 = Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal());
        HashMap A0m = AbstractC65702TsY.A0m("ScaleAspectFit", valueOf, "ScaleAspectFill", valueOf2);
        A0m.put("ScaleAspectCenter", valueOf3);
        hashMap.put("UIView", AbstractC31174DnI.A12("ContentMode", A0m));
        HashMap A0m2 = AbstractC65702TsY.A0m(NetInfoModule.CONNECTION_TYPE_NONE, 0, "boxNone", 1);
        A0m2.put("boxOnly", 2);
        A0m2.put("unspecified", 3);
        hashMap.put("StyleConstants", AbstractC31174DnI.A12("PointerEventsValues", A0m2));
        HashMap A0m3 = AbstractC65702TsY.A0m("typeWindowStateChanged", 32, "typeViewFocused", 8);
        A0m3.put("typeViewClicked", 1);
        hashMap.put("AccessibilityEventTypes", A0m3);
        return hashMap;
    }

    public static HashMap A02() {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC58317Pt9.A00(377), AbstractC31174DnI.A12("registrationName", "onContentSizeChange"));
        hashMap.put("topLayout", AbstractC31174DnI.A12("registrationName", "onLayout"));
        hashMap.put(AbstractC58317Pt9.A00(1005), AbstractC31174DnI.A12("registrationName", "onLoadingError"));
        hashMap.put(AbstractC58317Pt9.A00(1006), AbstractC31174DnI.A12("registrationName", "onLoadingFinish"));
        hashMap.put(AbstractC58317Pt9.A00(1007), AbstractC31174DnI.A12("registrationName", "onLoadingStart"));
        hashMap.put("topSelectionChange", AbstractC31174DnI.A12("registrationName", "onSelectionChange"));
        hashMap.put("topMessage", AbstractC31174DnI.A12("registrationName", "onMessage"));
        hashMap.put("topScrollBeginDrag", AbstractC31174DnI.A12("registrationName", "onScrollBeginDrag"));
        hashMap.put("topScrollEndDrag", AbstractC31174DnI.A12("registrationName", "onScrollEndDrag"));
        hashMap.put("topScroll", AbstractC31174DnI.A12("registrationName", "onScroll"));
        hashMap.put("topMomentumScrollBegin", AbstractC31174DnI.A12("registrationName", "onMomentumScrollBegin"));
        hashMap.put("topMomentumScrollEnd", AbstractC31174DnI.A12("registrationName", "onMomentumScrollEnd"));
        return hashMap;
    }
}
