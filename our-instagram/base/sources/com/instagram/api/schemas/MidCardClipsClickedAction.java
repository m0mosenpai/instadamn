package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class MidCardClipsClickedAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ MidCardClipsClickedAction[] A03;
    public static final MidCardClipsClickedAction A04;
    public static final MidCardClipsClickedAction A05;
    public static final MidCardClipsClickedAction A06;
    public static final MidCardClipsClickedAction A07;
    public static final MidCardClipsClickedAction A08;
    public static final MidCardClipsClickedAction A09;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        MidCardClipsClickedAction midCardClipsClickedAction = new MidCardClipsClickedAction("UNRECOGNIZED", 0, "MidCardClipsClickedAction_unspecified");
        A09 = midCardClipsClickedAction;
        MidCardClipsClickedAction midCardClipsClickedAction2 = new MidCardClipsClickedAction("NOT_CLICKABLE", 1, "not_clickable");
        A04 = midCardClipsClickedAction2;
        MidCardClipsClickedAction midCardClipsClickedAction3 = new MidCardClipsClickedAction("OPEN_IN_CLIPS_VIEWER", 2, "open_in_clips_viewer");
        A05 = midCardClipsClickedAction3;
        MidCardClipsClickedAction midCardClipsClickedAction4 = new MidCardClipsClickedAction("OPEN_IN_DRAFT_PUBLISH_SCREEN", 3, "open_in_draft_publish_screen");
        A06 = midCardClipsClickedAction4;
        MidCardClipsClickedAction midCardClipsClickedAction5 = new MidCardClipsClickedAction("OPEN_IN_STORY_VIEWER", 4, "open_in_story_viewer");
        A07 = midCardClipsClickedAction5;
        MidCardClipsClickedAction midCardClipsClickedAction6 = new MidCardClipsClickedAction("OPEN_IN_STORY_VIEWER_WITH_CHAIN", 5, "open_in_story_viewer_with_chain");
        A08 = midCardClipsClickedAction6;
        MidCardClipsClickedAction[] midCardClipsClickedActionArr = {midCardClipsClickedAction, midCardClipsClickedAction2, midCardClipsClickedAction3, midCardClipsClickedAction4, midCardClipsClickedAction5, midCardClipsClickedAction6, new MidCardClipsClickedAction("UNKNOWN", 6, "unknown")};
        A03 = midCardClipsClickedActionArr;
        A02 = AbstractC12190kN.A00(midCardClipsClickedActionArr);
        MidCardClipsClickedAction[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (MidCardClipsClickedAction midCardClipsClickedAction7 : values) {
            A18.put(midCardClipsClickedAction7.A00, midCardClipsClickedAction7);
        }
        A01 = A18;
        CREATOR = new C41858IgC(95);
    }

    public static MidCardClipsClickedAction valueOf(String str) {
        return (MidCardClipsClickedAction) Enum.valueOf(MidCardClipsClickedAction.class, str);
    }

    public static MidCardClipsClickedAction[] values() {
        return (MidCardClipsClickedAction[]) A03.clone();
    }

    public MidCardClipsClickedAction(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
