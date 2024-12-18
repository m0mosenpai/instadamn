package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2ff, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC54812ff implements C1QP {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC54812ff[] A02;
    public static final EnumC54812ff A03;
    public static final EnumC54812ff A04;
    public static final EnumC54812ff A05;
    public static final EnumC54812ff A06;
    public static final EnumC54812ff A07;
    public static final EnumC54812ff A08;
    public static final EnumC54812ff A09;
    public final String A00;

    static {
        EnumC54812ff enumC54812ff = new EnumC54812ff("CAMERA", 0, "fragment_panel_camera");
        A05 = enumC54812ff;
        EnumC54812ff enumC54812ff2 = new EnumC54812ff("DIRECT", 1, "fragment_panel_direct");
        A07 = enumC54812ff2;
        EnumC54812ff enumC54812ff3 = new EnumC54812ff("PRODUCER_PROFILE", 2, "fragment_producer_profile_panel");
        A08 = enumC54812ff3;
        EnumC54812ff enumC54812ff4 = new EnumC54812ff("CLIPS_AD_CTA", 3, "fragment_clips_ad_cta_panel");
        A06 = enumC54812ff4;
        EnumC54812ff enumC54812ff5 = new EnumC54812ff("THREAD_VIEW", 4, "fragment_thread_view_panel");
        A09 = enumC54812ff5;
        EnumC54812ff enumC54812ff6 = new EnumC54812ff("BASEL_PROJECTS", 5, "fragment_panel_camera");
        A04 = enumC54812ff6;
        EnumC54812ff enumC54812ff7 = new EnumC54812ff("BASEL_MAIN", 6, "fragment_basel_main");
        A03 = enumC54812ff7;
        EnumC54812ff[] enumC54812ffArr = {enumC54812ff, enumC54812ff2, enumC54812ff3, enumC54812ff4, enumC54812ff5, enumC54812ff6, enumC54812ff7, new EnumC54812ff("BASEL_IDEAS", 7, "fragment_basel_ideas")};
        A02 = enumC54812ffArr;
        A01 = AbstractC12190kN.A00(enumC54812ffArr);
    }

    public static EnumC54812ff valueOf(String str) {
        return (EnumC54812ff) Enum.valueOf(EnumC54812ff.class, str);
    }

    public static EnumC54812ff[] values() {
        return (EnumC54812ff[]) A02.clone();
    }

    @Override // X.C1QP
    public final String B8U() {
        return this.A00;
    }

    public EnumC54812ff(String str, int i, String str2) {
        this.A00 = str2;
    }
}
