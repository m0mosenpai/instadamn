package com.meta.flytrap.attachment.model;

import X.AbstractC09440dt;
import X.AbstractC12190kN;
import X.C3R9;
import X.C55344OhA;
import X.C57497PfX;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.MSZ;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes9.dex */
public final class BugReportAttachmentMediaSource implements Parcelable {
    public static final InterfaceC09390do A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ BugReportAttachmentMediaSource[] A02;
    public static final BugReportAttachmentMediaSource A03;
    public static final BugReportAttachmentMediaSource A04;
    public static final BugReportAttachmentMediaSource A05;
    public static final BugReportAttachmentMediaSource A06;
    public static final BugReportAttachmentMediaSource A07;
    public static final BugReportAttachmentMediaSource A08;
    public static final Parcelable.Creator CREATOR;
    public static final Companion Companion;

    /* loaded from: classes9.dex */
    public final class Companion {
        public final C3R9 serializer() {
            return (C3R9) BugReportAttachmentMediaSource.A00.getValue();
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource$Companion, java.lang.Object] */
    static {
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource = new BugReportAttachmentMediaSource("BUG_REPORTER", 0);
        A04 = bugReportAttachmentMediaSource;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource2 = new BugReportAttachmentMediaSource("CAMERA_ROLL", 1);
        A07 = bugReportAttachmentMediaSource2;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource3 = new BugReportAttachmentMediaSource("BUILT_IN_SCREENSHOT_CAPTURE", 2);
        A06 = bugReportAttachmentMediaSource3;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource4 = new BugReportAttachmentMediaSource("BUILT_IN_SCREENCAST_CAPTURE", 3);
        A05 = bugReportAttachmentMediaSource4;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource5 = new BugReportAttachmentMediaSource("NON_MEDIA", 4);
        A08 = bugReportAttachmentMediaSource5;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource6 = new BugReportAttachmentMediaSource("ANNOTATION", 5);
        A03 = bugReportAttachmentMediaSource6;
        BugReportAttachmentMediaSource[] bugReportAttachmentMediaSourceArr = {bugReportAttachmentMediaSource, bugReportAttachmentMediaSource2, bugReportAttachmentMediaSource3, bugReportAttachmentMediaSource4, bugReportAttachmentMediaSource5, bugReportAttachmentMediaSource6};
        A02 = bugReportAttachmentMediaSourceArr;
        A01 = AbstractC12190kN.A00(bugReportAttachmentMediaSourceArr);
        Companion = new Object();
        CREATOR = C55344OhA.A00(51);
        A00 = AbstractC09440dt.A00(EnumC09460dv.A03, C57497PfX.A00);
    }

    public static BugReportAttachmentMediaSource valueOf(String str) {
        return (BugReportAttachmentMediaSource) Enum.valueOf(BugReportAttachmentMediaSource.class, str);
    }

    public static BugReportAttachmentMediaSource[] values() {
        return (BugReportAttachmentMediaSource[]) A02.clone();
    }

    public BugReportAttachmentMediaSource(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MSZ.A12(parcel, this);
    }
}
