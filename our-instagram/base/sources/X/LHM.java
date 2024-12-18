package X;

import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes8.dex */
public final class LHM {
    public static final /* synthetic */ LHM A00 = new Object();

    public static final ImmutableMap A00(MantleDataValue mantleDataValue, String str, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(mantleDataValue, 2);
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.put("textInput", new MantleDataValue(EnumC129705ta.A0B, str));
        builder.put("lexiconStemmerEnabled", new MantleDataValue(EnumC129705ta.A03, Boolean.valueOf(z2)));
        if (z) {
            builder.put("lexiconCacheKey", mantleDataValue);
        }
        ImmutableMap build = builder.build();
        C14360o3.A07(build);
        return build;
    }
}
