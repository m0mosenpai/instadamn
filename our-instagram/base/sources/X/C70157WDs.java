package X;

import com.facebook.react.bridge.ReadableArray;

/* renamed from: X.WDs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70157WDs {
    public static void A00(ReadableArray readableArray, XD5 xd5, Object obj) {
        xd5.scrollTo(obj, new C69060VhB(Math.round(WF1.A01((float) readableArray.getDouble(0))), Math.round(WF1.A01((float) readableArray.getDouble(1))), readableArray.getBoolean(2)));
    }

    public static void A01(ReadableArray readableArray, XD5 xd5, Object obj, int i) {
        AbstractC05810Sj.A00(obj);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    xd5.flashScrollIndicators(obj);
                    return;
                }
                throw new IllegalArgumentException(String.format("Unsupported command %d received by %s.", Integer.valueOf(i), AbstractC31173DnH.A0q(xd5)));
            }
            AbstractC05810Sj.A00(readableArray);
            xd5.scrollToEnd(obj, new C68689VaP(readableArray.getBoolean(0)));
            return;
        }
        AbstractC05810Sj.A00(readableArray);
        A00(readableArray, xd5, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    public static void A02(ReadableArray readableArray, XD5 xd5, Object obj, String str) {
        AbstractC05810Sj.A00(obj);
        switch (str.hashCode()) {
            case -402165208:
                if (str.equals("scrollTo")) {
                    AbstractC05810Sj.A00(readableArray);
                    A00(readableArray, xd5, obj);
                    return;
                }
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, AbstractC31173DnH.A0q(xd5)));
            case 28425985:
                if (str.equals("flashScrollIndicators")) {
                    xd5.flashScrollIndicators(obj);
                    return;
                }
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, AbstractC31173DnH.A0q(xd5)));
            case 2055114131:
                if (str.equals("scrollToEnd")) {
                    AbstractC05810Sj.A00(readableArray);
                    xd5.scrollToEnd(obj, new C68689VaP(readableArray.getBoolean(0)));
                    return;
                }
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, AbstractC31173DnH.A0q(xd5)));
            default:
                throw new IllegalArgumentException(String.format("Unsupported command %s received by %s.", str, AbstractC31173DnH.A0q(xd5)));
        }
    }
}
