package X;

import com.facebook.profilo.config.ConfigParams;
import java.util.Arrays;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0w3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18760w3 implements C0V1 {
    public static final InterfaceC06330Uz A00;

    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.profilo.config.ConfigParams, java.lang.Object] */
    static {
        TimeUnit.HOURS.toSeconds(1L);
        final ?? obj = new Object();
        final C0V2[] c0v2Arr = new C0V2[0];
        A00 = new InterfaceC06330Uz(obj, c0v2Arr) { // from class: X.0vy
            public final ConfigParams A00;
            public final C0V2[] A01;

            @Override // X.InterfaceC06330Uz
            public final int[] getTraceConfigIdxs(String str, String str2) {
                return Arrays.copyOf(new int[0], 0);
            }

            @Override // X.InterfaceC06330Uz
            public final long getID() {
                return 0L;
            }

            @Override // X.InterfaceC06330Uz
            public final int optSystemConfigParamInt(String str, int i) {
                TreeMap treeMap = this.A00.intParams;
                Object valueOf = Integer.valueOf(i);
                if (treeMap != null && treeMap.containsKey(str)) {
                    valueOf = treeMap.get(str);
                }
                return ((Number) valueOf).intValue();
            }

            {
                this.A00 = obj;
                this.A01 = c0v2Arr;
            }

            @Override // X.InterfaceC06330Uz
            public final int getTraceConfigParamInt(int i, String str) {
                throw new NullPointerException("params");
            }

            @Override // X.InterfaceC06330Uz
            public final ConfigParams getTraceConfigParams(int i) {
                getTraceConfigParams(i);
                throw null;
            }

            @Override // X.InterfaceC06330Uz
            public final String[] getTraceConfigProviders(int i) {
                throw new NullPointerException("enabledProviders");
            }

            @Override // X.InterfaceC06330Uz
            public final int getTraceConfigTriggerParamInt(int i, String str, String str2, String str3) {
                throw new NullPointerException("triggers");
            }

            @Override // X.InterfaceC06330Uz
            public final boolean optTraceConfigParamBool(int i, String str, boolean z) {
                throw new NullPointerException("params");
            }

            @Override // X.InterfaceC06330Uz
            public final int optTraceConfigParamInt(int i, String str, int i2) {
                throw new NullPointerException("params");
            }

            @Override // X.InterfaceC06330Uz
            public final int[] optTraceConfigParamIntList(int i, String str) {
                throw new NullPointerException("params");
            }

            @Override // X.InterfaceC06330Uz
            public final String optTraceConfigParamString(int i, String str, String str2) {
                throw new NullPointerException("params");
            }

            @Override // X.InterfaceC06330Uz
            public final String[] optTraceConfigParamStringList(int i, String str) {
                throw new NullPointerException("params");
            }

            @Override // X.InterfaceC06330Uz
            public final int optTraceConfigTriggerParamInt(int i, String str, String str2, String str3, int i2) {
                throw new NullPointerException("triggers");
            }
        };
    }

    @Override // X.C0V1
    public final InterfaceC06330Uz B8s() {
        return A00;
    }
}
