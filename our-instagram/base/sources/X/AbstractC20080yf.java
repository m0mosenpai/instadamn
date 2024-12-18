package X;

import java.util.Arrays;

/* renamed from: X.0yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC20080yf {
    public Object defaultValueOverride;
    public final long mobileConfigSpecifier;
    public final String name;
    public final EnumC20090yg universeExperimentType;
    public final String universeName;

    public AbstractC20080yf(String str, String str2, EnumC20090yg enumC20090yg, long j) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(enumC20090yg, 3);
        this.name = str;
        this.universeName = str2;
        this.universeExperimentType = enumC20090yg;
        this.mobileConfigSpecifier = j;
    }

    public boolean equals(Object obj) {
        AbstractC20080yf abstractC20080yf;
        return this == obj || ((obj instanceof AbstractC20080yf) && (abstractC20080yf = (AbstractC20080yf) obj) != null && this.mobileConfigSpecifier == abstractC20080yf.mobileConfigSpecifier);
    }

    public final int getConfigKey() {
        try {
            return AbstractC20120yj.A00(this.mobileConfigSpecifier);
        } catch (C0UI e) {
            C0K8.A0M("ExperimentParameter", "Failed to get config key with specifier:%d", e, Long.valueOf(this.mobileConfigSpecifier));
            return -1;
        }
    }

    public final Object getDefaultValue() {
        Object obj = this.defaultValueOverride;
        if (obj == null) {
            long j = this.mobileConfigSpecifier;
            int i = (int) ((j >>> 48) & 63);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Double.valueOf(AbstractC20110yi.A00(j));
                        }
                        throw new IllegalStateException(AnonymousClass001.A03(i, " is not supported"));
                    }
                    return AbstractC20110yi.A02(j);
                }
                return Long.valueOf(AbstractC20110yi.A01(j));
            }
            boolean z = false;
            if (((j >>> 61) & 1) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return obj;
    }

    public final long getMobileConfigSpecifier() {
        return this.mobileConfigSpecifier;
    }

    public final String getName() {
        return this.name;
    }

    public final int getParamKey() {
        return C0UM.A00(this.mobileConfigSpecifier);
    }

    public final int getUnitType() {
        return (int) ((this.mobileConfigSpecifier >>> 54) & 63);
    }

    public final EnumC20090yg getUniverseExperimentType() {
        return this.universeExperimentType;
    }

    public final String getUniverseName() {
        return this.universeName;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.mobileConfigSpecifier)});
    }

    public final void setDefaultValueOverride(Object obj) {
        this.defaultValueOverride = obj;
    }
}
