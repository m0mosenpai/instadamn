package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import java.util.List;

/* loaded from: classes8.dex */
public final class LGE {
    public InterfaceC11380iw A00;
    public InterfaceC41501vz A01;
    public C57012jc A02;
    public C46512KiB A03;
    public View A04;
    public C44567Jnr A05;
    public final C25671My A06;
    public final UserSession A07;
    public final InterfaceC50472MQa A08;
    public final JUI A09;
    public final RecyclerView A0A;

    public static void A00(LGE lge) {
        ViewOnClickListenerC48072LPx A00;
        int i;
        int i2;
        int i3;
        IgdsEmptyState igdsEmptyState;
        View view = lge.A04;
        view.setVisibility(8);
        C57012jc c57012jc = lge.A02;
        c57012jc.A03(8);
        RecyclerView recyclerView = lge.A0A;
        recyclerView.setVisibility(8);
        JUI jui = lge.A09;
        if (!jui.A02) {
            boolean z = jui.A03;
            UserSession userSession = lge.A07;
            InterfaceC11380iw interfaceC11380iw = lge.A00;
            C46512KiB c46512KiB = lge.A03;
            String str = c46512KiB.A01;
            String str2 = c46512KiB.A02;
            if (!z) {
                AbstractC167017dG.A1R(str, str2);
                AbstractC31173DnH.A1S(C162337Ov.A01(interfaceC11380iw, "list_impression_loading", str, str2), userSession);
                view.setVisibility(0);
                return;
            }
            AbstractC167017dG.A1R(str, str2);
            AbstractC31173DnH.A1S(C162337Ov.A01(interfaceC11380iw, "list_impression_retry", str, str2), userSession);
            A00 = ViewOnClickListenerC48072LPx.A00(lge, 21);
            i = 2131960394;
            i2 = 2131960393;
            i3 = 2131960220;
            c57012jc.A03(0);
            igdsEmptyState = (IgdsEmptyState) c57012jc.A01();
            igdsEmptyState.EW2(0, false);
        } else {
            view.setVisibility(8);
            List A04 = jui.A04();
            C44567Jnr c44567Jnr = lge.A05;
            AbstractC31175DnJ.A0x(c44567Jnr, A04, c44567Jnr.A03);
            if (c44567Jnr.getItemCount() > 1) {
                recyclerView.setVisibility(0);
                return;
            }
            A00 = ViewOnClickListenerC48072LPx.A00(lge, 22);
            i = 2131960222;
            i2 = 2131960221;
            i3 = 2131960395;
            c57012jc.A03(0);
            igdsEmptyState = (IgdsEmptyState) c57012jc.A01();
            igdsEmptyState.EW2(R.drawable.instagram_reply_outline_96, true);
        }
        igdsEmptyState.setHeadline(i);
        igdsEmptyState.setBody(i2);
        igdsEmptyState.EPC(A00, i3);
    }

    public final void A01() {
        JUI jui = this.A09;
        if (jui.A02) {
            UserSession userSession = this.A07;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            C46512KiB c46512KiB = this.A03;
            String str = c46512KiB.A01;
            String str2 = c46512KiB.A02;
            String str3 = c46512KiB.A00;
            int size = jui.A04().size();
            AbstractC167017dG.A1R(str, str2);
            C19280xC A01 = C162337Ov.A01(interfaceC11380iw, "list_impression", str, str2);
            A01.A08(Integer.valueOf(size), "count");
            if (str3 != null) {
                A01.A0C(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str3);
            }
            AbstractC31173DnH.A1S(A01, userSession);
        }
    }

    public LGE(View view, RecyclerView recyclerView, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C57012jc c57012jc, C46512KiB c46512KiB, InterfaceC50472MQa interfaceC50472MQa, JUI jui) {
        this.A07 = userSession;
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        this.A06 = A00;
        this.A08 = interfaceC50472MQa;
        this.A0A = recyclerView;
        this.A09 = jui;
        this.A02 = c57012jc;
        this.A04 = view;
        Context context = recyclerView.getContext();
        recyclerView.A0S = true;
        AbstractC31174DnI.A15(context, recyclerView);
        C44567Jnr c44567Jnr = new C44567Jnr(context, userSession, interfaceC50472MQa);
        this.A05 = c44567Jnr;
        recyclerView.setAdapter(c44567Jnr);
        this.A00 = interfaceC11380iw;
        this.A03 = c46512KiB;
        recyclerView.A10(new JoL(AbstractC167007dF.A09(context, R.attr.igds_color_elevated_separator), AbstractC31171DnF.A02(recyclerView.getResources(), R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)));
        C44288Jhe c44288Jhe = new C44288Jhe(this, 5);
        this.A01 = c44288Jhe;
        A00.A01(c44288Jhe, C44192Jfv.class);
        A00(this);
    }
}
