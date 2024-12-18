package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C63469Sl9;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class BrandedContentProjectAction implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ BrandedContentProjectAction[] A03;
    public static final BrandedContentProjectAction A04;
    public static final BrandedContentProjectAction A05;
    public static final BrandedContentProjectAction A06;
    public static final BrandedContentProjectAction A07;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        BrandedContentProjectAction brandedContentProjectAction = new BrandedContentProjectAction("UNRECOGNIZED", 0, "BrandedContentProjectAction_unspecified");
        A07 = brandedContentProjectAction;
        BrandedContentProjectAction brandedContentProjectAction2 = new BrandedContentProjectAction("ADD_MEDIA_TO_PROJECT", 1, "add_media_to_project");
        A04 = brandedContentProjectAction2;
        BrandedContentProjectAction brandedContentProjectAction3 = new BrandedContentProjectAction(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, 2, NetInfoModule.CONNECTION_TYPE_NONE);
        A05 = brandedContentProjectAction3;
        BrandedContentProjectAction brandedContentProjectAction4 = new BrandedContentProjectAction("REMOVE_MEDIA_FROM_PROJECT", 3, "remove_media_from_project");
        A06 = brandedContentProjectAction4;
        BrandedContentProjectAction[] brandedContentProjectActionArr = {brandedContentProjectAction, brandedContentProjectAction2, brandedContentProjectAction3, brandedContentProjectAction4};
        A03 = brandedContentProjectActionArr;
        A02 = AbstractC12190kN.A00(brandedContentProjectActionArr);
        BrandedContentProjectAction[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (BrandedContentProjectAction brandedContentProjectAction5 : values) {
            A18.put(brandedContentProjectAction5.A00, brandedContentProjectAction5);
        }
        A01 = A18;
        CREATOR = new C63469Sl9(79);
    }

    public static BrandedContentProjectAction valueOf(String str) {
        return (BrandedContentProjectAction) Enum.valueOf(BrandedContentProjectAction.class, str);
    }

    public static BrandedContentProjectAction[] values() {
        return (BrandedContentProjectAction[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public BrandedContentProjectAction(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
