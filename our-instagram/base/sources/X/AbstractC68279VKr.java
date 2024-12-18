package X;

/* renamed from: X.VKr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68279VKr {
    public static final float A00(U6H u6h) {
        AbstractC68278VKq abstractC68278VKq = AbstractC68278VKq.$redex_init_class;
        switch (u6h.ordinal()) {
            case 0:
            case 6:
                return 1.0f;
            case 1:
            case 2:
            case 4:
            case 5:
                return 0.75f;
            case 3:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered unsupported CDS bottom sheet style: ");
                sb.append(u6h);
                sb.append('.');
                throw new UnsupportedOperationException(sb.toString());
        }
    }
}
