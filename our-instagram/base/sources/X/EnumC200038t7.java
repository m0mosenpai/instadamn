package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.8t7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC200038t7 {
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ EnumC200038t7[] A02;
    public static final EnumC200038t7 A04;
    public final ImmutableList A00;
    public static final EnumC200038t7 A05 = new EnumC200038t7() { // from class: X.8t8
        {
            C14360o3.A07(ImmutableList.of((Object) "IG_REELS_COMPOSER", (Object) "IG_REELS_PANAVISION_COMPOSER", (Object) "IG_REELS_COMPOSER_SHARE_BUTTON", (Object) "IG_REELS_PANAVISION_COMPOSER_SHARE_BUTTON"));
        }
    };
    public static final EnumC200038t7 A03 = new EnumC200038t7() { // from class: X.8t9
        {
            C14360o3.A07(ImmutableList.of((Object) "IG_FEED_COMPOSER_SHARE_BUTTON", (Object) "IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE", (Object) "IG_FEED_COMPOSER_SHARE_TO_THREADS_TOGGLE_ENABLE"));
        }
    };
    public static final EnumC200038t7 A06 = new EnumC200038t7() { // from class: X.8tA
        {
            C14360o3.A07(ImmutableList.of((Object) "IG_AFTER_STORY_SHARE", (Object) "IG_STORY_AFTER_SHARE_SHEET", (Object) "IG_STORY_COMPOSER_YOUR_STORY_BUTTON", (Object) "IG_STORY_SHARE_SHEET_SHARE_BUTTON", (Object) "IG_STORY_DUAL_DESTPICKER_SHARE_BUTTON"));
        }
    };

    static {
        EnumC200038t7 enumC200038t7 = new EnumC200038t7() { // from class: X.8tB
            {
                C14360o3.A07(ImmutableList.of((Object) "IG_FEED_SHARE_LATER"));
            }
        };
        A04 = enumC200038t7;
        EnumC200038t7[] enumC200038t7Arr = {A05, A03, A06, enumC200038t7};
        A02 = enumC200038t7Arr;
        A01 = AbstractC12190kN.A00(enumC200038t7Arr);
    }

    public static EnumC200038t7[] values() {
        return (EnumC200038t7[]) A02.clone();
    }

    public final boolean A00(UserSession userSession) {
        C06090Tz c06090Tz;
        long j;
        if (!(this instanceof C200058t9) && !(this instanceof C200068tA) && (this instanceof C200048t8)) {
            C14360o3.A0B(userSession, 0);
            c06090Tz = C06090Tz.A05;
            j = 2342161450238679180L;
        } else {
            C14360o3.A0B(userSession, 0);
            c06090Tz = C06090Tz.A05;
            j = 36318441025050765L;
        }
        return C18U.A06(c06090Tz, userSession, j);
    }

    public EnumC200038t7(ImmutableList immutableList, String str, int i) {
        this.A00 = immutableList;
    }
}
