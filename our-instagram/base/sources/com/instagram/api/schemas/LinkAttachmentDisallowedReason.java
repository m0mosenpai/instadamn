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
public final class LinkAttachmentDisallowedReason implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ LinkAttachmentDisallowedReason[] A03;
    public static final LinkAttachmentDisallowedReason A04;
    public static final LinkAttachmentDisallowedReason A05;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        LinkAttachmentDisallowedReason linkAttachmentDisallowedReason = new LinkAttachmentDisallowedReason("UNRECOGNIZED", 0, "LinkAttachmentDisallowedReason_unspecified");
        A05 = linkAttachmentDisallowedReason;
        LinkAttachmentDisallowedReason linkAttachmentDisallowedReason2 = new LinkAttachmentDisallowedReason("C18_REGULATED", 1, "c18_regulated");
        A04 = linkAttachmentDisallowedReason2;
        LinkAttachmentDisallowedReason[] linkAttachmentDisallowedReasonArr = {linkAttachmentDisallowedReason, linkAttachmentDisallowedReason2, new LinkAttachmentDisallowedReason("DEFAULT", 2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)};
        A03 = linkAttachmentDisallowedReasonArr;
        A02 = AbstractC12190kN.A00(linkAttachmentDisallowedReasonArr);
        LinkAttachmentDisallowedReason[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (LinkAttachmentDisallowedReason linkAttachmentDisallowedReason3 : values) {
            A18.put(linkAttachmentDisallowedReason3.A00, linkAttachmentDisallowedReason3);
        }
        A01 = A18;
        CREATOR = C41858IgC.A00(68);
    }

    public static LinkAttachmentDisallowedReason valueOf(String str) {
        return (LinkAttachmentDisallowedReason) Enum.valueOf(LinkAttachmentDisallowedReason.class, str);
    }

    public static LinkAttachmentDisallowedReason[] values() {
        return (LinkAttachmentDisallowedReason[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public LinkAttachmentDisallowedReason(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
