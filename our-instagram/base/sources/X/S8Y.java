package X;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableBiMap;

/* loaded from: classes10.dex */
public abstract class S8Y {
    public static final ImmutableBiMap A00;
    public static final ImmutableBiMap A01;

    /* JADX WARN: Type inference failed for: r3v0, types: [X.RRD, com.google.common.collect.ImmutableMap$Builder] */
    static {
        RegularImmutableBiMap regularImmutableBiMap;
        ?? builder = new ImmutableMap.Builder(4);
        builder.A00(EnumC61163RgP.NORMAL, AbstractC25227BEk.A0p());
        builder.A00(EnumC61163RgP.ROTATE_90, 90);
        builder.A00(EnumC61163RgP.ROTATE_180, 180);
        builder.A00(EnumC61163RgP.ROTATE_270, 270);
        int i = builder.size;
        if (i == 0) {
            regularImmutableBiMap = RegularImmutableBiMap.A04;
        } else {
            builder.entriesUsed = true;
            regularImmutableBiMap = new RegularImmutableBiMap(builder.alternatingKeysAndValues, i);
        }
        A00 = regularImmutableBiMap;
        A01 = regularImmutableBiMap.A00;
    }
}
