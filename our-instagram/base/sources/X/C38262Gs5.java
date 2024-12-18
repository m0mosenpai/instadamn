package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.question.model.QuestionResponsesModelIntf;
import com.instagram.user.model.User;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gs5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38262Gs5 extends BaseAdapter implements InterfaceC161877Mx, CallerContextable {
    public static int A0H = 0;
    public static boolean A0I = false;
    public static final String __redex_internal_original_name = "ReelDashboardListAdapter";
    public C41551w4 A01;
    public InterfaceC55362gb A02;
    public C52672NRt A03;
    public final AbstractC59962oe A05;
    public final InterfaceC11380iw A06;
    public final UserSession A07;
    public final ReelViewerConfig A08;
    public final C3G2 A09;
    public final C41195ILj A0A;
    public final ReelDashboardFragment A0B;
    public final boolean A0E;
    public final boolean A0F;
    public final HashMap A0C = AbstractC166987dD.A1G();
    public final Map A0D = AbstractC166987dD.A1G();
    public final C8SI A0G = new C8SI(1);
    public int A00 = -1;
    public boolean A04 = true;

    public static C38264Gs7 A01(C38262Gs5 c38262Gs5, Object obj) {
        return (C38264Gs7) c38262Gs5.A0C.get(obj);
    }

    public static ArrayList A02(C38264Gs7 c38264Gs7, C38262Gs5 c38262Gs5) {
        int A1a;
        int A1b;
        boolean z = c38262Gs5.A0F;
        LinearLayoutManager linearLayoutManager = null;
        ViewGroup CFj = c38264Gs7.A0h.CFj();
        if (z) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) ((RecyclerView) CFj).A0D;
            CFj = null;
            linearLayoutManager = linearLayoutManager2;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        if (linearLayoutManager == null) {
            if (CFj != null) {
                AdapterView adapterView = (AdapterView) CFj;
                A1a = adapterView.getFirstVisiblePosition();
                A1b = adapterView.getLastVisiblePosition();
            }
            return A1E;
        }
        A1a = linearLayoutManager.A1a();
        A1b = linearLayoutManager.A1b();
        C41181vS c41181vS = c38264Gs7.A0G;
        c41181vS.getClass();
        List A0d = c41181vS.A0d();
        while (A1a < A1b) {
            if (A0d.size() > A1a) {
                A1E.add(A0d.get(A1a));
            }
            A1a++;
        }
        return A1E;
    }

    public static void A03(Context context, IgSimpleImageView igSimpleImageView, IgSimpleImageView igSimpleImageView2, IgTextView igTextView) {
        igTextView.setVisibility(8);
        igSimpleImageView.setLayoutParams(new LinearLayout.LayoutParams(Math.round(context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin)), Math.round(AbstractC166997dE.A04(context, R.dimen.achievements_only_you_top_margin))));
        igSimpleImageView.setVisibility(0);
        igSimpleImageView2.setVisibility(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0058, code lost:
    
        if (r9 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0075, code lost:
    
        if (X.AnonymousClass483.A04(r9.A0C.C1a()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        if (X.AnonymousClass483.A04(r9.A0C.Bkk()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0088, code lost:
    
        if (r9 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r14 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r13 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
    
        if (r12 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a4, code lost:
    
        if (r4.A1I() != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r8 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a8, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        if (r7 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
    
        if (r6 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        if (r3 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r2 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r1 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        if (r15 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (X.C38262Gs5.A0I != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        if (A06(r16, r17, r4, r19) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c8, code lost:
    
        r11 = r20.A0j;
        r21.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r11.A00 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d3, code lost:
    
        r1 = r11.A04.inflate();
        r11.A00 = r1;
        r11.A01 = (android.widget.ImageView) r1.findViewById(com.facebook.R.id.reel_dashboard_call_to_action_icon);
        r11.A03 = X.AbstractC166987dD.A0e(r1, com.facebook.R.id.reel_dashboard_call_to_action_title);
        r11.A02 = X.AbstractC166987dD.A0e(r1, com.facebook.R.id.reel_dashboard_call_to_action_button);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        r11.A00.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        if (r9 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ff, code lost:
    
        r12 = r11.A00.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0109, code lost:
    
        if (r17.A0i() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010b, code lost:
    
        X.IB9.A00(r11, X.AbstractC167007dF.A0f(r12, r17.A0r, 2131971664), r12.getString(2131971663), com.facebook.R.drawable.instagram_story_highlight_pano_outline_24);
        r2 = r11.A02;
        r2.getClass();
        r1 = new X.ViewOnClickListenerC55463OkI(r21, 52);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        X.C0fQ.A00(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0035, code lost:
    
        if (r0.Boe().isEmpty() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:
    
        if (r9.A5q() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x016f, code lost:
    
        X.IB9.A00(r11, r12.getString(2131971666), r12.getString(2131973639), com.facebook.R.drawable.instagram_share_pano_outline_24);
        r2 = r11.A02;
        r2.getClass();
        r0 = 34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018a, code lost:
    
        r1 = new X.ViewOnClickListenerC35670Fp5(r0, r21, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0190, code lost:
    
        X.IB9.A00(r11, r12.getString(2131971662), r12.getString(2131971665), com.facebook.R.drawable.instagram_story_highlight_pano_outline_24);
        r2 = r11.A02;
        r2.getClass();
        r0 = 35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0134, code lost:
    
        if (A06(r16, r17, r4, r19) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0136, code lost:
    
        r4 = r20.A0g;
        r4.A03(0);
        r3 = r20.A0S;
        r2 = r3.getContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
    
        if (r17.A0l() != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0147, code lost:
    
        r0 = 2131971668;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        if (r19 != X.C3G2.A1f) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0151, code lost:
    
        ((android.widget.TextView) r4.A01()).setText(r2.getString(r0));
        X.AbstractC13880nE.A0Y(r3, X.AbstractC53242c7.A0G(r2, com.facebook.R.attr.actionBarHeight));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0168, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014e, code lost:
    
        r0 = 2131971669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f4, code lost:
    
        r0 = r20.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01f6, code lost:
    
        if (r0 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f8, code lost:
    
        r0 = r20.A0Z.inflate();
        r20.A04 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0200, code lost:
    
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ac, code lost:
    
        r2 = r20.A0k;
        r1 = r20.A0H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01b2, code lost:
    
        if (r2.A03 == r4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b4, code lost:
    
        r2.A09 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01b8, code lost:
    
        r2.A02 = r17;
        r2.A03 = r4;
        r2.A04 = r1;
        r2.A05 = r18;
        r2.A06 = r19;
        r2.A08 = X.AbstractC166997dE.A0n();
        r0 = r2.A0W;
        r0.clear();
        r0.addAll(r10);
        r2.A07();
        r2 = r20.A0i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01de, code lost:
    
        if (r4.A0e.ordinal() == 1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e0, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01e1, code lost:
    
        r2.A00 = r0;
        r0 = r20.A0h.CFj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ea, code lost:
    
        r9.getClass();
        r0 = r9.A0C.CG7();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008a, code lost:
    
        r0 = r9.A0C.B58();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0090, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0092, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (X.AnonymousClass483.A04(r9.A0C.C1s()) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0097, code lost:
    
        if (r0.intValue() > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0077, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0078, code lost:
    
        if (r9 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x005a, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0065, code lost:
    
        if (X.AnonymousClass483.A04(r9.A0C.C2F()) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0048, code lost:
    
        if (r9 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0055, code lost:
    
        if (X.AnonymousClass483.A04(r9.A0C.C23()) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A04(com.instagram.common.session.UserSession r16, com.instagram.model.reels.Reel r17, com.instagram.model.reels.ReelViewerConfig r18, X.C3G2 r19, X.C38264Gs7 r20, instagram.features.stories.dashboard.fragment.ReelDashboardFragment r21) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38262Gs5.A04(com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, com.instagram.model.reels.ReelViewerConfig, X.3G2, X.Gs7, instagram.features.stories.dashboard.fragment.ReelDashboardFragment):void");
    }

    public static void A05(C38264Gs7 c38264Gs7) {
        c38264Gs7.A0h.CFj().setVisibility(8);
        View view = c38264Gs7.A04;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = c38264Gs7.A09;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        View view3 = c38264Gs7.A0A;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        View view4 = c38264Gs7.A03;
        if (view4 != null) {
            view4.setVisibility(8);
        }
        c38264Gs7.A0g.A03(8);
        AbstractC13880nE.A0Y(c38264Gs7.A0S, 0);
        View view5 = c38264Gs7.A0j.A00;
        if (view5 != null) {
            view5.setVisibility(8);
        }
    }

    public final void A08() {
        Iterator A0k = AbstractC167007dF.A0k(this.A0C);
        while (A0k.hasNext()) {
            ((C38264Gs7) A0k.next()).A0k.notifyDataSetChanged();
        }
    }

    public final void A09(int i, boolean z) {
        int size;
        C38321qM c38321qM;
        String str;
        C66277U6x A01;
        IgBloksScreenConfig A0C;
        HDU hdu;
        String str2;
        C41551w4 c41551w4 = this.A01;
        if (c41551w4 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A07;
            C14360o3.A0B(userSession, 0);
            size = C41551w4.A00(userSession, c41551w4).size();
        }
        if (i < size) {
            C41551w4 c41551w42 = this.A01;
            c41551w42.getClass();
            UserSession userSession2 = this.A07;
            C41181vS A0A = c41551w42.A0A(userSession2, i);
            if (A0A != null && A0A.CY4() && (c38321qM = A0A.A0b) != null && AbstractC76783cQ.A06(userSession2, c38321qM, C05F.A0j, true)) {
                HashMap hashMap = this.A0C;
                String str3 = A0A.A0j;
                C38264Gs7 c38264Gs7 = (C38264Gs7) hashMap.get(str3);
                if (c38264Gs7 != null && z) {
                    C23031Ai c23031Ai = this.A0A.A00;
                    if (c23031Ai.A1l()) {
                        c23031Ai.A1l();
                        InterfaceC11380iw interfaceC11380iw = this.A06;
                        AbstractC167007dF.A1D(userSession2, 1, interfaceC11380iw);
                        F0L.A00(AbstractC37302Gc3.A0I(interfaceC11380iw, userSession2), "insights_icon", "stories");
                        C14240no c14240no = new C14240no(this.A05.getChildFragmentManager());
                        if (c38321qM.A4h()) {
                            String str4 = str3.split("_")[0];
                            final int random = (int) (Math.random() * 2.147483647E9d);
                            HashMap A1G = AbstractC166987dD.A1G();
                            A1G.put("instance_id", Integer.toString(random));
                            A1G.put("target_id", str4);
                            A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "story_swipe_up");
                            A1G.put("origin", this.A09.A00);
                            if (C18U.A06(C06090Tz.A05, userSession2, 36313957077682516L)) {
                                str2 = AbstractC111324zv.A00(819);
                            } else {
                                str2 = "com.instagram.insights.media.stories.surface";
                            }
                            C006802i.A0p.markerStart(39124993, random);
                            C006802i.A0p.markerAnnotate(39124993, random, "insights_type", "umi");
                            C006802i.A0p.markerAnnotate(39124993, random, "component_url", str2);
                            AbstractC167007dF.A0J().postDelayed(new Runnable() { // from class: X.J5C
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C006802i.A0p.markerEnd(39124993, random, (short) 113);
                                }
                            }, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                            A01 = C66277U6x.A01(str2, A1G);
                            A0C = AbstractC31171DnF.A0C(userSession2);
                            hdu = new HDU(this, random, 1);
                        } else {
                            String str5 = str3.split("_")[0];
                            HashMap A1G2 = AbstractC166987dD.A1G();
                            final int random2 = (int) (Math.random() * 2.147483647E9d);
                            A1G2.put("instance_id", Integer.toString(random2));
                            A1G2.put("target_id", str5);
                            A1G2.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "story_swipe_up");
                            A1G2.put("origin", this.A09.A00);
                            if (C18U.A06(C06090Tz.A05, userSession2, 36313360077359013L)) {
                                str = "com.instagram.insights.media_refresh.stories.core";
                            } else {
                                str = "com.instagram.insights.media.stories.surface.core";
                            }
                            C006802i.A0p.markerStart(39124993, random2);
                            C006802i.A0p.markerAnnotate(39124993, random2, "insights_type", "umi");
                            C006802i.A0p.markerAnnotate(39124993, random2, "component_url", str);
                            AbstractC167007dF.A0J().postDelayed(new Runnable() { // from class: X.J5D
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C006802i.A0p.markerEnd(39124993, random2, (short) 113);
                                }
                            }, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                            A01 = C66277U6x.A01(str, A1G2);
                            A0C = AbstractC31171DnF.A0C(userSession2);
                            hdu = new HDU(this, random2, 0);
                        }
                        A0C.A03 = hdu;
                        c14240no.A0D(W6d.A02(A0C, A01), null, c38264Gs7.A0U.getId());
                        c14240no.A01();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC161877Mx
    public final boolean AJn(String str) {
        C41551w4 c41551w4 = this.A01;
        c41551w4.getClass();
        UserSession userSession = this.A07;
        C14360o3.A0B(userSession, 0);
        Iterator it = C41551w4.A00(userSession, c41551w4).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C41181vS) it.next()).A0d().iterator();
            while (it2.hasNext()) {
                if (AbstractC25226BEj.A15(it2).getId().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size;
        C41551w4 c41551w4 = this.A01;
        if (c41551w4 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A07;
            C14360o3.A0B(userSession, 0);
            size = C41551w4.A00(userSession, c41551w4).size();
        }
        return size + (AbstractC38260Gs3.A04(this.A07, this.A01) ? 1 : 0);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        int size;
        C41551w4 c41551w4 = this.A01;
        if (c41551w4 == null) {
            size = 0;
        } else {
            UserSession userSession = this.A07;
            C14360o3.A0B(userSession, 0);
            size = C41551w4.A00(userSession, c41551w4).size();
        }
        if (i >= size) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r2 == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x042e, code lost:
    
        if (r16 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r0 == r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01c2, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8, 36317247022568407L) != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0489  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r29, android.view.View r30, android.view.ViewGroup r31) {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38262Gs5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C38262Gs5(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, ReelViewerConfig reelViewerConfig, C3G2 c3g2, C41195ILj c41195ILj, ReelDashboardFragment reelDashboardFragment) {
        this.A07 = userSession;
        this.A05 = abstractC59962oe;
        this.A0B = reelDashboardFragment;
        this.A06 = interfaceC11380iw;
        this.A09 = c3g2;
        this.A08 = reelViewerConfig;
        this.A0A = c41195ILj;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A0F = C18U.A06(c06090Tz, userSession, 36311753759392516L);
        A0I = C18U.A06(c06090Tz, userSession, 36316456748585363L);
        this.A0E = C18U.A06(c06090Tz, userSession, 36324312243908705L);
    }

    public static RecyclerView A00(C38262Gs5 c38262Gs5, String str) {
        C38264Gs7 A01 = A01(c38262Gs5, str);
        if (A01 != null) {
            C3FQ c3fq = A01.A0h;
            int B6q = c3fq.B6q();
            int BM3 = c3fq.BM3();
            for (int i = B6q; i <= BM3; i++) {
                if (A01.A0k.getItem(i) instanceof QuestionResponsesModelIntf) {
                    return (RecyclerView) c3fq.AnU(i - B6q);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        if (r5.A1D() == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r3, 36317247022568407L) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean A06(com.instagram.common.session.UserSession r3, com.instagram.model.reels.Reel r4, X.C41181vS r5, X.C3G2 r6) {
        /*
            java.util.List r0 = r5.A0d()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            X.1qM r0 = r5.A0b
            r0.getClass()
            boolean r0 = r0.A4f()
            if (r0 == 0) goto L28
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36317247022568407(0x810658000013d7, double:3.030511482663601E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L28
        L22:
            boolean r0 = r5.A1D()
            if (r0 != 0) goto L33
        L28:
            boolean r0 = r4.A0l()
            if (r0 != 0) goto L33
            X.3G2 r1 = X.C3G2.A1f
            r0 = 0
            if (r6 != r1) goto L34
        L33:
            r0 = 1
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38262Gs5.A06(com.instagram.common.session.UserSession, com.instagram.model.reels.Reel, X.1vS, X.3G2):boolean");
    }

    public final String A07(String str) {
        C38264Gs7 A01 = A01(this, str);
        if (A01 != null) {
            return A01.A0i.A00;
        }
        return null;
    }

    public final void A0A(String str, List list) {
        C38264Gs7 A01 = A01(this, str);
        if (A01 != null) {
            C41181vS c41181vS = A01.A0G;
            c41181vS.getClass();
            if (c41181vS.A0e == EnumC41231vY.A09) {
                if (list == null) {
                    list = Collections.emptyList();
                }
                C38321qM c38321qM = c41181vS.A0b;
                c38321qM.getClass();
                C14360o3.A0B(list, 0);
                InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(Long.valueOf(Long.parseLong((String) it.next())));
                }
                interfaceC38831rF.Edt(A0q);
            }
            A01.A0k.A07();
        }
    }

    public final void A0B(String str, boolean z) {
        C38264Gs7 A01 = A01(this, str);
        if (A01 != null) {
            C31543DtT c31543DtT = A01.A0i;
            if (z != c31543DtT.isLoading()) {
                c31543DtT.A02 = z;
                A01.A0k.notifyDataSetChanged();
            }
        }
    }

    public final boolean A0C(String str, String str2, List list, List list2) {
        List list3;
        java.util.Set set;
        String str3;
        C38264Gs7 A01 = A01(this, str);
        if (A01 != null) {
            C41181vS c41181vS = A01.A0G;
            c41181vS.getClass();
            UserSession userSession = this.A07;
            if (c41181vS.A0e.ordinal() == 1) {
                C38321qM c38321qM = c41181vS.A0b;
                c38321qM.getClass();
                synchronized (c38321qM) {
                    C14360o3.A0B(list, 0);
                    InterfaceC38831rF interfaceC38831rF = c38321qM.A0C;
                    List CGP = interfaceC38831rF.CGP();
                    if (CGP == null) {
                        CGP = C16930sl.A00;
                    }
                    ArrayList A0S = AbstractC001800i.A0S(list, CGP);
                    HashSet A1H = AbstractC166987dD.A1H();
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it = A0S.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        User user = (User) next;
                        if (user != null) {
                            str3 = user.getId();
                        } else {
                            str3 = null;
                        }
                        if (A1H.add(str3)) {
                            A1E.add(next);
                        }
                    }
                    interfaceC38831rF.EhA(A1E);
                    c38321qM.A0C.Eh8(str2);
                }
            }
            C41181vS c41181vS2 = A01.A0G;
            c41181vS2.getClass();
            if (c41181vS2.A0N) {
                list3 = c41181vS2.A0n;
                set = c41181vS2.A0q;
            } else {
                list3 = c41181vS2.A0p;
                set = c41181vS2.A0r;
            }
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                C9C8 c9c8 = (C9C8) it2.next();
                if (c9c8.A07 && C18U.A06(C06090Tz.A05, userSession, 36321344421373258L)) {
                    c41181vS2.A0o.add(c9c8);
                } else if (set.add(((User) c9c8.A05).getId())) {
                    list3.add(c9c8);
                }
            }
            A01.A0i.A00 = str2;
            if (C18U.A06(C06090Tz.A05, userSession, 36325519129588875L)) {
                C38274GsJ A00 = AbstractC38267GsC.A00(userSession);
                ArrayList A02 = A02(A01, this);
                C14360o3.A0B(str, 0);
                if (C38274GsJ.A00(A00, str) != null) {
                    A00.A00 = A02;
                    A00.A01 = true;
                }
            }
            A01.A0k.A07();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC161877Mx
    public final void FAg() {
        C0fA.A00(this, -953512678);
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        if (getItemViewType(i) == 0) {
            C41551w4 c41551w4 = this.A01;
            c41551w4.getClass();
            UserSession userSession = this.A07;
            C14360o3.A0B(userSession, 0);
            return C41551w4.A00(userSession, c41551w4).get(i);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        if (getItemViewType(i) != 0) {
            return 0L;
        }
        C8SI c8si = this.A0G;
        C41551w4 c41551w4 = this.A01;
        c41551w4.getClass();
        UserSession userSession = this.A07;
        C14360o3.A0B(userSession, 0);
        return c8si.A00(((C41181vS) C41551w4.A00(userSession, c41551w4).get(i)).A0j);
    }
}
