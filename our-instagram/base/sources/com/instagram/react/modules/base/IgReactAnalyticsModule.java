package com.instagram.react.modules.base;

import X.AbstractC11060iN;
import X.AbstractC111324zv;
import X.AbstractC12990ll;
import X.AbstractC31173DnH;
import X.AbstractC58321PtD;
import X.C0x9;
import X.C19260xA;
import X.C19280xC;
import X.C1Q9;
import X.InterfaceC11310in;
import X.R3M;
import X.TF7;
import com.facebook.fbreact.specs.NativeAnalyticsSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Analytics")
/* loaded from: classes10.dex */
public class IgReactAnalyticsModule extends NativeAnalyticsSpec {
    public static final String MODULE_NAME = "Analytics";
    public final AbstractC12990ll mSession;

    @Override // com.facebook.fbreact.specs.NativeAnalyticsSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Analytics";
    }

    @Override // com.facebook.fbreact.specs.NativeAnalyticsSpec
    public void logCounter(String str, double d) {
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    public static C0x9 obtainExtraArray(ReadableArray readableArray) {
        String str;
        InterfaceC11310in obtainExtraBundle;
        C0x9 c0x9 = new C0x9();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (readableArray.getType(i).ordinal()) {
                case 0:
                    str = "null";
                    c0x9.A04(str);
                case 1:
                    c0x9.A05(readableArray.getBoolean(i));
                case 2:
                    c0x9.A00(readableArray.getDouble(i));
                case 3:
                    str = readableArray.getString(i);
                    c0x9.A04(str);
                case 4:
                    obtainExtraBundle = obtainExtraBundle(readableArray.getMap(i));
                    c0x9.A00.add(obtainExtraBundle);
                case 5:
                    obtainExtraBundle = obtainExtraArray(readableArray.getArray(i));
                    c0x9.A00.add(obtainExtraBundle);
                default:
                    throw new RuntimeException("Unknown data type");
            }
        }
        return c0x9;
    }

    public IgReactAnalyticsModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mSession = abstractC12990ll;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private C19280xC getAnalyticsEvent(String str, String str2) {
        C1Q9 c1q9;
        switch (str.hashCode()) {
            case -1581452433:
                if (str.equals("this_was_me")) {
                    c1q9 = C1Q9.A0R;
                    break;
                }
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
            case 963638032:
                if (str.equals("resend_tapped")) {
                    c1q9 = C1Q9.A0P;
                    break;
                }
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
            case 1229418656:
                if (str.equals("next_blocked")) {
                    c1q9 = C1Q9.A0M;
                    break;
                }
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
            case 1326426600:
                if (str.equals("resend_blocked")) {
                    c1q9 = C1Q9.A0O;
                    break;
                }
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
            case 1491939820:
                if (str.equals(AbstractC111324zv.A00(3131))) {
                    c1q9 = C1Q9.A0Q;
                    break;
                }
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
            case 1514698072:
                if (str.equals("next_tapped")) {
                    c1q9 = C1Q9.A0N;
                    break;
                }
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
            case 1671672458:
                if (str.equals("dismiss")) {
                    c1q9 = C1Q9.A0L;
                    break;
                }
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
            default:
                return C19280xC.A01(str, new TF7(this, str2).getModuleName());
        }
        return c1q9.A02(this.mSession).A04();
    }

    public static C19260xA obtainExtraBundle(ReadableMap readableMap) {
        Object obj;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        C19260xA c19260xA = new C19260xA();
        while (keySetIterator.CLQ()) {
            String Csu = keySetIterator.Csu();
            switch (readableMap.getType(Csu).ordinal()) {
                case 0:
                    obj = "null";
                    break;
                case 1:
                    obj = Boolean.valueOf(readableMap.getBoolean(Csu));
                    break;
                case 2:
                    obj = Double.valueOf(readableMap.getDouble(Csu));
                    break;
                case 3:
                    obj = readableMap.getString(Csu);
                    break;
                case 4:
                    obj = obtainExtraBundle(readableMap.getMap(Csu));
                    break;
                case 5:
                    obj = obtainExtraArray(readableMap.getArray(Csu));
                    break;
                default:
                    throw new RuntimeException("Unknown data type");
            }
            C19260xA.A00(c19260xA, obj, Csu);
        }
        return c19260xA;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0016. Please report as an issue. */
    public static void setDataAsExtra(C19280xC c19280xC, ReadableMap readableMap) {
        String str;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.CLQ()) {
            String Csu = keySetIterator.Csu();
            switch (readableMap.getType(Csu).ordinal()) {
                case 0:
                    str = "null";
                    c19280xC.A0C(Csu, str);
                case 1:
                    AbstractC58321PtD.A1M(c19280xC, Csu, readableMap.getBoolean(Csu));
                case 2:
                    c19280xC.A0A(Csu, Double.valueOf(readableMap.getDouble(Csu)));
                case 3:
                    str = readableMap.getString(Csu);
                    c19280xC.A0C(Csu, str);
                case 4:
                    c19280xC.A05(obtainExtraBundle(readableMap.getMap(Csu)), Csu);
                case 5:
                    c19280xC.A06(obtainExtraArray(readableMap.getArray(Csu)), Csu);
                default:
                    throw new RuntimeException("Unknown data type");
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnalyticsSpec
    public void logEvent(String str, ReadableMap readableMap, String str2) {
        C19280xC analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, readableMap);
        AbstractC31173DnH.A1S(analyticsEvent, this.mSession);
    }

    @Override // com.facebook.fbreact.specs.NativeAnalyticsSpec
    public void logRealtimeEvent(String str, ReadableMap readableMap, String str2) {
        C19280xC analyticsEvent = getAnalyticsEvent(str, str2);
        setDataAsExtra(analyticsEvent, readableMap);
        AbstractC11060iN.A00(this.mSession).EIu(analyticsEvent);
    }
}
