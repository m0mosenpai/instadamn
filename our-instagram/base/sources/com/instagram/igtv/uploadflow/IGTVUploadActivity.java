package com.instagram.igtv.uploadflow;

import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC31175DnJ;
import X.AbstractC37300Gc1;
import X.AbstractC43591JPw;
import X.AbstractC43594JPz;
import X.C00O;
import X.C0f9;
import X.C14360o3;
import X.C1810281e;
import X.C1XM;
import X.C22P;
import X.C23031Ai;
import X.C2d4;
import X.C2d5;
import X.C3KD;
import X.C3KF;
import X.C3O0;
import X.C41451vu;
import X.C50121MBv;
import X.C54546O7y;
import X.C54741OFs;
import X.C54973OTf;
import X.C55042OZo;
import X.C56034Ou6;
import X.C56352iT;
import X.C56437P3y;
import X.C57251PbZ;
import X.C57374PdY;
import X.C57538PgC;
import X.InterfaceC09390do;
import X.InterfaceC41501vz;
import X.InterfaceC57827Pkt;
import X.MSW;
import X.MSY;
import X.NNE;
import X.NX0;
import X.O80;
import X.P45;
import android.os.Bundle;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.draft.model.IGTVDraftsRepository;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class IGTVUploadActivity extends IgFragmentActivity implements C2d4, C2d5 {
    public Bundle A00;
    public C22P A01;
    public UserSession A02;
    public Integer A03;
    public final C54973OTf A04 = new C54973OTf(this);
    public final InterfaceC09390do A06 = C1XM.A00(C57374PdY.A00);
    public final InterfaceC09390do A05 = C1XM.A00(C57538PgC.A01(this, 10));
    public final InterfaceC41501vz A09 = C56034Ou6.A00(this, 8);
    public final InterfaceC41501vz A08 = C56034Ou6.A00(this, 7);
    public final InterfaceC09390do A07 = AbstractC25225BEi.A0a(C57538PgC.A01(this, 11), C57538PgC.A01(this, 12), new C57251PbZ(14, null, this), AbstractC25225BEi.A1D(IGTVUploadViewModel.class));

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        long j;
        C14360o3.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("uploadflow.extra.is_activity_restart", true);
        InterfaceC09390do interfaceC09390do = this.A07;
        IGTVUploadViewModel A0b = MSW.A0b(interfaceC09390do);
        C55042OZo c55042OZo = A0b.A08;
        C54546O7y c54546O7y = new C54546O7y();
        NX0 nx0 = c55042OZo.A07;
        Object obj = ((C1810281e) nx0).A00.first;
        C14360o3.A07(obj);
        InterfaceC57827Pkt interfaceC57827Pkt = (InterfaceC57827Pkt) obj;
        C14360o3.A0B(interfaceC57827Pkt, 2);
        Map map = c54546O7y.A01;
        Number A0Q = AbstractC37300Gc1.A0Q(interfaceC57827Pkt, map);
        if (A0Q != null) {
            bundle.putInt("uploadnavigator.extra.saved_current_state", A0Q.intValue());
            Object obj2 = c55042OZo.A08.A00;
            if (obj2 == null) {
                obj2 = C56437P3y.A00;
            }
            Number A0Q2 = AbstractC37300Gc1.A0Q(obj2, map);
            if (A0Q2 != null) {
                bundle.putInt("uploadnavigator.extra.saved_start_state", A0Q2.intValue());
                int i2 = c55042OZo.A00 + 1;
                c55042OZo.A00 = i2;
                bundle.putInt("uploadnavigator.extra.num_system_save", i2);
                bundle.putParcelable("uploadnavigator.extra.upload_flow_progress", c55042OZo.A01);
                c55042OZo.A0A.getValue();
                C14360o3.A07(((C1810281e) nx0).A00.first);
                P45 p45 = A0b.A0M;
                bundle.putString("uploadviewmodel.key.title", p45.A0N);
                bundle.putString("uploadviewmodel.key.caption", p45.A0H);
                List list = p45.A0P;
                C14360o3.A0C(list, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.model.people.PeopleTag>");
                bundle.putParcelableArrayList("uploadviewmodel.key.people_tags", (ArrayList) list);
                String str = p45.A0I;
                if (str != null && str.length() != 0) {
                    bundle.putString("uploadviewmodel.key.collaborator_id", str);
                }
                bundle.putInt("uploadviewmodel.key.filter_id", p45.A05);
                bundle.putInt("uploadviewmodel.key.filter_strength", p45.A06);
                bundle.putFloat("uploadviewmodel.key.post_crop_aspect_ratio", p45.A00);
                bundle.putBoolean("uploadviewmodel.key.is_landscape_surface", p45.A0d);
                bundle.putBoolean("uploadviewmodel.key.is_cover_image_custom", p45.A0Y);
                String str2 = p45.A0J;
                if (str2 != null && str2.length() != 0) {
                    bundle.putString("uploadviewmodel.key.cover_image_file_path", str2);
                }
                bundle.putInt("uploadviewmodel.key.cover_image_width", p45.A04);
                bundle.putInt("uploadviewmodel.key.cover_image_height", p45.A03);
                bundle.putInt("uploadviewmodel.key.cover_frame_time_ms", p45.A02);
                bundle.putBoolean("uploadviewmodel.key.is_cover_frame_edited", p45.A0Z);
                MediaCroppingCoordinates mediaCroppingCoordinates = p45.A09;
                if (mediaCroppingCoordinates != null) {
                    bundle.putParcelable("uploadviewmodel.key.feed_preview_crop_coordinates", mediaCroppingCoordinates);
                }
                MediaCroppingCoordinates mediaCroppingCoordinates2 = p45.A0A;
                if (mediaCroppingCoordinates2 != null) {
                    bundle.putParcelable("uploadviewmodel.key.profile_crop_coordinates", mediaCroppingCoordinates2);
                }
                List list2 = p45.A0O;
                if (list2 != null) {
                    bundle.putParcelableArrayList("uploadviewmodel.key.branded_content_tag", AbstractC166987dD.A1F(list2));
                }
                bundle.putBoolean("uploadviewmodel.key.is_paid_partnership", p45.A0f);
                bundle.putParcelable("uploadviewmodel.key.media_gating_info", p45.A07);
                bundle.putParcelable("uploadviewmodel.key.branded_content_project_metadata", p45.A08);
                bundle.putBoolean("uploadviewmodel.key.is_funded_content_deal", p45.A0a);
                bundle.putBoolean("uploadviewmodel.key.is_like_and_view_counts_disabled", p45.A0e);
                bundle.putBoolean("uploadviewmodel.key.are_captions_enabled", p45.A0Q);
                bundle.putBoolean("uploadviewmodel.key.are_comments_disabled", p45.A0R);
                bundle.putBoolean("uploadviewmodel.key.check_ads_toggle_turned_off", p45.A0S);
                bundle.putBoolean("uploadviewmodel.key.has_shown_ads_toggle_tooltip", p45.A0V);
                bundle.putString("uploadviewmodel.key.group_destination_user_id", p45.A0M);
                bundle.putBoolean("uploadviewmodel.key.share_to_facebook", p45.A0h);
                bundle.putParcelable("uploadviewmodel.key.shopping_metadata", p45.A0B);
                bundle.putParcelable("uploadviewmodel.key.shopping_multi_select_state", p45.A0F);
                bundle.putParcelable("uploadviewmodel.key.new_fundraiser_model", p45.A0E);
                bundle.putParcelable("uploadviewmodel.key.fundraiser_to_attach", p45.A0G);
                bundle.putString("uploadviewmodel.key.existing_fundraiser_id", p45.A0L);
                bundle.putBoolean("uploadviewmodel.key.show_fundraiser_row", p45.A0i);
                bundle.putBoolean("uploadviewmodel.key.is_internal_only", p45.A0b);
                O80 o80 = p45.A0C;
                if (o80 != null) {
                    i = o80.A00;
                } else {
                    i = -1;
                }
                bundle.putInt("uploadviewmodel.key.draft_id", i);
                O80 o802 = p45.A0C;
                if (o802 != null) {
                    j = o802.A01;
                } else {
                    j = 0;
                }
                bundle.putLong("uploadviewmodel.key.draft_creation_ts", j);
                String str3 = p45.A0K;
                if (str3 != null && str3.length() != 0) {
                    bundle.putString("uploadviewmodel.key.draft_series_id", str3);
                }
                bundle.putBoolean("uploadviewmodel.key.draft_is_unified_video", p45.A0g);
                Integer num = this.A03;
                if (num == null) {
                    C14360o3.A0F("startingScreen");
                    throw C00O.createAndThrow();
                }
                int intValue = num.intValue();
                if (intValue != 0 && intValue != 1) {
                    if (intValue == 2) {
                        if (MSY.A0Q(interfaceC09390do).A0D != null) {
                            C54741OFs c54741OFs = MSY.A0Q(interfaceC09390do).A0D;
                            C14360o3.A0A(c54741OFs);
                            bundle.putString("post_live.extra.live_pending_media_id", c54741OFs.A0C);
                            bundle.putString("post_live.extra.live_broadcast_id", c54741OFs.A09);
                            bundle.putLong("post_live.extra.live_duration_ms", c54741OFs.A08);
                            bundle.putBoolean("post_live.extra.is_landscape", c54741OFs.A0H);
                            bundle.putBoolean("post_live.extra.live_has_shopping", c54741OFs.A03);
                            bundle.putParcelableArrayList("post_live.extra.live_branded_content_tag", c54741OFs.A02);
                            bundle.putInt("post_live.extra.cover_image_width", c54741OFs.A01);
                            bundle.putInt("post_live.extra.cover_image_height", c54741OFs.A00);
                            bundle.putBoolean("post_live.extra.is_custom_cover_photo", c54741OFs.A0G);
                            bundle.putString("post_live.extra.cover_photo_path", c54741OFs.A0B);
                            bundle.putInt("post_live.extra.cover_picker_progress", c54741OFs.A07);
                            bundle.putString("post_live.extra.caption", c54741OFs.A0A);
                            bundle.putBoolean("post_live.extra.caption", c54741OFs.A0F);
                            bundle.putBoolean("post_live.extra.share_preview_to_feed", c54741OFs.A0I);
                            bundle.putString("post_live.extra.title", c54741OFs.A0E);
                            bundle.putString("post_live.extra.caption", c54741OFs.A0D);
                            bundle.putBoolean("post_live.extra.internal", c54741OFs.A05);
                            bundle.putBoolean("post_live.extra.internal.switch.enabled", c54741OFs.A06);
                            bundle.putBoolean("post_live.extra.exclusive_post", c54741OFs.A04);
                            return;
                        }
                        throw AbstractC166997dE.A0g();
                    }
                    return;
                }
                if (!(MSW.A0b(interfaceC09390do).A01 instanceof NNE)) {
                    return;
                }
                NNE A0P = MSY.A0P(interfaceC09390do);
                bundle.putString("uploadflow.extra.igtv_pending_media_key", A0P.A02.A35);
                bundle.putParcelable("uploadflow.extra.gallery_medium", A0P.A00);
                return;
            }
            throw AbstractC43594JPz.A0o(obj2, "Unrecognized navigation state: ", AbstractC166987dD.A1C());
        }
        throw AbstractC43594JPz.A0o(interfaceC57827Pkt, "Unrecognized navigation state: ", AbstractC166987dD.A1C());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(android.os.Bundle r9, com.instagram.igtv.uploadflow.IGTVUploadActivity r10, X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.IGTVUploadActivity.A00(android.os.Bundle, com.instagram.igtv.uploadflow.IGTVUploadActivity, X.1Ds):java.lang.Object");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, X.InterfaceC12980lk
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final UserSession getSession() {
        UserSession userSession = this.A02;
        if (userSession != null) {
            return userSession;
        }
        C14360o3.A0F("session");
        throw C00O.createAndThrow();
    }

    @Override // X.C2d4
    public final C56352iT AYT() {
        C56352iT c56352iT = this.A04.A00;
        if (c56352iT != null) {
            return c56352iT;
        }
        C14360o3.A0F("actionBarService");
        throw C00O.createAndThrow();
    }

    @Override // X.C2d5
    public final C3O0 By1() {
        return (C3O0) this.A05.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 == r1) goto L12;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finish() {
        /*
            r4 = this;
            super.finish()
            X.0do r0 = r4.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.MSW.A0b(r0)
            X.22P r1 = r2.A00
            X.22P r0 = X.C22P.A38
            r3 = 0
            if (r1 != r0) goto L29
            boolean r0 = r2.A02
            if (r0 != 0) goto L29
            java.lang.Integer r2 = r4.A03
            if (r2 != 0) goto L22
            java.lang.String r0 = "startingScreen"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L22:
            java.lang.Integer r1 = X.C05F.A00
            r0 = 2130772097(0x7f010081, float:1.7147303E38)
            if (r2 != r1) goto L2c
        L29:
            r0 = 2130771975(0x7f010007, float:1.7147055E38)
        L2c:
            r4.overridePendingTransition(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.IGTVUploadActivity.finish():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02b1  */
    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igtv.uploadflow.IGTVUploadActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        int A00 = C0f9.A00(-1864446841);
        IGTVUploadViewModel A0b = MSW.A0b(this.A07);
        if (A0b.A0M.A0C != null) {
            IGTVDraftsRepository iGTVDraftsRepository = (IGTVDraftsRepository) A0b.A0C.getValue();
            iGTVDraftsRepository.A00.remove(A0b.A0B);
        }
        super.onDestroy();
        C0f9.A07(1718785802, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        int A00 = C0f9.A00(-1997407162);
        super.onPause();
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A03(this.A09, C3KD.class);
        c41451vu.A03(this.A08, C3KF.class);
        C0f9.A07(1170322176, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        int A00 = C0f9.A00(-2075984166);
        super.onResume();
        C54973OTf.A00(this.A04);
        C41451vu c41451vu = C41451vu.A01;
        c41451vu.A02(this.A09, C3KD.class);
        c41451vu.A02(this.A08, C3KF.class);
        C0f9.A07(677718841, A00);
    }

    @Override // com.instagram.base.activity.IgFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        int A00 = C0f9.A00(762515493);
        super.onStart();
        IGTVUploadViewModel A0b = MSW.A0b(this.A07);
        C23031Ai A002 = AbstractC23021Ah.A00(A0b.A06);
        long A03 = AbstractC31175DnJ.A03(A002.A01, AbstractC43591JPw.A00(393));
        long currentTimeMillis = System.currentTimeMillis() - IGTVUploadViewModel.A0N;
        if (1 <= A03 && A03 < currentTimeMillis) {
            AbstractC166987dD.A1Z(new C50121MBv(A002, A0b, null, 11, currentTimeMillis), AbstractC141776au.A00(A0b));
        }
        C0f9.A07(1861987413, A00);
    }
}
