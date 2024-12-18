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
/* loaded from: classes12.dex */
public final class SettingId implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ SettingId[] A03;
    public static final SettingId A04;
    public static final SettingId A05;
    public static final SettingId A06;
    public static final SettingId A07;
    public static final SettingId A08;
    public static final SettingId A09;
    public static final SettingId A0A;
    public static final SettingId A0B;
    public static final SettingId A0C;
    public static final SettingId A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        SettingId settingId = new SettingId("UNRECOGNIZED", 0, "SettingId_unspecified");
        A0D = settingId;
        SettingId settingId2 = new SettingId("ARCHIVING_SAVE_LIVE_TO_ARCHIVE", 1, "archiving_save_live_to_archive");
        A04 = settingId2;
        SettingId settingId3 = new SettingId("ARCHIVING_SAVE_ORIGINAL_PHOTOS", 2, "archiving_save_original_photos");
        A05 = settingId3;
        SettingId settingId4 = new SettingId("ARCHIVING_SAVE_STORY_TO_ARCHIVE", 3, "archiving_save_story_to_archive");
        A06 = settingId4;
        SettingId settingId5 = new SettingId("ARCHIVING_SAVE_STORY_TO_CAMERA_GALLERY", 4, "archiving_save_story_to_camera_gallery");
        A07 = settingId5;
        SettingId settingId6 = new SettingId("ARCHIVING_SAVE_STORY_TO_GALLERY", 5, "archiving_save_story_to_gallery");
        A08 = settingId6;
        SettingId settingId7 = new SettingId("TAGS_MENTIONS_WHO_CAN_BOOST", 6, "tags_mentions_who_can_boost");
        A09 = settingId7;
        SettingId settingId8 = new SettingId("TAGS_MENTIONS_WHO_CAN_MENTION", 7, "tags_mentions_who_can_mention");
        A0A = settingId8;
        SettingId settingId9 = new SettingId("TAGS_MENTIONS_WHO_CAN_TAG", 8, "tags_mentions_who_can_tag");
        A0B = settingId9;
        SettingId settingId10 = new SettingId("TAGS_MENTIONS_WHO_CAN_TAG_ON_OTHER_APPS", 9, "tags_mentions_who_can_tag_on_other_apps");
        A0C = settingId10;
        SettingId[] settingIdArr = {settingId, settingId2, settingId3, settingId4, settingId5, settingId6, settingId7, settingId8, settingId9, settingId10, new SettingId("TEST", 10, "test")};
        A03 = settingIdArr;
        A02 = AbstractC12190kN.A00(settingIdArr);
        SettingId[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (SettingId settingId11 : values) {
            A18.put(settingId11.A00, settingId11);
        }
        A01 = A18;
        CREATOR = new C41855Ig9(98);
    }

    public static SettingId valueOf(String str) {
        return (SettingId) Enum.valueOf(SettingId.class, str);
    }

    public static SettingId[] values() {
        return (SettingId[]) A03.clone();
    }

    public SettingId(String str, int i, String str2) {
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
