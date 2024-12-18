package com.instagram.pendingmedia.model.constants;

import X.AbstractC001800i;
import X.AbstractC10090gM;
import X.AbstractC12190kN;
import X.C01G;
import X.C14360o3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ShareType {
    public static final EnumSet A02;
    public static final EnumSet A03;
    public static final Set A04;
    public static final /* synthetic */ EnumEntries A05;
    public static final /* synthetic */ ShareType[] A06;
    public static final ShareType A07;
    public static final ShareType A08;
    public static final ShareType A09;
    public static final ShareType A0A;
    public static final ShareType A0B;
    public static final ShareType A0C;
    public static final ShareType A0D;
    public static final ShareType A0E;
    public static final ShareType A0F;
    public static final ShareType A0G;
    public static final ShareType A0H;
    public static final ShareType A0I;
    public static final ShareType A0J;
    public static final ShareType A0K;
    public static final ShareType A0L;
    public static final ShareType A0M;
    public static final ShareType A0N;
    public static final ShareType A0O;
    public static final ShareType A0P;
    public static final ShareType A0Q;
    public static final ShareType A0R;
    public static final ShareType A0S;
    public static final ShareType A0T;
    public static final ShareType A0U;
    public static final ShareType A0V;
    public static final ShareType A0W;
    public static final ShareType A0X;
    public static final ShareType A0Y;
    public static final ShareType A0Z;
    public static final ShareType A0a;
    public static final ShareType A0b;
    public static final ShareType A0c;
    public static final ShareType A0d;
    public final boolean A00;
    public final boolean A01;

    static {
        ShareType shareType = new ShareType("FOLLOWERS_SHARE", false, false, 0);
        A0H = shareType;
        ShareType shareType2 = new ShareType("DIRECT_SHARE", false, false, 1);
        A0E = shareType2;
        ShareType shareType3 = new ShareType("REEL_SHARE", true, true, 2);
        A0V = shareType3;
        ShareType shareType4 = new ShareType("DIRECT_STORY_SHARE", true, false, 3);
        A0F = shareType4;
        ShareType shareType5 = new ShareType("REEL_SHARE_AND_DIRECT_STORY_SHARE", true, true, 4);
        A0W = shareType5;
        ShareType shareType6 = new ShareType("NAMETAG_SELFIE", false, false, 5);
        A0N = shareType6;
        ShareType shareType7 = new ShareType("NAMETAG_BACKGROUND_IMAGE", false, false, 6);
        A0M = shareType7;
        ShareType shareType8 = new ShareType("UNKNOWN", false, false, 7);
        A0b = shareType8;
        ShareType shareType9 = new ShareType("IGTV", false, false, 8);
        A0J = shareType9;
        ShareType shareType10 = new ShareType("CLIPS", false, false, 9);
        A08 = shareType10;
        ShareType shareType11 = new ShareType("POST_LIVE_IGTV", false, false, 10);
        A0Q = shareType11;
        ShareType shareType12 = new ShareType("POST_LIVE_IGTV_COVER_PHOTO", false, false, 11);
        A0R = shareType12;
        ShareType shareType13 = new ShareType("CLIPS_PANAVIDEO", false, false, 12);
        A09 = shareType13;
        ShareType shareType14 = new ShareType("MEDIA_KIT", false, false, 13);
        A0L = shareType14;
        ShareType shareType15 = new ShareType("EXPRESSIVE_QUESTION_STICKER", false, false, 14);
        A0G = shareType15;
        ShareType shareType16 = new ShareType("PROMPTS", false, false, 15);
        A0T = shareType16;
        ShareType shareType17 = new ShareType("HIGHLIGHTS", false, false, 16);
        A0I = shareType17;
        ShareType shareType18 = new ShareType("CUTOUT_STICKER", false, false, 17);
        A0D = shareType18;
        ShareType shareType19 = new ShareType("STORY_TEMPLATE_ASSET", false, false, 18);
        A0Y = shareType19;
        ShareType shareType20 = new ShareType("STORY_TEMPLATE_BACKGROUND_ASSET", false, false, 19);
        A0Z = shareType20;
        ShareType shareType21 = new ShareType("CLIPS_REUSABLE_TEMPLATE_ASSETS", false, false, 20);
        A0A = shareType21;
        ShareType shareType22 = new ShareType("CLIPS_WITH_TEMPLATE", false, false, 21);
        A0C = shareType22;
        ShareType shareType23 = new ShareType("AUDIO_NOTE", false, false, 22);
        A07 = shareType23;
        ShareType shareType24 = new ShareType("NOTE", false, false, 23);
        A0O = shareType24;
        ShareType shareType25 = new ShareType("VIDEO_IN_NOTE_POG", false, false, 24);
        A0c = shareType25;
        ShareType shareType26 = new ShareType("SHARE_TO_FRIENDS_STORY", true, true, 25);
        A0X = shareType26;
        ShareType shareType27 = new ShareType("NOTE_MEDIA_REPLY", false, false, 26);
        A0P = shareType27;
        ShareType shareType28 = new ShareType("WONDER_WALL", false, false, 27);
        A0d = shareType28;
        ShareType shareType29 = new ShareType("CLIPS_UNDERLYING_SPINNABLE_VIDEO", false, false, 28);
        A0B = shareType29;
        ShareType shareType30 = new ShareType("QUICKSNAP", false, false, 29);
        A0U = shareType30;
        ShareType shareType31 = new ShareType("POTATO", false, false, 30);
        A0S = shareType31;
        ShareType shareType32 = new ShareType("INVALID", false, false, 31);
        A0K = shareType32;
        ShareType shareType33 = new ShareType("UNINITIALIZED", false, false, 32);
        A0a = shareType33;
        ShareType[] shareTypeArr = new ShareType[33];
        System.arraycopy(new ShareType[]{shareType, shareType2, shareType3, shareType4, shareType5, shareType6, shareType7, shareType8, shareType9, shareType10, shareType11, shareType12, shareType13, shareType14, shareType15, shareType16, shareType17, shareType18, shareType19, shareType20, shareType21, shareType22, shareType23, shareType24, shareType25, shareType26, shareType27}, 0, shareTypeArr, 0, 27);
        System.arraycopy(new ShareType[]{shareType28, shareType29, shareType30, shareType31, shareType32, shareType33}, 0, shareTypeArr, 27, 6);
        A06 = shareTypeArr;
        A05 = AbstractC12190kN.A00(shareTypeArr);
        C01G c01g = new C01G();
        for (ShareType shareType34 : values()) {
            c01g.add(shareType34.toString());
        }
        A04 = AbstractC10090gM.A04(c01g);
        ShareType[] values = values();
        ArrayList arrayList = new ArrayList();
        for (ShareType shareType35 : values) {
            if (shareType35.A00) {
                arrayList.add(shareType35);
            }
        }
        EnumSet copyOf = EnumSet.copyOf((Collection) AbstractC001800i.A0k(arrayList));
        C14360o3.A07(copyOf);
        A02 = copyOf;
        ShareType[] values2 = values();
        ArrayList arrayList2 = new ArrayList();
        for (ShareType shareType36 : values2) {
            if (shareType36.A01) {
                arrayList2.add(shareType36);
            }
        }
        EnumSet copyOf2 = EnumSet.copyOf((Collection) AbstractC001800i.A0k(arrayList2));
        C14360o3.A07(copyOf2);
        A03 = copyOf2;
    }

    public static ShareType valueOf(String str) {
        return (ShareType) Enum.valueOf(ShareType.class, str);
    }

    public static ShareType[] values() {
        return (ShareType[]) A06.clone();
    }

    public ShareType(String str, boolean z, boolean z2, int i) {
        this.A01 = z;
        this.A00 = z2;
    }
}
