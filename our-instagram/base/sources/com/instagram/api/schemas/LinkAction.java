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
/* loaded from: classes7.dex */
public final class LinkAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LinkAction[] A03;
    public static final LinkAction A04;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LinkAction linkAction = new LinkAction("UNRECOGNIZED", 0, "LinkAction_unspecified");
        A04 = linkAction;
        LinkAction[] linkActionArr = {linkAction, new LinkAction("OPEN_SELLER_FEEDBACK_SURVEY", 1, "open_seller_feedback_survey")};
        A03 = linkActionArr;
        A02 = AbstractC12190kN.A00(linkActionArr);
        LinkAction[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (LinkAction linkAction2 : values) {
            A18.put(linkAction2.A00, linkAction2);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(67);
    }

    public static LinkAction valueOf(String str) {
        return (LinkAction) Enum.valueOf(LinkAction.class, str);
    }

    public static LinkAction[] values() {
        return (LinkAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LinkAction(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
