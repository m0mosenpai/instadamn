package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.feed.ui.text.LinkTextView;
import com.instagram.modal.ModalActivity;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.72z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1569572z {
    public static final C1569572z A00 = new Object();

    public static final void A00(Context context, View view, TextView textView, UserSession userSession, EnumC155686yx enumC155686yx, LinkTextView linkTextView, final C72q c72q, User user, int i, int i2, boolean z, boolean z2, boolean z3) {
        C37494GfC c37494GfC;
        C69613Av c69613Av;
        List list;
        int i3;
        C14360o3.A0B(linkTextView, 0);
        C14360o3.A0B(textView, 1);
        C14360o3.A0B(view, 2);
        C14360o3.A0B(enumC155686yx, 8);
        String A0N = user.A0N();
        if (A0N != null && A0N.length() != 0) {
            InterfaceC81773kp Ag4 = user.A03.Ag4();
            if (Ag4 != null) {
                list = Ag4.B2G();
            } else {
                list = null;
            }
            Boolean BBE = user.A03.BBE();
            if (BBE != null && BBE.booleanValue() && !z) {
                if (enumC155686yx == EnumC155686yx.A04) {
                    A0N = user.A03.CAc();
                    if (A0N != null) {
                        list = null;
                        i3 = 2131973204;
                        if (z3) {
                            i3 = 2131973205;
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    i3 = 2131973211;
                    if (z3) {
                        i3 = 2131973212;
                    }
                }
                textView.setText(i3);
                textView.setVisibility(0);
                C0fQ.A00(new View.OnClickListener() { // from class: X.6rh
                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
                    
                        if (r1 == null) goto L18;
                     */
                    @Override // android.view.View.OnClickListener
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onClick(android.view.View r9) {
                        /*
                            r8 = this;
                            r0 = -533424506(0xffffffffe0349686, float:-5.205094E19)
                            int r4 = X.C0f9.A05(r0)
                            X.72q r0 = X.C72q.this
                            if (r0 == 0) goto L24
                            X.GBV r5 = r0.A02()
                            if (r5 == 0) goto L24
                            com.instagram.profile.fragment.UserDetailTabController r7 = r5.A06
                            X.6yv r6 = r7.A0O
                            X.6yx r1 = r6.A09
                            X.6yx r0 = X.EnumC155686yx.A02
                            if (r1 == r0) goto L24
                            X.6yx r2 = X.EnumC155686yx.A04
                            if (r1 != r2) goto L2b
                            X.6yx r2 = X.EnumC155686yx.A03
                        L21:
                            r7.A0K(r2)
                        L24:
                            r0 = 856615840(0x330eeba0, float:3.327625E-8)
                            X.C0f9.A0C(r0, r4)
                            return
                        L2b:
                            com.instagram.user.model.User r0 = r6.A0J
                            if (r0 == 0) goto L38
                            X.17P r0 = r0.A03
                            java.lang.String r1 = r0.CAc()
                            r0 = 1
                            if (r1 != 0) goto L39
                        L38:
                            r0 = 0
                        L39:
                            com.instagram.common.session.UserSession r3 = r5.A02
                            if (r0 == 0) goto L41
                            X.F7X.A00(r3)
                            goto L21
                        L41:
                            X.F7X.A00(r3)
                            com.instagram.user.model.User r0 = r6.A0J
                            if (r0 == 0) goto L24
                            com.instagram.profile.fragment.UserDetailFragment r2 = r5.A04
                            java.lang.String r1 = r0.getId()
                            java.lang.Integer r0 = X.C05F.A0C
                            X.1ON r1 = X.AbstractC47861LCh.A00(r3, r0, r1)
                            X.Bv6 r0 = new X.Bv6
                            r0.<init>(r5)
                            r1.A00 = r0
                            r2.schedule(r1)
                            goto L24
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC151396rh.onClick(android.view.View):void");
                    }
                }, textView);
            } else {
                textView.setVisibility(8);
            }
            if (enumC155686yx == EnumC155686yx.A02) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
            linkTextView.setVisibility(0);
            A00.A05(context, userSession, linkTextView, c72q, user, A0N, list, i, i2, z, z2);
            return;
        }
        linkTextView.setVisibility(8);
        textView.setVisibility(8);
        view.setVisibility(8);
        if (c72q == null || (c37494GfC = c72q.A0A) == null || (c69613Av = c37494GfC.A03) == null) {
            return;
        }
        c69613Av.A05();
    }

    public static final void A01(final Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57012jc c57012jc, final C72q c72q, final User user, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String category;
        int length;
        Object c31756Dx9;
        C14360o3.A0B(c57012jc, 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        AnonymousClass730 anonymousClass730 = new AnonymousClass730(userSession);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36327700974287660L);
        final int i = R.attr.igds_color_link;
        if (A06) {
            i = R.attr.igds_color_secondary_text;
        }
        if (AbstractC76693cH.A03(user)) {
            String id = user.getId();
            String CAl = user.A03.CAl();
            if (CAl != null) {
                Rie rie = Rie.PROFILE;
                AbstractC76693cH.A02(context, rie, userSession, id, CAl);
                String CAk = user.A03.CAk();
                if (CAk != null) {
                    spannableStringBuilder.append((CharSequence) CAk);
                    spannableStringBuilder.setSpan(new C27279C2e(c72q, user, context.getColor(AbstractC53242c7.A0H(context, i))), 0, spannableStringBuilder.length(), 17);
                    anonymousClass730.A00(rie, user.getId(), user.A03.CAl(), null, false);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            String AY1 = user.A03.AY1();
            if (AY1 != null && AY1.length() != 0) {
                String AY12 = user.A03.AY1();
                if (AY12 != null) {
                    spannableStringBuilder.append((CharSequence) AY12);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if ((C2E7.A00(user) || C2E7.A01(user)) && user.A1c() && (category = user.A03.getCategory()) != null && category.length() != 0) {
                String category2 = user.A03.getCategory();
                if (category2 != null) {
                    spannableStringBuilder.append((CharSequence) category2);
                    Boolean bool = true;
                    boolean equals = bool.equals(user.A03.BvV());
                    boolean equals2 = bool.equals(user.A03.CRF());
                    if (spannableStringBuilder.length() > 0 && equals && equals2 && C18U.A06(c06090Tz, userSession, 36321645069084328L)) {
                        spannableStringBuilder.setSpan(new ClickableSpan() { // from class: X.6wy
                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public final void updateDrawState(TextPaint textPaint) {
                                C14360o3.A0B(textPaint, 0);
                                Context context2 = context;
                                textPaint.setColor(context2.getColor(AbstractC53242c7.A0H(context2, i)));
                                textPaint.setUnderlineText(false);
                            }

                            @Override // android.text.style.ClickableSpan
                            public final void onClick(View view) {
                                GBV A02;
                                C72q c72q2 = c72q;
                                if (c72q2 != null && (A02 = c72q2.A02()) != null) {
                                    User user2 = user;
                                    C3DO c3do = C3DN.A00;
                                    FragmentActivity fragmentActivity = A02.A00;
                                    C3DN A002 = c3do.A00(fragmentActivity);
                                    if (A002 != null) {
                                        C3DP c3dp = (C3DP) A002;
                                        if (c3dp.A0h && c3dp.A0o) {
                                            Bundle bundle = new Bundle();
                                            bundle.putString("category_name", user2.A03.getCategory());
                                            bundle.putString("category_id", String.valueOf(user2.A03.AmZ()));
                                            bundle.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, user2.getId());
                                            C6XJ c6xj = new C6XJ(fragmentActivity, bundle, A02.A02, ModalActivity.class, "clickable_category");
                                            c6xj.A08();
                                            c6xj.A0C(fragmentActivity);
                                            return;
                                        }
                                    }
                                    C70C c70c = A02.A05;
                                    AbstractC31364DqT.A03();
                                    String category3 = user2.A03.getCategory();
                                    String valueOf = String.valueOf(user2.A03.AmZ());
                                    String id2 = user2.getId();
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("category_name", category3);
                                    bundle2.putString("category_id", valueOf);
                                    bundle2.putString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, id2);
                                    EIO eio = new EIO();
                                    eio.setArguments(bundle2);
                                    c70c.A03(eio, "clickable_category", true);
                                    c70c.A00();
                                }
                            }
                        }, 0, spannableStringBuilder.length(), 17);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (str != null) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " • ");
                }
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.setSpan(new C31751Dx4(context, c72q, user), length2, spannableStringBuilder.length(), 17);
            }
            if (!z3) {
                if (z4 && AbstractC100604fP.A01(userSession)) {
                    String pkId = user.A03.getPkId();
                    if (pkId != null && c72q != null) {
                        View A01 = c57012jc.A01();
                        C14360o3.A07(A01);
                        C154716xM c154716xM = c72q.A0B;
                        String str2 = c72q.A03.userId;
                        C14360o3.A0B(str2, 1);
                        FJZ fjz = new FJZ(str2, pkId);
                        C57112jm c57112jm = c154716xM.A01;
                        String A0u = AnonymousClass001.A0u("own_user_id_", fjz.A00, "_target_user_id_", fjz.A01);
                        C59062n7 c59062n7 = C59062n7.A07;
                        C59072n8 c59072n8 = new C59072n8(fjz, 0, A0u);
                        c59072n8.A00(new C36311G0g(c154716xM.A00, c154716xM.A02));
                        c57112jm.A05(A01, c59072n8.A01());
                    }
                    if (spannableStringBuilder.length() > 0) {
                        spannableStringBuilder.append((CharSequence) " • ");
                    }
                    length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) context.getString(2131957015));
                    if (C18U.A06(c06090Tz, userSession, 36318896290077447L) && (z || C18U.A06(c06090Tz, userSession, 36318896290142984L))) {
                        if (c72q != null && C18U.A06(c06090Tz, userSession, 36318896290208521L)) {
                            c72q.A02().A0E(user, true);
                        }
                        c31756Dx9 = new C31757DxA(context, interfaceC11380iw, userSession, c72q, user);
                    }
                }
            } else {
                C1571673v.A06(interfaceC11380iw, userSession, AbstractC50626MWn.A00(userSession, user.B7L(), user.A0M(), user.getId()), "business_social_proof_badge_impression", userSession.userId, "user_profile_header");
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append((CharSequence) " • ");
                }
                length = spannableStringBuilder.length();
                String string = context.getString(2131954402);
                C14360o3.A07(string);
                spannableStringBuilder.append((CharSequence) string);
                c31756Dx9 = new C31756Dx9(context, interfaceC11380iw, userSession, user);
            }
            spannableStringBuilder.setSpan(c31756Dx9, length, spannableStringBuilder.length(), 17);
        }
        if (spannableStringBuilder.length() > 0) {
            if (z2) {
                spannableStringBuilder.insert(0, (CharSequence) " • ");
            }
            c57012jc.A03(0);
            ((TextView) c57012jc.A01()).setText(spannableStringBuilder);
            ((TextView) c57012jc.A01()).setMovementMethod(LinkMovementMethod.getInstance());
            if (c72q != null && str != null) {
                GBV A02 = c72q.A02();
                View A012 = c57012jc.A01();
                C14360o3.A07(A012);
                UserDetailFragment userDetailFragment = A02.A04;
                userDetailFragment.A1L.A00(A012, QPTooltipAnchor.A0x, userDetailFragment.A1I);
                return;
            }
            return;
        }
        c57012jc.A03(8);
    }

    public static final void A02(Context context, C57012jc c57012jc, C72q c72q, User user) {
        C14360o3.A0B(c57012jc, 0);
        if (user.isRestricted() && C28151Xt.A02 != null) {
            c57012jc.A03(0);
            View A01 = c57012jc.A01();
            C14360o3.A07(A01);
            TextView textView = (TextView) A01;
            String string = context.getString(2131976188);
            C14360o3.A07(string);
            String string2 = context.getString(2131972560, user.getUsername(), string);
            C14360o3.A07(string2);
            RunnableC36906GOb runnableC36906GOb = new RunnableC36906GOb(c72q, user);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
            C32964Eev c32964Eev = new C32964Eev(AbstractC53242c7.A0F(context, R.attr.textColorBoldLink), runnableC36906GOb);
            int A08 = AbstractC001900j.A08(string2, string, 0, false);
            int length = string.length() + A08;
            if (A08 >= 0 && A08 < length && length <= string2.length()) {
                spannableStringBuilder.setSpan(c32964Eev, A08, length, 33);
            }
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        c57012jc.A03(8);
    }

    public static final void A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57012jc c57012jc, C38321qM c38321qM, C72q c72q, User user, String str, boolean z) {
        String title;
        C14360o3.A0B(c57012jc, 0);
        View A01 = c57012jc.A01();
        C14360o3.A07(A01);
        View requireViewById = A01.requireViewById(R.id.text_1);
        C14360o3.A07(requireViewById);
        IgTextView igTextView = (IgTextView) requireViewById;
        View requireViewById2 = A01.requireViewById(R.id.icon_1);
        C14360o3.A07(requireViewById2);
        IgImageView igImageView = (IgImageView) requireViewById2;
        View requireViewById3 = A01.requireViewById(R.id.text_2);
        C14360o3.A07(requireViewById3);
        IgTextView igTextView2 = (IgTextView) requireViewById3;
        View requireViewById4 = A01.requireViewById(R.id.icon_2);
        C14360o3.A07(requireViewById4);
        IgImageView igImageView2 = (IgImageView) requireViewById4;
        View requireViewById5 = A01.requireViewById(R.id.separator);
        C14360o3.A07(requireViewById5);
        igTextView.setVisibility(8);
        igImageView.setVisibility(8);
        igTextView2.setVisibility(8);
        igImageView2.setVisibility(8);
        requireViewById5.setVisibility(8);
        InterfaceC81183jn BdE = user.A03.BdE();
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36316778871132813L) && !C18U.A06(c06090Tz, userSession, 36316778871329424L) && BdE != null && (!BdE.BdF().isEmpty())) {
            List BdF = BdE.BdF();
            Context context = A01.getContext();
            if (BdF.size() > 1) {
                title = context.getString(2131970106, Integer.valueOf(BdF.size()));
                C14360o3.A07(title);
                igTextView.setTextColor(context.getColor(AbstractC53242c7.A07(context)));
                igImageView.setColorFilter(context.getColor(AbstractC53242c7.A07(context)));
                AbstractC14710oj.A07(context, Typeface.defaultFromStyle(1), igTextView, C05F.A01);
            } else {
                title = ((C44Q) BdF.get(0)).getTitle();
                igTextView.setTextColor(context.getColor(AbstractC53242c7.A06(context)));
                igImageView.setColorFilter(context.getColor(AbstractC53242c7.A06(context)));
                AbstractC14710oj.A07(context, Typeface.defaultFromStyle(0), igTextView, C05F.A00);
            }
            igTextView.setText(title);
            igTextView.setVisibility(0);
            igImageView.setVisibility(0);
            igImageView.setImageResource(R.drawable.instagram_channels_pano_outline_24);
            C0fQ.A00(new ViewOnClickListenerC35602Fnt(interfaceC11380iw, c38321qM, c72q, BdF), igTextView);
            boolean A04 = A04(interfaceC11380iw, userSession, igTextView2, igImageView2, c38321qM, c72q, user, z, !BdF.isEmpty());
            View requireViewById6 = A01.requireViewById(R.id.button_2);
            C14360o3.A07(requireViewById6);
            A01.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material), 0, 0);
            if (A04) {
                requireViewById6.setVisibility(0);
                requireViewById5.setVisibility(0);
            } else {
                requireViewById6.setVisibility(8);
                requireViewById5.setVisibility(8);
            }
        } else {
            A04(interfaceC11380iw, userSession, igTextView, igImageView, c38321qM, c72q, user, z, false);
        }
        if (c72q != null && "profile_bio_user_deep_link_add_fb_link".equals(str)) {
            GBV A02 = c72q.A02();
            UserSession userSession2 = A02.A02;
            InterfaceC19630xq interfaceC19630xq = AbstractC23021Ah.A00(userSession2).A01;
            if (interfaceC19630xq.getBoolean("should_add_fb_biolink_from_deeplink", false)) {
                AbstractC34213F7l.A00().A01(A02.A04, userSession2, new C36784GJh(A01, A02)).A06("fb_profile_link_biolink_delegate", null);
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E77("should_add_fb_biolink_from_deeplink", false);
                ARD.apply();
            }
        }
    }

    public final void A05(Context context, UserSession userSession, LinkTextView linkTextView, final C72q c72q, final User user, String str, List list, int i, int i2, final boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        C37494GfC c37494GfC;
        C69613Av c69613Av;
        C14360o3.A0B(linkTextView, 0);
        C14360o3.A0B(userSession, 2);
        if (z2) {
            spannableStringBuilder = new SpannableStringBuilder(str);
            AbstractC154246wZ.A01(context, spannableStringBuilder, userSession, new InterfaceC154236wY() { // from class: X.6wX
                /* JADX WARN: Removed duplicated region for block: B:18:0x0091  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
                @Override // X.InterfaceC154236wY
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void DE0(X.InterfaceC81933lD r21) {
                    /*
                        Method dump skipped, instructions count: 388
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C154226wX.DE0(X.3lD):void");
                }
            }, list);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            Resources resources = context.getResources();
            TextPaint textPaint = new TextPaint(1);
            textPaint.density = resources.getDisplayMetrics().density;
            textPaint.linkColor = AbstractC53242c7.A0F(context, R.attr.igds_color_link);
            textPaint.setTextSize(linkTextView.getTextSize());
            textPaint.setColor(context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text)));
            String A0T = AnonymousClass001.A0T(resources.getString(2131961704), resources.getString(2131954795), ' ');
            CharSequence A01 = AbstractC85253rG.A01(new C57482kN(Layout.Alignment.ALIGN_NORMAL, textPaint, null, 0.0f, linkTextView.getLineSpacingMultiplier(), i, false), "", str, A0T, i2, false);
            C14360o3.A07(A01);
            spannableStringBuilder.append(A01);
            AbstractC154246wZ.A01(context, spannableStringBuilder, userSession, new InterfaceC154236wY() { // from class: X.6wX
                @Override // X.InterfaceC154236wY
                public final void DE0(InterfaceC81933lD interfaceC81933lD) {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException
                        */
                    /*
                        Method dump skipped, instructions count: 388
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C154226wX.DE0(X.3lD):void");
                }
            }, list);
            if (!A01.equals(str)) {
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) A0T);
                C0fQ.A00(new View.OnClickListener() { // from class: X.6rc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GBV A02;
                        int A05 = C0f9.A05(-965052473);
                        C72q c72q2 = C72q.this;
                        if (c72q2 != null && (A02 = c72q2.A02()) != null) {
                            A02.A06();
                        }
                        C0f9.A0C(-965354924, A05);
                    }
                }, linkTextView);
                final int color = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_secondary_text));
                spannableStringBuilder.setSpan(new AbstractC85543rj(color) { // from class: X.6rd
                    @Override // android.text.style.ClickableSpan
                    public final void onClick(View view) {
                        GBV A02;
                        C72q c72q2 = C72q.this;
                        if (c72q2 != null && (A02 = c72q2.A02()) != null) {
                            A02.A06();
                        }
                    }
                }, length, spannableStringBuilder.length(), 33);
            }
        }
        linkTextView.setText(spannableStringBuilder);
        if (c72q != null && (c37494GfC = c72q.A0A) != null && (c69613Av = c37494GfC.A03) != null) {
            c69613Av.A01.A0K("is_bio_visible", true);
            c69613Av.A05();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0372, code lost:
    
        if (r15.size() != 1) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x037e, code lost:
    
        if (r15.size() != 1) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x038a, code lost:
    
        if (r15.size() != 1) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (X.AbstractC31536DtL.A02(r22, r27) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0124, code lost:
    
        if (r18 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x030d, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r22, 36322761760909800L) == false) goto L126;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.widget.ImageView, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A04(final X.InterfaceC11380iw r21, final com.instagram.common.session.UserSession r22, final com.instagram.common.ui.base.IgTextView r23, com.instagram.common.ui.widget.imageview.IgImageView r24, final X.C38321qM r25, final X.C72q r26, final com.instagram.user.model.User r27, boolean r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1035
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1569572z.A04(X.0iw, com.instagram.common.session.UserSession, com.instagram.common.ui.base.IgTextView, com.instagram.common.ui.widget.imageview.IgImageView, X.1qM, X.72q, com.instagram.user.model.User, boolean, boolean):boolean");
    }
}
