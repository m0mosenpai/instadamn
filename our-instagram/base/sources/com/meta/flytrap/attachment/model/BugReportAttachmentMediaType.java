package com.meta.flytrap.attachment.model;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C57498PfY;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes9.dex */
public final class BugReportAttachmentMediaType {
    public static final InterfaceC09390do A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BugReportAttachmentMediaType[] A02;
    public static final BugReportAttachmentMediaType A03;
    public static final BugReportAttachmentMediaType A04;
    public static final BugReportAttachmentMediaType A05;
    public static final Companion Companion;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) BugReportAttachmentMediaType.A00.getValue();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.meta.flytrap.attachment.model.BugReportAttachmentMediaType$Companion, java.lang.Object] */
    static {
        BugReportAttachmentMediaType bugReportAttachmentMediaType = new BugReportAttachmentMediaType("NON_MEDIA", 0);
        A03 = bugReportAttachmentMediaType;
        BugReportAttachmentMediaType bugReportAttachmentMediaType2 = new BugReportAttachmentMediaType("SCREENSHOT", 1);
        A04 = bugReportAttachmentMediaType2;
        BugReportAttachmentMediaType bugReportAttachmentMediaType3 = new BugReportAttachmentMediaType("VIDEO", 2);
        A05 = bugReportAttachmentMediaType3;
        BugReportAttachmentMediaType[] bugReportAttachmentMediaTypeArr = {bugReportAttachmentMediaType, bugReportAttachmentMediaType2, bugReportAttachmentMediaType3};
        A02 = bugReportAttachmentMediaTypeArr;
        A01 = AbstractC12190kN.A00(bugReportAttachmentMediaTypeArr);
        Companion = new Object();
        A00 = AbstractC09440dt.A00(EnumC09460dv.A03, C57498PfY.A00);
    }

    public static BugReportAttachmentMediaType valueOf(String str) {
        return (BugReportAttachmentMediaType) Enum.valueOf(BugReportAttachmentMediaType.class, str);
    }

    public static BugReportAttachmentMediaType[] values() {
        return (BugReportAttachmentMediaType[]) A02.clone();
    }

    public BugReportAttachmentMediaType(String str, int i) {
    }
}
