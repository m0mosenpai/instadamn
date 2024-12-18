package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Leh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48605Leh implements MRI {
    public static final C35119FeM A08 = new C35119FeM(true);
    public MOU A00;
    public final Activity A01;
    public final Context A02;
    public final UserSession A03;
    public final C22988ABn A04;
    public final C23031Ai A05;
    public final List A06;
    public final boolean A07;

    @Override // X.MRI
    public final boolean EjN() {
        return false;
    }

    @Override // X.MRI
    public final void onDestroy() {
        this.A00 = null;
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [X.2pI, java.lang.Object] */
    public static final void A00(C48605Leh c48605Leh) {
        Object ghy;
        List list = c48605Leh.A06;
        list.clear();
        C35119FeM c35119FeM = A08;
        list.add(c35119FeM);
        Context context = c48605Leh.A02;
        GHY ghy2 = new GHY(context, new ViewOnClickListenerC48063LPo(c48605Leh, 21), 2131974716);
        ghy2.A03 = R.drawable.instagram_new_story_pano_outline_24;
        ghy2.A02 = R.drawable.instagram_chevron_right_pano_outline_16;
        list.add(ghy2);
        GHY ghy3 = new GHY(context, new ViewOnClickListenerC48063LPo(c48605Leh, 20), 2131972006);
        ghy3.A03 = R.drawable.instagram_reels_pano_outline_24;
        ghy3.A02 = R.drawable.instagram_chevron_right_pano_outline_16;
        list.add(ghy3);
        GHY ghy4 = new GHY(context, new ViewOnClickListenerC48063LPo(c48605Leh, 19), 2131965534);
        ghy4.A03 = R.drawable.instagram_live_pano_outline_24;
        ghy4.A02 = R.drawable.instagram_chevron_right_pano_outline_16;
        list.add(ghy4);
        list.add(c35119FeM);
        ArrayList A1E = AbstractC166987dD.A1E();
        A1E.add(new C31335Dq0(context.getString(2131954576)));
        C23031Ai c23031Ai = c48605Leh.A05;
        A1E.add(new C36731GHa(new LRE(c48605Leh, 6), 2131963191, c23031Ai.A1w()));
        list.addAll(A1E);
        ArrayList A1E2 = AbstractC166987dD.A1E();
        C31335Dq0.A03(A1E2, 2131963180);
        A1E2.add(new C35246Fgf(context.getString(2131963179)));
        ArrayList A1E3 = AbstractC166987dD.A1E();
        String str = "left_side";
        C35124FeR.A00("left_side", context.getString(2131963181), A1E3);
        C35124FeR.A00("right_side", context.getString(2131963182), A1E3);
        if (c23031Ai.A1z()) {
            str = "right_side";
        }
        A1E2.add(new C34960Fak(new LRJ(0, c48605Leh, A1E3), str, A1E3));
        list.addAll(A1E2);
        UserSession userSession = c48605Leh.A03;
        if (C18U.A06(C06090Tz.A05, userSession, 36318844750404142L) || new Object().A01(userSession, false)) {
            list.add(c35119FeM);
            ArrayList A1E4 = AbstractC166987dD.A1E();
            C46067KaO c46067KaO = new C46067KaO(c48605Leh, context.getColor(AbstractC53242c7.A06(c48605Leh.A01)));
            String A0p = AbstractC166997dE.A0p(context, 2131954594);
            String string = context.getString(2131954595);
            int i = 2131954592;
            if (new C60352pJ(userSession).A00()) {
                i = 2131954593;
            }
            SpannableStringBuilder A07 = AbstractC31178DnM.A07(context, A0p, i);
            AnonymousClass773.A05(A07, c46067KaO, A0p);
            C36731GHa c36731GHa = new C36731GHa(new LRE(c48605Leh, 5), string, A07, c23031Ai.A1n());
            c36731GHa.A0C = true;
            C31335Dq0.A03(A1E4, 2131963116);
            A1E4.add(c36731GHa);
            list.addAll(A1E4);
        }
        if (c48605Leh.A07) {
            list.add(c35119FeM);
            ArrayList A1E5 = AbstractC166987dD.A1E();
            C31335Dq0.A03(A1E5, 2131965688);
            if (C180257zF.A00.A02(context, userSession, c23031Ai)) {
                ghy = new C35246Fgf(context.getString(2131965686));
            } else {
                ghy = new GHY(context, new ViewOnClickListenerC48063LPo(c48605Leh, 18), 2131965687);
            }
            A1E5.add(ghy);
            list.addAll(A1E5);
        }
    }

    @Override // X.MRI
    public final List BST() {
        return this.A06;
    }

    @Override // X.MRI
    public final void EcQ(MOU mou) {
        this.A00 = mou;
    }

    @Override // X.MRI
    public final String getModuleName() {
        return "camera_settings";
    }

    public C48605Leh(Activity activity, Context context, UserSession userSession) {
        boolean A1a = AbstractC31175DnJ.A1a(userSession);
        this.A01 = activity;
        this.A02 = context;
        this.A03 = userSession;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        this.A05 = A00;
        this.A06 = AbstractC166987dD.A1E();
        C22988ABn c22988ABn = new C22988ABn(activity);
        this.A04 = c22988ABn;
        this.A07 = AbstractC172747mk.A00(context, userSession).A00();
        A00(this);
        if (!AbstractC31172DnG.A1a(A00.A01, "story_camera_lockscreen_shortcut_displayed")) {
            c22988ABn.A00(A1a);
        }
    }

    @Override // X.MRI
    public final int C8w() {
        return 2131954597;
    }

    @Override // X.MRI
    public final void onResume() {
        A00(this);
        MOU mou = this.A00;
        if (mou != null) {
            mou.DSp();
        }
    }
}
