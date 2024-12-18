package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.2Ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC46722Ck {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ EnumC46722Ck[] A01;
    public static final EnumC46722Ck A02;
    public static final EnumC46722Ck A03;
    public static final EnumC46722Ck A04;
    public static final EnumC46722Ck A05;
    public static final EnumC46722Ck A06;
    public static final EnumC46722Ck A07;
    public static final EnumC46722Ck A08;
    public static final EnumC46722Ck A09;
    public static final EnumC46722Ck A0A;
    public static final EnumC46722Ck A0B;
    public static final EnumC46722Ck A0C;
    public static final EnumC46722Ck A0D;
    public static final EnumC46722Ck A0E;
    public static final EnumC46722Ck A0F;
    public static final EnumC46722Ck A0G;
    public static final EnumC46722Ck A0H;
    public static final EnumC46722Ck A0I;
    public static final EnumC46722Ck A0J;
    public static final EnumC46722Ck A0K;

    static {
        EnumC46722Ck enumC46722Ck = new EnumC46722Ck("MAX_WATERMARK", 0);
        A0E = enumC46722Ck;
        EnumC46722Ck enumC46722Ck2 = new EnumC46722Ck("RENDER_INTERVAL", 1);
        A0I = enumC46722Ck2;
        EnumC46722Ck enumC46722Ck3 = new EnumC46722Ck("AVOID_PRE_LOAD", 2);
        A05 = enumC46722Ck3;
        EnumC46722Ck enumC46722Ck4 = new EnumC46722Ck("COVER_IMAGE_MULTIPLIER", 3);
        A08 = enumC46722Ck4;
        EnumC46722Ck enumC46722Ck5 = new EnumC46722Ck("DISK_SPACE_THRESHOLD_BYTES", 4);
        A0B = enumC46722Ck5;
        EnumC46722Ck enumC46722Ck6 = new EnumC46722Ck("CACHE_SIZE_IN_BYTES", 5);
        A07 = enumC46722Ck6;
        EnumC46722Ck enumC46722Ck7 = new EnumC46722Ck("DAV1D_THREADS", 6);
        A0A = enumC46722Ck7;
        EnumC46722Ck enumC46722Ck8 = new EnumC46722Ck("DAV1D_LATENCY_MODE", 7);
        A09 = enumC46722Ck8;
        EnumC46722Ck enumC46722Ck9 = new EnumC46722Ck("PLAYER_POOL_SIZE", 8);
        A0G = enumC46722Ck9;
        EnumC46722Ck enumC46722Ck10 = new EnumC46722Ck("AUTO_PLAY_DURATION", 9);
        A04 = enumC46722Ck10;
        EnumC46722Ck enumC46722Ck11 = new EnumC46722Ck("HERO_THREAD_PRIORITY", 10);
        A0D = enumC46722Ck11;
        EnumC46722Ck enumC46722Ck12 = new EnumC46722Ck("PREFETCH_THREAD_PRIORITY", 11);
        A0H = enumC46722Ck12;
        EnumC46722Ck enumC46722Ck13 = new EnumC46722Ck("SCROLL_AWARE_AUTOPLAY", 12);
        A0J = enumC46722Ck13;
        EnumC46722Ck enumC46722Ck14 = new EnumC46722Ck("AUDIO_SINK_MIN_DURATION_US", 13);
        A02 = enumC46722Ck14;
        EnumC46722Ck enumC46722Ck15 = new EnumC46722Ck("AUDIO_SINK_PCM_FACTOR", 14);
        A03 = enumC46722Ck15;
        EnumC46722Ck enumC46722Ck16 = new EnumC46722Ck("BG_HERO_CLEAN_UP", 15);
        A06 = enumC46722Ck16;
        EnumC46722Ck enumC46722Ck17 = new EnumC46722Ck("EXO_THREAD_PRIORITY", 16);
        A0C = enumC46722Ck17;
        EnumC46722Ck enumC46722Ck18 = new EnumC46722Ck("SCROLL_AWARE_PREFETCH", 17);
        A0K = enumC46722Ck18;
        EnumC46722Ck enumC46722Ck19 = new EnumC46722Ck(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 18);
        A0F = enumC46722Ck19;
        EnumC46722Ck[] enumC46722CkArr = {enumC46722Ck, enumC46722Ck2, enumC46722Ck3, enumC46722Ck4, enumC46722Ck5, enumC46722Ck6, enumC46722Ck7, enumC46722Ck8, enumC46722Ck9, enumC46722Ck10, enumC46722Ck11, enumC46722Ck12, enumC46722Ck13, enumC46722Ck14, enumC46722Ck15, enumC46722Ck16, enumC46722Ck17, enumC46722Ck18, enumC46722Ck19};
        A01 = enumC46722CkArr;
        A00 = AbstractC12190kN.A00(enumC46722CkArr);
    }

    public static EnumC46722Ck valueOf(String str) {
        return (EnumC46722Ck) Enum.valueOf(EnumC46722Ck.class, str);
    }

    public static EnumC46722Ck[] values() {
        return (EnumC46722Ck[]) A01.clone();
    }

    public EnumC46722Ck(String str, int i) {
    }
}
