package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.Oa4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55053Oa4 {
    public static final C03190Dc A00;
    public static final C55053Oa4 A01 = new Object();
    public static final ArrayList A02;
    public static final ArrayList A03;

    public final void A01(Context context, C18920wW c18920wW, C83403nh c83403nh, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        C14360o3.A0B(context, 0);
        Intent intent = new Intent("incoming_notification");
        intent.putExtra(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        intent.putExtra("sender_name", str2);
        intent.putExtra("message_text", str3);
        intent.putExtra("is_group_thread", z);
        if (str4 != null && str4.length() != 0) {
            intent.putExtra("instagram_notification_message", str4);
        }
        if (str5 != null) {
            intent.putExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str5);
        }
        if (str6 != null) {
            intent.putExtra("instagram_fb_thread_id", str6);
        }
        if (str8 != null) {
            intent.putExtra("message_id", str8);
        }
        if (str9 != null) {
            intent.putExtra("message_user_id", str9);
        }
        if (str7 != null) {
            intent.putExtra("thread_name", str7);
        }
        if (c83403nh != null) {
            intent.putExtra("message_type", AbstractC46998KqH.A00(c83403nh));
            intent.putExtra("instagram_message_type", c83403nh.A10.A00);
        }
        if (arrayList != null) {
            intent.putStringArrayListExtra("message_participant_list", arrayList);
        }
        if (str10 != null) {
            intent.putExtra("push_id", str10);
        }
        if (str11 != null && str11.length() != 0) {
            intent.putExtra("thread_profile_pic_url", str11);
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            intent.putExtra("participant_profile_pic_urls", arrayList2);
        }
        if (str12 != null && str12.length() != 0) {
            intent.putStringArrayListExtra("message_attachment_uris", MSX.A0m(str12));
        }
        A00(context, intent, c18920wW);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Oa4, java.lang.Object] */
    static {
        ArrayList A1F = AbstractC166987dD.A1F(AbstractC166987dD.A1J(AbstractC08760ce.A1f));
        A03 = A1F;
        ArrayList A1F2 = AbstractC166987dD.A1F(AbstractC43592JPx.A13("com.facebook.stella", "com.facebook.stella_debug"));
        A02 = A1F2;
        A00 = new C03190Dc(AbstractC08590cN.A03(Collections.unmodifiableSet(new HashSet(A1F)), Collections.unmodifiableSet(new HashSet(A1F2))));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(8:3|4|8|9|10|(1:12)(3:16|(2:18|(2:20|(3:24|25|(4:27|(2:30|28)|31|32)))(2:33|(3:35|25|(0))))|36)|13|14)|142|8|9|10|(0)(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x027a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x027b, code lost:
    
        r3.A07("process_not_foregrounded", X.AbstractC167017dG.A0n(r2, "Not foregrounded: ", X.AbstractC166987dD.A1C()), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x028b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x028c, code lost:
    
        r3.A07("not_allowed", X.AbstractC167017dG.A0n(r2, "Failed starting service since the service is not exposed: ", X.AbstractC166987dD.A1C()), false);
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01cf A[Catch: IllegalStateException -> 0x027a, SecurityException -> 0x028b, TryCatch #2 {IllegalStateException -> 0x027a, SecurityException -> 0x028b, blocks: (B:10:0x01b9, B:12:0x01cf, B:16:0x01dc, B:18:0x01e2, B:22:0x01f0, B:25:0x0205, B:27:0x0233, B:28:0x0256, B:30:0x025c, B:32:0x0260, B:33:0x01fb, B:36:0x0272), top: B:9:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01dc A[Catch: IllegalStateException -> 0x027a, SecurityException -> 0x028b, TryCatch #2 {IllegalStateException -> 0x027a, SecurityException -> 0x028b, blocks: (B:10:0x01b9, B:12:0x01cf, B:16:0x01dc, B:18:0x01e2, B:22:0x01f0, B:25:0x0205, B:27:0x0233, B:28:0x0256, B:30:0x025c, B:32:0x0260, B:33:0x01fb, B:36:0x0272), top: B:9:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0233 A[Catch: IllegalStateException -> 0x027a, SecurityException -> 0x028b, TryCatch #2 {IllegalStateException -> 0x027a, SecurityException -> 0x028b, blocks: (B:10:0x01b9, B:12:0x01cf, B:16:0x01dc, B:18:0x01e2, B:22:0x01f0, B:25:0x0205, B:27:0x0233, B:28:0x0256, B:30:0x025c, B:32:0x0260, B:33:0x01fb, B:36:0x0272), top: B:9:0x01b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r13, android.content.Intent r14, X.C18920wW r15) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55053Oa4.A00(android.content.Context, android.content.Intent, X.0wW):void");
    }
}
