package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41855Ig9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PendingShareToFriendsStoryBadgePreviewState implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ PendingShareToFriendsStoryBadgePreviewState[] A03;
    public static final PendingShareToFriendsStoryBadgePreviewState A04;
    public static final PendingShareToFriendsStoryBadgePreviewState A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState = new PendingShareToFriendsStoryBadgePreviewState("UNRECOGNIZED", 0, "PendingShareToFriendsStoryBadgePreviewState_unspecified");
        A05 = pendingShareToFriendsStoryBadgePreviewState;
        PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState2 = new PendingShareToFriendsStoryBadgePreviewState("MULTI_MEDIA", 1, "multi_media");
        A04 = pendingShareToFriendsStoryBadgePreviewState2;
        PendingShareToFriendsStoryBadgePreviewState[] pendingShareToFriendsStoryBadgePreviewStateArr = {pendingShareToFriendsStoryBadgePreviewState, pendingShareToFriendsStoryBadgePreviewState2, new PendingShareToFriendsStoryBadgePreviewState("SINGLE_MEDIA", 2, "single_media")};
        A03 = pendingShareToFriendsStoryBadgePreviewStateArr;
        A02 = AbstractC12190kN.A00(pendingShareToFriendsStoryBadgePreviewStateArr);
        PendingShareToFriendsStoryBadgePreviewState[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (PendingShareToFriendsStoryBadgePreviewState pendingShareToFriendsStoryBadgePreviewState3 : values) {
            A18.put(pendingShareToFriendsStoryBadgePreviewState3.A00, pendingShareToFriendsStoryBadgePreviewState3);
        }
        A01 = A18;
        CREATOR = C41855Ig9.A00(33);
    }

    public static PendingShareToFriendsStoryBadgePreviewState valueOf(String str) {
        return (PendingShareToFriendsStoryBadgePreviewState) Enum.valueOf(PendingShareToFriendsStoryBadgePreviewState.class, str);
    }

    public static PendingShareToFriendsStoryBadgePreviewState[] values() {
        return (PendingShareToFriendsStoryBadgePreviewState[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public PendingShareToFriendsStoryBadgePreviewState(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
