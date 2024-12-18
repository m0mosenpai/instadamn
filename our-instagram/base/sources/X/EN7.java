package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent;
import com.instagram.reels.store.ReelStore;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.user.model.User;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class EN7 extends AbstractC59962oe implements InterfaceC1119153d {
    public static final String __redex_internal_original_name = "GroupMentionQuickReplySheetFragment";
    public IgEditText A00;
    public IgTextView A01;
    public Reel A02;
    public GroupMentionQuickReplySheetContent A03;
    public User A04;
    public C18A A05;
    public String A06;
    public C41761wQ A07;
    public IgTextView A08;
    public IgTextView A09;
    public C7TG A0A;
    public C2DS A0B;
    public ReelAvatarWithBadgeView A0C;
    public final C3I9 A0F = C3I7.A01(this, false, false);
    public final InterfaceC60152ox A0E = new G0M(this, 8);
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC1119153d
    public final void Czx() {
    }

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ig_group_mention_user_list";
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        GroupMentionQuickReplySheetContent groupMentionQuickReplySheetContent;
        User user;
        int A02 = C0f9.A02(572940427);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (groupMentionQuickReplySheetContent = (GroupMentionQuickReplySheetContent) bundle2.getParcelable("content")) != null) {
            this.A03 = groupMentionQuickReplySheetContent;
            Bundle bundle3 = this.mArguments;
            String str = null;
            if (bundle3 != null) {
                str = bundle3.getString("group_mention_base_reel_id");
            }
            if (str != null) {
                if (bundle3 != null && (user = (User) bundle3.getParcelable("group_mention_base_reel_owner")) != null) {
                    this.A04 = user;
                    String string = bundle3.getString("group_mention_base_reel_item_id");
                    if (string != null) {
                        this.A06 = string;
                        InterfaceC09390do interfaceC09390do = this.A0D;
                        Reel A0M = ReelStore.A03(AbstractC166987dD.A0r(interfaceC09390do)).A0M(str);
                        if (A0M != null) {
                            this.A02 = A0M;
                            this.A0A = AbstractC165967bO.A00(AbstractC166987dD.A0r(interfaceC09390do));
                            this.A0B = AbstractC28761aE.A00(AbstractC166987dD.A0r(interfaceC09390do));
                            this.A05 = AbstractC31176DnK.A0h(interfaceC09390do);
                            this.A0F.A9e(this.A0E);
                            this.A07 = AbstractC31173DnH.A0S();
                            C0f9.A09(1662450657, A02);
                            return;
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-653388159);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.group_mention_quick_reply_sheet, viewGroup, false);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) inflate.findViewById(R.id.group_mention_avatar);
        this.A0C = reelAvatarWithBadgeView;
        String str = "avatarView";
        if (reelAvatarWithBadgeView != null) {
            reelAvatarWithBadgeView.setVisibility(0);
            ReelAvatarWithBadgeView reelAvatarWithBadgeView2 = this.A0C;
            if (reelAvatarWithBadgeView2 != null) {
                GroupMentionQuickReplySheetContent groupMentionQuickReplySheetContent = this.A03;
                String str2 = "content";
                if (groupMentionQuickReplySheetContent != null) {
                    reelAvatarWithBadgeView2.setSingleAvatarUrlAndVisibility(groupMentionQuickReplySheetContent.A00, this);
                    IgTextView A0Y = AbstractC31172DnG.A0Y(inflate, R.id.username);
                    this.A09 = A0Y;
                    str = AbstractC31198Dnh.A01();
                    if (A0Y != null) {
                        Context context = inflate.getContext();
                        GroupMentionQuickReplySheetContent groupMentionQuickReplySheetContent2 = this.A03;
                        if (groupMentionQuickReplySheetContent2 != null) {
                            AbstractC31177DnL.A0r(context, A0Y, groupMentionQuickReplySheetContent2.A02, 2131963345);
                            IgTextView igTextView = this.A09;
                            if (igTextView != null) {
                                Drawable[] compoundDrawables = igTextView.getCompoundDrawables();
                                C14360o3.A07(compoundDrawables);
                                Iterator it = AbstractC009903n.A0I(compoundDrawables).iterator();
                                while (it.hasNext()) {
                                    AbstractC25228BEl.A1H(PorterDuff.Mode.SRC_IN, (Drawable) it.next(), context.getColor(AbstractC53242c7.A08(context)));
                                }
                                IgTextView igTextView2 = this.A09;
                                if (igTextView2 != null) {
                                    ViewOnClickListenerC31723DwS.A01(igTextView2, 69, this);
                                    IgTextView A0Y2 = AbstractC31172DnG.A0Y(inflate, R.id.quick_reply_subtext);
                                    this.A08 = A0Y2;
                                    if (A0Y2 == null) {
                                        str2 = "subtext";
                                    } else {
                                        A0Y2.setVisibility(0);
                                        this.A00 = (IgEditText) inflate.findViewById(R.id.message);
                                        this.A01 = AbstractC31172DnG.A0Y(inflate, R.id.send_button);
                                        IgEditText igEditText = this.A00;
                                        if (igEditText == null) {
                                            str2 = "replyMessage";
                                        } else {
                                            C35469Fl4.A00(igEditText, this, 28);
                                            IgTextView igTextView3 = this.A01;
                                            if (igTextView3 == null) {
                                                str2 = "sendButton";
                                            } else {
                                                ViewOnClickListenerC31723DwS.A01(igTextView3, 70, this);
                                                C0f9.A09(644048688, A02);
                                                return inflate;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(-217274128);
        super.onDestroy();
        this.A0F.EFx(this.A0E);
        C41761wQ c41761wQ = this.A07;
        if (c41761wQ == null) {
            C14360o3.A0F("uiSubscriber");
            throw C00O.createAndThrow();
        }
        c41761wQ.A01();
        C0f9.A09(-332297477, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(612668311);
        super.onResume();
        IgEditText igEditText = this.A00;
        if (igEditText != null) {
            igEditText.requestFocus();
            IgEditText igEditText2 = this.A00;
            if (igEditText2 != null) {
                AbstractC13880nE.A0S(igEditText2);
                C0f9.A09(429693298, A02);
                return;
            }
        }
        C14360o3.A0F("replyMessage");
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(1151958051);
        super.onStart();
        IgEditText igEditText = this.A00;
        if (igEditText == null) {
            C14360o3.A0F("replyMessage");
            throw C00O.createAndThrow();
        }
        igEditText.requestFocus();
        if (igEditText.hasWindowFocus()) {
            if (igEditText.isFocused()) {
                AbstractC13880nE.A0R(igEditText);
            }
        } else {
            igEditText.getViewTreeObserver().addOnWindowFocusChangeListener(new LR5(igEditText, 3));
        }
        this.A0F.Dnr(getActivity());
        C0f9.A09(-2074985236, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(1832041028);
        super.onStop();
        this.A0F.onStop();
        C0f9.A09(-60414553, A02);
    }
}
