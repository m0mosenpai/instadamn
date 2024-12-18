package com.instagram.bugreporter.source;

import X.AbstractC06950Ym;
import X.AbstractC12190kN;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C020508b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BugReportSource {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BugReportSource[] A03;
    public static final BugReportSource A04;
    public static final BugReportSource A05;
    public static final BugReportSource A06;
    public static final BugReportSource A07;
    public static final BugReportSource A08;
    public static final BugReportSource A09;
    public static final BugReportSource A0A;
    public static final BugReportSource A0B;
    public static final BugReportSource A0C;
    public static final BugReportSource A0D;
    public static final BugReportSource A0E;
    public static final BugReportSource A0F;
    public static final BugReportSource A0G;
    public static final BugReportSource A0H;
    public static final BugReportSource A0I;
    public static final BugReportSource A0J;
    public static final BugReportSource A0K;
    public static final BugReportSource A0L;
    public static final BugReportSource A0M;
    public static final BugReportSource A0N;
    public final String A00;

    static {
        BugReportSource bugReportSource = new BugReportSource("USER_OPTIONS", 0, "user_options");
        A0K = bugReportSource;
        BugReportSource bugReportSource2 = new BugReportSource("RAGE_SHAKE", 1, "ig_rage_shake");
        A0H = bugReportSource2;
        BugReportSource bugReportSource3 = new BugReportSource("DIRECT_APP_PROFILE_SETTINGS", 2, "direct_app_profile_settings");
        A0A = bugReportSource3;
        BugReportSource bugReportSource4 = new BugReportSource("DIRECT_SEND_FAILURE", 3, "direct_send_failure");
        A0B = bugReportSource4;
        BugReportSource bugReportSource5 = new BugReportSource("DIRECT_THREAD_DETAIL", 4, "thread_details");
        A0C = bugReportSource5;
        BugReportSource bugReportSource6 = new BugReportSource("DIRECT_VISUAL_MESSAGE_REPORT_FLOW", 5, "direct_visual_message_report_flow");
        A0D = bugReportSource6;
        BugReportSource bugReportSource7 = new BugReportSource("IGTV_UPLOAD_REPORT_FLOW", 6, "igtv_upload_report_flow");
        A0E = bugReportSource7;
        BugReportSource bugReportSource8 = new BugReportSource("APPIRATER_FEEDBACK", 7, "appirater_feedback");
        A04 = bugReportSource8;
        BugReportSource bugReportSource9 = new BugReportSource("VIDEO_CALL_FAILED", 8, "video_call_failed");
        A0L = bugReportSource9;
        BugReportSource bugReportSource10 = new BugReportSource("VIDEO_CALL_FULL", 9, "video_call_is_full");
        A0M = bugReportSource10;
        BugReportSource bugReportSource11 = new BugReportSource("VIDEO_CALL_NO_ANSWER", 10, "video_call_no_answer");
        A0N = bugReportSource11;
        BugReportSource bugReportSource12 = new BugReportSource("UI_QUALITY_REVIEW", 11, "ui_quality_review");
        A0I = bugReportSource12;
        BugReportSource bugReportSource13 = new BugReportSource("BLOKS", 12, "bloks");
        A08 = bugReportSource13;
        BugReportSource bugReportSource14 = new BugReportSource("COWATCH", 13, "cowatch");
        A09 = bugReportSource14;
        BugReportSource bugReportSource15 = new BugReportSource("MEDIA_DELETED", 14, "media_deleted");
        A0F = bugReportSource15;
        BugReportSource bugReportSource16 = new BugReportSource("BARCELONA_RAGE_SHAKE", 15, "barcelona_rage_shake");
        A07 = bugReportSource16;
        BugReportSource bugReportSource17 = new BugReportSource("BARCELONA_APP_SETTING", 16, "barcelona_app_setting");
        A05 = bugReportSource17;
        BugReportSource bugReportSource18 = new BugReportSource("BARCELONA_FEED_TAB", 17, "barcelona_feed_tab");
        A06 = bugReportSource18;
        BugReportSource bugReportSource19 = new BugReportSource("NEWSFEED_STORY", 18, "activity_feed_notification_bug_report");
        A0G = bugReportSource19;
        BugReportSource bugReportSource20 = new BugReportSource("UNKNOWN", 19, "unknown");
        A0J = bugReportSource20;
        BugReportSource[] bugReportSourceArr = {bugReportSource, bugReportSource2, bugReportSource3, bugReportSource4, bugReportSource5, bugReportSource6, bugReportSource7, bugReportSource8, bugReportSource9, bugReportSource10, bugReportSource11, bugReportSource12, bugReportSource13, bugReportSource14, bugReportSource15, bugReportSource16, bugReportSource17, bugReportSource18, bugReportSource19, bugReportSource20};
        A03 = bugReportSourceArr;
        C020508b A00 = AbstractC12190kN.A00(bugReportSourceArr);
        A02 = A00;
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(AbstractC06950Ym.A1E(A00, 10)));
        for (Object obj : A00) {
            A18.put(((BugReportSource) obj).A00, obj);
        }
        A01 = A18;
    }

    public static BugReportSource valueOf(String str) {
        return (BugReportSource) Enum.valueOf(BugReportSource.class, str);
    }

    public static BugReportSource[] values() {
        return (BugReportSource[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BugReportSource(String str, int i, String str2) {
        this.A00 = str2;
    }
}
