package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class EMb extends AbstractC59962oe implements InterfaceC189488aT, InterfaceC58139Pq4 {
    public static final String __redex_internal_original_name = "CommentComposerModalFragment";
    public C38321qM A00;
    public InterfaceC60442pS A01;
    public C675432t A02;
    public LYZ A03;
    public C84923qg A04;
    public C1M1 A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC09390do A0D = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ABC() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ boolean ANe() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final int Aqi() {
        return -2;
    }

    @Override // X.InterfaceC189488aT
    public final int C9V() {
        return 0;
    }

    @Override // X.InterfaceC189488aT
    /* renamed from: CO7 */
    public final float Cpk() {
        return 1.0f;
    }

    @Override // X.InterfaceC189488aT
    public final boolean CQm() {
        return false;
    }

    @Override // X.InterfaceC189488aT
    public final float Cnp() {
        return 1.0f;
    }

    @Override // X.InterfaceC189498aU
    public final void DON(int i) {
        int i2;
        C3DN A0r;
        this.A0B = true;
        FragmentActivity activity = getActivity();
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            i2 = A0r.A08();
        } else {
            i2 = 0;
        }
        int i3 = i2 - i;
        LYZ lyz = this.A03;
        if (lyz == null) {
            C14360o3.A0F("commentComposerController");
            throw C00O.createAndThrow();
        }
        lyz.A00 = i3;
        LYZ.A01(lyz);
    }

    @Override // X.InterfaceC189488aT
    public final boolean Ei2() {
        return true;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final boolean isScrolledToTop() {
        return false;
    }

    @Override // X.InterfaceC189488aT, X.C51D
    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        A00(this);
    }

    public static final void A00(EMb eMb) {
        C38321qM c38321qM = eMb.A00;
        if (c38321qM != null) {
            LYZ lyz = eMb.A03;
            if (lyz == null) {
                C14360o3.A0F("commentComposerController");
                throw C00O.createAndThrow();
            }
            if (lyz.A03 != c38321qM) {
                lyz.A03 = c38321qM;
                LYZ.A04(lyz);
            }
            LYZ.A02(lyz);
            Context requireContext = eMb.requireContext();
            User A2E = c38321qM.A2E(AbstractC166987dD.A0r(eMb.A0D));
            if (A2E != null) {
                eMb.A06 = AbstractC31178DnM.A0c(requireContext, A2E, 2131956503);
                eMb.A07 = eMb.requireContext().getString(2131961900);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC189498aU
    public final void DOM() {
        if (this.A0B) {
            AbstractC31179DnN.A0x(this);
        }
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZu() {
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0D = this.A06;
        AbstractC31178DnM.A1N(c41451vu, A0j);
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZv(C84923qg c84923qg, Map map) {
        String str = c84923qg.A0C;
        List list = c84923qg.A0M;
        C38321qM c38321qM = this.A00;
        if (list != null && !list.isEmpty() && c38321qM != null) {
            InterfaceC09390do interfaceC09390do = this.A0D;
            c38321qM.AEH(AbstractC166987dD.A0o(interfaceC09390do));
            C25671My A0Q = AbstractC31176DnK.A0Q(interfaceC09390do);
            String str2 = this.A08;
            if (str2 == null) {
                AbstractC31171DnF.A0x();
                throw C00O.createAndThrow();
            }
            A0Q.E4s(new C3MB(c84923qg, c38321qM, str2));
            return;
        }
        C41451vu c41451vu = C41451vu.A01;
        C146106i8 A0j = AbstractC25229BEm.A0j();
        A0j.A0H = "post_comment_failed";
        if (str == null || str.length() == 0) {
            str = this.A07;
        }
        A0j.A0D = str;
        AbstractC31178DnM.A1N(c41451vu, A0j);
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZw(C84923qg c84923qg, boolean z) {
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            c38321qM.AEH(AbstractC166987dD.A0o(this.A0D));
        }
        AbstractC31179DnN.A0x(this);
    }

    @Override // X.InterfaceC58139Pq4
    public final void DZx(C84923qg c84923qg, String str) {
        C38321qM c38321qM = this.A00;
        if (c38321qM != null) {
            InterfaceC09390do interfaceC09390do = this.A0D;
            AbstractC31176DnK.A0Q(interfaceC09390do).E4s(new C56018Otp(c84923qg, c38321qM, this.A09));
            if (this.A0C) {
                boolean equals = AbstractC31176DnK.A0g(C17060sy.A01, interfaceC09390do).equals(c38321qM.A2E(AbstractC166987dD.A0r(interfaceC09390do)));
                C2OG A01 = C2OG.A01();
                C34648FOf A00 = C35129FeW.A00(AbstractC31173DnH.A0t(interfaceC09390do));
                A00.A0G = "post_comment_succeeded_notification_type";
                String str2 = this.A0A;
                if (str2 == null) {
                    C14360o3.A0F("notificationTitle");
                    throw C00O.createAndThrow();
                }
                A00.A0H = str2;
                A00.A0E = c84923qg.A0e;
                A00.A03 = PushChannelType.A09;
                A00.A08 = new G8U(this, c84923qg, c38321qM, equals);
                C35129FeW.A01(A00, A01);
            }
            c38321qM.AEH(AbstractC166987dD.A0o(interfaceC09390do));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AnonymousClass001.A0R("modal_comment_composer_", requireArguments().getString(AbstractC111324zv.A00(609)));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r6.length() == 0) goto L20;
     */
    @Override // X.InterfaceC189488aT, X.C51D
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBottomSheetClosed() {
        /*
            r8 = this;
            X.LYZ r0 = r8.A03
            java.lang.String r7 = "commentComposerController"
            if (r0 == 0) goto Lc
            X.L8I r0 = r0.A02
            if (r0 != 0) goto L14
            java.lang.String r7 = "viewHolder"
        Lc:
            X.C14360o3.A0F(r7)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L14:
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A0D
            X.AbstractC13880nE.A0O(r0)
            X.1qM r2 = r8.A00
            X.3qg r0 = r8.A04
            if (r0 != 0) goto L8a
            if (r2 == 0) goto L8a
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L8a
            X.LYZ r0 = r8.A03
            if (r0 == 0) goto Lc
            java.lang.CharSequence r6 = r0.A07()
            X.0do r0 = r8.A0D
            com.instagram.common.session.UserSession r0 = X.AbstractC166987dD.A0r(r0)
            X.7es r5 = X.AbstractC167967er.A00(r0)
            if (r6 == 0) goto L42
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L43
        L42:
            r0 = 1
        L43:
            java.lang.String r4 = ""
            if (r0 != 0) goto L5a
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L4e
            r4 = r0
        L4e:
            r3 = 0
            X.LYZ r0 = r8.A03
            if (r0 == 0) goto Lc
            X.7f2 r0 = r0.A01
            if (r0 != 0) goto L7a
            java.lang.String r7 = "mentionThumbnailSelectionDelegate"
            goto Lc
        L5a:
            java.lang.String r0 = r2.getId()
            if (r0 != 0) goto L61
            r0 = r4
        L61:
            java.util.Map r1 = r5.A00
            java.lang.Object r0 = r1.get(r0)
            X.9CG r0 = (X.C9CG) r0
            if (r0 == 0) goto L8a
            java.lang.String r0 = r0.A02
            if (r0 != 0) goto L8a
            java.lang.String r0 = r2.getId()
            if (r0 == 0) goto L76
            r4 = r0
        L76:
            r1.remove(r4)
            return
        L7a:
            X.7et r2 = r0.A00
            r0 = 3
            X.C14360o3.A0B(r6, r0)
            X.9CG r1 = new X.9CG
            r1.<init>(r2, r6, r3, r3)
            java.util.Map r0 = r5.A00
            r0.put(r4, r1)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EMb.onBottomSheetClosed():void");
    }

    @Override // X.InterfaceC189488aT
    public final int Ahd(Context context) {
        return AbstractC31178DnM.A00(context);
    }

    @Override // X.InterfaceC189488aT
    public final View C5a() {
        return this.mView;
    }

    @Override // X.InterfaceC189488aT
    public final /* synthetic */ float Cpk() {
        return 1.0f;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IllegalStateException A14;
        int i;
        int A02 = C0f9.A02(-1410668521);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = new C36479G7d(getModuleName(), requireArguments.getBoolean(AbstractC111324zv.A00(607)), requireArguments.getBoolean(AbstractC111324zv.A00(606)));
        String str = "";
        CharSequence charSequence = requireArguments.getCharSequence(AbstractC111324zv.A00(1552), "");
        if (charSequence != null) {
            this.A08 = AbstractC31173DnH.A0k(requireArguments, AbstractC111324zv.A00(605));
            this.A09 = requireArguments.getString("intent_extra_newsfeed_story_pk", null);
            boolean z = requireArguments.getBoolean("intent_extra_show_inapp_notification_on_post", false);
            this.A0C = z;
            if (z) {
                this.A0A = getString(2131969849);
            }
            this.A05 = C1M0.A01.A01(requireArguments.getString(AbstractC111324zv.A00(608), null));
            InterfaceC60442pS interfaceC60442pS = this.A01;
            if (interfaceC60442pS != null) {
                InterfaceC09390do interfaceC09390do = this.A0D;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C1M1 c1m1 = this.A05;
                String str2 = "sessionIdProvider";
                if (c1m1 != null) {
                    this.A02 = new C675432t(A0r, interfaceC60442pS, c1m1);
                    String string = requireArguments.getString("intent_extra_replied_to_comment_id");
                    String string2 = requireArguments.getString("intent_extra_replied_to_comment_text");
                    if (string != null) {
                        C32955Eem A00 = InterfaceC38901rP.A00.A00();
                        A00.A0r = string;
                        if (string2 != null) {
                            str = string2;
                        }
                        A00.A0t = str;
                        this.A04 = new C84923qg(A00.A00());
                        String string3 = requireArguments.getString("intent_extra_replied_to_comment_user_id");
                        Parcelable.Creator creator = User.CREATOR;
                        User user = new User(string3, requireArguments.getString("intent_extra_replied_to_comment_username"));
                        user.A0r(requireArguments.getString("intent_extra_replied_to_comment_user_image"));
                        C84923qg c84923qg = this.A04;
                        if (c84923qg != null) {
                            c84923qg.A08 = user;
                        }
                    }
                    Context requireContext = requireContext();
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    String str3 = this.A08;
                    if (str3 == null) {
                        str2 = "entryPoint";
                    } else {
                        InterfaceC60442pS interfaceC60442pS2 = this.A01;
                        if (interfaceC60442pS2 != null) {
                            C675432t c675432t = this.A02;
                            if (c675432t == null) {
                                str2 = "commentsLogger";
                            } else {
                                C1M1 c1m12 = this.A05;
                                if (c1m12 != null) {
                                    this.A03 = new LYZ(requireContext, this, c675432t, this, A0r2, this.A04, interfaceC60442pS2, c1m12, charSequence, str3, requireArguments.getInt(AbstractC111324zv.A00(1556), -1), requireArguments.getInt(AbstractC111324zv.A00(1555), 0), requireArguments.getInt(AbstractC111324zv.A00(1557), -1), requireArguments.getBoolean("intent_extra_show_keyboard_delayed_on_open", false), requireArguments.getBoolean(AbstractC111324zv.A00(1554), false));
                                    requireArguments.getBoolean("intent_extra_replied_to_comment_eligible_for_vcr", false);
                                    InterfaceC60602pj interfaceC60602pj = this.A03;
                                    if (interfaceC60602pj == null) {
                                        str2 = "commentComposerController";
                                    } else {
                                        registerLifecycleListener(interfaceC60602pj);
                                        String string4 = requireArguments.getString("CommentThreadFragment.MEDIA_ID");
                                        C38321qM A0h = AbstractC25229BEm.A0h(AbstractC166987dD.A0r(interfaceC09390do), string4);
                                        this.A00 = A0h;
                                        if (A0h == null) {
                                            if (string4 != null) {
                                                C1ON A04 = AbstractC2044893h.A04(AbstractC166987dD.A0r(interfaceC09390do), string4);
                                                C32548EUy.A01(A04, this, 43);
                                                schedule(A04);
                                            } else {
                                                A14 = AbstractC166987dD.A14("Required value was null.");
                                                i = -386654207;
                                            }
                                        }
                                        C0f9.A09(1608546724, A02);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                C14360o3.A0F(str2);
                throw C00O.createAndThrow();
            }
            C14360o3.A0F("insightsHost");
            throw C00O.createAndThrow();
        }
        A14 = AbstractC166987dD.A14("Required value was null.");
        i = -1855886626;
        C0f9.A09(i, A02);
        throw A14;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(87930790);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.comment_textview_layout, viewGroup, false);
        C0f9.A09(-1603884079, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1877390550);
        super.onPause();
        this.A0B = false;
        C0f9.A09(-170297376, A02);
    }
}
