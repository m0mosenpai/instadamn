package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.AbstractC37302Gc3;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;
import org.webrtc.MediaStreamTrack;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ClipsTrendType implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ ClipsTrendType[] A03;
    public static final ClipsTrendType A04;
    public static final ClipsTrendType A05;
    public static final ClipsTrendType A06;
    public static final ClipsTrendType A07;
    public static final ClipsTrendType A08;
    public static final ClipsTrendType A09;
    public static final ClipsTrendType A0A;
    public static final ClipsTrendType A0B;
    public static final ClipsTrendType A0C;
    public static final ClipsTrendType A0D;
    public static final ClipsTrendType A0E;
    public static final ClipsTrendType A0F;
    public static final ClipsTrendType A0G;
    public static final ClipsTrendType A0H;
    public static final ClipsTrendType A0I;
    public static final ClipsTrendType A0J;
    public static final ClipsTrendType A0K;
    public static final ClipsTrendType A0L;
    public static final ClipsTrendType A0M;
    public static final ClipsTrendType A0N;
    public static final ClipsTrendType A0O;
    public static final ClipsTrendType A0P;
    public static final ClipsTrendType A0Q;
    public static final ClipsTrendType A0R;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        ClipsTrendType clipsTrendType = new ClipsTrendType("UNRECOGNIZED", 0, "ClipsTrendType_unspecified");
        A0R = clipsTrendType;
        ClipsTrendType clipsTrendType2 = new ClipsTrendType("AUDIO", 1, MediaStreamTrack.AUDIO_TRACK_KIND);
        A04 = clipsTrendType2;
        ClipsTrendType clipsTrendType3 = new ClipsTrendType("AUTHOR", 2, "author");
        A05 = clipsTrendType3;
        ClipsTrendType clipsTrendType4 = new ClipsTrendType("CONSUMPTION_AUDIO", 3, "consumption_audio");
        A06 = clipsTrendType4;
        ClipsTrendType clipsTrendType5 = new ClipsTrendType("DAT", 4, "dat");
        A07 = clipsTrendType5;
        ClipsTrendType clipsTrendType6 = new ClipsTrendType("DVT", 5, "dvt");
        A08 = clipsTrendType6;
        ClipsTrendType clipsTrendType7 = new ClipsTrendType("EFFECT", 6, "effect");
        A09 = clipsTrendType7;
        ClipsTrendType clipsTrendType8 = new ClipsTrendType("EMPTY", 7, "");
        A0A = clipsTrendType8;
        ClipsTrendType clipsTrendType9 = new ClipsTrendType("GDT_AUDIO", 8, "gdt_audio");
        A0B = clipsTrendType9;
        ClipsTrendType clipsTrendType10 = new ClipsTrendType("HASHTAG", 9, "hashtag");
        A0C = clipsTrendType10;
        ClipsTrendType clipsTrendType11 = new ClipsTrendType("ID2", 10, "id2");
        A0D = clipsTrendType11;
        ClipsTrendType clipsTrendType12 = new ClipsTrendType("INTERESTFM_ENTITY", 11, "interestfm_entity");
        A0E = clipsTrendType12;
        ClipsTrendType clipsTrendType13 = new ClipsTrendType("JSTM_DVT", 12, "jstm_dvt");
        A0F = clipsTrendType13;
        ClipsTrendType clipsTrendType14 = new ClipsTrendType("LOCATION", 13, "location");
        A0G = clipsTrendType14;
        ClipsTrendType clipsTrendType15 = new ClipsTrendType("MEDIA", 14, "media");
        A0H = clipsTrendType15;
        ClipsTrendType clipsTrendType16 = new ClipsTrendType("P92_TRENDS_INTERESTFM_ENTITY", 15, "p92_trends_interestfm_entity");
        A0I = clipsTrendType16;
        ClipsTrendType clipsTrendType17 = new ClipsTrendType("P92_TRENDS_INTERESTFM_ENTITY_HIGH_RECALL", 16, "p92_trends_interestfm_entity_high_recall");
        A0J = clipsTrendType17;
        ClipsTrendType clipsTrendType18 = new ClipsTrendType("P92_TRENDS_INTERESTFM_ENTITY_HIGH_RECALL_FAST", 17, "p92_trends_interestfm_entity_high_recall_fast");
        A0K = clipsTrendType18;
        ClipsTrendType clipsTrendType19 = new ClipsTrendType("P92_TRENDS_TOKEN_ENTITY", 18, "p92_trends_token_entity");
        A0L = clipsTrendType19;
        ClipsTrendType clipsTrendType20 = new ClipsTrendType("P92_TRENDS_TOKEN_ENTITY_FAST", 19, "p92_trends_token_entity_fast");
        A0M = clipsTrendType20;
        ClipsTrendType clipsTrendType21 = new ClipsTrendType("P92_TRENDS_TOP_SEARCH_ENTITY", 20, "p92_trends_top_search_entity");
        A0N = clipsTrendType21;
        ClipsTrendType clipsTrendType22 = new ClipsTrendType("P92_TRENDS_TOP_SEARCH_ENTITY_FAST", 21, "p92_trends_top_search_entity_fast");
        A0O = clipsTrendType22;
        ClipsTrendType clipsTrendType23 = new ClipsTrendType("T3_EMBEDDING", 22, "t3_embedding");
        A0P = clipsTrendType23;
        ClipsTrendType clipsTrendType24 = new ClipsTrendType("TUTORIAL", 23, "tutorial");
        A0Q = clipsTrendType24;
        ClipsTrendType[] clipsTrendTypeArr = {clipsTrendType, clipsTrendType2, clipsTrendType3, clipsTrendType4, clipsTrendType5, clipsTrendType6, clipsTrendType7, clipsTrendType8, clipsTrendType9, clipsTrendType10, clipsTrendType11, clipsTrendType12, clipsTrendType13, clipsTrendType14, clipsTrendType15, clipsTrendType16, clipsTrendType17, clipsTrendType18, clipsTrendType19, clipsTrendType20, clipsTrendType21, clipsTrendType22, clipsTrendType23, clipsTrendType24, new ClipsTrendType("USER", 24, PublicKeyCredentialControllerUtility.JSON_KEY_USER)};
        A03 = clipsTrendTypeArr;
        A02 = AbstractC12190kN.A00(clipsTrendTypeArr);
        ClipsTrendType[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC37302Gc3.A01(values.length));
        for (ClipsTrendType clipsTrendType25 : values) {
            A18.put(clipsTrendType25.A00, clipsTrendType25);
        }
        A01 = A18;
        CREATOR = C41854Ig8.A00(17);
    }

    public static ClipsTrendType valueOf(String str) {
        return (ClipsTrendType) Enum.valueOf(ClipsTrendType.class, str);
    }

    public static ClipsTrendType[] values() {
        return (ClipsTrendType[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public ClipsTrendType(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
