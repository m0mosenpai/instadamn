package com.instagram.react.modules.base;

import X.AbstractC12990ll;
import X.AbstractC54116NwE;
import X.C06090Tz;
import X.C18V;
import X.C1AC;
import X.InterfaceC10260gi;
import X.R3M;
import com.facebook.fbreact.specs.NativeIGReactQESpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.session.UserSession;

@ReactModule(name = "IGReactQE")
/* loaded from: classes9.dex */
public class IgReactQEModule extends NativeIGReactQESpec {
    public static final int CONFIG_KEY_OFFSET = 12;
    public static final String MODULE_NAME = "IGReactQE";
    public final AbstractC12990ll mSession;

    private String valueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    private String valueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "IGReactQE";
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public boolean mobileConfigBooleanValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigBooleanValueForConfiguration((int) d, (int) d2, z, false);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public boolean mobileConfigBooleanValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigBooleanValueForDeviceConfiguration(d, d2, z);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public boolean mobileConfigBooleanValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigBooleanValueForConfiguration((int) d, (int) d2, z, true);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public boolean mobileConfigBooleanValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigBooleanValueForUserConfiguration(d, d2, z);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigDoubleValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigDoubleValueForConfiguration((int) d, (int) d2, z, false);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigDoubleValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigDoubleValueForDeviceConfiguration(d, d2, z);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigDoubleValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigDoubleValueForConfiguration((int) d, (int) d2, z, true);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigDoubleValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigDoubleValueForUserConfiguration(d, d2, z);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigIntegerValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigIntegerValueForConfiguration((int) d, (int) d2, z, false);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigIntegerValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigIntegerValueForDeviceConfiguration(d, d2, z);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigIntegerValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigIntegerValueForConfiguration((int) d, (int) d2, z, true);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double mobileConfigIntegerValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigIntegerValueForUserConfiguration(d, d2, z);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public String mobileConfigStringValueForDeviceConfiguration(double d, double d2, boolean z) {
        return mobileConfigStringValueForConfiguration((int) d, (int) d2, z, false);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public String mobileConfigStringValueForDeviceConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigStringValueForDeviceConfiguration(d, d2, z);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public String mobileConfigStringValueForUserConfiguration(double d, double d2, boolean z) {
        return mobileConfigStringValueForConfiguration((int) d, (int) d2, z, true);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public String mobileConfigStringValueForUserConfiguration_IG4A_MIGRATION(String str, String str2, double d, double d2, boolean z) {
        return mobileConfigStringValueForUserConfiguration(d, d2, z);
    }

    private InterfaceC10260gi getMobileConfigContext(boolean z) {
        C1AC A01;
        C18V c18v = C18V.A01;
        if (c18v == null) {
            return null;
        }
        if (z) {
            A01 = c18v.A02((UserSession) this.mSession);
        } else {
            A01 = c18v.A01();
        }
        return A01.A01.A00;
    }

    private long getSpecifier(int i, int i2) {
        return AbstractC54116NwE.A00((i << 12) + i2);
    }

    public IgReactQEModule(R3M r3m, AbstractC12990ll abstractC12990ll) {
        super(r3m);
        this.mSession = abstractC12990ll;
    }

    private boolean mobileConfigBooleanValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        InterfaceC10260gi mobileConfigContext = getMobileConfigContext(z2);
        if (mobileConfigContext == null) {
            return false;
        }
        long A00 = AbstractC54116NwE.A00((i << 12) + i2);
        if (A00 == 0) {
            return false;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        return mobileConfigContext.AhE(c06090Tz, A00);
    }

    private Double mobileConfigDoubleValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        InterfaceC10260gi mobileConfigContext = getMobileConfigContext(z2);
        if (mobileConfigContext == null) {
            return null;
        }
        long A00 = AbstractC54116NwE.A00((i << 12) + i2);
        if (A00 == 0) {
            return null;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        return Double.valueOf(mobileConfigContext.AzB(c06090Tz, A00));
    }

    private Double mobileConfigIntegerValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        if (getMobileConfigContext(z2) == null) {
            return null;
        }
        if (AbstractC54116NwE.A00((i << 12) + i2) == 0) {
            return null;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        return Double.valueOf(r6.BPF(c06090Tz, r1));
    }

    private String mobileConfigStringValueForConfiguration(int i, int i2, boolean z, boolean z2) {
        C06090Tz c06090Tz;
        InterfaceC10260gi mobileConfigContext = getMobileConfigContext(z2);
        if (mobileConfigContext == null) {
            return null;
        }
        long A00 = AbstractC54116NwE.A00((i << 12) + i2);
        if (A00 == 0) {
            return null;
        }
        if (z) {
            c06090Tz = C06090Tz.A05;
        } else {
            c06090Tz = C06090Tz.A06;
        }
        return mobileConfigContext.C2x(c06090Tz, A00);
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public boolean booleanValueForDeviceConfiguration(String str, String str2, boolean z) {
        return false;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public boolean booleanValueForUserConfiguration(String str, String str2, boolean z) {
        return false;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double doubleValueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double doubleValueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double integerValueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public Double integerValueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public String stringValueForDeviceConfiguration(String str, String str2, boolean z) {
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeIGReactQESpec
    public String stringValueForUserConfiguration(String str, String str2, boolean z) {
        return null;
    }
}
