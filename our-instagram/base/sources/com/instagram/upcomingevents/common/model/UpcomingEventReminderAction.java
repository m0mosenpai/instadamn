package com.instagram.upcomingevents.common.model;

import X.AbstractC12190kN;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.C14360o3;
import X.C55344OhA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class UpcomingEventReminderAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ UpcomingEventReminderAction[] A03;
    public static final UpcomingEventReminderAction A04;
    public static final UpcomingEventReminderAction A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        AbstractC166997dE.A1I(parcel, this);
    }

    static {
        UpcomingEventReminderAction upcomingEventReminderAction = new UpcomingEventReminderAction("SET_REMINDER", 0, "set_reminder");
        A04 = upcomingEventReminderAction;
        UpcomingEventReminderAction upcomingEventReminderAction2 = new UpcomingEventReminderAction("UNSET_REMINDER", 1, "unset_reminder");
        A05 = upcomingEventReminderAction2;
        UpcomingEventReminderAction[] upcomingEventReminderActionArr = {upcomingEventReminderAction, upcomingEventReminderAction2};
        A03 = upcomingEventReminderActionArr;
        A02 = AbstractC12190kN.A00(upcomingEventReminderActionArr);
        CREATOR = new C55344OhA(17);
        UpcomingEventReminderAction[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (UpcomingEventReminderAction upcomingEventReminderAction3 : values) {
            A18.put(upcomingEventReminderAction3.A00, upcomingEventReminderAction3);
        }
        A01 = A18;
    }

    public static UpcomingEventReminderAction valueOf(String str) {
        return (UpcomingEventReminderAction) Enum.valueOf(UpcomingEventReminderAction.class, str);
    }

    public static UpcomingEventReminderAction[] values() {
        return (UpcomingEventReminderAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public UpcomingEventReminderAction(String str, int i, String str2) {
        this.A00 = str2;
    }
}
