package com.instagram.api.schemas;

import X.AbstractC12190kN;
import X.AbstractC167017dG;
import X.AbstractC167027dH;
import X.AbstractC25225BEi;
import X.C41854Ig8;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class GiphyRequestSurface implements Parcelable {
    public static final Map A01;
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ GiphyRequestSurface[] A03;
    public static final GiphyRequestSurface A04;
    public static final GiphyRequestSurface A05;
    public static final GiphyRequestSurface A06;
    public static final GiphyRequestSurface A07;
    public static final GiphyRequestSurface A08;
    public static final GiphyRequestSurface A09;
    public static final GiphyRequestSurface A0A;
    public static final GiphyRequestSurface A0B;
    public static final GiphyRequestSurface A0C;
    public static final GiphyRequestSurface A0D;
    public static final Parcelable.Creator CREATOR;
    public final String A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        GiphyRequestSurface giphyRequestSurface = new GiphyRequestSurface("UNRECOGNIZED", 0, "GiphyRequestSurface_unspecified");
        A0D = giphyRequestSurface;
        GiphyRequestSurface giphyRequestSurface2 = new GiphyRequestSurface("STORIES_ASSET_SEARCH_TRAY", 1, "stories_asset_search_tray");
        A0A = giphyRequestSurface2;
        GiphyRequestSurface giphyRequestSurface3 = new GiphyRequestSurface("CREATE_MODE", 2, "create_mode");
        A06 = giphyRequestSurface3;
        GiphyRequestSurface giphyRequestSurface4 = new GiphyRequestSurface("DIRECT", 3, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A07 = giphyRequestSurface4;
        GiphyRequestSurface giphyRequestSurface5 = new GiphyRequestSurface("THREADS_DIRECT", 4, "threads_direct");
        A0B = giphyRequestSurface5;
        GiphyRequestSurface giphyRequestSurface6 = new GiphyRequestSurface("THREADS_STORIES_ASSET_SEARCH_TRAY", 5, "threads_stories_asset_search_tray");
        A0C = giphyRequestSurface6;
        GiphyRequestSurface giphyRequestSurface7 = new GiphyRequestSurface("CLIPS_V2", 6, "clips_v2");
        A04 = giphyRequestSurface7;
        GiphyRequestSurface giphyRequestSurface8 = new GiphyRequestSurface("SMART_GIF", 7, "smart_gif");
        A09 = giphyRequestSurface8;
        GiphyRequestSurface giphyRequestSurface9 = new GiphyRequestSurface("EMOJI_PICKER_SHEET", 8, "emoji_picker_sheet");
        A08 = giphyRequestSurface9;
        GiphyRequestSurface giphyRequestSurface10 = new GiphyRequestSurface("COMMENT", 9, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A05 = giphyRequestSurface10;
        GiphyRequestSurface[] giphyRequestSurfaceArr = {giphyRequestSurface, giphyRequestSurface2, giphyRequestSurface3, giphyRequestSurface4, giphyRequestSurface5, giphyRequestSurface6, giphyRequestSurface7, giphyRequestSurface8, giphyRequestSurface9, giphyRequestSurface10, new GiphyRequestSurface("TEXT_POST_APP", 10, "text_post_app")};
        A03 = giphyRequestSurfaceArr;
        A02 = AbstractC12190kN.A00(giphyRequestSurfaceArr);
        GiphyRequestSurface[] values = values();
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(values.length));
        for (GiphyRequestSurface giphyRequestSurface11 : values) {
            A18.put(giphyRequestSurface11.A00, giphyRequestSurface11);
        }
        A01 = A18;
        CREATOR = new C41854Ig8(97);
    }

    public static GiphyRequestSurface valueOf(String str) {
        return (GiphyRequestSurface) Enum.valueOf(GiphyRequestSurface.class, str);
    }

    public static GiphyRequestSurface[] values() {
        return (GiphyRequestSurface[]) A03.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    public GiphyRequestSurface(String str, int i, String str2) {
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC167027dH.A0l(parcel, this);
    }
}
