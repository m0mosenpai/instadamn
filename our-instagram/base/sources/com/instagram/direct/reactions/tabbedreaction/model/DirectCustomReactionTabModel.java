package com.instagram.direct.reactions.tabbedreaction.model;

import X.AbstractC12190kN;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.C0T6;
import X.C14360o3;
import X.LNL;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.direct.messagethread.reactions.datamodel.DirectCountBasedReaction;
import kotlin.enums.EnumEntries;

/* loaded from: classes8.dex */
public final class DirectCustomReactionTabModel extends C0T6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LNL.A00(35);
    public final DirectCountBasedReaction A00;
    public final TabType A01;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes8.dex */
    public final class TabType implements Parcelable {
        public static final /* synthetic */ EnumEntries A00;
        public static final /* synthetic */ TabType[] A01;
        public static final TabType A02;
        public static final TabType A03;
        public static final Parcelable.Creator CREATOR;

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
            TabType tabType = new TabType("ALL_TAB", 0);
            A02 = tabType;
            TabType tabType2 = new TabType("CUSTOM_EMOJI_TAB", 1);
            A03 = tabType2;
            TabType[] tabTypeArr = {tabType, tabType2};
            A01 = tabTypeArr;
            A00 = AbstractC12190kN.A00(tabTypeArr);
            CREATOR = LNL.A00(36);
        }

        public static TabType valueOf(String str) {
            return (TabType) Enum.valueOf(TabType.class, str);
        }

        public static TabType[] values() {
            return (TabType[]) A01.clone();
        }

        public TabType(String str, int i) {
        }
    }

    public DirectCustomReactionTabModel(DirectCountBasedReaction directCountBasedReaction, TabType tabType) {
        C14360o3.A0B(tabType, 2);
        this.A00 = directCountBasedReaction;
        this.A01 = tabType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectCustomReactionTabModel) {
                DirectCustomReactionTabModel directCustomReactionTabModel = (DirectCustomReactionTabModel) obj;
                if (!C14360o3.A0K(this.A00, directCustomReactionTabModel.A00) || this.A01 != directCustomReactionTabModel.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        this.A01.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC167017dG.A0M(this.A00) * 31);
    }
}
