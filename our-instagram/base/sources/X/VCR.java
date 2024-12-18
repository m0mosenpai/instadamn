package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes11.dex */
public final class VCR {
    public static final VCR A01 = new VCR("FACEBOOK_MAP", 0, "facebook_map");
    public static final VCR A02 = new VCR("MAPBOX_MAP", 1, "mapbox_map");
    public final String A00;

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public VCR(String str, int i, String str2) {
        this.A00 = str2;
    }
}
