package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.1Hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class EnumC24331Hc {
    public static final Map A02;
    public static final Map A03;
    public static final /* synthetic */ EnumC24331Hc[] A04;
    public static final EnumC24331Hc A05;
    public static final EnumC24331Hc A06;
    public static final EnumC24331Hc A07;
    public static final EnumC24331Hc A08;
    public static final EnumC24331Hc A09;
    public final Class A00;
    public final String A01;

    static {
        EnumC24331Hc enumC24331Hc = new EnumC24331Hc() { // from class: X.1He
            @Override // X.EnumC24331Hc
            public final Object A00(String str) {
                return str;
            }
        };
        A09 = enumC24331Hc;
        EnumC24331Hc enumC24331Hc2 = new EnumC24331Hc() { // from class: X.1Hf
            @Override // X.EnumC24331Hc
            public final Object A00(String str) {
                return Integer.valueOf(Integer.parseInt(str));
            }
        };
        A06 = enumC24331Hc2;
        EnumC24331Hc enumC24331Hc3 = new EnumC24331Hc() { // from class: X.1Hh
            @Override // X.EnumC24331Hc
            public final Object A00(String str) {
                return Long.valueOf(Long.parseLong(str));
            }
        };
        A07 = enumC24331Hc3;
        EnumC24331Hc enumC24331Hc4 = new EnumC24331Hc() { // from class: X.1Hi
            @Override // X.EnumC24331Hc
            public final Object A00(String str) {
                return new HashSet(Arrays.asList(str.substring(1, str.length() - 1).split(", ")));
            }
        };
        A08 = enumC24331Hc4;
        EnumC24331Hc enumC24331Hc5 = new EnumC24331Hc() { // from class: X.1Hj
            @Override // X.EnumC24331Hc
            public final Object A00(String str) {
                return Float.valueOf(Float.parseFloat(str));
            }
        };
        A05 = enumC24331Hc5;
        A04 = new EnumC24331Hc[]{enumC24331Hc, enumC24331Hc2, enumC24331Hc3, enumC24331Hc4, enumC24331Hc5, new EnumC24331Hc() { // from class: X.1Hk
            @Override // X.EnumC24331Hc
            public final Object A00(String str) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }};
        A03 = new HashMap();
        A02 = new HashMap();
        for (EnumC24331Hc enumC24331Hc6 : values()) {
            A03.put(enumC24331Hc6.A01, enumC24331Hc6);
            A02.put(enumC24331Hc6.A00, enumC24331Hc6);
        }
    }

    public abstract Object A00(String str);

    public static EnumC24331Hc[] values() {
        return (EnumC24331Hc[]) A04.clone();
    }

    public EnumC24331Hc(Class cls, String str, String str2, int i) {
        this.A01 = str2;
        this.A00 = cls;
    }
}
