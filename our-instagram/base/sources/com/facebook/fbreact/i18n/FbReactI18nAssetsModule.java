package com.facebook.fbreact.i18n;

import X.AbstractC166987dD;
import X.C09170dP;
import X.C0I2;
import android.content.Context;
import com.facebook.R;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

@ReactModule(canOverrideExistingModule = true, isCxxModule = true, name = "I18nAssets")
/* loaded from: classes10.dex */
public class FbReactI18nAssetsModule extends CxxModuleWrapper implements TurboModule {
    public static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "I18nAssets";

    public FbReactI18nAssetsModule(Context context, int i) {
        this(context, 0, i, "");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x004a: MOVE (r5 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:74), block:B:38:0x004a */
    public static ByteBuffer getAsset(Context context, int i) {
        InputStream inputStream;
        InputStream inputStream2;
        InputStream inputStream3 = null;
        try {
            if (i == 0) {
                return null;
            }
            try {
                inputStream2 = context.getResources().openRawResource(i);
                try {
                    int available = inputStream2.available() + 1;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(available);
                    int i2 = available - 1;
                    if (inputStream2.read(allocateDirect.array(), allocateDirect.arrayOffset(), available) == i2) {
                        allocateDirect.put(i2, (byte) 0);
                        try {
                            inputStream2.close();
                        } catch (IOException unused) {
                        }
                        return allocateDirect;
                    }
                    throw AbstractC166987dD.A18("stream.available is incorrect and so are your assumptions");
                } catch (IOException e) {
                    e = e;
                    C0I2.A06("ReactNative", "Unable to process I18n asset", e);
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                inputStream2 = null;
            } catch (Throwable th) {
                th = th;
                if (inputStream3 != null) {
                    try {
                        inputStream3.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream3 = inputStream;
        }
    }

    public static native HybridData initHybrid(Context context, int i, int i2, int i3, int i4, int i5, String str);

    @Override // com.facebook.react.bridge.CxxModuleWrapperBase, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    static {
        C09170dP.A0C("fbreact-i18nassetsmodule");
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2) {
        this(context, i, i2, "");
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2, String str) {
        super(initHybrid(context, i, R.raw.currency_format_config, R.raw.date_format_config, R.raw.number_format_config, i2, str));
    }
}
