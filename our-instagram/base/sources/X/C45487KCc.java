package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.TrackData;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.creation.capture.quickcapture.sundial.sfx.widget.CircularProgressImageView;
import com.instagram.direct.inbox.notes.NotesRepository;
import com.instagram.direct.inbox.notes.reply.QuickReplySheetContent;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KCc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45487KCc extends AbstractC59962oe implements InterfaceC60072op, InterfaceC1119153d {
    public static final String __redex_internal_original_name = "NoteQuickReplySheetFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public CardView A06;
    public CardView A07;
    public TrackData A08;
    public IgLinearLayout A09;
    public IgLinearLayout A0A;
    public IgTextView A0B;
    public IgTextView A0C;
    public IgTextView A0D;
    public IgTextView A0E;
    public IgTextView A0F;
    public IgTextView A0G;
    public IgTextView A0H;
    public IgTextView A0I;
    public InterfaceC56392iX A0J;
    public InterfaceC56392iX A0K;
    public InterfaceC56392iX A0L;
    public InterfaceC56392iX A0M;
    public CircularProgressImageView A0N;
    public C47956LGs A0O;
    public MRK A0P;
    public LLB A0Q;
    public QuickReplySheetContent A0R;
    public JYR A0S;
    public InterfaceC678133v A0T;
    public AbstractC210529Sr A0U;
    public ReelAvatarWithBadgeView A0V;
    public C3DN A0W;
    public GradientSpinnerAvatarView A0X;
    public SpinnerImageView A0Y;
    public Long A0Z;
    public boolean A0a;
    public boolean A0b;
    public int A0c;
    public NotesRepository A0d;
    public C38E A0e;
    public final InterfaceC09390do A0f;
    public final InterfaceC09390do A0g;
    public final InterfaceC09390do A0h;
    public final InterfaceC09390do A0i = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A0j;
    public final C37766Gjh A0k;
    public final C57112jm A0l;
    public final InterfaceC09390do A0m;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "note_quick_reply_sheet";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.A0c = i;
        if (i != 256) {
            if (i != 257) {
                if (i == 1361) {
                    LXC lxc = new LXC(this, 2);
                    ImmutableList immutableList = C55083Oaf.A01;
                    InterfaceC09390do interfaceC09390do = this.A0i;
                    new C55083Oaf(AbstractC166987dD.A0r(interfaceC09390do)).A01(requireActivity(), intent, lxc, AbstractC166987dD.A0r(interfaceC09390do), i2);
                    return;
                }
                return;
            }
        } else {
            if (i2 != -1) {
                if (i2 != 0) {
                    return;
                }
                A02(this);
                return;
            }
            AbstractC167007dF.A0J().postDelayed(new M17(requireContext()), 750L);
        }
        AbstractC31177DnL.A12(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        C14360o3.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((IgFragmentActivity) activity).registerOnActivityResultListener(this.A0k);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        C14360o3.A0B(configuration, 0);
        super.onConfigurationChanged(configuration);
        AbstractC46436Kgw abstractC46436Kgw = (AbstractC46436Kgw) Jn3.A01(this);
        if (abstractC46436Kgw instanceof C45842KQx) {
            IgTextView igTextView = this.A0F;
            if (igTextView == null) {
                C14360o3.A0F("noteReplyContextText");
                throw C00O.createAndThrow();
            }
            igTextView.setText(A01(requireContext(), this, (C45842KQx) abstractC46436Kgw));
        }
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A0a) {
            AbstractC31174DnI.A1C(view, AbstractC167007dF.A09(getThemedContext(), R.attr.igds_color_elevated_background));
            AbstractC13880nE.A0d(view, AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material));
        }
        C07S c07s = C07S.RESUMED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new MCM(view, viewLifecycleOwner, c07s, this, null, 31), C07Y.A00(viewLifecycleOwner));
        C48768Lhb c48768Lhb = new C48768Lhb(this);
        C48770Lhd c48770Lhd = new C48770Lhd(this);
        C57112jm c57112jm = this.A0l;
        AbstractC37301Gc2.A0v(view, c57112jm, this);
        C59072n8 A00 = C59062n7.A00(Long.valueOf(A00(this)), C0eB.A00, String.valueOf(A00(this)));
        A00.A00(new C45735KMn(c48770Lhd));
        A00.A00(new C48564Le1(c48768Lhb));
        AbstractC25227BEk.A10(view, A00, c57112jm);
    }

    public static final long A00(C45487KCc c45487KCc) {
        return AbstractC166987dD.A0N(c45487KCc.A0m.getValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, X.AbstractC31178DnM.A0M(r18.A0i), 36329071067545599L) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if (X.C4AC.A07(X.AbstractC166987dD.A0r(r18.A0i)) == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d6  */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableStringBuilder A01(android.content.Context r17, X.C45487KCc r18, X.C45842KQx r19) {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45487KCc.A01(android.content.Context, X.KCc, X.KQx):android.text.SpannableStringBuilder");
    }

    public static final void A02(C45487KCc c45487KCc) {
        String str;
        Bundle bundle;
        if (c45487KCc.A0c != 257) {
            Bundle bundle2 = c45487KCc.mArguments;
            if ((bundle2 != null && !bundle2.getBoolean("can_reply") && (bundle = c45487KCc.mArguments) != null && bundle.getBoolean("pending_admin_approval")) || !(Jn3.A01(c45487KCc) instanceof C45842KQx)) {
                return;
            }
            LLB llb = c45487KCc.A0Q;
            if (llb == null) {
                str = "notesReplyComposerBarController";
            } else {
                IgEditText igEditText = llb.A04;
                if (igEditText == null) {
                    return;
                }
                str = "replyMessage";
                igEditText.requestFocus();
                IgEditText igEditText2 = llb.A04;
                if (igEditText2 != null) {
                    AbstractC13880nE.A0T(igEditText2);
                    return;
                }
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public static final void A03(C45487KCc c45487KCc) {
        String str;
        SpinnerImageView spinnerImageView = c45487KCc.A0Y;
        if (spinnerImageView == null) {
            str = "loadingIndicator";
        } else {
            AbstractC31171DnF.A1M(spinnerImageView);
            IgLinearLayout igLinearLayout = c45487KCc.A09;
            if (igLinearLayout == null) {
                str = "replyContentView";
            } else {
                igLinearLayout.setVisibility(8);
                View view = c45487KCc.A00;
                if (view != null) {
                    view.setVisibility(8);
                }
                LLB llb = c45487KCc.A0Q;
                if (llb == null) {
                    str = "notesReplyComposerBarController";
                } else {
                    FrameLayout frameLayout = llb.A01;
                    if (frameLayout == null) {
                        str = "replyComposerContainer";
                    } else {
                        frameLayout.setVisibility(8);
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C45487KCc r7, X.C45842KQx r8) {
        /*
            androidx.cardview.widget.CardView r0 = r7.A06
            if (r0 != 0) goto Le
            java.lang.String r0 = "avatarVideoViewContainer"
        L6:
            X.C14360o3.A0F(r0)
        L9:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        Le:
            r1 = 8
            r0.setVisibility(r1)
            X.2iX r0 = r7.A0J
            if (r0 != 0) goto L1a
            java.lang.String r0 = "avatarSimpleVideoLayout"
            goto L6
        L1a:
            r0.setVisibility(r1)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = r7.A0V
            java.lang.String r6 = "avatarView"
            if (r0 == 0) goto L8e
            r5 = 0
            r0.setVisibility(r5)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r7.A0X
            if (r0 != 0) goto L2e
            java.lang.String r0 = "gradientSpinnerAvatarView"
            goto L6
        L2e:
            r0.setVisibility(r1)
            java.util.List r1 = r8.A0H
            if (r1 == 0) goto L84
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L84
            com.instagram.common.typedurl.ImageUrl r4 = r8.A04
            if (r4 == 0) goto L55
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r3 = r7.A0V
            if (r3 == 0) goto L8e
            com.instagram.common.typedurl.ImageUrl r2 = X.AbstractC31177DnL.A0T(r1, r5)
            android.content.res.Resources r1 = X.AbstractC166997dE.A0N(r7)
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.A03(r7, r4, r2, r0)
        L55:
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r0 = r8.A05
            if (r0 != 0) goto L7b
            X.0do r4 = r7.A0i
            X.0ll r2 = X.AbstractC25230BEn.A0k(r4, r5)
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36320270679548135(0x810918000020e7, double:3.0324236555128706E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 != 0) goto L7b
            X.0ll r2 = X.AbstractC25230BEn.A0k(r4, r5)
            r0 = 36324522697175261(0x810cf6000030dd, double:3.035112648581766E-306)
            boolean r0 = X.C18U.A06(r3, r2, r0)
            if (r0 == 0) goto L83
        L7b:
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r7.A0V
            if (r1 == 0) goto L8e
            r0 = 7
            X.LQ1.A00(r1, r0, r7, r8)
        L83:
            return
        L84:
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r1 = r7.A0V
            if (r1 == 0) goto L8e
            com.instagram.common.typedurl.ImageUrl r0 = r8.A04
            r1.setSingleAvatarUrlAndVisibility(r0, r7)
            goto L55
        L8e:
            X.C14360o3.A0F(r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45487KCc.A04(X.KCc, X.KQx):void");
    }

    public static final boolean A07(C45487KCc c45487KCc, C45842KQx c45842KQx, boolean z) {
        if (c45842KQx.A0E == null && !z && (c45842KQx.A07 != null || c45842KQx.A03 != null || (c45842KQx.A0B != null && c45842KQx.A02 == null && c45842KQx.A05 == null && c45842KQx.A01 == null))) {
            InterfaceC09390do interfaceC09390do = c45487KCc.A0i;
            AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
            C06090Tz A0j = AbstractC25225BEi.A0j(A0o, 0);
            if (C18U.A06(A0j, A0o, 36329290110877940L)) {
                C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                AbstractC12990ll A0k = AbstractC25230BEn.A0k(interfaceC09390do, 0);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long minutes = timeUnit.toMinutes(C18U.A01(A0j, A0k, 36610765087643853L));
                long hours = timeUnit.toHours(C18U.A01(A0j, AbstractC25230BEn.A0k(interfaceC09390do, 0), 36610765087709390L));
                if (System.currentTimeMillis() - AbstractC31175DnJ.A03(A0l.A01, "notes_try_it_last_seen_timestamp_ms") > TimeUnit.MINUTES.toMillis(minutes) && C23031Ai.A08(A0l, "notes_last_created_timestamp_ms", hours)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        MRK mrk = this.A0P;
        if (mrk != null) {
            mrk.D01();
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0i);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    public C45487KCc() {
        MHM mhm = new MHM(this, 30);
        MHM mhm2 = new MHM(this, 27);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        InterfaceC09390do A00 = MHM.A00(mhm2, enumC09460dv, 28);
        this.A0j = AbstractC25225BEi.A0a(new MHM(A00, 29), mhm, new C50170MDx(43, null, A00), AbstractC25225BEi.A1D(Jn3.class));
        this.A0m = AbstractC09440dt.A00(enumC09460dv, new DH5(this, "arg_note_id", "arg_note_id", 23));
        this.A0h = AbstractC09440dt.A00(enumC09460dv, new D63(this));
        this.A0g = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk(AbstractC166997dE.A0a(), this, "arg_is_friend_map_note", 9));
        this.A0f = AbstractC09440dt.A00(enumC09460dv, new C57262Pbk(null, this, "arg_note_consumption_module", 10));
        this.A0c = -1;
        this.A0l = C57112jm.A00();
        this.A0k = new C37766Gjh(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(X.C45487KCc r8, boolean r9) {
        /*
            android.content.Context r6 = r8.getContext()
            if (r6 == 0) goto L9d
            if (r9 == 0) goto L8e
            android.view.View r2 = r8.A00
            if (r2 == 0) goto L2f
            r0 = 2131427771(0x7f0b01bb, float:1.8477168E38)
            android.widget.TextView r1 = X.AbstractC166987dD.A0e(r2, r0)
            if (r1 == 0) goto L1b
            r0 = 2131968728(0x7f1342d8, float:1.9574359E38)
            r1.setText(r0)
        L1b:
            r0 = 2131427770(0x7f0b01ba, float:1.8477166E38)
            android.widget.ImageView r1 = X.AbstractC31171DnF.A08(r2, r0)
            if (r1 == 0) goto L2a
            r0 = 2131238120(0x7f081ce8, float:1.809251E38)
            r1.setImageResource(r0)
        L2a:
            X.LPk r0 = X.ViewOnClickListenerC48059LPk.A00
            X.C0fQ.A00(r0, r2)
        L2f:
            r7 = 2131968727(0x7f1342d7, float:1.9574357E38)
            r0 = 2131240044(0x7f08246c, float:1.8096412E38)
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r0)
            if (r5 == 0) goto L92
            X.6bJ r4 = X.EnumC142006bJ.A06
        L3d:
            android.view.View r0 = r8.mView
            if (r0 == 0) goto L8c
            int r3 = r0.getHeight()
            android.content.Context r2 = r8.requireContext()
            boolean r1 = X.C14640oc.A04()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r1 == 0) goto L55
            r0 = 2131165200(0x7f070010, float:1.794461E38)
        L55:
            int r1 = X.AbstractC167017dG.A0E(r2)
            int r0 = X.AbstractC166997dE.A04(r2, r0)
            int r1 = r1 + r0
            r0 = 2130968783(0x7f0400cf, float:1.754623E38)
            int r0 = X.AbstractC53242c7.A0G(r2, r0)
            int r1 = r1 + r0
            int r3 = r3 + r1
        L67:
            X.6i8 r1 = X.AbstractC31171DnF.A0K()
            X.AbstractC25226BEj.A1N(r6, r1, r7)
            r1.A0B = r4
            r0 = 0
            r1.A0K = r0
            r1.A04 = r5
            r1.A02 = r3
            r0 = 1
            r1.A0R = r0
            X.DqE r2 = r1.A00()
            com.instagram.common.ui.base.IgLinearLayout r1 = r8.A0A
            if (r1 != 0) goto L95
            java.lang.String r0 = "rootView"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L8c:
            r3 = 0
            goto L67
        L8e:
            r7 = 2131968726(0x7f1342d6, float:1.9574355E38)
            r5 = 0
        L92:
            X.6bJ r4 = X.EnumC142006bJ.A05
            goto L3d
        L95:
            X.M18 r0 = new X.M18
            r0.<init>(r2)
            r1.post(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45487KCc.A05(X.KCc, boolean):void");
    }

    public static final void A06(C45487KCc c45487KCc, boolean z) {
        C45842KQx c45842KQx;
        C45068Jwx c45068Jwx;
        Object A01 = Jn3.A01(c45487KCc);
        if ((A01 instanceof C45842KQx) && (c45842KQx = (C45842KQx) A01) != null && (((c45068Jwx = c45842KQx.A07) != null && AbstractC31177DnL.A1b(c45068Jwx.A06)) || c45842KQx.A0E != null)) {
            View view = c45487KCc.A00;
            if (view != null) {
                view.setVisibility(0);
                TextView A0e = AbstractC166987dD.A0e(view, R.id.add_to_spotify_button_text);
                if (A0e != null) {
                    int i = 2131968725;
                    if (z) {
                        i = 2131968797;
                    }
                    A0e.setText(i);
                }
                ImageView A08 = AbstractC31171DnF.A08(view, R.id.add_to_spotify_button_icon);
                if (A08 != null) {
                    int i2 = R.drawable.instagram_app_spotify_icon_filled_24;
                    if (z) {
                        i2 = R.drawable.instagram_arrow_up_right_pano_outline_24;
                    }
                    A08.setImageResource(i2);
                }
                C0fQ.A00(new LOy(1, c45487KCc, z), view);
                return;
            }
            return;
        }
        AbstractC167007dF.A0x(c45487KCc.A00);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-44275574);
        super.onCreate(bundle);
        InterfaceC09390do interfaceC09390do = this.A0i;
        this.A0d = C4A5.A00(AbstractC166987dD.A0r(interfaceC09390do));
        C38E c38e = new C38E(this, AbstractC166987dD.A0r(interfaceC09390do), new C38C(this));
        this.A0e = c38e;
        c38e.A0C = AbstractC166997dE.A0n();
        AbstractC43594JPz.A0V(interfaceC09390do).A0H(EnumC46290KeM.DWELL);
        C0f9.A09(-1497201120, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1153173404);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.notes_quick_reply_sheet, viewGroup, false);
        this.A0A = (IgLinearLayout) inflate.findViewById(R.id.note_quick_reply_sheet_root_view);
        this.A09 = (IgLinearLayout) inflate.findViewById(R.id.note_quick_reply_sheet_content_view);
        this.A0Y = (SpinnerImageView) inflate.findViewById(R.id.loading_indicator);
        this.A0V = (ReelAvatarWithBadgeView) inflate.findViewById(R.id.note_quick_reply_avatar);
        this.A0X = (GradientSpinnerAvatarView) inflate.findViewById(R.id.note_quick_reply_gradient_spinner_avatar);
        this.A06 = (CardView) inflate.findViewById(R.id.note_quick_reply_video_preview_container);
        this.A0K = AbstractC31173DnH.A0U(inflate, R.id.notes_video_view_stub);
        this.A0L = AbstractC31173DnH.A0U(inflate, R.id.note_quick_reply_gif_pog);
        this.A0M = AbstractC31173DnH.A0U(inflate, R.id.note_quick_reply_gif_square);
        this.A0J = AbstractC31173DnH.A0U(inflate, R.id.notes_video_player_layout_stub);
        Context A0L = AbstractC166997dE.A0L(inflate);
        Bundle bundle2 = this.mArguments;
        FragmentActivity activity = getActivity();
        C14360o3.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        BaseFragmentActivity baseFragmentActivity = (BaseFragmentActivity) activity;
        UserSession A0r = AbstractC166987dD.A0r(this.A0i);
        long A00 = A00(this);
        boolean A1Z = AbstractC167007dF.A1Z(this.A0g);
        MRK mrk = this.A0P;
        IgLinearLayout igLinearLayout = this.A0A;
        if (igLinearLayout == null) {
            C14360o3.A0F("rootView");
            throw C00O.createAndThrow();
        }
        LLB llb = new LLB(A0L, bundle2, baseFragmentActivity, this, A0r, igLinearLayout, mrk, (Jn3) this.A0j.getValue(), this.A0T, AbstractC25225BEi.A15(this.A0f), A00, A1Z, false);
        this.A0Q = llb;
        llb.A05();
        C0f9.A09(1474391675, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C47956LGs c47956LGs;
        int A02 = C0f9.A02(-1998370886);
        super.onDestroy();
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A0i), 36330638731199440L) && (c47956LGs = this.A0O) != null) {
            InterfaceC678133v interfaceC678133v = c47956LGs.A00;
            if (interfaceC678133v != null) {
                interfaceC678133v.release();
            }
            c47956LGs.A00 = null;
        }
        this.A0O = null;
        LLB llb = this.A0Q;
        if (llb != null) {
            llb.A08 = null;
        }
        C0f9.A09(-1726133819, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-113869602);
        this.A0l.A04(this.mView);
        JYR jyr = this.A0S;
        if (jyr != null) {
            jyr.A02(AnonymousClass001.A0R("note_quick_reply_sheet", " onDestroyView"));
        }
        if (C18U.A06(C06090Tz.A05, AbstractC31178DnM.A0M(this.A0i), 36326378123114328L)) {
            InterfaceC678133v interfaceC678133v = this.A0T;
            if (interfaceC678133v != null) {
                interfaceC678133v.release();
            }
            this.A0T = null;
        }
        super.onDestroyView();
        C0f9.A09(948390753, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        int A02 = C0f9.A02(-2096976908);
        super.onDetach();
        FragmentActivity activity = getActivity();
        C14360o3.A0C(activity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
        ((IgFragmentActivity) activity).unregisterOnActivityResultListener(this.A0k);
        C0f9.A09(-490120400, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1284715001);
        super.onPause();
        InterfaceC678133v interfaceC678133v = this.A0T;
        if (interfaceC678133v != null) {
            interfaceC678133v.pause();
        }
        JYR jyr = this.A0S;
        if (jyr != null) {
            JYR.A00(jyr, "note_quick_reply_sheet", " onPause");
        }
        C0f9.A09(913928366, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2131775435);
        super.onResume();
        A02(this);
        JYR jyr = this.A0S;
        if (jyr != null) {
            String A0R = AnonymousClass001.A0R("note_quick_reply_sheet", " onResume");
            C14360o3.A0B(A0R, 0);
            C5TA c5ta = jyr.A00;
            if (c5ta != null) {
                c5ta.A0B(A0R, false);
            }
        }
        C0f9.A09(1781154316, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(-401877345);
        super.onStop();
        C0f9.A09(-1286240237, A02);
    }
}
