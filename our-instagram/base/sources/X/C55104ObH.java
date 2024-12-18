package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.fragment.EditMediaInfoFragment;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.tagging.activity.TaggingActivity;
import com.instagram.tagging.activity.mediaTaggingInfo.MediaTaggingInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ObH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55104ObH {
    public ProductCollectionFeedTaggingMeta A00;
    public MediaTaggingInfo A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public ArrayList A07;
    public ArrayList A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0J;
    public final EnumC53319Nhv A0K;
    public final Context A0L;
    public boolean A0I = true;
    public boolean A0H = true;

    public final void A03(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        this.A06 = userSession.token;
    }

    public final void A04(AnonymousClass841 anonymousClass841, C47Z c47z) {
        String str = c47z.A35;
        ImageUrl A00 = AbstractC55159OdN.A00(c47z);
        String A02 = AbstractC55159OdN.A02(anonymousClass841, c47z);
        EnumC40111tc enumC40111tc = c47z.A1G;
        ArrayList arrayList = c47z.A40;
        List list = c47z.A48;
        ArrayList arrayList2 = c47z.A41;
        ArrayList arrayList3 = c47z.A43;
        ArrayList A04 = AbstractC55159OdN.A04(c47z);
        MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(A00, enumC40111tc, c47z.A1N, str, A02, c47z.A2d, null, arrayList, arrayList2, arrayList3, A04, list, c47z.A4L, null, null);
        float f = c47z.A02;
        if (f > 0.0f) {
            mediaTaggingInfo.A00 = f;
            mediaTaggingInfo.A0H = true;
        }
        this.A01 = mediaTaggingInfo;
        this.A09 = null;
        this.A03 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r6 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0132 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(X.C38321qM r32, X.C38321qM r33, java.lang.String r34, java.util.ArrayList r35, java.util.List r36, java.util.List r37, java.util.List r38, java.util.List r39, java.util.Map r40, java.util.Map r41, java.util.Map r42) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55104ObH.A06(X.1qM, X.1qM, java.lang.String, java.util.ArrayList, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map, java.util.Map):void");
    }

    public final void A07(C38321qM c38321qM, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list, List list2, List list3) {
        User A14;
        C14360o3.A0B(c38321qM, 0);
        if (!c38321qM.A5M()) {
            Context context = this.A0L;
            String id = c38321qM.getId();
            if (id != null) {
                String str2 = null;
                if (AbstractC25226BEj.A14(c38321qM) != null && (A14 = AbstractC25226BEj.A14(c38321qM)) != null) {
                    str2 = A14.getId();
                }
                ExtendedImageUrl A01 = AbstractC55159OdN.A01(context, c38321qM);
                String A03 = AbstractC55159OdN.A03(c38321qM);
                EnumC40111tc BRp = c38321qM.BRp();
                ArrayList A1E = AbstractC166987dD.A1E();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String str3 = MSW.A0n(it).A01;
                        if (str3 != null) {
                            A1E.add(str3);
                        }
                    }
                }
                if (A1E.isEmpty()) {
                    A1E = null;
                }
                MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(A01, BRp, null, id, A03, str, str2, arrayList, arrayList3, null, A1E, arrayList2, list2, list3, arrayList4);
                if (c38321qM.A0m() > 0.0f) {
                    mediaTaggingInfo.A00 = c38321qM.A0m();
                    mediaTaggingInfo.A0H = true;
                }
                this.A01 = mediaTaggingInfo;
                this.A09 = null;
                this.A03 = null;
                return;
            }
            throw AbstractC166987dD.A12("Media id cannot be null.");
        }
        throw AbstractC31172DnG.A0u();
    }

    public static void A00(EditMediaInfoFragment editMediaInfoFragment, C55104ObH c55104ObH) {
        editMediaInfoFragment.A0J.getClass();
        C38321qM c38321qM = editMediaInfoFragment.A0I;
        List list = editMediaInfoFragment.A1B;
        C38321qM c38321qM2 = (C38321qM) list.get(editMediaInfoFragment.A0J.A03);
        HashMap hashMap = editMediaInfoFragment.A0d;
        ArrayList arrayList = editMediaInfoFragment.A0W;
        HashMap hashMap2 = editMediaInfoFragment.A0e;
        c55104ObH.A06(c38321qM, c38321qM2, editMediaInfoFragment.A0V, arrayList, list, editMediaInfoFragment.A0g, editMediaInfoFragment.A0Y, editMediaInfoFragment.A0X, hashMap, hashMap2, editMediaInfoFragment.A0c);
    }

    public static void A01(EditMediaInfoFragment editMediaInfoFragment, C55104ObH c55104ObH) {
        c55104ObH.A0D = editMediaInfoFragment.A0I.A1x().equals(EnumC76383bi.A07);
        c55104ObH.A0C = editMediaInfoFragment.A0I.A1x().equals(EnumC76383bi.A04);
        c55104ObH.A0G = editMediaInfoFragment.A0I.A62();
        c55104ObH.A0E = editMediaInfoFragment.A0I.A6P();
    }

    public final Intent A02() {
        ArrayList<? extends Parcelable> A1F;
        if (this.A06 != null) {
            if (AbstractC167007dF.A1W(this.A01) ^ AbstractC167007dF.A1W(this.A09)) {
                Intent A08 = MSW.A08(this.A0L, TaggingActivity.class);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putSerializable("tag_type", this.A0K);
                A0b.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A06);
                A0b.putBoolean("in_edit_mode", this.A0B);
                A0b.putBoolean("is_scheduled_post", this.A0F);
                A0b.putBoolean("has_seen_OPT_tooltip", this.A0A);
                A0b.putString("for_post_in_group_id", null);
                A0b.putString("prior_submodule", this.A05);
                A0b.putBoolean("is_open_carousel_enabled", this.A0E);
                Boolean bool = this.A02;
                if (bool != null) {
                    A0b.putBoolean("is_clips_entry_point", bool.booleanValue());
                }
                ArrayList<String> arrayList = this.A07;
                if (arrayList != null) {
                    A0b.putStringArrayList("mentioned_seller_ids", arrayList);
                }
                ArrayList<String> arrayList2 = this.A08;
                if (arrayList2 != null) {
                    A0b.putStringArrayList("tagged_seller_ids", arrayList2);
                }
                MediaTaggingInfo mediaTaggingInfo = this.A01;
                if (AbstractC167007dF.A1W(mediaTaggingInfo)) {
                    A1F = AbstractC25225BEi.A17(1);
                    if (mediaTaggingInfo != null) {
                        A1F.add(mediaTaggingInfo);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    A1F = AbstractC166987dD.A1F(this.A09);
                }
                A0b.putParcelableArrayList("media_tagging_info_list", A1F);
                A0b.putParcelable("tagged_collection_info", this.A00);
                String str = this.A03;
                if (str != null) {
                    A0b.putString("initial_page", str);
                }
                A0b.putBoolean("should_enable_product_tagging", this.A0J);
                A0b.putBoolean("is_exclusive_content", this.A0D);
                A0b.putBoolean("is_close_friends_content", this.A0C);
                A0b.putBoolean("is_share_to_profile_only_content", this.A0G);
                A0b.putString("media_integrity_review_decision", this.A04);
                A0b.putBoolean("should_enable_people_tagging", this.A0I);
                A0b.putBoolean("should_enable_collaborator_tagging", this.A0H);
                A08.putExtras(A0b);
                return A08;
            }
            throw AbstractC31172DnG.A0u();
        }
        throw AbstractC166997dE.A0g();
    }

    public C55104ObH(Context context, EnumC53319Nhv enumC53319Nhv) {
        this.A0L = context;
        this.A0K = enumC53319Nhv;
    }

    public final void A05(AnonymousClass841 anonymousClass841, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C47Z c47z = (C47Z) list.get(i);
            String str = c47z.A35;
            ImageUrl A00 = AbstractC55159OdN.A00(c47z);
            String A02 = AbstractC55159OdN.A02(anonymousClass841, c47z);
            EnumC40111tc enumC40111tc = c47z.A1G;
            ArrayList arrayList = c47z.A40;
            List list2 = c47z.A48;
            ArrayList arrayList2 = c47z.A41;
            ArrayList arrayList3 = c47z.A43;
            ArrayList A04 = AbstractC55159OdN.A04(c47z);
            MediaTaggingInfo mediaTaggingInfo = new MediaTaggingInfo(A00, enumC40111tc, c47z.A1N, str, A02, c47z.A2d, null, arrayList, arrayList2, arrayList3, A04, list2, c47z.A4L, null, null);
            mediaTaggingInfo.A01 = i;
            if (c47z.A02 > 0.0f) {
                mediaTaggingInfo.A00 = c47z.A02;
                mediaTaggingInfo.A0H = true;
            }
            A1E.add(mediaTaggingInfo);
        }
        this.A01 = null;
        this.A09 = A1E;
        this.A03 = null;
    }
}
