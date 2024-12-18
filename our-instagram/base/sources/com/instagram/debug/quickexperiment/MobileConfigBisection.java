package com.instagram.debug.quickexperiment;

import X.AbstractC12990ll;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC25228BEl;
import X.AbstractC68225VIl;
import X.AbstractC68567VVu;
import X.AbstractC70143W6w;
import X.AnonymousClass001;
import X.C05F;
import X.C06090Tz;
import X.C0K8;
import X.C0U3;
import X.C14360o3;
import X.C17280tP;
import X.C19V;
import X.C1AB;
import X.C229419w;
import X.XE7;
import X.XER;
import android.content.Context;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.facebook.mobileconfig.troubleshooting.BisectDefaultValuesProvider;
import com.facebook.mobileconfig.troubleshooting.BisectHelperHolder;
import com.facebook.mobileconfig.troubleshooting.MobileConfigOverridesWriterHolder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class MobileConfigBisection {
    public static final String BISECT_DIR = "mobileconfig";
    public static final MobileConfigBisection INSTANCE = new Object();
    public static final String OVERRIDES_FIELD = "overrides";
    public static final String RAW_OVERRIDES_FILE_NAME = "mobileconfig/overrides_raw_response.txt";
    public static final String TAG = "MobileConfigBisection";
    public static XE7 bisectHelper;

    public static final void initialize(Context context, String str, AbstractC12990ll abstractC12990ll, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        C14360o3.A0B(context, 0);
        AbstractC167027dH.A13(str, abstractC12990ll, lightweightQuickPerformanceLogger);
        AbstractC68225VIl.A01 = C19V.A00(context, lightweightQuickPerformanceLogger, abstractC12990ll, null, str, AbstractC70143W6w.A01(0, 9, 101), null, 2, false, false);
        C1AB c1ab = AbstractC68225VIl.A01;
        C14360o3.A07(c1ab);
        INSTANCE.createAndSetBisectHelper(c1ab, context);
    }

    public static final boolean startBisect(Context context, String str, AbstractC12990ll abstractC12990ll, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        boolean A1R = AbstractC167007dF.A1R(0, context, str);
        AbstractC167007dF.A1E(abstractC12990ll, 2, lightweightQuickPerformanceLogger);
        AbstractC68225VIl.A01 = C19V.A00(context, lightweightQuickPerformanceLogger, abstractC12990ll, null, str, AbstractC70143W6w.A01(0, 9, 101), null, 2, false, false);
        C1AB c1ab = AbstractC68225VIl.A01;
        C14360o3.A07(c1ab);
        C17280tP.A4E.A00().A0D(str);
        C0U3 c0u3 = new C0U3();
        c0u3.A00 = 30000;
        c0u3.A02 = C05F.A0C;
        C229419w c229419w = c1ab.A00;
        c229419w.A0C();
        if (!c229419w.A0A().updateConfigs(c0u3)) {
            C0K8.A0P(TAG, "Failed to update configs for %s after %dms.", AbstractC25228BEl.A1Z(str, c0u3.A00));
            C17280tP A00 = C17280tP.A00();
            AbstractC68225VIl.A01 = null;
            A00.A0D(null);
            return false;
        }
        MobileConfigBisection mobileConfigBisection = INSTANCE;
        mobileConfigBisection.createAndSetBisectHelper(c1ab, context);
        mobileConfigBisection.onUpdatedConfigs(context, c1ab, str);
        return A1R;
    }

    private final void createAndSetBisectHelper(C1AB c1ab, Context context) {
        final C229419w c229419w = c1ab.A00;
        C14360o3.A0C(c229419w.A0A(), "null cannot be cast to non-null type com.facebook.mobileconfig.MobileConfigManagerHolderImpl");
        BisectHelperHolder newMCBisectHelper = new MobileConfigOverridesWriterHolder(null).getNewMCBisectHelper(new BisectDefaultValuesProvider() { // from class: com.instagram.debug.quickexperiment.MobileConfigBisection$createAndSetBisectHelper$bisectDefaultValuesProvider$1
            @Override // com.facebook.mobileconfig.troubleshooting.BisectDefaultValuesProvider
            public final String getMobileConfigFieldValue(long j) {
                String valueOf;
                String str;
                C229419w c229419w2 = C229419w.this;
                HashMap hashMap = new HashMap();
                int i = (int) ((j >>> 48) & 63);
                C06090Tz c06090Tz = C06090Tz.A06;
                C06090Tz A00 = C06090Tz.A00(c06090Tz);
                A00.A02 = true;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                valueOf = "UNSUPPORTED TYPE";
                            } else {
                                valueOf = String.valueOf(c229419w2.AzB(A00, j));
                            }
                        } else if (((j >>> 60) & 1) == 1) {
                            valueOf = c229419w2.C2y(c06090Tz, "__fbt_null__", j);
                        } else {
                            valueOf = c229419w2.C2x(c06090Tz, j);
                        }
                    } else {
                        valueOf = String.valueOf(c229419w2.BPF(A00, j));
                    }
                } else {
                    valueOf = String.valueOf(c229419w2.AhE(A00, j));
                }
                hashMap.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, valueOf);
                MobileConfigValueSource mobileConfigValueSource = A00.A00.A00;
                int ordinal = mobileConfigValueSource.ordinal();
                if (ordinal != 1 && ordinal != 0) {
                    if (ordinal != 2) {
                        str = AnonymousClass001.A0c("default[", "]", mobileConfigValueSource.getSource());
                    } else {
                        str = QuickExperimentDumperPlugin.OVERRIDE_CMD;
                    }
                    hashMap.put(CacheBehaviorLogger.SOURCE, str);
                }
                String str2 = (String) hashMap.get(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                if (str2 == null) {
                    return "";
                }
                return str2;
            }
        });
        bisectHelper = newMCBisectHelper;
        try {
            C14360o3.A0A(newMCBisectHelper);
            newMCBisectHelper.setBisectPath(new File(context.getFilesDir(), BISECT_DIR).getCanonicalPath());
        } catch (IOException e) {
            C0K8.A0H(TAG, "Failed to set bisect path", e);
        }
    }

    public static final XER getBisectState() {
        if (!INSTANCE.isInitialized("Failed getBisectState sBisectHelper not initialized.")) {
            return null;
        }
        XE7 xe7 = bisectHelper;
        C14360o3.A0A(xe7);
        return ((BisectHelperHolder) xe7).getCurrentState();
    }

    public static final boolean goBackOneStep() {
        if (INSTANCE.isInitialized("Failed goBackOneStep sBisectHelper not initialized.")) {
            XE7 xe7 = bisectHelper;
            C14360o3.A0A(xe7);
            if (xe7.goBackOneStep()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isInitialized(String str) {
        if (bisectHelper == null) {
            C0K8.A0D(TAG, str);
            return false;
        }
        return true;
    }

    private final void onUpdatedConfigs(Context context, C1AB c1ab, String str) {
        String str2;
        TreeMap A02 = c1ab.A02(false);
        C17280tP A00 = C17280tP.A00();
        AbstractC68225VIl.A01 = null;
        A00.A0D(null);
        try {
            FileWriter fileWriter = new FileWriter(new File(context.getFilesDir(), RAW_OVERRIDES_FILE_NAME));
            try {
                String A002 = AbstractC68567VVu.A00(A02);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(OVERRIDES_FIELD, A002);
                fileWriter.write(jSONObject.toString());
                fileWriter.close();
                startUsingExistingFile(str);
                fileWriter.close();
            } finally {
            }
        } catch (IOException e) {
            e = e;
            str2 = "Failed to write overrides.";
            C0K8.A0H(TAG, str2, e);
        } catch (JSONException e2) {
            e = e2;
            str2 = "Failed to write json overrides.";
            C0K8.A0H(TAG, str2, e);
        }
    }

    public static final void startUsingExistingFile(String str) {
        if (INSTANCE.isInitialized("Failed startUsingExistingFile sBisectHelper not initialized.")) {
            XE7 xe7 = bisectHelper;
            C14360o3.A0A(xe7);
            xe7.startUsingExistingFile(str);
        }
    }

    public static final boolean stopBisection() {
        if (!INSTANCE.isInitialized("Failed stopBisection sBisectHelper not initialized.")) {
            return false;
        }
        XE7 xe7 = bisectHelper;
        C14360o3.A0A(xe7);
        return xe7.stopBisection();
    }

    public static final boolean userDidNotReproduceBug() {
        if (INSTANCE.isInitialized("Failed userDidNotReproduceBug sBisectHelper not initialized.")) {
            XE7 xe7 = bisectHelper;
            C14360o3.A0A(xe7);
            if (xe7.userDidNotReproduceBug()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean userDidReproduceBug() {
        if (INSTANCE.isInitialized("Failed userDidReproduceBug sBisectHelper not initialized.")) {
            XE7 xe7 = bisectHelper;
            C14360o3.A0A(xe7);
            if (xe7.userDidReproduceBug()) {
                return true;
            }
        }
        return false;
    }
}
