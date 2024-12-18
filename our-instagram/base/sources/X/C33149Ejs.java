package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.facebook.R;
import com.google.common.collect.ImmutableList;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.io.Serializable;
import java.util.Iterator;
import org.json.JSONArray;

/* renamed from: X.Ejs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33149Ejs extends ELn {
    public static final String __redex_internal_original_name = "PrivateStoryAudiencePickerFragment";
    public EnumC33409Epg A00;
    public C34407FEx A01;
    public C31543DtT A02;
    public C195918ld A04;
    public boolean A05;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);
    public String A03 = "not_eligible";
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC31176DnK.A1C(ViewOnClickListenerC35679FpE.A00(this, 19), AbstractC31179DnN.A0B(interfaceC56362iU, getString(2131956264)), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "audience_selection";
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0025, code lost:
    
        if (r7 == X.EnumC33409Epg.STORY_SHARE_SHORTCUT) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    @Override // X.ELn, X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r12 = 0
            X.C14360o3.A0B(r14, r12)
            super.onViewCreated(r14, r15)
            android.content.Context r8 = r13.requireContext()
            androidx.recyclerview.widget.RecyclerView r1 = X.AbstractC31178DnM.A0D(r14)
            r0 = 2131428247(0x7f0b0397, float:1.8478133E38)
            android.widget.TextView r4 = X.AbstractC167007dF.A0N(r14, r0)
            X.0do r2 = r13.A06
            r2.getValue()
            X.Epg r7 = r13.A00
            X.Epg r0 = X.EnumC33409Epg.STORY_SHARE_SHEET
            r6 = 1
            if (r7 == r0) goto L27
            X.Epg r0 = X.EnumC33409Epg.STORY_SHARE_SHORTCUT
            r5 = 0
            if (r7 != r0) goto L28
        L27:
            r5 = 1
        L28:
            X.Epg r0 = X.EnumC33409Epg.STATUS_SHARE_SHEET
            boolean r3 = X.AbstractC167007dF.A1X(r7, r0)
            X.Epg r0 = X.EnumC33409Epg.REELS_AUDIENCE_CONTROL
            if (r7 == r0) goto L33
            r6 = 0
        L33:
            if (r5 == 0) goto Lba
            r0 = 2131969956(0x7f1347a4, float:1.957685E38)
        L38:
            r4.setText(r0)
        L3b:
            r4.setVisibility(r12)
            r0 = 2131432027(0x7f0b125b, float:1.84858E38)
            android.view.View r3 = X.AbstractC166997dE.A0R(r14, r0)
            com.instagram.igds.components.button.IgdsButton r3 = (com.instagram.igds.components.button.IgdsButton) r3
            r0 = 2131961124(0x7f132524, float:1.9558936E38)
            r3.setText(r0)
            r0 = 1
            r3.setEnabled(r0)
            r0 = 20
            X.ViewOnClickListenerC35679FpE.A01(r3, r0, r13)
            r3.setVisibility(r12)
            r0 = 2131956264(0x7f131228, float:1.9549079E38)
            java.lang.String r9 = X.AbstractC166997dE.A0p(r8, r0)
            r0 = 2131969957(0x7f1347a5, float:1.9576852E38)
            java.lang.String r10 = X.AbstractC166997dE.A0p(r8, r0)
            X.DtT r0 = r13.A02
            java.lang.String r5 = "suggestedUsersPaginationHelper"
            r3 = 0
            if (r0 == 0) goto Le7
            r1.A14(r0)
            X.EQ8 r0 = r13.A0A()
            r11 = 2131238904(0x7f081ff8, float:1.80941E38)
            X.FNh r7 = new X.FNh
            r7.<init>(r8, r9, r10, r11, r12)
            r0.A00 = r7
            X.GFg r1 = r13.A0B()
            X.0cb r0 = X.C17060sy.A01
            com.instagram.user.model.User r0 = X.AbstractC31176DnK.A0g(r0, r2)
            X.ELn.A02(r1, r0)
            X.8ld r1 = r13.A04
            java.lang.String r4 = "storyShareToFBController"
            if (r1 == 0) goto Leb
            boolean r0 = r13.A05
            r1.A04(r0)
            X.EQ8 r1 = r13.A0A()
            X.8ld r0 = r13.A04
            if (r0 == 0) goto Leb
            r1.A01 = r0
            X.EQ8 r1 = r13.A0A()
            X.DtT r0 = r13.A02
            if (r0 == 0) goto Le7
            r1.A02 = r0
            r13.A0E()
            com.instagram.common.session.UserSession r2 = X.AbstractC166987dD.A0r(r2)
            java.lang.String r1 = "close_friend_member_list_impression"
            java.lang.String r0 = "cf_members_list"
            X.OQA.A01(r2, r1, r0, r3)
            return
        Lba:
            if (r3 == 0) goto Lc1
            r0 = 2131974396(0x7f1358fc, float:1.9585855E38)
            goto L38
        Lc1:
            if (r6 == 0) goto Ld7
            r0 = 2131953259(0x7f13066b, float:1.9542984E38)
            android.text.SpannableStringBuilder r0 = r13.A03(r0)
            X.AbstractC31176DnK.A1G(r4, r0)
            r4.setHighlightColor(r12)
            r0 = 21
        Ld2:
            X.ViewOnClickListenerC35679FpE.A01(r4, r0, r13)
            goto L3b
        Ld7:
            r0 = 2131956267(0x7f13122b, float:1.9549085E38)
            android.text.SpannableStringBuilder r0 = r13.A03(r0)
            X.AbstractC31176DnK.A1G(r4, r0)
            r4.setHighlightColor(r12)
            r0 = 22
            goto Ld2
        Le7:
            X.C14360o3.A0F(r5)
            goto Lee
        Leb:
            X.C14360o3.A0F(r4)
        Lee:
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33149Ejs.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A04(C33149Ejs c33149Ejs) {
        InterfaceC09390do interfaceC09390do = c33149Ejs.A06;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        C35167FfI c35167FfI = ((ELn) c33149Ejs).A03;
        java.util.Set set = c35167FfI.A03;
        int size = set.size();
        C14360o3.A0B(A0r, 0);
        AbstractC166997dE.A0Y(A0r).A03.EQG(Integer.valueOf(size));
        C35132FeZ.A01(AbstractC166987dD.A0r(interfaceC09390do));
        FLF flf = c35167FfI.A01;
        if (c33149Ejs.A01 == null) {
            C14360o3.A0F("waterfall");
            throw C00O.createAndThrow();
        }
        flf.A02.size();
        flf.A00.size();
        flf.A01.size();
        Intent A04 = AbstractC31171DnF.A04();
        A04.putExtra(MSV.A00(C8S8.DEFAULT_SWIPE_ANIMATION_DURATION), set.size());
        C1ON A00 = C34974Faz.A00(AbstractC166987dD.A0r(interfaceC09390do));
        A00.A00 = new C67936V3b(0);
        c33149Ejs.schedule(A00);
        AbstractC31176DnK.A18(A04, c33149Ejs);
        AbstractC25227BEk.A1B(c33149Ejs);
    }

    @Override // X.GYQ
    public final void Cuc(C31335Dq0 c31335Dq0) {
        C34407FEx c34407FEx = this.A01;
        String str = "waterfall";
        if (c34407FEx != null) {
            EnumC33409Epg enumC33409Epg = c34407FEx.A00;
            if (enumC33409Epg != null) {
                AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A06);
                String str2 = enumC33409Epg.A00;
                C14360o3.A07(str2);
                C35167FfI c35167FfI = super.A03;
                ImmutableList A0L = AbstractC31173DnH.A0L(c35167FfI.A03);
                C14360o3.A0B(A0o, 0);
                JSONArray A0p = AbstractC31171DnF.A0p();
                Iterator<E> it = A0L.iterator();
                while (it.hasNext()) {
                    A0p.put(((C32069E6v) it.next()).A02.getId());
                }
                C25621Ms A0c = AbstractC167017dG.A0c(A0o);
                A0c.A0B("stories/private_stories/bulk_update_members/");
                A0c.A9s("added_user_ids", null);
                A0c.A9s("removed_user_ids", A0p.toString());
                A0c.A9s("module", "audience_selection");
                A0c.A9s(CacheBehaviorLogger.SOURCE, str2);
                C1GJ.A03(AbstractC31172DnG.A0R(null, A0c, C40781ul.class, C55702hA.class, false));
                c35167FfI.A04();
                C195918ld c195918ld = this.A04;
                if (c195918ld == null) {
                    str = "storyShareToFBController";
                } else {
                    c195918ld.A04(false);
                    C35167FfI.A00(this, c35167FfI);
                    C35167FfI.A01(this, c35167FfI);
                    if (this.A01 != null) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    private final SpannableStringBuilder A03(int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String A0v = AbstractC25227BEk.A0v(this, 2131963664);
        AnonymousClass773.A05(spannableStringBuilder, new AnonymousClass772(Integer.valueOf(AbstractC167007dF.A09(ELn.A00(spannableStringBuilder, this, A0v, i), R.attr.textColorBoldLink))), A0v);
        return spannableStringBuilder;
    }

    @Override // X.ELn
    public final void A0D(IgdsCheckBox igdsCheckBox, C32069E6v c32069E6v) {
        Integer num;
        AbstractC167017dG.A1N(c32069E6v, igdsCheckBox);
        C34407FEx c34407FEx = this.A01;
        if (c34407FEx == null) {
            C14360o3.A0F("waterfall");
            throw C00O.createAndThrow();
        }
        EnumC33409Epg enumC33409Epg = c34407FEx.A00;
        if (enumC33409Epg != null) {
            boolean z = !igdsCheckBox.isChecked();
            igdsCheckBox.setChecked(z);
            boolean z2 = A0B().A01;
            C35167FfI c35167FfI = super.A03;
            if (z2) {
                num = C05F.A00;
            } else {
                num = C05F.A01;
            }
            c35167FfI.A05(c32069E6v, num, z, z2);
            A0A().A04(AbstractC31173DnH.A0L(c35167FfI.A03), AbstractC31173DnH.A0L(c35167FfI.A00));
            C35167FfI.A01(this, c35167FfI);
            UserSession A0r = AbstractC166987dD.A0r(this.A06);
            String str = enumC33409Epg.A00;
            C14360o3.A07(str);
            FTd.A01(A0r, "audience_selection", str, c32069E6v.A02.getId(), z);
        }
    }

    public final void A0E() {
        A0A().A03(requireContext(), null, EnumC153216up.A06);
        C31543DtT c31543DtT = this.A02;
        if (c31543DtT == null) {
            C14360o3.A0F("suggestedUsersPaginationHelper");
            throw C00O.createAndThrow();
        }
        c31543DtT.A02 = true;
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        InterfaceC09390do interfaceC09390do = this.A06;
        C32548EUy.A00(requireContext, A00, FTd.A00(AbstractC166987dD.A0r(interfaceC09390do), 40, null, false, C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(interfaceC09390do), 36322070270846960L)), this, 41);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A04(this);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.FEx] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        EnumC33409Epg enumC33409Epg;
        int A02 = C0f9.A02(460586478);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = new Object();
        Serializable serializable = requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (serializable instanceof EnumC33409Epg) {
            enumC33409Epg = (EnumC33409Epg) serializable;
        } else {
            enumC33409Epg = null;
        }
        this.A00 = enumC33409Epg;
        C34407FEx c34407FEx = this.A01;
        if (c34407FEx == null) {
            C14360o3.A0F("waterfall");
            throw C00O.createAndThrow();
        }
        if (enumC33409Epg == null) {
            enumC33409Epg = EnumC33409Epg.UNKNOWN;
        }
        c34407FEx.A00 = enumC33409Epg;
        this.A03 = requireArguments.getString(AbstractC111324zv.A00(258), "not_eligible");
        this.A05 = requireArguments.getBoolean("private_story_share_to_fb", false);
        this.A04 = OQ9.A01(AbstractC166987dD.A0r(this.A06), new C36709GGe());
        int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        this.A02 = new C31543DtT(this, AbstractC166987dD.A0r(this.A07), new C36772GIv(this, 1));
        C0f9.A09(1287198291, A02);
    }
}
