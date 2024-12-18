package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41858IgC;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class LinkType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LinkType[] A03;
    public static final LinkType A04;
    public static final LinkType A05;
    public static final LinkType A06;
    public static final LinkType A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LinkType linkType = new LinkType("UNRECOGNIZED", 0, "LinkType_unspecified");
        A07 = linkType;
        LinkType linkType2 = new LinkType("DEFAULT", 1, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        A04 = linkType2;
        LinkType linkType3 = new LinkType("DISCUSSION_TOPIC", 2, "discussion_topic");
        A05 = linkType3;
        LinkType linkType4 = new LinkType("IG_MEDIA", 3, "ig_media");
        A06 = linkType4;
        LinkType[] linkTypeArr = {linkType, linkType2, linkType3, linkType4, new LinkType("QUOTE", 4, "quote")};
        A03 = linkTypeArr;
        A02 = AbstractC12190kN.A00(linkTypeArr);
        LinkType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (LinkType linkType5 : values) {
            A18.put(linkType5.A00, linkType5);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(70);
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LinkType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
