package X;

import com.facebook.R;
import com.instagram.util.offline.BackgroundPrefetchJobService;
import com.instagram.util.offline.MainFeedBackgroundPrefetchJobService;
import com.instagram.util.offline.StoryBackgroundPrefetchJobService;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4Mk, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Mk {
    public static final /* synthetic */ EnumEntries A02;
    public static final /* synthetic */ C4Mk[] A03;
    public static final C4Mk A04;
    public static final C4Mk A05;
    public static final C4Mk A06;
    public final int A00;
    public final Class A01;

    static {
        C4Mk c4Mk = new C4Mk(BackgroundPrefetchJobService.class, "ALL", 0, R.id.background_prefetch_job_scheduler_id);
        A04 = c4Mk;
        C4Mk c4Mk2 = new C4Mk(StoryBackgroundPrefetchJobService.class, "STORY", 1, R.id.story_background_prefetch_job_scheduler_id);
        A06 = c4Mk2;
        C4Mk c4Mk3 = new C4Mk(MainFeedBackgroundPrefetchJobService.class, "FEED", 2, R.id.feed_background_prefetch_job_scheduler_id);
        A05 = c4Mk3;
        C4Mk[] c4MkArr = {c4Mk, c4Mk2, c4Mk3};
        A03 = c4MkArr;
        A02 = AbstractC12190kN.A00(c4MkArr);
    }

    public static C4Mk valueOf(String str) {
        return (C4Mk) Enum.valueOf(C4Mk.class, str);
    }

    public static C4Mk[] values() {
        return (C4Mk[]) A03.clone();
    }

    public C4Mk(Class cls, String str, int i, int i2) {
        this.A01 = cls;
        this.A00 = i2;
    }
}
