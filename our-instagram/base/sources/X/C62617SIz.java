package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* renamed from: X.SIz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62617SIz {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public final Integer A04;
    public final float[] A05;
    public final int[] A06;

    public C62617SIz(Context context, ReadableMap readableMap) {
        int i;
        String string = readableMap.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        if (C14360o3.A0K(string, "linearGradient")) {
            this.A04 = C05F.A00;
            ReadableMap map = readableMap.getMap("start");
            if (map != null) {
                this.A02 = (float) map.getDouble("x");
                this.A03 = (float) map.getDouble("y");
            }
            ReadableMap map2 = readableMap.getMap("end");
            if (map2 != null) {
                this.A00 = (float) map2.getDouble("x");
                this.A01 = (float) map2.getDouble("y");
            }
            ReadableArray array = readableMap.getArray("colorStops");
            if (array != null) {
                int size = array.size();
                this.A06 = new int[size];
                this.A05 = new float[size];
                for (int i2 = 0; i2 < size; i2++) {
                    ReadableMap map3 = array.getMap(i2);
                    ReadableType type = map3.getType("color");
                    ReadableType readableType = ReadableType.Map;
                    int[] iArr = this.A06;
                    if (type == readableType) {
                        Integer A00 = C63233Sfl.A00(context, map3.getMap("color"));
                        C14360o3.A07(A00);
                        i = A00.intValue();
                    } else {
                        i = map3.getInt("color");
                    }
                    iArr[i2] = i;
                    this.A05[i2] = (float) map3.getDouble("position");
                }
                return;
            }
            throw AbstractC166987dD.A12("Invalid colorStops array");
        }
        throw AbstractC167007dF.A0c("Unsupported gradient type: ", string);
    }
}
