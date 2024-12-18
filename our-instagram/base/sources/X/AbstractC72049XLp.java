package X;

import android.graphics.Paint;
import android.media.AudioFormat;
import android.media.MediaCodec;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.json.FbJsonField;
import com.facebook.forker.Process;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastInitResponse;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.instagram.debug.trainyardtracker.TrainyardEventType;
import com.instagram.debug.trainyardtracker.TrainyardExecutorEvent;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.XLp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72049XLp {
    /* JADX WARN: Multi-variable type inference failed */
    public static TrainyardExecutorEvent A07(TrainyardEventType trainyardEventType) {
        int i = 0;
        return new TrainyardExecutorEvent(i, i, i, i, null, trainyardEventType, 0L, 95, 0 == true ? 1 : 0);
    }

    public static Integer A08(ReactShadowNodeImpl reactShadowNodeImpl, Object obj) {
        if (obj == null) {
            return null;
        }
        R3N r3n = reactShadowNodeImpl.A0A;
        AbstractC05810Sj.A00(r3n);
        return C63233Sfl.A01(r3n, obj, 0);
    }

    public static void A0D(int i) {
        if (i > 6) {
            StringBuilder sb = new StringBuilder();
            sb.append("Stream error returned an unknown code: ");
            sb.append(i);
            sb.append(". It may be dataX error: ");
            sb.append(new C63206SfA(i));
            C0K8.A0D("StreamError", sb.toString());
        }
    }

    public static boolean A0X(String str, String str2, AbstractMap abstractMap) {
        abstractMap.put(str, new C63003SaR(str, str2, null, 0, 1, true));
        return false;
    }

    public static float A01(Object obj, float f) {
        if (obj instanceof Double) {
            return ((Number) obj).floatValue();
        }
        return f;
    }

    public static Paint A03() {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(15.0f);
        return paint;
    }

    public static AudioFormat A04(int i, int i2) {
        return new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build();
    }

    public static FbJsonField A05(String str) {
        return FbJsonField.jsonField(VideoBroadcastInitResponse.class.getDeclaredField(str), (Class) null, (TIZ) null);
    }

    public static RuntimeException A09(C39911tF c39911tF, Throwable th) {
        return new RuntimeException(AnonymousClass001.A0R("Failed to create instance of ", c39911tF.A02.getName()), th);
    }

    public static String A0C(Map map) {
        map.put("bottom", "Dynamic");
        map.put("collapsable", "boolean");
        map.put("collapsableChildren", "boolean");
        map.put("color", "Color");
        map.put("columnGap", "Dynamic");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("experimental_layoutConformance", "String");
        return "Dynamic";
    }

    public static void A0E(InterfaceC37481ol interfaceC37481ol) {
        interfaceC37481ol.E7O("PRAGMA wal_checkpoint(FULL)").close();
        if (!((C37471ok) interfaceC37481ol).A00.inTransaction()) {
            interfaceC37481ol.ATG("VACUUM");
        }
    }

    public static void A0H(InterfaceC02590Ai interfaceC02590Ai, C11520jB c11520jB, Integer num, String str) {
        interfaceC02590Ai.AAP(str, (String) c11520jB.A01(new C11500j9(num, str)));
    }

    public static void A0I(AbstractC223559ty abstractC223559ty, C23014ACo c23014ACo, Object obj) {
        abstractC223559ty.A00("profile", c23014ACo.A06);
        abstractC223559ty.A00("b_frames", String.valueOf(c23014ACo.A07));
        abstractC223559ty.A00("explicitly_set_baseline", String.valueOf(c23014ACo.A08));
        abstractC223559ty.A00("size", AnonymousClass001.A0P("x", c23014ACo.A05, c23014ACo.A04));
        abstractC223559ty.A00(TraceFieldType.Bitrate, String.valueOf(c23014ACo.A00));
        abstractC223559ty.A00("frameRate", String.valueOf(c23014ACo.A03));
        abstractC223559ty.A00("iFrameIntervalS", String.valueOf(5));
        if (obj instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) obj;
            abstractC223559ty.A00("isRecoverable", String.valueOf(codecException.isRecoverable()));
            abstractC223559ty.A00("isTransient", String.valueOf(codecException.isTransient()));
        }
    }

    public static void A0J(LayoutShadowNode layoutShadowNode, Object obj, String str) {
        if (str.equals("columnGap")) {
            layoutShadowNode.setColumnGap(new T02(obj));
        }
    }

    public static void A0K(EnumC72411Xcz enumC72411Xcz, String str, String str2) {
        new PlayerOrigin(enumC72411Xcz, str);
        new PlayerOrigin(enumC72411Xcz, str2);
    }

    public static void A0L(Object obj, Object obj2, Object obj3, Map map) {
        map.put(obj, obj2);
        map.put("overflow", "String");
        map.put("padding", obj3);
        map.put("paddingBlock", obj3);
        map.put("paddingBlockEnd", obj3);
        map.put("paddingBlockStart", obj3);
        map.put("paddingBottom", obj3);
        map.put("paddingEnd", obj3);
        map.put("paddingHorizontal", obj3);
        map.put("paddingInline", obj3);
        map.put("paddingInlineEnd", obj3);
        map.put("paddingInlineStart", obj3);
        map.put("paddingLeft", obj3);
        map.put("paddingRight", obj3);
        map.put("paddingStart", obj3);
        map.put("paddingTop", obj3);
        map.put("paddingVertical", obj3);
    }

    public static void A0M(Object obj, Map map) {
        map.put("maxFontSizeMultiplier", "number");
        map.put("maxHeight", obj);
        map.put("maxWidth", obj);
        map.put("minHeight", obj);
        map.put("minWidth", obj);
        map.put("minimumFontScale", "number");
    }

    public static void A0N(Object obj, Map map) {
        map.put("margin", obj);
        map.put("marginBlock", obj);
        map.put("marginBlockEnd", obj);
        map.put("marginBlockStart", obj);
        map.put("marginBottom", obj);
        map.put("marginEnd", obj);
        map.put("marginHorizontal", obj);
        map.put("marginInline", obj);
        map.put("marginInlineEnd", obj);
        map.put("marginInlineStart", obj);
        map.put("marginLeft", obj);
        map.put("marginRight", obj);
        map.put("marginStart", obj);
        map.put("marginTop", obj);
        map.put("marginVertical", obj);
    }

    public static void A0O(Object obj, Map map) {
        map.put("flex", "number");
        map.put("flexBasis", obj);
        map.put("flexDirection", "String");
        map.put("flexGrow", "number");
        map.put("flexShrink", "number");
        map.put("flexWrap", "String");
        map.put("fontFamily", "String");
        map.put("fontSize", "number");
        map.put("fontStyle", "String");
        map.put("fontVariant", "Array");
        map.put("fontWeight", "String");
        map.put("gap", obj);
        map.put(IgReactMediaPickerNativeModule.HEIGHT, obj);
        map.put("includeFontPadding", "boolean");
        map.put("inset", obj);
        map.put("insetBlock", obj);
        map.put("insetBlockEnd", obj);
        map.put("insetBlockStart", obj);
        map.put("insetInline", obj);
        map.put("insetInlineEnd", obj);
        map.put("insetInlineStart", obj);
        map.put("justifyContent", "String");
        map.put("left", obj);
        map.put("letterSpacing", "number");
        map.put("lineHeight", "number");
    }

    public static void A0P(Object obj, Map map) {
        map.put("collapsableChildren", obj);
        map.put("columnGap", "Dynamic");
        map.put("display", "String");
        map.put("end", "Dynamic");
        map.put("experimental_layoutConformance", "String");
        map.put("flex", "number");
        map.put("flexBasis", "Dynamic");
        map.put("flexDirection", "String");
        map.put("flexGrow", "number");
        map.put("flexShrink", "number");
        map.put("flexWrap", "String");
        map.put("gap", "Dynamic");
        map.put(IgReactMediaPickerNativeModule.HEIGHT, "Dynamic");
        map.put("inset", "Dynamic");
        map.put("insetBlock", "Dynamic");
        map.put("insetBlockEnd", "Dynamic");
        map.put("insetBlockStart", "Dynamic");
        map.put("insetInline", "Dynamic");
        map.put("insetInlineEnd", "Dynamic");
        map.put("insetInlineStart", "Dynamic");
        map.put("justifyContent", "String");
        map.put("left", "Dynamic");
    }

    public static void A0Q(Object obj, Map map) {
        map.put("maxHeight", "Dynamic");
        map.put("maxWidth", "Dynamic");
        map.put("minHeight", "Dynamic");
        map.put("minWidth", "Dynamic");
        map.put("onLayout", obj);
        map.put("onPointerEnter", obj);
        map.put("onPointerLeave", obj);
    }

    public static void A0R(Object obj, Map map) {
        map.put("position", "String");
        map.put("right", obj);
        map.put("role", "String");
        map.put("rowGap", obj);
        map.put("start", obj);
    }

    public static void A0S(Object obj, Map map) {
        map.put("textAlign", "String");
        map.put("textBreakStrategy", "String");
        map.put("textDecorationLine", "String");
        map.put("textShadowColor", "Color");
        map.put("textShadowOffset", "Map");
        map.put("textShadowRadius", "number");
        map.put("textTransform", "String");
        map.put("top", obj);
        map.put(IgReactMediaPickerNativeModule.WIDTH, obj);
    }

    public static void A0T(Map map) {
        map.put("alignContent", "String");
        map.put("alignItems", "String");
        map.put("alignSelf", "String");
    }

    public static void A0U(Map map) {
        map.put("borderBottomWidth", "number");
        map.put("borderEndWidth", "number");
        map.put("borderLeftWidth", "number");
        map.put("borderRightWidth", "number");
        map.put("borderStartWidth", "number");
        map.put("borderTopWidth", "number");
        map.put("borderWidth", "number");
    }

    public static void A0V(Map map) {
        map.put("numberOfLines", "number");
        map.put("onLayout", "boolean");
        map.put("onPointerEnter", "boolean");
        map.put("onPointerLeave", "boolean");
    }

    public static void A0W(Map map) {
        map.put("position", "String");
        map.put("right", "Dynamic");
        map.put("rowGap", "Dynamic");
        map.put("start", "Dynamic");
        map.put("top", "Dynamic");
        map.put(IgReactMediaPickerNativeModule.WIDTH, "Dynamic");
    }

    public static double A00(C19260xA c19260xA, String str) {
        Double A02 = c19260xA.A02(str);
        if (A02 != null) {
            return A02.doubleValue();
        }
        return -1.0d;
    }

    public static int A02(Object obj) {
        return (527 + obj.hashCode()) * 31;
    }

    public static C72215XYl A06(C72215XYl c72215XYl, C1AI c1ai, C1AI c1ai2, int i) {
        int A02 = c1ai.A02(i);
        if (A02 != 0) {
            int i2 = A02 + c1ai.A00;
            int i3 = i2 + c1ai.A01.getInt(i2);
            ByteBuffer byteBuffer = c1ai.A01;
            c1ai2.A00 = i3;
            c1ai2.A01 = byteBuffer;
            return c72215XYl;
        }
        return null;
    }

    public static String A0A(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "TYPE_USB_ACCESSORY";
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case Process.SIGTERM /* 15 */:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case Process.SIGSTOP /* 19 */:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static String A0B(StringBuilder sb, int i) {
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public static void A0F(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("media_type", (Long) c11520jB.A01(c11500j9));
        interfaceC02590Ai.A9K("media_index", (Long) c11520jB.A01(C5I8.A5N));
    }

    public static void A0G(InterfaceC02590Ai interfaceC02590Ai, C11500j9 c11500j9, C11520jB c11520jB) {
        interfaceC02590Ai.A9K("ad_id_long", (Long) c11520jB.A01(c11500j9));
        interfaceC02590Ai.A8I("tap_x_position", (Double) c11520jB.A01(C5I8.A8w));
        interfaceC02590Ai.A8I("tap_y_position", (Double) c11520jB.A01(C5I8.A8x));
    }
}
