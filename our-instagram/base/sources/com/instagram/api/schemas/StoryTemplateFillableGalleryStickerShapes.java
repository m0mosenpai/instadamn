package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.C41857IgB;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class StoryTemplateFillableGalleryStickerShapes implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ StoryTemplateFillableGalleryStickerShapes[] A03;
    public static final StoryTemplateFillableGalleryStickerShapes A04;
    public static final StoryTemplateFillableGalleryStickerShapes A05;
    public static final StoryTemplateFillableGalleryStickerShapes A06;
    public static final StoryTemplateFillableGalleryStickerShapes A07;
    public static final StoryTemplateFillableGalleryStickerShapes A08;
    public static final StoryTemplateFillableGalleryStickerShapes A09;
    public static final StoryTemplateFillableGalleryStickerShapes A0A;
    public static final StoryTemplateFillableGalleryStickerShapes A0B;
    public static final StoryTemplateFillableGalleryStickerShapes A0C;
    public static final StoryTemplateFillableGalleryStickerShapes A0D;
    public static final StoryTemplateFillableGalleryStickerShapes A0E;
    public static final StoryTemplateFillableGalleryStickerShapes A0F;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes = new StoryTemplateFillableGalleryStickerShapes("UNRECOGNIZED", 0, "StoryTemplateFillableGalleryStickerShapes_unspecified");
        A0F = storyTemplateFillableGalleryStickerShapes;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes2 = new StoryTemplateFillableGalleryStickerShapes("BURST", 1, "burst");
        A04 = storyTemplateFillableGalleryStickerShapes2;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes3 = new StoryTemplateFillableGalleryStickerShapes("CIRCLE", 2, "circle");
        A05 = storyTemplateFillableGalleryStickerShapes3;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes4 = new StoryTemplateFillableGalleryStickerShapes("FOUR_SQUARE", 3, "four_square");
        A06 = storyTemplateFillableGalleryStickerShapes4;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes5 = new StoryTemplateFillableGalleryStickerShapes("HEART", 4, "heart");
        A07 = storyTemplateFillableGalleryStickerShapes5;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes6 = new StoryTemplateFillableGalleryStickerShapes("MULTI_STAR", 5, "multi_star");
        A08 = storyTemplateFillableGalleryStickerShapes6;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes7 = new StoryTemplateFillableGalleryStickerShapes("NORMAL_CORNERS", 6, "normal_corners");
        A09 = storyTemplateFillableGalleryStickerShapes7;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes8 = new StoryTemplateFillableGalleryStickerShapes("RECTANGLE", 7, "rectangle");
        A0A = storyTemplateFillableGalleryStickerShapes8;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes9 = new StoryTemplateFillableGalleryStickerShapes("ROUNDED_CORNERS", 8, "rounded_corners");
        A0B = storyTemplateFillableGalleryStickerShapes9;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes10 = new StoryTemplateFillableGalleryStickerShapes("SQUARE", 9, "square");
        A0C = storyTemplateFillableGalleryStickerShapes10;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes11 = new StoryTemplateFillableGalleryStickerShapes("SQUIRCLE", 10, "squircle");
        A0D = storyTemplateFillableGalleryStickerShapes11;
        StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes12 = new StoryTemplateFillableGalleryStickerShapes("STAR", 11, "star");
        A0E = storyTemplateFillableGalleryStickerShapes12;
        StoryTemplateFillableGalleryStickerShapes[] storyTemplateFillableGalleryStickerShapesArr = {storyTemplateFillableGalleryStickerShapes, storyTemplateFillableGalleryStickerShapes2, storyTemplateFillableGalleryStickerShapes3, storyTemplateFillableGalleryStickerShapes4, storyTemplateFillableGalleryStickerShapes5, storyTemplateFillableGalleryStickerShapes6, storyTemplateFillableGalleryStickerShapes7, storyTemplateFillableGalleryStickerShapes8, storyTemplateFillableGalleryStickerShapes9, storyTemplateFillableGalleryStickerShapes10, storyTemplateFillableGalleryStickerShapes11, storyTemplateFillableGalleryStickerShapes12};
        A03 = storyTemplateFillableGalleryStickerShapesArr;
        A02 = AbstractC12190kN.A00(storyTemplateFillableGalleryStickerShapesArr);
        StoryTemplateFillableGalleryStickerShapes[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC167017dG.A01(values.length));
        for (StoryTemplateFillableGalleryStickerShapes storyTemplateFillableGalleryStickerShapes13 : values) {
            linkedHashMap.put(storyTemplateFillableGalleryStickerShapes13.A00, storyTemplateFillableGalleryStickerShapes13);
        }
        A01 = linkedHashMap;
        CREATOR = new C41857IgB(28);
    }

    public static StoryTemplateFillableGalleryStickerShapes valueOf(String str) {
        return (StoryTemplateFillableGalleryStickerShapes) Enum.valueOf(StoryTemplateFillableGalleryStickerShapes.class, str);
    }

    public static StoryTemplateFillableGalleryStickerShapes[] values() {
        return (StoryTemplateFillableGalleryStickerShapes[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public StoryTemplateFillableGalleryStickerShapes(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
