package X;

import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.Vdx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C68900Vdx {
    public final Integer A00;
    public final String A01;

    public C68900Vdx(ReadableMap readableMap) {
        Integer num;
        this.A01 = readableMap.getString("label");
        if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
            num = Integer.valueOf(readableMap.getInt("color"));
        } else {
            num = null;
        }
        this.A00 = num;
    }
}
