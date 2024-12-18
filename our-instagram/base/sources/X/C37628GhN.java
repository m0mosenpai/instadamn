package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.actionbar.ActionBarTitleViewSwitcher;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.clips.model.ClipsSpotlightData;
import com.instagram.clips.model.ClipsSpotlightModel;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GhN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37628GhN {
    public Drawable A00;
    public Drawable A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public RelativeLayout A05;
    public InterfaceC56362iU A06;
    public ActionBarTitleViewSwitcher A07;
    public C37903Gm0 A08;
    public AbstractC39700HjW A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final FragmentActivity A0D;
    public final ClipsViewerConfig A0E;
    public final ClipsViewerSource A0F;
    public final UserSession A0G;
    public final ILF A0H;
    public final C59952od A0I;
    public final C37540Gfw A0J;
    public final JI8 A0K;
    public final C37556GgC A0L;
    public final C37624GhJ A0M;
    public final List A0N;
    public final InterfaceC09390do A0O;

    public C37628GhN(ClipsViewerConfig clipsViewerConfig, UserSession userSession, AbstractC39700HjW abstractC39700HjW, ILF ilf, C59952od c59952od, C37540Gfw c37540Gfw, JI8 ji8, C37556GgC c37556GgC, C37624GhJ c37624GhJ, List list) {
        AbstractC25233BEq.A0w(1, userSession, c37624GhJ, clipsViewerConfig);
        AbstractC167017dG.A1U(ilf, list);
        C14360o3.A0B(abstractC39700HjW, 10);
        this.A0G = userSession;
        this.A0I = c59952od;
        this.A0M = c37624GhJ;
        this.A0E = clipsViewerConfig;
        this.A0L = c37556GgC;
        this.A0H = ilf;
        this.A0N = list;
        this.A0K = ji8;
        this.A0J = c37540Gfw;
        this.A09 = abstractC39700HjW;
        this.A0D = c59952od.requireActivity();
        this.A0C = c59952od.requireContext();
        this.A0F = clipsViewerConfig.A0J;
        this.A0O = AbstractC09440dt.A01(C37733Gj8.A00);
    }

    public final void A0C(C120985dq c120985dq) {
        String id;
        RelativeLayout relativeLayout = this.A05;
        if (relativeLayout != null) {
            IgImageView A0K = AbstractC37302Gc3.A0K(relativeLayout, R.id.sender_profile_pic);
            TextView A0Q = AbstractC25230BEn.A0Q(relativeLayout, R.id.sender_username_or_fullname);
            TextView A0Q2 = AbstractC25230BEn.A0Q(relativeLayout, R.id.sender_timestamp);
            View A0c = AbstractC166987dD.A0c(relativeLayout, R.id.suggested_title);
            C38321qM c38321qM = c120985dq.A02;
            ClipsSpotlightModel clipsSpotlightModel = null;
            if (c38321qM != null && (id = c38321qM.getId()) != null) {
                ClipsSpotlightData clipsSpotlightData = this.A0E.A0M;
                if (clipsSpotlightData != null) {
                    clipsSpotlightModel = (ClipsSpotlightModel) clipsSpotlightData.A00.get(id);
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            if (clipsSpotlightModel != null) {
                User user = clipsSpotlightModel.A01;
                ViewOnClickListenerC37847Gl1.A00(A0K, 3, new HJA(11, user, this));
                A0K.setUrl(user.Bhu(), this.A0J.A19);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(user.B8y());
                if (user.isVerified()) {
                    C85963sQ.A08(this.A0C, A0H, false);
                }
                ViewOnClickListenerC37847Gl1.A00(A0Q, 3, new HJA(11, user, this));
                A0Q.setText(A0H);
                Context context = this.A0C;
                AbstractC31177DnL.A0r(context, A0Q2, C23831Eq.A09(AbstractC166997dE.A0M(context), clipsSpotlightModel.A00), 2131972481);
                A0K.setVisibility(0);
                A0Q.setVisibility(0);
                A0Q2.setVisibility(0);
                A0c.setVisibility(8);
                return;
            }
            A0Q.setVisibility(8);
            A0Q2.setVisibility(8);
            A0c.setVisibility(8);
            A0K.setVisibility(8);
        }
    }

    private final int A00() {
        boolean A0C = AbstractC76643c9.A0C(this.A0M.A02(), this.A0G);
        boolean A0b = this.A0J.A1K.A0b();
        if (!A0C) {
            return R.drawable.instagram_volume_none_outline_44;
        }
        if (!A0b) {
            return R.drawable.instagram_volume_off_outline_44;
        }
        return R.drawable.instagram_volume_outline_44;
    }

    public static final String A02(C37628GhN c37628GhN) {
        String A0p = AbstractC166997dE.A0p(c37628GhN.A0C, ((EnumC37736GjB) AbstractC166987dD.A16(c37628GhN.A0N)).A00);
        ClipsViewerConfig clipsViewerConfig = c37628GhN.A0E;
        String str = clipsViewerConfig.A0t;
        if (str != null && str.length() != 0) {
            if (clipsViewerConfig.A0J != ClipsViewerSource.A0C) {
                C37540Gfw c37540Gfw = c37628GhN.A0J;
                if (!AbstractC167007dF.A1Z(c37540Gfw.A1m) || !AbstractC167007dF.A1Z(c37540Gfw.A1o) || !AbstractC167007dF.A1Z(c37540Gfw.A1q)) {
                }
            }
            return str;
        }
        return A0p;
    }

    public static final void A03(C37628GhN c37628GhN) {
        InterfaceC56362iU interfaceC56362iU;
        View view;
        EnumC129395t1 enumC129395t1;
        View view2;
        ImageView imageView;
        UserSession userSession = c37628GhN.A0G;
        boolean A06 = C18U.A06(C06090Tz.A06, userSession, 36321537696671300L);
        ClipsViewerConfig clipsViewerConfig = c37628GhN.A0E;
        if ((clipsViewerConfig.A00() || A06) && (interfaceC56362iU = c37628GhN.A06) != null) {
            ((C56352iT) interfaceC56362iU).A0D = true;
        }
        Integer A00 = c37628GhN.A09.A00();
        ClipsViewerSource clipsViewerSource = c37628GhN.A0F;
        ClipsViewerSource clipsViewerSource2 = ClipsViewerSource.A0g;
        boolean z = true;
        if (!AbstractC167007dF.A1X(clipsViewerSource, clipsViewerSource2) ? !c37628GhN.A06() || A00 != C05F.A00 : A00 == C05F.A01) {
            z = false;
        }
        View view3 = null;
        if (z) {
            ViewOnClickListenerC37847Gl1 viewOnClickListenerC37847Gl1 = new ViewOnClickListenerC37847Gl1(c37628GhN, 6);
            Drawable drawable = c37628GhN.A00;
            C3LO A01 = c37628GhN.A01(viewOnClickListenerC37847Gl1, 2131956721, R.id.clips_viewer_content_notes_button, true);
            if (drawable != null) {
                A01.A0F = drawable;
            }
            InterfaceC56362iU interfaceC56362iU2 = c37628GhN.A06;
            if (interfaceC56362iU2 != null) {
                view3 = interfaceC56362iU2.AA9(new C3LY(A01));
            }
            c37628GhN.A03 = view3;
            if ((view3 instanceof ImageView) && (imageView = (ImageView) view3) != null) {
                imageView.setPadding(imageView.getPaddingLeft(), imageView.getPaddingTop(), (int) AbstractC13880nE.A04(c37628GhN.A0C, 8), imageView.getPaddingBottom());
                imageView.clearColorFilter();
            }
            RecyclerView A002 = C37556GgC.A00(c37628GhN.A0L);
            if (A002 != null) {
                C3FP c3fp = new C3FP(A002);
                View view4 = c37628GhN.A03;
                if (view4 != null) {
                    if (((IEO) c37628GhN.A0O.getValue()).A01 != null) {
                        view4.setY(-C17s.A03(c3fp.A03.computeVerticalScrollOffset(), 0, r0.intValue()));
                    }
                    c3fp.AAJ(new C39171HLz(2, view4, c37628GhN));
                    return;
                }
                return;
            }
            return;
        }
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C14360o3.A0K(C18U.A04(c06090Tz, userSession, 36878487579656382L), "explore")) {
            C3LO A012 = c37628GhN.A01(new ViewOnClickListenerC37847Gl1(c37628GhN, 8), 2131962005, R.id.clips_viewer_search_button, true);
            A012.A06 = R.drawable.instagram_search_pano_outline_24;
            InterfaceC56362iU interfaceC56362iU3 = c37628GhN.A06;
            if (interfaceC56362iU3 != null) {
                interfaceC56362iU3.AA9(new C3LY(A012));
            }
        }
        if (c37628GhN.A06()) {
            boolean A062 = C18U.A06(c06090Tz, userSession, 36324909244625496L);
            int i = R.drawable.instagram_camera_outline_44;
            boolean z2 = false;
            if (A062) {
                i = R.drawable.instagram_camera_gallery_pano_outline_24;
                z2 = true;
            }
            C3LO A013 = c37628GhN.A01(new ViewOnClickListenerC37847Gl1(c37628GhN, 5), 2131956170, R.id.clips_viewer_camera_button, z2);
            A013.A06 = i;
            InterfaceC56362iU interfaceC56362iU4 = c37628GhN.A06;
            if (interfaceC56362iU4 != null) {
                view = interfaceC56362iU4.AA9(new C3LY(A013));
            } else {
                view = null;
            }
            c37628GhN.A02 = view;
            C120985dq A02 = c37628GhN.A0M.A02();
            if (A02 != null) {
                enumC129395t1 = A02.A01;
            } else {
                enumC129395t1 = null;
            }
            if (enumC129395t1 == EnumC129395t1.A09 && AbstractC37744GjJ.A00 && (view2 = c37628GhN.A02) != null) {
                view2.setVisibility(8);
            }
        }
        if (clipsViewerSource == clipsViewerSource2 && C18U.A06(c06090Tz, userSession, 36320008686542744L)) {
            C3LO A014 = c37628GhN.A01(new ViewOnClickListenerC37847Gl1(c37628GhN, 9), 2131956171, R.id.clips_viewer_clips_showcase_button, false);
            A014.A06 = R.drawable.instagram_compass_pano_outline_24;
            InterfaceC56362iU interfaceC56362iU5 = c37628GhN.A06;
            if (interfaceC56362iU5 != null) {
                interfaceC56362iU5.AA9(new C3LY(A014));
            }
        }
        if (clipsViewerConfig.A0J == ClipsViewerSource.A0C) {
            C3LO A015 = c37628GhN.A01(new ViewOnClickListenerC37847Gl1(c37628GhN, 4), 2131956169, R.id.clips_viewer_blend_settings_button, false);
            A015.A06 = R.drawable.instagram_settings_pano_outline_24;
            InterfaceC56362iU interfaceC56362iU6 = c37628GhN.A06;
            if (interfaceC56362iU6 != null) {
                interfaceC56362iU6.AA9(new C3LY(A015));
            }
        }
        if (C1LE.A07(userSession) && C18U.A06(c06090Tz, userSession, 36321211277452504L)) {
            int i2 = 2131963924;
            if (c37628GhN.A0J.A1K.A0b()) {
                i2 = 2131963925;
            }
            int A003 = c37628GhN.A00();
            C3LO A016 = c37628GhN.A01(new ViewOnClickListenerC37847Gl1(c37628GhN, 7), i2, R.id.audio_button, false);
            A016.A06 = A003;
            InterfaceC56362iU interfaceC56362iU7 = c37628GhN.A06;
            if (interfaceC56362iU7 != null) {
                view3 = interfaceC56362iU7.AA9(new C3LY(A016));
            }
            C14360o3.A0C(view3, AbstractC111324zv.A00(34));
            c37628GhN.A04 = (ImageView) view3;
            c37628GhN.A0E(c37628GhN.A0A);
            return;
        }
        c37628GhN.A04 = null;
    }

    public static final void A04(C37628GhN c37628GhN) {
        View view;
        InterfaceC56362iU interfaceC56362iU = c37628GhN.A06;
        if (interfaceC56362iU != null) {
            view = interfaceC56362iU.ESm(R.layout.layout_clips_action_bar_sender_info_layout, 0, 0, true);
        } else {
            view = null;
        }
        C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
        c37628GhN.A05 = (RelativeLayout) view;
    }

    public static final void A05(C37628GhN c37628GhN) {
        ViewGroup viewGroup;
        View findViewById;
        C38321qM c38321qM;
        User user;
        C37624GhJ c37624GhJ = c37628GhN.A0M;
        C120985dq A02 = c37624GhJ.A02();
        int A01 = c37624GhJ.A01();
        List<EnumC37736GjB> A0c = AbstractC001800i.A0c(c37628GhN.A0N, 1);
        ArrayList A0q = AbstractC167017dG.A0q(A0c);
        Iterator it = A0c.iterator();
        while (true) {
            Drawable drawable = null;
            if (!it.hasNext()) {
                break;
            }
            EnumC37736GjB enumC37736GjB = (EnumC37736GjB) it.next();
            Context context = c37628GhN.A0C;
            String A0p = AbstractC166997dE.A0p(context, enumC37736GjB.A00);
            Integer num = enumC37736GjB.A04;
            if (num != null) {
                drawable = context.getDrawable(num.intValue());
            }
            A0q.add(new C199928sw(null, drawable, null, new C42687Iui(A02, c37628GhN, enumC37736GjB, A01), null, A0p, 0, 0, 0, false, false, false, true, false, false, false));
        }
        View view = c37628GhN.A07;
        if (view == null) {
            InterfaceC56362iU interfaceC56362iU = c37628GhN.A06;
            if (interfaceC56362iU != null) {
                view = interfaceC56362iU.C94();
            } else {
                view = null;
            }
        }
        View view2 = view;
        if (view2 != null) {
            Context context2 = c37628GhN.A0C;
            int A06 = AbstractC167017dG.A06(context2);
            UserSession userSession = c37628GhN.A0G;
            C8QJ c8qj = new C8QJ(context2, userSession, null, false);
            c8qj.A02(A0q);
            c8qj.showAsDropDown(view2, 0, A06);
            C37540Gfw c37540Gfw = c37628GhN.A0J;
            c37628GhN.A0K.AGM(A02, EnumC37860GlF.A03, EnumC37861GlG.A0D);
            for (EnumC37736GjB enumC37736GjB2 : A0c) {
                C37522Gfe c37522Gfe = c37540Gfw.A19;
                if (A02 != null) {
                    c38321qM = A02.A02;
                } else {
                    c38321qM = null;
                }
                C37604Ggz c37604Ggz = c37540Gfw.A1D;
                EnumC37738GjD enumC37738GjD = enumC37736GjB2.A01;
                AbstractC167007dF.A1E(c37522Gfe, 0, c37604Ggz);
                if (c38321qM != null) {
                    user = AbstractC25226BEj.A14(c38321qM);
                } else {
                    user = null;
                }
                if (enumC37738GjD != null && c38321qM != null && user != null) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(c37522Gfe, userSession), "instagram_clips_viewer_lane_button_impression");
                    if (A0f.isSampled()) {
                        AbstractC25225BEi.A1O(A0f, c37522Gfe.getModuleName());
                        String A2u = c38321qM.A2u();
                        if (A2u != null) {
                            AbstractC25236BEt.A0r(A0f, A2u);
                            AbstractC25230BEn.A1D(A0f, Long.parseLong(user.getId()));
                            AbstractC25229BEm.A19(A0f, A01);
                            AbstractC25225BEi.A1P(A0f, c37604Ggz.A01);
                            A0f.A8R(enumC37738GjD, "lane_type");
                            AbstractC37302Gc3.A0y(A0f, c38321qM);
                            AbstractC25233BEq.A17(A0f, "chaining_session_id", c37604Ggz.A00);
                            A0f.Cht();
                        } else {
                            throw AbstractC166997dE.A0g();
                        }
                    } else {
                        continue;
                    }
                }
            }
            InterfaceC56362iU interfaceC56362iU2 = c37628GhN.A06;
            if (interfaceC56362iU2 != null && (viewGroup = ((C56352iT) interfaceC56362iU2).A0Q) != null && (findViewById = viewGroup.findViewById(R.id.content_notes_nux_new_pill_background)) != null) {
                findViewById.animate().alpha(0.0f).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r5.A0G, 36324123265216425L) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r2 = r5.A0E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r2.A1r != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r2.A1a != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r2.A0J == com.instagram.clips.intf.ClipsViewerSource.A0C) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r5.A0J.A0U() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r3 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r2.A1f != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0027, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (X.C18U.A06(r2, r3, r0) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r1 != 26) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A06() {
        /*
            r5 = this;
            com.instagram.clips.intf.ClipsViewerSource r0 = r5.A0F
            int r1 = r0.ordinal()
            r0 = 11
            r4 = 1
            if (r1 == r0) goto L51
            r0 = 13
            if (r1 == r0) goto L51
            r0 = 67
            if (r1 == r0) goto L47
            r0 = 26
            if (r1 == r0) goto L27
        L17:
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36324123265216425(0x810c9900002fa9, double:3.0348600462026145E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r3 = 0
            if (r0 == 0) goto L28
        L27:
            r3 = 1
        L28:
            com.instagram.clips.intf.ClipsViewerConfig r2 = r5.A0E
            boolean r0 = r2.A1r
            if (r0 != 0) goto L61
            boolean r0 = r2.A1a
            if (r0 != 0) goto L61
            com.instagram.clips.intf.ClipsViewerSource r1 = r2.A0J
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.A0C
            if (r1 == r0) goto L61
            X.Gfw r0 = r5.A0J
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L42
            if (r3 == 0) goto L61
        L42:
            boolean r0 = r2.A1f
            if (r0 != 0) goto L61
            return r4
        L47:
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318191915374595(0x81073400001803, double:3.0311090366790124E-306)
            goto L5a
        L51:
            com.instagram.common.session.UserSession r3 = r5.A0G
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36318191915505669(0x81073400021805, double:3.031109036761904E-306)
        L5a:
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 != 0) goto L27
            goto L17
        L61:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37628GhN.A06():boolean");
    }

    public static final boolean A07(C37628GhN c37628GhN) {
        List list = c37628GhN.A0N;
        UserSession userSession = c37628GhN.A0G;
        if (!list.containsAll(AbstractC16960so.A1Q(EnumC37736GjB.A08, EnumC37736GjB.A09))) {
            return false;
        }
        if ((AbstractC37826Gkg.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36318488268576993L)) || (AbstractC37832Gkm.A00(userSession).booleanValue() && C18U.A06(C06090Tz.A05, userSession, 36320098881314879L))) {
            return true;
        }
        return false;
    }

    public final void A08() {
        RelativeLayout relativeLayout = this.A05;
        if (relativeLayout != null) {
            View findViewById = relativeLayout.findViewById(R.id.sender_profile_pic);
            View findViewById2 = relativeLayout.findViewById(R.id.sender_username_or_fullname);
            View findViewById3 = relativeLayout.findViewById(R.id.sender_timestamp);
            View findViewById4 = relativeLayout.findViewById(R.id.suggested_title);
            if (findViewById != null && findViewById2 != null && findViewById3 != null && findViewById4 != null) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(8);
                findViewById3.setVisibility(8);
                findViewById4.setVisibility(8);
            }
        }
    }

    public final void A0A() {
        C9BN c9bn;
        User user;
        FriendshipStatus B8n;
        C43754JWs A00 = AbstractC37837Gkr.A00(this.A0G);
        C14360o3.A07(A00);
        int A03 = this.A0L.A03();
        C9CG A01 = A00.A01(0);
        if (A01 != null && (c9bn = (C9BN) A01.A01) != null && (user = (User) c9bn.A02) != null && (B8n = user.A03.B8n()) != null && AbstractC166997dE.A1Z(B8n.B7V(), true)) {
            A08();
            Context context = this.A0C;
            float A04 = AbstractC13880nE.A04(context, 70);
            InterfaceC56362iU interfaceC56362iU = this.A06;
            if (interfaceC56362iU != null) {
                interfaceC56362iU.ESl((int) A04);
            }
            A04(this);
            RelativeLayout relativeLayout = this.A05;
            if (relativeLayout != null) {
                View findViewById = relativeLayout.findViewById(R.id.suggested_title);
                if (findViewById != null) {
                    int i = 0;
                    if (A03 == 0) {
                        i = 8;
                    }
                    findViewById.setVisibility(i);
                }
                if (A03 == 0) {
                    IgdsFaceSwarm igdsFaceSwarm = (IgdsFaceSwarm) relativeLayout.findViewById(R.id.sender_profile_pic);
                    TextView A0e = AbstractC166987dD.A0e(relativeLayout, R.id.sender_username_or_fullname);
                    TextView A0e2 = AbstractC166987dD.A0e(relativeLayout, R.id.sender_timestamp);
                    if (igdsFaceSwarm != null && A0e != null && A0e2 != null) {
                        ViewOnClickListenerC37847Gl1.A00(igdsFaceSwarm, 3, new HJA(11, user, this));
                        igdsFaceSwarm.setImageUrls(AbstractC166987dD.A1J(new SimpleImageUrl(user.Bhu())), this.A0J.A19);
                        igdsFaceSwarm.setVisibility(0);
                        if (user.getFullName() != null) {
                            A0e.setText(user.getFullName());
                            A0e.setVisibility(0);
                        }
                        if (user.getUsername().length() != 0) {
                            AbstractC31173DnH.A1F(A0e, user);
                            A0e.setVisibility(0);
                        }
                        AbstractC166987dD.A1P(context, A0e2, 2131973317);
                        A0e2.setVisibility(0);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i2 = ((EnumC37736GjB) this.A0N.get(0)).A00;
        InterfaceC56362iU interfaceC56362iU2 = this.A06;
        if (interfaceC56362iU2 == null) {
            return;
        }
        interfaceC56362iU2.Eft(i2, AbstractC53242c7.A0A(this.A0C));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0021, code lost:
    
        if (r0 >= 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0B(int r14) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37628GhN.A0B(int):void");
    }

    public final void A0D(boolean z) {
        InterfaceC19630xq interfaceC19630xq;
        InterfaceC19610xo ARD;
        UserSession userSession = this.A0G;
        if (C18U.A06(C06090Tz.A05, userSession, 36321211277714652L)) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            if (!z) {
                interfaceC19630xq = A00.A01;
                if (!(!interfaceC19630xq.getBoolean("has_seen_tap_to_pause_audio_control_nux", false))) {
                    return;
                }
            } else {
                C06090Tz c06090Tz = C06090Tz.A06;
                if (!C18U.A06(c06090Tz, userSession, 36321211277911263L)) {
                    return;
                }
                interfaceC19630xq = A00.A01;
                boolean z2 = false;
                if (interfaceC19630xq.getInt("tap_to_pause_audio_control_nux_shown_count", 0) < C18U.A01(c06090Tz, userSession, 36602686254682869L)) {
                    z2 = true;
                }
                boolean z3 = false;
                if (System.currentTimeMillis() - AbstractC31175DnJ.A03(interfaceC19630xq, "time_last_seen_tap_to_pause_audio_control_nux_on_paused") >= TimeUnit.DAYS.toMillis(C18U.A01(c06090Tz, userSession, 36602686254748406L))) {
                    z3 = true;
                }
                if (interfaceC19630xq.getBoolean("has_clicked_audio_control_button", false) || !z2 || !z3) {
                    return;
                }
            }
            C149686oL c149686oL = new C149686oL(AbstractC166997dE.A0p(this.A0C, 2131975222));
            ImageView imageView = this.A04;
            if (imageView == null) {
                return;
            }
            C5SU c5su = new C5SU(this.A0D, c149686oL);
            c5su.A03(imageView);
            c5su.A01();
            c5su.A00 = 5000;
            c5su.A0A = true;
            c5su.A0G = true;
            c5su.A04 = new C39149HLd(1);
            C5SW A002 = c5su.A00();
            if (z) {
                A002.A07(userSession);
                long currentTimeMillis = System.currentTimeMillis();
                InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
                ARD2.E7G("time_last_seen_tap_to_pause_audio_control_nux_on_paused", currentTimeMillis);
                ARD2.apply();
                int i = interfaceC19630xq.getInt("tap_to_pause_audio_control_nux_shown_count", 0) + 1;
                ARD = interfaceC19630xq.ARD();
                ARD.E7D("tap_to_pause_audio_control_nux_shown_count", i);
            } else {
                imageView.postDelayed(new J53(A002, this), 500L);
                ARD = interfaceC19630xq.ARD();
                ARD.E77("has_seen_tap_to_pause_audio_control_nux", true);
            }
            ARD.apply();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (X.AbstractC16960so.A1Q(X.EnumC129395t1.A09, X.EnumC129395t1.A0A).contains(r5.A01) == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(boolean r7) {
        /*
            r6 = this;
            r6.A0A = r7
            X.GhJ r0 = r6.A0M
            X.5dq r5 = r0.A02()
            android.widget.ImageView r3 = r6.A04
            if (r3 == 0) goto L41
            com.instagram.common.session.UserSession r4 = r6.A0G
            boolean r0 = X.C1LE.A07(r4)
            if (r0 == 0) goto L42
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36321211277452504(0x8109f3000124d8, double:3.033018493415077E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L42
            r1 = 0
            if (r5 == 0) goto L3c
            X.1qM r0 = r5.A02
            if (r0 == 0) goto L3c
            X.5t1 r2 = X.EnumC129395t1.A09
            X.5t1 r0 = X.EnumC129395t1.A0A
            X.5t1[] r0 = new X.EnumC129395t1[]{r2, r0}
            java.util.List r2 = X.AbstractC16960so.A1Q(r0)
            X.5t1 r0 = r5.A01
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3e
        L3c:
            r1 = 8
        L3e:
            r3.setVisibility(r1)
        L41:
            return
        L42:
            X.Hda r0 = X.EnumC39564Hda.A04
            int r2 = r0.ordinal()
            r0 = 2
            r1 = 0
            if (r2 == r0) goto L62
            r0 = 3
            if (r2 == r0) goto L53
            r0 = 1
            if (r2 == r0) goto L3e
            goto L3c
        L53:
            boolean r0 = r6.A0A
            if (r0 != 0) goto L3e
            X.Gfw r0 = r6.A0J
            X.GgG r0 = r0.A1K
            boolean r0 = r0.A0b()
            if (r0 != 0) goto L3c
            goto L3e
        L62:
            boolean r0 = r6.A0A
            if (r0 == 0) goto L3c
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37628GhN.A0E(boolean):void");
    }

    private final C3LO A01(View.OnClickListener onClickListener, int i, int i2, boolean z) {
        C3LO A0B = AbstractC31171DnF.A0B();
        A0B.A05 = i;
        A0B.A04 = i2;
        A0B.A0G = onClickListener;
        A0B.A0N = false;
        Context context = this.A0C;
        A0B.A02 = AbstractC167007dF.A09(context, R.attr.igds_color_icon_on_media);
        A0B.A09 = 17;
        if (!z) {
            A0B.A0O = true;
            A0B.A0B = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material);
            A0B.A07 = 0;
            A0B.A0E = 0;
            A0B.A00 = 0;
        }
        return A0B;
    }

    public final void A09() {
        Object obj;
        Number number;
        int A00 = A00();
        String str = null;
        if (C18U.A06(C06090Tz.A06, this.A0G, 36321211277845726L)) {
            ImageView imageView = this.A04;
            if (imageView != null) {
                obj = imageView.getTag();
            } else {
                obj = null;
            }
            if ((obj instanceof Integer) && (number = (Number) obj) != null && number.intValue() == A00) {
                return;
            }
            ImageView imageView2 = this.A04;
            if (imageView2 != null) {
                imageView2.setTag(Integer.valueOf(A00));
            }
        }
        ImageView imageView3 = this.A04;
        if (imageView3 != null) {
            imageView3.setImageResource(A00);
        }
        ImageView imageView4 = this.A04;
        if (imageView4 == null) {
            return;
        }
        Context context = imageView4.getContext();
        if (context != null) {
            int i = 2131963924;
            if (this.A0J.A1K.A0b()) {
                i = 2131963925;
            }
            str = context.getString(i);
        }
        imageView4.setContentDescription(str);
    }
}
