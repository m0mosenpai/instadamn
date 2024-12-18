package com.instagram.debug.quickexperiment.storage;

import X.AbstractC20080yf;
import X.C0K8;
import X.C228319l;
import X.C229419w;
import X.C5F7;
import X.C5NW;
import X.InterfaceC08830cm;
import X.OMx;

/* loaded from: classes.dex */
public class QuickExperimentDebugStore {
    public static final long NOT_FOUND_SPECIFIER = -1;
    public static final String TAG = "QuickExperimentDebugStore";
    public final OMx mOverrideUtil;
    public final InterfaceC08830cm mParamsMapProvider;

    public static QuickExperimentDebugStore create(C229419w c229419w, final C229419w c229419w2) {
        C228319l A0A;
        if (c229419w != null) {
            A0A = c229419w.A0A();
        } else {
            A0A = c229419w2.A0A();
        }
        OMx oMx = new OMx(A0A, c229419w, c229419w2);
        if (c229419w != null) {
            c229419w2 = c229419w;
        }
        return new QuickExperimentDebugStore(oMx, new InterfaceC08830cm() { // from class: com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore.1
            @Override // X.InterfaceC08830cm
            public C5F7 get() {
                return C229419w.this.A0B();
            }
        });
    }

    private long getSpecifier(AbstractC20080yf abstractC20080yf) {
        C5NW A00;
        long j = abstractC20080yf.mobileConfigSpecifier;
        if (j <= 0) {
            C5F7 c5f7 = (C5F7) this.mParamsMapProvider.get();
            if (c5f7 == null || (A00 = c5f7.A00(abstractC20080yf.universeName, abstractC20080yf.name)) == null) {
                return -1L;
            }
            return A00.A00();
        }
        return j;
    }

    private boolean isParamSpecifierOverridden(long j) {
        int i = (int) ((j >>> 48) & 63);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    return this.mOverrideUtil.A0B(j);
                }
                return this.mOverrideUtil.A0D(j);
            }
            return this.mOverrideUtil.A0C(j);
        }
        return this.mOverrideUtil.A0A(j);
    }

    public void removeAll() {
        this.mOverrideUtil.A03();
    }

    public QuickExperimentDebugStore(OMx oMx, InterfaceC08830cm interfaceC08830cm) {
        this.mOverrideUtil = oMx;
        this.mParamsMapProvider = interfaceC08830cm;
    }

    public String getOverriddenParameter(AbstractC20080yf abstractC20080yf) {
        long specifier = getSpecifier(abstractC20080yf);
        if (specifier == -1) {
            C0K8.A0P(TAG, "[getOverriddenParameter] MobileConfig failed to find %s.%s", abstractC20080yf.universeName, abstractC20080yf.name);
        } else if (isParamSpecifierOverridden(specifier)) {
            int i = (int) ((specifier >>> 48) & 63);
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return Double.toString(this.mOverrideUtil.A00(specifier));
                        }
                    } else {
                        return this.mOverrideUtil.A02(specifier);
                    }
                } else {
                    return Long.toString(this.mOverrideUtil.A01(specifier));
                }
            } else {
                return Boolean.toString(this.mOverrideUtil.A09(specifier));
            }
        }
        return null;
    }

    public boolean isParameterOverridden(AbstractC20080yf abstractC20080yf) {
        long specifier = getSpecifier(abstractC20080yf);
        if (specifier == -1) {
            C0K8.A0P(TAG, "[isParameterOverridden] MobileConfig failed to find %s.%s", abstractC20080yf.universeName, abstractC20080yf.name);
            return false;
        }
        return isParamSpecifierOverridden(specifier);
    }

    public void putOverriddenParameter(AbstractC20080yf abstractC20080yf, String str) {
        long specifier = getSpecifier(abstractC20080yf);
        if (specifier == -1) {
            C0K8.A0P(TAG, "[putOverriddenParameter] MobileConfig failed to find %s.%s", abstractC20080yf.universeName, abstractC20080yf.name);
            return;
        }
        int i = (int) ((specifier >>> 48) & 63);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    this.mOverrideUtil.A05(specifier, Double.parseDouble(str));
                    return;
                }
                this.mOverrideUtil.A07(specifier, str);
                return;
            }
            this.mOverrideUtil.A06(specifier, Long.parseLong(str));
            return;
        }
        this.mOverrideUtil.A08(specifier, Boolean.parseBoolean(str));
    }

    public void removeOverriddenParameter(AbstractC20080yf abstractC20080yf) {
        long specifier = getSpecifier(abstractC20080yf);
        if (specifier != -1) {
            this.mOverrideUtil.A04(specifier);
        }
    }
}
