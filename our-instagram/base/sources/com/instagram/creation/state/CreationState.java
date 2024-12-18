package com.instagram.creation.state;

import X.AbstractC166997dE;
import X.AbstractC31175DnJ;
import X.LNM;
import X.MSW;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class CreationState implements Parcelable {
    public static final /* synthetic */ CreationState[] A00;
    public static final CreationState A01;
    public static final CreationState A02;
    public static final CreationState A03;
    public static final CreationState A04;
    public static final CreationState A05;
    public static final CreationState A06;
    public static final CreationState A07;
    public static final CreationState A08;
    public static final CreationState A09;
    public static final CreationState A0A;
    public static final CreationState A0B;
    public static final CreationState A0C;
    public static final CreationState A0D;
    public static final CreationState A0E;
    public static final CreationState A0F;
    public static final CreationState A0G;
    public static final CreationState A0H;
    public static final CreationState A0I;
    public static final CreationState A0J;
    public static final CreationState A0K;
    public static final CreationState A0L;
    public static final CreationState A0M;
    public static final CreationState A0N;
    public static final CreationState A0O;
    public static final CreationState A0P;
    public static final CreationState A0Q;
    public static final CreationState A0R;
    public static final CreationState A0S;
    public static final CreationState A0T;
    public static final CreationState A0U;
    public static final CreationState A0V;
    public static final CreationState A0W;
    public static final CreationState A0X;
    public static final CreationState A0Y;
    public static final CreationState A0Z;
    public static final CreationState A0a;
    public static final CreationState A0b;
    public static final CreationState A0c;
    public static final Parcelable.Creator CREATOR;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        CreationState A0Y2 = MSW.A0Y("ACCESSIBILITY_SETTINGS", 0);
        A01 = A0Y2;
        CreationState A0Y3 = MSW.A0Y("ADJUST", 1);
        A02 = A0Y3;
        CreationState A0Y4 = MSW.A0Y("ADVANCED_SETTINGS", 2);
        A03 = A0Y4;
        CreationState A0Y5 = MSW.A0Y("ALBUM_EDIT", 3);
        A04 = A0Y5;
        CreationState A0Y6 = MSW.A0Y("ALT_TEXT_INPUT", 4);
        A05 = A0Y6;
        CreationState A0Y7 = MSW.A0Y("AUDIENCE_RESTRICTIONS", 5);
        A06 = A0Y7;
        CreationState A0Y8 = MSW.A0Y("BRANDED_CONTENT_CONSOLIDATED_TAG", 6);
        A07 = A0Y8;
        CreationState A0Y9 = MSW.A0Y("BRANDED_CONTENT_MENU", 7);
        A08 = A0Y9;
        CreationState A0Y10 = MSW.A0Y("BRANDED_CONTENT_TAG", 8);
        A09 = A0Y10;
        CreationState A0Y11 = MSW.A0Y("BRANDED_CONTENT_TAGGED_BUSINESS_PARTNER", 9);
        A0A = A0Y11;
        CreationState A0Y12 = MSW.A0Y("BRANDED_CONTENT_TAG_OPT_IN", 10);
        A0B = A0Y12;
        CreationState A0Y13 = MSW.A0Y("CAPTION_POLL_ADD_ON", 11);
        A0C = A0Y13;
        CreationState A0Y14 = MSW.A0Y("CAPTION_PROMPT_ADD_ON", 12);
        A0D = A0Y14;
        CreationState A0Y15 = MSW.A0Y("CAPTURE", 13);
        A0E = A0Y15;
        CreationState A0Y16 = MSW.A0Y("CROP", 14);
        A0F = A0Y16;
        CreationState A0Y17 = MSW.A0Y("CTA_SELECTOR", 15);
        A0G = A0Y17;
        CreationState A0Y18 = MSW.A0Y("EXTERNAL_ALBUM_EDIT", 16);
        A0H = A0Y18;
        CreationState A0Y19 = MSW.A0Y("EXTERNAL_PHOTO_EDIT", 17);
        A0I = A0Y19;
        CreationState A0Y20 = MSW.A0Y("GALLERY_PICKER", 18);
        A0J = A0Y20;
        CreationState A0Y21 = MSW.A0Y("HIGHLIGHTS_LIST", 19);
        A0K = A0Y21;
        CreationState A0Y22 = MSW.A0Y("INIT", 20);
        A0L = A0Y22;
        CreationState A0Y23 = MSW.A0Y("LIMIT_LOCATIONS", 21);
        A0M = A0Y23;
        CreationState A0Y24 = MSW.A0Y("LOCATION_TAG", 22);
        A0N = A0Y24;
        CreationState A0Y25 = MSW.A0Y("MANAGE", 23);
        A0O = A0Y25;
        CreationState A0Y26 = MSW.A0Y("MANAGE_DRAFTS", 24);
        A0P = A0Y26;
        CreationState A0Y27 = MSW.A0Y("PARTNERSHIP_LABEL_AND_ADS", 25);
        A0Q = A0Y27;
        CreationState A0Y28 = MSW.A0Y("PHOTO_EDIT", 26);
        A0R = A0Y28;
        CreationState A0Y29 = MSW.A0Y("PREPARE_SHARE", 27);
        A0S = A0Y29;
        CreationState A0Y30 = MSW.A0Y("PREPARE_VIDEO_EDIT", 28);
        A0T = A0Y30;
        CreationState A0Y31 = MSW.A0Y("PRIVACY", 29);
        A0U = A0Y31;
        CreationState A0Y32 = MSW.A0Y("PUBLISH_SCREEN_CATEGORY", 30);
        A0V = A0Y32;
        CreationState A0Y33 = MSW.A0Y("SHARE", 31);
        A0W = A0Y33;
        CreationState A0Y34 = MSW.A0Y("THUMBNAIL_VIEW", 32);
        A0X = A0Y34;
        CreationState A0Y35 = MSW.A0Y("UPCOMING_EVENTS_LIST", 33);
        A0Y = A0Y35;
        CreationState A0Y36 = MSW.A0Y("UPCOMING_EVENT_TAG", 34);
        A0Z = A0Y36;
        CreationState A0Y37 = MSW.A0Y("UPLOAD", 35);
        A0a = A0Y37;
        CreationState A0Y38 = MSW.A0Y("VIDEO_CROP", 36);
        A0b = A0Y38;
        CreationState A0Y39 = MSW.A0Y("VIDEO_EDIT", 37);
        A0c = A0Y39;
        CreationState[] creationStateArr = new CreationState[38];
        System.arraycopy(new CreationState[]{A0Y29, A0Y30, A0Y31, A0Y32, A0Y33, A0Y34, A0Y35, A0Y36, A0Y37, A0Y38, A0Y39}, AbstractC31175DnJ.A1b(new CreationState[]{A0Y2, A0Y3, A0Y4, A0Y5, A0Y6, A0Y7, A0Y8, A0Y9, A0Y10, A0Y11, A0Y12, A0Y13, A0Y14, A0Y15, A0Y16, A0Y17, A0Y18, A0Y19, A0Y20, A0Y21, A0Y22, A0Y23, A0Y24, A0Y25, A0Y26, A0Y27, A0Y28}, creationStateArr) ? 1 : 0, creationStateArr, 27, 11);
        A00 = creationStateArr;
        CREATOR = new LNM(79);
    }

    public static CreationState valueOf(String str) {
        return (CreationState) Enum.valueOf(CreationState.class, str);
    }

    public static CreationState[] values() {
        return (CreationState[]) A00.clone();
    }

    public CreationState(String str, int i) {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC166997dE.A1I(parcel, this);
    }
}
