package X;

import com.google.common.collect.ImmutableMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public abstract class SJX {
    public static final C58619Pyn A00;
    public static final C58619Pyn A01;
    public static final ImmutableMap A02;
    public long accessExpirationDuration;
    public TimeUnit accessExpirationTimeUnit;
    public Integer concurrencyLevel;
    public Integer initialCapacity;
    public EnumC200228tR keyStrength;
    public Long maximumSize;
    public Long maximumWeight;
    public Boolean recordStats;
    public long refreshDuration;
    public TimeUnit refreshTimeUnit;
    public EnumC200228tR valueStrength;
    public long writeExpirationDuration;
    public TimeUnit writeExpirationTimeUnit;

    static {
        C58619Pyn A002 = C58619Pyn.A00(',');
        AbstractC64290T7z abstractC64290T7z = C60742RPg.A01;
        A00 = new C58619Pyn(abstractC64290T7z, A002.A01);
        A01 = new C58619Pyn(abstractC64290T7z, C58619Pyn.A00('=').A01);
        ImmutableMap.Builder A0Z = AbstractC58319PtB.A0Z();
        A0Z.put("initialCapacity", new Object());
        A0Z.put("maximumSize", new Object());
        A0Z.put("maximumWeight", new Object());
        A0Z.put("concurrencyLevel", new Object());
        EnumC200228tR enumC200228tR = EnumC200228tR.A02;
        A0Z.put("weakKeys", new Object());
        A0Z.put("softValues", new Object());
        A0Z.put("weakValues", new Object());
        A0Z.put("recordStats", new Object());
        A0Z.put("expireAfterAccess", new Object());
        A0Z.put("expireAfterWrite", new Object());
        A0Z.put("refreshAfterWrite", new Object());
        A0Z.put("refreshInterval", new Object());
        A02 = A0Z.buildOrThrow();
    }
}
