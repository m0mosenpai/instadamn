package X;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4TA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TA {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C4TA[] A01;
    public static final C4TA A02;
    public static final C4TA A03;
    public static final C4TA A04;
    public static final C4TA A05;
    public static final C4TA A06;
    public static final C4TA A07;
    public static final C4TA A08;
    public static final C4TA A09;
    public static final C4TA A0A;
    public static final C4TA A0B;
    public static final C4TA A0C;
    public static final C4TA A0D;
    public static final C4TA A0E;
    public static final C4TA A0F;
    public static final C4TA A0G;
    public static final C4TA A0H;
    public static final C4TA A0I;
    public static final C4TA A0J;
    public static final C4TA A0K;
    public static final C4TA A0L;
    public static final C4TA A0M;
    public static final C4TA A0N;
    public static final C4TA A0O;
    public static final C4TA A0P;
    public static final C4TA A0Q;

    static {
        C4TA c4ta = new C4TA("REQUESTED_PLAYING", 0);
        A0I = c4ta;
        C4TA c4ta2 = new C4TA("STARTED_PLAYING", 1);
        A0N = c4ta2;
        C4TA c4ta3 = new C4TA("CANCEL_START", 2);
        A04 = c4ta3;
        C4TA c4ta4 = new C4TA("PAUSED", 3);
        A09 = c4ta4;
        C4TA c4ta5 = new C4TA("COMPLETED", 4);
        A06 = c4ta5;
        C4TA c4ta6 = new C4TA("REPRESENTATION_ENDED", 5);
        A0G = c4ta6;
        C4TA c4ta7 = new C4TA("STALL_STARTED", 6);
        A0M = c4ta7;
        C4TA c4ta8 = new C4TA("STALL_ENDED", 7);
        A0L = c4ta8;
        C4TA c4ta9 = new C4TA("SURFACE_AVAILABLE", 8);
        A0O = c4ta9;
        C4TA c4ta10 = new C4TA("SURFACE_UNAVAILABLE", 9);
        A0P = c4ta10;
        C4TA c4ta11 = new C4TA("AUDIO_ENABLED", 10);
        A03 = c4ta11;
        C4TA c4ta12 = new C4TA("AUDIO_DISABLED", 11);
        A02 = c4ta12;
        C4TA c4ta13 = new C4TA("PREPARE_STARTED", 12);
        A0D = c4ta13;
        C4TA c4ta14 = new C4TA("PREPARE_FINISHED", 13);
        A0C = c4ta14;
        C4TA c4ta15 = new C4TA("PLAYER_WARNING", 14);
        A0B = c4ta15;
        C4TA c4ta16 = new C4TA("PLAYER_ERROR", 15);
        A0A = c4ta16;
        C4TA c4ta17 = new C4TA("SEEK_REQUESTED", 16);
        A0K = c4ta17;
        C4TA c4ta18 = new C4TA("DISPLAY", 17);
        A07 = c4ta18;
        C4TA c4ta19 = new C4TA("RENDERED", 18);
        A0F = c4ta19;
        C4TA c4ta20 = new C4TA("CLICKED_TO_PLAY", 19);
        A05 = c4ta20;
        C4TA c4ta21 = new C4TA("VIDEO_PLAYBACK_FALLBACK", 20);
        A0Q = c4ta21;
        C4TA c4ta22 = new C4TA("ERROR_RECOVERY_ATTEMPT", 21);
        A08 = c4ta22;
        C4TA c4ta23 = new C4TA("RELEASE", 22);
        A0E = c4ta23;
        C4TA c4ta24 = new C4TA("RESET", 23);
        A0J = c4ta24;
        C4TA c4ta25 = new C4TA("REQUESTED_PAUSE", 24);
        A0H = c4ta25;
        C4TA[] c4taArr = {c4ta, c4ta2, c4ta3, c4ta4, c4ta5, c4ta6, c4ta7, c4ta8, c4ta9, c4ta10, c4ta11, c4ta12, c4ta13, c4ta14, c4ta15, c4ta16, c4ta17, c4ta18, c4ta19, c4ta20, c4ta21, c4ta22, c4ta23, c4ta24, c4ta25};
        A01 = c4taArr;
        A00 = AbstractC12190kN.A00(c4taArr);
    }

    public static C4TA valueOf(String str) {
        return (C4TA) Enum.valueOf(C4TA.class, str);
    }

    public static C4TA[] values() {
        return (C4TA[]) A01.clone();
    }

    public C4TA(String str, int i) {
    }
}
