package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.AllUserStoryTarget;
import com.instagram.pendingmedia.model.CloseFriendsUserStoryTarget;
import com.instagram.pendingmedia.model.GroupProfileUserStoryTarget;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import com.instagram.pendingmedia.model.ShareTargetHelper;
import com.instagram.pendingmedia.model.SimpleUserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.144, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass144 extends AbstractC211911v {
    @Override // X.AbstractC211911v
    public final String A06() {
        return "PendingMediaInitializer";
    }

    @Override // X.AbstractC211911v
    public final void A07() {
        C26161Ox c26161Ox;
        C1OZ c1oz;
        String str;
        synchronized (C40121td.A0G) {
            if (!C40121td.A0E) {
                Object value = C40121td.A0K.getValue();
                C14360o3.A07(value);
                for (int i : (int[]) value) {
                    switch (i) {
                        case 0:
                            c26161Ox = ShareTargetHelper.A00;
                            c1oz = C40151tj.A02;
                            str = "UploadCutoutStickerTarget";
                            break;
                        case 1:
                            c26161Ox = ShareTargetHelper.A00;
                            c1oz = C40201to.A02;
                            str = "StoryTemplateAssetShareTarget";
                            break;
                        case 2:
                            c26161Ox = ShareTargetHelper.A00;
                            c1oz = C40221tq.A03;
                            str = "PotatoMediaShareTarget";
                            break;
                        case 3:
                            c26161Ox = ShareTargetHelper.A00;
                            c26161Ox.A03(new C1OZ() { // from class: X.1ts
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    P6L parseFromJson = OXx.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0B(anonymousClass182, 0);
                                    C14360o3.A0B(obj, 1);
                                    OXx.A00(anonymousClass182, (P6L) obj, true);
                                }
                            }, "IGTVVideoShareTarget");
                            c1oz = new C1OZ() { // from class: X.1tt
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    NNM parseFromJson = AbstractC54035Nul.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0B(anonymousClass182, 0);
                                    C14360o3.A0B(obj, 1);
                                    anonymousClass182.A0d();
                                    OXx.A00(anonymousClass182, (P6L) obj, false);
                                    anonymousClass182.A0a();
                                }
                            };
                            str = "PostLiveIGTVShareTarget";
                            break;
                        case 4:
                            c26161Ox = ShareTargetHelper.A00;
                            c1oz = C40261tu.A03;
                            str = "MediaKitShareTarget";
                            break;
                        case 5:
                            c26161Ox = ShareTargetHelper.A00;
                            c1oz = new C1OZ() { // from class: X.1tx
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    C122005fs parseFromJson = MTO.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0B(anonymousClass182, 0);
                                    C14360o3.A0B(obj, 1);
                                    C122005fs c122005fs = (C122005fs) obj;
                                    anonymousClass182.A0d();
                                    String str2 = c122005fs.A04;
                                    if (str2 != null) {
                                        anonymousClass182.A0S("user_story_target", str2);
                                    }
                                    if (c122005fs.A02 != null) {
                                        anonymousClass182.A0r("user_story_target_holder");
                                        C41137IJc c41137IJc = c122005fs.A02;
                                        anonymousClass182.A0d();
                                        if (c41137IJc.A04 != null) {
                                            anonymousClass182.A0r("simple_user_story_target");
                                            SimpleUserStoryTarget simpleUserStoryTarget = c41137IJc.A04;
                                            anonymousClass182.A0d();
                                            String str3 = simpleUserStoryTarget.A00;
                                            if (str3 != null) {
                                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
                                            }
                                            anonymousClass182.A0a();
                                        }
                                        String str4 = c41137IJc.A05;
                                        if (str4 != null) {
                                            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str4);
                                        }
                                        if (c41137IJc.A00 != null) {
                                            anonymousClass182.A0r("all_user_story_target");
                                            AllUserStoryTarget allUserStoryTarget = c41137IJc.A00;
                                            anonymousClass182.A0d();
                                            String str5 = allUserStoryTarget.A00;
                                            if (str5 != null) {
                                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5);
                                            }
                                            if (allUserStoryTarget.A01 != null) {
                                                C16V.A03(anonymousClass182, "blacklisted_user_ids");
                                                for (String str6 : allUserStoryTarget.A01) {
                                                    if (str6 != null) {
                                                        anonymousClass182.A0u(str6);
                                                    }
                                                }
                                                anonymousClass182.A0Z();
                                            }
                                            anonymousClass182.A0a();
                                        }
                                        if (c41137IJc.A01 != null) {
                                            anonymousClass182.A0r("close_friends_user_story_target");
                                            CloseFriendsUserStoryTarget closeFriendsUserStoryTarget = c41137IJc.A01;
                                            anonymousClass182.A0d();
                                            String str7 = closeFriendsUserStoryTarget.A00;
                                            if (str7 != null) {
                                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str7);
                                            }
                                            if (ImmutableList.copyOf((Collection) closeFriendsUserStoryTarget.A01) != null) {
                                                C16V.A03(anonymousClass182, "blacklisted_user_ids");
                                                Iterator<E> it = ImmutableList.copyOf((Collection) closeFriendsUserStoryTarget.A01).iterator();
                                                while (it.hasNext()) {
                                                    String str8 = (String) it.next();
                                                    if (str8 != null) {
                                                        anonymousClass182.A0u(str8);
                                                    }
                                                }
                                                anonymousClass182.A0Z();
                                            }
                                            anonymousClass182.A0a();
                                        }
                                        if (c41137IJc.A03 != null) {
                                            anonymousClass182.A0r("group_user_story_target");
                                            GroupUserStoryTarget groupUserStoryTarget = c41137IJc.A03;
                                            anonymousClass182.A0d();
                                            String str9 = groupUserStoryTarget.A02;
                                            if (str9 != null) {
                                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str9);
                                            }
                                            if (Collections.unmodifiableList(groupUserStoryTarget.A03) != null) {
                                                C16V.A03(anonymousClass182, "group_members");
                                                for (PendingRecipient pendingRecipient : Collections.unmodifiableList(groupUserStoryTarget.A03)) {
                                                    if (pendingRecipient != null) {
                                                        C7NT.A00(anonymousClass182, pendingRecipient);
                                                    }
                                                }
                                                anonymousClass182.A0Z();
                                            }
                                            String str10 = groupUserStoryTarget.A01;
                                            if (str10 != null) {
                                                anonymousClass182.A0S("display_name", str10);
                                            }
                                            if (groupUserStoryTarget.A00 != null) {
                                                anonymousClass182.A0r("thread_key");
                                                AbstractC83623o5.A00(anonymousClass182, groupUserStoryTarget.A00);
                                            }
                                            anonymousClass182.A0a();
                                        }
                                        if (c41137IJc.A02 != null) {
                                            anonymousClass182.A0r("community_user_story_target");
                                            GroupProfileUserStoryTarget groupProfileUserStoryTarget = c41137IJc.A02;
                                            anonymousClass182.A0d();
                                            String str11 = groupProfileUserStoryTarget.A01;
                                            if (str11 != null) {
                                                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str11);
                                            }
                                            if (groupProfileUserStoryTarget.A00 != null) {
                                                anonymousClass182.A0r("group_profile_recipient");
                                                C7NT.A00(anonymousClass182, groupProfileUserStoryTarget.A00);
                                            }
                                            anonymousClass182.A0a();
                                        }
                                        anonymousClass182.A0a();
                                    }
                                    anonymousClass182.A0T("is_configured_in_server", c122005fs.A05);
                                    anonymousClass182.A0Q("sub_share_id", c122005fs.A00);
                                    EnumC76383bi enumC76383bi = c122005fs.A01;
                                    if (enumC76383bi != null) {
                                        anonymousClass182.A0S("media_audience", enumC76383bi.A00);
                                    }
                                    ShareType shareType = c122005fs.A03;
                                    if (shareType != null) {
                                        anonymousClass182.A0S("share_type", shareType.toString());
                                    }
                                    anonymousClass182.A0a();
                                }
                            };
                            str = "MultiConfigStoryTarget";
                            break;
                        case 6:
                            c26161Ox = ShareTargetHelper.A00;
                            c26161Ox.A03(C40301ty.A02, "UploadFinishShareTarget");
                            c26161Ox.A03(C40321u0.A04, "FollowersShareTarget");
                            c1oz = C40341u2.A03;
                            str = "VideoPogInNoteShareTarget";
                            break;
                        case 7:
                            c26161Ox = ShareTargetHelper.A00;
                            c1oz = C40351u3.A03;
                            str = "QuickSnapMediaShareTarget";
                            break;
                        case 8:
                            c26161Ox = ShareTargetHelper.A00;
                            c1oz = C40371u5.A03;
                            str = "WallMediaShareTarget";
                            break;
                        case 9:
                            ShareTargetHelper.A00.A03(new C1OZ() { // from class: X.1u7
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    C115615Kx parseFromJson = AbstractC115605Kw.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0B(anonymousClass182, 0);
                                    C14360o3.A0B(obj, 1);
                                    C115615Kx c115615Kx = (C115615Kx) obj;
                                    anonymousClass182.A0d();
                                    anonymousClass182.A0Q("sub_share_id", c115615Kx.A00);
                                    anonymousClass182.A0T("is_configured_in_server", c115615Kx.A03);
                                    anonymousClass182.A0T("clips_share_preview_to_feed", c115615Kx.A05);
                                    if (c115615Kx.A01 != null) {
                                        anonymousClass182.A0r("cover_photo_square_crop");
                                        AbstractC88283wd.A01(anonymousClass182, c115615Kx.A01);
                                    }
                                    String str2 = c115615Kx.A02;
                                    if (str2 != null) {
                                        anonymousClass182.A0S("group_destination_id", str2);
                                    }
                                    anonymousClass182.A0a();
                                }
                            }, "ClipsVideoShareTarget");
                            c26161Ox = AbstractC40411u9.A00;
                            c26161Ox.A03(new C1OZ() { // from class: X.1uA
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    C197448oF parseFromJson = A0E.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.visualreply.model.VisualReplyDisplayMode.REMIX");
                                    C197448oF c197448oF = (C197448oF) obj;
                                    anonymousClass182.A0d();
                                    anonymousClass182.A0P("max_width_scale", c197448oF.A01);
                                    anonymousClass182.A0P("max_height_scale", c197448oF.A00);
                                    anonymousClass182.A0T("cap_width", c197448oF.A02);
                                    anonymousClass182.A0a();
                                }
                            }, "REMIX");
                            c26161Ox.A03(new C1OZ() { // from class: X.1uB
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    C172147lj parseFromJson = A0F.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.visualreply.model.VisualReplyDisplayMode.SIDE_BY_SIDE");
                                    anonymousClass182.A0d();
                                    EnumC171727l2 enumC171727l2 = ((C172147lj) obj).A00;
                                    if (enumC171727l2 != null) {
                                        anonymousClass182.A0S("orientation", enumC171727l2.A00);
                                    }
                                    anonymousClass182.A0a();
                                }
                            }, "SIDE_BY_SIDE");
                            c26161Ox.A03(new C1OZ() { // from class: X.1uC
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    C171737l3 parseFromJson = A0D.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.visualreply.model.VisualReplyDisplayMode.PICTURE_IN_PICTURE");
                                    anonymousClass182.A0d();
                                    anonymousClass182.A0P("scale", ((C171737l3) obj).A00);
                                    anonymousClass182.A0a();
                                }
                            }, "PICTURE_IN_PICTURE");
                            c1oz = new C1OZ() { // from class: X.1uD
                                @Override // X.C1OZ
                                public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
                                    C14360o3.A0B(c16l, 0);
                                    C171757l5 parseFromJson = C9JU.parseFromJson(c16l);
                                    C14360o3.A07(parseFromJson);
                                    return parseFromJson;
                                }

                                @Override // X.C1OZ
                                public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
                                    C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.visualreply.model.VisualReplyDisplayMode.HIDDEN");
                                    anonymousClass182.A0d();
                                    EnumC171747l4 enumC171747l4 = ((C171757l5) obj).A00;
                                    if (enumC171747l4 != null) {
                                        anonymousClass182.A0S("reason", enumC171747l4.A00);
                                    }
                                    anonymousClass182.A0a();
                                }
                            };
                            str = "HIDDEN";
                            break;
                        default:
                            throw new IllegalArgumentException(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
                    }
                    c26161Ox.A03(c1oz, str);
                }
                C1XC.A00.add(new C1XB() { // from class: X.1uE
                    @Override // X.C1XB
                    public final boolean CPL(Context context, UserSession userSession) {
                        C14360o3.A0B(userSession, 1);
                        boolean z = false;
                        if (C40121td.A0G.A01(context, userSession).A03.A09.get() > 0) {
                            z = true;
                        }
                        return !z;
                    }

                    @Override // X.C1XB
                    public final void CuO(Context context, C19280xC c19280xC, UserSession userSession) {
                        boolean z = false;
                        if (C40121td.A0G.A01(context, userSession).A03.A09.get() > 0) {
                            z = true;
                        }
                        c19280xC.A09("upload_in_progress", Boolean.valueOf(z));
                    }

                    @Override // X.C1XB
                    public final String AY4(Context context, UserSession userSession, boolean z) {
                        String string = context.getString(z ? 2131976953 : 2131976954);
                        C14360o3.A07(string);
                        return string;
                    }

                    @Override // X.C1XB
                    public final String AY5(Context context, UserSession userSession, boolean z) {
                        String string = context.getString(2131964696);
                        C14360o3.A07(string);
                        return string;
                    }
                });
                C40121td.A0E = true;
            }
        }
    }
}
