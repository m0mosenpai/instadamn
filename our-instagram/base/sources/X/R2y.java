package X;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class R2y extends R2f {
    public static final Pattern A08;
    public R2f A00;
    public Integer A01;
    public Object A02;
    public Object A03;
    public String A04;
    public final String A05;
    public final String A06;
    public final double[] A07;

    /* JADX WARN: Multi-variable type inference failed */
    public R2y(ReadableMap readableMap) {
        super(null);
        double[] dArr;
        double[] dArr2;
        ReadableArray array = readableMap.getArray("inputRange");
        if (array != null) {
            int size = array.size();
            dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = array.getDouble(i);
            }
        } else {
            dArr = new double[0];
        }
        this.A07 = dArr;
        this.A05 = readableMap.getString("extrapolateLeft");
        this.A06 = readableMap.getString("extrapolateRight");
        ReadableArray array2 = readableMap.getArray("outputRange");
        if ("color".equals(readableMap.getString("outputType"))) {
            this.A01 = C05F.A01;
            if (array2 != null) {
                int size2 = array2.size();
                dArr2 = new int[size2];
                for (int i2 = 0; i2 < size2; i2++) {
                    dArr2[i2] = array2.getInt(i2);
                }
            } else {
                dArr2 = new int[0];
            }
        } else {
            if ((array2 != null ? array2.getType(0) : null) == ReadableType.String) {
                this.A01 = C05F.A0C;
                int size3 = array2.size();
                double[][] dArr3 = new double[size3];
                Pattern pattern = A08;
                Matcher matcher = pattern.matcher(array2.getString(0));
                ArrayList A1E = AbstractC166987dD.A1E();
                while (matcher.find()) {
                    String group = matcher.group();
                    C14360o3.A07(group);
                    A1E.add(Double.valueOf(Double.parseDouble(group)));
                }
                int size4 = A1E.size();
                double[] dArr4 = new double[size4];
                int size5 = A1E.size();
                for (int i3 = 0; i3 < size5; i3++) {
                    dArr4[i3] = MSW.A00(A1E.get(i3));
                }
                dArr3[0] = dArr4;
                for (int i4 = 1; i4 < size3; i4++) {
                    double[] dArr5 = new double[size4];
                    Matcher matcher2 = pattern.matcher(array2.getString(i4));
                    for (int i5 = 0; matcher2.find() && i5 < size4; i5++) {
                        String group2 = matcher2.group();
                        C14360o3.A07(group2);
                        dArr5[i5] = Double.parseDouble(group2);
                    }
                    dArr3[i4] = dArr5;
                }
                this.A03 = dArr3;
                this.A04 = array2.getString(0);
                return;
            }
            this.A01 = C05F.A00;
            if (array2 != null) {
                int size6 = array2.size();
                dArr2 = new double[size6];
                for (int i6 = 0; i6 < size6; i6++) {
                    dArr2[i6] = array2.getDouble(i6);
                }
            } else {
                dArr2 = new double[0];
            }
        }
        this.A03 = dArr2;
    }

    static {
        Pattern compile = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");
        C14360o3.A07(compile);
        A08 = compile;
    }

    @Override // X.R2f, X.AbstractC62966SZj
    public final String A03() {
        return AnonymousClass001.A0c("InterpolationAnimatedNode[", "] super: {super.prettyPrint()}", ((AbstractC62966SZj) this).A02);
    }
}
