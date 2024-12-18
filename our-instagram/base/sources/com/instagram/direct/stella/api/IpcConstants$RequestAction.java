package com.instagram.direct.stella.api;

import X.AbstractC12190kN;
import X.C05F;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class IpcConstants$RequestAction {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ IpcConstants$RequestAction[] A02;
    public static final IpcConstants$RequestAction A03;
    public static final IpcConstants$RequestAction A04;
    public static final IpcConstants$RequestAction A05;
    public static final IpcConstants$RequestAction A06;
    public static final IpcConstants$RequestAction A07;
    public static final IpcConstants$RequestAction A08;
    public static final IpcConstants$RequestAction A09;
    public static final IpcConstants$RequestAction A0A;
    public static final IpcConstants$RequestAction A0B;
    public static final IpcConstants$RequestAction A0C;
    public static final IpcConstants$RequestAction A0D;
    public static final IpcConstants$RequestAction A0E;
    public static final IpcConstants$RequestAction A0F;
    public static final IpcConstants$RequestAction A0G;
    public static final IpcConstants$RequestAction A0H;
    public static final IpcConstants$RequestAction A0I;
    public static final IpcConstants$RequestAction A0J;
    public static final IpcConstants$RequestAction A0K;
    public final Integer A00;

    static {
        IpcConstants$RequestAction ipcConstants$RequestAction = new IpcConstants$RequestAction("SEND_MESSAGE_ACTION", 0, C05F.A0P);
        A0G = ipcConstants$RequestAction;
        IpcConstants$RequestAction ipcConstants$RequestAction2 = new IpcConstants$RequestAction("MARK_MESSAGE_SEEN_ACTION", 1, C05F.A0G);
        A0C = ipcConstants$RequestAction2;
        IpcConstants$RequestAction ipcConstants$RequestAction3 = new IpcConstants$RequestAction("FETCH_INSTAGRAM_CONTACTS", 2, C05F.A1F);
        A07 = ipcConstants$RequestAction3;
        IpcConstants$RequestAction ipcConstants$RequestAction4 = new IpcConstants$RequestAction("FETCH_UNSEEN_MESSAGES", 3, C05F.A0E);
        A0A = ipcConstants$RequestAction4;
        IpcConstants$RequestAction ipcConstants$RequestAction5 = new IpcConstants$RequestAction("OPT_OUT_INSTAGRAM", 4, C05F.A0K);
        A0E = ipcConstants$RequestAction5;
        IpcConstants$RequestAction ipcConstants$RequestAction6 = new IpcConstants$RequestAction("SHARE_MEDIA_PRIVATE", 5, C05F.A0Q);
        A0H = ipcConstants$RequestAction6;
        Integer num = C05F.A0T;
        IpcConstants$RequestAction ipcConstants$RequestAction7 = new IpcConstants$RequestAction("SHARE_MEDIA_STORY_PUBLISH", 6, num);
        A0J = ipcConstants$RequestAction7;
        IpcConstants$RequestAction ipcConstants$RequestAction8 = new IpcConstants$RequestAction("SHARE_MEDIA_STORY_DRAFT", 7, num);
        A0I = ipcConstants$RequestAction8;
        IpcConstants$RequestAction ipcConstants$RequestAction9 = new IpcConstants$RequestAction("PENDING_IMPORTS", 8, C05F.A0M);
        A0F = ipcConstants$RequestAction9;
        IpcConstants$RequestAction ipcConstants$RequestAction10 = new IpcConstants$RequestAction("FETCH_PENDING_MEDIA", 9, C05F.A0Z);
        A09 = ipcConstants$RequestAction10;
        IpcConstants$RequestAction ipcConstants$RequestAction11 = new IpcConstants$RequestAction("START_CALL_ACTION", 10, C05F.A0U);
        A0K = ipcConstants$RequestAction11;
        IpcConstants$RequestAction ipcConstants$RequestAction12 = new IpcConstants$RequestAction("FETCH_LOGS_ACTION", 11, C05F.A02);
        A08 = ipcConstants$RequestAction12;
        IpcConstants$RequestAction ipcConstants$RequestAction13 = new IpcConstants$RequestAction("CONNECTED_USER_ACTIVE", 12, C05F.A0W);
        A04 = ipcConstants$RequestAction13;
        IpcConstants$RequestAction ipcConstants$RequestAction14 = new IpcConstants$RequestAction("IMPORT_MEDIA_ITEM", 13, C05F.A0a);
        A0B = ipcConstants$RequestAction14;
        IpcConstants$RequestAction ipcConstants$RequestAction15 = new IpcConstants$RequestAction("MEDIA_ITEM_IMPORT_STATUS", 14, C05F.A0b);
        A0D = ipcConstants$RequestAction15;
        IpcConstants$RequestAction ipcConstants$RequestAction16 = new IpcConstants$RequestAction("ANSWER_CALL_ACTION", 15, C05F.A00);
        A03 = ipcConstants$RequestAction16;
        IpcConstants$RequestAction ipcConstants$RequestAction17 = new IpcConstants$RequestAction("END_CALL_ACTION", 16, C05F.A0u);
        A06 = ipcConstants$RequestAction17;
        IpcConstants$RequestAction ipcConstants$RequestAction18 = new IpcConstants$RequestAction("DECLINE_CALL_ACTION", 17, C05F.A15);
        A05 = ipcConstants$RequestAction18;
        IpcConstants$RequestAction[] ipcConstants$RequestActionArr = {ipcConstants$RequestAction, ipcConstants$RequestAction2, ipcConstants$RequestAction3, ipcConstants$RequestAction4, ipcConstants$RequestAction5, ipcConstants$RequestAction6, ipcConstants$RequestAction7, ipcConstants$RequestAction8, ipcConstants$RequestAction9, ipcConstants$RequestAction10, ipcConstants$RequestAction11, ipcConstants$RequestAction12, ipcConstants$RequestAction13, ipcConstants$RequestAction14, ipcConstants$RequestAction15, ipcConstants$RequestAction16, ipcConstants$RequestAction17, ipcConstants$RequestAction18, new IpcConstants$RequestAction("CALL_ENGINE_DISPATCH_ACTION", 18, C05F.A01)};
        A02 = ipcConstants$RequestActionArr;
        A01 = AbstractC12190kN.A00(ipcConstants$RequestActionArr);
    }

    public static IpcConstants$RequestAction valueOf(String str) {
        return (IpcConstants$RequestAction) Enum.valueOf(IpcConstants$RequestAction.class, str);
    }

    public static IpcConstants$RequestAction[] values() {
        return (IpcConstants$RequestAction[]) A02.clone();
    }

    public IpcConstants$RequestAction(String str, int i, Integer num) {
        this.A00 = num;
    }
}
