package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class AWU implements C90D, BCI {
    public BCT A00;
    public boolean A01;
    public boolean A02;
    public final Integer A03;
    public final List A04 = AbstractC166987dD.A1E();

    @Override // X.BCI
    public final List Epm(Bundle bundle) {
        BCT bct;
        EnumC222959sa enumC222959sa;
        BCT bct2;
        C14360o3.A0B(bundle, 0);
        if (bundle.containsKey("commandType")) {
            int i = bundle.getInt("commandType");
            if (i == 4) {
                if (bundle.containsKey("hasRawData")) {
                    this.A01 = bundle.getBoolean("hasRawData");
                }
                if (bundle.containsKey("isSensorAvailable")) {
                    this.A02 = bundle.getBoolean("isSensorAvailable");
                }
            } else if (i == 2) {
                if (bundle.containsKey("deviceRotationMatrix") && bundle.containsKey("acceleration") && bundle.containsKey("gravity") && bundle.containsKey("rotation") && bundle.containsKey("timestampNs")) {
                    float[] floatArray = bundle.getFloatArray("deviceRotationMatrix");
                    float[] floatArray2 = bundle.getFloatArray("acceleration");
                    float[] floatArray3 = bundle.getFloatArray("gravity");
                    float[] floatArray4 = bundle.getFloatArray("rotation");
                    long j = bundle.getLong("timestampNs");
                    if (floatArray != null && floatArray2 != null && floatArray3 != null && floatArray4 != null && (bct2 = this.A00) != null) {
                        bct2.onDataChanged(floatArray, floatArray2, floatArray3, floatArray4, j);
                    }
                }
            } else if (i == 3 && bundle.containsKey("measurementType") && bundle.containsKey("data") && bundle.containsKey("timestampNs")) {
                int i2 = bundle.getInt("measurementType");
                float[] floatArray5 = bundle.getFloatArray("data");
                long j2 = bundle.getLong("timestampNs");
                if (floatArray5 != null && (bct = this.A00) != null) {
                    switch (i2) {
                        case 1:
                            enumC222959sa = EnumC222959sa.ATTITUDE;
                            break;
                        case 2:
                            enumC222959sa = EnumC222959sa.GRAVITY;
                            break;
                        case 3:
                            enumC222959sa = EnumC222959sa.ACCELERATION;
                            break;
                        case 4:
                            enumC222959sa = EnumC222959sa.ROTATION_RATE;
                            break;
                        case 5:
                            enumC222959sa = EnumC222959sa.RAW_GYROSCOPE;
                            break;
                        case 6:
                            enumC222959sa = EnumC222959sa.RAW_ACCELEROMETER;
                            break;
                        case 7:
                            enumC222959sa = EnumC222959sa.RAW_MAGNETOMETER;
                            break;
                        default:
                            enumC222959sa = EnumC222959sa.UNKNOWN;
                            break;
                    }
                    bct.onRawSensorMeasurementChanged(enumC222959sa, floatArray5, j2);
                }
            }
        }
        List list = this.A04;
        ArrayList A0U = AbstractC001800i.A0U(list);
        list.clear();
        return A0U;
    }

    @Override // X.C90D
    public final Integer B2u() {
        Integer num;
        Integer num2 = this.A03;
        if (num2 != null) {
            if (num2.intValue() != 1) {
                num = C05F.A01;
            } else {
                num = C05F.A00;
            }
            C14360o3.A07(num);
            return num;
        }
        return C05F.A00;
    }

    @Override // X.C90D
    public final boolean CLa() {
        return this.A01;
    }

    @Override // X.C90D
    public final boolean Ccq(int i) {
        if (i != 0) {
            C0K8.A0C("MotionDataSource", "Only supports RotationVector Sensor type");
            return false;
        }
        return this.A02;
    }

    @Override // X.C90D
    public final void start() {
        AbstractC167027dH.A15(C05F.A00, this.A04, AbstractC167007dF.A0o("serviceType", 51));
    }

    @Override // X.C90D
    public final void stop() {
        AbstractC167027dH.A15(C05F.A01, this.A04, AbstractC167007dF.A0o("serviceType", 51));
    }

    public AWU(Integer num) {
        this.A03 = num;
    }

    @Override // X.C90D
    public final void A8z(BCT bct) {
        this.A00 = bct;
    }
}
