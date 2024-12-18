package X;

import com.instagram.direct.share.ui.mediacomposer.commands.aiagent.ImagineAnimatePlainTextCommand;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.7FZ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7FZ {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ C7FZ[] A02;
    public static final C7FZ A03;
    public static final C7FZ A04;
    public static final C7FZ A05;
    public static final C7FZ A06;
    public static final C7FZ A07;
    public static final C7FZ A08;
    public static final C7FZ A09;
    public static final C7FZ A0A;
    public static final C7FZ A0B;
    public final String A00;

    static {
        C7FZ c7fz = new C7FZ("EVERYONE", 0, "everyone");
        A05 = c7fz;
        C7FZ c7fz2 = new C7FZ("POLL", 1, "poll");
        A09 = c7fz2;
        C7FZ c7fz3 = new C7FZ("SILENT", 2, "silent");
        A0A = c7fz3;
        C7FZ c7fz4 = new C7FZ("THEME", 3, "theme");
        A0B = c7fz4;
        C7FZ c7fz5 = new C7FZ("MENTION", 4, "mention");
        A08 = c7fz5;
        C7FZ c7fz6 = new C7FZ("AI", 5, "ai");
        A03 = c7fz6;
        C7FZ c7fz7 = new C7FZ("IMAGINE", 6, "imagine");
        A06 = c7fz7;
        C7FZ c7fz8 = new C7FZ("ANIMATE", 7, ImagineAnimatePlainTextCommand.TRIGGER_KEY);
        A04 = c7fz8;
        C7FZ c7fz9 = new C7FZ("IMAGINE_ME", 8, "imagine me");
        A07 = c7fz9;
        C7FZ[] c7fzArr = {c7fz, c7fz2, c7fz3, c7fz4, c7fz5, c7fz6, c7fz7, c7fz8, c7fz9};
        A02 = c7fzArr;
        A01 = AbstractC12190kN.A00(c7fzArr);
    }

    public static C7FZ valueOf(String str) {
        return (C7FZ) Enum.valueOf(C7FZ.class, str);
    }

    public static C7FZ[] values() {
        return (C7FZ[]) A02.clone();
    }

    public C7FZ(String str, int i, String str2) {
        this.A00 = str2;
    }
}
