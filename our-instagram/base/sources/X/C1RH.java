package X;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;

/* renamed from: X.1RH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1RH {
    public static final ImmutableSet A00;
    public static final ImmutableSet A01;
    public static final ImmutableSet A02;

    static {
        String[] strArr = new String[36];
        System.arraycopy(new String[]{"el", "en_GB", "es", "es_ES", "fa", "fi", "fil", "fr", "fr_CA", "hi", "hr", "hu", "in", "it", "iw", "ja", "ko", "ms", "nb", "nl", "pl", "pt", "pt_PT", "ro", "ru", "sk", "sr"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"sv", "th", "tl", "tr", "uk", "vi", "zh_CN", "zh_HK", "zh_TW"}, 0, strArr, 27, 9);
        A01 = ImmutableSet.A02("af", "ar", "bg", "cs", "da", "de", strArr);
        A00 = new SingletonImmutableSet("fb");
        A02 = RegularImmutableSet.A03;
    }
}
