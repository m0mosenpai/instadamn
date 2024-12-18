package X;

/* renamed from: X.9vw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC224719vw {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.80B, java.lang.Object] */
    public static final C80B A00(EnumC27091Ti enumC27091Ti) {
        if (C1RQ.A00().A05(enumC27091Ti) && C1RQ.A00().A07(enumC27091Ti)) {
            ?? obj = new Object();
            try {
                AbstractC224709vv abstractC224709vv = AbstractC224709vv.$redex_init_class;
                int ordinal = enumC27091Ti.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 5) {
                        C09170dP.A0D("slam-native", 16);
                        return obj;
                    }
                } else {
                    C09170dP.A0D("dynamic_pytorch_impl", 16);
                    C09170dP.A0D("torch-code-gen", 16);
                    C09170dP.A0D("aten_vulkan", 16);
                    C09170dP.A0D("gans-ops-xplat", 16);
                    C09170dP.A0D("torchvision-ops", 16);
                    C09170dP.A0D("pytorch_jni", 16);
                    C09170dP.A0D("pytorch_jni_lite", 16);
                }
                return obj;
            } catch (UnsatisfiedLinkError e) {
                throw new RuntimeException(AnonymousClass001.A0g("SoLoader dynamic ", enumC27091Ti.name(), " library exception:"), e);
            }
        }
        throw AbstractC166987dD.A18(AnonymousClass001.A0R("Library loading failed for: ", enumC27091Ti.name()));
    }
}
