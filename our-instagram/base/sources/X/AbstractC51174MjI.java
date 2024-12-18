package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.MjI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC51174MjI extends C2UU implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "ClipsDraftsSeeAllAdapter";
    public int A00;
    public long A01;
    public C31349DqE A02;
    public final Activity A03;
    public final Context A04;
    public final Fragment A05;
    public final C8SI A06;
    public final UserSession A07;
    public final C218169ko A08;
    public final N5T A09;
    public final O6O A0A;
    public final List A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC09390do A0E;
    public final boolean A0F;

    public static final void A00(C9J0 c9j0, JXC jxc, AbstractC51174MjI abstractC51174MjI) {
        boolean z;
        if (jxc == null) {
            A0J.A00(abstractC51174MjI.A04, abstractC51174MjI.A07, C05F.A0j).A02(abstractC51174MjI.A09.getViewLifecycleOwner(), c9j0.A09, new C30170DRa(20, abstractC51174MjI, c9j0));
            return;
        }
        List list = jxc.A00;
        if (list.isEmpty()) {
            N5T n5t = abstractC51174MjI.A09;
            C14360o3.A0B(c9j0, 0);
            Bundle bundle = n5t.mArguments;
            if (bundle != null && bundle.getBoolean("ClipsConstants.CLIPS_DRAFTS_IS_OPEN_FROM_CAMERA_GALLERY", false)) {
                z = AbstractC31178DnM.A1a(n5t.A0J);
            } else {
                z = false;
            }
            if (n5t.getActivity() == null || n5t.mView == null) {
                return;
            }
            ((C75E) n5t.A0E.getValue()).A06.A0L();
            InterfaceC09390do interfaceC09390do = n5t.A0I;
            if (!C18U.A06(C06090Tz.A05, AbstractC166987dD.A0r(interfaceC09390do), 36325557784294569L)) {
                N5T.A01(n5t);
            }
            C22C A01 = AnonymousClass229.A01(AbstractC166987dD.A0r(interfaceC09390do));
            EnumC50631MWs enumC50631MWs = EnumC50631MWs.A0K;
            AnonymousClass249 anonymousClass249 = AnonymousClass249.VIDEO;
            C5JK c5jk = c9j0.A04;
            C5JK c5jk2 = C5JK.A06;
            EnumC114925Hg enumC114925Hg = EnumC114925Hg.CLIPS;
            if (n5t.A03) {
                A01.A0A.A0a(enumC114925Hg, anonymousClass249, enumC50631MWs, null, null, AbstractC167007dF.A1X(c5jk, c5jk2), false);
            }
            AbstractC226999zv.A00(AbstractC166987dD.A0r(interfaceC09390do)).A01(EnumC222779sI.A04);
            Bundle bundle2 = n5t.mArguments;
            if (bundle2 != null && bundle2.getBoolean("args_skip_to_post_capture")) {
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                C14360o3.A0B(A0r, 0);
                if (A0r.A00(C8ZN.class) == null) {
                    UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                    Object obj = new Object();
                    C14360o3.A0B(A0r2, 0);
                    A0r2.A04(C8ZN.class, obj);
                }
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(n5t.A0D);
                OVo oVo = new OVo(n5t.requireActivity(), AbstractC018607g.A00(n5t.requireActivity()), AbstractC166987dD.A0r(interfaceC09390do));
                DS9 ds9 = new DS9(21, n5t, z);
                AbstractC166987dD.A1Z(new MCP(oVo, ds9, A0Z, c9j0, null, 48), AbstractC141776au.A00(A0Z));
                return;
            }
            C77453dV.A04(n5t.requireActivity(), n5t, AbstractC166987dD.A0r(interfaceC09390do), n5t.A01, c9j0.A09, "draft_list_item_tap", true, false);
            return;
        }
        C183348Bh A00 = AbstractC183338Bg.A00(abstractC51174MjI.A07);
        A00.A0K.A09(A00.A01, AbstractC43591JPw.A00(221), jxc.toString());
        boolean z2 = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C45127Jxw) it.next()).A00 == C05F.A0Y) {
                    break;
                }
            }
        }
        z2 = false;
        DialogInterfaceOnClickListenerC55321Ogj A002 = DialogInterfaceOnClickListenerC55321Ogj.A00(c9j0, abstractC51174MjI, 61);
        C41451vu c41451vu = C41451vu.A01;
        int i = 2131961163;
        if (z2) {
            i = 2131961164;
        }
        c41451vu.E4s(new C3KG(new OEQ(new OAI(A002, EnumC193348hE.A04, 2131961161), null, null, AbstractC166997dE.A0b(), null, 2131954784, i)));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public /* synthetic */ AbstractC51174MjI(Activity activity, Context context, Fragment fragment, UserSession userSession, N5T n5t, int i, int i2, boolean z) {
        O6O o6o = new O6O(userSession);
        this.A07 = userSession;
        this.A05 = fragment;
        this.A03 = activity;
        this.A04 = context;
        this.A09 = n5t;
        this.A0F = z;
        this.A0A = o6o;
        this.A0B = AbstractC166987dD.A1E();
        this.A06 = new C8SI();
        this.A08 = new C218169ko(AbstractC166987dD.A0O(activity), userSession, i, i2);
        this.A0E = C57537PgB.A00(this, 28);
        this.A0C = C57537PgB.A00(this, 26);
        this.A0D = C57537PgB.A00(this, 27);
        this.A01 = -1L;
        setHasStableIds(true);
    }

    public static final void A01(C128175qm c128175qm, C47Z c47z, AbstractC51174MjI abstractC51174MjI) {
        ((OIO) abstractC51174MjI.A0E.getValue()).A00(null, new C57537PgB(abstractC51174MjI, 29), new C30184DRp(44, c47z, c128175qm, abstractC51174MjI), abstractC51174MjI.A0F);
    }

    public static final void A02(AbstractC51356MmH abstractC51356MmH, AbstractC51174MjI abstractC51174MjI) {
        TextView textView;
        Context context;
        int A09;
        JXC jxc = abstractC51356MmH.A02;
        boolean z = false;
        if (jxc == null || jxc.A00.isEmpty()) {
            z = true;
        }
        ImageView imageView = abstractC51356MmH.A04;
        if (z) {
            imageView.setVisibility(8);
            abstractC51356MmH.A03.setImageAlpha(255);
            textView = abstractC51356MmH.A07;
            context = abstractC51174MjI.A04;
            A09 = R.color.capture_textview_text_color;
        } else {
            imageView.setVisibility(0);
            abstractC51356MmH.A03.setImageAlpha(178);
            textView = abstractC51356MmH.A07;
            context = abstractC51174MjI.A04;
            A09 = AbstractC53242c7.A09(context);
        }
        AbstractC166987dD.A1O(context, textView, A09);
    }

    @Override // X.C2UU
    public int getItemCount() {
        int A03 = C0f9.A03(1956811432);
        int size = this.A0B.size();
        C0f9.A0A(245140325, A03);
        return size;
    }

    @Override // X.C2UU, android.widget.Adapter
    public long getItemId(int i) {
        int A03 = C0f9.A03(1034515672);
        long A00 = this.A06.A00(((C9J0) this.A0B.get(i)).A09);
        C0f9.A0A(1962209947, A03);
        return A00;
    }
}
