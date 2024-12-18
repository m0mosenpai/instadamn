package X;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.AdR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23632AdR implements InterfaceC23471Cj {
    public ViewGroup A00;
    public AB1 A01;
    public C195838lR A02;
    public AGK A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Activity A09;
    public final ViewGroup A0A;
    public final AAB A0B;
    public final C23656Adr A0C;
    public final UserSession A0D;
    public final String A0E;
    public final String A0F;
    public final ArrayList A0G;
    public final HashMap A0H;

    @Override // X.InterfaceC23471Cj
    public final void DYE(Map map) {
        C23656Adr c23656Adr;
        EnumC223239t9 enumC223239t9;
        C14360o3.A0B(map, 0);
        if (Systrace.A0E(1L)) {
            AbstractC13090lv.A04("igcam_permission_request_callback", 0);
        }
        this.A08 = false;
        HashMap hashMap = this.A0H;
        hashMap.putAll(map);
        if (this.A07) {
            this.A05 = false;
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            int i = 0;
            boolean z = true;
            do {
                String str = strArr[i];
                EnumC172127lh enumC172127lh = EnumC172127lh.A05;
                if (enumC172127lh != hashMap.get(str)) {
                    z = false;
                }
                if (EnumC172127lh.A04 == hashMap.get(str)) {
                    this.A05 = true;
                }
                if (this.A0G.contains(str)) {
                    boolean A1X = AbstractC167007dF.A1X(enumC172127lh, hashMap.get(str));
                    if (C14360o3.A0K(str, "android.permission.CAMERA")) {
                        c23656Adr = this.A0C;
                        if (A1X) {
                            enumC223239t9 = EnumC223239t9.A0B;
                        } else {
                            enumC223239t9 = EnumC223239t9.A0A;
                        }
                    } else if (C14360o3.A0K(str, "android.permission.RECORD_AUDIO")) {
                        c23656Adr = this.A0C;
                        if (A1X) {
                            enumC223239t9 = EnumC223239t9.A0R;
                        } else {
                            enumC223239t9 = EnumC223239t9.A0Q;
                        }
                    }
                    C23656Adr.A00(enumC223239t9, c23656Adr);
                }
                i++;
            } while (i < 2);
            if (z) {
                C195838lR c195838lR = this.A02;
                if (c195838lR != null) {
                    c195838lR.A00();
                }
                this.A02 = null;
                AGK agk = this.A03;
                if (agk != null) {
                    agk.A03.removeView(agk.A04);
                }
                this.A03 = null;
                A01();
                AB1 ab1 = this.A01;
                if (ab1 != null) {
                    ab1.A00();
                }
            } else {
                C195838lR c195838lR2 = this.A02;
                if (c195838lR2 == null) {
                    c195838lR2 = new C195838lR(A00(this), R.layout.permission_empty_state_view);
                    Context context = this.A0A.getContext();
                    String A0K = AbstractC53242c7.A0K(context);
                    C14360o3.A07(A0K);
                    c195838lR2.A06(map);
                    c195838lR2.A05(AbstractC167007dF.A0f(context, A0K, 2131954590));
                    c195838lR2.A04(AbstractC167007dF.A0f(context, A0K, 2131954589));
                    c195838lR2.A02(2131954588);
                    c195838lR2.A03(new ViewOnClickListenerC23249ASk(this, 7));
                    c195838lR2.A01();
                    this.A02 = c195838lR2;
                }
                c195838lR2.A06(map);
                AB1 ab12 = this.A01;
                if (ab12 != null) {
                    C23100AGm c23100AGm = ab12.A00.A02;
                    if (c23100AGm == null) {
                        C14360o3.A0F("ar3dToggleController");
                        throw C00O.createAndThrow();
                    }
                    c23100AGm.A01();
                }
            }
            C4IA c4ia = C4IA.A05;
            C4IB c4ib = C4IB.A0C;
            List A1Q = AbstractC16960so.A1Q(new Pair(c4ia, c4ib), new Pair(C4IA.A09, c4ib));
            UserSession userSession = this.A0D;
            new C4I7(new C19270xB(C1813982r.__redex_internal_original_name), userSession).A01(C4I8.A00(userSession), "CAMERA_INITIALIZATION_CONTROLLER", A1Q, AbstractC166987dD.A1J(C4I9.UNKNOWN), map);
        }
    }

    public static ViewGroup A00(C23632AdR c23632AdR) {
        ViewGroup viewGroup = c23632AdR.A00;
        if (viewGroup == null) {
            View requireViewById = c23632AdR.A0A.requireViewById(R.id.camera_permissions_cover);
            ViewGroup viewGroup2 = (ViewGroup) requireViewById;
            c23632AdR.A00 = viewGroup2;
            C14360o3.A07(requireViewById);
            return viewGroup2;
        }
        return viewGroup;
    }

    private final void A01() {
        if (!this.A06) {
            this.A06 = true;
            AAB aab = this.A0B;
            String str = this.A0E;
            String str2 = this.A0F;
            C23656Adr.A00(EnumC223239t9.A0I, aab.A05.A00.A02());
            AKN akn = aab.A03;
            C22990ABp c22990ABp = aab.A06;
            L91 l91 = new L91(c22990ABp.A03, new C23565AcJ(c22990ABp), C12L.A00, c22990ABp.A06);
            akn.A03 = new AWK(aab);
            l91.A01(str, str2);
            l91.A00(akn.A0D);
            akn.A02();
            A00(this).setVisibility(8);
        }
    }

    public static final void A02(C23632AdR c23632AdR, boolean z) {
        int i;
        int i2;
        AGK agk;
        if (c23632AdR.A08) {
            if (z && (agk = c23632AdR.A03) != null) {
                Iterator A15 = AbstractC166997dE.A15(agk.A05);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    AGK.A00((TextView) A1K.getValue(), agk, (String) A1K.getKey());
                }
                return;
            }
            return;
        }
        c23632AdR.A08 = true;
        c23632AdR.A0C.A02(EnumC223239t9.A0X, "", null);
        ViewGroup viewGroup = c23632AdR.A00;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (Systrace.A0E(1L)) {
            AbstractC13090lv.A03("igcam_permission_request_callback", 0);
        }
        if (C18U.A06(C06090Tz.A05, c23632AdR.A0D, 36313836818532619L)) {
            AGK agk2 = c23632AdR.A03;
            if (agk2 == null) {
                agk2 = new AGK(c23632AdR.A09, A00(c23632AdR));
                c23632AdR.A03 = agk2;
            }
            Activity activity = c23632AdR.A09;
            ArrayList A1E = AbstractC166987dD.A1E();
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            int i3 = 0;
            do {
                String str = strArr[i3];
                C14360o3.A0B(str, 1);
                boolean equals = str.equals("android.permission.CAMERA");
                if (equals) {
                    i = 2131969536;
                } else if (str.equals("android.permission.RECORD_AUDIO")) {
                    i = 2131969539;
                } else {
                    throw AbstractC166987dD.A12("No title found for permission");
                }
                String A0p = AbstractC166997dE.A0p(activity, i);
                if (equals) {
                    i2 = 2131969537;
                } else if (str.equals("android.permission.RECORD_AUDIO")) {
                    i2 = 2131969539;
                } else {
                    throw AbstractC166987dD.A12("No hint found for permission");
                }
                A1E.add(new A8Y(str, A0p, AbstractC166997dE.A0p(activity, i2)));
                i3++;
            } while (i3 < 2);
            String A0p2 = AbstractC166997dE.A0p(activity, 2131969541);
            String A0p3 = AbstractC166997dE.A0p(activity, 2131969540);
            ViewGroup viewGroup2 = agk2.A03;
            ViewGroup viewGroup3 = agk2.A04;
            viewGroup2.removeView(viewGroup3);
            AbstractC166987dD.A0e(viewGroup3, R.id.title).setText(A0p2);
            AbstractC166987dD.A0e(viewGroup3, R.id.message).setText(A0p3);
            ViewGroup viewGroup4 = (ViewGroup) viewGroup3.findViewById(R.id.user_actions);
            viewGroup4.removeAllViews();
            Map map = agk2.A05;
            map.clear();
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                A8Y a8y = (A8Y) it.next();
                Context context = agk2.A02;
                C14360o3.A06(context);
                IgTextView igTextView = new IgTextView(context);
                igTextView.setText(a8y.A01);
                igTextView.setFocusable(true);
                igTextView.setContentDescription(a8y.A00);
                igTextView.setTextAppearance(R.style.igds_emphasized_label);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int A07 = AbstractC166997dE.A07(igTextView.getResources());
                layoutParams.setMargins(A07, A07, A07, A07);
                igTextView.setLayoutParams(layoutParams);
                igTextView.setTypeface(null, 1);
                String str2 = a8y.A02;
                AGK.A00(igTextView, agk2, str2);
                map.put(str2, igTextView);
                viewGroup4.addView(igTextView);
            }
            agk2.A00 = c23632AdR;
            viewGroup2.addView(viewGroup3);
            return;
        }
        AbstractC23451Ch.A04(c23632AdR.A09, c23632AdR, (String[]) Arrays.copyOf(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, 2));
    }

    public final void A03(AB1 ab1, Integer num) {
        String str;
        if (num != C05F.A01) {
            this.A01 = ab1;
            ArrayList A1E = AbstractC166987dD.A1E();
            String[] strArr = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
            int i = 0;
            do {
                String str2 = strArr[i];
                if (!AbstractC23451Ch.A07(this.A09, str2)) {
                    A1E.add(str2);
                }
                i++;
            } while (i < 2);
            if (A1E.isEmpty()) {
                AB1 ab12 = this.A01;
                if (ab12 != null) {
                    ab12.A00();
                }
            } else {
                if (!this.A04) {
                    ArrayList arrayList = this.A0G;
                    arrayList.clear();
                    arrayList.addAll(A1E);
                    this.A04 = true;
                    A02(this, false);
                    return;
                }
                AGK agk = this.A03;
                C23656Adr c23656Adr = this.A0C;
                EnumC223239t9 enumC223239t9 = EnumC223239t9.A0A;
                String obj = new C0YZ(C23632AdR.class).toString();
                if (agk == null) {
                    str = "Not starting the camera, permissions were requested by denied since last hide";
                } else {
                    str = "Got into unexpected position";
                }
                c23656Adr.A02(enumC223239t9, obj, str);
                AB1 ab13 = this.A01;
                if (ab13 == null) {
                    return;
                }
                C23100AGm c23100AGm = ab13.A00.A02;
                if (c23100AGm == null) {
                    C14360o3.A0F("ar3dToggleController");
                    throw C00O.createAndThrow();
                }
                c23100AGm.A01();
                return;
            }
        }
        A01();
    }

    public C23632AdR(Activity activity, ViewGroup viewGroup, AAB aab, C23656Adr c23656Adr, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1R(userSession, viewGroup);
        C14360o3.A0B(c23656Adr, 7);
        this.A09 = activity;
        this.A0D = userSession;
        this.A0A = viewGroup;
        this.A0E = str;
        this.A0F = str2;
        this.A0B = aab;
        this.A0C = c23656Adr;
        this.A0H = AbstractC166987dD.A1G();
        this.A0G = AbstractC166987dD.A1E();
    }
}
