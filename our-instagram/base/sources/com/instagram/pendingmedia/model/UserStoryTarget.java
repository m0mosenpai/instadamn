package com.instagram.pendingmedia.model;

import X.AbstractC37301Gc2;
import X.C37326GcU;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public interface UserStoryTarget extends Parcelable {
    public static final C37326GcU A00 = C37326GcU.A00;
    public static final UserStoryTarget A01 = AbstractC37301Gc2.A0K("ALL");
    public static final UserStoryTarget A02 = AbstractC37301Gc2.A0K("CLOSE_FRIENDS");
    public static final UserStoryTarget A03 = AbstractC37301Gc2.A0K("EXCLUSIVE_STORY");
    public static final UserStoryTarget A04 = AbstractC37301Gc2.A0K("FACEBOOK");
    public static final UserStoryTarget A05 = AbstractC37301Gc2.A0K("FACEBOOK_DATING");
    public static final UserStoryTarget A07 = AbstractC37301Gc2.A0K("HIGHLIGHTS");
    public static final UserStoryTarget A09 = AbstractC37301Gc2.A0K("PRIVATE_STORY");
    public static final UserStoryTarget A0A = AbstractC37301Gc2.A0K("FOLLOWERS_ONLY");
    public static final UserStoryTarget A0B = AbstractC37301Gc2.A0K("MUTUAL_FOLLOWERS");
    public static final UserStoryTarget A0C = AbstractC37301Gc2.A0K("SHARE_TO_FRIENDS_STORY");
    public static final UserStoryTarget A06 = AbstractC37301Gc2.A0K("HALLPASS");
    public static final UserStoryTarget A08 = AbstractC37301Gc2.A0K("OPAL");

    String CBn();

    boolean equals(Object obj);
}
