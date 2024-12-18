package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class ChildCommentPagingDirection implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ChildCommentPagingDirection[] A03;
    public static final ChildCommentPagingDirection A04;
    public static final ChildCommentPagingDirection A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ChildCommentPagingDirection childCommentPagingDirection = new ChildCommentPagingDirection("UNRECOGNIZED", 0, "ChildCommentPagingDirection_unspecified");
        A04 = childCommentPagingDirection;
        ChildCommentPagingDirection childCommentPagingDirection2 = new ChildCommentPagingDirection("VIEW_MORE", 1, "view_more");
        A05 = childCommentPagingDirection2;
        ChildCommentPagingDirection[] childCommentPagingDirectionArr = {childCommentPagingDirection, childCommentPagingDirection2, new ChildCommentPagingDirection("VIEW_PREVIOUS", 2, "view_previous")};
        A03 = childCommentPagingDirectionArr;
        A02 = AbstractC12190kN.A00(childCommentPagingDirectionArr);
        ChildCommentPagingDirection[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (ChildCommentPagingDirection childCommentPagingDirection3 : values) {
            A18.put(childCommentPagingDirection3.A00, childCommentPagingDirection3);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(99);
    }

    public static ChildCommentPagingDirection valueOf(String str) {
        return (ChildCommentPagingDirection) Enum.valueOf(ChildCommentPagingDirection.class, str);
    }

    public static ChildCommentPagingDirection[] values() {
        return (ChildCommentPagingDirection[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ChildCommentPagingDirection(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
